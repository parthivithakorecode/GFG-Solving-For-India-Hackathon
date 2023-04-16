package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

public final class fp1 {

    /* renamed from: a */
    private final dc3 f6881a;

    /* renamed from: b */
    private final tp1 f6882b;

    /* renamed from: c */
    private final yp1 f6883c;

    public fp1(dc3 dc3, tp1 tp1, yp1 yp1) {
        this.f6881a = dc3;
        this.f6882b = tp1;
        this.f6883c = yp1;
    }

    /* renamed from: a */
    public final cc3<rm1> mo7379a(ds2 ds2, rr2 rr2, JSONObject jSONObject) {
        JSONObject optJSONObject;
        cc3 n;
        ds2 ds22 = ds2;
        rr2 rr22 = rr2;
        JSONObject jSONObject2 = jSONObject;
        cc3 C = this.f6881a.mo6445C(new dp1(this, ds22, rr22, jSONObject2));
        cc3<List<z30>> f = this.f6882b.mo11052f(jSONObject2, "images");
        cc3<eu0> g = this.f6882b.mo11053g(jSONObject2, "images", rr22, ds22.f5904b.f5509b);
        cc3<z30> e = this.f6882b.mo11051e(jSONObject2, "secondary_image");
        cc3<z30> e2 = this.f6882b.mo11051e(jSONObject2, "app_icon");
        cc3<w30> d = this.f6882b.mo11050d(jSONObject2, "attribution");
        cc3<eu0> h = this.f6882b.mo11054h(jSONObject2, rr22, ds22.f5904b.f5509b);
        tp1 tp1 = this.f6882b;
        if (jSONObject2.optBoolean("enable_omid") && (optJSONObject = jSONObject2.optJSONObject("omid_settings")) != null) {
            String optString = optJSONObject.optString("omid_html");
            if (!TextUtils.isEmpty(optString)) {
                n = rb3.m16136n(rb3.m16131i(null), new op1(tp1, optString), wo0.f16890e);
                cc3 cc3 = n;
                cc3<List<xp1>> a = this.f6883c.mo12071a(jSONObject2, "custom_assets");
                return rb3.m16124b(C, f, g, e, e2, d, h, cc3, a).mo10266a(new ep1(this, C, f, e2, e, d, jSONObject, h, g, cc3, a), this.f6881a);
            }
        }
        n = rb3.m16131i(null);
        cc3 cc32 = n;
        cc3<List<xp1>> a2 = this.f6883c.mo12071a(jSONObject2, "custom_assets");
        return rb3.m16124b(C, f, g, e, e2, d, h, cc32, a2).mo10266a(new ep1(this, C, f, e2, e, d, jSONObject, h, g, cc32, a2), this.f6881a);
    }
}
