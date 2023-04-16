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
import p124r1.C3974e;
import p130s1.C4016a;
import p130s1.C4017b;

@ParametersAreNonnullByDefault
public final class zk0 extends C4016a {

    /* renamed from: a */
    private final String f18270a;

    /* renamed from: b */
    private final fk0 f18271b;

    /* renamed from: c */
    private final Context f18272c;

    /* renamed from: d */
    private final xk0 f18273d = new xk0();

    /* renamed from: e */
    private C0029m f18274e;

    /* renamed from: f */
    private C3970a f18275f;

    /* renamed from: g */
    private C0034r f18276g;

    public zk0(Context context, String str) {
        this.f18270a = str;
        this.f18272c = context.getApplicationContext();
        this.f18271b = C2125qw.m15896a().mo9876k(context, str, new ad0());
    }

    /* renamed from: a */
    public final C0039v mo12238a() {
        C2461zy zyVar = null;
        try {
            fk0 fk0 = this.f18271b;
            if (fk0 != null) {
                zyVar = fk0.mo6491c();
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
        return C0039v.m122e(zyVar);
    }

    /* renamed from: d */
    public final void mo12239d(C0029m mVar) {
        this.f18274e = mVar;
        this.f18273d.mo11858z5(mVar);
    }

    /* renamed from: e */
    public final void mo12240e(boolean z) {
        try {
            fk0 fk0 = this.f18271b;
            if (fk0 != null) {
                fk0.mo6492f0(z);
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: f */
    public final void mo12241f(C3970a aVar) {
        this.f18275f = aVar;
        try {
            fk0 fk0 = this.f18271b;
            if (fk0 != null) {
                fk0.mo6486B3(new l00(aVar));
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: g */
    public final void mo12242g(C0034r rVar) {
        this.f18276g = rVar;
        try {
            fk0 fk0 = this.f18271b;
            if (fk0 != null) {
                fk0.mo6490Z4(new m00(rVar));
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: h */
    public final void mo12243h(C3974e eVar) {
        try {
            fk0 fk0 = this.f18271b;
            if (fk0 != null) {
                fk0.mo6488M1(new uk0(eVar));
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: i */
    public final void mo12244i(Activity activity, C0035s sVar) {
        this.f18273d.mo11857A5(sVar);
        try {
            fk0 fk0 = this.f18271b;
            if (fk0 != null) {
                fk0.mo6493y4(this.f18273d);
                this.f18271b.mo6485B1(C2637b.m21358Z2(activity));
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: j */
    public final void mo12245j(C1906kz kzVar, C4017b bVar) {
        try {
            fk0 fk0 = this.f18271b;
            if (fk0 != null) {
                fk0.mo6489Y3(C2050ov.f12212a.mo9869a(this.f18272c, kzVar), new yk0(bVar, this));
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }
}
