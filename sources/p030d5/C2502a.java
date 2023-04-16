package p030d5;

import kotlin.coroutines.jvm.internal.C3336b;
import kotlin.coroutines.jvm.internal.C3342h;
import kotlin.jvm.internal.C3357i;
import kotlinx.coroutines.internal.C3375d0;
import kotlinx.coroutines.internal.C3377e0;
import kotlinx.coroutines.internal.C3406p;
import kotlinx.coroutines.internal.C3407q;
import kotlinx.coroutines.internal.C3408r;
import kotlinx.coroutines.internal.C3420y;
import p016b5.C1337e;
import p016b5.C1366k;
import p016b5.C1371l;
import p016b5.C1376m;
import p016b5.C1380n;
import p016b5.C1384o0;
import p016b5.C1387p0;
import p079k4.C3322k;
import p079k4.C3325l;
import p079k4.C3330q;
import p100n4.C3773d;
import p145u4.C4150l;

/* renamed from: d5.a */
public abstract class C2502a<E> extends C2508c<E> implements C2513f<E> {

    /* renamed from: d5.a$a */
    private static final class C2503a<E> implements C2515g<E> {

        /* renamed from: a */
        public final C2502a<E> f18603a;

        /* renamed from: b */
        private Object f18604b = C2507b.f18614d;

        public C2503a(C2502a<E> aVar) {
            this.f18603a = aVar;
        }

        /* renamed from: c */
        private final boolean m21070c(Object obj) {
            if (!(obj instanceof C2521j)) {
                return true;
            }
            C2521j jVar = (C2521j) obj;
            if (jVar.f18637i == null) {
                return false;
            }
            throw C3375d0.m24568k(jVar.mo12443E());
        }

        /* renamed from: d */
        private final Object m21071d(C3773d<? super Boolean> dVar) {
            Object obj;
            C1371l a = C1380n.m5422a(C3855c.m25870b(dVar));
            C2504b bVar = new C2504b(this, a);
            while (true) {
                if (this.f18603a.m21061p(bVar)) {
                    this.f18603a.m21062w(a, bVar);
                    break;
                }
                Object v = this.f18603a.mo12411v();
                mo12414e(v);
                if (v instanceof C2521j) {
                    C2521j jVar = (C2521j) v;
                    if (jVar.f18637i == null) {
                        C3322k.C3323a aVar = C3322k.f20823f;
                        obj = C3336b.m24481a(false);
                    } else {
                        C3322k.C3323a aVar2 = C3322k.f20823f;
                        obj = C3325l.m24450a(jVar.mo12443E());
                    }
                    a.resumeWith(C3322k.m24446a(obj));
                } else if (v != C2507b.f18614d) {
                    Boolean a2 = C3336b.m24481a(true);
                    C4150l<E, C3330q> lVar = this.f18603a.f18618b;
                    a.mo4729a(a2, lVar == null ? null : C3420y.m24705a(lVar, v, a.getContext()));
                }
            }
            Object w = a.mo4755w();
            if (w == C3858d.m25871c()) {
                C3342h.m24493c(dVar);
            }
            return w;
        }

        /* renamed from: a */
        public Object mo12412a(C3773d<? super Boolean> dVar) {
            Object b = mo12413b();
            C3377e0 e0Var = C2507b.f18614d;
            if (b == e0Var) {
                mo12414e(this.f18603a.mo12411v());
                if (mo12413b() == e0Var) {
                    return m21071d(dVar);
                }
            }
            return C3336b.m24481a(m21070c(mo12413b()));
        }

        /* renamed from: b */
        public final Object mo12413b() {
            return this.f18604b;
        }

        /* renamed from: e */
        public final void mo12414e(Object obj) {
            this.f18604b = obj;
        }

