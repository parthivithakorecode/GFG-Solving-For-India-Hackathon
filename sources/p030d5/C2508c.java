package p030d5;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;
import kotlinx.coroutines.internal.C3377e0;
import kotlinx.coroutines.internal.C3401m;
import kotlinx.coroutines.internal.C3406p;
import kotlinx.coroutines.internal.C3408r;
import p016b5.C1376m;
import p016b5.C1384o0;
import p016b5.C1387p0;
import p030d5.C2517i;
import p079k4.C3330q;
import p145u4.C4150l;

/* renamed from: d5.c */
public abstract class C2508c<E> implements C2531t<E> {

    /* renamed from: d */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f18617d = AtomicReferenceFieldUpdater.newUpdater(C2508c.class, Object.class, "onCloseHandler");

    /* renamed from: b */
    protected final C4150l<E, C3330q> f18618b;

    /* renamed from: c */
    private final C3406p f18619c = new C3406p();
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* renamed from: d5.c$a */
    public static final class C2509a<E> extends C2530s {

        /* renamed from: i */
        public final E f18620i;

        public C2509a(E e) {
            this.f18620i = e;
        }

        /* renamed from: A */
        public C3377e0 mo12431A(C3408r.C3410b bVar) {
            return C1376m.f3573a;
        }

        public String toString() {
            return "SendBuffered@" + C1387p0.m5432b(this) + '(' + this.f18620i + ')';
        }

        /* renamed from: y */
        public void mo12432y() {
        }

        /* renamed from: z */
        public Object mo12433z() {
            return this.f18620i;
        }
    }

    public C2508c(C4150l<? super E, C3330q> lVar) {
        this.f18618b = lVar;
    }

    /* renamed from: b */
    private final int m21082b() {
        C3406p pVar = this.f18619c;
        int i = 0;
        for (C3408r rVar = (C3408r) pVar.mo14444o(); !C3357i.m24504a(rVar, pVar); rVar = rVar.mo14445p()) {
            if (rVar instanceof C3408r) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: f */
    private final String m21083f() {
        C3408r p = this.f18619c.mo14445p();
        if (p == this.f18619c) {
            return "EmptyQueue";
        }
        String rVar = p instanceof C2521j ? p.toString() : p instanceof C2526o ? "ReceiveQueued" : p instanceof C2530s ? "SendQueued" : C3357i.m24513j("UNEXPECTED:", p);
        C3408r q = this.f18619c.mo14446q();
        if (q == p) {
            return rVar;
        }
        String str = rVar + ",queueSize=" + m21082b();
        if (!(q instanceof C2521j)) {
            return str;
        }
        return str + ",closedForSend=" + q;
    }

    /* renamed from: g */
    private final void m21084g(C2521j<?> jVar) {
        Object b = C3401m.m24647b((Object) null, 1, (C3353e) null);
        while (true) {
            C3408r q = jVar.mo14446q();
            C2526o oVar = q instanceof C2526o ? (C2526o) q : null;
            if (oVar == null) {
                break;
            } else if (!oVar.mo14449u()) {
                oVar.mo14447r();
            } else {
                b = C3401m.m24648c(b, oVar);
            }
        }
        if (b != null) {
            if (!(b instanceof ArrayList)) {
                ((C2526o) b).mo12419z(jVar);
            } else {
                ArrayList arrayList = (ArrayList) b;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i = size - 1;
                        ((C2526o) arrayList.get(size)).mo12419z(jVar);
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    }
                }
            }
        }
        mo12427j(jVar);
    }

    /* renamed from: h */
    private final Throwable m21085h(C2521j<?> jVar) {
        m21084g(jVar);
        return jVar.mo12444F();
    }

    /* renamed from: a */
    public final Object mo12422a(E e) {
        C2521j<?> jVar;
        C2517i.C2519b bVar;
        Object i = mo12426i(e);
        if (i == C2507b.f18612b) {
            return C2517i.f18634a.mo12440c(C3330q.f20829a);
        }
        if (i == C2507b.f18613c) {
            jVar = mo12424d();
            if (jVar == null) {
                return C2517i.f18634a.mo12439b();
            }
            bVar = C2517i.f18634a;
        } else if (i instanceof C2521j) {
            bVar = C2517i.f18634a;
            jVar = (C2521j) i;
        } else {
            throw new IllegalStateException(C3357i.m24513j("trySend returned ", i).toString());
        }
        return bVar.mo12438a(m21085h(jVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo12423c() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C2521j<?> mo12424d() {
        C3408r q = this.f18619c.mo14446q();
        C2521j<?> jVar = q instanceof C2521j ? (C2521j) q : null;
        if (jVar == null) {
            return null;
        }
        m21084g(jVar);
        return jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C3406p mo12425e() {
        return this.f18619c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Object mo12426i(E e) {
        C2528q l;
        C3377e0 f;
        do {
            l = mo12405l();
            if (l == null) {
                return C2507b.f18613c;
            }
            f = l.mo12418f(e, (C3408r.C3410b) null);
        } while (f == null);
        if (C1384o0.m5425a()) {
            if (!(f == C1376m.f3573a)) {
                throw new AssertionError();
            }
        }
        l.mo12417a(e);
        return l.mo12445c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo12427j(C3408r rVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final C2528q<?> mo12428k(E e) {
        C3408r q;
        C3406p pVar = this.f18619c;
        C2509a aVar = new C2509a(e);
        do {
            q = pVar.mo14446q();
            if (q instanceof C2528q) {
                return (C2528q) q;
            }
        } while (!q.mo14442j(aVar, pVar));
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C2528q<E> mo12405l() {
        C3408r rVar;
        C3408r v;
        C3406p pVar = this.f18619c;
        while (true) {
            rVar = (C3408r) pVar.mo14444o();
            if (rVar != pVar && (rVar instanceof C2528q)) {
                if (((((C2528q) rVar) instanceof C2521j) && !rVar.mo14441t()) || (v = rVar.mo14450v()) == null) {
                    break;
                }
                v.mo14448s();
            }
        }
        rVar = null;
        return (C2528q) rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final C2530s mo12429m() {
        C3408r rVar;
        C3408r v;
        C3406p pVar = this.f18619c;
        while (true) {
            rVar = (C3408r) pVar.mo14444o();
            if (rVar != pVar && (rVar instanceof C2530s)) {
                if (((((C2530s) rVar) instanceof C2521j) && !rVar.mo14441t()) || (v = rVar.mo14450v()) == null) {
                    break;
                }
                v.mo14448s();
            }
        }
        rVar = null;
        return (C2530s) rVar;
    }

    public String toString() {
        return C1387p0.m5431a(this) + '@' + C1387p0.m5432b(this) + '{' + m21083f() + '}' + mo12423c();
    }
}
