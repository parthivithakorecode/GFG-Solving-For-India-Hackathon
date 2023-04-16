package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

final class h70 implements t70<eu0> {
    h70() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5150a(Object obj, Map map) {
        JSONObject zza;
        eu0 eu0 = (eu0) obj;
        a40 a0 = eu0.mo7107a0();
        if (a0 == null || (zza = a0.zza()) == null) {
            eu0.mo6423s("nativeAdViewSignalsReady", new JSONObject());
        } else {
            eu0.mo6423s("nativeAdViewSignalsReady", zza);
        }
    }
}
