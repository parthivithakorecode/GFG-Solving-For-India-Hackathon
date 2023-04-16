package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class f00 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ g00 f6639f;

    f00(g00 g00) {
        this.f6639f = g00;
    }

    public final void run() {
        if (this.f6639f.f7219f != null) {
            try {
                this.f6639f.f7219f.mo7157C(1);
            } catch (RemoteException e) {
                io0.m11132h("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
