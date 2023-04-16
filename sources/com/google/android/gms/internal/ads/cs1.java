package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p002a1.C0040w;

public final class cs1 extends C0040w.C0041a {

    /* renamed from: a */
    private final rm1 f5507a;

    public cs1(rm1 rm1) {
        this.f5507a = rm1;
    }

    /* renamed from: f */
    private static C1758gz m7544f(rm1 rm1) {
        C1609cz R = rm1.mo10564R();
        if (R == null) {
            return null;
        }
        try {
            return R.mo5574h();
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo125a() {
        C1758gz f = m7544f(this.f5507a);
        if (f != null) {
            try {
                f.mo7191b();
            } catch (RemoteException e) {
                io0.m11132h("Unable to call onVideoEnd()", e);
            }
        }
    }

    /* renamed from: c */
    public final void mo127c() {
        C1758gz f = m7544f(this.f5507a);
        if (f != null) {
            try {
                f.mo7192e();
            } catch (RemoteException e) {
                io0.m11132h("Unable to call onVideoEnd()", e);
            }
        }
    }

    /* renamed from: e */
    public final void mo129e() {
        C1758gz f = m7544f(this.f5507a);
        if (f != null) {
            try {
                f.mo7194h();
            } catch (RemoteException e) {
                io0.m11132h("Unable to call onVideoEnd()", e);
            }
        }
    }
}
