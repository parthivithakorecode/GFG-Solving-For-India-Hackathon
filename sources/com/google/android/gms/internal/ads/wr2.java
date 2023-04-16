package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import org.json.JSONObject;
import p069j1.C3138a1;

public final class wr2 {

    /* renamed from: a */
    public final String f16918a;

    /* renamed from: b */
    public final String f16919b;

    /* renamed from: c */
    public final JSONObject f16920c;

    /* renamed from: d */
    public final JSONObject f16921d;

    wr2(JsonReader jsonReader) {
        JSONObject h = C3138a1.m23826h(jsonReader);
        this.f16921d = h;
        this.f16918a = h.optString("ad_html", (String) null);
        this.f16919b = h.optString("ad_base_url", (String) null);
        this.f16920c = h.optJSONObject("ad_json");
    }
}
