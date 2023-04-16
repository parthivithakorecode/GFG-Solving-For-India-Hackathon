package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class a00 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ c00 f3875f;

    a00(c00 c00) {
        this.f3875f = c00;
    }

    public final void run() {
        if (this.f3875f.f5249f.f5603f != null) {
            try {
                this.f3875f.f5249f.f5603f.mo7157C(1);
            } catch (RemoteException e) {
                io0.m11132h("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
