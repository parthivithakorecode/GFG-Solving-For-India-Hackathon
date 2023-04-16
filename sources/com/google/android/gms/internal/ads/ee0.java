package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import p002a1.C0013a;
import p002a1.C0040w;
import p003a2.C0092o;
import p026d1.C2475f;
import p083l1.C3452i;
import p083l1.C3457n;
import p083l1.C3459p;
import p083l1.C3465v;

public final class ee0 implements C3452i, C3457n, C3459p {

    /* renamed from: a */
    private final jd0 f6176a;

    /* renamed from: b */
    private C3465v f6177b;

    /* renamed from: c */
    private C2475f f6178c;

    public ee0(jd0 jd0) {
        this.f6176a = jd0;
    }

    /* renamed from: a */
    public final void mo6918a(MediationBannerAdapter mediationBannerAdapter) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        io0.m11126b("Adapter called onAdClosed.");
        try {
            this.f6176a.mo7311d();
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final void mo6919b(MediationNativeAdapter mediationNativeAdapter) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        io0.m11126b("Adapter called onAdOpened.");
        try {
            this.f6176a.mo7313l();
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final void mo6920c(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        io0.m11126b(sb.toString());
        try {
            this.f6176a.mo7304A(i);
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo6921d(MediationInterstitialAdapter mediationInterstitialAdapter, C0013a aVar) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        int a = aVar.mo19a();
        String c = aVar.mo21c();
        String b = aVar.mo20b();
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 97 + String.valueOf(b).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(a);
        sb.append(". ErrorMessage: ");
        sb.append(c);
        sb.append(". ErrorDomain: ");
        sb.append(b);
        io0.m11126b(sb.toString());
        try {
            this.f6176a.mo7318x3(aVar.mo22d());
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo6922e(MediationBannerAdapter mediationBannerAdapter) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        io0.m11126b("Adapter called onAdClicked.");
        try {
            this.f6176a.mo7310b();
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: f */
    public final void mo6923f(MediationNativeAdapter mediationNativeAdapter) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        io0.m11126b("Adapter called onAdClosed.");
        try {
            this.f6176a.mo7311d();
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: g */
    public final void mo6924g(MediationNativeAdapter mediationNativeAdapter, C2475f fVar) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        String valueOf = String.valueOf(fVar.mo7231a());
        io0.m11126b(valueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(valueOf) : new String("Adapter called onAdLoaded with template id "));
        this.f6178c = fVar;
        try {
            this.f6176a.mo7316n();
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: h */
    public final void mo6925h(MediationBannerAdapter mediationBannerAdapter) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        io0.m11126b("Adapter called onAdLoaded.");
        try {
            this.f6176a.mo7316n();
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: i */
    public final void mo6926i(MediationNativeAdapter mediationNativeAdapter, C2475f fVar, String str) {
        if (fVar instanceof f50) {
            try {
                this.f6176a.mo7314l2(((f50) fVar).mo7232b(), str);
            } catch (RemoteException e) {
                io0.m11133i("#007 Could not call remote method.", e);
            }
        } else {
            io0.m11131g("Unexpected native custom template ad type.");
        }
    }

    /* renamed from: j */
    public final void mo6927j(MediationBannerAdapter mediationBannerAdapter, C0013a aVar) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        int a = aVar.mo19a();
        String c = aVar.mo21c();
        String b = aVar.mo20b();
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 97 + String.valueOf(b).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(a);
        sb.append(". ErrorMessage: ");
        sb.append(c);
        sb.append(". ErrorDomain: ");
        sb.append(b);
        io0.m11126b(sb.toString());
        try {
            this.f6176a.mo7318x3(aVar.mo22d());
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: k */
    public final void mo6928k(MediationNativeAdapter mediationNativeAdapter) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        C3465v vVar = this.f6177b;
        if (this.f6178c == null) {
            if (vVar == null) {
                io0.m11133i("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (!vVar.mo14542l()) {
                io0.m11126b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        io0.m11126b("Adapter called onAdClicked.");
        try {
            this.f6176a.mo7310b();
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: l */
    public final void mo6929l(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        io0.m11126b("Adapter called onAdLoaded.");
        try {
            this.f6176a.mo7316n();
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: m */
    public final void mo6930m(MediationBannerAdapter mediationBannerAdapter) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        io0.m11126b("Adapter called onAdOpened.");
        try {
            this.f6176a.mo7313l();
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: n */
    public final void mo6931n(MediationNativeAdapter mediationNativeAdapter, C0013a aVar) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        int a = aVar.mo19a();
        String c = aVar.mo21c();
        String b = aVar.mo20b();
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 97 + String.valueOf(b).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(a);
        sb.append(". ErrorMessage: ");
        sb.append(c);
        sb.append(". ErrorDomain: ");
        sb.append(b);
        io0.m11126b(sb.toString());
        try {
            this.f6176a.mo7318x3(aVar.mo22d());
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: o */
    public final void mo6932o(MediationNativeAdapter mediationNativeAdapter, C3465v vVar) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        io0.m11126b("Adapter called onAdLoaded.");
        this.f6177b = vVar;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            C0040w wVar = new C0040w();
            wVar.mo124c(new td0());
            if (vVar != null && vVar.mo14548r()) {
                vVar.mo14530K(wVar);
            }
        }
        try {
            this.f6176a.mo7316n();
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: p */
    public final void mo6933p(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        io0.m11126b("Adapter called onAdClosed.");
        try {
            this.f6176a.mo7311d();
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: q */
    public final void mo6934q(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        io0.m11126b("Adapter called onAppEvent.");
        try {
            this.f6176a.mo7307L2(str, str2);
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: r */
    public final void mo6935r(MediationNativeAdapter mediationNativeAdapter) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        C3465v vVar = this.f6177b;
        if (this.f6178c == null) {
            if (vVar == null) {
                io0.m11133i("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (!vVar.mo14543m()) {
                io0.m11126b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        io0.m11126b("Adapter called onAdImpression.");
        try {
            this.f6176a.mo5198o();
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: s */
    public final void mo6936s(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        io0.m11126b("Adapter called onAdOpened.");
        try {
            this.f6176a.mo7313l();
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: t */
    public final C2475f mo6937t() {
        return this.f6178c;
    }

    /* renamed from: u */
    public final C3465v mo6938u() {
        return this.f6177b;
    }
}
