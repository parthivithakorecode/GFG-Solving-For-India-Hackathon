package p100n4;

import kotlin.jvm.internal.C3357i;
import p100n4.C3778g;

/* renamed from: n4.e */
public interface C3774e extends C3778g.C3781b {

    /* renamed from: e */
    public static final C3776b f21689e = C3776b.f21690f;

    /* renamed from: n4.e$a */
    public static final class C3775a {
        /* renamed from: a */
        public static <E extends C3778g.C3781b> E m25603a(C3774e eVar, C3778g.C3783c<E> cVar) {
            C3357i.m24508e(cVar, "key");
            if (cVar instanceof C3770b) {
                C3770b bVar = (C3770b) cVar;
                if (!bVar.mo15011a(eVar.getKey())) {
                    return null;
                }
                E b = bVar.mo15012b(eVar);
                if (b instanceof C3778g.C3781b) {
                    return b;
                }
                return null;
            } else if (C3774e.f21689e != cVar) {
                return null;
            } else {
                C3357i.m24506c(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
        }

        /* renamed from: b */
        public static C3778g m25604b(C3774e eVar, C3778g.C3783c<?> cVar) {
            C3357i.m24508e(cVar, "key");
            if (!(cVar instanceof C3770b)) {
                return C3774e.f21689e == cVar ? C3784h.f21692f : eVar;
            }
            C3770b bVar = (C3770b) cVar;
            return (!bVar.mo15011a(eVar.getKey()) || bVar.mo15012b(eVar) == null) ? eVar : C3784h.f21692f;
        }
    }

    /* renamed from: n4.e$b */
    public static final class C3776b implements C3778g.C3783c<C3774e> {

        /* renamed from: f */
        static final /* synthetic */ C3776b f21690f = new C3776b();

        private C3776b() {
        }
    }

    /* renamed from: F */
    <T> C3773d<T> mo4693F(C3773d<? super T> dVar);

    /* renamed from: z */
    void mo4698z(C3773d<?> dVar);
}
