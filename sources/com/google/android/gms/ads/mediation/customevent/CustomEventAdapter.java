package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.io0;
import java.util.Objects;
import p002a1.C0013a;
import p002a1.C0024h;
import p083l1.C3448e;
import p083l1.C3452i;
import p083l1.C3457n;
import p083l1.C3459p;
import p083l1.C3462s;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* renamed from: e */
    static final C0013a f3735e = new C0013a(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");

    /* renamed from: a */
    private View f3736a;

    /* renamed from: b */
    CustomEventBanner f3737b;

    /* renamed from: c */
    CustomEventInterstitial f3738c;

    /* renamed from: d */
    CustomEventNative f3739d;

    /* renamed from: a */
    private static <T> T m5693a(Class<T> cls, String str) {
        Objects.requireNonNull(str);
        try {
            return cls.cast(Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
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

    @RecentlyNonNull
    public View getBannerView() {
        return this.f3736a;
    }

    public void onDestroy() {
        CustomEventBanner customEventBanner = this.f3737b;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f3738c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.f3739d;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    public void onPause() {
        CustomEventBanner customEventBanner = this.f3737b;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f3738c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.f3739d;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    public void onResume() {
        CustomEventBanner customEventBanner = this.f3737b;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f3738c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.f3739d;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    public void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull C3452i iVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C0024h hVar, @RecentlyNonNull C3448e eVar, Bundle bundle2) {
        CustomEventBanner customEventBanner = (CustomEventBanner) m5693a(CustomEventBanner.class, bundle.getString("class_name"));
        this.f3737b = customEventBanner;
        if (customEventBanner == null) {
            iVar.mo6927j(this, f3735e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventBanner customEventBanner2 = this.f3737b;
        Objects.requireNonNull(customEventBanner2);
        customEventBanner2.requestBannerAd(context, new C1471a(this, iVar), bundle.getString("parameter"), hVar, eVar, bundle3);
    }

    public void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull C3457n nVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C3448e eVar, Bundle bundle2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) m5693a(CustomEventInterstitial.class, bundle.getString("class_name"));
        this.f3738c = customEventInterstitial;
        if (customEventInterstitial == null) {
            nVar.mo6921d(this, f3735e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventInterstitial customEventInterstitial2 = this.f3738c;
        Objects.requireNonNull(customEventInterstitial2);
        customEventInterstitial2.requestInterstitialAd(context, new C1472b(this, this, nVar), bundle.getString("parameter"), eVar, bundle3);
    }

    public void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull C3459p pVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C3462s sVar, Bundle bundle2) {
        CustomEventNative customEventNative = (CustomEventNative) m5693a(CustomEventNative.class, bundle.getString("class_name"));
        this.f3739d = customEventNative;
        if (customEventNative == null) {
            pVar.mo6931n(this, f3735e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventNative customEventNative2 = this.f3739d;
        Objects.requireNonNull(customEventNative2);
        customEventNative2.requestNativeAd(context, new C1473c(this, pVar), bundle.getString("parameter"), sVar, bundle3);
    }

    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial = this.f3738c;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }
}
