package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wh */
final class C2333wh {

    /* renamed from: a */
    private final C2152rm f16814a = new C2152rm(8);

    /* renamed from: b */
    private int f16815b;

    /* renamed from: b */
    private final long m18986b(C1554bh bhVar) {
        int i = 0;
        bhVar.mo5860g(this.f16814a.f13709a, 0, 1, false);
        byte b = this.f16814a.f13709a[0] & 255;
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
        bhVar.mo5860g(this.f16814a.f13709a, 1, i3, false);
        while (i < i3) {
            i++;
            i4 = (this.f16814a.f13709a[i] & 255) + (i4 << 8);
        }
        this.f16815b += i3 + 1;
        return (long) i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r0 = m18986b(r14);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11653a(com.google.android.gms.internal.ads.C1554bh r14) {
        /*
            r13 = this;
            long r0 = r14.mo5856c()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 1024(0x400, double:5.06E-321)
            if (r2 == 0) goto L_0x0012
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r3 = r0
        L_0x0012:
            int r3 = (int) r3
            com.google.android.gms.internal.ads.rm r4 = r13.f16814a
            byte[] r4 = r4.f13709a
            r5 = 0
            r6 = 4
            r14.mo5860g(r4, r5, r6, r5)
            com.google.android.gms.internal.ads.rm r4 = r13.f16814a
            long r7 = r4.mo10543m()
            r13.f16815b = r6
        L_0x0024:
            r9 = 440786851(0x1a45dfa3, double:2.1777764E-315)
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r6 = 1
            if (r4 == 0) goto L_0x004e
            int r4 = r13.f16815b
            int r4 = r4 + r6
            r13.f16815b = r4
            if (r4 != r3) goto L_0x0034
            return r5
        L_0x0034:
            com.google.android.gms.internal.ads.rm r4 = r13.f16814a
            byte[] r4 = r4.f13709a
            r14.mo5860g(r4, r5, r6, r5)
            r4 = 8
            long r6 = r7 << r4
            r8 = -256(0xffffffffffffff00, double:NaN)
            long r6 = r6 & r8
            com.google.android.gms.internal.ads.rm r4 = r13.f16814a
            byte[] r4 = r4.f13709a
            byte r4 = r4[r5]
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r8 = (long) r4
            long r7 = r6 | r8
            goto L_0x0024
        L_0x004e:
            long r3 = r13.m18986b(r14)
            int r7 = r13.f16815b
            long r7 = (long) r7
            r9 = -9223372036854775808
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0093
            if (r2 != 0) goto L_0x005e
            goto L_0x0065
        L_0x005e:
            long r11 = r7 + r3
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0065
            goto L_0x0093
        L_0x0065:
            int r0 = r13.f16815b
            long r0 = (long) r0
            long r11 = r7 + r3
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0090
            long r0 = r13.m18986b(r14)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0077
            return r5
        L_0x0077:
            long r0 = r13.m18986b(r14)
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 < 0) goto L_0x008f
            if (r2 == 0) goto L_0x0065
            int r2 = (int) r0
            r14.mo5859f(r2, r5)
            int r2 = r13.f16815b
            long r11 = (long) r2
            long r11 = r11 + r0
            int r0 = (int) r11
            r13.f16815b = r0
            goto L_0x0065
        L_0x008f:
            return r5
        L_0x0090:
            if (r0 != 0) goto L_0x0093
            return r6
        L_0x0093:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2333wh.mo11653a(com.google.android.gms.internal.ads.bh):boolean");
    }
}
