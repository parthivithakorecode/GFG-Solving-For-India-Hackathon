package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class e21 implements l11 {

    /* renamed from: a */
    private final uy1 f6059a;

    e21(uy1 uy1) {
        this.f6059a = uy1;
    }

    /* renamed from: a */
    public final void mo6036a(Map<String, String> map) {
        String str = map.get("test_mode_enabled");
        if (!TextUtils.isEmpty(str)) {
            this.f6059a.mo11341l(str.equals("true"));
        }
    }
}
