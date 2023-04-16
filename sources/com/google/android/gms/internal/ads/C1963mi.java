package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/* renamed from: com.google.android.gms.internal.ads.mi */
public final class C1963mi implements C1591ch {

    /* renamed from: w */
    public static final C1666eh f10883w = new C1852ji();

    /* renamed from: x */
    private static final int f10884x = C2449zm.m20728g("seig");

    /* renamed from: y */
    private static final byte[] f10885y = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: a */
    private final SparseArray<C1926li> f10886a = new SparseArray<>();

    /* renamed from: b */
    private final C2152rm f10887b = new C2152rm(C2078pm.f12700a);

    /* renamed from: c */
    private final C2152rm f10888c = new C2152rm(5);

    /* renamed from: d */
    private final C2152rm f10889d = new C2152rm();

    /* renamed from: e */
    private final C2152rm f10890e = new C2152rm(1);

    /* renamed from: f */
    private final C2152rm f10891f = new C2152rm(16);

    /* renamed from: g */
    private final byte[] f10892g = new byte[16];

    /* renamed from: h */
    private final Stack<C2407yh> f10893h = new Stack<>();

    /* renamed from: i */
    private final LinkedList<C1889ki> f10894i = new LinkedList<>();

    /* renamed from: j */
    private int f10895j;

    /* renamed from: k */
    private int f10896k;

    /* renamed from: l */
    private long f10897l;

    /* renamed from: m */
    private int f10898m;

    /* renamed from: n */
    private C2152rm f10899n;

    /* renamed from: o */
    private long f10900o;

    /* renamed from: p */
    private long f10901p = -9223372036854775807L;

    /* renamed from: q */
    private C1926li f10902q;

    /* renamed from: r */
    private int f10903r;

    /* renamed from: s */
    private int f10904s;

    /* renamed from: t */
    private int f10905t;

    /* renamed from: u */
    private C1628dh f10906u;

    /* renamed from: v */
    private boolean f10907v;

