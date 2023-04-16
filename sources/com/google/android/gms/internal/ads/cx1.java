package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

final class cx1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Long f5547a;

    /* renamed from: b */
    private final String f5548b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f5549c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Integer f5550d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f5551e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Integer f5552f;

    /* synthetic */ cx1(String str, bx1 bx1) {
        this.f5548b = str;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ String m7593a(cx1 cx1) {
        String str = (String) C2199sw.m17001c().mo8579b(m10.f10424X6);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", cx1.f5547a);
            jSONObject.put("eventCategory", cx1.f5548b);
            jSONObject.putOpt("event", cx1.f5549c);
            jSONObject.putOpt("errorCode", cx1.f5550d);
            jSONObject.putOpt("rewardType", cx1.f5551e);
            jSONObject.putOpt("rewardAmount", cx1.f5552f);
        } catch (JSONException unused) {
            io0.m11131g("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(\"h5adsEvent\",");
        sb.append(jSONObject2);
        sb.append(");");
        return sb.toString();
    }
}
