package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONObject;
import p069j1.C3202r1;

public final class t22 implements pv2<s22, o22> {

    /* renamed from: a */
    private final String f14687a;

    public t22(String str) {
        this.f14687a = str;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo6109c(Object obj) {
        s22 s22 = (s22) obj;
        int optInt = s22.f14223a.optInt("http_timeout_millis", 60000);
        yi0 a = s22.f14224b;
        if (a.mo12027a() == -2) {
            HashMap hashMap = new HashMap();
            if (s22.f14224b.mo12034h() && !TextUtils.isEmpty(this.f14687a)) {
                hashMap.put("Cookie", this.f14687a);
            }
            String str = "";
            if (s22.f14224b.mo12035i()) {
                JSONObject optJSONObject = s22.f14223a.optJSONObject("pii");
                if (optJSONObject != null) {
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos", str))) {
                        hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", str));
                    }
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", str))) {
                        hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", str));
                    }
                } else {
                    C3202r1.m24015k("DSID signal does not exist.");
                }
            }
            if (s22.f14224b != null && !TextUtils.isEmpty(s22.f14224b.mo12030d())) {
                str = s22.f14224b.mo12030d();
            }
            return new o22(s22.f14224b.mo12031e(), optInt, hashMap, str.getBytes(c43.f5304c), "");
        } else if (a.mo12027a() == 1) {
            if (a.mo12032f() != null) {
                io0.m11128d(TextUtils.join(", ", a.mo12032f()));
            }
            throw new fz1(2, "Error building request URL.");
        } else {
            throw new fz1(1);
        }
    }
}