    public C1963mi(int i, C2300vm vmVar, C2185si siVar) {
        m13306c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.C2406yg m13305a(java.util.List<com.google.android.gms.internal.ads.C2444zh> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r2
        L_0x0008:
            if (r3 >= r0) goto L_0x00b7
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.zh r5 = (com.google.android.gms.internal.ads.C2444zh) r5
            int r6 = r5.f4206a
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4150V
            if (r6 != r7) goto L_0x00b3
            if (r4 != 0) goto L_0x001d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x001d:
            com.google.android.gms.internal.ads.rm r5 = r5.f18191P0
            byte[] r5 = r5.f13709a
            com.google.android.gms.internal.ads.rm r6 = new com.google.android.gms.internal.ads.rm
            r6.<init>((byte[]) r5)
            int r8 = r6.mo10534d()
            r9 = 32
            if (r8 >= r9) goto L_0x0030
        L_0x002e:
            r6 = r2
            goto L_0x0097
        L_0x0030:
            r6.mo10552v(r1)
            int r8 = r6.mo10535e()
            int r9 = r6.mo10531a()
            int r9 = r9 + 4
            if (r8 == r9) goto L_0x0040
            goto L_0x002e
        L_0x0040:
            int r8 = r6.mo10535e()
            if (r8 == r7) goto L_0x0047
            goto L_0x002e
        L_0x0047:
            int r7 = r6.mo10535e()
            int r7 = com.google.android.gms.internal.ads.C1518ai.m6088b(r7)
            r8 = 1
            if (r7 <= r8) goto L_0x006b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r8 = 37
            r6.<init>(r8)
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L_0x002e
        L_0x006b:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.mo10542l()
            long r12 = r6.mo10542l()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L_0x0083
            int r7 = r6.mo10539i()
            int r7 = r7 * 16
            r6.mo10553w(r7)
        L_0x0083:
            int r7 = r6.mo10539i()
            int r8 = r6.mo10531a()
            if (r7 == r8) goto L_0x008e
            goto L_0x002e
        L_0x008e:
            byte[] r8 = new byte[r7]
            r6.mo10547q(r8, r1, r7)
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L_0x0097:
            if (r6 != 0) goto L_0x009b
            r6 = r2
            goto L_0x009f
        L_0x009b:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        L_0x009f:
            if (r6 != 0) goto L_0x00a9
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto L_0x00b3
        L_0x00a9:
            com.google.android.gms.internal.ads.xg r7 = new com.google.android.gms.internal.ads.xg
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5, r1)
            r4.add(r7)
        L_0x00b3:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x00b7:
            if (r4 != 0) goto L_0x00ba
            return r2
        L_0x00ba:
            com.google.android.gms.internal.ads.yg r14 = new com.google.android.gms.internal.ads.yg
            r14.<init>((java.util.List<com.google.android.gms.internal.ads.C2369xg>) r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1963mi.m13305a(java.util.List):com.google.android.gms.internal.ads.yg");
    }

    /* renamed from: c */
    private final void m13306c() {
        this.f10895j = 0;
        this.f10898m = 0;
    }

    /* renamed from: g */
    private static void m13307g(C2152rm rmVar, int i, C2296vi viVar) {
        rmVar.mo10552v(i + 8);
        int a = C1518ai.m6087a(rmVar.mo10535e());
        if ((a & 1) == 0) {
            boolean z = (a & 2) != 0;
            int i2 = rmVar.mo10539i();
            int i3 = viVar.f16296e;
            if (i2 == i3) {
                Arrays.fill(viVar.f16304m, 0, i2, z);
                viVar.mo11478a(rmVar.mo10531a());
                rmVar.mo10547q(viVar.f16307p.f13709a, 0, viVar.f16306o);
                viVar.f16307p.mo10552v(0);
                viVar.f16308q = false;
                return;
            }
            StringBuilder sb = new StringBuilder(41);
            sb.append("Length mismatch: ");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            throw new C1515af(sb.toString());
        }
        throw new C1515af("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0593  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m13308h(long r50) {
        /*
            r49 = this;
        L_0x0000:
            r0 = r49
        L_0x0002:
            java.util.Stack<com.google.android.gms.internal.ads.yh> r1 = r0.f10893h
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x062b
            java.util.Stack<com.google.android.gms.internal.ads.yh> r1 = r0.f10893h
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.yh r1 = (com.google.android.gms.internal.ads.C2407yh) r1
            long r1 = r1.f17734P0
            int r1 = (r1 > r50 ? 1 : (r1 == r50 ? 0 : -1))
            if (r1 != 0) goto L_0x062b
            java.util.Stack<com.google.android.gms.internal.ads.yh> r1 = r0.f10893h
            java.lang.Object r1 = r1.pop()
            com.google.android.gms.internal.ads.yh r1 = (com.google.android.gms.internal.ads.C2407yh) r1
            int r2 = r1.f4206a
            int r3 = com.google.android.gms.internal.ads.C1518ai.f4118C
            r4 = 12
            r5 = 8
            r7 = 1
            if (r2 != r3) goto L_0x015d
            java.util.List<com.google.android.gms.internal.ads.zh> r2 = r1.f17735Q0
            com.google.android.gms.internal.ads.yg r2 = m13305a(r2)
            int r3 = com.google.android.gms.internal.ads.C1518ai.f4140N
            com.google.android.gms.internal.ads.yh r3 = r1.mo12018d(r3)
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            java.util.List<com.google.android.gms.internal.ads.zh> r8 = r3.f17735Q0
            int r8 = r8.size()
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r15 = r9
            r9 = 0
        L_0x0049:
            if (r9 >= r8) goto L_0x00b3
            java.util.List<com.google.android.gms.internal.ads.zh> r10 = r3.f17735Q0
            java.lang.Object r10 = r10.get(r9)
            com.google.android.gms.internal.ads.zh r10 = (com.google.android.gms.internal.ads.C2444zh) r10
            int r11 = r10.f4206a
            int r12 = com.google.android.gms.internal.ads.C1518ai.f4204z
            if (r11 != r12) goto L_0x0091
            com.google.android.gms.internal.ads.rm r10 = r10.f18191P0
            r10.mo10552v(r4)
            int r11 = r10.mo10535e()
            int r12 = r10.mo10539i()
            int r13 = r10.mo10539i()
            int r6 = r10.mo10539i()
            int r10 = r10.mo10535e()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            com.google.android.gms.internal.ads.ii r4 = new com.google.android.gms.internal.ads.ii
            int r12 = r12 + -1
            r4.<init>(r12, r13, r6, r10)
            android.util.Pair r4 = android.util.Pair.create(r11, r4)
            java.lang.Object r6 = r4.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r4 = r4.second
            com.google.android.gms.internal.ads.ii r4 = (com.google.android.gms.internal.ads.C1815ii) r4
            r14.put(r6, r4)
            goto L_0x00ae
        L_0x0091:
            int r4 = com.google.android.gms.internal.ads.C1518ai.f4142O
            if (r11 != r4) goto L_0x00ae
            com.google.android.gms.internal.ads.rm r4 = r10.f18191P0
            r4.mo10552v(r5)
            int r6 = r4.mo10535e()
            int r6 = com.google.android.gms.internal.ads.C1518ai.m6088b(r6)
            if (r6 != 0) goto L_0x00a9
            long r10 = r4.mo10543m()
            goto L_0x00ad
        L_0x00a9:
            long r10 = r4.mo10544n()
        L_0x00ad:
            r15 = r10
        L_0x00ae:
            int r9 = r9 + 1
            r4 = 12
            goto L_0x0049
        L_0x00b3:
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            java.util.List<com.google.android.gms.internal.ads.yh> r4 = r1.f17736R0
            int r4 = r4.size()
            r5 = 0
        L_0x00bf:
            if (r5 >= r4) goto L_0x00e7
            java.util.List<com.google.android.gms.internal.ads.yh> r6 = r1.f17736R0
            java.lang.Object r6 = r6.get(r5)
            r8 = r6
            com.google.android.gms.internal.ads.yh r8 = (com.google.android.gms.internal.ads.C2407yh) r8
            int r6 = r8.f4206a
            int r9 = com.google.android.gms.internal.ads.C1518ai.f4122E
            if (r6 != r9) goto L_0x00e4
            int r6 = com.google.android.gms.internal.ads.C1518ai.f4120D
            com.google.android.gms.internal.ads.zh r9 = r1.mo12019e(r6)
            r13 = 0
            r10 = r15
            r12 = r2
            com.google.android.gms.internal.ads.si r6 = com.google.android.gms.internal.ads.C1778hi.m10579a(r8, r9, r10, r12, r13)
            if (r6 == 0) goto L_0x00e4
            int r8 = r6.f14447a
            r3.put(r8, r6)
        L_0x00e4:
            int r5 = r5 + 1
            goto L_0x00bf
        L_0x00e7:
            int r1 = r3.size()
            android.util.SparseArray<com.google.android.gms.internal.ads.li> r2 = r0.f10886a
            int r2 = r2.size()
            if (r2 != 0) goto L_0x012f
            r6 = 0
        L_0x00f4:
            if (r6 >= r1) goto L_0x0128
            java.lang.Object r2 = r3.valueAt(r6)
            com.google.android.gms.internal.ads.si r2 = (com.google.android.gms.internal.ads.C2185si) r2
            com.google.android.gms.internal.ads.li r4 = new com.google.android.gms.internal.ads.li
            com.google.android.gms.internal.ads.dh r5 = r0.f10906u
            int r7 = r2.f14448b
            com.google.android.gms.internal.ads.lh r5 = r5.mo6476c(r6, r7)
            r4.<init>(r5)
            int r5 = r2.f14447a
            java.lang.Object r5 = r14.get(r5)
            com.google.android.gms.internal.ads.ii r5 = (com.google.android.gms.internal.ads.C1815ii) r5
            r4.mo8957a(r2, r5)
            android.util.SparseArray<com.google.android.gms.internal.ads.li> r5 = r0.f10886a
            int r7 = r2.f14447a
            r5.put(r7, r4)
            long r4 = r0.f10901p
            long r7 = r2.f14451e
            long r4 = java.lang.Math.max(r4, r7)
            r0.f10901p = r4
            int r6 = r6 + 1
            goto L_0x00f4
        L_0x0128:
            com.google.android.gms.internal.ads.dh r1 = r0.f10906u
            r1.mo6474a()
            goto L_0x0002
        L_0x012f:
            android.util.SparseArray<com.google.android.gms.internal.ads.li> r2 = r0.f10886a
            int r2 = r2.size()
            if (r2 != r1) goto L_0x0138
            goto L_0x0139
        L_0x0138:
            r7 = 0
        L_0x0139:
            com.google.android.gms.internal.ads.C1856jm.m11730e(r7)
            r6 = 0
        L_0x013d:
            if (r6 >= r1) goto L_0x0002
            java.lang.Object r2 = r3.valueAt(r6)
            com.google.android.gms.internal.ads.si r2 = (com.google.android.gms.internal.ads.C2185si) r2
            android.util.SparseArray<com.google.android.gms.internal.ads.li> r4 = r0.f10886a
            int r5 = r2.f14447a
            java.lang.Object r4 = r4.get(r5)
            com.google.android.gms.internal.ads.li r4 = (com.google.android.gms.internal.ads.C1926li) r4
            int r5 = r2.f14447a
            java.lang.Object r5 = r14.get(r5)
            com.google.android.gms.internal.ads.ii r5 = (com.google.android.gms.internal.ads.C1815ii) r5
            r4.mo8957a(r2, r5)
            int r6 = r6 + 1
            goto L_0x013d
        L_0x015d:
            int r3 = com.google.android.gms.internal.ads.C1518ai.f4136L
            if (r2 != r3) goto L_0x0614
            android.util.SparseArray<com.google.android.gms.internal.ads.li> r2 = r0.f10886a
            byte[] r3 = r0.f10892g
            java.util.List<com.google.android.gms.internal.ads.yh> r4 = r1.f17736R0
            int r4 = r4.size()
            r6 = 0
        L_0x016c:
            if (r6 >= r4) goto L_0x05e8
            java.util.List<com.google.android.gms.internal.ads.yh> r8 = r1.f17736R0
            java.lang.Object r8 = r8.get(r6)
            com.google.android.gms.internal.ads.yh r8 = (com.google.android.gms.internal.ads.C2407yh) r8
            int r9 = r8.f4206a
            int r10 = com.google.android.gms.internal.ads.C1518ai.f4138M
            if (r9 != r10) goto L_0x05ce
            int r9 = com.google.android.gms.internal.ads.C1518ai.f4202y
            com.google.android.gms.internal.ads.zh r9 = r8.mo12019e(r9)
            com.google.android.gms.internal.ads.rm r9 = r9.f18191P0
            r9.mo10552v(r5)
            int r10 = r9.mo10535e()
            int r10 = com.google.android.gms.internal.ads.C1518ai.m6087a(r10)
            int r11 = r9.mo10535e()
            java.lang.Object r11 = r2.get(r11)
            com.google.android.gms.internal.ads.li r11 = (com.google.android.gms.internal.ads.C1926li) r11
            if (r11 != 0) goto L_0x019d
            r11 = 0
            goto L_0x01e4
        L_0x019d:
            r12 = r10 & 1
            if (r12 == 0) goto L_0x01ab
            long r12 = r9.mo10544n()
            com.google.android.gms.internal.ads.vi r14 = r11.f10049a
            r14.f16293b = r12
            r14.f16294c = r12
        L_0x01ab:
            com.google.android.gms.internal.ads.ii r12 = r11.f10052d
            r13 = r10 & 2
            if (r13 == 0) goto L_0x01b8
            int r13 = r9.mo10539i()
            int r13 = r13 + -1
            goto L_0x01ba
        L_0x01b8:
            int r13 = r12.f8658a
        L_0x01ba:
            r14 = r10 & 8
            if (r14 == 0) goto L_0x01c3
            int r14 = r9.mo10539i()
            goto L_0x01c5
        L_0x01c3:
            int r14 = r12.f8659b
        L_0x01c5:
            r15 = r10 & 16
            if (r15 == 0) goto L_0x01ce
            int r15 = r9.mo10539i()
            goto L_0x01d0
        L_0x01ce:
            int r15 = r12.f8660c
        L_0x01d0:
            r10 = r10 & 32
            if (r10 == 0) goto L_0x01d9
            int r9 = r9.mo10539i()
            goto L_0x01db
        L_0x01d9:
            int r9 = r12.f8661d
        L_0x01db:
            com.google.android.gms.internal.ads.vi r10 = r11.f10049a
            com.google.android.gms.internal.ads.ii r12 = new com.google.android.gms.internal.ads.ii
            r12.<init>(r13, r14, r15, r9)
            r10.f16292a = r12
        L_0x01e4:
            if (r11 != 0) goto L_0x01e8
            goto L_0x05ce
        L_0x01e8:
            com.google.android.gms.internal.ads.vi r9 = r11.f10049a
            long r12 = r9.f16309r
            r11.mo8958b()
            int r10 = com.google.android.gms.internal.ads.C1518ai.f4200x
            com.google.android.gms.internal.ads.zh r14 = r8.mo12019e(r10)
            if (r14 == 0) goto L_0x0213
            com.google.android.gms.internal.ads.zh r10 = r8.mo12019e(r10)
            com.google.android.gms.internal.ads.rm r10 = r10.f18191P0
            r10.mo10552v(r5)
            int r12 = r10.mo10535e()
            int r12 = com.google.android.gms.internal.ads.C1518ai.m6088b(r12)
            if (r12 != r7) goto L_0x020f
            long r12 = r10.mo10544n()
            goto L_0x0213
        L_0x020f:
            long r12 = r10.mo10543m()
        L_0x0213:
            java.util.List<com.google.android.gms.internal.ads.zh> r10 = r8.f17735Q0
            int r14 = r10.size()
            r5 = 0
            r7 = 0
            r15 = 0
        L_0x021c:
            if (r15 >= r14) goto L_0x024e
            java.lang.Object r18 = r10.get(r15)
            r19 = r2
            r2 = r18
            com.google.android.gms.internal.ads.zh r2 = (com.google.android.gms.internal.ads.C2444zh) r2
            r18 = r4
            int r4 = r2.f4206a
            r20 = r12
            int r12 = com.google.android.gms.internal.ads.C1518ai.f4114A
            if (r4 != r12) goto L_0x0243
            com.google.android.gms.internal.ads.rm r2 = r2.f18191P0
            r4 = 12
            r2.mo10552v(r4)
            int r2 = r2.mo10539i()
            if (r2 <= 0) goto L_0x0245
            int r5 = r5 + r2
            int r7 = r7 + 1
            goto L_0x0245
        L_0x0243:
            r4 = 12
        L_0x0245:
            int r15 = r15 + 1
            r4 = r18
            r2 = r19
            r12 = r20
            goto L_0x021c
        L_0x024e:
            r19 = r2
            r18 = r4
            r20 = r12
            r2 = 0
            r4 = 12
            r11.f10055g = r2
            r11.f10054f = r2
            r11.f10053e = r2
            com.google.android.gms.internal.ads.vi r2 = r11.f10049a
            r2.f16295d = r7
            r2.f16296e = r5
            int[] r12 = r2.f16298g
            if (r12 == 0) goto L_0x026a
            int r12 = r12.length
            if (r12 >= r7) goto L_0x0272
        L_0x026a:
            long[] r12 = new long[r7]
            r2.f16297f = r12
            int[] r7 = new int[r7]
            r2.f16298g = r7
        L_0x0272:
            int[] r7 = r2.f16299h
            if (r7 == 0) goto L_0x0279
            int r7 = r7.length
            if (r7 >= r5) goto L_0x0291
        L_0x0279:
            int r5 = r5 * 125
            int r5 = r5 / 100
            int[] r7 = new int[r5]
            r2.f16299h = r7
            int[] r7 = new int[r5]
            r2.f16300i = r7
            long[] r7 = new long[r5]
            r2.f16301j = r7
            boolean[] r7 = new boolean[r5]
            r2.f16302k = r7
            boolean[] r5 = new boolean[r5]
            r2.f16304m = r5
        L_0x0291:
            r2 = 0
            r5 = 0
            r7 = 0
        L_0x0294:
            if (r2 >= r14) goto L_0x03f6
            java.lang.Object r17 = r10.get(r2)
            r4 = r17
            com.google.android.gms.internal.ads.zh r4 = (com.google.android.gms.internal.ads.C2444zh) r4
            int r15 = r4.f4206a
            int r12 = com.google.android.gms.internal.ads.C1518ai.f4114A
            if (r15 != r12) goto L_0x03cc
            int r12 = r7 + 1
            com.google.android.gms.internal.ads.rm r4 = r4.f18191P0
            r13 = 8
            r4.mo10552v(r13)
            int r13 = r4.mo10535e()
            int r13 = com.google.android.gms.internal.ads.C1518ai.m6087a(r13)
            com.google.android.gms.internal.ads.si r15 = r11.f10051c
            r24 = r10
            com.google.android.gms.internal.ads.vi r10 = r11.f10049a
            r25 = r12
            com.google.android.gms.internal.ads.ii r12 = r10.f16292a
            r26 = r14
            int[] r14 = r10.f16298g
            int r27 = r4.mo10539i()
            r14[r7] = r27
            long[] r14 = r10.f16297f
            r27 = r1
            long r0 = r10.f16293b
            r14[r7] = r0
            r28 = r13 & 1
            if (r28 == 0) goto L_0x02e4
            r28 = r6
            int r6 = r4.mo10535e()
            r29 = r8
            r30 = r9
            long r8 = (long) r6
            long r0 = r0 + r8
            r14[r7] = r0
            goto L_0x02ea
        L_0x02e4:
            r28 = r6
            r29 = r8
            r30 = r9
        L_0x02ea:
            r0 = r13 & 4
            int r1 = r12.f8661d
            if (r0 == 0) goto L_0x02f4
            int r1 = r4.mo10539i()
        L_0x02f4:
            r6 = r13 & 256(0x100, float:3.59E-43)
            r8 = r13 & 512(0x200, float:7.175E-43)
            r9 = r13 & 1024(0x400, float:1.435E-42)
            r13 = r13 & 2048(0x800, float:2.87E-42)
            long[] r14 = r15.f14455i
            r31 = r1
            if (r14 == 0) goto L_0x0323
            int r1 = r14.length
            r32 = r3
            r3 = 1
            if (r1 != r3) goto L_0x0325
            r1 = 0
            r33 = r14[r1]
            r22 = 0
            int r3 = (r33 > r22 ? 1 : (r33 == r22 ? 0 : -1))
            if (r3 != 0) goto L_0x0325
            long[] r3 = r15.f14456j
            r33 = r3[r1]
            r35 = 1000(0x3e8, double:4.94E-321)
            r3 = r2
            long r1 = r15.f14449c
            r37 = r1
            long r1 = com.google.android.gms.internal.ads.C2449zm.m20731j(r33, r35, r37)
            r22 = r1
            goto L_0x0328
        L_0x0323:
            r32 = r3
        L_0x0325:
            r3 = r2
            r22 = 0
        L_0x0328:
            int[] r1 = r10.f16299h
            int[] r2 = r10.f16300i
            long[] r14 = r10.f16301j
            r33 = r11
            boolean[] r11 = r10.f16302k
            r34 = r3
            int[] r3 = r10.f16298g
            r3 = r3[r7]
            int r3 = r3 + r5
            r41 = r14
            long r14 = r15.f14449c
            r42 = r1
            r43 = r2
            if (r7 <= 0) goto L_0x0346
            long r1 = r10.f16309r
            goto L_0x0348
        L_0x0346:
            r1 = r20
        L_0x0348:
            if (r5 >= r3) goto L_0x03c3
            if (r6 == 0) goto L_0x0351
            int r7 = r4.mo10539i()
            goto L_0x0353
        L_0x0351:
            int r7 = r12.f8659b
        L_0x0353:
            if (r8 == 0) goto L_0x035e
            int r35 = r4.mo10539i()
            r44 = r3
            r3 = r35
            goto L_0x0362
        L_0x035e:
            r44 = r3
            int r3 = r12.f8660c
        L_0x0362:
            if (r5 != 0) goto L_0x036d
            if (r0 == 0) goto L_0x036c
            r45 = r0
            r0 = r31
            r5 = 0
            goto L_0x037c
        L_0x036c:
            r5 = 0
        L_0x036d:
            if (r9 == 0) goto L_0x0378
            int r35 = r4.mo10535e()
            r45 = r0
            r0 = r35
            goto L_0x037c
        L_0x0378:
            r45 = r0
            int r0 = r12.f8661d
        L_0x037c:
            r46 = r6
            if (r13 == 0) goto L_0x0390
            int r6 = r4.mo10535e()
            int r6 = r6 * 1000
            r47 = r8
            r48 = r9
            long r8 = (long) r6
            long r8 = r8 / r14
            int r6 = (int) r8
            r43[r5] = r6
            goto L_0x0397
        L_0x0390:
            r47 = r8
            r48 = r9
            r6 = 0
            r43[r5] = r6
        L_0x0397:
            r37 = 1000(0x3e8, double:4.94E-321)
            r35 = r1
            r39 = r14
            long r8 = com.google.android.gms.internal.ads.C2449zm.m20731j(r35, r37, r39)
            long r8 = r8 - r22
            r41[r5] = r8
            r42[r5] = r3
            r3 = 16
            int r0 = r0 >> r3
            r3 = 1
            r0 = r0 & r3
            r0 = r0 ^ r3
            if (r3 == r0) goto L_0x03b1
            r0 = 0
            goto L_0x03b2
        L_0x03b1:
            r0 = 1
        L_0x03b2:
            r11[r5] = r0
            long r6 = (long) r7
            long r1 = r1 + r6
            int r5 = r5 + 1
            r3 = r44
            r0 = r45
            r6 = r46
            r8 = r47
            r9 = r48
            goto L_0x0348
        L_0x03c3:
            r44 = r3
            r10.f16309r = r1
            r7 = r25
            r5 = r44
            goto L_0x03de
        L_0x03cc:
            r27 = r1
            r34 = r2
            r32 = r3
            r28 = r6
            r29 = r8
            r30 = r9
            r24 = r10
            r33 = r11
            r26 = r14
        L_0x03de:
            int r2 = r34 + 1
            r0 = r49
            r10 = r24
            r14 = r26
            r1 = r27
            r6 = r28
            r8 = r29
            r9 = r30
            r3 = r32
            r11 = r33
            r4 = 12
            goto L_0x0294
        L_0x03f6:
            r27 = r1
            r32 = r3
            r28 = r6
            r29 = r8
            r30 = r9
            r33 = r11
            int r0 = com.google.android.gms.internal.ads.C1518ai.f4161d0
            com.google.android.gms.internal.ads.zh r0 = r8.mo12019e(r0)
            if (r0 == 0) goto L_0x0485
            r11 = r33
            com.google.android.gms.internal.ads.si r1 = r11.f10051c
            com.google.android.gms.internal.ads.ti[] r1 = r1.f14454h
            r2 = r30
            com.google.android.gms.internal.ads.ii r3 = r2.f16292a
            int r3 = r3.f8658a
            r1 = r1[r3]
            com.google.android.gms.internal.ads.rm r0 = r0.f18191P0
            int r1 = r1.f14864a
            r3 = 8
            r0.mo10552v(r3)
            int r4 = r0.mo10535e()
            int r4 = com.google.android.gms.internal.ads.C1518ai.m6087a(r4)
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x0430
            r0.mo10553w(r3)
        L_0x0430:
            int r3 = r0.mo10537g()
            int r4 = r0.mo10539i()
            int r5 = r2.f16296e
            if (r4 != r5) goto L_0x0464
            if (r3 != 0) goto L_0x0453
            boolean[] r3 = r2.f16304m
            r5 = 0
            r6 = 0
        L_0x0442:
            if (r5 >= r4) goto L_0x0460
            int r7 = r0.mo10537g()
            int r6 = r6 + r7
            if (r7 <= r1) goto L_0x044d
            r7 = 1
            goto L_0x044e
        L_0x044d:
            r7 = 0
        L_0x044e:
            r3[r5] = r7
            int r5 = r5 + 1
            goto L_0x0442
        L_0x0453:
            if (r3 <= r1) goto L_0x0457
            r0 = 1
            goto L_0x0458
        L_0x0457:
            r0 = 0
        L_0x0458:
            int r6 = r3 * r4
            boolean[] r1 = r2.f16304m
            r3 = 0
            java.util.Arrays.fill(r1, r3, r4, r0)
        L_0x0460:
            r2.mo11478a(r6)
            goto L_0x0487
        L_0x0464:
            com.google.android.gms.internal.ads.af r0 = new com.google.android.gms.internal.ads.af
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 41
            r1.<init>(r2)
            java.lang.String r2 = "Length mismatch: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0485:
            r2 = r30
        L_0x0487:
            int r0 = com.google.android.gms.internal.ads.C1518ai.f4163e0
            com.google.android.gms.internal.ads.zh r0 = r8.mo12019e(r0)
            if (r0 == 0) goto L_0x04d9
            com.google.android.gms.internal.ads.rm r0 = r0.f18191P0
            r1 = 8
            r0.mo10552v(r1)
            int r3 = r0.mo10535e()
            int r4 = com.google.android.gms.internal.ads.C1518ai.m6087a(r3)
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x04a5
            r0.mo10553w(r1)
        L_0x04a5:
            int r1 = r0.mo10539i()
            if (r1 != r5) goto L_0x04c0
            long r4 = r2.f16294c
            int r1 = com.google.android.gms.internal.ads.C1518ai.m6088b(r3)
            if (r1 != 0) goto L_0x04b8
            long r0 = r0.mo10543m()
            goto L_0x04bc
        L_0x04b8:
            long r0 = r0.mo10544n()
        L_0x04bc:
            long r4 = r4 + r0
            r2.f16294c = r4
            goto L_0x04d9
        L_0x04c0:
            com.google.android.gms.internal.ads.af r0 = new com.google.android.gms.internal.ads.af
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 40
            r2.<init>(r3)
            java.lang.String r3 = "Unexpected saio entry count: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x04d9:
            int r0 = com.google.android.gms.internal.ads.C1518ai.f4171i0
            com.google.android.gms.internal.ads.zh r0 = r8.mo12019e(r0)
            if (r0 == 0) goto L_0x04e7
            com.google.android.gms.internal.ads.rm r0 = r0.f18191P0
            r1 = 0
            m13307g(r0, r1, r2)
        L_0x04e7:
            int r0 = com.google.android.gms.internal.ads.C1518ai.f4165f0
            com.google.android.gms.internal.ads.zh r0 = r8.mo12019e(r0)
            int r1 = com.google.android.gms.internal.ads.C1518ai.f4167g0
            com.google.android.gms.internal.ads.zh r1 = r8.mo12019e(r1)
            if (r0 == 0) goto L_0x0589
            if (r1 == 0) goto L_0x0589
            com.google.android.gms.internal.ads.rm r0 = r0.f18191P0
            com.google.android.gms.internal.ads.rm r1 = r1.f18191P0
            r3 = 8
            r0.mo10552v(r3)
            int r3 = r0.mo10535e()
            int r4 = r0.mo10535e()
            int r5 = f10884x
            if (r4 == r5) goto L_0x050e
            goto L_0x0589
        L_0x050e:
            int r3 = com.google.android.gms.internal.ads.C1518ai.m6088b(r3)
            r4 = 4
            r6 = 1
            if (r3 != r6) goto L_0x0519
            r0.mo10553w(r4)
        L_0x0519:
            int r0 = r0.mo10535e()
            if (r0 != r6) goto L_0x0581
            r0 = 8
            r1.mo10552v(r0)
            int r0 = r1.mo10535e()
            int r3 = r1.mo10535e()
            if (r3 != r5) goto L_0x057f
            int r0 = com.google.android.gms.internal.ads.C1518ai.m6088b(r0)
            r3 = 2
            if (r0 != r6) goto L_0x0548
            long r4 = r1.mo10543m()
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0540
            goto L_0x054d
        L_0x0540:
            com.google.android.gms.internal.ads.af r0 = new com.google.android.gms.internal.ads.af
            java.lang.String r1 = "Variable length decription in sgpd found (unsupported)"
            r0.<init>(r1)
            throw r0
        L_0x0548:
            if (r0 < r3) goto L_0x054d
            r1.mo10553w(r4)
        L_0x054d:
            long r4 = r1.mo10543m()
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0577
            r1.mo10553w(r3)
            int r0 = r1.mo10537g()
            r3 = 1
            if (r0 != r3) goto L_0x058a
            int r0 = r1.mo10537g()
            r4 = 16
            byte[] r5 = new byte[r4]
            r6 = 0
            r1.mo10547q(r5, r6, r4)
            r2.f16303l = r3
            com.google.android.gms.internal.ads.ti r1 = new com.google.android.gms.internal.ads.ti
            r1.<init>(r3, r0, r5)
            r2.f16305n = r1
            goto L_0x058a
        L_0x0577:
            com.google.android.gms.internal.ads.af r0 = new com.google.android.gms.internal.ads.af
            java.lang.String r1 = "Entry count in sgpd != 1 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x057f:
            r3 = r6
            goto L_0x058a
        L_0x0581:
            com.google.android.gms.internal.ads.af r0 = new com.google.android.gms.internal.ads.af
            java.lang.String r1 = "Entry count in sbgp != 1 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x0589:
            r3 = 1
        L_0x058a:
            java.util.List<com.google.android.gms.internal.ads.zh> r0 = r8.f17735Q0
            int r0 = r0.size()
            r1 = 0
        L_0x0591:
            if (r1 >= r0) goto L_0x05c8
            java.util.List<com.google.android.gms.internal.ads.zh> r4 = r8.f17735Q0
            java.lang.Object r4 = r4.get(r1)
            com.google.android.gms.internal.ads.zh r4 = (com.google.android.gms.internal.ads.C2444zh) r4
            int r5 = r4.f4206a
            int r6 = com.google.android.gms.internal.ads.C1518ai.f4169h0
            if (r5 != r6) goto L_0x05bc
            com.google.android.gms.internal.ads.rm r4 = r4.f18191P0
            r5 = 8
            r4.mo10552v(r5)
            r6 = r32
            r7 = 16
            r9 = 0
            r4.mo10547q(r6, r9, r7)
            byte[] r10 = f10885y
            boolean r10 = java.util.Arrays.equals(r6, r10)
            if (r10 == 0) goto L_0x05c3
            m13307g(r4, r7, r2)
            goto L_0x05c3
        L_0x05bc:
            r6 = r32
            r5 = 8
            r7 = 16
            r9 = 0
        L_0x05c3:
            int r1 = r1 + 1
            r32 = r6
            goto L_0x0591
        L_0x05c8:
            r6 = r32
            r5 = 8
            r9 = 0
            goto L_0x05d9
        L_0x05ce:
            r27 = r1
            r19 = r2
            r18 = r4
            r28 = r6
            r9 = 0
            r6 = r3
            r3 = r7
        L_0x05d9:
            int r0 = r28 + 1
            r7 = r3
            r3 = r6
            r4 = r18
            r2 = r19
            r1 = r27
            r6 = r0
            r0 = r49
            goto L_0x016c
        L_0x05e8:
            r9 = 0
            java.util.List<com.google.android.gms.internal.ads.zh> r0 = r1.f17735Q0
            com.google.android.gms.internal.ads.yg r0 = m13305a(r0)
            if (r0 == 0) goto L_0x0000
            r2 = r49
            android.util.SparseArray<com.google.android.gms.internal.ads.li> r1 = r2.f10886a
            int r1 = r1.size()
            r6 = r9
        L_0x05fa:
            if (r6 >= r1) goto L_0x0628
            android.util.SparseArray<com.google.android.gms.internal.ads.li> r3 = r2.f10886a
            java.lang.Object r3 = r3.valueAt(r6)
            com.google.android.gms.internal.ads.li r3 = (com.google.android.gms.internal.ads.C1926li) r3
            com.google.android.gms.internal.ads.lh r4 = r3.f10050b
            com.google.android.gms.internal.ads.si r3 = r3.f10051c
            com.google.android.gms.internal.ads.xe r3 = r3.f14452f
            com.google.android.gms.internal.ads.xe r3 = r3.mo11808d(r0)
            r4.mo8952b(r3)
            int r6 = r6 + 1
            goto L_0x05fa
        L_0x0614:
            r2 = r0
            java.util.Stack<com.google.android.gms.internal.ads.yh> r0 = r2.f10893h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0628
            java.util.Stack<com.google.android.gms.internal.ads.yh> r0 = r2.f10893h
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.yh r0 = (com.google.android.gms.internal.ads.C2407yh) r0
            r0.mo12020f(r1)
        L_0x0628:
            r0 = r2
            goto L_0x0002
        L_0x062b:
            r2 = r0
            r49.m13306c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1963mi.m13308h(long):void");
    }

    /* renamed from: b */
    public final void mo6196b(long j, long j2) {
        int size = this.f10886a.size();
        for (int i = 0; i < size; i++) {
            this.f10886a.valueAt(i).mo8958b();
        }
        this.f10894i.clear();
        this.f10893h.clear();
        m13306c();
    }

    /* renamed from: d */
    public final boolean mo6197d(C1554bh bhVar) {
        return C2148ri.m16191a(bhVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04ac, code lost:
        if (r0.f10897l == ((long) r0.f10898m)) goto L_0x0338;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo6198e(com.google.android.gms.internal.ads.C1554bh r25, com.google.android.gms.internal.ads.C1777hh r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
        L_0x0004:
            int r2 = r0.f10895j
            r4 = 2
            r6 = 8
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x033d
            if (r2 == r7) goto L_0x023f
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 3
            if (r2 == r4) goto L_0x01e6
            if (r2 != r12) goto L_0x00f4
            com.google.android.gms.internal.ads.li r2 = r0.f10902q
            if (r2 != 0) goto L_0x007f
            android.util.SparseArray<com.google.android.gms.internal.ads.li> r2 = r0.f10886a
            int r13 = r2.size()
            r14 = r8
            r15 = 0
        L_0x0025:
            if (r14 >= r13) goto L_0x0047
            java.lang.Object r16 = r2.valueAt(r14)
            r12 = r16
            com.google.android.gms.internal.ads.li r12 = (com.google.android.gms.internal.ads.C1926li) r12
            int r5 = r12.f10055g
            com.google.android.gms.internal.ads.vi r3 = r12.f10049a
            int r9 = r3.f16295d
            if (r5 != r9) goto L_0x0038
            goto L_0x0043
        L_0x0038:
            long[] r3 = r3.f16297f
            r18 = r3[r5]
            int r3 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
            if (r3 >= 0) goto L_0x0043
            r15 = r12
            r10 = r18
        L_0x0043:
            int r14 = r14 + 1
            r12 = 3
            goto L_0x0025
        L_0x0047:
            if (r15 != 0) goto L_0x0062
            long r2 = r0.f10900o
            long r4 = r25.mo5857d()
            long r2 = r2 - r4
            int r2 = (int) r2
            if (r2 < 0) goto L_0x005a
            r1.mo5862i(r2, r8)
        L_0x0056:
            r24.m13306c()
            goto L_0x0004
        L_0x005a:
            com.google.android.gms.internal.ads.af r1 = new com.google.android.gms.internal.ads.af
            java.lang.String r2 = "Offset to end of mdat was negative."
            r1.<init>(r2)
            throw r1
        L_0x0062:
            com.google.android.gms.internal.ads.vi r2 = r15.f10049a
            long[] r2 = r2.f16297f
            int r3 = r15.f10055g
            r9 = r2[r3]
            long r2 = r25.mo5857d()
            long r9 = r9 - r2
            int r2 = (int) r9
            if (r2 >= 0) goto L_0x007a
            java.lang.String r2 = "FragmentedMp4Extractor"
            java.lang.String r3 = "Ignoring negative offset to sample data."
            android.util.Log.w(r2, r3)
            r2 = r8
        L_0x007a:
            r1.mo5862i(r2, r8)
            r0.f10902q = r15
        L_0x007f:
            com.google.android.gms.internal.ads.li r2 = r0.f10902q
            com.google.android.gms.internal.ads.vi r3 = r2.f10049a
            int[] r5 = r3.f16299h
            int r9 = r2.f10053e
            r5 = r5[r9]
            r0.f10903r = r5
            boolean r10 = r3.f16303l
            if (r10 == 0) goto L_0x00de
            com.google.android.gms.internal.ads.rm r5 = r3.f16307p
            com.google.android.gms.internal.ads.ii r10 = r3.f16292a
            int r10 = r10.f8658a
            com.google.android.gms.internal.ads.ti r11 = r3.f16305n
            if (r11 == 0) goto L_0x009a
            goto L_0x00a0
        L_0x009a:
            com.google.android.gms.internal.ads.si r11 = r2.f10051c
            com.google.android.gms.internal.ads.ti[] r11 = r11.f14454h
            r11 = r11[r10]
        L_0x00a0:
            int r10 = r11.f14864a
            boolean[] r3 = r3.f16304m
            boolean r3 = r3[r9]
            com.google.android.gms.internal.ads.rm r9 = r0.f10890e
            byte[] r11 = r9.f13709a
            if (r7 == r3) goto L_0x00ae
            r12 = r8
            goto L_0x00b0
        L_0x00ae:
            r12 = 128(0x80, float:1.794E-43)
        L_0x00b0:
            r12 = r12 | r10
            byte r12 = (byte) r12
            r11[r8] = r12
            r9.mo10552v(r8)
            com.google.android.gms.internal.ads.lh r2 = r2.f10050b
            com.google.android.gms.internal.ads.rm r9 = r0.f10890e
            r2.mo8953c(r9, r7)
            r2.mo8953c(r5, r10)
            if (r3 != 0) goto L_0x00c5
            int r10 = r10 + r7
            goto L_0x00d5
        L_0x00c5:
            int r3 = r5.mo10540j()
            r9 = -2
            r5.mo10553w(r9)
            int r3 = r3 * 6
            int r3 = r3 + r4
            r2.mo8953c(r5, r3)
            int r10 = r10 + r7
            int r10 = r10 + r3
        L_0x00d5:
            r0.f10904s = r10
            int r2 = r0.f10903r
            int r5 = r2 + r10
            r0.f10903r = r5
            goto L_0x00e0
        L_0x00de:
            r0.f10904s = r8
        L_0x00e0:
            com.google.android.gms.internal.ads.li r2 = r0.f10902q
            com.google.android.gms.internal.ads.si r2 = r2.f10051c
            int r2 = r2.f14453g
            if (r2 != r7) goto L_0x00ef
            int r5 = r5 + -8
            r0.f10903r = r5
            r1.mo5862i(r6, r8)
        L_0x00ef:
            r2 = 4
            r0.f10895j = r2
            r0.f10905t = r8
        L_0x00f4:
            com.google.android.gms.internal.ads.li r2 = r0.f10902q
            com.google.android.gms.internal.ads.vi r3 = r2.f10049a
            com.google.android.gms.internal.ads.si r5 = r2.f10051c
            com.google.android.gms.internal.ads.lh r9 = r2.f10050b
            int r2 = r2.f10053e
            int r6 = r5.f14457k
            if (r6 != 0) goto L_0x0113
        L_0x0102:
            int r4 = r0.f10904s
            int r6 = r0.f10903r
            if (r4 >= r6) goto L_0x0169
            int r6 = r6 - r4
            int r4 = r9.mo8954d(r1, r6, r8)
            int r6 = r0.f10904s
            int r6 = r6 + r4
            r0.f10904s = r6
            goto L_0x0102
        L_0x0113:
            com.google.android.gms.internal.ads.rm r10 = r0.f10888c
            byte[] r10 = r10.f13709a
            r10[r8] = r8
            r10[r7] = r8
            r10[r4] = r8
            int r4 = r6 + 1
            r11 = 4
            int r6 = 4 - r6
        L_0x0122:
            int r11 = r0.f10904s
            int r12 = r0.f10903r
            if (r11 >= r12) goto L_0x0169
            int r11 = r0.f10905t
            if (r11 != 0) goto L_0x015a
            r1.mo5861h(r10, r6, r4, r8)
            com.google.android.gms.internal.ads.rm r11 = r0.f10888c
            r11.mo10552v(r8)
            com.google.android.gms.internal.ads.rm r11 = r0.f10888c
            int r11 = r11.mo10539i()
            r12 = -1
            int r11 = r11 + r12
            r0.f10905t = r11
            com.google.android.gms.internal.ads.rm r11 = r0.f10887b
            r11.mo10552v(r8)
            com.google.android.gms.internal.ads.rm r11 = r0.f10887b
            r12 = 4
            r9.mo8953c(r11, r12)
            com.google.android.gms.internal.ads.rm r11 = r0.f10888c
            r9.mo8953c(r11, r7)
            int r11 = r0.f10904s
            int r11 = r11 + 5
            r0.f10904s = r11
            int r11 = r0.f10903r
            int r11 = r11 + r6
            r0.f10903r = r11
            goto L_0x0122
        L_0x015a:
            int r11 = r9.mo8954d(r1, r11, r8)
            int r12 = r0.f10904s
            int r12 = r12 + r11
            r0.f10904s = r12
            int r12 = r0.f10905t
            int r12 = r12 - r11
            r0.f10905t = r12
            goto L_0x0122
        L_0x0169:
            long[] r1 = r3.f16301j
            r10 = r1[r2]
            int[] r1 = r3.f16300i
            r1 = r1[r2]
            long r12 = (long) r1
            long r10 = r10 + r12
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r12
            boolean r1 = r3.f16303l
            if (r7 == r1) goto L_0x017c
            r4 = r8
            goto L_0x017e
        L_0x017c:
            r4 = 1073741824(0x40000000, float:2.0)
        L_0x017e:
            boolean[] r6 = r3.f16302k
            boolean r2 = r6[r2]
            r12 = r4 | r2
            if (r1 == 0) goto L_0x01a4
            com.google.android.gms.internal.ads.ti r1 = r3.f16305n
            if (r1 != 0) goto L_0x0192
            com.google.android.gms.internal.ads.ti[] r1 = r5.f14454h
            com.google.android.gms.internal.ads.ii r2 = r3.f16292a
            int r2 = r2.f8658a
            r1 = r1[r2]
        L_0x0192:
            com.google.android.gms.internal.ads.li r2 = r0.f10902q
            com.google.android.gms.internal.ads.ti r4 = r2.f10057i
            if (r1 == r4) goto L_0x01a0
            com.google.android.gms.internal.ads.kh r2 = new com.google.android.gms.internal.ads.kh
            byte[] r4 = r1.f14865b
            r2.<init>(r7, r4)
            goto L_0x01a2
        L_0x01a0:
            com.google.android.gms.internal.ads.kh r2 = r2.f10056h
        L_0x01a2:
            r15 = r2
            goto L_0x01a6
        L_0x01a4:
            r1 = 0
            r15 = 0
        L_0x01a6:
            com.google.android.gms.internal.ads.li r2 = r0.f10902q
            r2.f10056h = r15
            r2.f10057i = r1
            int r13 = r0.f10903r
            r14 = 0
            r9.mo8951a(r10, r12, r13, r14, r15)
            java.util.LinkedList<com.google.android.gms.internal.ads.ki> r1 = r0.f10894i
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x01da
            com.google.android.gms.internal.ads.li r1 = r0.f10902q
            int r2 = r1.f10053e
            int r2 = r2 + r7
            r1.f10053e = r2
            int r2 = r1.f10054f
            int r2 = r2 + r7
            r1.f10054f = r2
            int[] r3 = r3.f16298g
            int r4 = r1.f10055g
            r3 = r3[r4]
            if (r2 != r3) goto L_0x01d6
            int r4 = r4 + r7
            r1.f10055g = r4
            r1.f10054f = r8
            r1 = 0
            r0.f10902q = r1
        L_0x01d6:
            r1 = 3
            r0.f10895j = r1
            return r8
        L_0x01da:
            r1 = 0
            java.util.LinkedList<com.google.android.gms.internal.ads.ki> r2 = r0.f10894i
            java.lang.Object r2 = r2.removeFirst()
            com.google.android.gms.internal.ads.ki r2 = (com.google.android.gms.internal.ads.C1889ki) r2
            int r2 = r2.f9539a
            throw r1
        L_0x01e6:
            android.util.SparseArray<com.google.android.gms.internal.ads.li> r2 = r0.f10886a
            int r2 = r2.size()
            r3 = r8
            r5 = 0
        L_0x01ee:
            if (r3 >= r2) goto L_0x0211
            android.util.SparseArray<com.google.android.gms.internal.ads.li> r4 = r0.f10886a
            java.lang.Object r4 = r4.valueAt(r3)
            com.google.android.gms.internal.ads.li r4 = (com.google.android.gms.internal.ads.C1926li) r4
            com.google.android.gms.internal.ads.vi r4 = r4.f10049a
            boolean r6 = r4.f16308q
            if (r6 == 0) goto L_0x020e
            long r6 = r4.f16294c
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x020e
            android.util.SparseArray<com.google.android.gms.internal.ads.li> r4 = r0.f10886a
            java.lang.Object r4 = r4.valueAt(r3)
            com.google.android.gms.internal.ads.li r4 = (com.google.android.gms.internal.ads.C1926li) r4
            r5 = r4
            r10 = r6
        L_0x020e:
            int r3 = r3 + 1
            goto L_0x01ee
        L_0x0211:
            if (r5 != 0) goto L_0x0218
            r2 = 3
        L_0x0214:
            r0.f10895j = r2
            goto L_0x0004
        L_0x0218:
            long r2 = r25.mo5857d()
            long r10 = r10 - r2
            int r2 = (int) r10
            if (r2 < 0) goto L_0x0237
            r1.mo5862i(r2, r8)
            com.google.android.gms.internal.ads.vi r2 = r5.f10049a
            com.google.android.gms.internal.ads.rm r3 = r2.f16307p
            byte[] r3 = r3.f13709a
            int r4 = r2.f16306o
            r1.mo5861h(r3, r8, r4, r8)
            com.google.android.gms.internal.ads.rm r3 = r2.f16307p
            r3.mo10552v(r8)
            r2.f16308q = r8
            goto L_0x0004
        L_0x0237:
            com.google.android.gms.internal.ads.af r1 = new com.google.android.gms.internal.ads.af
            java.lang.String r2 = "Offset to encryption data was negative."
            r1.<init>(r2)
            throw r1
        L_0x023f:
            long r2 = r0.f10897l
            int r2 = (int) r2
            int r3 = r0.f10898m
            int r2 = r2 - r3
            com.google.android.gms.internal.ads.rm r3 = r0.f10899n
            if (r3 == 0) goto L_0x0331
            byte[] r3 = r3.f13709a
            r1.mo5861h(r3, r6, r2, r8)
            com.google.android.gms.internal.ads.zh r2 = new com.google.android.gms.internal.ads.zh
            int r3 = r0.f10896k
            com.google.android.gms.internal.ads.rm r5 = r0.f10899n
            r2.<init>(r3, r5)
            long r9 = r25.mo5857d()
            java.util.Stack<com.google.android.gms.internal.ads.yh> r3 = r0.f10893h
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0270
            java.util.Stack<com.google.android.gms.internal.ads.yh> r3 = r0.f10893h
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.yh r3 = (com.google.android.gms.internal.ads.C2407yh) r3
            r3.mo12021g(r2)
            goto L_0x0334
        L_0x0270:
            int r3 = r2.f4206a
            int r5 = com.google.android.gms.internal.ads.C1518ai.f4116B
            if (r3 != r5) goto L_0x032e
            com.google.android.gms.internal.ads.rm r2 = r2.f18191P0
            r2.mo10552v(r6)
            int r3 = r2.mo10535e()
            r5 = 4
            r2.mo10553w(r5)
            long r5 = r2.mo10543m()
            int r3 = com.google.android.gms.internal.ads.C1518ai.m6088b(r3)
            if (r3 != 0) goto L_0x0296
            long r11 = r2.mo10543m()
            long r13 = r2.mo10543m()
            goto L_0x029e
        L_0x0296:
            long r11 = r2.mo10544n()
            long r13 = r2.mo10544n()
        L_0x029e:
            long r9 = r9 + r13
            r18 = r11
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r11 = r18
            r15 = r5
            long r20 = com.google.android.gms.internal.ads.C2449zm.m20731j(r11, r13, r15)
            r2.mo10553w(r4)
            int r3 = r2.mo10540j()
            int[] r4 = new int[r3]
            long[] r15 = new long[r3]
            long[] r13 = new long[r3]
            long[] r14 = new long[r3]
            r11 = r20
        L_0x02bc:
            if (r8 >= r3) goto L_0x030b
            int r16 = r2.mo10535e()
            r17 = -2147483648(0xffffffff80000000, float:-0.0)
            r17 = r16 & r17
            if (r17 != 0) goto L_0x0303
            long r22 = r2.mo10543m()
            r17 = 2147483647(0x7fffffff, float:NaN)
            r16 = r16 & r17
            r4[r8] = r16
            r15[r8] = r9
            r14[r8] = r11
            long r18 = r18 + r22
            r16 = 1000000(0xf4240, double:4.940656E-318)
            r11 = r18
            r22 = r3
            r7 = r13
            r3 = r14
            r13 = r16
            r1 = r15
            r15 = r5
            long r11 = com.google.android.gms.internal.ads.C2449zm.m20731j(r11, r13, r15)
            r13 = r3[r8]
            long r13 = r11 - r13
            r7[r8] = r13
            r13 = 4
            r2.mo10553w(r13)
            r14 = r4[r8]
            long r14 = (long) r14
            long r9 = r9 + r14
            int r8 = r8 + 1
            r15 = r1
            r14 = r3
            r13 = r7
            r3 = r22
            r7 = 1
            r1 = r25
            goto L_0x02bc
        L_0x0303:
            com.google.android.gms.internal.ads.af r1 = new com.google.android.gms.internal.ads.af
            java.lang.String r2 = "Unhandled indirect reference"
            r1.<init>(r2)
            throw r1
        L_0x030b:
            r7 = r13
            r3 = r14
            r1 = r15
            java.lang.Long r2 = java.lang.Long.valueOf(r20)
            com.google.android.gms.internal.ads.ah r5 = new com.google.android.gms.internal.ads.ah
            r5.<init>(r4, r1, r7, r3)
            android.util.Pair r1 = android.util.Pair.create(r2, r5)
            java.lang.Object r2 = r1.first
            java.lang.Long r2 = (java.lang.Long) r2
            r2.longValue()
            com.google.android.gms.internal.ads.dh r2 = r0.f10906u
            java.lang.Object r1 = r1.second
            com.google.android.gms.internal.ads.jh r1 = (com.google.android.gms.internal.ads.C1851jh) r1
            r2.mo6475b(r1)
            r1 = 1
            r0.f10907v = r1
        L_0x032e:
            r1 = r25
            goto L_0x0334
        L_0x0331:
            r1.mo5862i(r2, r8)
        L_0x0334:
            long r2 = r25.mo5857d()
        L_0x0338:
            r0.m13308h(r2)
            goto L_0x0004
        L_0x033d:
            int r2 = r0.f10898m
            if (r2 != 0) goto L_0x0365
            com.google.android.gms.internal.ads.rm r2 = r0.f10891f
            byte[] r2 = r2.f13709a
            r3 = 1
            boolean r2 = r1.mo5861h(r2, r8, r6, r3)
            if (r2 != 0) goto L_0x034e
            r2 = -1
            return r2
        L_0x034e:
            r0.f10898m = r6
            com.google.android.gms.internal.ads.rm r2 = r0.f10891f
            r2.mo10552v(r8)
            com.google.android.gms.internal.ads.rm r2 = r0.f10891f
            long r2 = r2.mo10543m()
            r0.f10897l = r2
            com.google.android.gms.internal.ads.rm r2 = r0.f10891f
            int r2 = r2.mo10535e()
            r0.f10896k = r2
        L_0x0365:
            long r2 = r0.f10897l
            r9 = 1
            int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x0381
            com.google.android.gms.internal.ads.rm r2 = r0.f10891f
            byte[] r2 = r2.f13709a
            r1.mo5861h(r2, r6, r6, r8)
            int r2 = r0.f10898m
            int r2 = r2 + r6
            r0.f10898m = r2
            com.google.android.gms.internal.ads.rm r2 = r0.f10891f
            long r2 = r2.mo10544n()
            r0.f10897l = r2
        L_0x0381:
            int r5 = r0.f10898m
            long r9 = (long) r5
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 < 0) goto L_0x04b0
            long r2 = r25.mo5857d()
            int r5 = r0.f10898m
            long r9 = (long) r5
            long r2 = r2 - r9
            int r5 = r0.f10896k
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4136L
            if (r5 != r7) goto L_0x03b0
            android.util.SparseArray<com.google.android.gms.internal.ads.li> r5 = r0.f10886a
            int r5 = r5.size()
            r7 = r8
        L_0x039d:
            if (r7 >= r5) goto L_0x03b0
            android.util.SparseArray<com.google.android.gms.internal.ads.li> r9 = r0.f10886a
            java.lang.Object r9 = r9.valueAt(r7)
            com.google.android.gms.internal.ads.li r9 = (com.google.android.gms.internal.ads.C1926li) r9
            com.google.android.gms.internal.ads.vi r9 = r9.f10049a
            r9.f16294c = r2
            r9.f16293b = r2
            int r7 = r7 + 1
            goto L_0x039d
        L_0x03b0:
            int r5 = r0.f10896k
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4170i
            if (r5 != r7) goto L_0x03d5
            r7 = 0
            r0.f10902q = r7
            long r5 = r0.f10897l
            long r2 = r2 + r5
            r0.f10900o = r2
            boolean r2 = r0.f10907v
            if (r2 != 0) goto L_0x03d1
            com.google.android.gms.internal.ads.dh r2 = r0.f10906u
            com.google.android.gms.internal.ads.ih r3 = new com.google.android.gms.internal.ads.ih
            long r5 = r0.f10901p
            r3.<init>(r5)
            r2.mo6475b(r3)
            r2 = 1
            r0.f10907v = r2
        L_0x03d1:
            r0.f10895j = r4
            goto L_0x0004
        L_0x03d5:
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4118C
            if (r5 == r2) goto L_0x048f
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4122E
            if (r5 == r2) goto L_0x048f
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4124F
            if (r5 == r2) goto L_0x048f
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4126G
            if (r5 == r2) goto L_0x048f
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4128H
            if (r5 == r2) goto L_0x048f
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4136L
            if (r5 == r2) goto L_0x048f
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4138M
            if (r5 == r2) goto L_0x048f
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4140N
            if (r5 == r2) goto L_0x048f
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4145Q
            if (r5 != r2) goto L_0x03fb
            goto L_0x048f
        L_0x03fb:
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4148T
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r5 == r2) goto L_0x0461
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4147S
            if (r5 == r2) goto L_0x0461
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4120D
            if (r5 == r2) goto L_0x0461
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4116B
            if (r5 == r2) goto L_0x0461
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4149U
            if (r5 == r2) goto L_0x0461
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4200x
            if (r5 == r2) goto L_0x0461
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4202y
            if (r5 == r2) goto L_0x0461
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4144P
            if (r5 == r2) goto L_0x0461
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4204z
            if (r5 == r2) goto L_0x0461
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4114A
            if (r5 == r2) goto L_0x0461
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4150V
            if (r5 == r2) goto L_0x0461
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4161d0
            if (r5 == r2) goto L_0x0461
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4163e0
            if (r5 == r2) goto L_0x0461
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4171i0
            if (r5 == r2) goto L_0x0461
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4169h0
            if (r5 == r2) goto L_0x0461
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4165f0
            if (r5 == r2) goto L_0x0461
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4167g0
            if (r5 == r2) goto L_0x0461
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4146R
            if (r5 == r2) goto L_0x0461
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4142O
            if (r5 == r2) goto L_0x0461
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4127G0
            if (r5 != r2) goto L_0x044f
            goto L_0x0461
        L_0x044f:
            long r5 = r0.f10897l
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0459
            r2 = 0
            r0.f10899n = r2
            goto L_0x047c
        L_0x0459:
            com.google.android.gms.internal.ads.af r1 = new com.google.android.gms.internal.ads.af
            java.lang.String r2 = "Skipping atom with length > 2147483647 (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x0461:
            int r2 = r0.f10898m
            if (r2 != r6) goto L_0x0487
            long r9 = r0.f10897l
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x047f
            com.google.android.gms.internal.ads.rm r2 = new com.google.android.gms.internal.ads.rm
            int r3 = (int) r9
            r2.<init>((int) r3)
            r0.f10899n = r2
            com.google.android.gms.internal.ads.rm r3 = r0.f10891f
            byte[] r3 = r3.f13709a
            byte[] r2 = r2.f13709a
            java.lang.System.arraycopy(r3, r8, r2, r8, r6)
        L_0x047c:
            r2 = 1
            goto L_0x0214
        L_0x047f:
            com.google.android.gms.internal.ads.af r1 = new com.google.android.gms.internal.ads.af
            java.lang.String r2 = "Leaf atom with length > 2147483647 (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x0487:
            com.google.android.gms.internal.ads.af r1 = new com.google.android.gms.internal.ads.af
            java.lang.String r2 = "Leaf atom defines extended atom size (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x048f:
            long r2 = r25.mo5857d()
            long r4 = r0.f10897l
            long r2 = r2 + r4
            r4 = -8
            long r2 = r2 + r4
            java.util.Stack<com.google.android.gms.internal.ads.yh> r4 = r0.f10893h
            com.google.android.gms.internal.ads.yh r5 = new com.google.android.gms.internal.ads.yh
            int r6 = r0.f10896k
            r5.<init>(r6, r2)
            r4.add(r5)
            long r4 = r0.f10897l
            int r6 = r0.f10898m
            long r6 = (long) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0056
            goto L_0x0338
        L_0x04b0:
            com.google.android.gms.internal.ads.af r1 = new com.google.android.gms.internal.ads.af
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1963mi.mo6198e(com.google.android.gms.internal.ads.bh, com.google.android.gms.internal.ads.hh):int");
    }

    /* renamed from: f */
    public final void mo6199f(C1628dh dhVar) {
        this.f10906u = dhVar;
    }
}
