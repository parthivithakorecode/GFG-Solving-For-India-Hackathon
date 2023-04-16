package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class t11 implements l11 {

    /* renamed from: a */
    private final uy1 f14647a;

    t11(uy1 uy1) {
        this.f14647a = uy1;
    }

    /* renamed from: a */
    public final void mo6036a(Map<String, String> map) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10368Q6)).booleanValue()) {
            String str = map.get("policy_violations");
            if (!TextUtils.isEmpty(str)) {
                this.f14647a.mo11340k(str);
            }
        }
    }
}
