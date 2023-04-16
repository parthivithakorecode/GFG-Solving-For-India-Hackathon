package p100n4;

import kotlin.jvm.internal.C3357i;
import kotlin.jvm.internal.C3358j;
import p100n4.C3774e;
import p145u4.C4154p;

/* renamed from: n4.g */
public interface C3778g {

    /* renamed from: n4.g$a */
    public static final class C3779a {

        /* renamed from: n4.g$a$a */
        static final class C3780a extends C3358j implements C4154p<C3778g, C3781b, C3778g> {

            /* renamed from: f */
            public static final C3780a f21691f = new C3780a();

            C3780a() {
                super(2);
            }

            /* renamed from: a */
            public final C3778g invoke(C3778g gVar, C3781b bVar) {
                C3771c cVar;
                C3357i.m24508e(gVar, "acc");
                C3357i.m24508e(bVar, "element");
                C3778g minusKey = gVar.minusKey(bVar.getKey());
                C3784h hVar = C3784h.f21692f;
                if (minusKey == hVar) {
                    return bVar;
                }
                C3774e.C3776b bVar2 = C3774e.f21689e;
                C3774e eVar = (C3774e) minusKey.get(bVar2);
                if (eVar == null) {
                    cVar = new C3771c(minusKey, bVar);
                } else {
                    C3778g minusKey2 = minusKey.minusKey(bVar2);
                    if (minusKey2 == hVar) {
                        return new C3771c(bVar, eVar);
                    }
                    cVar = new C3771c(new C3771c(minusKey2, bVar), eVar);
                }
                return cVar;
            }
        }

        /* renamed from: a */
        public static C3778g m25606a(C3778g gVar, C3778g gVar2) {
            C3357i.m24508e(gVar2, "context");
            return gVar2 == C3784h.f21692f ? gVar : (C3778g) gVar2.fold(gVar, C3780a.f21691f);
        }
    }

    /* renamed from: n4.g$b */
    public interface C3781b extends C3778g {

        /* renamed from: n4.g$b$a */
        public static final class C3782a {
            /* renamed from: a */
            public static <R> R m25608a(C3781b bVar, R r, C4154p<? super R, ? super C3781b, ? extends R> pVar) {
                C3357i.m24508e(pVar, "operation");
                return pVar.invoke(r, bVar);
            }

            /* renamed from: b */
            public static <E extends C3781b> E m25609b(C3781b bVar, C3783c<E> cVar) {
                C3357i.m24508e(cVar, "key");
                if (!C3357i.m24504a(bVar.getKey(), cVar)) {
                    return null;
                }
                C3357i.m24506c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            /* renamed from: c */
            public static C3778g m25610c(C3781b bVar, C3783c<?> cVar) {
                C3357i.m24508e(cVar, "key");
                return C3357i.m24504a(bVar.getKey(), cVar) ? C3784h.f21692f : bVar;
            }

            /* renamed from: d */
            public static C3778g m25611d(C3781b bVar, C3778g gVar) {
                C3357i.m24508e(gVar, "context");
                return C3779a.m25606a(bVar, gVar);
            }
        }

        <E extends C3781b> E get(C3783c<E> cVar);

        C3783c<?> getKey();
    }

    /* renamed from: n4.g$c */
    public interface C3783c<E extends C3781b> {
    }

    <R> R fold(R r, C4154p<? super R, ? super C3781b, ? extends R> pVar);

    <E extends C3781b> E get(C3783c<E> cVar);

    C3778g minusKey(C3783c<?> cVar);

    C3778g plus(C3778g gVar);
}
