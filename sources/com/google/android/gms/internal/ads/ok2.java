package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p069j1.C3138a1;
import p069j1.C3202r1;

public final class ok2 implements hj2<JSONObject> {

    /* renamed from: a */
    private final String f12074a;

    public ok2(String str) {
        this.f12074a = str;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        try {
            JSONObject f = C3138a1.m23824f((JSONObject) obj, "pii");
            if (!TextUtils.isEmpty(this.f12074a)) {
                f.put("attok", this.f12074a);
            }
        } catch (JSONException e) {
            C3202r1.m24016l("Failed putting attestation token.", e);
        }
    }
}
