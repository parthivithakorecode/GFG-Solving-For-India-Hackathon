package p131s2;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p003a2.C0092o;

/* renamed from: s2.k */
public final class C4031k {
    @Deprecated
    /* renamed from: a */
    public static <TResult> C4028h<TResult> m26349a(@RecentlyNonNull Executor executor, @RecentlyNonNull Callable<TResult> callable) {
        C0092o.m314j(executor, "Executor must not be null");
        C0092o.m314j(callable, "Callback must not be null");
        C4021b0 b0Var = new C4021b0();
        executor.execute(new C4023c0(b0Var, callable));
        return b0Var;
    }

    /* renamed from: b */
    public static <TResult> C4028h<TResult> m26350b(@RecentlyNonNull Exception exc) {
        C4021b0 b0Var = new C4021b0();
        b0Var.mo15518p(exc);
        return b0Var;
    }

    /* renamed from: c */
    public static <TResult> C4028h<TResult> m26351c(@RecentlyNonNull TResult tresult) {
        C4021b0 b0Var = new C4021b0();
        b0Var.mo15516n(tresult);
        return b0Var;
    }
}
