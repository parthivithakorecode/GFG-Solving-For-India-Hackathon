package com.google.android.gms.internal.ads;

public final class a44 extends Exception {

    /* renamed from: f */
    public final String f3931f;

    /* renamed from: g */
    public final boolean f3932g;

    /* renamed from: h */
    public final z34 f3933h;

    /* renamed from: i */
    public final String f3934i;

    /* renamed from: j */
    public final a44 f3935j;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a44(com.google.android.gms.internal.ads.C1574c0 r11, java.lang.Throwable r12, boolean r13, int r14) {
        /*
            r10 = this;
            java.lang.String r13 = java.lang.String.valueOf(r11)
            int r0 = r13.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 36
            r1.<init>(r0)
            java.lang.String r0 = "Decoder init failed: ["
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = "], "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r5 = r11.f5234l
            int r11 = java.lang.Math.abs(r14)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r14 = 75
            r13.<init>(r14)
            java.lang.String r14 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_"
            r13.append(r14)
            r13.append(r11)
            java.lang.String r3 = r1.toString()
            java.lang.String r8 = r13.toString()
            r6 = 0
            r7 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a44.<init>(com.google.android.gms.internal.ads.c0, java.lang.Throwable, boolean, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a44(com.google.android.gms.internal.ads.C1574c0 r9, java.lang.Throwable r10, boolean r11, com.google.android.gms.internal.ads.z34 r12) {
        /*
            r8 = this;
            java.lang.String r0 = r12.f18012a
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r4 = r1.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r3 = r3 + 23
            int r3 = r3 + r4
            r6.<init>(r3)
            java.lang.String r3 = "Decoder init failed: "
            r6.append(r3)
            r6.append(r0)
            java.lang.String r0 = ", "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.String r3 = r9.f5234l
            int r0 = com.google.android.gms.internal.ads.n13.f11236a
            r4 = 0
            r6 = 21
            if (r0 < r6) goto L_0x0044
            boolean r0 = r10 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto L_0x0044
            r0 = r10
            android.media.MediaCodec$CodecException r0 = (android.media.MediaCodec.CodecException) r0
            java.lang.String r0 = r0.getDiagnosticInfo()
            r6 = r0
            goto L_0x0045
        L_0x0044:
            r6 = r4
        L_0x0045:
            r4 = 0
            r7 = 0
            r0 = r8
            r2 = r10
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a44.<init>(com.google.android.gms.internal.ads.c0, java.lang.Throwable, boolean, com.google.android.gms.internal.ads.z34):void");
    }

    private a44(String str, Throwable th, String str2, boolean z, z34 z34, String str3, a44 a44) {
        super(str, th);
        this.f3931f = str2;
        this.f3932g = false;
        this.f3933h = z34;
        this.f3934i = str3;
        this.f3935j = a44;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ a44 m5824a(a44 a44, a44 a442) {
        return new a44(a44.getMessage(), a44.getCause(), a44.f3931f, false, a44.f3933h, a44.f3934i, a442);
    }
}
