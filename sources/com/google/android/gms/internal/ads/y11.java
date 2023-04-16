package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class y11 implements l11 {

    /* renamed from: a */
    private final qr2 f17544a;

    public y11(qr2 qr2) {
        this.f17544a = qr2;
    }

    /* renamed from: a */
    public final void mo6036a(Map<String, String> map) {
        String str = map.get("render_in_browser");
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f17544a.mo10374b(Boolean.parseBoolean(str));
            } catch (Exception unused) {
                throw new IllegalStateException("Invalid render_in_browser state");
            }
        }
    }
}
