package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.s4 */
public final class C2171s4 implements oc4 {

    /* renamed from: f */
    public static final vc4 f14249f = C2023o4.f11874b;

    /* renamed from: a */
    private rc4 f14250a;

    /* renamed from: b */
    private td4 f14251b;

    /* renamed from: c */
    private C2097q4 f14252c;

    /* renamed from: d */
    private int f14253d = -1;

    /* renamed from: e */
    private long f14254e = -1;

    /* renamed from: c */
    public final boolean mo5040c(pc4 pc4) {
        return C2282v4.m18329a(pc4) != null;
    }

    /* JADX WARNING: type inference failed for: r15v34, types: [com.google.android.gms.internal.ads.p4] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r15 != 65534) goto L_0x0054;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo5042e(com.google.android.gms.internal.ads.pc4 r14, com.google.android.gms.internal.ads.md4 r15) {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.td4 r15 = r13.f14251b
            com.google.android.gms.internal.ads.wu1.m19203b(r15)
            int r15 = com.google.android.gms.internal.ads.n13.f11236a
            com.google.android.gms.internal.ads.q4 r15 = r13.f14252c
            r0 = 1
            r1 = 0
            if (r15 != 0) goto L_0x0092
            com.google.android.gms.internal.ads.t4 r5 = com.google.android.gms.internal.ads.C2282v4.m18329a(r14)
            if (r5 == 0) goto L_0x008a
            int r15 = r5.f14696a
            r2 = 17
            if (r15 != r2) goto L_0x0026
            com.google.android.gms.internal.ads.p4 r15 = new com.google.android.gms.internal.ads.p4
            com.google.android.gms.internal.ads.rc4 r2 = r13.f14250a
            com.google.android.gms.internal.ads.td4 r3 = r13.f14251b
            r15.<init>(r2, r3, r5)
        L_0x0022:
            r13.f14252c = r15
            goto L_0x0092
        L_0x0026:
            r2 = 6
            if (r15 != r2) goto L_0x0037
            com.google.android.gms.internal.ads.r4 r15 = new com.google.android.gms.internal.ads.r4
            com.google.android.gms.internal.ads.rc4 r3 = r13.f14250a
            com.google.android.gms.internal.ads.td4 r4 = r13.f14251b
            r7 = -1
            java.lang.String r6 = "audio/g711-alaw"
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0022
        L_0x0037:
            r2 = 7
            if (r15 != r2) goto L_0x0048
            com.google.android.gms.internal.ads.r4 r15 = new com.google.android.gms.internal.ads.r4
            com.google.android.gms.internal.ads.rc4 r3 = r13.f14250a
            com.google.android.gms.internal.ads.td4 r4 = r13.f14251b
            r7 = -1
            java.lang.String r6 = "audio/g711-mlaw"
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0022
        L_0x0048:
            int r2 = r5.f14700e
            if (r15 == r0) goto L_0x005c
            r3 = 3
            if (r15 == r3) goto L_0x0056
            r3 = 65534(0xfffe, float:9.1833E-41)
            if (r15 == r3) goto L_0x005c
        L_0x0054:
            r7 = r1
            goto L_0x0061
        L_0x0056:
            r15 = 32
            if (r2 != r15) goto L_0x0054
            r15 = 4
            goto L_0x0060
        L_0x005c:
            int r15 = com.google.android.gms.internal.ads.n13.m13613R(r2)
        L_0x0060:
            r7 = r15
        L_0x0061:
            if (r7 == 0) goto L_0x0070
            com.google.android.gms.internal.ads.r4 r15 = new com.google.android.gms.internal.ads.r4
            com.google.android.gms.internal.ads.rc4 r3 = r13.f14250a
            com.google.android.gms.internal.ads.td4 r4 = r13.f14251b
            java.lang.String r6 = "audio/raw"
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0022
        L_0x0070:
            int r14 = r5.f14696a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r0 = 40
            r15.<init>(r0)
            java.lang.String r0 = "Unsupported WAV format type: "
            r15.append(r0)
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            com.google.android.gms.internal.ads.dz r14 = com.google.android.gms.internal.ads.C1646dz.m8225c(r14)
            throw r14
        L_0x008a:
            r14 = 0
            java.lang.String r15 = "Unsupported or unrecognized wav header."
            com.google.android.gms.internal.ads.dz r14 = com.google.android.gms.internal.ads.C1646dz.m8223a(r15, r14)
            throw r14
        L_0x0092:
            int r15 = r13.f14253d
            r2 = -1
            r4 = -1
            if (r15 != r4) goto L_0x0162
            r14.mo6914i()
            com.google.android.gms.internal.ads.dr2 r15 = new com.google.android.gms.internal.ads.dr2
            r5 = 8
            r15.<init>((int) r5)
        L_0x00a3:
            com.google.android.gms.internal.ads.u4 r6 = com.google.android.gms.internal.ads.C2245u4.m17709a(r14, r15)
            int r7 = r6.f15391a
            r8 = 1684108385(0x64617461, float:1.6635614E22)
            java.lang.String r9 = "WavHeaderReader"
            if (r7 == r8) goto L_0x0102
            r8 = 1380533830(0x52494646, float:2.16116855E11)
            if (r7 == r8) goto L_0x00d0
            r10 = 1718449184(0x666d7420, float:2.8033575E23)
            if (r7 == r10) goto L_0x00d0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r11 = 39
            r10.<init>(r11)
            java.lang.String r11 = "Ignoring unknown WAV chunk: "
            r10.append(r11)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            android.util.Log.w(r9, r7)
        L_0x00d0:
            long r9 = r6.f15392b
            r11 = 8
            long r9 = r9 + r11
            int r6 = r6.f15391a
            if (r6 != r8) goto L_0x00db
            r9 = 12
        L_0x00db:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x00ea
            r6 = r14
            com.google.android.gms.internal.ads.jc4 r6 = (com.google.android.gms.internal.ads.jc4) r6
            int r7 = (int) r9
            r6.mo8447p(r7, r1)
            goto L_0x00a3
        L_0x00ea:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r15 = 51
            r14.<init>(r15)
            java.lang.String r15 = "Chunk is too large (~2GB+) to skip; id: "
            r14.append(r15)
            r14.append(r6)
            java.lang.String r14 = r14.toString()
            com.google.android.gms.internal.ads.dz r14 = com.google.android.gms.internal.ads.C1646dz.m8225c(r14)
            throw r14
        L_0x0102:
            r15 = r14
            com.google.android.gms.internal.ads.jc4 r15 = (com.google.android.gms.internal.ads.jc4) r15
            r15.mo8447p(r5, r1)
            long r7 = r14.mo6908b()
            long r5 = r6.f15392b
            long r5 = r5 + r7
            long r10 = r14.mo6909c()
            int r15 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r15 == 0) goto L_0x013a
            int r15 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r15 <= 0) goto L_0x013a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r12 = 69
            r15.<init>(r12)
            java.lang.String r12 = "Data exceeds input length: "
            r15.append(r12)
            r15.append(r5)
            java.lang.String r5 = ", "
            r15.append(r5)
            r15.append(r10)
            java.lang.String r15 = r15.toString()
            android.util.Log.w(r9, r15)
            r5 = r10
        L_0x013a:
            java.lang.Long r15 = java.lang.Long.valueOf(r7)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            android.util.Pair r15 = android.util.Pair.create(r15, r5)
            java.lang.Object r5 = r15.first
            java.lang.Long r5 = (java.lang.Long) r5
            int r5 = r5.intValue()
            r13.f14253d = r5
            java.lang.Object r15 = r15.second
            java.lang.Long r15 = (java.lang.Long) r15
            long r5 = r15.longValue()
            r13.f14254e = r5
            com.google.android.gms.internal.ads.q4 r15 = r13.f14252c
            int r7 = r13.f14253d
            r15.mo9960b(r7, r5)
            goto L_0x0174
        L_0x0162:
            long r5 = r14.mo6908b()
            r7 = 0
            int r15 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r15 != 0) goto L_0x0174
            int r15 = r13.f14253d
            r5 = r14
            com.google.android.gms.internal.ads.jc4 r5 = (com.google.android.gms.internal.ads.jc4) r5
            r5.mo8447p(r15, r1)
        L_0x0174:
            long r5 = r13.f14254e
            int r15 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r15 == 0) goto L_0x017b
            goto L_0x017c
        L_0x017b:
            r0 = r1
        L_0x017c:
            com.google.android.gms.internal.ads.wu1.m19207f(r0)
            long r2 = r13.f14254e
            long r5 = r14.mo6908b()
            com.google.android.gms.internal.ads.q4 r15 = r13.f14252c
            long r2 = r2 - r5
            boolean r14 = r15.mo9961c(r14, r2)
            if (r14 == 0) goto L_0x018f
            return r4
        L_0x018f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2171s4.mo5042e(com.google.android.gms.internal.ads.pc4, com.google.android.gms.internal.ads.md4):int");
    }

    /* renamed from: g */
    public final void mo5044g(rc4 rc4) {
        this.f14250a = rc4;
        this.f14251b = rc4.mo10270r(0, 1);
        rc4.mo10268G();
    }

    /* renamed from: h */
    public final void mo5045h(long j, long j2) {
        C2097q4 q4Var = this.f14252c;
        if (q4Var != null) {
            q4Var.mo9959a(j2);
        }
    }
}
