package com.google.ads.mediation;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.C1609cz;
import com.google.android.gms.internal.ads.C2125qw;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.zzcql;
import java.util.Date;
import java.util.Set;
import p002a1.C0020f;
import p002a1.C0022g;
import p002a1.C0024h;
import p002a1.C0026j;
import p076k1.C3296a;
import p083l1.C3448e;
import p083l1.C3452i;
import p083l1.C3457n;
import p083l1.C3459p;
import p083l1.C3462s;
import p083l1.C3464u;
import p083l1.C3467x;
import p083l1.C3468y;

public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, C3464u, zzcql, C3468y {
    @RecentlyNonNull
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private C0020f adLoader;
    @RecentlyNonNull
    protected C0026j mAdView;
    @RecentlyNonNull
    protected C3296a mInterstitialAd;

    /* access modifiers changed from: package-private */
    public C0022g buildAdRequest(Context context, C3448e eVar, Bundle bundle, Bundle bundle2) {
        C0022g.C0023a aVar = new C0022g.C0023a();
        Date c = eVar.mo7606c();
        if (c != null) {
            aVar.mo52j(c);
        }
        int k = eVar.mo7614k();
        if (k != 0) {
            aVar.mo53k(k);
        }
        Set<String> e = eVar.mo7608e();
        if (e != null) {
            for (String a : e) {
                aVar.mo43a(a);
            }
        }
        Location j = eVar.mo7613j();
        if (j != null) {
            aVar.mo48f(j);
        }
        if (eVar.mo7607d()) {
            C2125qw.m15897b();
            aVar.mo51i(bo0.m6996t(context));
        }
        if (eVar.mo7611h() != -1) {
            boolean z = true;
            if (eVar.mo7611h() != 1) {
                z = false;
            }
            aVar.mo55m(z);
        }
        aVar.mo54l(eVar.mo7605b());
        aVar.mo44b(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return aVar.mo45c();
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    public abstract Bundle buildExtrasBundle(@RecentlyNonNull Bundle bundle, @RecentlyNonNull Bundle bundle2);

    @RecentlyNonNull
    public String getAdUnitId(@RecentlyNonNull Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @RecentlyNonNull
    public View getBannerView() {
        return this.mAdView;
    }

    /* access modifiers changed from: package-private */
    public C3296a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @RecentlyNonNull
    public Bundle getInterstitialAdapterInfo() {
        C3467x xVar = new C3467x();
        xVar.mo14558b(1);
        return xVar.mo14557a();
    }

    public C1609cz getVideoController() {
        C0026j jVar = this.mAdView;
        if (jVar != null) {
            return jVar.mo76e().mo123b();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C0020f.C0021a newAdLoader(Context context, String str) {
        return new C0020f.C0021a(context, str);
    }

    public void onDestroy() {
        C0026j jVar = this.mAdView;
        if (jVar != null) {
            jVar.mo83a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z) {
        C3296a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.mo6102d(z);
        }
    }

    public void onPause() {
        C0026j jVar = this.mAdView;
        if (jVar != null) {
            jVar.mo85c();
        }
    }

    public void onResume() {
        C0026j jVar = this.mAdView;
        if (jVar != null) {
            jVar.mo86d();
        }
    }

    public void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull C3452i iVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C0024h hVar, @RecentlyNonNull C3448e eVar, @RecentlyNonNull Bundle bundle2) {
        C0026j jVar = new C0026j(context);
        this.mAdView = jVar;
        jVar.setAdSize(new C0024h(hVar.mo60j(), hVar.mo56c()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new C1466h(this, iVar));
        this.mAdView.mo84b(buildAdRequest(context, eVar, bundle2, bundle));
    }

    public void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull C3457n nVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C3448e eVar, @RecentlyNonNull Bundle bundle2) {
        C3296a.m24375b(context, getAdUnitId(bundle), buildAdRequest(context, eVar, bundle2, bundle), new C1467i(this, nVar));
    }

    public void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull C3459p pVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C3462s sVar, @RecentlyNonNull Bundle bundle2) {
        C1469k kVar = new C1469k(this, pVar);
        C0020f.C0021a e = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER)).mo39e(kVar);
        e.mo40f(sVar.mo7610g());
        e.mo41g(sVar.mo7609f());
        if (sVar.mo7612i()) {
            e.mo38d(kVar);
        }
        if (sVar.mo7604a()) {
            for (String next : sVar.zza().keySet()) {
                e.mo36b(next, kVar, true != sVar.zza().get(next).booleanValue() ? null : kVar);
            }
        }
        C0020f a = e.mo35a();
        this.adLoader = a;
        a.mo33a(buildAdRequest(context, sVar, bundle2, bundle));
    }

    public void showInterstitial() {
        C3296a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.mo6104f((Activity) null);
        }
    }
}
