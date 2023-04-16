package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p002a1.C0018d;
import p002a1.C0024h;
import p002a1.C0034r;
import p002a1.C0039v;
import p002a1.C0040w;
import p002a1.C0042x;
import p002a1.C0044y;
import p012b1.C1296e;
import p048g2.C2635a;
import p048g2.C2637b;

/* renamed from: com.google.android.gms.internal.ads.mz */
public final class C1980mz {

    /* renamed from: a */
    private final ad0 f11180a;

    /* renamed from: b */
    private final C2050ov f11181b;

    /* renamed from: c */
    private final AtomicBoolean f11182c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C0040w f11183d;

    /* renamed from: e */
    final C2162rw f11184e;

    /* renamed from: f */
    private C2420yu f11185f;

    /* renamed from: g */
    private C0018d f11186g;

    /* renamed from: h */
    private C0024h[] f11187h;

    /* renamed from: i */
    private C1296e f11188i;

    /* renamed from: j */
    private C2015nx f11189j;

    /* renamed from: k */
    private C0042x f11190k;

    /* renamed from: l */
    private String f11191l;
    @NotOnlyInitialized

    /* renamed from: m */
    private final ViewGroup f11192m;

    /* renamed from: n */
    private int f11193n;

    /* renamed from: o */
    private boolean f11194o;

    /* renamed from: p */
    private C0034r f11195p;

    public C1980mz(ViewGroup viewGroup, int i) {
        this(viewGroup, (AttributeSet) null, false, C2050ov.f12212a, (C2015nx) null, i);
    }

    C1980mz(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, C2050ov ovVar, C2015nx nxVar, int i) {
        C2087pv pvVar;
        this.f11180a = new ad0();
        this.f11183d = new C0040w();
        this.f11184e = new C1943lz(this);
        this.f11192m = viewGroup;
        this.f11181b = ovVar;
        this.f11189j = null;
        this.f11182c = new AtomicBoolean(false);
        this.f11193n = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                C2384xv xvVar = new C2384xv(context, attributeSet);
                this.f11187h = xvVar.mo11930b(z);
                this.f11191l = xvVar.mo11929a();
                if (viewGroup.isInEditMode()) {
                    bo0 b = C2125qw.m15897b();
                    C0024h hVar = this.f11187h[0];
                    int i2 = this.f11193n;
                    if (hVar.equals(C0024h.f33q)) {
                        pvVar = C2087pv.m15289g();
                    } else {
                        C2087pv pvVar2 = new C2087pv(context, hVar);
                        pvVar2.f12813o = m13531c(i2);
                        pvVar = pvVar2;
                    }
                    b.mo5898h(viewGroup, pvVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                C2125qw.m15897b().mo5897g(viewGroup, new C2087pv(context, C0024h.f25i), e.getMessage(), e.getMessage());
            }
        }
    }

    /* renamed from: b */
    private static C2087pv m13530b(Context context, C0024h[] hVarArr, int i) {
        for (C0024h equals : hVarArr) {
            if (equals.equals(C0024h.f33q)) {
                return C2087pv.m15289g();
            }
        }
        C2087pv pvVar = new C2087pv(context, hVarArr);
        pvVar.f12813o = m13531c(i);
        return pvVar;
    }

    /* renamed from: c */
    private static boolean m13531c(int i) {
        return i == 1;
    }

    /* renamed from: a */
    public final C0024h[] mo9370a() {
        return this.f11187h;
    }

    /* renamed from: d */
    public final C0018d mo9371d() {
        return this.f11186g;
    }

    /* renamed from: e */
    public final C0024h mo9372e() {
        C2087pv e;
        try {
            C2015nx nxVar = this.f11189j;
            if (!(nxVar == null || (e = nxVar.mo7472e()) == null)) {
                return C0044y.m147c(e.f12808j, e.f12805g, e.f12804f);
            }
        } catch (RemoteException e2) {
            io0.m11133i("#007 Could not call remote method.", e2);
        }
        C0024h[] hVarArr = this.f11187h;
        if (hVarArr != null) {
            return hVarArr[0];
        }
        return null;
    }

    /* renamed from: f */
    public final C0034r mo9373f() {
        return this.f11195p;
    }

