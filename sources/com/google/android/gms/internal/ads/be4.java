package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class be4 implements oc4 {

    /* renamed from: n */
    public static final vc4 f4877n = zd4.f18168b;

    /* renamed from: o */
    private static final int[] f4878o = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: p */
    private static final int[] f4879p;

    /* renamed from: q */
    private static final byte[] f4880q = n13.m13650w("#!AMR\n");

    /* renamed from: r */
    private static final byte[] f4881r = n13.m13650w("#!AMR-WB\n");

    /* renamed from: s */
    private static final int f4882s;

    /* renamed from: a */
    private final byte[] f4883a = new byte[1];

    /* renamed from: b */
    private boolean f4884b;

    /* renamed from: c */
    private long f4885c;

    /* renamed from: d */
    private int f4886d;

    /* renamed from: e */
    private int f4887e;

    /* renamed from: f */
    private boolean f4888f;

    /* renamed from: g */
    private int f4889g = -1;

    /* renamed from: h */
    private int f4890h;

    /* renamed from: i */
    private long f4891i;

    /* renamed from: j */
    private rc4 f4892j;

    /* renamed from: k */
    private td4 f4893k;

    /* renamed from: l */
    private pd4 f4894l;

    /* renamed from: m */
    private boolean f4895m;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f4879p = iArr;
        f4882s = iArr[8];
    }

    public be4(int i) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039 A[Catch:{ EOFException -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e A[Catch:{ EOFException -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput"})
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m6826a(com.google.android.gms.internal.ads.pc4 r12) {
        /*
            r11 = this;
            int r0 = r11.f4887e
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0099
            r12.mo6914i()     // Catch:{ EOFException -> 0x0098 }
            byte[] r0 = r11.f4883a     // Catch:{ EOFException -> 0x0098 }
            r4 = r12
            com.google.android.gms.internal.ads.jc4 r4 = (com.google.android.gms.internal.ads.jc4) r4     // Catch:{ EOFException -> 0x0098 }
            r4.mo6917n(r0, r3, r2, r3)     // Catch:{ EOFException -> 0x0098 }
            byte[] r0 = r11.f4883a     // Catch:{ EOFException -> 0x0098 }
            byte r0 = r0[r3]     // Catch:{ EOFException -> 0x0098 }
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L_0x0080
            int r0 = r0 >> 3
            r0 = r0 & 15
            boolean r4 = r11.f4884b     // Catch:{ EOFException -> 0x0098 }
            if (r4 == 0) goto L_0x002c
            r6 = 10
            if (r0 < r6) goto L_0x0037
            r6 = 13
            if (r0 <= r6) goto L_0x002c
            goto L_0x0037
        L_0x002c:
            if (r4 != 0) goto L_0x0055
            r6 = 12
            if (r0 < r6) goto L_0x0037
            r6 = 14
            if (r0 > r6) goto L_0x0037
            goto L_0x0055
        L_0x0037:
            if (r4 == 0) goto L_0x003e
            int[] r4 = f4879p     // Catch:{ EOFException -> 0x0098 }
            r0 = r4[r0]     // Catch:{ EOFException -> 0x0098 }
            goto L_0x0042
        L_0x003e:
            int[] r4 = f4878o     // Catch:{ EOFException -> 0x0098 }
            r0 = r4[r0]     // Catch:{ EOFException -> 0x0098 }
        L_0x0042:
            r11.f4886d = r0     // Catch:{ EOFException -> 0x0098 }
            r11.f4887e = r0
            int r4 = r11.f4889g
            if (r4 != r1) goto L_0x004d
            r11.f4889g = r0
            r4 = r0
        L_0x004d:
            if (r4 != r0) goto L_0x0099
            int r4 = r11.f4890h
            int r4 = r4 + r2
            r11.f4890h = r4
            goto L_0x0099
        L_0x0055:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r4) goto L_0x005c
            r12 = r3
        L_0x005c:
            int r2 = r12.length()     // Catch:{ EOFException -> 0x0098 }
            int r2 = r2 + 35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0098 }
            r3.<init>(r2)     // Catch:{ EOFException -> 0x0098 }
            java.lang.String r2 = "Illegal AMR "
            r3.append(r2)     // Catch:{ EOFException -> 0x0098 }
            r3.append(r12)     // Catch:{ EOFException -> 0x0098 }
            java.lang.String r12 = " frame type "
            r3.append(r12)     // Catch:{ EOFException -> 0x0098 }
            r3.append(r0)     // Catch:{ EOFException -> 0x0098 }
            java.lang.String r12 = r3.toString()     // Catch:{ EOFException -> 0x0098 }
            com.google.android.gms.internal.ads.dz r12 = com.google.android.gms.internal.ads.C1646dz.m8223a(r12, r5)     // Catch:{ EOFException -> 0x0098 }
            throw r12     // Catch:{ EOFException -> 0x0098 }
        L_0x0080:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0098 }
            r2 = 42
            r12.<init>(r2)     // Catch:{ EOFException -> 0x0098 }
            java.lang.String r2 = "Invalid padding bits for frame header "
            r12.append(r2)     // Catch:{ EOFException -> 0x0098 }
            r12.append(r0)     // Catch:{ EOFException -> 0x0098 }
            java.lang.String r12 = r12.toString()     // Catch:{ EOFException -> 0x0098 }
            com.google.android.gms.internal.ads.dz r12 = com.google.android.gms.internal.ads.C1646dz.m8223a(r12, r5)     // Catch:{ EOFException -> 0x0098 }
            throw r12     // Catch:{ EOFException -> 0x0098 }
        L_0x0098:
            return r1
        L_0x0099:
            com.google.android.gms.internal.ads.td4 r4 = r11.f4893k
            int r12 = com.google.android.gms.internal.ads.rd4.m16161a(r4, r12, r0, r2)
            if (r12 != r1) goto L_0x00a2
            return r1
        L_0x00a2:
            int r0 = r11.f4887e
            int r0 = r0 - r12
            r11.f4887e = r0
            if (r0 <= 0) goto L_0x00aa
            return r3
        L_0x00aa:
            com.google.android.gms.internal.ads.td4 r4 = r11.f4893k
            long r5 = r11.f4885c
            r7 = 1
            int r8 = r11.f4886d
            r9 = 0
            r10 = 0
            r4.mo7872a(r5, r7, r8, r9, r10)
            long r0 = r11.f4885c
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.f4885c = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.be4.m6826a(com.google.android.gms.internal.ads.pc4):int");
    }

    /* renamed from: b */
    private static boolean m6827b(pc4 pc4, byte[] bArr) {
        pc4.mo6914i();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((jc4) pc4).mo6917n(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: d */
    private final boolean m6828d(pc4 pc4) {
        int length;
        byte[] bArr = f4880q;
        if (m6827b(pc4, bArr)) {
            this.f4884b = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = f4881r;
            if (!m6827b(pc4, bArr2)) {
                return false;
            }
            this.f4884b = true;
            length = bArr2.length;
        }
        ((jc4) pc4).mo8447p(length, false);
        return true;
    }

    /* renamed from: c */
    public final boolean mo5040c(pc4 pc4) {
        return m6828d(pc4);
    }

    /* renamed from: e */
    public final int mo5042e(pc4 pc4, md4 md4) {
        wu1.m19203b(this.f4893k);
        int i = n13.f11236a;
        if (pc4.mo6908b() != 0 || m6828d(pc4)) {
            if (!this.f4895m) {
                this.f4895m = true;
                boolean z = this.f4884b;
                String str = true != z ? "audio/3gpp" : "audio/amr-wb";
                int i2 = true != z ? 8000 : 16000;
                td4 td4 = this.f4893k;
                bf4 bf4 = new bf4();
                bf4.mo5842s(str);
                bf4.mo5835l(f4882s);
                bf4.mo5825e0(1);
                bf4.mo5843t(i2);
                td4.mo7873b(bf4.mo5848y());
            }
            int a = m6826a(pc4);
            if (this.f4888f) {
                return a;
            }
            od4 od4 = new od4(-9223372036854775807L, 0);
            this.f4894l = od4;
            this.f4892j.mo10269p(od4);
            this.f4888f = true;
            return a;
        }
        throw C1646dz.m8223a("Could not find AMR header.", (Throwable) null);
    }

    /* renamed from: g */
    public final void mo5044g(rc4 rc4) {
        this.f4892j = rc4;
        this.f4893k = rc4.mo10270r(0, 1);
        rc4.mo10268G();
    }

    /* renamed from: h */
    public final void mo5045h(long j, long j2) {
        this.f4885c = 0;
        this.f4886d = 0;
        this.f4887e = 0;
        this.f4891i = 0;
    }
}
