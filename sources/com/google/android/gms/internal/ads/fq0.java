package com.google.android.gms.internal.ads;

final class fq0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ boolean f6887f;

    /* renamed from: g */
    final /* synthetic */ gq0 f6888g;

    fq0(gq0 gq0, boolean z) {
        this.f6888g = gq0;
        this.f6887f = z;
    }

    public final void run() {
        this.f6888g.m9865r("windowVisibilityChanged", "isVisible", String.valueOf(this.f6887f));
    }
}
