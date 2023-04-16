package com.google.android.gms.internal.ads;

public final /* synthetic */ class m01 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ n01 f10225f;

    /* renamed from: g */
    public final /* synthetic */ Runnable f10226g;

    public /* synthetic */ m01(n01 n01, Runnable runnable) {
        this.f10225f = n01;
        this.f10226g = runnable;
    }

    public final void run() {
        wo0.f16890e.execute(new l01(this.f10225f, this.f10226g));
    }
}
