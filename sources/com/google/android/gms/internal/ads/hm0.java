package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class hm0 {

    /* renamed from: d */
    public static final hm0 f8336d = new hm0(new gk0[0]);

    /* renamed from: e */
    public static final my3<hm0> f8337e = gl0.f7520a;

    /* renamed from: a */
    public final int f8338a;

    /* renamed from: b */
    private final gk0[] f8339b;

    /* renamed from: c */
    private int f8340c;

    public hm0(gk0... gk0Arr) {
        this.f8339b = gk0Arr;
        this.f8338a = gk0Arr.length;
    }

    /* renamed from: a */
    public final int mo7963a(gk0 gk0) {
        for (int i = 0; i < this.f8338a; i++) {
            if (this.f8339b[i] == gk0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final gk0 mo7964b(int i) {
        return this.f8339b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hm0.class == obj.getClass()) {
            hm0 hm0 = (hm0) obj;
            return this.f8338a == hm0.f8338a && Arrays.equals(this.f8339b, hm0.f8339b);
        }
    }

    public final int hashCode() {
        int i = this.f8340c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f8339b);
        this.f8340c = hashCode;
        return hashCode;
    }
}
