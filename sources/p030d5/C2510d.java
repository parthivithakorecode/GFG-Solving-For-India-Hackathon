package p030d5;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C3357i;
import kotlinx.coroutines.internal.C3377e0;
import kotlinx.coroutines.internal.C3408r;
import p016b5.C1376m;
import p016b5.C1384o0;
import p079k4.C3320i;
import p079k4.C3330q;
import p145u4.C4150l;

/* renamed from: d5.d */
public class C2510d<E> extends C2502a<E> {

    /* renamed from: e */
    private final int f18621e;

    /* renamed from: f */
    private final C2512e f18622f;

    /* renamed from: g */
    private final ReentrantLock f18623g;

    /* renamed from: h */
    private Object[] f18624h;

    /* renamed from: i */
    private int f18625i;
    private volatile /* synthetic */ int size;

    /* renamed from: d5.d$a */
    public /* synthetic */ class C2511a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18626a;

        static {
            int[] iArr = new int[C2512e.values().length];
            iArr[C2512e.SUSPEND.ordinal()] = 1;
            iArr[C2512e.DROP_LATEST.ordinal()] = 2;
            iArr[C2512e.DROP_OLDEST.ordinal()] = 3;
            f18626a = iArr;
        }
    }

    public C2510d(int i, C2512e eVar, C4150l<? super E, C3330q> lVar) {
        super(lVar);
        this.f18621e = i;
        this.f18622f = eVar;
        if (i < 1 ? false : true) {
            this.f18623g = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i, 8)];
            C3577d.m24992e(objArr, C2507b.f18611a, 0, 0, 6, (Object) null);
            this.f18624h = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i + " was specified").toString());
    }

    /* renamed from: x */
    private final void m21098x(int i, E e) {
        if (i < this.f18621e) {
            m21099y(i);
            Object[] objArr = this.f18624h;
            objArr[(this.f18625i + i) % objArr.length] = e;
            return;
        }
        if (C1384o0.m5425a()) {
            if (!(this.f18622f == C2512e.DROP_OLDEST)) {
                throw new AssertionError();
            }
        }
        Object[] objArr2 = this.f18624h;
        int i2 = this.f18625i;
        objArr2[i2 % objArr2.length] = null;
        objArr2[(i + i2) % objArr2.length] = e;
        this.f18625i = (i2 + 1) % objArr2.length;
    }

    /* renamed from: y */
    private final void m21099y(int i) {
        Object[] objArr = this.f18624h;
        if (i >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f18621e);
            Object[] objArr2 = new Object[min];
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr3 = this.f18624h;
                objArr2[i2] = objArr3[(this.f18625i + i2) % objArr3.length];
            }
            C3577d.m24991d(objArr2, C2507b.f18611a, i, min);
            this.f18624h = objArr2;
            this.f18625i = 0;
        }
    }

    /* renamed from: z */
    private final C3377e0 m21100z(int i) {
        if (i < this.f18621e) {
            this.size = i + 1;
            return null;
        }
        int i2 = C2511a.f18626a[this.f18622f.ordinal()];
        if (i2 == 1) {
            return C2507b.f18613c;
        }
        if (i2 == 2) {
            return C2507b.f18612b;
        }
        if (i2 == 3) {
            return null;
        }
        throw new C3320i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo12423c() {
        return "(buffer:capacity=" + this.f18621e + ",size=" + this.size + ')';
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Object mo12426i(E e) {
        C2528q l;
        C3377e0 f;
        ReentrantLock reentrantLock = this.f18623g;
        reentrantLock.lock();
        try {
            int i = this.size;
            C2521j<?> d = mo12424d();
            if (d == null) {
                C3377e0 z = m21100z(i);
                if (z == null) {
                    if (i == 0) {
                        do {
                            l = mo12405l();
                            if (l != null) {
                                if (l instanceof C2521j) {
                                    this.size = i;
                                    reentrantLock.unlock();
                                    return l;
                                }
                                f = l.mo12418f(e, (C3408r.C3410b) null);
                            }
                        } while (f == null);
                        if (C1384o0.m5425a()) {
                            if (!(f == C1376m.f3573a)) {
                                throw new AssertionError();
                            }
                        }
                        this.size = i;
                        C3330q qVar = C3330q.f20829a;
                        reentrantLock.unlock();
                        l.mo12417a(e);
                        return l.mo12445c();
                    }
                    m21098x(i, e);
                    C3377e0 e0Var = C2507b.f18612b;
                    reentrantLock.unlock();
                    return e0Var;
                }
                reentrantLock.unlock();
                return z;
            }
            reentrantLock.unlock();
            return d;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo12406q(C2526o<? super E> oVar) {
        ReentrantLock reentrantLock = this.f18623g;
        reentrantLock.lock();
        try {
            return super.mo12406q(oVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo12407r() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final boolean mo12408s() {
        return this.size == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Object mo12411v() {
        ReentrantLock reentrantLock = this.f18623g;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object d = mo12424d();
                if (d == null) {
                    d = C2507b.f18614d;
                }
                return d;
            }
            Object[] objArr = this.f18624h;
            int i2 = this.f18625i;
            Object obj = objArr[i2];
            C2530s sVar = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = C2507b.f18614d;
            boolean z = false;
            if (i == this.f18621e) {
                C2530s sVar2 = null;
                while (true) {
                    C2530s m = mo12429m();
                    if (m == null) {
                        sVar = sVar2;
                        break;
                    }
                    C3377e0 A = m.mo12431A((C3408r.C3410b) null);
                    if (A != null) {
                        if (C1384o0.m5425a()) {
                            if (A == C1376m.f3573a) {
                                z = true;
                            }
                            if (!z) {
                                throw new AssertionError();
                            }
                        }
                        obj2 = m.mo12433z();
                        z = true;
                        sVar = m;
                    } else {
                        m.mo12447B();
                        sVar2 = m;
                    }
                }
            }
            if (obj2 != C2507b.f18614d && !(obj2 instanceof C2521j)) {
                this.size = i;
                Object[] objArr2 = this.f18624h;
                objArr2[(this.f18625i + i) % objArr2.length] = obj2;
            }
            this.f18625i = (this.f18625i + 1) % this.f18624h.length;
            C3330q qVar = C3330q.f20829a;
            reentrantLock.unlock();
            if (z) {
                C3357i.m24505b(sVar);
                sVar.mo12432y();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
