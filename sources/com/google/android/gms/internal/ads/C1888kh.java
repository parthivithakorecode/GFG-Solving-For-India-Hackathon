package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.kh */
public final class C1888kh {

    /* renamed from: a */
    public final int f9533a = 1;

    /* renamed from: b */
    public final byte[] f9534b;

    public C1888kh(int i, byte[] bArr) {
        this.f9534b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1888kh.class == obj.getClass() && Arrays.equals(this.f9534b, ((C1888kh) obj).f9534b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9534b) + 31;
    }
}
