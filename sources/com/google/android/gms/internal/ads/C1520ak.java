package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ak */
final class C1520ak implements Runnable {

    /* renamed from: f */
    final /* synthetic */ IOException f4227f;

    /* renamed from: g */
    final /* synthetic */ C1669ek f4228g;

    C1520ak(C1669ek ekVar, IOException iOException) {
        this.f4228g = ekVar;
        this.f4227f = iOException;
    }

    public final void run() {
        this.f4228g.f6245j.mo5473g(this.f4227f);
    }
}
