package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class l34 extends Handler {

    /* renamed from: a */
    final /* synthetic */ n34 f9886a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    l34(n34 n34, Looper looper) {
        super(looper);
        this.f9886a = n34;
    }

    public final void handleMessage(Message message) {
        n34.m13685a(this.f9886a, message);
    }
}
