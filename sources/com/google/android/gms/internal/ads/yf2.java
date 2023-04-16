package com.google.android.gms.internal.ads;

import android.os.Bundle;

final class yf2 implements hj2<Bundle> {

    /* renamed from: a */
    private final String f17723a;

    /* renamed from: b */
    private final String f17724b;

    /* renamed from: c */
    private final Bundle f17725c;

    /* synthetic */ yf2(String str, String str2, Bundle bundle, xf2 xf2) {
        this.f17723a = str;
        this.f17724b = str2;
        this.f17725c = bundle;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.f17723a);
        bundle.putString("fc_consent", this.f17724b);
        bundle.putBundle("iab_consent_info", this.f17725c);
    }
}
