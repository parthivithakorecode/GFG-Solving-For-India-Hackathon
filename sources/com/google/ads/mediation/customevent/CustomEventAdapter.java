package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.C1455a;
import com.google.ads.mediation.C1457c;
import com.google.ads.mediation.C1460d;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.io0;
import p090m1.C3670c;
import p165y0.C4362a;
import p165y0.C4364c;
import p171z0.C4486c;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter<C3670c, C4486c>, MediationInterstitialAdapter<C3670c, C4486c> {

    /* renamed from: a */
    private View f3689a;

    /* renamed from: b */
    CustomEventBanner f3690b;

    /* renamed from: c */
    CustomEventInterstitial f3691c;

    /* renamed from: a */
    private static <T> T m5653a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            io0.m11131g(sb.toString());
            return null;
        }
    }

    public void destroy() {
        CustomEventBanner customEventBanner = this.f3690b;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f3691c;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    @RecentlyNonNull
    public Class<C3670c> getAdditionalParametersType() {
        return C3670c.class;
    }

    @RecentlyNonNull
    public View getBannerView() {
        return this.f3689a;
    }

    @RecentlyNonNull
    public Class<C4486c> getServerParametersType() {
        return C4486c.class;
    }

    public void requestBannerAd(@RecentlyNonNull C1457c cVar, @RecentlyNonNull Activity activity, @RecentlyNonNull C4486c cVar2, @RecentlyNonNull C4364c cVar3, @RecentlyNonNull C1455a aVar, @RecentlyNonNull C3670c cVar4) {
        CustomEventBanner customEventBanner = (CustomEventBanner) m5653a(cVar2.f22939b);
        this.f3690b = customEventBanner;
        if (customEventBanner == null) {
            cVar.mo4899a(this, C4362a.INTERNAL_ERROR);
            return;
        }
        this.f3690b.requestBannerAd(new C1458a(this, cVar), activity, cVar2.f22938a, cVar2.f22940c, cVar3, aVar, cVar4 == null ? null : cVar4.mo14835a(cVar2.f22938a));
    }

    public void requestInterstitialAd(@RecentlyNonNull C1460d dVar, @RecentlyNonNull Activity activity, @RecentlyNonNull C4486c cVar, @RecentlyNonNull C1455a aVar, @RecentlyNonNull C3670c cVar2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) m5653a(cVar.f22939b);
        this.f3691c = customEventInterstitial;
        if (customEventInterstitial == null) {
            dVar.mo4907b(this, C4362a.INTERNAL_ERROR);
            return;
        }
        this.f3691c.requestInterstitialAd(new C1459b(this, this, dVar), activity, cVar.f22938a, cVar.f22940c, aVar, cVar2 == null ? null : cVar2.mo14835a(cVar.f22938a));
    }

    public void showInterstitial() {
        this.f3691c.showInterstitial();
    }
}
