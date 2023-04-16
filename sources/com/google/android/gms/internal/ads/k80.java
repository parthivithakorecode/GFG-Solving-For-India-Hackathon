package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class k80 implements t70<Object> {

    /* renamed from: a */
    private final j80 f9430a;

    public k80(j80 j80) {
        this.f9430a = j80;
    }

    /* renamed from: b */
    public static void m12053b(eu0 eu0, j80 j80) {
        eu0.mo7080F0("/reward", new k80(j80));
    }

    /* renamed from: a */
    public final void mo5150a(Object obj, Map<String, String> map) {
        String str = map.get("action");
        if ("grant".equals(str)) {
            yj0 yj0 = null;
            try {
                int parseInt = Integer.parseInt(map.get("amount"));
                String str2 = map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    yj0 = new yj0(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                io0.m11132h("Unable to parse reward amount.", e);
            }
            this.f9430a.mo7054p0(yj0);
        } else if ("video_start".equals(str)) {
            this.f9430a.mo7053c();
        } else if ("video_complete".equals(str)) {
            this.f9430a.mo7052a();
        }
    }
}
