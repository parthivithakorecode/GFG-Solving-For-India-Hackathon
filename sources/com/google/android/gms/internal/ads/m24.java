package com.google.android.gms.internal.ads;

final class m24 extends u14 {
    m24() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ae A[LOOP:4: B:27:0x00ae->B:28:0x00b0, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:12:0x0036, B:28:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8062h(java.nio.ByteBuffer r10) {
        /*
            r9 = this;
            int r0 = r10.position()
            int r1 = r10.limit()
            int r2 = r1 - r0
            com.google.android.gms.internal.ads.u04 r3 = r9.f15333b
            int r3 = r3.f15314c
            r4 = 805306368(0x30000000, float:4.656613E-10)
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r7 = 4
            r8 = 3
            if (r3 == r8) goto L_0x002d
            if (r3 == r7) goto L_0x002a
            if (r3 == r6) goto L_0x002e
            if (r3 == r5) goto L_0x0027
            if (r3 != r4) goto L_0x0021
            goto L_0x002a
        L_0x0021:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L_0x0027:
            int r2 = r2 / 3
            goto L_0x002d
        L_0x002a:
            int r2 = r2 / 2
            goto L_0x002e
        L_0x002d:
            int r2 = r2 + r2
        L_0x002e:
            java.nio.ByteBuffer r2 = r9.mo11147j(r2)
            com.google.android.gms.internal.ads.u04 r3 = r9.f15333b
            int r3 = r3.f15314c
            if (r3 == r8) goto L_0x00ae
            if (r3 == r7) goto L_0x0089
            if (r3 == r6) goto L_0x0074
            if (r3 == r5) goto L_0x005d
            if (r3 != r4) goto L_0x0057
        L_0x0040:
            if (r0 >= r1) goto L_0x00c3
            int r3 = r0 + 2
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r3 = r0 + 3
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x0040
        L_0x0057:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L_0x005d:
            if (r0 >= r1) goto L_0x00c3
            int r3 = r0 + 1
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r3 = r0 + 2
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L_0x005d
        L_0x0074:
            if (r0 >= r1) goto L_0x00c3
            int r3 = r0 + 1
            byte r3 = r10.get(r3)
            r2.put(r3)
            byte r3 = r10.get(r0)
            r2.put(r3)
            int r0 = r0 + 2
            goto L_0x0074
        L_0x0089:
            if (r0 >= r1) goto L_0x00c3
            float r3 = r10.getFloat(r0)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = com.google.android.gms.internal.ads.n13.m13596A(r3, r4, r5)
            r4 = 1191181824(0x46fffe00, float:32767.0)
            float r3 = r3 * r4
            int r3 = (int) r3
            short r3 = (short) r3
            r4 = r3 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r2.put(r4)
            int r3 = r3 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x0089
        L_0x00ae:
            if (r0 >= r1) goto L_0x00c3
            r3 = 0
            r2.put(r3)
            byte r3 = r10.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + -128
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L_0x00ae
        L_0x00c3:
            int r0 = r10.limit()
            r10.position(r0)
            r2.flip()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m24.mo8062h(java.nio.ByteBuffer):void");
    }

    /* renamed from: i */
    public final u04 mo8063i(u04 u04) {
        int i = u04.f15314c;
        if (i != 3) {
            if (i == 2) {
                return u04.f15311e;
            }
            if (!(i == 268435456 || i == 536870912 || i == 805306368 || i == 4)) {
                throw new v04(u04);
            }
        }
        return new u04(u04.f15312a, u04.f15313b, 2);
    }
}
