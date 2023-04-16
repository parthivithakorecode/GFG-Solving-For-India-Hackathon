package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;
import p069j1.C3202r1;

final class vk2 implements ij2<hj2<JSONObject>> {

    /* renamed from: a */
    private final JSONObject f16338a;

    vk2(Context context) {
        this.f16338a = gj0.m9800c(context);
    }

    /* renamed from: a */
    public final cc3<hj2<JSONObject>> mo5813a() {
        return rb3.m16131i(new uk2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo11490b(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.f16338a);
        } catch (JSONException unused) {
            C3202r1.m24015k("Failed putting version constants.");
        }
    }
}
