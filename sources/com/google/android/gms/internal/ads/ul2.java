package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p069j1.C3138a1;

public final class ul2 implements hj2<JSONObject> {

    /* renamed from: a */
    private final String f15628a;

    public ul2(String str) {
        this.f15628a = str;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (!TextUtils.isEmpty(this.f15628a)) {
                C3138a1.m23824f(jSONObject, "pii").put("adsid", this.f15628a);
            }
        } catch (JSONException e) {
            io0.m11132h("Failed putting trustless token.", e);
        }
    }
}
