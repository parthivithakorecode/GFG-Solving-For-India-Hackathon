package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import javax.annotation.ParametersAreNonnullByDefault;
import p002a1.C0029m;
import p002a1.C0034r;
import p002a1.C0035s;
import p002a1.C0039v;
import p048g2.C2637b;
import p124r1.C3970a;
import p124r1.C3972c;
import p124r1.C3973d;
import p124r1.C3974e;

@ParametersAreNonnullByDefault
public final class pk0 extends C3972c {

    /* renamed from: a */
    private final String f12678a;

    /* renamed from: b */
    private final fk0 f12679b;

    /* renamed from: c */
    private final Context f12680c;

    /* renamed from: d */
    private final xk0 f12681d = new xk0();

    /* renamed from: e */
    private C3970a f12682e;

    /* renamed from: f */
    private C0034r f12683f;

    /* renamed from: g */
    private C0029m f12684g;

    public pk0(Context context, String str) {
        this.f12680c = context.getApplicationContext();
        this.f12678a = str;
        this.f12679b = C2125qw.m15896a().mo9876k(context, str, new ad0());
    }

    /* renamed from: a */
    public final C0039v mo10073a() {
        C2461zy zyVar = null;
        try {
            fk0 fk0 = this.f12679b;
            if (fk0 != null) {
                zyVar = fk0.mo6491c();
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
        return C0039v.m122e(zyVar);
    }

    /* renamed from: d */
    public final void mo10074d(C0029m mVar) {
        this.f12684g = mVar;
        this.f12681d.mo11858z5(mVar);
    }

    /* renamed from: e */
    public final void mo10075e(boolean z) {
        try {
            fk0 fk0 = this.f12679b;
            if (fk0 != null) {
                fk0.mo6492f0(z);
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: f */
    public final void mo10076f(C3970a aVar) {
        try {
            this.f12682e = aVar;
            fk0 fk0 = this.f12679b;
            if (fk0 != null) {
                fk0.mo6486B3(new l00(aVar));
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: g */
    public final void mo10077g(C0034r rVar) {
        try {
            this.f12683f = rVar;
            fk0 fk0 = this.f12679b;
            if (fk0 != null) {
                fk0.mo6490Z4(new m00(rVar));
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: h */
    public final void mo10078h(C3974e eVar) {
        if (eVar != null) {
            try {
                fk0 fk0 = this.f12679b;
                if (fk0 != null) {
                    fk0.mo6488M1(new uk0(eVar));
                }
            } catch (RemoteException e) {
                io0.m11133i("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: i */
    public final void mo10079i(Activity activity, C0035s sVar) {
        this.f12681d.mo11857A5(sVar);
        if (activity == null) {
            io0.m11131g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            fk0 fk0 = this.f12679b;
            if (fk0 != null) {
                fk0.mo6493y4(this.f12681d);
                this.f12679b.mo6485B1(C2637b.m21358Z2(activity));
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: j */
    public final void mo10080j(C1906kz kzVar, C3973d dVar) {
        try {
            fk0 fk0 = this.f12679b;
            if (fk0 != null) {
                fk0.mo6487D2(C2050ov.f12212a.mo9869a(this.f12680c, kzVar), new tk0(dVar, this));
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }
}
