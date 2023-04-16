package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p165y0.C4362a;

final class je0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C4362a f9115f;

    /* renamed from: g */
    final /* synthetic */ ke0 f9116g;

    je0(ke0 ke0, C4362a aVar) {
        this.f9116g = ke0;
        this.f9115f = aVar;
    }

    public final void run() {
        try {
            this.f9116g.f9492a.mo7304A(le0.m12707a(this.f9115f));
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }
}
