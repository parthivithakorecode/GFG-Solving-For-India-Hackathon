package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import p003a2.C0092o;
import p048g2.C2635a;
import p048g2.C2637b;

public final class n41 extends C2192sp {

    /* renamed from: f */
    private final m41 f11303f;

    /* renamed from: g */
    private final C2015nx f11304g;

    /* renamed from: h */
    private final in2 f11305h;

    /* renamed from: i */
    private boolean f11306i = false;

    public n41(m41 m41, C2015nx nxVar, in2 in2) {
        this.f11303f = m41;
        this.f11304g = nxVar;
        this.f11305h = in2;
    }

    /* renamed from: F3 */
    public final void mo9422F3(C2378xp xpVar) {
    }

    /* renamed from: H2 */
    public final void mo9423H2(C2350wy wyVar) {
        C0092o.m309e("setOnPaidEventListener must be called on the main UI thread.");
        in2 in2 = this.f11305h;
        if (in2 != null) {
            in2.mo8184t(wyVar);
        }
    }

    /* renamed from: X4 */
    public final void mo9424X4(boolean z) {
        this.f11306i = z;
    }

    /* renamed from: b */
    public final C2015nx mo9425b() {
        return this.f11304g;
    }

    /* renamed from: c2 */
    public final void mo9426c2(C2635a aVar, C1600cq cqVar) {
        try {
            this.f11305h.mo8186z(cqVar);
            this.f11303f.mo9126j((Activity) C2637b.m21357C0(aVar), cqVar, this.f11306i);
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final C2461zy mo9427d() {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10519i5)).booleanValue()) {
            return null;
        }
        return this.f11303f.mo11409c();
    }
}
