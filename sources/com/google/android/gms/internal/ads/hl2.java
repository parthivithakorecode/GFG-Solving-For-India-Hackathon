package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import p054h1.C2694t;
import p069j1.C3138a1;
import p069j1.C3202r1;

public final class hl2 implements hj2<JSONObject> {

    /* renamed from: a */
    private final Bundle f8332a;

    public hl2(Bundle bundle) {
        this.f8332a = bundle;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.f8332a != null) {
            try {
                C3138a1.m23824f(C3138a1.m23824f(jSONObject, "device"), "play_store").put("parental_controls", C2694t.m21608q().mo14023M(this.f8332a));
            } catch (JSONException unused) {
                C3202r1.m24015k("Failed putting parental controls bundle.");
            }
        }
    }
}
