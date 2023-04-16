package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class fh0 {

    /* renamed from: a */
    public final boolean f6821a;

    /* renamed from: b */
    public final String f6822b;

    public fh0(boolean z, String str) {
        this.f6821a = z;
        this.f6822b = str;
    }

    /* renamed from: a */
    public static fh0 m9169a(JSONObject jSONObject) {
        return new fh0(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
