package p044f5;

import kotlin.coroutines.jvm.internal.C3338d;
import kotlin.coroutines.jvm.internal.C3339e;
import kotlin.coroutines.jvm.internal.C3342h;
import kotlin.jvm.internal.C3357i;
import kotlin.jvm.internal.C3358j;
import p016b5.C1405u1;
import p037e5.C2577c;
import p079k4.C3322k;
import p079k4.C3330q;
import p100n4.C3773d;
import p100n4.C3778g;
import p100n4.C3784h;
import p145u4.C4154p;

/* renamed from: f5.c */
public final class C2614c<T> extends C3338d implements C2577c<T> {

    /* renamed from: f */
    public final C2577c<T> f18985f;

    /* renamed from: g */
    public final C3778g f18986g;

    /* renamed from: h */
    public final int f18987h;

    /* renamed from: i */
    private C3778g f18988i;

    /* renamed from: j */
    private C3773d<? super C3330q> f18989j;

    /* renamed from: f5.c$a */
    static final class C2615a extends C3358j implements C4154p<Integer, C3778g.C3781b, Integer> {

        /* renamed from: f */
        public static final C2615a f18990f = new C2615a();

        C2615a() {
            super(2);
        }

        /* renamed from: a */
        public final Integer mo12504a(int i, C3778g.C3781b bVar) {
            return Integer.valueOf(i + 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo12504a(((Number) obj).intValue(), (C3778g.C3781b) obj2);
        }
    }

    public C2614c(C2577c<? super T> cVar, C3778g gVar) {
        super(C2613b.f18983f, C3784h.f21692f);
        this.f18985f = cVar;
        this.f18986g = gVar;
        this.f18987h = ((Number) gVar.fold(0, C2615a.f18990f)).intValue();
    }

    /* renamed from: d */
    private final void m21319d(C3778g gVar, C3778g gVar2, T t) {
        if (gVar2 instanceof C2612a) {
            m21321j((C2612a) gVar2, t);
        }
        C2618e.m21326a(this, gVar);
    }

    /* renamed from: h */
    private final Object m21320h(C3773d<? super C3330q> dVar, T t) {
        C3778g context = dVar.getContext();
        C1405u1.m5477e(context);
        C3778g gVar = this.f18988i;
        if (gVar != context) {
            m21319d(context, gVar, t);
            this.f18988i = context;
        }
        this.f18989j = dVar;
        Object e = C2616d.f18991a.mo12506e(this.f18985f, t, this);
        if (!C3357i.m24504a(e, C3858d.m25871c())) {
            this.f18989j = null;
        }
        return e;
    }

    /* renamed from: j */
    private final void m21321j(C2612a aVar, Object obj) {
        throw new IllegalStateException(C0169g.m503e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + aVar.f18981f + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    public Object emit(T t, C3773d<? super C3330q> dVar) {
        try {
            Object h = m21320h(dVar, t);
            if (h == C3858d.m25871c()) {
                C3342h.m24493c(dVar);
            }
            return h == C3858d.m25871c() ? h : C3330q.f20829a;
        } catch (Throwable th) {
            this.f18988i = new C2612a(th, dVar.getContext());
            throw th;
        }
    }

    public C3339e getCallerFrame() {
        C3773d<? super C3330q> dVar = this.f18989j;
        if (dVar instanceof C3339e) {
            return (C3339e) dVar;
        }
        return null;
    }

    public C3778g getContext() {
        C3778g gVar = this.f18988i;
        return gVar == null ? C3784h.f21692f : gVar;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public Object invokeSuspend(Object obj) {
        Throwable b = C3322k.m24447b(obj);
        if (b != null) {
            this.f18988i = new C2612a(b, getContext());
        }
        C3773d<? super C3330q> dVar = this.f18989j;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return C3858d.m25871c();
    }

    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
