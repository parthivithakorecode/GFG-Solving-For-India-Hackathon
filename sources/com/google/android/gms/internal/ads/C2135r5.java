package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.r5 */
public final class C2135r5 {

    /* renamed from: a */
    private final Executor f13515a;

    public C2135r5(Handler handler) {
        this.f13515a = new C2061p5(this, handler);
    }

    /* renamed from: a */
    public final void mo10481a(C1506a6<?> a6Var, C1877k6 k6Var) {
        a6Var.mo5121n("post-error");
        C1729g6 a = C1729g6.m9544a(k6Var);
        Executor executor = this.f13515a;
        ((C2061p5) executor).f12524f.post(new C2098q5(a6Var, a, (Runnable) null));
    }

    /* renamed from: b */
    public final void mo10482b(C1506a6<?> a6Var, C1729g6<?> g6Var, Runnable runnable) {
        a6Var.mo5125r();
        a6Var.mo5121n("post-response");
        Executor executor = this.f13515a;
        ((C2061p5) executor).f12524f.post(new C2098q5(a6Var, g6Var, runnable));
    }
}
