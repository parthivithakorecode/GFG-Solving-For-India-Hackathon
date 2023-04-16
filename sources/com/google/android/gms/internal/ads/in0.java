package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class in0 {

    /* renamed from: a */
    private int f8720a;

    /* renamed from: b */
    private final w74[] f8721b;

    public in0(w74[] w74Arr, byte... bArr) {
        this.f8721b = w74Arr;
        int length = w74Arr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || in0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8721b, ((in0) obj).f8721b);
    }

    public final int hashCode() {
        int i = this.f8720a;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f8721b) + 527;
        this.f8720a = hashCode;
        return hashCode;
    }
}
