package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class ta0 {

    /* renamed from: j */
    public static final my3<ta0> f14793j = s90.f14335a;

    /* renamed from: a */
    public final Object f14794a;

    /* renamed from: b */
    public final int f14795b;

    /* renamed from: c */
    public final C2451zo f14796c;

    /* renamed from: d */
    public final Object f14797d;

    /* renamed from: e */
    public final int f14798e;

    /* renamed from: f */
    public final long f14799f;

    /* renamed from: g */
    public final long f14800g;

    /* renamed from: h */
    public final int f14801h;

    /* renamed from: i */
    public final int f14802i;

    public ta0(Object obj, int i, C2451zo zoVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.f14794a = obj;
        this.f14795b = i;
        this.f14796c = zoVar;
        this.f14797d = obj2;
        this.f14798e = i2;
        this.f14799f = j;
        this.f14800g = j2;
        this.f14801h = i3;
        this.f14802i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ta0.class == obj.getClass()) {
            ta0 ta0 = (ta0) obj;
            return this.f14795b == ta0.f14795b && this.f14798e == ta0.f14798e && this.f14799f == ta0.f14799f && this.f14800g == ta0.f14800g && this.f14801h == ta0.f14801h && this.f14802i == ta0.f14802i && m43.m13055a(this.f14794a, ta0.f14794a) && m43.m13055a(this.f14797d, ta0.f14797d) && m43.m13055a(this.f14796c, ta0.f14796c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14794a, Integer.valueOf(this.f14795b), this.f14796c, this.f14797d, Integer.valueOf(this.f14798e), Integer.valueOf(this.f14795b), Long.valueOf(this.f14799f), Long.valueOf(this.f14800g), Integer.valueOf(this.f14801h), Integer.valueOf(this.f14802i)});
    }
}
