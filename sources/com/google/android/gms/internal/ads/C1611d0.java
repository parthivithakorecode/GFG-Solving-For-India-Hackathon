package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d0 */
final class C1611d0 {

    /* renamed from: d */
    private static final long[] f5599d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f5600a = new byte[8];

    /* renamed from: b */
    private int f5601b;

    /* renamed from: c */
    private int f5602c;

    /* renamed from: b */
    public static int m7676b(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = ((f5599d[i2] & ((long) i)) > 0 ? 1 : ((f5599d[i2] & ((long) i)) == 0 ? 0 : -1));
            i2++;
            if (i3 != 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static long m7677c(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f5599d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: a */
    public final int mo6355a() {
        return this.f5602c;
    }

    /* renamed from: d */
    public final long mo6356d(pc4 pc4, boolean z, boolean z2, int i) {
        if (this.f5601b == 0) {
            if (!pc4.mo6916m(this.f5600a, 0, 1, z)) {
                return -1;
            }
            int b = m7676b(this.f5600a[0] & 255);
            this.f5602c = b;
            if (b != -1) {
                this.f5601b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f5602c;
        if (i2 > i) {
            this.f5601b = 0;
            return -2;
        }
        if (i2 != 1) {
            ((jc4) pc4).mo6916m(this.f5600a, 1, i2 - 1, false);
        }
        this.f5601b = 0;
        return m7677c(this.f5600a, this.f5602c, z2);
    }

    /* renamed from: e */
    public final void mo6357e() {
        this.f5601b = 0;
        this.f5602c = 0;
    }
}
