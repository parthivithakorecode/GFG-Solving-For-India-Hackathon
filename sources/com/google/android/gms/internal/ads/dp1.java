package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;
import p054h1.C2694t;
import p069j1.C3163g2;

public final /* synthetic */ class dp1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ fp1 f5859a;

    /* renamed from: b */
    public final /* synthetic */ ds2 f5860b;

    /* renamed from: c */
    public final /* synthetic */ rr2 f5861c;

    /* renamed from: d */
    public final /* synthetic */ JSONObject f5862d;

    public /* synthetic */ dp1(fp1 fp1, ds2 ds2, rr2 rr2, JSONObject jSONObject) {
        this.f5859a = fp1;
        this.f5860b = ds2;
        this.f5861c = rr2;
        this.f5862d = jSONObject;
    }

    public final Object call() {
        ds2 ds2 = this.f5860b;
        rr2 rr2 = this.f5861c;
        JSONObject jSONObject = this.f5862d;
        rm1 rm1 = new rm1();
        rm1.mo10601v(jSONObject.optInt("template_id", -1));
        rm1.mo10588i(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        rm1.mo10598s(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        ks2 ks2 = ds2.f5903a.f4336a;
        if (ks2.f9642g.contains(Integer.toString(rm1.mo10557K()))) {
            if (rm1.mo10557K() == 3) {
                if (rm1.mo10585g0() == null) {
                    throw new u82(1, "No custom template id for custom template ad response.");
                } else if (!ks2.f9643h.contains(rm1.mo10585g0())) {
                    throw new u82(1, "Unexpected custom template id in the response.");
                }
            }
            rm1.mo10599t(jSONObject.optDouble("rating", -1.0d));
            String optString = jSONObject.optString("headline", (String) null);
            if (rr2.f13867J) {
                C2694t.m21608q();
                String d = C3163g2.m23923d();
                StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 3 + String.valueOf(optString).length());
                sb.append(d);
                sb.append(" : ");
                sb.append(optString);
                optString = sb.toString();
            }
            rm1.mo10600u("headline", optString);
            rm1.mo10600u("body", jSONObject.optString("body", (String) null));
            rm1.mo10600u("call_to_action", jSONObject.optString("call_to_action", (String) null));
            rm1.mo10600u("store", jSONObject.optString("store", (String) null));
            rm1.mo10600u("price", jSONObject.optString("price", (String) null));
            rm1.mo10600u("advertiser", jSONObject.optString("advertiser", (String) null));
            return rm1;
        }
        int K = rm1.mo10557K();
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Invalid template ID: ");
        sb2.append(K);
        throw new u82(1, sb2.toString());
    }
}
