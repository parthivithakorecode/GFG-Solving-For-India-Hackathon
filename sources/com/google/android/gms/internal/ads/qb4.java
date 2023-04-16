package com.google.android.gms.internal.ads;

public final class qb4 {

    /* renamed from: a */
    private static final int[] f13121a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    private static final int[] f13122b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c */
    public static final /* synthetic */ int f13123c = 0;

    /* renamed from: a */
    public static pb4 m15554a(byte[] bArr) {
        return m15555b(new cq2(bArr, bArr.length), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ba, code lost:
        if (r12 != 3) goto L_0x00dc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.pb4 m15555b(com.google.android.gms.internal.ads.cq2 r12, boolean r13) {
        /*
            int r0 = m15556c(r12)
            int r1 = m15557d(r12)
            r2 = 4
            int r3 = r12.mo6262c(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 19
            r4.<init>(r5)
            java.lang.String r6 = "mp4a.40."
            r4.append(r6)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r6 = 22
            r7 = 5
            if (r0 == r7) goto L_0x0029
            r7 = 29
            if (r0 != r7) goto L_0x0037
        L_0x0029:
            int r1 = m15557d(r12)
            int r0 = m15556c(r12)
            if (r0 != r6) goto L_0x0037
            int r3 = r12.mo6262c(r2)
        L_0x0037:
            if (r13 == 0) goto L_0x00dc
            r13 = 17
            r7 = 6
            r8 = 1
            r9 = 2
            r10 = 3
            if (r0 == r8) goto L_0x0069
            if (r0 == r9) goto L_0x0069
            if (r0 == r10) goto L_0x0069
            if (r0 == r2) goto L_0x0069
            if (r0 == r7) goto L_0x0069
            r2 = 7
            if (r0 == r2) goto L_0x0069
            if (r0 == r13) goto L_0x0069
            switch(r0) {
                case 19: goto L_0x0069;
                case 20: goto L_0x0069;
                case 21: goto L_0x0069;
                case 22: goto L_0x0069;
                case 23: goto L_0x0069;
                default: goto L_0x0051;
            }
        L_0x0051:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r13 = 42
            r12.<init>(r13)
            java.lang.String r13 = "Unsupported audio object type: "
            r12.append(r13)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            com.google.android.gms.internal.ads.dz r12 = com.google.android.gms.internal.ads.C1646dz.m8225c(r12)
            throw r12
        L_0x0069:
            boolean r2 = r12.mo6271l()
            if (r2 == 0) goto L_0x0076
            java.lang.String r2 = "AacUtil"
            java.lang.String r11 = "Unexpected frameLengthFlag = 1"
            android.util.Log.w(r2, r11)
        L_0x0076:
            boolean r2 = r12.mo6271l()
            if (r2 == 0) goto L_0x0081
            r2 = 14
            r12.mo6269j(r2)
        L_0x0081:
            boolean r2 = r12.mo6271l()
            if (r3 == 0) goto L_0x00d6
            r11 = 20
            if (r0 == r7) goto L_0x0091
            if (r0 != r11) goto L_0x008f
            r0 = r11
            goto L_0x0091
        L_0x008f:
            r7 = r0
            goto L_0x0095
        L_0x0091:
            r7 = r0
            r12.mo6269j(r10)
        L_0x0095:
            if (r2 == 0) goto L_0x00b0
            if (r0 != r6) goto L_0x009f
            r0 = 16
            r12.mo6269j(r0)
            goto L_0x00a0
        L_0x009f:
            r6 = r0
        L_0x00a0:
            if (r6 == r13) goto L_0x00aa
            if (r6 == r5) goto L_0x00aa
            if (r6 == r11) goto L_0x00aa
            r13 = 23
            if (r6 != r13) goto L_0x00ad
        L_0x00aa:
            r12.mo6269j(r10)
        L_0x00ad:
            r12.mo6269j(r8)
        L_0x00b0:
            switch(r7) {
                case 17: goto L_0x00b4;
                case 18: goto L_0x00b3;
                case 19: goto L_0x00b4;
                case 20: goto L_0x00b4;
                case 21: goto L_0x00b4;
                case 22: goto L_0x00b4;
                case 23: goto L_0x00b4;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            goto L_0x00dc
        L_0x00b4:
            int r12 = r12.mo6262c(r9)
            if (r12 == r9) goto L_0x00bd
            if (r12 == r10) goto L_0x00be
            goto L_0x00dc
        L_0x00bd:
            r10 = r12
        L_0x00be:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r13 = 33
            r12.<init>(r13)
            java.lang.String r13 = "Unsupported epConfig: "
            r12.append(r13)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            com.google.android.gms.internal.ads.dz r12 = com.google.android.gms.internal.ads.C1646dz.m8225c(r12)
            throw r12
        L_0x00d6:
            java.lang.UnsupportedOperationException r12 = new java.lang.UnsupportedOperationException
            r12.<init>()
            throw r12
        L_0x00dc:
            int[] r12 = f13122b
            r12 = r12[r3]
            r13 = -1
            r0 = 0
            if (r12 == r13) goto L_0x00ea
            com.google.android.gms.internal.ads.pb4 r13 = new com.google.android.gms.internal.ads.pb4
            r13.<init>(r1, r12, r4, r0)
            return r13
        L_0x00ea:
            com.google.android.gms.internal.ads.dz r12 = com.google.android.gms.internal.ads.C1646dz.m8223a(r0, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qb4.m15555b(com.google.android.gms.internal.ads.cq2, boolean):com.google.android.gms.internal.ads.pb4");
    }

    /* renamed from: c */
    private static int m15556c(cq2 cq2) {
        int c = cq2.mo6262c(5);
        return c == 31 ? cq2.mo6262c(6) + 32 : c;
    }

    /* renamed from: d */
    private static int m15557d(cq2 cq2) {
        int c = cq2.mo6262c(4);
        if (c == 15) {
            return cq2.mo6262c(24);
        }
        if (c < 13) {
            return f13121a[c];
        }
        throw C1646dz.m8223a((String) null, (Throwable) null);
    }
}
