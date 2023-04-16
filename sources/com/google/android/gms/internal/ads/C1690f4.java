package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.f4 */
public final class C1690f4 implements oc4 {

    /* renamed from: q */
    public static final vc4 f6685q = C1578c4.f5292b;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<ky2> f6686a;

    /* renamed from: b */
    private final dr2 f6687b;

    /* renamed from: c */
    private final SparseIntArray f6688c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1838j4 f6689d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final SparseArray<C1912l4> f6690e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final SparseBooleanArray f6691f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final SparseBooleanArray f6692g;

    /* renamed from: h */
    private final C1541b4 f6693h;

    /* renamed from: i */
    private C1504a4 f6694i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public rc4 f6695j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f6696k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f6697l;

    /* renamed from: m */
    private boolean f6698m;

    /* renamed from: n */
    private boolean f6699n;

    /* renamed from: o */
    private int f6700o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f6701p;

    public C1690f4(int i) {
        this(1, 0, 112800);
    }

    public C1690f4(int i, int i2, int i3) {
        ky2 ky2 = new ky2(0);
        this.f6689d = new C2206t2(0);
        this.f6686a = Collections.singletonList(ky2);
        this.f6687b = new dr2(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f6691f = sparseBooleanArray;
        this.f6692g = new SparseBooleanArray();
        SparseArray<C1912l4> sparseArray = new SparseArray<>();
        this.f6690e = sparseArray;
        this.f6688c = new SparseIntArray();
        this.f6693h = new C1541b4(112800);
        this.f6695j = rc4.f13589d;
        this.f6701p = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f6690e.put(sparseArray2.keyAt(i4), (C1912l4) sparseArray2.valueAt(i4));
        }
        this.f6690e.put(0, new C2356x3(new C1615d4(this)));
    }

