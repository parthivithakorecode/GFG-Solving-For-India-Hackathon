package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.q */
public final class C3407q {

    /* renamed from: a */
    private static final Object f20903a = new C3377e0("CONDITION_FALSE");

    /* renamed from: b */
    private static final Object f20904b = new C3377e0("LIST_EMPTY");

    /* renamed from: a */
    public static final Object m24655a() {
        return f20903a;
    }

    /* renamed from: b */
    public static final C3408r m24656b(Object obj) {
        C3408r rVar = null;
        C3368a0 a0Var = obj instanceof C3368a0 ? (C3368a0) obj : null;
        if (a0Var != null) {
            rVar = a0Var.f20854a;
        }
        return rVar == null ? (C3408r) obj : rVar;
    }
}
