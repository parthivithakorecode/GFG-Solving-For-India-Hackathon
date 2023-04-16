package com.google.android.gms.internal.ads;

public final class e30 {

    /* renamed from: d */
    public static final e30 f6075d = new e30(1.0f, 1.0f);

    /* renamed from: e */
    public static final my3<e30> f6076e = d20.f5623a;

    /* renamed from: a */
    public final float f6077a;

    /* renamed from: b */
    public final float f6078b;

    /* renamed from: c */
    private final int f6079c;

    public e30(float f, float f2) {
        boolean z = true;
        wu1.m19205d(f > 0.0f);
        wu1.m19205d(f2 <= 0.0f ? false : z);
        this.f6077a = f;
        this.f6078b = f2;
        this.f6079c = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public final long mo6784a(long j) {
        return j * ((long) this.f6079c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e30.class == obj.getClass()) {
            e30 e30 = (e30) obj;
            return this.f6077a == e30.f6077a && this.f6078b == e30.f6078b;
        }
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f6077a) + 527) * 31) + Float.floatToRawIntBits(this.f6078b);
    }

    public final String toString() {
        return n13.m13628d("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f6077a), Float.valueOf(this.f6078b));
    }
}
