package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import p002a1.C0013a;
import p002a1.C0019e;
import p002a1.C0029m;
import p002a1.C0030n;
import p002a1.C0034r;
import p002a1.C0039v;
import p012b1.C1294c;
import p012b1.C1296e;
import p048g2.C2637b;

public final class ca0<AdT> extends C1294c {

    /* renamed from: a */
    private final Context f5343a;

    /* renamed from: b */
    private final C2050ov f5344b = C2050ov.f12212a;

    /* renamed from: c */
    private final C2015nx f5345c;

    /* renamed from: d */
    private final String f5346d;

    /* renamed from: e */
    private final ad0 f5347e;

    /* renamed from: f */
    private C1296e f5348f;

    /* renamed from: g */
    private C0029m f5349g;

    /* renamed from: h */
    private C0034r f5350h;

    public ca0(Context context, String str) {
        ad0 ad0 = new ad0();
        this.f5347e = ad0;
        this.f5343a = context;
        this.f5346d = str;
        this.f5345c = C2125qw.m15896a().mo9873e(context, new C2087pv(), str, ad0);
    }

    /* renamed from: a */
    public final C0039v mo6100a() {
        C2461zy zyVar = null;
        try {
            C2015nx nxVar = this.f5345c;
            if (nxVar != null) {
                zyVar = nxVar.mo7476j();
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
        return C0039v.m122e(zyVar);
    }

    /* renamed from: c */
    public final void mo6101c(C0029m mVar) {
        try {
            this.f5349g = mVar;
            C2015nx nxVar = this.f5345c;
            if (nxVar != null) {
                nxVar.mo7471d2(new C2236tw(mVar));
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo6102d(boolean z) {
        try {
            C2015nx nxVar = this.f5345c;
            if (nxVar != null) {
                nxVar.mo7479k3(z);
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo6103e(C0034r rVar) {
        try {
            this.f5350h = rVar;
            C2015nx nxVar = this.f5345c;
            if (nxVar != null) {
                nxVar.mo7452E4(new m00(rVar));
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: f */
    public final void mo6104f(Activity activity) {
        if (activity == null) {
            io0.m11131g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            C2015nx nxVar = this.f5345c;
            if (nxVar != null) {
                nxVar.mo7460R0(C2637b.m21358Z2(activity));
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: h */
    public final void mo4621h(C1296e eVar) {
        try {
            this.f5348f = eVar;
            C2015nx nxVar = this.f5345c;
            if (nxVar != null) {
                nxVar.mo7482n3(eVar != null ? new C2006no(eVar) : null);
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: i */
    public final void mo6105i(C1906kz kzVar, C0019e<AdT> eVar) {
        try {
            if (this.f5345c != null) {
                this.f5347e.mo5239A5(kzVar.mo8837p());
                this.f5345c.mo7468Y1(this.f5344b.mo9869a(this.f5343a, kzVar), new C1717fv(eVar, this));
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
            eVar.mo31d(new C0030n(0, "Internal Error.", "com.google.android.gms.ads", (C0013a) null, (C0039v) null));
        }
    }
}
