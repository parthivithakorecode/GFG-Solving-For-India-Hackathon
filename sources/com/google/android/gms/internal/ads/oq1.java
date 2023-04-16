package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final /* synthetic */ class oq1 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ qq1 f12144f;

    public /* synthetic */ oq1(qq1 qq1) {
        this.f12144f = qq1;
    }

    public final void run() {
        try {
            this.f12144f.mo10349g();
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }
}
