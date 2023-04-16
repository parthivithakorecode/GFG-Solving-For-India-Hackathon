package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class sd4 {

    /* renamed from: a */
    public final int f14409a;

    /* renamed from: b */
    public final byte[] f14410b;

    /* renamed from: c */
    public final int f14411c;

    /* renamed from: d */
    public final int f14412d;

    public sd4(int i, byte[] bArr, int i2, int i3) {
        this.f14409a = i;
        this.f14410b = bArr;
        this.f14411c = i2;
        this.f14412d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sd4.class == obj.getClass()) {
            sd4 sd4 = (sd4) obj;
            return this.f14409a == sd4.f14409a && this.f14411c == sd4.f14411c && this.f14412d == sd4.f14412d && Arrays.equals(this.f14410b, sd4.f14410b);
        }
    }

    public final int hashCode() {
        return (((((this.f14409a * 31) + Arrays.hashCode(this.f14410b)) * 31) + this.f14411c) * 31) + this.f14412d;
    }
}
