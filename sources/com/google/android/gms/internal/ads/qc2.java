package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

public final class qc2 implements C2420yu, pi1 {
    @GuardedBy("this")

    /* renamed from: f */
    private C2348ww f13126f;

    /* renamed from: L */
    public final synchronized void mo25L() {
        C2348ww wwVar = this.f13126f;
        if (wwVar != null) {
            try {
                wwVar.mo11316a();
            } catch (RemoteException e) {
                io0.m11132h("Remote Exception at onAdClicked.", e);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo10267a(C2348ww wwVar) {
        this.f13126f = wwVar;
    }

    /* renamed from: r */
    public final synchronized void mo8182r() {
        C2348ww wwVar = this.f13126f;
        if (wwVar != null) {
            try {
                wwVar.mo11316a();
            } catch (RemoteException e) {
                io0.m11132h("Remote Exception at onPhysicalClick.", e);
            }
        }
    }
}
