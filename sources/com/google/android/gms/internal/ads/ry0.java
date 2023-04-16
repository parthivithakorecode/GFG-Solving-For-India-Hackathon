package com.google.android.gms.internal.ads;

public final class ry0 {

    /* renamed from: e */
    public static final ry0 f14164e = new ry0(0, 0, 0, 1.0f);

    /* renamed from: f */
    public static final my3<ry0> f14165f = qx0.f13370a;

    /* renamed from: a */
    public final int f14166a;

    /* renamed from: b */
    public final int f14167b;

    /* renamed from: c */
    public final int f14168c;

    /* renamed from: d */
    public final float f14169d;

    public ry0(int i, int i2, int i3, float f) {
        this.f14166a = i;
        this.f14167b = i2;
        this.f14168c = i3;
        this.f14169d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ry0) {
            ry0 ry0 = (ry0) obj;
            return this.f14166a == ry0.f14166a && this.f14167b == ry0.f14167b && this.f14168c == ry0.f14168c && this.f14169d == ry0.f14169d;
        }
    }

    public final int hashCode() {
        return ((((((this.f14166a + 217) * 31) + this.f14167b) * 31) + this.f14168c) * 31) + Float.floatToRawIntBits(this.f14169d);
    }
}
