package com.google.android.gms.internal.ads;

import org.json.JSONObject;

final class a21 implements m11 {

    /* renamed from: a */
    private final rl0 f3895a;

    a21(rl0 rl0) {
        this.f3895a = rl0;
    }

    /* renamed from: b */
    public final void mo5073b(JSONObject jSONObject) {
        this.f3895a.mo10526b(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
    }
}
