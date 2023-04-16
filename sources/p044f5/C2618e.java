package p044f5;

import kotlin.jvm.internal.C3358j;
import kotlinx.coroutines.internal.C3372c0;
import p016b5.C1391q1;
import p100n4.C3778g;
import p145u4.C4154p;

/* renamed from: f5.e */
public final class C2618e {

    /* renamed from: f5.e$a */
    static final class C2619a extends C3358j implements C4154p<Integer, C3778g.C3781b, Integer> {

        /* renamed from: f */
        final /* synthetic */ C2614c<?> f18993f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2619a(C2614c<?> cVar) {
            super(2);
            this.f18993f = cVar;
        }

        /* renamed from: a */
        public final Integer mo12507a(int i, C3778g.C3781b bVar) {
            C3778g.C3783c key = bVar.getKey();
            C3778g.C3781b bVar2 = this.f18993f.f18986g.get(key);
            if (key != C1391q1.f3593c) {
                return Integer.valueOf(bVar != bVar2 ? Integer.MIN_VALUE : i + 1);
            }
            C1391q1 q1Var = (C1391q1) bVar2;
            C1391q1 b = C2618e.m21327b((C1391q1) bVar, q1Var);
            if (b == q1Var) {
                if (q1Var != null) {
                    i++;
                }
                return Integer.valueOf(i);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b + ", expected child of " + q1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo12507a(((Number) obj).intValue(), (C3778g.C3781b) obj2);
        }
    }

    /* renamed from: a */
    public static final void m21326a(C2614c<?> cVar, C3778g gVar) {
        if (((Number) gVar.fold(0, new C2619a(cVar))).intValue() != cVar.f18987h) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + cVar.f18986g + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    /* renamed from: b */
    public static final C1391q1 m21327b(C1391q1 q1Var, C1391q1 q1Var2) {
        while (q1Var != null) {
            if (q1Var == q1Var2 || !(q1Var instanceof C3372c0)) {
                return q1Var;
            }
            q1Var = ((C3372c0) q1Var).mo14408y0();
        }
        return null;
    }
}
