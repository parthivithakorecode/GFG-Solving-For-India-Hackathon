package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public final class yi0 {

    /* renamed from: a */
    private final List<String> f17742a;

    /* renamed from: b */
    private final String f17743b;

    /* renamed from: c */
    private final String f17744c;

    /* renamed from: d */
    private final String f17745d;

    /* renamed from: e */
    private final boolean f17746e;

    /* renamed from: f */
    private final boolean f17747f;

    /* renamed from: g */
    private final String f17748g;

    /* renamed from: h */
    private final String f17749h;

    /* renamed from: i */
    private final String f17750i;

    /* renamed from: j */
    private final int f17751j;

    /* renamed from: k */
    private final JSONObject f17752k;

    /* renamed from: l */
    private final String f17753l;

    /* renamed from: m */
    private final String f17754m;

    public yi0(JSONObject jSONObject) {
        this.f17750i = jSONObject.optString("url");
        this.f17743b = jSONObject.optString("base_uri");
        this.f17744c = jSONObject.optString("post_parameters");
        this.f17746e = m20028j(jSONObject.optString("drt_include"));
        this.f17747f = m20028j(jSONObject.optString("cookies_include", "true"));
        this.f17748g = jSONObject.optString("request_id");
        this.f17745d = jSONObject.optString("type");
        String optString = jSONObject.optString("errors");
        this.f17742a = optString == null ? null : Arrays.asList(optString.split(","));
        this.f17751j = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.f17749h = jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f17752k = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.f17753l = jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f17754m = jSONObject.optString("pool_key");
    }

    /* renamed from: j */
    private static boolean m20028j(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }

    /* renamed from: a */
    public final int mo12027a() {
        return this.f17751j;
    }

    /* renamed from: b */
    public final String mo12028b() {
        return this.f17743b;
    }

    /* renamed from: c */
    public final String mo12029c() {
        return this.f17754m;
    }

    /* renamed from: d */
    public final String mo12030d() {
        return this.f17744c;
    }

    /* renamed from: e */
    public final String mo12031e() {
        return this.f17750i;
    }

    /* renamed from: f */
    public final List<String> mo12032f() {
        return this.f17742a;
    }

    /* renamed from: g */
    public final JSONObject mo12033g() {
        return this.f17752k;
    }

    /* renamed from: h */
    public final boolean mo12034h() {
        return this.f17747f;
    }

    /* renamed from: i */
    public final boolean mo12035i() {
        return this.f17746e;
    }
}
