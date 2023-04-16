package kotlinx.coroutines.internal;

import kotlin.jvm.internal.C3357i;
import kotlin.jvm.internal.C3358j;
import p016b5.C1347g0;
import p079k4.C3330q;
import p100n4.C3778g;
import p145u4.C4150l;

/* renamed from: kotlinx.coroutines.internal.y */
public final class C3420y {

    /* renamed from: kotlinx.coroutines.internal.y$a */
    static final class C3421a extends C3358j implements C4150l<Throwable, C3330q> {

        /* renamed from: f */
        final /* synthetic */ C4150l<E, C3330q> f20926f;

        /* renamed from: g */
        final /* synthetic */ E f20927g;

        /* renamed from: h */
        final /* synthetic */ C3778g f20928h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3421a(C4150l<? super E, C3330q> lVar, E e, C3778g gVar) {
            super(1);
            this.f20926f = lVar;
            this.f20927g = e;
            this.f20928h = gVar;
        }

        /* renamed from: a */
        public final void mo14469a(Throwable th) {
            C3420y.m24706b(this.f20926f, this.f20927g, this.f20928h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo14469a((Throwable) obj);
            return C3330q.f20829a;
        }
    }

    /* renamed from: a */
    public static final <E> C4150l<Throwable, C3330q> m24705a(C4150l<? super E, C3330q> lVar, E e, C3778g gVar) {
        return new C3421a(lVar, e, gVar);
    }

    /* renamed from: b */
    public static final <E> void m24706b(C4150l<? super E, C3330q> lVar, E e, C3778g gVar) {
        C3402m0 c = m24707c(lVar, e, (C3402m0) null);
        if (c != null) {
            C1347g0.m5338a(gVar, c);
        }
    }

    /* renamed from: c */
    public static final <E> C3402m0 m24707c(C4150l<? super E, C3330q> lVar, E e, C3402m0 m0Var) {
        try {
            lVar.invoke(e);
        } catch (Throwable th) {
            if (m0Var == null || m0Var.getCause() == th) {
                return new C3402m0(C3357i.m24513j("Exception in undelivered element handler for ", e), th);
            }
            C3313b.m24439a(m0Var, th);
        }
        return m0Var;
    }

    /* renamed from: d */
    public static /* synthetic */ C3402m0 m24708d(C4150l lVar, Object obj, C3402m0 m0Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            m0Var = null;
        }
        return m24707c(lVar, obj, m0Var);
    }
}
