package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xh */
final class C2370xh {

    /* renamed from: d */
    private static final long[] f17199d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f17200a = new byte[8];

    /* renamed from: b */
    private int f17201b;

    /* renamed from: c */
    private int f17202c;

    /* renamed from: b */
    public static int m19507b(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = ((f17199d[i2] & ((long) i)) > 0 ? 1 : ((f17199d[i2] & ((long) i)) == 0 ? 0 : -1));
            i2++;
            if (i3 != 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static long m19508c(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f17199d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: a */
    public final int mo11843a() {
        return this.f17202c;
    }

    /* renamed from: d */
    public final void mo11844d() {
        this.f17201b = 0;
        this.f17202c = 0;
    }

    /* renamed from: e */
    public final long mo11845e(C1554bh bhVar, boolean z, boolean z2, int i) {
        if (this.f17201b == 0) {
            if (!bhVar.mo5861h(this.f17200a, 0, 1, z)) {
                return -1;
            }
            int b = m19507b(this.f17200a[0] & 255);
            this.f17202c = b;
            if (b != -1) {
                this.f17201b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f17202c;
        if (i2 > i) {
            this.f17201b = 0;
            return -2;
        }
        if (i2 != 1) {
            bhVar.mo5861h(this.f17200a, 1, i2 - 1, false);
        }
        this.f17201b = 0;
        return m19508c(this.f17200a, this.f17202c, z2);
    }
}