    /* renamed from: c */
    public final boolean mo5040c(pc4 pc4) {
        byte[] h = this.f6687b.mo6582h();
        jc4 jc4 = (jc4) pc4;
        jc4.mo6917n(h, 0, 940, false);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 < 5) {
                if (h[(i2 * 188) + i] != 71) {
                    i++;
                } else {
                    i2++;
                }
            }
            jc4.mo8447p(i, false);
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a1, code lost:
        if (r2 == false) goto L_0x01a3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo5042e(com.google.android.gms.internal.ads.pc4 r19, com.google.android.gms.internal.ads.md4 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            long r11 = r19.mo6909c()
            boolean r3 = r0.f6697l
            r13 = -1
            r15 = 1
            r10 = 0
            if (r3 == 0) goto L_0x00a5
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x0028
            com.google.android.gms.internal.ads.b4 r3 = r0.f6693h
            boolean r3 = r3.mo5667d()
            if (r3 == 0) goto L_0x001f
            goto L_0x0028
        L_0x001f:
            com.google.android.gms.internal.ads.b4 r3 = r0.f6693h
            int r4 = r0.f6701p
            int r1 = r3.mo5664a(r1, r2, r4)
            return r1
        L_0x0028:
            boolean r3 = r0.f6698m
            r7 = 0
            if (r3 != 0) goto L_0x007a
            r0.f6698m = r15
            com.google.android.gms.internal.ads.b4 r3 = r0.f6693h
            long r3 = r3.mo5665b()
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0068
            com.google.android.gms.internal.ads.a4 r9 = new com.google.android.gms.internal.ads.a4
            com.google.android.gms.internal.ads.b4 r3 = r0.f6693h
            com.google.android.gms.internal.ads.ky2 r4 = r3.mo5666c()
            com.google.android.gms.internal.ads.b4 r3 = r0.f6693h
            long r5 = r3.mo5665b()
            int r3 = r0.f6701p
            r16 = 112800(0x1b8a0, float:1.58066E-40)
            r17 = r3
            r3 = r9
            r13 = r7
            r7 = r11
            r15 = r9
            r9 = r17
            r10 = r16
            r3.<init>(r4, r5, r7, r9, r10)
            r0.f6694i = r15
            com.google.android.gms.internal.ads.rc4 r3 = r0.f6695j
            com.google.android.gms.internal.ads.pd4 r4 = r15.mo7296b()
            goto L_0x0076
        L_0x0068:
            r13 = r7
            com.google.android.gms.internal.ads.rc4 r3 = r0.f6695j
            com.google.android.gms.internal.ads.od4 r4 = new com.google.android.gms.internal.ads.od4
            com.google.android.gms.internal.ads.b4 r5 = r0.f6693h
            long r5 = r5.mo5665b()
            r4.<init>(r5, r13)
        L_0x0076:
            r3.mo10269p(r4)
            goto L_0x007b
        L_0x007a:
            r13 = r7
        L_0x007b:
            boolean r3 = r0.f6699n
            if (r3 == 0) goto L_0x0092
            r3 = 0
            r0.f6699n = r3
            r0.mo5045h(r13, r13)
            long r4 = r19.mo6908b()
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 != 0) goto L_0x008e
            goto L_0x0093
        L_0x008e:
            r2.f10817a = r13
            r1 = 1
            return r1
        L_0x0092:
            r3 = 0
        L_0x0093:
            com.google.android.gms.internal.ads.a4 r4 = r0.f6694i
            if (r4 == 0) goto L_0x00a6
            boolean r4 = r4.mo7299e()
            if (r4 != 0) goto L_0x009e
            goto L_0x00a6
        L_0x009e:
            com.google.android.gms.internal.ads.a4 r3 = r0.f6694i
            int r1 = r3.mo7295a(r1, r2)
            return r1
        L_0x00a5:
            r3 = r10
        L_0x00a6:
            com.google.android.gms.internal.ads.dr2 r2 = r0.f6687b
            byte[] r2 = r2.mo6582h()
            com.google.android.gms.internal.ads.dr2 r4 = r0.f6687b
            int r4 = r4.mo6585k()
            int r4 = 9400 - r4
            r5 = 188(0xbc, float:2.63E-43)
            if (r4 < r5) goto L_0x00b9
            goto L_0x00cf
        L_0x00b9:
            com.google.android.gms.internal.ads.dr2 r4 = r0.f6687b
            int r4 = r4.mo6583i()
            if (r4 <= 0) goto L_0x00ca
            com.google.android.gms.internal.ads.dr2 r6 = r0.f6687b
            int r6 = r6.mo6585k()
            java.lang.System.arraycopy(r2, r6, r2, r3, r4)
        L_0x00ca:
            com.google.android.gms.internal.ads.dr2 r6 = r0.f6687b
            r6.mo6578d(r2, r4)
        L_0x00cf:
            com.google.android.gms.internal.ads.dr2 r4 = r0.f6687b
            int r4 = r4.mo6583i()
            r6 = -1
            if (r4 >= r5) goto L_0x00ee
            com.google.android.gms.internal.ads.dr2 r4 = r0.f6687b
            int r4 = r4.mo6586l()
            int r7 = 9400 - r4
            int r7 = r1.mo5752a(r2, r4, r7)
            if (r7 != r6) goto L_0x00e7
            return r6
        L_0x00e7:
            com.google.android.gms.internal.ads.dr2 r6 = r0.f6687b
            int r4 = r4 + r7
            r6.mo6579e(r4)
            goto L_0x00cf
        L_0x00ee:
            com.google.android.gms.internal.ads.dr2 r1 = r0.f6687b
            int r1 = r1.mo6585k()
            com.google.android.gms.internal.ads.dr2 r2 = r0.f6687b
            int r2 = r2.mo6586l()
            com.google.android.gms.internal.ads.dr2 r4 = r0.f6687b
            byte[] r4 = r4.mo6582h()
            int r4 = com.google.android.gms.internal.ads.C1949m4.m13046a(r4, r1, r2)
            com.google.android.gms.internal.ads.dr2 r5 = r0.f6687b
            r5.mo6580f(r4)
            int r5 = r4 + 188
            if (r5 <= r2) goto L_0x0114
            int r2 = r0.f6700o
            int r4 = r4 - r1
            int r2 = r2 + r4
            r0.f6700o = r2
            goto L_0x0116
        L_0x0114:
            r0.f6700o = r3
        L_0x0116:
            com.google.android.gms.internal.ads.dr2 r1 = r0.f6687b
            int r1 = r1.mo6586l()
            if (r5 <= r1) goto L_0x011f
            return r3
        L_0x011f:
            com.google.android.gms.internal.ads.dr2 r2 = r0.f6687b
            int r2 = r2.mo6587m()
            r4 = 8388608(0x800000, float:1.17549435E-38)
            r4 = r4 & r2
            if (r4 == 0) goto L_0x0130
        L_0x012a:
            com.google.android.gms.internal.ads.dr2 r1 = r0.f6687b
            r1.mo6580f(r5)
            return r3
        L_0x0130:
            r4 = 4194304(0x400000, float:5.877472E-39)
            r4 = r4 & r2
            if (r4 == 0) goto L_0x0137
            r10 = 1
            goto L_0x0138
        L_0x0137:
            r10 = r3
        L_0x0138:
            int r4 = r2 >> 8
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r7 = r2 & 32
            r8 = r2 & 16
            if (r8 == 0) goto L_0x014b
            android.util.SparseArray<com.google.android.gms.internal.ads.l4> r8 = r0.f6690e
            java.lang.Object r8 = r8.get(r4)
            com.google.android.gms.internal.ads.l4 r8 = (com.google.android.gms.internal.ads.C1912l4) r8
            goto L_0x014c
        L_0x014b:
            r8 = 0
        L_0x014c:
            if (r8 != 0) goto L_0x014f
            goto L_0x012a
        L_0x014f:
            r2 = r2 & 15
            android.util.SparseIntArray r9 = r0.f6688c
            int r13 = r2 + -1
            int r9 = r9.get(r4, r13)
            android.util.SparseIntArray r13 = r0.f6688c
            r13.put(r4, r2)
            if (r9 != r2) goto L_0x0161
            goto L_0x012a
        L_0x0161:
            r13 = 1
            int r9 = r9 + r13
            r9 = r9 & 15
            if (r2 == r9) goto L_0x016a
            r8.mo8867c()
        L_0x016a:
            if (r7 == 0) goto L_0x0186
            com.google.android.gms.internal.ads.dr2 r2 = r0.f6687b
            int r2 = r2.mo6593s()
            com.google.android.gms.internal.ads.dr2 r7 = r0.f6687b
            int r7 = r7.mo6593s()
            r7 = r7 & 64
            if (r7 == 0) goto L_0x017e
            r7 = 2
            goto L_0x017f
        L_0x017e:
            r7 = r3
        L_0x017f:
            r10 = r10 | r7
            com.google.android.gms.internal.ads.dr2 r7 = r0.f6687b
            int r2 = r2 + r6
            r7.mo6581g(r2)
        L_0x0186:
            boolean r2 = r0.f6697l
            if (r2 != 0) goto L_0x0192
            android.util.SparseBooleanArray r6 = r0.f6692g
            boolean r4 = r6.get(r4, r3)
            if (r4 != 0) goto L_0x01a3
        L_0x0192:
            com.google.android.gms.internal.ads.dr2 r4 = r0.f6687b
            r4.mo6579e(r5)
            com.google.android.gms.internal.ads.dr2 r4 = r0.f6687b
            r8.mo8865a(r4, r10)
            com.google.android.gms.internal.ads.dr2 r4 = r0.f6687b
            r4.mo6579e(r1)
            if (r2 != 0) goto L_0x012a
        L_0x01a3:
            boolean r1 = r0.f6697l
            if (r1 == 0) goto L_0x012a
            r1 = -1
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x012a
            r1 = 1
            r0.f6699n = r1
            goto L_0x012a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1690f4.mo5042e(com.google.android.gms.internal.ads.pc4, com.google.android.gms.internal.ads.md4):int");
    }

    /* renamed from: g */
    public final void mo5044g(rc4 rc4) {
        this.f6695j = rc4;
    }

    /* renamed from: h */
    public final void mo5045h(long j, long j2) {
        C1504a4 a4Var;
        int size = this.f6686a.size();
        for (int i = 0; i < size; i++) {
            ky2 ky2 = this.f6686a.get(i);
            if (ky2.mo8820e() != -9223372036854775807L) {
                long c = ky2.mo8818c();
                if (c != -9223372036854775807L) {
                    if (c != 0) {
                        if (c == j2) {
                        }
                    }
                }
            }
            ky2.mo8821f(j2);
        }
        if (!(j2 == 0 || (a4Var = this.f6694i) == null)) {
            a4Var.mo7298d(j2);
        }
        this.f6687b.mo6577c(0);
        this.f6688c.clear();
        for (int i2 = 0; i2 < this.f6690e.size(); i2++) {
            this.f6690e.valueAt(i2).mo8867c();
        }
        this.f6700o = 0;
    }
}