    /* renamed from: g */
    public final C0039v mo9374g() {
        C2461zy zyVar = null;
        try {
            C2015nx nxVar = this.f11189j;
            if (nxVar != null) {
                zyVar = nxVar.mo7476j();
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
        return C0039v.m121d(zyVar);
    }

    /* renamed from: i */
    public final C0040w mo9375i() {
        return this.f11183d;
    }

    /* renamed from: j */
    public final C0042x mo9376j() {
        return this.f11190k;
    }

    /* renamed from: k */
    public final C1296e mo9377k() {
        return this.f11188i;
    }

    /* renamed from: l */
    public final C1609cz mo9378l() {
        C2015nx nxVar = this.f11189j;
        if (nxVar != null) {
            try {
                return nxVar.mo7477k();
            } catch (RemoteException e) {
                io0.m11133i("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    /* renamed from: m */
    public final String mo9379m() {
        C2015nx nxVar;
        if (this.f11191l == null && (nxVar = this.f11189j) != null) {
            try {
                this.f11191l = nxVar.mo7488t();
            } catch (RemoteException e) {
                io0.m11133i("#007 Could not call remote method.", e);
            }
        }
        return this.f11191l;
    }

    /* renamed from: n */
    public final void mo9380n() {
        try {
            C2015nx nxVar = this.f11189j;
            if (nxVar != null) {
                nxVar.mo7457M();
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: o */
    public final void mo9381o(C1906kz kzVar) {
        Object d;
        try {
            if (this.f11189j == null) {
                if (this.f11187h == null || this.f11191l == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f11192m.getContext();
                C2087pv b = m13530b(context, this.f11187h, this.f11193n);
                if ("search_v2".equals(b.f12804f)) {
                    d = new C1792hw(C2125qw.m15896a(), context, b, this.f11191l).mo10181d(context, false);
                } else {
                    d = new C1681ew(C2125qw.m15896a(), context, b, this.f11191l, this.f11180a).mo10181d(context, false);
                }
                C2015nx nxVar = (C2015nx) d;
                this.f11189j = nxVar;
                nxVar.mo7461S2(new C1680ev(this.f11184e));
                C2420yu yuVar = this.f11185f;
                if (yuVar != null) {
                    this.f11189j.mo7464U0(new C2457zu(yuVar));
                }
                C1296e eVar = this.f11188i;
                if (eVar != null) {
                    this.f11189j.mo7482n3(new C2006no(eVar));
                }
                C0042x xVar = this.f11190k;
                if (xVar != null) {
                    this.f11189j.mo7483n5(new s00(xVar));
                }
                this.f11189j.mo7452E4(new m00(this.f11195p));
                this.f11189j.mo7481m5(this.f11194o);
                C2015nx nxVar2 = this.f11189j;
                if (nxVar2 != null) {
                    try {
                        C2635a m = nxVar2.mo7480m();
                        if (m != null) {
                            this.f11192m.addView((View) C2637b.m21357C0(m));
                        }
                    } catch (RemoteException e) {
                        io0.m11133i("#007 Could not call remote method.", e);
                    }
                }
            }
            C2015nx nxVar3 = this.f11189j;
            Objects.requireNonNull(nxVar3);
            if (nxVar3.mo7467X3(this.f11181b.mo9869a(this.f11192m.getContext(), kzVar))) {
                this.f11180a.mo5239A5(kzVar.mo8837p());
            }
        } catch (RemoteException e2) {
            io0.m11133i("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: p */
    public final void mo9382p() {
        try {
            C2015nx nxVar = this.f11189j;
            if (nxVar != null) {
                nxVar.mo7463U();
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: q */
    public final void mo9383q() {
        try {
            C2015nx nxVar = this.f11189j;
            if (nxVar != null) {
                nxVar.mo7454G();
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: r */
    public final void mo9384r(C2420yu yuVar) {
        try {
            this.f11185f = yuVar;
            C2015nx nxVar = this.f11189j;
            if (nxVar != null) {
                nxVar.mo7464U0(yuVar != null ? new C2457zu(yuVar) : null);
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: s */
    public final void mo9385s(C0018d dVar) {
        this.f11186g = dVar;
        this.f11184e.mo10679r(dVar);
    }

    /* renamed from: t */
    public final void mo9386t(C0024h... hVarArr) {
        if (this.f11187h == null) {
            mo9387u(hVarArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    /* renamed from: u */
    public final void mo9387u(C0024h... hVarArr) {
        this.f11187h = hVarArr;
        try {
            C2015nx nxVar = this.f11189j;
            if (nxVar != null) {
                nxVar.mo7487s3(m13530b(this.f11192m.getContext(), this.f11187h, this.f11193n));
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
        this.f11192m.requestLayout();
    }

    /* renamed from: v */
    public final void mo9388v(String str) {
        if (this.f11191l == null) {
            this.f11191l = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    /* renamed from: w */
    public final void mo9389w(C1296e eVar) {
        try {
            this.f11188i = eVar;
            C2015nx nxVar = this.f11189j;
            if (nxVar != null) {
                nxVar.mo7482n3(eVar != null ? new C2006no(eVar) : null);
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: x */
    public final void mo9390x(boolean z) {
        this.f11194o = z;
        try {
            C2015nx nxVar = this.f11189j;
            if (nxVar != null) {
                nxVar.mo7481m5(z);
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: y */
    public final void mo9391y(C0034r rVar) {
        try {
            this.f11195p = rVar;
            C2015nx nxVar = this.f11189j;
            if (nxVar != null) {
                nxVar.mo7452E4(new m00(rVar));
            }
        } catch (RemoteException e) {
            io0.m11133i("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: z */
    public final void mo9392z(C0042x xVar) {
        this.f11190k = xVar;
        try {
            C2015nx nxVar = this.f11189j;
            if (nxVar != null) {
                nxVar.mo7483n5(xVar == null ? null : new s00(xVar));
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }
}
