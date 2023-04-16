package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class ns2 {

    /* renamed from: a */
    private final JSONObject f11679a;

    public ns2(JSONObject jSONObject) {
        this.f11679a = jSONObject;
    }

    /* renamed from: a */
    public final String mo9591a() {
        if (mo9592b() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    /* renamed from: b */
    public final int mo9592b() {
        int optInt = this.f11679a.optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
