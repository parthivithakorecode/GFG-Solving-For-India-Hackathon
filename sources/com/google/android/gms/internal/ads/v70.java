package com.google.android.gms.internal.ads;

import java.util.Map;

public final class v70 implements t70<eu0> {

    /* renamed from: a */
    private final w70 f15930a;

    public v70(w70 w70, byte[] bArr) {
        this.f15930a = w70;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5150a(Object obj, Map map) {
        eu0 eu0 = (eu0) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            io0.m11129e("Fail to parse float", e);
        }
        this.f15930a.mo11586c(equals);
        this.f15930a.mo11585b(equals2, f);
        eu0.mo7128j0(equals);
    }
}
