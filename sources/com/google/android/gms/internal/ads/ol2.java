package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
import p160x1.C4288j;

public final /* synthetic */ class ol2 implements hj2 {

    /* renamed from: a */
    public static final /* synthetic */ ol2 f12092a = new ol2();

    private /* synthetic */ ol2() {
    }

    /* renamed from: c */
    public final void mo5248c(Object obj) {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", C4288j.f22593a);
        } catch (JSONException unused) {
        }
    }
}
