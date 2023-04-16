package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;

/* renamed from: com.google.android.gms.internal.ads.e4 */
final class C1652e4 implements C2318w3 {

    /* renamed from: a */
    private final cq2 f6085a = new cq2(new byte[5], 5);

    /* renamed from: b */
    private final SparseArray<C1912l4> f6086b = new SparseArray<>();

    /* renamed from: c */
    private final SparseIntArray f6087c = new SparseIntArray();

    /* renamed from: d */
    private final int f6088d;

    /* renamed from: e */
    final /* synthetic */ C1690f4 f6089e;

    public C1652e4(C1690f4 f4Var, int i) {
        this.f6089e = f4Var;
        this.f6088d = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011a, code lost:
        if (r29.mo6593s() == 21) goto L_0x00e5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6379a(com.google.android.gms.internal.ads.dr2 r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            int r2 = r29.mo6593s()
            r3 = 2
            if (r2 == r3) goto L_0x000c
            return
        L_0x000c:
            com.google.android.gms.internal.ads.f4 r2 = r0.f6089e
            java.util.List r2 = r2.f6686a
            r4 = 0
            java.lang.Object r2 = r2.get(r4)
            com.google.android.gms.internal.ads.ky2 r2 = (com.google.android.gms.internal.ads.ky2) r2
            int r5 = r29.mo6593s()
            r5 = r5 & 128(0x80, float:1.794E-43)
            if (r5 != 0) goto L_0x0022
            return
        L_0x0022:
            r5 = 1
            r1.mo6581g(r5)
            int r6 = r29.mo6597w()
            r7 = 3
            r1.mo6581g(r7)
            com.google.android.gms.internal.ads.cq2 r8 = r0.f6085a
            r1.mo6575a(r8, r3)
            com.google.android.gms.internal.ads.cq2 r8 = r0.f6085a
            r8.mo6269j(r7)
            com.google.android.gms.internal.ads.f4 r8 = r0.f6089e
            com.google.android.gms.internal.ads.cq2 r9 = r0.f6085a
            r10 = 13
            int r9 = r9.mo6262c(r10)
            r8.f6701p = r9
            com.google.android.gms.internal.ads.cq2 r8 = r0.f6085a
            r1.mo6575a(r8, r3)
            com.google.android.gms.internal.ads.cq2 r3 = r0.f6085a
            r8 = 4
            r3.mo6269j(r8)
            com.google.android.gms.internal.ads.cq2 r3 = r0.f6085a
            r9 = 12
            int r3 = r3.mo6262c(r9)
            r1.mo6581g(r3)
            android.util.SparseArray<com.google.android.gms.internal.ads.l4> r3 = r0.f6086b
            r3.clear()
            android.util.SparseIntArray r3 = r0.f6087c
            r3.clear()
            int r3 = r29.mo6583i()
        L_0x0069:
            if (r3 <= 0) goto L_0x01e8
            com.google.android.gms.internal.ads.cq2 r11 = r0.f6085a
            r12 = 5
            r1.mo6575a(r11, r12)
            com.google.android.gms.internal.ads.cq2 r11 = r0.f6085a
            r13 = 8
            int r11 = r11.mo6262c(r13)
            com.google.android.gms.internal.ads.cq2 r13 = r0.f6085a
            r13.mo6269j(r7)
            com.google.android.gms.internal.ads.cq2 r13 = r0.f6085a
            int r13 = r13.mo6262c(r10)
            com.google.android.gms.internal.ads.cq2 r14 = r0.f6085a
            r14.mo6269j(r8)
            com.google.android.gms.internal.ads.cq2 r14 = r0.f6085a
            int r14 = r14.mo6262c(r9)
            int r15 = r29.mo6585k()
            int r9 = r15 + r14
            r16 = -1
            r17 = 0
            r10 = r16
            r5 = r17
            r18 = r5
        L_0x009f:
            int r4 = r29.mo6585k()
            if (r4 >= r9) goto L_0x0198
            int r4 = r29.mo6593s()
            int r19 = r29.mo6593s()
            int r20 = r29.mo6585k()
            int r8 = r20 + r19
            if (r8 <= r9) goto L_0x00bc
            r21 = r2
            r22 = r6
            r12 = 4
            goto L_0x019d
        L_0x00bc:
            r7 = 89
            r20 = 172(0xac, float:2.41E-43)
            r22 = 135(0x87, float:1.89E-43)
            r23 = 129(0x81, float:1.81E-43)
            if (r4 != r12) goto L_0x00f6
            long r24 = r29.mo6567A()
            r26 = 1094921523(0x41432d33, double:5.409631094E-315)
            int r4 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r4 != 0) goto L_0x00d4
            r10 = r23
            goto L_0x00f1
        L_0x00d4:
            r26 = 1161904947(0x45414333, double:5.74057318E-315)
            int r4 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r4 != 0) goto L_0x00de
            r10 = r22
            goto L_0x00f1
        L_0x00de:
            r22 = 1094921524(0x41432d34, double:5.4096311E-315)
            int r4 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r4 != 0) goto L_0x00e8
        L_0x00e5:
            r10 = r20
            goto L_0x00f1
        L_0x00e8:
            r22 = 1212503619(0x48455643, double:5.990563836E-315)
            int r4 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r4 != 0) goto L_0x00f1
            r10 = 36
        L_0x00f1:
            r21 = r2
        L_0x00f3:
            r22 = r6
            goto L_0x0100
        L_0x00f6:
            r12 = 106(0x6a, float:1.49E-43)
            if (r4 != r12) goto L_0x0103
            r21 = r2
            r22 = r6
            r10 = r23
        L_0x0100:
            r12 = 4
            goto L_0x0187
        L_0x0103:
            r12 = 122(0x7a, float:1.71E-43)
            if (r4 != r12) goto L_0x0110
            r21 = r2
            r10 = r22
            r12 = 4
            r22 = r6
            goto L_0x0187
        L_0x0110:
            r12 = 127(0x7f, float:1.78E-43)
            if (r4 != r12) goto L_0x011d
            int r4 = r29.mo6593s()
            r7 = 21
            if (r4 != r7) goto L_0x00f1
            goto L_0x00e5
        L_0x011d:
            r12 = 123(0x7b, float:1.72E-43)
            if (r4 != r12) goto L_0x0127
            r4 = 138(0x8a, float:1.93E-43)
            r21 = r2
            r10 = r4
            goto L_0x00f3
        L_0x0127:
            r12 = 10
            if (r4 != r12) goto L_0x013a
            java.nio.charset.Charset r4 = com.google.android.gms.internal.ads.c43.f5304c
            r12 = 3
            java.lang.String r4 = r1.mo6572F(r12, r4)
            java.lang.String r4 = r4.trim()
            r21 = r2
            r5 = r4
            goto L_0x00f3
        L_0x013a:
            r12 = 3
            if (r4 != r7) goto L_0x017b
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x0142:
            int r10 = r29.mo6585k()
            if (r10 >= r8) goto L_0x0171
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.c43.f5304c
            java.lang.String r10 = r1.mo6572F(r12, r10)
            java.lang.String r10 = r10.trim()
            int r7 = r29.mo6593s()
            r21 = r2
            r12 = 4
            byte[] r2 = new byte[r12]
            r22 = r6
            r6 = 0
            r1.mo6576b(r2, r6, r12)
            com.google.android.gms.internal.ads.h4 r6 = new com.google.android.gms.internal.ads.h4
            r6.<init>(r10, r7, r2)
            r4.add(r6)
            r2 = r21
            r6 = r22
            r7 = 89
            r12 = 3
            goto L_0x0142
        L_0x0171:
            r21 = r2
            r22 = r6
            r12 = 4
            r18 = r4
            r10 = 89
            goto L_0x0187
        L_0x017b:
            r21 = r2
            r22 = r6
            r12 = 4
            r2 = 111(0x6f, float:1.56E-43)
            if (r4 != r2) goto L_0x0187
            r2 = 257(0x101, float:3.6E-43)
            r10 = r2
        L_0x0187:
            int r2 = r29.mo6585k()
            int r8 = r8 - r2
            r1.mo6581g(r8)
            r8 = r12
            r2 = r21
            r6 = r22
            r7 = 3
            r12 = 5
            goto L_0x009f
        L_0x0198:
            r21 = r2
            r22 = r6
            r12 = r8
        L_0x019d:
            r1.mo6580f(r9)
            com.google.android.gms.internal.ads.i4 r2 = new com.google.android.gms.internal.ads.i4
            byte[] r4 = r29.mo6582h()
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r15, r9)
            r6 = r18
            r2.<init>(r10, r5, r6, r4)
            r4 = 6
            if (r11 == r4) goto L_0x01b5
            r4 = 5
            if (r11 != r4) goto L_0x01b7
        L_0x01b5:
            int r11 = r2.f8530a
        L_0x01b7:
            int r14 = r14 + 5
            int r3 = r3 - r14
            com.google.android.gms.internal.ads.f4 r4 = r0.f6089e
            android.util.SparseBooleanArray r4 = r4.f6691f
            boolean r4 = r4.get(r13)
            if (r4 != 0) goto L_0x01da
            com.google.android.gms.internal.ads.f4 r4 = r0.f6089e
            com.google.android.gms.internal.ads.j4 r4 = r4.f6689d
            com.google.android.gms.internal.ads.l4 r2 = r4.mo8341a(r11, r2)
            android.util.SparseIntArray r4 = r0.f6087c
            r4.put(r13, r13)
            android.util.SparseArray<com.google.android.gms.internal.ads.l4> r4 = r0.f6086b
            r4.put(r13, r2)
        L_0x01da:
            r8 = r12
            r2 = r21
            r6 = r22
            r4 = 0
            r5 = 1
            r7 = 3
            r9 = 12
            r10 = 13
            goto L_0x0069
        L_0x01e8:
            r21 = r2
            r22 = r6
            android.util.SparseIntArray r1 = r0.f6087c
            int r1 = r1.size()
            r6 = 0
        L_0x01f3:
            if (r6 >= r1) goto L_0x0247
            android.util.SparseIntArray r2 = r0.f6087c
            int r2 = r2.keyAt(r6)
            android.util.SparseIntArray r3 = r0.f6087c
            int r3 = r3.valueAt(r6)
            com.google.android.gms.internal.ads.f4 r4 = r0.f6089e
            android.util.SparseBooleanArray r4 = r4.f6691f
            r5 = 1
            r4.put(r2, r5)
            com.google.android.gms.internal.ads.f4 r4 = r0.f6089e
            android.util.SparseBooleanArray r4 = r4.f6692g
            r4.put(r3, r5)
            android.util.SparseArray<com.google.android.gms.internal.ads.l4> r4 = r0.f6086b
            java.lang.Object r4 = r4.valueAt(r6)
            com.google.android.gms.internal.ads.l4 r4 = (com.google.android.gms.internal.ads.C1912l4) r4
            if (r4 == 0) goto L_0x023c
            com.google.android.gms.internal.ads.f4 r5 = r0.f6089e
            com.google.android.gms.internal.ads.rc4 r5 = r5.f6695j
            com.google.android.gms.internal.ads.k4 r7 = new com.google.android.gms.internal.ads.k4
            r8 = 8192(0x2000, float:1.14794E-41)
            r9 = r22
            r7.<init>(r9, r2, r8)
            r2 = r21
            r4.mo8866b(r2, r5, r7)
            com.google.android.gms.internal.ads.f4 r5 = r0.f6089e
            android.util.SparseArray r5 = r5.f6690e
            r5.put(r3, r4)
            goto L_0x0240
        L_0x023c:
            r2 = r21
            r9 = r22
        L_0x0240:
            int r6 = r6 + 1
            r21 = r2
            r22 = r9
            goto L_0x01f3
        L_0x0247:
            com.google.android.gms.internal.ads.f4 r1 = r0.f6089e
            android.util.SparseArray r1 = r1.f6690e
            int r2 = r0.f6088d
            r1.remove(r2)
            com.google.android.gms.internal.ads.f4 r1 = r0.f6089e
            r2 = 0
            r1.f6696k = r2
            com.google.android.gms.internal.ads.f4 r1 = r0.f6089e
            int r1 = r1.f6696k
            if (r1 != 0) goto L_0x026f
            com.google.android.gms.internal.ads.f4 r1 = r0.f6089e
            com.google.android.gms.internal.ads.rc4 r1 = r1.f6695j
            r1.mo10268G()
            com.google.android.gms.internal.ads.f4 r1 = r0.f6089e
            r2 = 1
            r1.f6697l = true
        L_0x026f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1652e4.mo6379a(com.google.android.gms.internal.ads.dr2):void");
    }

    /* renamed from: b */
    public final void mo6380b(ky2 ky2, rc4 rc4, C1875k4 k4Var) {
    }
}
