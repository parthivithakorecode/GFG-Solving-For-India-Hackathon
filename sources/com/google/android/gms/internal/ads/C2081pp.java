package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import p002a1.C0029m;
import p002a1.C0034r;
import p002a1.C0039v;
import p019c1.C1432a;
import p048g2.C2637b;

/* renamed from: com.google.android.gms.internal.ads.pp */
public final class C2081pp extends C1432a {

    /* renamed from: a */
    private final C2229tp f12750a;

    /* renamed from: b */
    private final String f12751b;

    /* renamed from: c */
    private final C2118qp f12752c = new C2118qp();

    /* renamed from: d */
    C0029m f12753d;

    /* renamed from: e */
    private C0034r f12754e;

    public C2081pp(C2229tp tpVar, String str) {
        this.f12750a = tpVar;
        this.f12751b = str;
    }

    /* renamed from: a */
    public final C0039v mo4840a() {
        C2461zy zyVar;
        try {
            zyVar = this.f12750a.mo9427d();
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
            zyVar = null;
        }
        return C0039v.m122e(zyVar);
    }

    /* renamed from: d */
    public final void mo4841d(C0029m mVar) {
        this.f12753d = mVar;
        this.f12752c.mo10338z5(mVar);
    }

    /* renamed from: e */
    public final void mo4842e(boolean z) {
        try {
            this.f12750a.mo9424X4(z);
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: f */
    public final void mo4843f(C0034r rVar) {
        this.f12754e = rVar;
        try {
            this.f12750a.mo9423H2(new m00(rVar));
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: g */
    public final void mo4844g(Activity activity) {
        try {
            this.f12750a.mo9426c2(C2637b.m21358Z2(activity), this.f12752c);
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }
}
