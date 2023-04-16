package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlin.jvm.internal.C3357i;
import kotlinx.coroutines.internal.C3398k0;
import p016b5.C1384o0;

/* renamed from: kotlinx.coroutines.internal.j0 */
public class C3396j0<T extends C3398k0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    private T[] f20888a;

    /* renamed from: f */
    private final T[] m24620f() {
        T[] tArr = this.f20888a;
        if (tArr == null) {
            T[] tArr2 = new C3398k0[4];
            this.f20888a = tArr2;
            return tArr2;
        } else if (mo14430c() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, mo14430c() * 2);
            C3357i.m24507d(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (C3398k0[]) copyOf;
            this.f20888a = tArr3;
            return tArr3;
        }
    }

    /* renamed from: j */
    private final void m24621j(int i) {
        this._size = i;
    }

    /* renamed from: k */
    private final void m24622k(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < mo14430c()) {
                T[] tArr = this.f20888a;
                C3357i.m24505b(tArr);
                int i3 = i2 + 1;
                if (i3 < mo14430c()) {
                    T t = tArr[i3];
                    C3357i.m24505b(t);
                    T t2 = tArr[i2];
                    C3357i.m24505b(t2);
                    if (((Comparable) t).compareTo(t2) < 0) {
                        i2 = i3;
                    }
                }
                T t3 = tArr[i];
                C3357i.m24505b(t3);
                T t4 = tArr[i2];
                C3357i.m24505b(t4);
                if (((Comparable) t3).compareTo(t4) > 0) {
                    m24624m(i, i2);
                    i = i2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    private final void m24623l(int i) {
        while (i > 0) {
            T[] tArr = this.f20888a;
            C3357i.m24505b(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            C3357i.m24505b(t);
            T t2 = tArr[i];
            C3357i.m24505b(t2);
            if (((Comparable) t).compareTo(t2) > 0) {
                m24624m(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    private final void m24624m(int i, int i2) {
        T[] tArr = this.f20888a;
        C3357i.m24505b(tArr);
        T t = tArr[i2];
        C3357i.m24505b(t);
        T t2 = tArr[i];
        C3357i.m24505b(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.mo4681d(i);
        t2.mo4681d(i2);
    }

    /* renamed from: a */
    public final void mo14428a(T t) {
        if (C1384o0.m5425a()) {
            if (!(t.mo4684h() == null)) {
                throw new AssertionError();
            }
        }
        t.mo4682e(this);
        C3398k0[] f = m24620f();
        int c = mo14430c();
        m24621j(c + 1);
        f[c] = t;
        t.mo4681d(c);
        m24623l(c);
    }

    /* renamed from: b */
    public final T mo14429b() {
        T[] tArr = this.f20888a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: c */
    public final int mo14430c() {
        return this._size;
    }

    /* renamed from: d */
    public final boolean mo14431d() {
        return mo14430c() == 0;
    }

    /* renamed from: e */
    public final T mo14432e() {
        T b;
        synchronized (this) {
            b = mo14429b();
        }
        return b;
    }

    /* renamed from: g */
    public final boolean mo14433g(T t) {
        boolean z;
        synchronized (this) {
            z = true;
            boolean z2 = false;
            if (t.mo4684h() == null) {
                z = false;
            } else {
                int f = t.mo4683f();
                if (C1384o0.m5425a()) {
                    if (f >= 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new AssertionError();
                    }
                }
                mo14434h(f);
            }
        }
        return z;
    }

    /* renamed from: h */
    public final T mo14434h(int i) {
        boolean z = false;
        if (C1384o0.m5425a()) {
            if (!(mo14430c() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f20888a;
        C3357i.m24505b(tArr);
        m24621j(mo14430c() - 1);
        if (i < mo14430c()) {
            m24624m(i, mo14430c());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                C3357i.m24505b(t);
                T t2 = tArr[i2];
                C3357i.m24505b(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m24624m(i, i2);
                    m24623l(i2);
                }
            }
            m24622k(i);
        }
        T t3 = tArr[mo14430c()];
        C3357i.m24505b(t3);
        if (C1384o0.m5425a()) {
            if (t3.mo4684h() == this) {
                z = true;
            }
            if (!z) {
                throw new AssertionError();
            }
        }
        t3.mo4682e((C3396j0<?>) null);
        t3.mo4681d(-1);
        tArr[mo14430c()] = null;
        return t3;
    }

    /* renamed from: i */
    public final T mo14435i() {
        T h;
        synchronized (this) {
            h = mo14430c() > 0 ? mo14434h(0) : null;
        }
        return h;
    }
}
