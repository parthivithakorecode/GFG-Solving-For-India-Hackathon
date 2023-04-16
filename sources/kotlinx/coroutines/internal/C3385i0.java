package kotlinx.coroutines.internal;

import java.util.Objects;
import kotlin.jvm.internal.C3357i;
import kotlin.jvm.internal.C3358j;
import p016b5.C1349g2;
import p100n4.C3778g;
import p145u4.C4154p;

/* renamed from: kotlinx.coroutines.internal.i0 */
public final class C3385i0 {

    /* renamed from: a */
    public static final C3377e0 f20874a = new C3377e0("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    private static final C4154p<Object, C3778g.C3781b, Object> f20875b = C3386a.f20878f;

    /* renamed from: c */
    private static final C4154p<C1349g2<?>, C3778g.C3781b, C1349g2<?>> f20876c = C3387b.f20879f;

    /* renamed from: d */
    private static final C4154p<C3400l0, C3778g.C3781b, C3400l0> f20877d = C3388c.f20880f;

    /* renamed from: kotlinx.coroutines.internal.i0$a */
    static final class C3386a extends C3358j implements C4154p<Object, C3778g.C3781b, Object> {

        /* renamed from: f */
        public static final C3386a f20878f = new C3386a();

        C3386a() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(Object obj, C3778g.C3781b bVar) {
            if (!(bVar instanceof C1349g2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num == null ? 1 : num.intValue();
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.i0$b */
    static final class C3387b extends C3358j implements C4154p<C1349g2<?>, C3778g.C3781b, C1349g2<?>> {

        /* renamed from: f */
        public static final C3387b f20879f = new C3387b();

        C3387b() {
            super(2);
        }

        /* renamed from: a */
        public final C1349g2<?> invoke(C1349g2<?> g2Var, C3778g.C3781b bVar) {
            if (g2Var != null) {
                return g2Var;
            }
            if (bVar instanceof C1349g2) {
                return (C1349g2) bVar;
            }
            return null;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.i0$c */
    static final class C3388c extends C3358j implements C4154p<C3400l0, C3778g.C3781b, C3400l0> {

        /* renamed from: f */
        public static final C3388c f20880f = new C3388c();

        C3388c() {
            super(2);
        }

        /* renamed from: a */
        public final C3400l0 invoke(C3400l0 l0Var, C3778g.C3781b bVar) {
            if (bVar instanceof C1349g2) {
                C1349g2 g2Var = (C1349g2) bVar;
                l0Var.mo14438a(g2Var, g2Var.mo4706N(l0Var.f20891a));
            }
            return l0Var;
        }
    }

    /* renamed from: a */
    public static final void m24602a(C3778g gVar, Object obj) {
        if (obj != f20874a) {
            if (obj instanceof C3400l0) {
                ((C3400l0) obj).mo14439b(gVar);
                return;
            }
            Object fold = gVar.fold(null, f20876c);
            Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((C1349g2) fold).mo4707n(gVar, obj);
        }
    }

    /* renamed from: b */
    public static final Object m24603b(C3778g gVar) {
        Object fold = gVar.fold(0, f20875b);
        C3357i.m24505b(fold);
        return fold;
    }

    /* renamed from: c */
    public static final Object m24604c(C3778g gVar, Object obj) {
        if (obj == null) {
            obj = m24603b(gVar);
        }
        return obj == 0 ? f20874a : obj instanceof Integer ? gVar.fold(new C3400l0(gVar, ((Number) obj).intValue()), f20877d) : ((C1349g2) obj).mo4706N(gVar);
    }
}
