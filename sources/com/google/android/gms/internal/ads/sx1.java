package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final /* synthetic */ class sx1 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ cy1 f14615f;

    /* renamed from: g */
    public final /* synthetic */ m90 f14616g;

    public /* synthetic */ sx1(cy1 cy1, m90 m90) {
        this.f14615f = cy1;
        this.f14616g = m90;
    }

    public final void run() {
        cy1 cy1 = this.f14615f;
        try {
            this.f14616g.mo8642K2(cy1.mo6328f());
        } catch (RemoteException e) {
            io0.m11129e("", e);
        }
    }
}