        public E next() {
            E e = this.f18604b;
            if (!(e instanceof C2521j)) {
                E e2 = C2507b.f18614d;
                if (e != e2) {
                    this.f18604b = e2;
                    return e;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            throw C3375d0.m24568k(((C2521j) e).mo12443E());
        }
    }

    /* renamed from: d5.a$b */
    private static class C2504b<E> extends C2526o<E> {

        /* renamed from: i */
        public final C2503a<E> f18605i;

        /* renamed from: j */
        public final C1366k<Boolean> f18606j;

        public C2504b(C2503a<E> aVar, C1366k<? super Boolean> kVar) {
            this.f18605i = aVar;
            this.f18606j = kVar;
        }

        /* renamed from: A */
        public C4150l<Throwable, C3330q> mo12416A(E e) {
            C4150l<E, C3330q> lVar = this.f18605i.f18603a.f18618b;
            if (lVar == null) {
                return null;
            }
            return C3420y.m24705a(lVar, e, this.f18606j.getContext());
        }

        /* renamed from: a */
        public void mo12417a(E e) {
            this.f18605i.mo12414e(e);
            this.f18606j.mo4734i(C1376m.f3573a);
        }

        /* renamed from: f */
        public C3377e0 mo12418f(E e, C3408r.C3410b bVar) {
            Object f = this.f18606j.mo4732f(Boolean.TRUE, (Object) null, mo12416A(e));
            if (f == null) {
                return null;
            }
            if (C1384o0.m5425a()) {
                if (!(f == C1376m.f3573a)) {
                    throw new AssertionError();
                }
            }
            return C1376m.f3573a;
        }

        public String toString() {
            return C3357i.m24513j("ReceiveHasNext@", C1387p0.m5432b(this));
        }

        /* renamed from: z */
        public void mo12419z(C2521j<?> jVar) {
            Object a = jVar.f18637i == null ? C1366k.C1367a.m5372a(this.f18606j, Boolean.FALSE, (Object) null, 2, (Object) null) : this.f18606j.mo4733g(jVar.mo12443E());
            if (a != null) {
                this.f18605i.mo12414e(jVar);
                this.f18606j.mo4734i(a);
            }
        }
    }

    /* renamed from: d5.a$c */
    private final class C2505c extends C1337e {

        /* renamed from: f */
        private final C2526o<?> f18607f;

        public C2505c(C2526o<?> oVar) {
            this.f18607f = oVar;
        }

        /* renamed from: a */
        public void mo4722a(Throwable th) {
            if (this.f18607f.mo14449u()) {
                C2502a.this.mo12409t();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo4722a((Throwable) obj);
            return C3330q.f20829a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f18607f + ']';
        }
    }

    /* renamed from: d5.a$d */
    public static final class C2506d extends C3408r.C3409a {

        /* renamed from: d */
        final /* synthetic */ C3408r f18609d;

        /* renamed from: e */
        final /* synthetic */ C2502a f18610e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2506d(C3408r rVar, C2502a aVar) {
            super(rVar);
            this.f18609d = rVar;
            this.f18610e = aVar;
        }

        /* renamed from: i */
        public Object mo4822g(C3408r rVar) {
            if (this.f18610e.mo12408s()) {
                return null;
            }
            return C3407q.m24655a();
        }
    }

    public C2502a(C4150l<? super E, C3330q> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final boolean m21061p(C2526o<? super E> oVar) {
        boolean q = mo12406q(oVar);
        if (q) {
            mo12410u();
        }
        return q;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final void m21062w(C1366k<?> kVar, C2526o<?> oVar) {
        kVar.mo4731c(new C2505c(oVar));
    }

    public final C2515g<E> iterator() {
        return new C2503a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C2528q<E> mo12405l() {
        C2528q<E> l = super.mo12405l();
        if (l != null && !(l instanceof C2521j)) {
            mo12409t();
        }
        return l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo12406q(C2526o<? super E> oVar) {
        int x;
        C3408r q;
        if (mo12407r()) {
            C3406p e = mo12425e();
            do {
                q = e.mo14446q();
                if (!(!(q instanceof C2530s))) {
                    return false;
                }
            } while (!q.mo14442j(oVar, e));
        } else {
            C3406p e2 = mo12425e();
            C2506d dVar = new C2506d(oVar, this);
            do {
                C3408r q2 = e2.mo14446q();
                if (!(!(q2 instanceof C2530s))) {
                    return false;
                }
                x = q2.mo14451x(oVar, e2, dVar);
                if (x != 1) {
                }
            } while (x != 2);
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract boolean mo12407r();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract boolean mo12408s();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo12409t() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo12410u() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Object mo12411v() {
        while (true) {
            C2530s m = mo12429m();
            if (m == null) {
                return C2507b.f18614d;
            }
            C3377e0 A = m.mo12431A((C3408r.C3410b) null);
            if (A != null) {
                if (C1384o0.m5425a()) {
                    if (!(A == C1376m.f3573a)) {
                        throw new AssertionError();
                    }
                }
                m.mo12432y();
                return m.mo12433z();
            }
            m.mo12447B();
        }
    }
}
