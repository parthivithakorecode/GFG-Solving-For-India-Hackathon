package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wi */
final class C2334wi {

    /* renamed from: a */
    public final int f16820a;

    /* renamed from: b */
    public final long[] f16821b;

    /* renamed from: c */
    public final int[] f16822c;

    /* renamed from: d */
    public final int f16823d;

    /* renamed from: e */
    public final long[] f16824e;

    /* renamed from: f */
    public final int[] f16825f;

    public C2334wi(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        int length = jArr2.length;
        boolean z = true;
        C1856jm.m11728c(iArr.length == length);
        int length2 = jArr.length;
        C1856jm.m11728c(length2 == length);
        C1856jm.m11728c(iArr2.length != length ? false : z);
        this.f16821b = jArr;
        this.f16822c = iArr;
        this.f16823d = i;
        this.f16824e = jArr2;
        this.f16825f = iArr2;
        this.f16820a = length2;
    }

    /* renamed from: a */
    public final int mo11656a(long j) {
        for (int c = C2449zm.m20724c(this.f16824e, j, true, false); c >= 0; c--) {
            if ((this.f16825f[c] & 1) != 0) {
                return c;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo11657b(long j) {
        for (int b = C2449zm.m20723b(this.f16824e, j, true, false); b < this.f16824e.length; b++) {
            if ((this.f16825f[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }
}
