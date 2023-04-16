package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class gr2 extends o03 {

    /* renamed from: a */
    final /* synthetic */ C2238ty f7577a;

    /* renamed from: b */
    final /* synthetic */ ir2 f7578b;

    gr2(ir2 ir2, C2238ty tyVar) {
        this.f7578b = ir2;
        this.f7577a = tyVar;
    }

    /* renamed from: y */
    public final void mo7709y() {
        if (this.f7578b.f8771k != null) {
            try {
                this.f7577a.mo8845b();
            } catch (RemoteException e) {
                io0.m11133i("#007 Could not call remote method.", e);
            }
        }
    }
}
