package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
import p069j1.C3202r1;

public final class sk2 implements hj2<JSONObject> {

    /* renamed from: a */
    private final JSONObject f14469a;

    public sk2(JSONObject jSONObject) {
        this.f14469a = jSONObject;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.f14469a);
        } catch (JSONException unused) {
            C3202r1.m24015k("Unable to get cache_state");
        }
    }
}
