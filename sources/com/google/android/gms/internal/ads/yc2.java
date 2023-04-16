package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final /* synthetic */ class yc2 implements ya1 {

    /* renamed from: f */
    public final /* synthetic */ lc2 f17671f;

    /* renamed from: g */
    public final /* synthetic */ ba0 f17672g;

    public /* synthetic */ yc2(lc2 lc2, ba0 ba0) {
        this.f17671f = lc2;
        this.f17672g = ba0;
    }

    /* renamed from: d */
    public final void mo7808d(C1605cv cvVar) {
        lc2 lc2 = this.f17671f;
        ba0 ba0 = this.f17672g;
        lc2.mo7808d(cvVar);
        if (ba0 != null) {
            try {
                ba0.mo5758w(cvVar);
            } catch (RemoteException e) {
                io0.m11133i("#007 Could not call remote method.", e);
            }
        }
        if (ba0 != null) {
            try {
                ba0.mo5756C(cvVar.f5529f);
            } catch (RemoteException e2) {
                io0.m11133i("#007 Could not call remote method.", e2);
            }
        }
    }
}
