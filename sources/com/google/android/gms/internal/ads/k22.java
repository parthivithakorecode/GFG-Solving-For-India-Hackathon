package com.google.android.gms.internal.ads;

import org.json.JSONObject;
import p054h1.C2694t;

final class k22 implements vb0<l22> {
    k22() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ JSONObject mo8587a(Object obj) {
        l22 l22 = (l22) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", l22.f9852c.mo12028b());
        jSONObject2.put("signals", l22.f9851b);
        jSONObject3.put("body", l22.f9850a.f12460c);
        jSONObject3.put("headers", C2694t.m21608q().mo14024N(l22.f9850a.f12459b));
        jSONObject3.put("response_code", l22.f9850a.f12458a);
        jSONObject3.put("latency", l22.f9850a.f12461d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", l22.f9852c.mo12033g());
        return jSONObject;
    }
}
