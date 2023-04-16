package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final /* synthetic */ class j00 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ nk0 f8907f;

    public /* synthetic */ j00(nk0 nk0) {
        this.f8907f = nk0;
    }

    public final void run() {
        nk0 nk0 = this.f8907f;
        if (nk0 != null) {
            try {
                nk0.mo8968C(1);
            } catch (RemoteException e) {
                io0.m11133i("#007 Could not call remote method.", e);
            }
        }
    }
}
