package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.hi */
final class C1778hi {

    /* renamed from: a */
    private static final int f8249a = C2449zm.m20728g("vide");

    /* renamed from: b */
    private static final int f8250b = C2449zm.m20728g("soun");

    /* renamed from: c */
    private static final int f8251c = C2449zm.m20728g("text");

    /* renamed from: d */
    private static final int f8252d = C2449zm.m20728g("sbtl");

    /* renamed from: e */
    private static final int f8253e = C2449zm.m20728g("subt");

    /* renamed from: f */
    private static final int f8254f = C2449zm.m20728g("clcp");

    /* renamed from: g */
    private static final int f8255g = C2449zm.m20728g("cenc");

    /* renamed from: h */
    private static final int f8256h = C2449zm.m20728g("meta");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v11, resolved type: byte[]} */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x055c: MOVE  (r6v19 java.lang.String) = (r45v0 java.lang.String)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x07e0  */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x0833  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x083c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x083d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01b5  */
    /* renamed from: a */
    public static com.google.android.gms.internal.ads.C2185si m10579a(com.google.android.gms.internal.ads.C2407yh r51, com.google.android.gms.internal.ads.C2444zh r52, long r53, com.google.android.gms.internal.ads.C2406yg r55, boolean r56) {
        /*
            r0 = r51
            r15 = r55
            int r1 = com.google.android.gms.internal.ads.C1518ai.f4124F
            com.google.android.gms.internal.ads.yh r1 = r0.mo12018d(r1)
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4148T
            com.google.android.gms.internal.ads.zh r2 = r1.mo12019e(r2)
            com.google.android.gms.internal.ads.rm r2 = r2.f18191P0
            r14 = 16
            r2.mo10552v(r14)
            int r2 = r2.mo10535e()
            int r3 = f8250b
            r4 = 4
            r12 = 3
            r11 = -1
            if (r2 != r3) goto L_0x0024
            r10 = 1
            goto L_0x0044
        L_0x0024:
            int r3 = f8249a
            if (r2 != r3) goto L_0x002a
            r10 = 2
            goto L_0x0044
        L_0x002a:
            int r3 = f8251c
            if (r2 == r3) goto L_0x0043
            int r3 = f8252d
            if (r2 == r3) goto L_0x0043
            int r3 = f8253e
            if (r2 == r3) goto L_0x0043
            int r3 = f8254f
            if (r2 != r3) goto L_0x003b
            goto L_0x0043
        L_0x003b:
            int r3 = f8256h
            if (r2 != r3) goto L_0x0041
            r10 = r4
            goto L_0x0044
        L_0x0041:
            r10 = r11
            goto L_0x0044
        L_0x0043:
            r10 = r12
        L_0x0044:
            r8 = 0
            if (r10 != r11) goto L_0x0048
            return r8
        L_0x0048:
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4144P
            com.google.android.gms.internal.ads.zh r2 = r0.mo12019e(r2)
            com.google.android.gms.internal.ads.rm r2 = r2.f18191P0
            r7 = 8
            r2.mo10552v(r7)
            int r3 = r2.mo10535e()
            int r3 = com.google.android.gms.internal.ads.C1518ai.m6088b(r3)
            if (r3 != 0) goto L_0x0061
            r5 = r7
            goto L_0x0062
        L_0x0061:
            r5 = r14
        L_0x0062:
            r2.mo10553w(r5)
            int r5 = r2.mo10535e()
            r2.mo10553w(r4)
            int r6 = r2.mo10533c()
            if (r3 != 0) goto L_0x0074
            r13 = r4
            goto L_0x0075
        L_0x0074:
            r13 = r7
        L_0x0075:
            r9 = 0
        L_0x0076:
            r19 = 0
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 >= r13) goto L_0x009b
            byte[] r8 = r2.f13709a
            int r24 = r6 + r9
            byte r8 = r8[r24]
            if (r8 == r11) goto L_0x0097
            if (r3 != 0) goto L_0x008e
            long r8 = r2.mo10543m()
            goto L_0x0092
        L_0x008e:
            long r8 = r2.mo10544n()
        L_0x0092:
            int r3 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x00a0
            goto L_0x009e
        L_0x0097:
            int r9 = r9 + 1
            r8 = 0
            goto L_0x0076
        L_0x009b:
            r2.mo10553w(r13)
        L_0x009e:
            r8 = r21
        L_0x00a0:
            r2.mo10553w(r14)
            int r3 = r2.mo10535e()
            int r6 = r2.mo10535e()
            r2.mo10553w(r4)
            int r13 = r2.mo10535e()
            int r2 = r2.mo10535e()
            r4 = 65536(0x10000, float:9.18355E-41)
            r14 = -65536(0xffffffffffff0000, float:NaN)
            if (r3 != 0) goto L_0x00ca
            if (r6 != r4) goto L_0x00c9
            if (r13 != r14) goto L_0x00c8
            if (r2 != 0) goto L_0x00c5
            r2 = 90
            goto L_0x00e8
        L_0x00c5:
            r6 = r4
            r13 = r14
            goto L_0x00c9
        L_0x00c8:
            r6 = r4
        L_0x00c9:
            r3 = 0
        L_0x00ca:
            if (r3 != 0) goto L_0x00db
            if (r6 != r14) goto L_0x00d8
            if (r13 != r4) goto L_0x00d5
            if (r2 != 0) goto L_0x00d6
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x00e8
        L_0x00d5:
            r4 = r13
        L_0x00d6:
            r6 = r14
            goto L_0x00d9
        L_0x00d8:
            r4 = r13
        L_0x00d9:
            r3 = 0
            goto L_0x00dc
        L_0x00db:
            r4 = r13
        L_0x00dc:
            if (r3 != r14) goto L_0x00e7
            if (r6 != 0) goto L_0x00e7
            if (r4 != 0) goto L_0x00e7
            if (r2 != r14) goto L_0x00e7
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x00e8
        L_0x00e7:
            r2 = 0
        L_0x00e8:
            com.google.android.gms.internal.ads.gi r14 = new com.google.android.gms.internal.ads.gi
            r14.<init>(r5, r8, r2)
            int r2 = (r53 > r21 ? 1 : (r53 == r21 ? 0 : -1))
            if (r2 != 0) goto L_0x00fa
            long r2 = r14.f7491b
            r26 = r2
            r2 = r52
            goto L_0x00fe
        L_0x00fa:
            r2 = r52
            r26 = r53
        L_0x00fe:
            com.google.android.gms.internal.ads.rm r2 = r2.f18191P0
            r2.mo10552v(r7)
            int r3 = r2.mo10535e()
            int r3 = com.google.android.gms.internal.ads.C1518ai.m6088b(r3)
            if (r3 != 0) goto L_0x010f
            r3 = r7
            goto L_0x0111
        L_0x010f:
            r3 = 16
        L_0x0111:
            r2.mo10553w(r3)
            long r32 = r2.mo10543m()
            int r2 = (r26 > r21 ? 1 : (r26 == r21 ? 0 : -1))
            if (r2 != 0) goto L_0x011f
            r26 = r21
            goto L_0x012a
        L_0x011f:
            r28 = 1000000(0xf4240, double:4.940656E-318)
            r30 = r32
            long r2 = com.google.android.gms.internal.ads.C2449zm.m20731j(r26, r28, r30)
            r26 = r2
        L_0x012a:
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4126G
            com.google.android.gms.internal.ads.yh r2 = r1.mo12018d(r2)
            int r3 = com.google.android.gms.internal.ads.C1518ai.f4128H
            com.google.android.gms.internal.ads.yh r2 = r2.mo12018d(r3)
            int r3 = com.google.android.gms.internal.ads.C1518ai.f4147S
            com.google.android.gms.internal.ads.zh r1 = r1.mo12019e(r3)
            com.google.android.gms.internal.ads.rm r1 = r1.f18191P0
            r1.mo10552v(r7)
            int r3 = r1.mo10535e()
            int r3 = com.google.android.gms.internal.ads.C1518ai.m6088b(r3)
            if (r3 != 0) goto L_0x014d
            r4 = r7
            goto L_0x014f
        L_0x014d:
            r4 = 16
        L_0x014f:
            r1.mo10553w(r4)
            long r4 = r1.mo10543m()
            if (r3 != 0) goto L_0x015a
            r3 = 4
            goto L_0x015b
        L_0x015a:
            r3 = r7
        L_0x015b:
            r1.mo10553w(r3)
            int r1 = r1.mo10540j()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r12)
            int r6 = r1 >> 10
            r6 = r6 & 31
            int r6 = r6 + 96
            char r6 = (char) r6
            r3.append(r6)
            int r6 = r1 >> 5
            r6 = r6 & 31
            int r6 = r6 + 96
            char r6 = (char) r6
            r3.append(r6)
            r1 = r1 & 31
            int r1 = r1 + 96
            char r1 = (char) r1
            r3.append(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r3 = r3.toString()
            android.util.Pair r13 = android.util.Pair.create(r1, r3)
            int r1 = com.google.android.gms.internal.ads.C1518ai.f4149U
            com.google.android.gms.internal.ads.zh r1 = r2.mo12019e(r1)
            com.google.android.gms.internal.ads.rm r9 = r1.f18191P0
            int r21 = r14.f7490a
            int r22 = r14.f7492c
            java.lang.Object r1 = r13.second
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            r1 = 12
            r9.mo10552v(r1)
            int r6 = r9.mo10535e()
            com.google.android.gms.internal.ads.di r5 = new com.google.android.gms.internal.ads.di
            r5.<init>(r6)
            r4 = 0
        L_0x01b3:
            if (r4 >= r6) goto L_0x07c4
            int r3 = r9.mo10533c()
            int r2 = r9.mo10535e()
            if (r2 <= 0) goto L_0x01c1
            r1 = 1
            goto L_0x01c2
        L_0x01c1:
            r1 = 0
        L_0x01c2:
            java.lang.String r12 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.C1856jm.m11729d(r1, r12)
            int r1 = r9.mo10535e()
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4158c
            if (r1 == r7) goto L_0x05c0
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4160d
            if (r1 == r7) goto L_0x05c0
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4155a0
            if (r1 == r7) goto L_0x05c0
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4177l0
            if (r1 == r7) goto L_0x05c0
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4162e
            if (r1 == r7) goto L_0x05c0
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4164f
            if (r1 == r7) goto L_0x05c0
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4166g
            if (r1 == r7) goto L_0x05c0
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4135K0
            if (r1 == r7) goto L_0x05c0
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4137L0
            if (r1 != r7) goto L_0x01f1
            goto L_0x05c0
        L_0x01f1:
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4172j
            if (r1 == r7) goto L_0x030a
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4157b0
            if (r1 == r7) goto L_0x030a
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4182o
            if (r1 == r7) goto L_0x030a
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4186q
            if (r1 == r7) goto L_0x030a
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4190s
            if (r1 == r7) goto L_0x030a
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4196v
            if (r1 == r7) goto L_0x030a
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4192t
            if (r1 == r7) goto L_0x030a
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4194u
            if (r1 == r7) goto L_0x030a
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4203y0
            if (r1 == r7) goto L_0x030a
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4205z0
            if (r1 == r7) goto L_0x030a
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4178m
            if (r1 == r7) goto L_0x030a
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4180n
            if (r1 == r7) goto L_0x030a
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4174k
            if (r1 == r7) goto L_0x030a
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4143O0
            if (r1 != r7) goto L_0x022b
            goto L_0x030a
        L_0x022b:
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4175k0
            if (r1 == r7) goto L_0x026c
            int r12 = com.google.android.gms.internal.ads.C1518ai.f4195u0
            if (r1 == r12) goto L_0x026c
            int r12 = com.google.android.gms.internal.ads.C1518ai.f4197v0
            if (r1 == r12) goto L_0x026c
            int r12 = com.google.android.gms.internal.ads.C1518ai.f4199w0
            if (r1 == r12) goto L_0x026c
            int r12 = com.google.android.gms.internal.ads.C1518ai.f4201x0
            if (r1 != r12) goto L_0x0240
            goto L_0x026c
        L_0x0240:
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4141N0
            if (r1 != r7) goto L_0x0251
            java.lang.String r1 = java.lang.Integer.toString(r21)
            java.lang.String r7 = "application/x-camera-motion"
            r12 = 0
            com.google.android.gms.internal.ads.xe r1 = com.google.android.gms.internal.ads.C2367xe.m19468k(r1, r7, r12, r11, r15)
            r5.f5818b = r1
        L_0x0251:
            r35 = r2
            r24 = r3
            r36 = r4
            r0 = r5
            r31 = r6
            r34 = r8
            r50 = r9
            r18 = r10
            r28 = r11
            r47 = r13
            r16 = r14
            r23 = 3
            r25 = 16
            goto L_0x0373
        L_0x026c:
            r12 = 0
            int r11 = r3 + 16
            r9.mo10552v(r11)
            java.lang.String r11 = "application/ttml+xml"
            r29 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 != r7) goto L_0x0282
            r7 = r11
            r17 = r12
            r11 = 1
            r18 = 0
            goto L_0x02bc
        L_0x0282:
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4195u0
            if (r1 != r7) goto L_0x029a
            int r1 = r2 + -16
            byte[] r7 = new byte[r1]
            r11 = 0
            r9.mo10547q(r7, r11, r1)
            java.util.List r1 = java.util.Collections.singletonList(r7)
            java.lang.String r7 = "application/x-quicktime-tx3g"
            r17 = r1
            r18 = r11
        L_0x0298:
            r11 = 1
            goto L_0x02bc
        L_0x029a:
            r18 = 0
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4197v0
            if (r1 != r7) goto L_0x02a6
            java.lang.String r1 = "application/x-mp4-vtt"
            r7 = r1
            r17 = r12
            goto L_0x0298
        L_0x02a6:
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4199w0
            if (r1 != r7) goto L_0x02b0
            r7 = r11
            r17 = r12
            r29 = r19
            goto L_0x0298
        L_0x02b0:
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4201x0
            if (r1 != r7) goto L_0x0304
            r11 = 1
            r5.f5820d = r11
            java.lang.String r1 = "application/x-mp4-cea-608"
            r7 = r1
            r17 = r12
        L_0x02bc:
            java.lang.String r1 = java.lang.Integer.toString(r21)
            r31 = 0
            r34 = -1
            r35 = 0
            r36 = -1
            r52 = r13
            r13 = r2
            r2 = r7
            r7 = r3
            r3 = r31
            r37 = r4
            r4 = r34
            r38 = r5
            r5 = r35
            r31 = r6
            r6 = r8
            r39 = r7
            r7 = r36
            r40 = r8
            r8 = r55
            r41 = r9
            r18 = r10
            r9 = r29
            r0 = r11
            r11 = r17
            com.google.android.gms.internal.ads.xe r1 = com.google.android.gms.internal.ads.C2367xe.m19469l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
            r11 = r38
            r11.f5818b = r1
            r47 = r52
            r0 = r11
            r35 = r13
            r16 = r14
            r36 = r37
            r24 = r39
            r34 = r40
            r50 = r41
            goto L_0x036d
        L_0x0304:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x030a:
            r39 = r3
            r37 = r4
            r11 = r5
            r31 = r6
            r40 = r8
            r41 = r9
            r18 = r10
            r52 = r13
            r0 = 1
            r10 = 0
            r13 = r2
            r9 = r39
            int r3 = r9 + 16
            r8 = r41
            r8.mo10552v(r3)
            r2 = 6
            if (r56 == 0) goto L_0x0332
            int r3 = r8.mo10540j()
            r8.mo10553w(r2)
            r7 = 8
            goto L_0x0338
        L_0x0332:
            r7 = 8
            r8.mo10553w(r7)
            r3 = 0
        L_0x0338:
            if (r3 == 0) goto L_0x0377
            if (r3 != r0) goto L_0x033d
            goto L_0x0377
        L_0x033d:
            r6 = 2
            if (r3 != r6) goto L_0x035e
            r2 = 16
            r8.mo10553w(r2)
            long r2 = r8.mo10542l()
            double r2 = java.lang.Double.longBitsToDouble(r2)
            long r2 = java.lang.Math.round(r2)
            int r2 = (int) r2
            int r3 = r8.mo10539i()
            r4 = 20
            r8.mo10553w(r4)
            r5 = 16
            goto L_0x038b
        L_0x035e:
            r47 = r52
            r50 = r8
            r24 = r9
            r0 = r11
            r35 = r13
            r16 = r14
            r36 = r37
            r34 = r40
        L_0x036d:
            r23 = 3
            r25 = 16
            r28 = -1
        L_0x0373:
            r29 = 0
            goto L_0x07a3
        L_0x0377:
            r6 = 2
            int r4 = r8.mo10540j()
            r8.mo10553w(r2)
            int r2 = r8.mo10538h()
            r5 = 16
            if (r3 != r0) goto L_0x038a
            r8.mo10553w(r5)
        L_0x038a:
            r3 = r4
        L_0x038b:
            int r4 = r8.mo10533c()
            int r5 = com.google.android.gms.internal.ads.C1518ai.f4157b0
            if (r1 != r5) goto L_0x039d
            r5 = r37
            int r1 = m10583e(r8, r9, r13, r11, r5)
            r8.mo10552v(r4)
            goto L_0x039f
        L_0x039d:
            r5 = r37
        L_0x039f:
            int r6 = com.google.android.gms.internal.ads.C1518ai.f4182o
            java.lang.String r0 = "audio/raw"
            if (r1 != r6) goto L_0x03a8
            java.lang.String r1 = "audio/ac3"
            goto L_0x03f1
        L_0x03a8:
            int r6 = com.google.android.gms.internal.ads.C1518ai.f4186q
            if (r1 != r6) goto L_0x03af
            java.lang.String r1 = "audio/eac3"
            goto L_0x03f1
        L_0x03af:
            int r6 = com.google.android.gms.internal.ads.C1518ai.f4190s
            if (r1 != r6) goto L_0x03b6
            java.lang.String r1 = "audio/vnd.dts"
            goto L_0x03f1
        L_0x03b6:
            int r6 = com.google.android.gms.internal.ads.C1518ai.f4192t
            if (r1 == r6) goto L_0x03ef
            int r6 = com.google.android.gms.internal.ads.C1518ai.f4194u
            if (r1 != r6) goto L_0x03bf
            goto L_0x03ef
        L_0x03bf:
            int r6 = com.google.android.gms.internal.ads.C1518ai.f4196v
            if (r1 != r6) goto L_0x03c6
            java.lang.String r1 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x03f1
        L_0x03c6:
            int r6 = com.google.android.gms.internal.ads.C1518ai.f4203y0
            if (r1 != r6) goto L_0x03cd
            java.lang.String r1 = "audio/3gpp"
            goto L_0x03f1
        L_0x03cd:
            int r6 = com.google.android.gms.internal.ads.C1518ai.f4205z0
            if (r1 != r6) goto L_0x03d4
            java.lang.String r1 = "audio/amr-wb"
            goto L_0x03f1
        L_0x03d4:
            int r6 = com.google.android.gms.internal.ads.C1518ai.f4178m
            if (r1 == r6) goto L_0x03ed
            int r6 = com.google.android.gms.internal.ads.C1518ai.f4180n
            if (r1 != r6) goto L_0x03dd
            goto L_0x03ed
        L_0x03dd:
            int r6 = com.google.android.gms.internal.ads.C1518ai.f4174k
            if (r1 != r6) goto L_0x03e4
            java.lang.String r1 = "audio/mpeg"
            goto L_0x03f1
        L_0x03e4:
            int r6 = com.google.android.gms.internal.ads.C1518ai.f4143O0
            if (r1 != r6) goto L_0x03eb
            java.lang.String r1 = "audio/alac"
            goto L_0x03f1
        L_0x03eb:
            r1 = r10
            goto L_0x03f1
        L_0x03ed:
            r1 = r0
            goto L_0x03f1
        L_0x03ef:
            java.lang.String r1 = "audio/vnd.dts.hd"
        L_0x03f1:
            r6 = r1
            r29 = r2
            r28 = r3
            r30 = r10
        L_0x03f8:
            int r1 = r4 - r9
            if (r1 >= r13) goto L_0x0546
            r8.mo10552v(r4)
            int r3 = r8.mo10535e()
            if (r3 <= 0) goto L_0x0407
            r1 = 1
            goto L_0x0408
        L_0x0407:
            r1 = 0
        L_0x0408:
            com.google.android.gms.internal.ads.C1856jm.m11729d(r1, r12)
            int r1 = r8.mo10535e()
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4134K
            if (r1 == r2) goto L_0x04c5
            if (r56 == 0) goto L_0x041b
            int r7 = com.google.android.gms.internal.ads.C1518ai.f4176l
            if (r1 != r7) goto L_0x041b
            goto L_0x04c5
        L_0x041b:
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4184p
            if (r1 != r2) goto L_0x0443
            int r1 = r4 + 8
            r8.mo10552v(r1)
            java.lang.String r1 = java.lang.Integer.toString(r21)
            r7 = r40
            com.google.android.gms.internal.ads.xe r1 = com.google.android.gms.internal.ads.C1849jf.m11636b(r8, r1, r7, r15)
        L_0x042e:
            r11.f5818b = r1
            r44 = r5
            r45 = r6
            r34 = r7
            r15 = r8
            r46 = r9
            r35 = r13
            r16 = 2
            r25 = 16
            r13 = r11
        L_0x0440:
            r11 = 0
            goto L_0x04c0
        L_0x0443:
            r7 = r40
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4188r
            if (r1 != r2) goto L_0x0457
            int r1 = r4 + 8
            r8.mo10552v(r1)
            java.lang.String r1 = java.lang.Integer.toString(r21)
            com.google.android.gms.internal.ads.xe r1 = com.google.android.gms.internal.ads.C1849jf.m11637c(r8, r1, r7, r15)
            goto L_0x042e
        L_0x0457:
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4198w
            if (r1 != r2) goto L_0x049b
            java.lang.String r1 = java.lang.Integer.toString(r21)
            r34 = 0
            r35 = -1
            r36 = -1
            r37 = 0
            r38 = 0
            r2 = r6
            r42 = r3
            r3 = r34
            r43 = r4
            r4 = r35
            r44 = r5
            r25 = 16
            r5 = r36
            r45 = r6
            r16 = 2
            r6 = r28
            r34 = r7
            r7 = r29
            r15 = r8
            r8 = r37
            r46 = r9
            r9 = r55
            r10 = r38
            r35 = r13
            r13 = r11
            r11 = r34
            com.google.android.gms.internal.ads.xe r1 = com.google.android.gms.internal.ads.C2367xe.m19465h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.f5818b = r1
            r3 = r42
        L_0x0498:
            r4 = r43
            goto L_0x0440
        L_0x049b:
            r42 = r3
            r43 = r4
            r44 = r5
            r45 = r6
            r34 = r7
            r15 = r8
            r46 = r9
            r35 = r13
            r16 = 2
            r25 = 16
            r13 = r11
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4143O0
            if (r1 != r2) goto L_0x0498
            byte[] r1 = new byte[r3]
            r4 = r43
            r15.mo10552v(r4)
            r11 = 0
            r15.mo10547q(r1, r11, r3)
            r30 = r1
        L_0x04c0:
            r6 = r45
            r10 = -1
            goto L_0x0534
        L_0x04c5:
            r44 = r5
            r45 = r6
            r15 = r8
            r46 = r9
            r35 = r13
            r34 = r40
            r16 = 2
            r25 = 16
            r13 = r11
            r11 = 0
            if (r1 != r2) goto L_0x04db
            r1 = r4
        L_0x04d9:
            r10 = -1
            goto L_0x04fe
        L_0x04db:
            int r1 = r15.mo10533c()
        L_0x04df:
            int r2 = r1 - r4
            if (r2 >= r3) goto L_0x04fc
            r15.mo10552v(r1)
            int r2 = r15.mo10535e()
            if (r2 <= 0) goto L_0x04ee
            r9 = 1
            goto L_0x04ef
        L_0x04ee:
            r9 = r11
        L_0x04ef:
            com.google.android.gms.internal.ads.C1856jm.m11729d(r9, r12)
            int r5 = r15.mo10535e()
            int r6 = com.google.android.gms.internal.ads.C1518ai.f4134K
            if (r5 == r6) goto L_0x04d9
            int r1 = r1 + r2
            goto L_0x04df
        L_0x04fc:
            r1 = -1
            goto L_0x04d9
        L_0x04fe:
            if (r1 == r10) goto L_0x0532
            android.util.Pair r1 = m10584f(r15, r1)
            java.lang.Object r2 = r1.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.second
            r30 = r1
            byte[] r30 = (byte[]) r30
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0530
            android.util.Pair r1 = com.google.android.gms.internal.ads.C1893km.m12245a(r30)
            java.lang.Object r5 = r1.first
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r28 = r1
            r6 = r2
            r29 = r5
            goto L_0x0534
        L_0x0530:
            r6 = r2
            goto L_0x0534
        L_0x0532:
            r6 = r45
        L_0x0534:
            int r4 = r4 + r3
            r11 = r13
            r8 = r15
            r40 = r34
            r13 = r35
            r5 = r44
            r9 = r46
            r7 = 8
            r10 = 0
            r15 = r55
            goto L_0x03f8
        L_0x0546:
            r44 = r5
            r45 = r6
            r15 = r8
            r46 = r9
            r35 = r13
            r34 = r40
            r10 = -1
            r16 = 2
            r25 = 16
            r13 = r11
            r11 = 0
            com.google.android.gms.internal.ads.xe r1 = r13.f5818b
            if (r1 != 0) goto L_0x05ad
            r6 = r45
            if (r6 == 0) goto L_0x05ad
            boolean r0 = r0.equals(r6)
            r1 = 1
            if (r1 == r0) goto L_0x0569
            r8 = r10
            goto L_0x056b
        L_0x0569:
            r8 = r16
        L_0x056b:
            java.lang.String r1 = java.lang.Integer.toString(r21)
            if (r30 != 0) goto L_0x0573
            r0 = 0
            goto L_0x0577
        L_0x0573:
            java.util.List r0 = java.util.Collections.singletonList(r30)
        L_0x0577:
            r3 = 0
            r4 = -1
            r5 = -1
            r9 = -1
            r12 = -1
            r23 = 0
            r30 = 0
            r2 = r6
            r6 = r28
            r7 = r29
            r28 = r10
            r10 = r12
            r29 = r11
            r11 = r0
            r0 = 3
            r12 = r55
            r47 = r52
            r0 = r13
            r48 = r35
            r13 = r23
            r16 = r14
            r14 = r34
            r49 = r15
            r15 = r30
            com.google.android.gms.internal.ads.xe r1 = com.google.android.gms.internal.ads.C2367xe.m19466i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.f5818b = r1
            r36 = r44
            r24 = r46
            r50 = r49
            r23 = 3
            goto L_0x07a1
        L_0x05ad:
            r47 = r52
            r28 = r10
            r29 = r11
            r0 = r13
            r16 = r14
            r50 = r15
            r36 = r44
            r24 = r46
            r23 = 3
            goto L_0x07a3
        L_0x05c0:
            r48 = r2
            r46 = r3
            r44 = r4
            r0 = r5
            r31 = r6
            r34 = r8
            r49 = r9
            r18 = r10
            r28 = r11
            r47 = r13
            r16 = r14
            r29 = 0
            r15 = r46
            int r3 = r15 + 16
            r14 = r49
            r14.mo10552v(r3)
            r13 = 16
            r14.mo10553w(r13)
            int r6 = r14.mo10540j()
            int r7 = r14.mo10540j()
            r2 = 50
            r14.mo10553w(r2)
            int r2 = r14.mo10533c()
            int r3 = com.google.android.gms.internal.ads.C1518ai.f4155a0
            r11 = r44
            r10 = r48
            if (r1 != r3) goto L_0x0605
            int r1 = m10583e(r14, r15, r10, r0, r11)
            r14.mo10552v(r2)
        L_0x0605:
            r3 = 1065353216(0x3f800000, float:1.0)
            r23 = r3
            r30 = r28
            r4 = r29
            r3 = 0
            r9 = 0
            r25 = 0
        L_0x0611:
            int r5 = r2 - r15
            if (r5 >= r10) goto L_0x0761
            r14.mo10552v(r2)
            int r5 = r14.mo10533c()
            int r8 = r14.mo10535e()
            if (r8 != 0) goto L_0x062d
            int r8 = r14.mo10533c()
            int r8 = r8 - r15
            if (r8 != r10) goto L_0x062b
            goto L_0x0761
        L_0x062b:
            r8 = r29
        L_0x062d:
            if (r8 <= 0) goto L_0x0631
            r13 = 1
            goto L_0x0633
        L_0x0631:
            r13 = r29
        L_0x0633:
            com.google.android.gms.internal.ads.C1856jm.m11729d(r13, r12)
            int r13 = r14.mo10535e()
            r48 = r10
            int r10 = com.google.android.gms.internal.ads.C1518ai.f4130I
            if (r13 != r10) goto L_0x0661
            if (r3 != 0) goto L_0x0644
            r9 = 1
            goto L_0x0646
        L_0x0644:
            r9 = r29
        L_0x0646:
            com.google.android.gms.internal.ads.C1856jm.m11730e(r9)
            int r5 = r5 + 8
            r14.mo10552v(r5)
            com.google.android.gms.internal.ads.an r3 = com.google.android.gms.internal.ads.C1523an.m6121a(r14)
            java.util.List<byte[]> r9 = r3.f4250a
            int r5 = r3.f4251b
            r0.f5819c = r5
            if (r4 != 0) goto L_0x065e
            float r3 = r3.f4252c
            r23 = r3
        L_0x065e:
            java.lang.String r3 = "video/avc"
            goto L_0x067f
        L_0x0661:
            int r10 = com.google.android.gms.internal.ads.C1518ai.f4132J
            if (r13 != r10) goto L_0x0685
            if (r3 != 0) goto L_0x0669
            r9 = 1
            goto L_0x066b
        L_0x0669:
            r9 = r29
        L_0x066b:
            com.google.android.gms.internal.ads.C1856jm.m11730e(r9)
            int r5 = r5 + 8
            r14.mo10552v(r5)
            com.google.android.gms.internal.ads.gn r3 = com.google.android.gms.internal.ads.C1746gn.m9842a(r14)
            java.util.List<byte[]> r9 = r3.f7531a
            int r3 = r3.f7532b
            r0.f5819c = r3
            java.lang.String r3 = "video/hevc"
        L_0x067f:
            r35 = r1
        L_0x0681:
            r10 = 2
            r13 = 3
            goto L_0x0758
        L_0x0685:
            int r10 = com.google.android.gms.internal.ads.C1518ai.f4139M0
            if (r13 != r10) goto L_0x069c
            if (r3 != 0) goto L_0x068d
            r3 = 1
            goto L_0x068f
        L_0x068d:
            r3 = r29
        L_0x068f:
            com.google.android.gms.internal.ads.C1856jm.m11730e(r3)
            int r3 = com.google.android.gms.internal.ads.C1518ai.f4135K0
            if (r1 != r3) goto L_0x0699
            java.lang.String r3 = "video/x-vnd.on2.vp8"
            goto L_0x067f
        L_0x0699:
            java.lang.String r3 = "video/x-vnd.on2.vp9"
            goto L_0x067f
        L_0x069c:
            int r10 = com.google.android.gms.internal.ads.C1518ai.f4168h
            if (r13 != r10) goto L_0x06ac
            if (r3 != 0) goto L_0x06a4
            r3 = 1
            goto L_0x06a6
        L_0x06a4:
            r3 = r29
        L_0x06a6:
            com.google.android.gms.internal.ads.C1856jm.m11730e(r3)
            java.lang.String r3 = "video/3gpp"
            goto L_0x067f
        L_0x06ac:
            int r10 = com.google.android.gms.internal.ads.C1518ai.f4134K
            if (r13 != r10) goto L_0x06cd
            if (r3 != 0) goto L_0x06b4
            r9 = 1
            goto L_0x06b6
        L_0x06b4:
            r9 = r29
        L_0x06b6:
            com.google.android.gms.internal.ads.C1856jm.m11730e(r9)
            android.util.Pair r3 = m10584f(r14, r5)
            java.lang.Object r5 = r3.first
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.second
            byte[] r3 = (byte[]) r3
            java.util.List r9 = java.util.Collections.singletonList(r3)
            r35 = r1
            r3 = r5
            goto L_0x0681
        L_0x06cd:
            int r10 = com.google.android.gms.internal.ads.C1518ai.f4173j0
            if (r13 != r10) goto L_0x06e6
            int r5 = r5 + 8
            r14.mo10552v(r5)
            int r4 = r14.mo10539i()
            float r4 = (float) r4
            int r5 = r14.mo10539i()
            float r5 = (float) r5
            float r23 = r4 / r5
            r35 = r1
            r4 = 1
            goto L_0x0681
        L_0x06e6:
            int r10 = com.google.android.gms.internal.ads.C1518ai.f4131I0
            if (r13 != r10) goto L_0x071c
            int r10 = r5 + 8
        L_0x06ec:
            int r13 = r10 - r5
            if (r13 >= r8) goto L_0x0711
            r14.mo10552v(r10)
            int r13 = r14.mo10535e()
            r35 = r1
            int r1 = r14.mo10535e()
            r52 = r4
            int r4 = com.google.android.gms.internal.ads.C1518ai.f4133J0
            if (r1 != r4) goto L_0x070b
            byte[] r1 = r14.f13709a
            int r13 = r13 + r10
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r10, r13)
            goto L_0x0716
        L_0x070b:
            int r10 = r10 + r13
            r4 = r52
            r1 = r35
            goto L_0x06ec
        L_0x0711:
            r35 = r1
            r52 = r4
            r1 = 0
        L_0x0716:
            r4 = r52
            r25 = r1
            goto L_0x0681
        L_0x071c:
            r35 = r1
            r52 = r4
            int r1 = com.google.android.gms.internal.ads.C1518ai.f4129H0
            if (r13 != r1) goto L_0x0754
            int r1 = r14.mo10537g()
            r13 = 3
            r14.mo10553w(r13)
            if (r1 != 0) goto L_0x0752
            int r1 = r14.mo10537g()
            if (r1 == 0) goto L_0x074c
            r4 = 1
            r10 = 2
            if (r1 == r4) goto L_0x0747
            if (r1 == r10) goto L_0x0742
            if (r1 == r13) goto L_0x073d
            goto L_0x0756
        L_0x073d:
            r4 = r52
            r30 = r13
            goto L_0x0758
        L_0x0742:
            r4 = r52
            r30 = r10
            goto L_0x0758
        L_0x0747:
            r4 = r52
            r30 = 1
            goto L_0x0758
        L_0x074c:
            r10 = 2
            r4 = r52
            r30 = r29
            goto L_0x0758
        L_0x0752:
            r10 = 2
            goto L_0x0756
        L_0x0754:
            r10 = 2
            r13 = 3
        L_0x0756:
            r4 = r52
        L_0x0758:
            int r2 = r2 + r8
            r1 = r35
            r10 = r48
            r13 = 16
            goto L_0x0611
        L_0x0761:
            r48 = r10
            r10 = 2
            r13 = 3
            if (r3 == 0) goto L_0x0797
            java.lang.String r1 = java.lang.Integer.toString(r21)
            r4 = 0
            r5 = -1
            r8 = -1
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            r24 = 0
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            r8 = r12
            r12 = r10
            r35 = r48
            r10 = r22
            r36 = r11
            r11 = r23
            r12 = r25
            r23 = r13
            r25 = 16
            r13 = r30
            r50 = r14
            r14 = r24
            r24 = r15
            r15 = r55
            com.google.android.gms.internal.ads.xe r1 = com.google.android.gms.internal.ads.C2367xe.m19470m(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.f5818b = r1
            goto L_0x07a3
        L_0x0797:
            r36 = r11
            r23 = r13
            r50 = r14
            r24 = r15
            r35 = r48
        L_0x07a1:
            r25 = 16
        L_0x07a3:
            int r3 = r24 + r35
            r1 = r50
            r1.mo10552v(r3)
            int r4 = r36 + 1
            r15 = r55
            r5 = r0
            r9 = r1
            r14 = r16
            r10 = r18
            r12 = r23
            r11 = r28
            r6 = r31
            r8 = r34
            r13 = r47
            r7 = 8
            r0 = r51
            goto L_0x01b3
        L_0x07c4:
            r0 = r5
            r18 = r10
            r47 = r13
            r16 = r14
            r29 = 0
            int r1 = com.google.android.gms.internal.ads.C1518ai.f4145Q
            r2 = r51
            com.google.android.gms.internal.ads.yh r1 = r2.mo12018d(r1)
            if (r1 == 0) goto L_0x0833
            int r2 = com.google.android.gms.internal.ads.C1518ai.f4146R
            com.google.android.gms.internal.ads.zh r1 = r1.mo12019e(r2)
            if (r1 != 0) goto L_0x07e0
            goto L_0x0833
        L_0x07e0:
            com.google.android.gms.internal.ads.rm r1 = r1.f18191P0
            r2 = 8
            r1.mo10552v(r2)
            int r2 = r1.mo10535e()
            int r2 = com.google.android.gms.internal.ads.C1518ai.m6088b(r2)
            int r3 = r1.mo10539i()
            long[] r4 = new long[r3]
            long[] r5 = new long[r3]
            r9 = r29
        L_0x07f9:
            if (r9 >= r3) goto L_0x082c
            r6 = 1
            if (r2 != r6) goto L_0x0803
            long r7 = r1.mo10544n()
            goto L_0x0807
        L_0x0803:
            long r7 = r1.mo10543m()
        L_0x0807:
            r4[r9] = r7
            if (r2 != r6) goto L_0x0810
            long r7 = r1.mo10542l()
            goto L_0x0815
        L_0x0810:
            int r7 = r1.mo10535e()
            long r7 = (long) r7
        L_0x0815:
            r5[r9] = r7
            short r7 = r1.mo10546p()
            if (r7 != r6) goto L_0x0824
            r7 = 2
            r1.mo10553w(r7)
            int r9 = r9 + 1
            goto L_0x07f9
        L_0x0824:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x082c:
            android.util.Pair r1 = android.util.Pair.create(r4, r5)
            r2 = r1
            r1 = 0
            goto L_0x0838
        L_0x0833:
            r1 = 0
            android.util.Pair r2 = android.util.Pair.create(r1, r1)
        L_0x0838:
            com.google.android.gms.internal.ads.xe r3 = r0.f5818b
            if (r3 != 0) goto L_0x083d
            return r1
        L_0x083d:
            com.google.android.gms.internal.ads.si r1 = new com.google.android.gms.internal.ads.si
            int r16 = r16.f7490a
            r3 = r47
            java.lang.Object r3 = r3.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            com.google.android.gms.internal.ads.xe r5 = r0.f5818b
            int r6 = r0.f5820d
            com.google.android.gms.internal.ads.ti[] r7 = r0.f5817a
            int r0 = r0.f5819c
            java.lang.Object r8 = r2.first
            r28 = r8
            long[] r28 = (long[]) r28
            java.lang.Object r2 = r2.second
            r29 = r2
            long[] r29 = (long[]) r29
            r15 = r1
            r17 = r18
            r18 = r3
            r20 = r32
            r22 = r26
            r24 = r5
            r25 = r6
            r26 = r7
            r27 = r0
            r15.<init>(r16, r17, r18, r20, r22, r24, r25, r26, r27, r28, r29)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1778hi.m10579a(com.google.android.gms.internal.ads.yh, com.google.android.gms.internal.ads.zh, long, com.google.android.gms.internal.ads.yg, boolean):com.google.android.gms.internal.ads.si");
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04b8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0173 A[LOOP:5: B:57:0x0173->B:58:0x0175, LOOP_START, PHI: r14 r15 r22 r25 
      PHI: (r14v4 int) = (r14v2 int), (r14v11 int) binds: [B:56:0x0171, B:58:0x0175] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r15v5 int) = (r15v3 int), (r15v11 int) binds: [B:56:0x0171, B:58:0x0175] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r22v6 int) = (r22v5 int), (r22v9 int) binds: [B:56:0x0171, B:58:0x0175] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r25v4 long) = (r25v3 long), (r25v6 long) binds: [B:56:0x0171, B:58:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0237  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.C2334wi m10580b(com.google.android.gms.internal.ads.C2185si r42, com.google.android.gms.internal.ads.C2407yh r43, com.google.android.gms.internal.ads.C1740gh r44) {
        /*
            r0 = r42
            r1 = r43
            r2 = r44
            int r3 = com.google.android.gms.internal.ads.C1518ai.f4187q0
            com.google.android.gms.internal.ads.zh r3 = r1.mo12019e(r3)
            if (r3 == 0) goto L_0x0014
            com.google.android.gms.internal.ads.ei r4 = new com.google.android.gms.internal.ads.ei
            r4.<init>(r3)
            goto L_0x0021
        L_0x0014:
            int r3 = com.google.android.gms.internal.ads.C1518ai.f4189r0
            com.google.android.gms.internal.ads.zh r3 = r1.mo12019e(r3)
            if (r3 == 0) goto L_0x04d1
            com.google.android.gms.internal.ads.fi r4 = new com.google.android.gms.internal.ads.fi
            r4.<init>(r3)
        L_0x0021:
            int r3 = r4.zza()
            r5 = 0
            if (r3 != 0) goto L_0x0038
            com.google.android.gms.internal.ads.wi r0 = new com.google.android.gms.internal.ads.wi
            long[] r7 = new long[r5]
            int[] r8 = new int[r5]
            r9 = 0
            long[] r10 = new long[r5]
            int[] r11 = new int[r5]
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return r0
        L_0x0038:
            int r6 = com.google.android.gms.internal.ads.C1518ai.f4191s0
            com.google.android.gms.internal.ads.zh r6 = r1.mo12019e(r6)
            if (r6 != 0) goto L_0x0048
            int r6 = com.google.android.gms.internal.ads.C1518ai.f4193t0
            com.google.android.gms.internal.ads.zh r6 = r1.mo12019e(r6)
            r8 = 1
            goto L_0x0049
        L_0x0048:
            r8 = r5
        L_0x0049:
            com.google.android.gms.internal.ads.rm r6 = r6.f18191P0
            int r9 = com.google.android.gms.internal.ads.C1518ai.f4185p0
            com.google.android.gms.internal.ads.zh r9 = r1.mo12019e(r9)
            com.google.android.gms.internal.ads.rm r9 = r9.f18191P0
            int r10 = com.google.android.gms.internal.ads.C1518ai.f4179m0
            com.google.android.gms.internal.ads.zh r10 = r1.mo12019e(r10)
            com.google.android.gms.internal.ads.rm r10 = r10.f18191P0
            int r11 = com.google.android.gms.internal.ads.C1518ai.f4181n0
            com.google.android.gms.internal.ads.zh r11 = r1.mo12019e(r11)
            r12 = 0
            if (r11 == 0) goto L_0x0067
            com.google.android.gms.internal.ads.rm r11 = r11.f18191P0
            goto L_0x0068
        L_0x0067:
            r11 = r12
        L_0x0068:
            int r13 = com.google.android.gms.internal.ads.C1518ai.f4183o0
            com.google.android.gms.internal.ads.zh r1 = r1.mo12019e(r13)
            if (r1 == 0) goto L_0x0073
            com.google.android.gms.internal.ads.rm r1 = r1.f18191P0
            goto L_0x0074
        L_0x0073:
            r1 = r12
        L_0x0074:
            com.google.android.gms.internal.ads.bi r13 = new com.google.android.gms.internal.ads.bi
            r13.<init>(r9, r6, r8)
            r6 = 12
            r10.mo10552v(r6)
            int r8 = r10.mo10539i()
            r9 = -1
            int r8 = r8 + r9
            int r14 = r10.mo10539i()
            int r15 = r10.mo10539i()
            if (r1 == 0) goto L_0x0096
            r1.mo10552v(r6)
            int r16 = r1.mo10539i()
            goto L_0x0098
        L_0x0096:
            r16 = r5
        L_0x0098:
            if (r11 == 0) goto L_0x00ab
            r11.mo10552v(r6)
            int r6 = r11.mo10539i()
            if (r6 <= 0) goto L_0x00a9
            int r12 = r11.mo10539i()
            int r12 = r12 + r9
            goto L_0x00ad
        L_0x00a9:
            r11 = r12
            goto L_0x00ac
        L_0x00ab:
            r6 = r5
        L_0x00ac:
            r12 = r9
        L_0x00ad:
            boolean r17 = r4.mo6203c()
            r18 = 0
            if (r17 == 0) goto L_0x015b
            com.google.android.gms.internal.ads.xe r5 = r0.f14452f
            java.lang.String r5 = r5.f17163k
            java.lang.String r9 = "audio/raw"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x015b
            if (r8 != 0) goto L_0x015b
            if (r16 != 0) goto L_0x015a
            if (r6 != 0) goto L_0x015a
            int r1 = r13.f4945a
            long[] r5 = new long[r1]
            int[] r6 = new int[r1]
        L_0x00cd:
            boolean r8 = r13.mo5864a()
            if (r8 == 0) goto L_0x00de
            int r8 = r13.f4946b
            long r9 = r13.f4948d
            r5[r8] = r9
            int r9 = r13.f4947c
            r6[r8] = r9
            goto L_0x00cd
        L_0x00de:
            int r4 = r4.mo6202a()
            long r8 = (long) r15
            r10 = 8192(0x2000, float:1.14794E-41)
            int r10 = r10 / r4
            r11 = 0
            r12 = 0
        L_0x00e8:
            if (r11 >= r1) goto L_0x00f4
            r13 = r6[r11]
            int r13 = com.google.android.gms.internal.ads.C2449zm.m20725d(r13, r10)
            int r12 = r12 + r13
            int r11 = r11 + 1
            goto L_0x00e8
        L_0x00f4:
            long[] r11 = new long[r12]
            int[] r13 = new int[r12]
            long[] r14 = new long[r12]
            int[] r12 = new int[r12]
            r15 = 0
            r16 = 0
            r20 = 0
            r21 = 0
        L_0x0103:
            if (r15 >= r1) goto L_0x0151
            r22 = r6[r15]
            r23 = r5[r15]
            r7 = r16
            r40 = r20
            r20 = r1
            r1 = r40
            r41 = r22
            r22 = r5
            r5 = r41
        L_0x0117:
            if (r5 <= 0) goto L_0x0142
            int r16 = java.lang.Math.min(r10, r5)
            r11[r21] = r23
            r25 = r6
            int r6 = r4 * r16
            r13[r21] = r6
            int r7 = java.lang.Math.max(r7, r6)
            r26 = r7
            long r6 = (long) r1
            long r6 = r6 * r8
            r14[r21] = r6
            r6 = 1
            r12[r21] = r6
            r6 = r13[r21]
            long r6 = (long) r6
            long r23 = r23 + r6
            int r1 = r1 + r16
            int r5 = r5 - r16
            int r21 = r21 + 1
            r6 = r25
            r7 = r26
            goto L_0x0117
        L_0x0142:
            r25 = r6
            int r15 = r15 + 1
            r16 = r7
            r5 = r22
            r40 = r20
            r20 = r1
            r1 = r40
            goto L_0x0103
        L_0x0151:
            r4 = r0
            r15 = r12
            r12 = r13
            r13 = r16
            r27 = r18
            goto L_0x02a1
        L_0x015a:
            r8 = 0
        L_0x015b:
            long[] r5 = new long[r3]
            int[] r7 = new int[r3]
            long[] r9 = new long[r3]
            r20 = r6
            int[] r6 = new int[r3]
            r25 = r18
            r27 = r25
            r0 = 0
            r2 = 0
            r21 = 0
            r22 = 0
            r23 = 0
        L_0x0171:
            if (r2 >= r3) goto L_0x0213
        L_0x0173:
            if (r22 != 0) goto L_0x018d
            boolean r22 = r13.mo5864a()
            com.google.android.gms.internal.ads.C1856jm.m11730e(r22)
            r24 = r14
            r29 = r15
            long r14 = r13.f4948d
            r25 = r14
            int r14 = r13.f4947c
            r22 = r14
            r14 = r24
            r15 = r29
            goto L_0x0173
        L_0x018d:
            r24 = r14
            r29 = r15
            if (r1 == 0) goto L_0x01a9
        L_0x0193:
            if (r21 != 0) goto L_0x01a6
            if (r16 <= 0) goto L_0x01a2
            int r21 = r1.mo10539i()
            int r23 = r1.mo10535e()
            int r16 = r16 + -1
            goto L_0x0193
        L_0x01a2:
            r14 = -1
            r21 = 0
            goto L_0x01a7
        L_0x01a6:
            r14 = -1
        L_0x01a7:
            int r21 = r21 + -1
        L_0x01a9:
            r14 = r23
            r5[r2] = r25
            int r15 = r4.mo6202a()
            r7[r2] = r15
            if (r15 <= r0) goto L_0x01ba
            r23 = r5
            r0 = r15
            r15 = r4
            goto L_0x01bd
        L_0x01ba:
            r15 = r4
            r23 = r5
        L_0x01bd:
            long r4 = (long) r14
            long r4 = r27 + r4
            r9[r2] = r4
            if (r11 != 0) goto L_0x01c6
            r4 = 1
            goto L_0x01c7
        L_0x01c6:
            r4 = 0
        L_0x01c7:
            r6[r2] = r4
            if (r2 != r12) goto L_0x01d9
            r4 = 1
            r6[r2] = r4
            int r20 = r20 + -1
            if (r20 <= 0) goto L_0x01d9
            int r4 = r11.mo10539i()
            r5 = -1
            int r4 = r4 + r5
            r12 = r4
        L_0x01d9:
            r4 = r29
            r29 = r6
            long r5 = (long) r4
            long r27 = r27 + r5
            int r5 = r24 + -1
            if (r5 != 0) goto L_0x01f4
            if (r8 <= 0) goto L_0x01f1
            int r4 = r10.mo10539i()
            int r5 = r10.mo10539i()
            int r8 = r8 + -1
            goto L_0x01f9
        L_0x01f1:
            r5 = r4
            r4 = 0
            goto L_0x01f9
        L_0x01f4:
            r40 = r5
            r5 = r4
            r4 = r40
        L_0x01f9:
            r6 = r7[r2]
            r24 = r4
            r30 = r5
            long r4 = (long) r6
            long r25 = r25 + r4
            int r22 = r22 + -1
            int r2 = r2 + 1
            r4 = r15
            r5 = r23
            r6 = r29
            r15 = r30
            r23 = r14
            r14 = r24
            goto L_0x0171
        L_0x0213:
            r23 = r5
            r29 = r6
            r24 = r14
            if (r21 != 0) goto L_0x021d
            r2 = 1
            goto L_0x021e
        L_0x021d:
            r2 = 0
        L_0x021e:
            com.google.android.gms.internal.ads.C1856jm.m11728c(r2)
        L_0x0221:
            if (r16 <= 0) goto L_0x0235
            int r2 = r1.mo10539i()
            if (r2 != 0) goto L_0x022b
            r2 = 1
            goto L_0x022c
        L_0x022b:
            r2 = 0
        L_0x022c:
            com.google.android.gms.internal.ads.C1856jm.m11728c(r2)
            r1.mo10535e()
            int r16 = r16 + -1
            goto L_0x0221
        L_0x0235:
            if (r20 != 0) goto L_0x0257
            if (r24 != 0) goto L_0x024e
            if (r22 != 0) goto L_0x0247
            if (r8 == 0) goto L_0x0243
            r1 = 0
            r2 = 0
            r4 = r42
            r5 = r0
            goto L_0x0255
        L_0x0243:
            r4 = r42
            r5 = r0
            goto L_0x029a
        L_0x0247:
            r1 = 0
            r4 = r42
            r5 = r0
            r2 = r22
            goto L_0x0255
        L_0x024e:
            r4 = r42
            r5 = r0
            r2 = r22
            r1 = r24
        L_0x0255:
            r0 = 0
            goto L_0x0260
        L_0x0257:
            r4 = r42
            r5 = r0
            r0 = r20
            r2 = r22
            r1 = r24
        L_0x0260:
            int r6 = r4.f14447a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r11 = 215(0xd7, float:3.01E-43)
            r10.<init>(r11)
            java.lang.String r11 = "Inconsistent stbl box for track "
            r10.append(r11)
            r10.append(r6)
            java.lang.String r6 = ": remainingSynchronizationSamples "
            r10.append(r6)
            r10.append(r0)
            java.lang.String r0 = ", remainingSamplesAtTimestampDelta "
            r10.append(r0)
            r10.append(r1)
            java.lang.String r0 = ", remainingSamplesInChunk "
            r10.append(r0)
            r10.append(r2)
            java.lang.String r0 = ", remainingTimestampDeltaChanges "
            r10.append(r0)
            r10.append(r8)
            java.lang.String r0 = r10.toString()
            java.lang.String r1 = "AtomParsers"
            android.util.Log.w(r1, r0)
        L_0x029a:
            r13 = r5
            r12 = r7
            r14 = r9
            r11 = r23
            r15 = r29
        L_0x02a1:
            long[] r0 = r4.f14455i
            if (r0 == 0) goto L_0x04b8
            boolean r0 = r44.mo7638a()
            if (r0 == 0) goto L_0x02ad
            goto L_0x04b8
        L_0x02ad:
            long[] r0 = r4.f14455i
            int r5 = r0.length
            r6 = 1
            if (r5 != r6) goto L_0x0339
            int r5 = r4.f14448b
            if (r5 != r6) goto L_0x0339
            int r5 = r14.length
            r6 = 2
            if (r5 < r6) goto L_0x0339
            long[] r6 = r4.f14456j
            r7 = 0
            r8 = r6[r7]
            r29 = r0[r7]
            long r1 = r4.f14449c
            r22 = r8
            long r7 = r4.f14450d
            r31 = r1
            r33 = r7
            long r0 = com.google.android.gms.internal.ads.C2449zm.m20731j(r29, r31, r33)
            long r8 = r22 + r0
            r0 = 0
            r1 = r14[r0]
            int r0 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r0 > 0) goto L_0x0339
            r0 = 1
            r6 = r14[r0]
            int r0 = (r22 > r6 ? 1 : (r22 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0339
            r0 = -1
            int r5 = r5 + r0
            r5 = r14[r5]
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0339
            int r0 = (r8 > r27 ? 1 : (r8 == r27 ? 0 : -1))
            if (r0 > 0) goto L_0x0339
            long r29 = r22 - r1
            com.google.android.gms.internal.ads.xe r0 = r4.f14452f
            int r0 = r0.f17176x
            long r0 = (long) r0
            long r5 = r4.f14449c
            r31 = r0
            r33 = r5
            long r0 = com.google.android.gms.internal.ads.C2449zm.m20731j(r29, r31, r33)
            long r29 = r27 - r8
            com.google.android.gms.internal.ads.xe r2 = r4.f14452f
            int r2 = r2.f17176x
            long r5 = (long) r2
            long r7 = r4.f14449c
            r31 = r5
            r33 = r7
            long r5 = com.google.android.gms.internal.ads.C2449zm.m20731j(r29, r31, r33)
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 != 0) goto L_0x0316
            int r2 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r2 == 0) goto L_0x0339
        L_0x0316:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x0339
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0322
            goto L_0x0339
        L_0x0322:
            int r0 = (int) r0
            r1 = r44
            r1.f7486a = r0
            int r0 = (int) r5
            r1.f7487b = r0
            long r0 = r4.f14449c
            r2 = 1000000(0xf4240, double:4.940656E-318)
            com.google.android.gms.internal.ads.C2449zm.m20735n(r14, r2, r0)
            com.google.android.gms.internal.ads.wi r0 = new com.google.android.gms.internal.ads.wi
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            return r0
        L_0x0339:
            long[] r0 = r4.f14455i
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L_0x036d
            r17 = 0
            r1 = r0[r17]
            int r0 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x036d
            r0 = r17
        L_0x0349:
            int r1 = r14.length
            if (r0 >= r1) goto L_0x0366
            r1 = r14[r0]
            long[] r3 = r4.f14456j
            r5 = r3[r17]
            long r18 = r1 - r5
            r20 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r4.f14449c
            r22 = r1
            long r1 = com.google.android.gms.internal.ads.C2449zm.m20731j(r18, r20, r22)
            r14[r0] = r1
            int r0 = r0 + 1
            r17 = 0
            goto L_0x0349
        L_0x0366:
            com.google.android.gms.internal.ads.wi r0 = new com.google.android.gms.internal.ads.wi
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            return r0
        L_0x036d:
            int r0 = r4.f14448b
            r1 = 1
            if (r0 != r1) goto L_0x0374
            r6 = 1
            goto L_0x0375
        L_0x0374:
            r6 = 0
        L_0x0375:
            r0 = 0
            r1 = 0
            r2 = 0
            r7 = 0
        L_0x0379:
            long[] r5 = r4.f14455i
            int r8 = r5.length
            r9 = -1
            if (r7 >= r8) goto L_0x03bb
            long[] r8 = r4.f14456j
            r43 = r12
            r16 = r13
            r12 = r8[r7]
            int r8 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x03b2
            r25 = r5[r7]
            long r8 = r4.f14449c
            r5 = r11
            long r10 = r4.f14450d
            r27 = r8
            r29 = r10
            long r8 = com.google.android.gms.internal.ads.C2449zm.m20731j(r25, r27, r29)
            r10 = 1
            int r11 = com.google.android.gms.internal.ads.C2449zm.m20723b(r14, r12, r10, r10)
            long r12 = r12 + r8
            r8 = 0
            int r9 = com.google.android.gms.internal.ads.C2449zm.m20723b(r14, r12, r6, r8)
            int r8 = r9 - r11
            int r0 = r0 + r8
            if (r1 == r11) goto L_0x03ad
            r1 = 1
            goto L_0x03ae
        L_0x03ad:
            r1 = 0
        L_0x03ae:
            r1 = r1 | r2
            r2 = r1
            r1 = r9
            goto L_0x03b3
        L_0x03b2:
            r5 = r11
        L_0x03b3:
            int r7 = r7 + 1
            r12 = r43
            r11 = r5
            r13 = r16
            goto L_0x0379
        L_0x03bb:
            r5 = r11
            r43 = r12
            r16 = r13
            if (r0 == r3) goto L_0x03c4
            r1 = 1
            goto L_0x03c5
        L_0x03c4:
            r1 = 0
        L_0x03c5:
            r1 = r1 | r2
            if (r1 == 0) goto L_0x03cb
            long[] r2 = new long[r0]
            goto L_0x03cc
        L_0x03cb:
            r2 = r5
        L_0x03cc:
            if (r1 == 0) goto L_0x03d1
            int[] r3 = new int[r0]
            goto L_0x03d3
        L_0x03d1:
            r3 = r43
        L_0x03d3:
            r7 = 1
            if (r7 != r1) goto L_0x03d8
            r13 = 0
            goto L_0x03da
        L_0x03d8:
            r13 = r16
        L_0x03da:
            if (r1 == 0) goto L_0x03df
            int[] r7 = new int[r0]
            goto L_0x03e0
        L_0x03df:
            r7 = r15
        L_0x03e0:
            long[] r0 = new long[r0]
            r28 = r13
            r12 = r18
            r8 = 0
            r11 = 0
        L_0x03e8:
            long[] r9 = r4.f14455i
            int r10 = r9.length
            if (r8 >= r10) goto L_0x048d
            long[] r10 = r4.f14456j
            r29 = r12
            r12 = r10[r8]
            r31 = r9[r8]
            r9 = -1
            int r16 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r16 == 0) goto L_0x0475
            long r9 = r4.f14449c
            r16 = r7
            r24 = r8
            long r7 = r4.f14450d
            r18 = r31
            r20 = r9
            r22 = r7
            long r7 = com.google.android.gms.internal.ads.C2449zm.m20731j(r18, r20, r22)
            r9 = 1
            int r10 = com.google.android.gms.internal.ads.C2449zm.m20723b(r14, r12, r9, r9)
            long r7 = r7 + r12
            r9 = 0
            int r7 = com.google.android.gms.internal.ads.C2449zm.m20723b(r14, r7, r6, r9)
            if (r1 == 0) goto L_0x042c
            int r8 = r7 - r10
            java.lang.System.arraycopy(r5, r10, r2, r11, r8)
            r9 = r43
            java.lang.System.arraycopy(r9, r10, r3, r11, r8)
            r27 = r6
            r6 = r16
            java.lang.System.arraycopy(r15, r10, r6, r11, r8)
            goto L_0x0432
        L_0x042c:
            r9 = r43
            r27 = r6
            r6 = r16
        L_0x0432:
            r8 = r28
        L_0x0434:
            if (r10 >= r7) goto L_0x046e
            r20 = 1000000(0xf4240, double:4.940656E-318)
            r33 = r5
            r16 = r6
            long r5 = r4.f14450d
            r18 = r29
            r22 = r5
            long r5 = com.google.android.gms.internal.ads.C2449zm.m20731j(r18, r20, r22)
            r18 = r14[r10]
            long r34 = r18 - r12
            r36 = 1000000(0xf4240, double:4.940656E-318)
            r43 = r12
            long r12 = r4.f14449c
            r38 = r12
            long r12 = com.google.android.gms.internal.ads.C2449zm.m20731j(r34, r36, r38)
            long r5 = r5 + r12
            r0[r11] = r5
            if (r1 == 0) goto L_0x0463
            r5 = r3[r11]
            if (r5 <= r8) goto L_0x0463
            r8 = r9[r10]
        L_0x0463:
            int r11 = r11 + 1
            int r10 = r10 + 1
            r12 = r43
            r6 = r16
            r5 = r33
            goto L_0x0434
        L_0x046e:
            r33 = r5
            r16 = r6
            r28 = r8
            goto L_0x047f
        L_0x0475:
            r9 = r43
            r33 = r5
            r27 = r6
            r16 = r7
            r24 = r8
        L_0x047f:
            long r12 = r29 + r31
            int r8 = r24 + 1
            r43 = r9
            r7 = r16
            r6 = r27
            r5 = r33
            goto L_0x03e8
        L_0x048d:
            r15 = r7
            r5 = 0
            r17 = 0
        L_0x0491:
            int r1 = r15.length
            if (r5 >= r1) goto L_0x049e
            if (r17 != 0) goto L_0x04a0
            r1 = r15[r5]
            r4 = 1
            r17 = r1 & 1
            int r5 = r5 + 1
            goto L_0x0491
        L_0x049e:
            if (r17 == 0) goto L_0x04b0
        L_0x04a0:
            com.google.android.gms.internal.ads.wi r1 = new com.google.android.gms.internal.ads.wi
            r25 = r1
            r26 = r2
            r27 = r3
            r29 = r0
            r30 = r15
            r25.<init>(r26, r27, r28, r29, r30)
            return r1
        L_0x04b0:
            com.google.android.gms.internal.ads.af r0 = new com.google.android.gms.internal.ads.af
            java.lang.String r1 = "The edited sample sequence does not contain a sync sample."
            r0.<init>(r1)
            throw r0
        L_0x04b8:
            r33 = r11
            r9 = r12
            r16 = r13
            long r0 = r4.f14449c
            r2 = 1000000(0xf4240, double:4.940656E-318)
            com.google.android.gms.internal.ads.C2449zm.m20735n(r14, r2, r0)
            com.google.android.gms.internal.ads.wi r0 = new com.google.android.gms.internal.ads.wi
            r10 = r0
            r11 = r33
            r12 = r9
            r13 = r16
            r10.<init>(r11, r12, r13, r14, r15)
            return r0
        L_0x04d1:
            com.google.android.gms.internal.ads.af r0 = new com.google.android.gms.internal.ads.af
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1778hi.m10580b(com.google.android.gms.internal.ads.si, com.google.android.gms.internal.ads.yh, com.google.android.gms.internal.ads.gh):com.google.android.gms.internal.ads.wi");
    }

    /* renamed from: c */
    public static C1964mj m10581c(C2444zh zhVar, boolean z) {
        if (z) {
            return null;
        }
        C2152rm rmVar = zhVar.f18191P0;
        rmVar.mo10552v(8);
        while (rmVar.mo10531a() >= 8) {
            int c = rmVar.mo10533c();
            int e = rmVar.mo10535e();
            if (rmVar.mo10535e() == C1518ai.f4117B0) {
                rmVar.mo10552v(c);
                int i = c + e;
                rmVar.mo10553w(12);
                while (rmVar.mo10533c() < i) {
                    int c2 = rmVar.mo10533c();
                    int e2 = rmVar.mo10535e();
                    if (rmVar.mo10535e() == C1518ai.f4119C0) {
                        rmVar.mo10552v(c2);
                        int i2 = c2 + e2;
                        rmVar.mo10553w(8);
                        ArrayList arrayList = new ArrayList();
                        while (rmVar.mo10533c() < i2) {
                            C1927lj a = C2000ni.m13932a(rmVar);
                            if (a != null) {
                                arrayList.add(a);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return new C1964mj((List<? extends C1927lj>) arrayList);
                    }
                    rmVar.mo10553w(e2 - 8);
                }
                return null;
            }
            rmVar.mo10553w(e - 8);
        }
        return null;
    }

    /* renamed from: d */
    private static int m10582d(C2152rm rmVar) {
        int g = rmVar.mo10537g();
        int i = g & 127;
        while ((g & 128) == 128) {
            g = rmVar.mo10537g();
            i = (i << 7) | (g & 127);
        }
        return i;
    }

    /* renamed from: e */
    private static int m10583e(C2152rm rmVar, int i, int i2, C1629di diVar, int i3) {
        C2152rm rmVar2 = rmVar;
        int c = rmVar.mo10533c();
        while (true) {
            boolean z = false;
            if (c - i >= i2) {
                return 0;
            }
            rmVar.mo10552v(c);
            int e = rmVar.mo10535e();
            C1856jm.m11729d(e > 0, "childAtomSize should be positive");
            if (rmVar.mo10535e() == C1518ai.f4151W) {
                int i4 = c + 8;
                Pair pair = null;
                boolean z2 = false;
                Integer num = null;
                C2222ti tiVar = null;
                while (i4 - c < e) {
                    rmVar.mo10552v(i4);
                    int e2 = rmVar.mo10535e();
                    int e3 = rmVar.mo10535e();
                    if (e3 == C1518ai.f4159c0) {
                        num = Integer.valueOf(rmVar.mo10535e());
                    } else if (e3 == C1518ai.f4152X) {
                        rmVar.mo10553w(4);
                        z2 = rmVar.mo10535e() == f8255g;
                    } else if (e3 == C1518ai.f4153Y) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= e2) {
                                tiVar = null;
                                break;
                            }
                            rmVar.mo10552v(i5);
                            int e4 = rmVar.mo10535e();
                            if (rmVar.mo10535e() == C1518ai.f4154Z) {
                                rmVar.mo10553w(6);
                                boolean z3 = rmVar.mo10537g() == 1;
                                int g = rmVar.mo10537g();
                                byte[] bArr = new byte[16];
                                rmVar.mo10547q(bArr, 0, 16);
                                tiVar = new C2222ti(z3, g, bArr);
                            } else {
                                i5 += e4;
                            }
                        }
                    }
                    i4 += e2;
                }
                if (z2) {
                    C1856jm.m11729d(num != null, "frma atom is mandatory");
                    if (tiVar != null) {
                        z = true;
                    }
                    C1856jm.m11729d(z, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, tiVar);
                }
                if (pair != null) {
                    diVar.f5817a[i3] = (C2222ti) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            C1629di diVar2 = diVar;
            c += e;
        }
    }

    /* renamed from: f */
    private static Pair<String, byte[]> m10584f(C2152rm rmVar, int i) {
        rmVar.mo10552v(i + 12);
        rmVar.mo10553w(1);
        m10582d(rmVar);
        rmVar.mo10553w(2);
        int g = rmVar.mo10537g();
        if ((g & 128) != 0) {
            rmVar.mo10553w(2);
        }
        if ((g & 64) != 0) {
            rmVar.mo10553w(rmVar.mo10540j());
        }
        if ((g & 32) != 0) {
            rmVar.mo10553w(2);
        }
        rmVar.mo10553w(1);
        m10582d(rmVar);
        int g2 = rmVar.mo10537g();
        String str = null;
        if (g2 == 32) {
            str = "video/mp4v-es";
        } else if (g2 == 33) {
            str = "video/avc";
        } else if (g2 != 35) {
            if (g2 != 64) {
                if (g2 == 107) {
                    return Pair.create("audio/mpeg", (Object) null);
                }
                if (g2 == 165) {
                    str = "audio/ac3";
                } else if (g2 != 166) {
                    switch (g2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (g2) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", (Object) null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", (Object) null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        rmVar.mo10553w(12);
        rmVar.mo10553w(1);
        int d = m10582d(rmVar);
        byte[] bArr = new byte[d];
        rmVar.mo10547q(bArr, 0, d);
        return Pair.create(str, bArr);
    }
}
