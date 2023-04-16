package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.google.android.gms.internal.ads.oe */
final class C2033oe extends Handler {

    /* renamed from: a */
    final /* synthetic */ C2070pe f11996a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2033oe(C2070pe peVar, Looper looper) {
        super(looper);
        this.f11996a = peVar;
    }

    public final void handleMessage(Message message) {
        this.f11996a.mo10040d(message);
    }
}
