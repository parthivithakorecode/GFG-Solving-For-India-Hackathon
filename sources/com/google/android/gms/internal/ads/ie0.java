package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p165y0.C4362a;

final class ie0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C4362a f8628f;

    /* renamed from: g */
    final /* synthetic */ ke0 f8629g;

    ie0(ke0 ke0, C4362a aVar) {
        this.f8629g = ke0;
        this.f8628f = aVar;
    }

    public final void run() {
        try {
            this.f8629g.f9492a.mo7304A(le0.m12707a(this.f8628f));
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }
}
