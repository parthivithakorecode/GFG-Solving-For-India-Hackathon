package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class nr2 extends o03 {

    /* renamed from: a */
    final /* synthetic */ C2163rx f11628a;

    /* renamed from: b */
    final /* synthetic */ or2 f11629b;

    nr2(or2 or2, C2163rx rxVar) {
        this.f11629b = or2;
        this.f11628a = rxVar;
    }

    /* renamed from: y */
    public final void mo7709y() {
        if (this.f11629b.f12174i != null) {
            try {
                this.f11628a.mo10184b();
            } catch (RemoteException e) {
                io0.m11133i("#007 Could not call remote method.", e);
            }
        }
    }
}
