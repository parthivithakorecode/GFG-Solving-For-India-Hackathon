package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
import p069j1.C3138a1;
import p069j1.C3202r1;

public final class al2 implements hj2<JSONObject> {

    /* renamed from: a */
    private final String f4241a;

    /* renamed from: b */
    private final String f4242b;

    public al2(String str, String str2) {
        this.f4241a = str;
        this.f4242b = str2;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        try {
            JSONObject f = C3138a1.m23824f((JSONObject) obj, "pii");
            f.put("doritos", this.f4241a);
            f.put("doritos_v2", this.f4242b);
        } catch (JSONException unused) {
            C3202r1.m24015k("Failed putting doritos string.");
        }
    }
}
