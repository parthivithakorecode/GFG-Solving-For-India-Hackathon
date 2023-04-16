package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* renamed from: com.google.android.gms.internal.ads.v3 */
public final class C2281v3 implements oc4 {

    /* renamed from: l */
    public static final vc4 f15884l = C2207t3.f14690b;

    /* renamed from: a */
    private final ky2 f15885a = new ky2(0);

    /* renamed from: b */
    private final SparseArray<C2244u3> f15886b = new SparseArray<>();

    /* renamed from: c */
    private final dr2 f15887c = new dr2(4096);

    /* renamed from: d */
    private final C2170s3 f15888d = new C2170s3();

    /* renamed from: e */
    private boolean f15889e;

    /* renamed from: f */
    private boolean f15890f;

    /* renamed from: g */
    private boolean f15891g;

    /* renamed from: h */
    private long f15892h;

    /* renamed from: i */
    private C2133r3 f15893i;

    /* renamed from: j */
    private rc4 f15894j;

    /* renamed from: k */
    private boolean f15895k;

    /* renamed from: c */
    public final boolean mo5040c(pc4 pc4) {
        byte[] bArr = new byte[14];
        jc4 jc4 = (jc4) pc4;
        jc4.mo6917n(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        jc4.mo8446o(bArr[13] & 7, false);
        jc4.mo6917n(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x013e  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo5042e(com.google.android.gms.internal.ads.pc4 r14, com.google.android.gms.internal.ads.md4 r15) {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.rc4 r0 = r13.f15894j
            com.google.android.gms.internal.ads.wu1.m19203b(r0)
            long r7 = r14.mo6909c()
            r9 = -1
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.s3 r1 = r13.f15888d
            boolean r1 = r1.mo10715e()
            if (r1 == 0) goto L_0x0018
            goto L_0x001f
        L_0x0018:
            com.google.android.gms.internal.ads.s3 r0 = r13.f15888d
            int r14 = r0.mo10712a(r14, r15)
            return r14
        L_0x001f:
            boolean r1 = r13.f15895k
            r11 = 1
            if (r1 != 0) goto L_0x0063
            r13.f15895k = r11
            com.google.android.gms.internal.ads.s3 r1 = r13.f15888d
            long r1 = r1.mo10713b()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0051
            com.google.android.gms.internal.ads.r3 r12 = new com.google.android.gms.internal.ads.r3
            com.google.android.gms.internal.ads.s3 r1 = r13.f15888d
            com.google.android.gms.internal.ads.ky2 r2 = r1.mo10714d()
            com.google.android.gms.internal.ads.s3 r1 = r13.f15888d
            long r3 = r1.mo10713b()
            r1 = r12
            r5 = r7
            r1.<init>(r2, r3, r5)
            r13.f15893i = r12
            com.google.android.gms.internal.ads.rc4 r1 = r13.f15894j
            com.google.android.gms.internal.ads.pd4 r2 = r12.mo7296b()
            goto L_0x0060
        L_0x0051:
            com.google.android.gms.internal.ads.rc4 r1 = r13.f15894j
            com.google.android.gms.internal.ads.od4 r2 = new com.google.android.gms.internal.ads.od4
            com.google.android.gms.internal.ads.s3 r3 = r13.f15888d
            long r3 = r3.mo10713b()
            r5 = 0
            r2.<init>(r3, r5)
        L_0x0060:
            r1.mo10269p(r2)
        L_0x0063:
            com.google.android.gms.internal.ads.r3 r1 = r13.f15893i
            if (r1 == 0) goto L_0x0075
            boolean r1 = r1.mo7299e()
            if (r1 != 0) goto L_0x006e
            goto L_0x0075
        L_0x006e:
            com.google.android.gms.internal.ads.r3 r0 = r13.f15893i
            int r14 = r0.mo7295a(r14, r15)
            return r14
        L_0x0075:
            r14.mo6914i()
            if (r0 == 0) goto L_0x0080
            long r0 = r14.mo6913g()
            long r7 = r7 - r0
            goto L_0x0081
        L_0x0080:
            r7 = r9
        L_0x0081:
            int r15 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r0 = -1
            if (r15 == 0) goto L_0x008e
            r1 = 4
            int r15 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r15 < 0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            return r0
        L_0x008e:
            com.google.android.gms.internal.ads.dr2 r15 = r13.f15887c
            byte[] r15 = r15.mo6582h()
            r1 = 4
            r2 = 0
            boolean r15 = r14.mo6917n(r15, r2, r1, r11)
            if (r15 != 0) goto L_0x009d
            return r0
        L_0x009d:
            com.google.android.gms.internal.ads.dr2 r15 = r13.f15887c
            r15.mo6580f(r2)
            com.google.android.gms.internal.ads.dr2 r15 = r13.f15887c
            int r15 = r15.mo6587m()
            r1 = 441(0x1b9, float:6.18E-43)
            if (r15 != r1) goto L_0x00ad
            return r0
        L_0x00ad:
            r0 = 442(0x1ba, float:6.2E-43)
            if (r15 != r0) goto L_0x00d3
            com.google.android.gms.internal.ads.dr2 r15 = r13.f15887c
            byte[] r15 = r15.mo6582h()
            com.google.android.gms.internal.ads.jc4 r14 = (com.google.android.gms.internal.ads.jc4) r14
            r0 = 10
            r14.mo6917n(r15, r2, r0, r2)
            com.google.android.gms.internal.ads.dr2 r15 = r13.f15887c
            r0 = 9
            r15.mo6580f(r0)
            com.google.android.gms.internal.ads.dr2 r15 = r13.f15887c
            int r15 = r15.mo6593s()
            r15 = r15 & 7
            int r15 = r15 + 14
            r14.mo8447p(r15, r2)
            return r2
        L_0x00d3:
            r0 = 443(0x1bb, float:6.21E-43)
            r1 = 2
            r3 = 6
            if (r15 != r0) goto L_0x00f4
            com.google.android.gms.internal.ads.dr2 r15 = r13.f15887c
            byte[] r15 = r15.mo6582h()
            com.google.android.gms.internal.ads.jc4 r14 = (com.google.android.gms.internal.ads.jc4) r14
            r14.mo6917n(r15, r2, r1, r2)
            com.google.android.gms.internal.ads.dr2 r15 = r13.f15887c
            r15.mo6580f(r2)
            com.google.android.gms.internal.ads.dr2 r15 = r13.f15887c
            int r15 = r15.mo6597w()
            int r15 = r15 + r3
            r14.mo8447p(r15, r2)
            return r2
        L_0x00f4:
            int r0 = r15 >> 8
            if (r0 == r11) goto L_0x00fe
            com.google.android.gms.internal.ads.jc4 r14 = (com.google.android.gms.internal.ads.jc4) r14
            r14.mo8447p(r11, r2)
            return r2
        L_0x00fe:
            r15 = r15 & 255(0xff, float:3.57E-43)
            android.util.SparseArray<com.google.android.gms.internal.ads.u3> r0 = r13.f15886b
            java.lang.Object r0 = r0.get(r15)
            com.google.android.gms.internal.ads.u3 r0 = (com.google.android.gms.internal.ads.C2244u3) r0
            boolean r4 = r13.f15889e
            if (r4 != 0) goto L_0x0177
            if (r0 != 0) goto L_0x0158
            r4 = 189(0xbd, float:2.65E-43)
            r5 = 0
            if (r15 != r4) goto L_0x0122
            com.google.android.gms.internal.ads.m2 r4 = new com.google.android.gms.internal.ads.m2
            r4.<init>(r5)
        L_0x0118:
            r13.f15890f = r11
        L_0x011a:
            long r5 = r14.mo6908b()
            r13.f15892h = r5
            r5 = r4
            goto L_0x013c
        L_0x0122:
            r4 = r15 & 224(0xe0, float:3.14E-43)
            r6 = 192(0xc0, float:2.69E-43)
            if (r4 != r6) goto L_0x012e
            com.google.android.gms.internal.ads.l3 r4 = new com.google.android.gms.internal.ads.l3
            r4.<init>(r5)
            goto L_0x0118
        L_0x012e:
            r4 = r15 & 240(0xf0, float:3.36E-43)
            r6 = 224(0xe0, float:3.14E-43)
            if (r4 != r6) goto L_0x013c
            com.google.android.gms.internal.ads.y2 r4 = new com.google.android.gms.internal.ads.y2
            r4.<init>(r5)
            r13.f15891g = r11
            goto L_0x011a
        L_0x013c:
            if (r5 == 0) goto L_0x0158
            com.google.android.gms.internal.ads.k4 r0 = new com.google.android.gms.internal.ads.k4
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 256(0x100, float:3.59E-43)
            r0.<init>(r4, r15, r6)
            com.google.android.gms.internal.ads.rc4 r4 = r13.f15894j
            r5.mo5641d(r4, r0)
            com.google.android.gms.internal.ads.u3 r0 = new com.google.android.gms.internal.ads.u3
            com.google.android.gms.internal.ads.ky2 r4 = r13.f15885a
            r0.<init>(r5, r4)
            android.util.SparseArray<com.google.android.gms.internal.ads.u3> r4 = r13.f15886b
            r4.put(r15, r0)
        L_0x0158:
            boolean r15 = r13.f15890f
            r4 = 1048576(0x100000, double:5.180654E-318)
            if (r15 == 0) goto L_0x0168
            boolean r15 = r13.f15891g
            if (r15 == 0) goto L_0x0168
            long r4 = r13.f15892h
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4 + r6
        L_0x0168:
            long r6 = r14.mo6908b()
            int r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r15 <= 0) goto L_0x0177
            r13.f15889e = r11
            com.google.android.gms.internal.ads.rc4 r15 = r13.f15894j
            r15.mo10268G()
        L_0x0177:
            com.google.android.gms.internal.ads.dr2 r15 = r13.f15887c
            byte[] r15 = r15.mo6582h()
            com.google.android.gms.internal.ads.jc4 r14 = (com.google.android.gms.internal.ads.jc4) r14
            r14.mo6917n(r15, r2, r1, r2)
            com.google.android.gms.internal.ads.dr2 r15 = r13.f15887c
            r15.mo6580f(r2)
            com.google.android.gms.internal.ads.dr2 r15 = r13.f15887c
            int r15 = r15.mo6597w()
            int r15 = r15 + r3
            if (r0 != 0) goto L_0x0194
            r14.mo8447p(r15, r2)
            goto L_0x01b5
        L_0x0194:
            com.google.android.gms.internal.ads.dr2 r1 = r13.f15887c
            r1.mo6577c(r15)
            com.google.android.gms.internal.ads.dr2 r1 = r13.f15887c
            byte[] r1 = r1.mo6582h()
            r14.mo6916m(r1, r2, r15, r2)
            com.google.android.gms.internal.ads.dr2 r14 = r13.f15887c
            r14.mo6580f(r3)
            com.google.android.gms.internal.ads.dr2 r14 = r13.f15887c
            r0.mo11152a(r14)
            com.google.android.gms.internal.ads.dr2 r14 = r13.f15887c
            int r15 = r14.mo6584j()
            r14.mo6579e(r15)
        L_0x01b5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2281v3.mo5042e(com.google.android.gms.internal.ads.pc4, com.google.android.gms.internal.ads.md4):int");
    }

    /* renamed from: g */
    public final void mo5044g(rc4 rc4) {
        this.f15894j = rc4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r3 != r5) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038 A[LOOP:0: B:12:0x0030->B:14:0x0038, LOOP_END] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5045h(long r3, long r5) {
        /*
            r2 = this;
            com.google.android.gms.internal.ads.ky2 r3 = r2.f15885a
            long r3 = r3.mo8820e()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.ads.ky2 r3 = r2.f15885a
            long r3 = r3.mo8818c()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0028
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0028
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0028
        L_0x0023:
            com.google.android.gms.internal.ads.ky2 r3 = r2.f15885a
            r3.mo8821f(r5)
        L_0x0028:
            com.google.android.gms.internal.ads.r3 r3 = r2.f15893i
            r4 = 0
            if (r3 == 0) goto L_0x0030
            r3.mo7298d(r5)
        L_0x0030:
            android.util.SparseArray<com.google.android.gms.internal.ads.u3> r3 = r2.f15886b
            int r3 = r3.size()
            if (r4 >= r3) goto L_0x0046
            android.util.SparseArray<com.google.android.gms.internal.ads.u3> r3 = r2.f15886b
            java.lang.Object r3 = r3.valueAt(r4)
            com.google.android.gms.internal.ads.u3 r3 = (com.google.android.gms.internal.ads.C2244u3) r3
            r3.mo11153b()
            int r4 = r4 + 1
            goto L_0x0030
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2281v3.mo5045h(long, long):void");
    }
}
