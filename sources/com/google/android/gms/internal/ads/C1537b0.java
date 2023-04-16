package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.b0 */
final class C1537b0 {

    /* renamed from: a */
    private final dr2 f4547a = new dr2(8);

    /* renamed from: b */
    private int f4548b;

    /* renamed from: b */
    private final long m6465b(pc4 pc4) {
        jc4 jc4 = (jc4) pc4;
        int i = 0;
        jc4.mo6917n(this.f4547a.mo6582h(), 0, 1, false);
        byte b = this.f4547a.mo6582h()[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (~i2);
        jc4.mo6917n(this.f4547a.mo6582h(), 1, i3, false);
        while (i < i3) {
            i++;
            i4 = (this.f4547a.mo6582h()[i] & 255) + (i4 << 8);
        }
        this.f4548b += i3 + 1;
        return (long) i4;
    }

    /* renamed from: a */
    public final boolean mo5592a(pc4 pc4) {
        long b;
        int i;
        long c = pc4.mo6909c();
        int i2 = (c > -1 ? 1 : (c == -1 ? 0 : -1));
        long j = 1024;
        if (i2 != 0 && c <= 1024) {
            j = c;
        }
        int i3 = (int) j;
        jc4 jc4 = (jc4) pc4;
        jc4.mo6917n(this.f4547a.mo6582h(), 0, 4, false);
        long A = this.f4547a.mo6567A();
        this.f4548b = 4;
        while (A != 440786851) {
            int i4 = this.f4548b + 1;
            this.f4548b = i4;
            if (i4 == i3) {
                return false;
            }
            jc4.mo6917n(this.f4547a.mo6582h(), 0, 1, false);
            A = ((A << 8) & -256) | ((long) (this.f4547a.mo6582h()[0] & 255));
        }
        long b2 = m6465b(pc4);
        long j2 = (long) this.f4548b;
        if (b2 != Long.MIN_VALUE && (i2 == 0 || j2 + b2 < c)) {
            while (true) {
                int i5 = (((long) this.f4548b) > (j2 + b2) ? 1 : (((long) this.f4548b) == (j2 + b2) ? 0 : -1));
                if (i5 < 0) {
                    if (m6465b(pc4) == Long.MIN_VALUE || b < 0) {
                        return false;
                    }
                    if (i != 0) {
                        int b3 = (int) (b = m6465b(pc4));
                        jc4.mo8446o(b3, false);
                        this.f4548b += b3;
                    }
                } else if (i5 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
