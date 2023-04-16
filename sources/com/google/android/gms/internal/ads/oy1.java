package com.google.android.gms.internal.ads;

import org.json.JSONObject;

final class oy1 {

    /* renamed from: a */
    private final String f12257a;

    /* renamed from: b */
    private final String f12258b;

    /* renamed from: c */
    private final int f12259c;

    /* renamed from: d */
    private final String f12260d;

    /* renamed from: e */
    private final int f12261e;

    public oy1(String str, String str2, int i, String str3, int i2) {
        this.f12257a = str;
        this.f12258b = str2;
        this.f12259c = i;
        this.f12260d = str3;
        this.f12261e = i2;
    }

    /* renamed from: a */
    public final JSONObject mo9889a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f12257a);
        jSONObject.put("version", this.f12258b);
        jSONObject.put("status", this.f12259c);
        jSONObject.put("description", this.f12260d);
        jSONObject.put("initializationLatencyMillis", this.f12261e);
        return jSONObject;
    }
}
