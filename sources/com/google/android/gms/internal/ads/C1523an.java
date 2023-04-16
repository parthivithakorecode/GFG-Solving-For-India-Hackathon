package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.an */
public final class C1523an {

    /* renamed from: a */
    public final List<byte[]> f4250a;

    /* renamed from: b */
    public final int f4251b;

    /* renamed from: c */
    public final float f4252c;

    private C1523an(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f4250a = list;
        this.f4251b = i;
        this.f4252c = f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e1 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e5 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0119 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0127 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0162 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0173 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.C1523an m6121a(com.google.android.gms.internal.ads.C2152rm r17) {
        /*
            r0 = 4
            r1 = r17
            r1.mo10553w(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            int r0 = r17.mo10537g()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r2 = 3
            r0 = r0 & r2
            r3 = 1
            int r6 = r0 + 1
            if (r6 == r2) goto L_0x01a2
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r5.<init>()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            int r0 = r17.mo10537g()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r0 = r0 & 31
            r4 = 0
            r7 = r4
        L_0x001e:
            if (r7 >= r0) goto L_0x002a
            byte[] r8 = m6122b(r17)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r5.add(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            int r7 = r7 + 1
            goto L_0x001e
        L_0x002a:
            int r7 = r17.mo10537g()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r8 = r4
        L_0x002f:
            if (r8 >= r7) goto L_0x003b
            byte[] r9 = m6122b(r17)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r5.add(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            int r8 = r8 + 1
            goto L_0x002f
        L_0x003b:
            r1 = -1
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= 0) goto L_0x0198
            java.lang.Object r0 = r5.get(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            byte[] r0 = (byte[]) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            java.lang.Object r1 = r5.get(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            byte[] r1 = (byte[]) r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            int r0 = r0.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            com.google.android.gms.internal.ads.sm r8 = new com.google.android.gms.internal.ads.sm     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r8.<init>(r1, r6, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r0 = 8
            r8.mo10814d(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            int r1 = r8.mo10811a(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r9 = 16
            r8.mo10814d(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r8.mo10813c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r10 = 100
            if (r1 == r10) goto L_0x008e
            r10 = 110(0x6e, float:1.54E-43)
            if (r1 == r10) goto L_0x008e
            r10 = 122(0x7a, float:1.71E-43)
            if (r1 == r10) goto L_0x008e
            r10 = 244(0xf4, float:3.42E-43)
            if (r1 == r10) goto L_0x008e
            r10 = 44
            if (r1 == r10) goto L_0x008e
            r10 = 83
            if (r1 == r10) goto L_0x008e
            r10 = 86
            if (r1 == r10) goto L_0x008e
            r10 = 118(0x76, float:1.65E-43)
            if (r1 == r10) goto L_0x008e
            r10 = 128(0x80, float:1.794E-43)
            if (r1 == r10) goto L_0x008e
            r10 = 138(0x8a, float:1.93E-43)
            if (r1 != r10) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r1 = r3
            goto L_0x00d8
        L_0x008e:
            int r1 = r8.mo10813c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            if (r1 != r2) goto L_0x0099
            r8.mo10815e()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r10 = r2
            goto L_0x009a
        L_0x0099:
            r10 = r1
        L_0x009a:
            r8.mo10813c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r8.mo10813c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r8.mo10814d(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            boolean r11 = r8.mo10815e()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            if (r11 == 0) goto L_0x00d8
            if (r10 == r2) goto L_0x00ad
            r10 = r0
            goto L_0x00af
        L_0x00ad:
            r10 = 12
        L_0x00af:
            r11 = r4
        L_0x00b0:
            if (r11 >= r10) goto L_0x00d8
            boolean r12 = r8.mo10815e()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            if (r12 == 0) goto L_0x00d5
            r12 = 6
            if (r11 >= r12) goto L_0x00bd
            r12 = r9
            goto L_0x00bf
        L_0x00bd:
            r12 = 64
        L_0x00bf:
            r14 = r0
            r15 = r14
            r13 = r4
        L_0x00c2:
            if (r13 >= r12) goto L_0x00d5
            if (r14 == 0) goto L_0x00cf
            int r14 = r8.mo10812b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            int r14 = r14 + r15
            int r14 = r14 + 256
            int r14 = r14 % 256
        L_0x00cf:
            if (r14 == 0) goto L_0x00d2
            r15 = r14
        L_0x00d2:
            int r13 = r13 + 1
            goto L_0x00c2
        L_0x00d5:
            int r11 = r11 + 1
            goto L_0x00b0
        L_0x00d8:
            r8.mo10813c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            int r10 = r8.mo10813c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            if (r10 != 0) goto L_0x00e5
            r8.mo10813c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            goto L_0x0100
        L_0x00e5:
            if (r10 != r3) goto L_0x0100
            r8.mo10815e()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r8.mo10812b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r8.mo10812b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            int r10 = r8.mo10813c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            long r10 = (long) r10     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
        L_0x00f5:
            long r12 = (long) r4     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x0100
            r8.mo10813c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            int r4 = r4 + 1
            goto L_0x00f5
        L_0x0100:
            r8.mo10813c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r8.mo10814d(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            int r4 = r8.mo10813c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            int r4 = r4 + r3
            int r10 = r8.mo10813c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            int r10 = r10 + r3
            boolean r11 = r8.mo10815e()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            int r12 = 2 - r11
            int r10 = r10 * r12
            if (r11 != 0) goto L_0x011c
            r8.mo10814d(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
        L_0x011c:
            r8.mo10814d(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            int r4 = r4 * r9
            int r10 = r10 * r9
            boolean r11 = r8.mo10815e()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            if (r11 == 0) goto L_0x014e
            int r11 = r8.mo10813c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            int r13 = r8.mo10813c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            int r14 = r8.mo10813c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            int r15 = r8.mo10813c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            if (r1 != 0) goto L_0x013a
            goto L_0x0148
        L_0x013a:
            r16 = 2
            if (r1 != r2) goto L_0x0140
            r2 = r3
            goto L_0x0142
        L_0x0140:
            r2 = r16
        L_0x0142:
            if (r1 != r3) goto L_0x0146
            r3 = r16
        L_0x0146:
            int r12 = r12 * r3
            r3 = r2
        L_0x0148:
            int r11 = r11 + r13
            int r11 = r11 * r3
            int r4 = r4 - r11
            int r14 = r14 + r15
            int r14 = r14 * r12
            int r10 = r10 - r14
        L_0x014e:
            boolean r1 = r8.mo10815e()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            if (r1 == 0) goto L_0x0194
            boolean r1 = r8.mo10815e()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            if (r1 == 0) goto L_0x0194
            int r0 = r8.mo10811a(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r1 = 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L_0x0173
            int r0 = r8.mo10811a(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            int r1 = r8.mo10811a(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            if (r0 == 0) goto L_0x0194
            if (r1 == 0) goto L_0x0194
            float r0 = (float) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            float r1 = (float) r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            float r7 = r0 / r1
            goto L_0x0194
        L_0x0173:
            r1 = 17
            if (r0 >= r1) goto L_0x017c
            float[] r1 = com.google.android.gms.internal.ads.C2078pm.f12701b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r7 = r1[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            goto L_0x0194
        L_0x017c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r2 = 46
            r1.<init>(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            java.lang.String r2 = "Unexpected aspect_ratio_idc value: "
            r1.append(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r1.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            java.lang.String r0 = "NalUnitUtil"
            java.lang.String r1 = r1.toString()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            android.util.Log.w(r0, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
        L_0x0194:
            r9 = r7
            r8 = r10
            r7 = r4
            goto L_0x019b
        L_0x0198:
            r8 = r1
            r9 = r7
            r7 = r8
        L_0x019b:
            com.google.android.gms.internal.ads.an r0 = new com.google.android.gms.internal.ads.an     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            return r0
        L_0x01a2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            r0.<init>()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01a8 }
        L_0x01a8:
            r0 = move-exception
            com.google.android.gms.internal.ads.af r1 = new com.google.android.gms.internal.ads.af
            java.lang.String r2 = "Error parsing AVC config"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1523an.m6121a(com.google.android.gms.internal.ads.rm):com.google.android.gms.internal.ads.an");
    }

    /* renamed from: b */
    private static byte[] m6122b(C2152rm rmVar) {
        int j = rmVar.mo10540j();
        int c = rmVar.mo10533c();
        rmVar.mo10553w(j);
        return C1893km.m12246b(rmVar.f13709a, c, j);
    }
}
