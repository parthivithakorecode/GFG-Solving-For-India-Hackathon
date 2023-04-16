package p030d5;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.C3377e0;
import kotlinx.coroutines.internal.C3402m0;
import kotlinx.coroutines.internal.C3408r;
import kotlinx.coroutines.internal.C3420y;
import p016b5.C1376m;
import p016b5.C1384o0;
import p079k4.C3330q;
import p145u4.C4150l;

/* renamed from: d5.m */
public class C2524m<E> extends C2502a<E> {

    /* renamed from: e */
    private final ReentrantLock f18638e = new ReentrantLock();

    /* renamed from: f */
    private Object f18639f = C2507b.f18611a;

    public C2524m(C4150l<? super E, C3330q> lVar) {
        super(lVar);
    }

    /* renamed from: x */
    private final C3402m0 m21127x(Object obj) {
        C4150l<E, C3330q> lVar;
        Object obj2 = this.f18639f;
        C3402m0 m0Var = null;
        if (!(obj2 == C2507b.f18611a || (lVar = this.f18618b) == null)) {
            m0Var = C3420y.m24708d(lVar, obj2, (C3402m0) null, 2, (Object) null);
        }
        this.f18639f = obj;
        return m0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo12423c() {
        return "(value=" + this.f18639f + ')';
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Object mo12426i(E e) {
        C2528q l;
        C3377e0 f;
        ReentrantLock reentrantLock = this.f18638e;
        reentrantLock.lock();
        try {
            C2521j<?> d = mo12424d();
            if (d == null) {
                if (this.f18639f == C2507b.f18611a) {
                    do {
                        l = mo12405l();
                        if (l != null) {
                            if (l instanceof C2521j) {
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
                    C3330q qVar = C3330q.f20829a;
                    reentrantLock.unlock();
                    l.mo12417a(e);
                    return l.mo12445c();
                }
                C3402m0 x = m21127x(e);
                if (x == null) {
                    C3377e0 e0Var = C2507b.f18612b;
                    reentrantLock.unlock();
                    return e0Var;
                }
                throw x;
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
        ReentrantLock reentrantLock = this.f18638e;
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
        return this.f18639f == C2507b.f18611a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Object mo12411v() {
        ReentrantLock reentrantLock = this.f18638e;
        reentrantLock.lock();
        try {
            Object obj = this.f18639f;
            C3377e0 e0Var = C2507b.f18611a;
            if (obj == e0Var) {
                Object d = mo12424d();
                if (d == null) {
                    d = C2507b.f18614d;
                }
                return d;
            }
            this.f18639f = e0Var;
            C3330q qVar = C3330q.f20829a;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
