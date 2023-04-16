package p016b5;

import java.util.concurrent.Executor;

/* renamed from: b5.j1 */
public final class C1364j1 {
    /* renamed from: a */
    public static final C1332d0 m5362a(Executor executor) {
        C1332d0 d0Var = null;
        C1413x0 x0Var = executor instanceof C1413x0 ? (C1413x0) executor : null;
        if (x0Var != null) {
            d0Var = x0Var.f3613f;
        }
        return d0Var == null ? new C1359i1(executor) : d0Var;
    }
}
