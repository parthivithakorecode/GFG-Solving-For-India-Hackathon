package com.google.android.gms.internal.ads;

public final class r34 {

    /* renamed from: d */
    public static final r34 f13500d = new r34(0, 0, 0);

    /* renamed from: e */
    public static final my3<r34> f13501e = q24.f13041a;

    /* renamed from: a */
    public final int f13502a = 0;

    /* renamed from: b */
    public final int f13503b;

    /* renamed from: c */
    public final int f13504c;

    public r34(int i, int i2, int i3) {
        this.f13503b = i2;
        this.f13504c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r34)) {
            return false;
        }
        r34 r34 = (r34) obj;
        int i = r34.f13502a;
        return this.f13503b == r34.f13503b && this.f13504c == r34.f13504c;
    }

    public final int hashCode() {
        return ((this.f13503b + 16337) * 31) + this.f13504c;
    }
}
