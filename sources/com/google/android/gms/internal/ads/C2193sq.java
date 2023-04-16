package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.sq */
public final /* synthetic */ class C2193sq implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ bp0 f14535f;

    /* renamed from: g */
    public final /* synthetic */ Future f14536g;

    public /* synthetic */ C2193sq(bp0 bp0, Future future) {
        this.f14535f = bp0;
        this.f14536g = future;
    }

    public final void run() {
        bp0 bp0 = this.f14535f;
        Future future = this.f14536g;
        if (bp0.isCancelled()) {
            future.cancel(true);
        }
    }
}
