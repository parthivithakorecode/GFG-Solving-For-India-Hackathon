package com.google.android.gms.internal.ads;

import java.util.Map;
import p003a2.C0092o;

public final class u70 implements t70<Object> {

    /* renamed from: a */
    private final uy1 f15440a;

    public u70(uy1 uy1) {
        C0092o.m314j(uy1, "The Inspector Manager must not be null");
        this.f15440a = uy1;
    }

    /* renamed from: a */
    public final void mo5150a(Object obj, Map<String, String> map) {
        if (map != null && map.containsKey("extras")) {
            long j = Long.MAX_VALUE;
            if (map.containsKey("expires")) {
                try {
                    j = Long.parseLong(map.get("expires"));
                } catch (NumberFormatException unused) {
                }
            }
            this.f15440a.mo11337h(map.get("extras"), j);
        }
    }
}
