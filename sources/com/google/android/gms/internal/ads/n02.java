package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class n02 implements xa3 {

    /* renamed from: a */
    public final /* synthetic */ p02 f11229a;

    /* renamed from: b */
    public final /* synthetic */ String f11230b;

    /* renamed from: c */
    public final /* synthetic */ String f11231c;

    public /* synthetic */ n02(p02 p02, String str, String str2) {
        this.f11229a = p02;
        this.f11230b = str;
        this.f11231c = str2;
    }

    /* renamed from: c */
    public final cc3 mo5074c(Object obj) {
        String str = this.f11230b;
        String str2 = this.f11231c;
        String str3 = (String) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("headers", new JSONObject());
            jSONObject3.put("body", str);
            jSONObject2.put("base_url", "");
            jSONObject2.put("signals", new JSONObject(str2));
            jSONObject.put("request", jSONObject2);
            jSONObject.put("response", jSONObject3);
            jSONObject.put("flags", new JSONObject());
            return rb3.m16131i(jSONObject);
        } catch (JSONException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Preloaded loader: ".concat(valueOf) : new String("Preloaded loader: "));
        }
    }
}
