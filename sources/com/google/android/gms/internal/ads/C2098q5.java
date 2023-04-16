package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.q5 */
final class C2098q5 implements Runnable {

    /* renamed from: f */
    private final C1506a6 f13059f;

    /* renamed from: g */
    private final C1729g6 f13060g;

    /* renamed from: h */
    private final Runnable f13061h;

    public C2098q5(C1506a6 a6Var, C1729g6 g6Var, Runnable runnable) {
        this.f13059f = a6Var;
        this.f13060g = g6Var;
        this.f13061h = runnable;
    }

    public final void run() {
        this.f13059f.mo5132x();
        if (this.f13060g.mo7509c()) {
            this.f13059f.mo5123p(this.f13060g.f7278a);
        } else {
            this.f13059f.mo5122o(this.f13060g.f7280c);
        }
        if (this.f13060g.f7281d) {
            this.f13059f.mo5121n("intermediate-response");
        } else {
            this.f13059f.mo5124q("done");
        }
        Runnable runnable = this.f13061h;
        if (runnable != null) {
            runnable.run();
        }
    }
}
