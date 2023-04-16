package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

public final /* synthetic */ class i62 implements Handler.Callback {

    /* renamed from: f */
    public final /* synthetic */ nb2 f8553f;

    public /* synthetic */ i62(nb2 nb2) {
        this.f8553f = nb2;
    }

    public final boolean handleMessage(Message message) {
        nb2.m13825g(this.f8553f, message);
        return true;
    }
}
