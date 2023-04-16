package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bf */
public final class C1552bf {

    /* renamed from: d */
    public static final C1552bf f4896d = new C1552bf(1.0f, 1.0f);

    /* renamed from: a */
    public final float f4897a;

    /* renamed from: b */
    public final float f4898b = 1.0f;

    /* renamed from: c */
    private final int f4899c;

    public C1552bf(float f, float f2) {
        this.f4897a = f;
        this.f4899c = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public final long mo5814a(long j) {
        return j * ((long) this.f4899c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1552bf.class == obj.getClass() && this.f4897a == ((C1552bf) obj).f4897a;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f4897a) + 527) * 31) + Float.floatToRawIntBits(1.0f);
    }
}
