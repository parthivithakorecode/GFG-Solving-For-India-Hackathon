package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

public final class k84 extends o84 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final s83<Integer> f9433f = s83.m16650b(x74.f17066f);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final s83<Integer> f9434g = s83.m16650b(y74.f17628f);

    /* renamed from: h */
    public static final /* synthetic */ int f9435h = 0;

    /* renamed from: d */
    private final AtomicReference<d84> f9436d;

    /* renamed from: e */
    private final s74 f9437e;

    public k84(Context context) {
        s74 s74 = new s74();
        d84 c = d84.m7768c(context);
        this.f9437e = s74;
        this.f9436d = new AtomicReference<>(c);
    }

    /* renamed from: g */
    protected static int m12077g(C1574c0 c0Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c0Var.f5225c)) {
            return 4;
        }
        String k = m12080k(str);
        String k2 = m12080k(c0Var.f5225c);
        if (k2 == null || k == null) {
            return (!z || k2 != null) ? 0 : 1;
        }
        if (k2.startsWith(k) || k.startsWith(k2)) {
            return 3;
        }
        return n13.m13600E(k2, "-")[0].equals(n13.m13600E(k, "-")[0]) ? 2 : 0;
    }

    /* renamed from: k */
    protected static String m12080k(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: m */
    protected static boolean m12081m(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: com.google.android.gms.internal.ads.w74[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: com.google.android.gms.internal.ads.t74} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v42, resolved type: com.google.android.gms.internal.ads.m84} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: com.google.android.gms.internal.ads.m84} */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b0  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<com.google.android.gms.internal.ads.zx3[], com.google.android.gms.internal.ads.w74[]> mo8639f(com.google.android.gms.internal.ads.n84 r28, int[][][] r29, int[] r30, com.google.android.gms.internal.ads.s54 r31, com.google.android.gms.internal.ads.ei0 r32) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.d84> r2 = r0.f9436d
            java.lang.Object r2 = r2.get()
            com.google.android.gms.internal.ads.d84 r2 = (com.google.android.gms.internal.ads.d84) r2
            r3 = 2
            com.google.android.gms.internal.ads.l84[] r4 = new com.google.android.gms.internal.ads.l84[r3]
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0012:
            r11 = 1
            if (r6 >= r3) goto L_0x01c1
            int r12 = r1.mo9466a(r6)
            if (r12 != r3) goto L_0x01b1
            if (r7 != 0) goto L_0x019c
            com.google.android.gms.internal.ads.hm0 r7 = r1.mo9468c(r6)
            r12 = r29[r6]
            r13 = r30[r6]
            boolean r13 = r2.f11673v
            r13 = 0
        L_0x0028:
            int r14 = r7.f8338a
            if (r13 >= r14) goto L_0x0037
            com.google.android.gms.internal.ads.gk0 r14 = r7.mo7964b(r13)
            r15 = r12[r13]
            int r14 = r14.f7515a
            int r13 = r13 + 1
            goto L_0x0028
        L_0x0037:
            r13 = 0
            r14 = 0
            r15 = -1
            r16 = 0
        L_0x003c:
            int r10 = r7.f8338a
            if (r13 >= r10) goto L_0x017b
            com.google.android.gms.internal.ads.gk0 r10 = r7.mo7964b(r13)
            int r3 = r2.f11660i
            int r5 = r2.f11661j
            boolean r9 = r2.f11662k
            r17 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            int r0 = r10.f7515a
            r7.<init>(r11)
            r0 = 0
        L_0x0054:
            if (r0 > 0) goto L_0x0061
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r7.add(r11)
            int r0 = r0 + 1
            r11 = 1
            goto L_0x0054
        L_0x0061:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r0) goto L_0x0124
            if (r5 != r0) goto L_0x006a
            goto L_0x0124
        L_0x006a:
            r11 = 0
        L_0x006b:
            if (r11 > 0) goto L_0x00f4
            r19 = r8
            com.google.android.gms.internal.ads.c0 r8 = r10.mo7652b(r11)
            int r1 = r8.f5239q
            if (r1 <= 0) goto L_0x00d8
            r20 = r4
            int r4 = r8.f5240r
            if (r4 <= 0) goto L_0x00d5
            if (r9 == 0) goto L_0x0095
            r21 = r9
            if (r1 > r4) goto L_0x0085
            r9 = 0
            goto L_0x0086
        L_0x0085:
            r9 = 1
        L_0x0086:
            r22 = r3
            if (r3 > r5) goto L_0x008c
            r3 = 0
            goto L_0x008d
        L_0x008c:
            r3 = 1
        L_0x008d:
            if (r9 == r3) goto L_0x0099
            r9 = r5
            r23 = r9
            r3 = r22
            goto L_0x009e
        L_0x0095:
            r22 = r3
            r21 = r9
        L_0x0099:
            r3 = r5
            r23 = r3
            r9 = r22
        L_0x009e:
            int r5 = r1 * r3
            r24 = r6
            int r6 = r4 * r9
            if (r5 < r6) goto L_0x00b0
            android.graphics.Point r3 = new android.graphics.Point
            int r1 = com.google.android.gms.internal.ads.n13.m13606K(r6, r1)
            r3.<init>(r9, r1)
            goto L_0x00ba
        L_0x00b0:
            android.graphics.Point r1 = new android.graphics.Point
            int r4 = com.google.android.gms.internal.ads.n13.m13606K(r5, r4)
            r1.<init>(r4, r3)
            r3 = r1
        L_0x00ba:
            int r1 = r8.f5239q
            int r4 = r8.f5240r
            int r5 = r1 * r4
            int r6 = r3.x
            float r6 = (float) r6
            r8 = 1065017672(0x3f7ae148, float:0.98)
            float r6 = r6 * r8
            int r6 = (int) r6
            if (r1 < r6) goto L_0x00e2
            int r1 = r3.y
            float r1 = (float) r1
            float r1 = r1 * r8
            int r1 = (int) r1
            if (r4 < r1) goto L_0x00e2
            if (r5 >= r0) goto L_0x00e2
            r0 = r5
            goto L_0x00e2
        L_0x00d5:
            r22 = r3
            goto L_0x00dc
        L_0x00d8:
            r22 = r3
            r20 = r4
        L_0x00dc:
            r23 = r5
            r24 = r6
            r21 = r9
        L_0x00e2:
            int r11 = r11 + 1
            r1 = r28
            r8 = r19
            r4 = r20
            r9 = r21
            r3 = r22
            r5 = r23
            r6 = r24
            goto L_0x006b
        L_0x00f4:
            r20 = r4
            r24 = r6
            r19 = r8
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x012a
            int r1 = r7.size()
            r3 = -1
            int r1 = r1 + r3
        L_0x0105:
            if (r1 < 0) goto L_0x012a
            java.lang.Object r4 = r7.get(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.android.gms.internal.ads.c0 r4 = r10.mo7652b(r4)
            int r4 = r4.mo6003a()
            if (r4 == r3) goto L_0x011d
            if (r4 <= r0) goto L_0x0120
        L_0x011d:
            r7.remove(r1)
        L_0x0120:
            int r1 = r1 + -1
            r3 = -1
            goto L_0x0105
        L_0x0124:
            r20 = r4
            r24 = r6
            r19 = r8
        L_0x012a:
            r0 = r12[r13]
            r1 = r16
            r3 = 0
        L_0x012f:
            if (r3 > 0) goto L_0x0167
            com.google.android.gms.internal.ads.c0 r4 = r10.mo7652b(r3)
            int r5 = r4.f5227e
            r5 = r0[r3]
            boolean r6 = r2.f5705J
            boolean r5 = m12081m(r5, r6)
            if (r5 == 0) goto L_0x0164
            com.google.android.gms.internal.ads.j84 r5 = new com.google.android.gms.internal.ads.j84
            r6 = r0[r3]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            boolean r8 = r7.contains(r8)
            r5.<init>(r4, r2, r6, r8)
            boolean r4 = r5.f9036f
            if (r4 != 0) goto L_0x0159
            boolean r4 = r2.f5698C
            if (r4 != 0) goto L_0x0159
            goto L_0x0164
        L_0x0159:
            if (r1 == 0) goto L_0x0161
            int r4 = r5.compareTo(r1)
            if (r4 <= 0) goto L_0x0164
        L_0x0161:
            r15 = r3
            r1 = r5
            r14 = r10
        L_0x0164:
            int r3 = r3 + 1
            goto L_0x012f
        L_0x0167:
            int r13 = r13 + 1
            r0 = r27
            r16 = r1
            r7 = r17
            r8 = r19
            r4 = r20
            r6 = r24
            r3 = 2
            r11 = 1
            r1 = r28
            goto L_0x003c
        L_0x017b:
            r20 = r4
            r24 = r6
            r19 = r8
            if (r14 != 0) goto L_0x0185
            r10 = 0
            goto L_0x0190
        L_0x0185:
            com.google.android.gms.internal.ads.l84 r10 = new com.google.android.gms.internal.ads.l84
            r0 = 1
            int[] r1 = new int[r0]
            r0 = 0
            r1[r0] = r15
            r10.<init>(r14, r1, r0)
        L_0x0190:
            r20[r24] = r10
            r0 = r28
            r5 = r24
            if (r10 == 0) goto L_0x019a
            r7 = 1
            goto L_0x01a3
        L_0x019a:
            r7 = 0
            goto L_0x01a3
        L_0x019c:
            r20 = r4
            r19 = r8
            r0 = r28
            r5 = r6
        L_0x01a3:
            com.google.android.gms.internal.ads.hm0 r1 = r0.mo9468c(r5)
            int r1 = r1.f8338a
            if (r1 <= 0) goto L_0x01ad
            r11 = 1
            goto L_0x01ae
        L_0x01ad:
            r11 = 0
        L_0x01ae:
            r8 = r19 | r11
            goto L_0x01b7
        L_0x01b1:
            r0 = r1
            r20 = r4
            r5 = r6
            r19 = r8
        L_0x01b7:
            int r6 = r5 + 1
            r1 = r0
            r4 = r20
            r3 = 2
            r0 = r27
            goto L_0x0012
        L_0x01c1:
            r0 = r1
            r20 = r4
            r19 = r8
            r6 = r3
            r1 = 0
            r3 = -1
            r4 = 0
            r5 = 0
        L_0x01cb:
            if (r4 >= r6) goto L_0x02e1
            int r6 = r0.mo9466a(r4)
            r7 = 1
            if (r6 != r7) goto L_0x02dc
            boolean r6 = r2.f5707L
            if (r6 != 0) goto L_0x01dd
            if (r19 != 0) goto L_0x01db
            goto L_0x01dd
        L_0x01db:
            r6 = 0
            goto L_0x01de
        L_0x01dd:
            r6 = 1
        L_0x01de:
            com.google.android.gms.internal.ads.hm0 r7 = r0.mo9468c(r4)
            r8 = r29[r4]
            r9 = r30[r4]
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
        L_0x01ea:
            int r13 = r7.f8338a
            if (r10 >= r13) goto L_0x0231
            com.google.android.gms.internal.ads.gk0 r13 = r7.mo7964b(r10)
            r14 = r8[r10]
            r16 = r11
            r15 = 0
        L_0x01f7:
            int r11 = r13.f7515a
            if (r15 > 0) goto L_0x022a
            r11 = r14[r15]
            r17 = r12
            boolean r12 = r2.f5705J
            boolean r11 = m12081m(r11, r12)
            if (r11 == 0) goto L_0x0221
            com.google.android.gms.internal.ads.c0 r11 = r13.mo7652b(r15)
            com.google.android.gms.internal.ads.z74 r12 = new com.google.android.gms.internal.ads.z74
            r18 = r13
            r13 = r14[r15]
            r12.<init>(r11, r2, r13)
            if (r9 == 0) goto L_0x021c
            int r11 = r12.compareTo(r9)
            if (r11 <= 0) goto L_0x0223
        L_0x021c:
            r16 = r10
            r9 = r12
            r12 = r15
            goto L_0x0225
        L_0x0221:
            r18 = r13
        L_0x0223:
            r12 = r17
        L_0x0225:
            int r15 = r15 + 1
            r13 = r18
            goto L_0x01f7
        L_0x022a:
            r17 = r12
            int r10 = r10 + 1
            r11 = r16
            goto L_0x01ea
        L_0x0231:
            r10 = -1
            if (r11 != r10) goto L_0x0237
            r6 = 0
            goto L_0x02ae
        L_0x0237:
            com.google.android.gms.internal.ads.gk0 r7 = r7.mo7964b(r11)
            if (r6 == 0) goto L_0x0299
            r6 = r8[r11]
            com.google.android.gms.internal.ads.c0 r8 = r7.mo7652b(r12)
            r10 = 1
            int[] r11 = new int[r10]
            r10 = 0
            r13 = 0
        L_0x0248:
            if (r10 > 0) goto L_0x028a
            if (r10 == r12) goto L_0x027e
            com.google.android.gms.internal.ads.c0 r14 = r7.mo7652b(r10)
            r15 = r6[r10]
            r16 = r6
            r6 = 0
            boolean r15 = m12081m(r15, r6)
            if (r15 == 0) goto L_0x0285
            int r6 = r14.f5230h
            r15 = -1
            if (r6 == r15) goto L_0x0285
            int r6 = r14.f5247y
            if (r6 == r15) goto L_0x0285
            int r15 = r8.f5247y
            if (r6 != r15) goto L_0x0285
            java.lang.String r6 = r14.f5234l
            if (r6 == 0) goto L_0x0285
            java.lang.String r15 = r8.f5234l
            boolean r6 = android.text.TextUtils.equals(r6, r15)
            if (r6 == 0) goto L_0x0285
            int r6 = r14.f5248z
            r14 = -1
            if (r6 == r14) goto L_0x0285
            int r14 = r8.f5248z
            if (r6 != r14) goto L_0x0285
            goto L_0x0280
        L_0x027e:
            r16 = r6
        L_0x0280:
            int r6 = r13 + 1
            r11[r13] = r10
            r13 = r6
        L_0x0285:
            int r10 = r10 + 1
            r6 = r16
            goto L_0x0248
        L_0x028a:
            int[] r6 = java.util.Arrays.copyOf(r11, r13)
            int r8 = r6.length
            r10 = 1
            if (r8 <= r10) goto L_0x029a
            com.google.android.gms.internal.ads.l84 r8 = new com.google.android.gms.internal.ads.l84
            r11 = 0
            r8.<init>(r7, r6, r11)
            goto L_0x029c
        L_0x0299:
            r10 = 1
        L_0x029a:
            r11 = 0
            r8 = 0
        L_0x029c:
            if (r8 != 0) goto L_0x02a7
            com.google.android.gms.internal.ads.l84 r8 = new com.google.android.gms.internal.ads.l84
            int[] r6 = new int[r10]
            r6[r11] = r12
            r8.<init>(r7, r6, r11)
        L_0x02a7:
            java.util.Objects.requireNonNull(r9)
            android.util.Pair r6 = android.util.Pair.create(r8, r9)
        L_0x02ae:
            if (r6 == 0) goto L_0x02dc
            if (r1 == 0) goto L_0x02bc
            java.lang.Object r7 = r6.second
            com.google.android.gms.internal.ads.z74 r7 = (com.google.android.gms.internal.ads.z74) r7
            int r7 = r7.compareTo(r1)
            if (r7 <= 0) goto L_0x02dc
        L_0x02bc:
            r1 = -1
            if (r3 == r1) goto L_0x02c2
            r1 = 0
            r20[r3] = r1
        L_0x02c2:
            java.lang.Object r1 = r6.first
            com.google.android.gms.internal.ads.l84 r1 = (com.google.android.gms.internal.ads.l84) r1
            r20[r4] = r1
            com.google.android.gms.internal.ads.gk0 r3 = r1.f9945a
            int[] r1 = r1.f9946b
            r5 = 0
            r1 = r1[r5]
            com.google.android.gms.internal.ads.c0 r1 = r3.mo7652b(r1)
            java.lang.String r1 = r1.f5225c
            java.lang.Object r3 = r6.second
            com.google.android.gms.internal.ads.z74 r3 = (com.google.android.gms.internal.ads.z74) r3
            r5 = r1
            r1 = r3
            r3 = r4
        L_0x02dc:
            int r4 = r4 + 1
            r6 = 2
            goto L_0x01cb
        L_0x02e1:
            r1 = 0
            r3 = -1
            r4 = 0
        L_0x02e4:
            if (r4 >= r6) goto L_0x03e1
            int r7 = r0.mo9466a(r4)
            r8 = 1
            if (r7 == r8) goto L_0x03db
            if (r7 == r6) goto L_0x03db
            r6 = 3
            if (r7 == r6) goto L_0x0353
            com.google.android.gms.internal.ads.hm0 r6 = r0.mo9468c(r4)
            r7 = r29[r4]
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x02fc:
            int r12 = r6.f8338a
            if (r10 >= r12) goto L_0x0340
            com.google.android.gms.internal.ads.gk0 r12 = r6.mo7964b(r10)
            r13 = r7[r10]
            r14 = 0
        L_0x0307:
            int r15 = r12.f7515a
            if (r14 > 0) goto L_0x0339
            r15 = r13[r14]
            r30 = r6
            boolean r6 = r2.f5705J
            boolean r6 = m12081m(r15, r6)
            if (r6 == 0) goto L_0x0330
            com.google.android.gms.internal.ads.c0 r6 = r12.mo7652b(r14)
            com.google.android.gms.internal.ads.a84 r15 = new com.google.android.gms.internal.ads.a84
            r16 = r7
            r7 = r13[r14]
            r15.<init>(r6, r7)
            if (r9 == 0) goto L_0x032c
            int r6 = r15.compareTo(r9)
            if (r6 <= 0) goto L_0x0332
        L_0x032c:
            r8 = r12
            r11 = r14
            r9 = r15
            goto L_0x0332
        L_0x0330:
            r16 = r7
        L_0x0332:
            int r14 = r14 + 1
            r6 = r30
            r7 = r16
            goto L_0x0307
        L_0x0339:
            r30 = r6
            r16 = r7
            int r10 = r10 + 1
            goto L_0x02fc
        L_0x0340:
            if (r8 != 0) goto L_0x0344
            r6 = 0
            goto L_0x034f
        L_0x0344:
            com.google.android.gms.internal.ads.l84 r6 = new com.google.android.gms.internal.ads.l84
            r7 = 1
            int[] r9 = new int[r7]
            r7 = 0
            r9[r7] = r11
            r6.<init>(r8, r9, r7)
        L_0x034f:
            r20[r4] = r6
            goto L_0x03db
        L_0x0353:
            com.google.android.gms.internal.ads.hm0 r6 = r0.mo9468c(r4)
            r7 = r29[r4]
            r8 = 0
            r9 = 0
            r10 = -1
            r11 = 0
        L_0x035d:
            int r12 = r6.f8338a
            if (r11 >= r12) goto L_0x03a5
            com.google.android.gms.internal.ads.gk0 r12 = r6.mo7964b(r11)
            r13 = r7[r11]
            r14 = 0
        L_0x0368:
            int r15 = r12.f7515a
            if (r14 > 0) goto L_0x039e
            r15 = r13[r14]
            r30 = r6
            boolean r6 = r2.f5705J
            boolean r6 = m12081m(r15, r6)
            if (r6 == 0) goto L_0x0395
            com.google.android.gms.internal.ads.c0 r6 = r12.mo7652b(r14)
            com.google.android.gms.internal.ads.i84 r15 = new com.google.android.gms.internal.ads.i84
            r16 = r7
            r7 = r13[r14]
            r15.<init>(r6, r2, r7, r5)
            boolean r6 = r15.f8569f
            if (r6 == 0) goto L_0x0397
            if (r9 == 0) goto L_0x0391
            int r6 = r15.compareTo(r9)
            if (r6 <= 0) goto L_0x0397
        L_0x0391:
            r8 = r12
            r10 = r14
            r9 = r15
            goto L_0x0397
        L_0x0395:
            r16 = r7
        L_0x0397:
            int r14 = r14 + 1
            r6 = r30
            r7 = r16
            goto L_0x0368
        L_0x039e:
            r30 = r6
            r16 = r7
            int r11 = r11 + 1
            goto L_0x035d
        L_0x03a5:
            if (r8 != 0) goto L_0x03a9
            r6 = 0
            goto L_0x03bb
        L_0x03a9:
            com.google.android.gms.internal.ads.l84 r6 = new com.google.android.gms.internal.ads.l84
            r7 = 1
            int[] r11 = new int[r7]
            r7 = 0
            r11[r7] = r10
            r6.<init>(r8, r11, r7)
            java.util.Objects.requireNonNull(r9)
            android.util.Pair r6 = android.util.Pair.create(r6, r9)
        L_0x03bb:
            if (r6 == 0) goto L_0x03db
            if (r1 == 0) goto L_0x03c9
            java.lang.Object r7 = r6.second
            com.google.android.gms.internal.ads.i84 r7 = (com.google.android.gms.internal.ads.i84) r7
            int r7 = r7.compareTo(r1)
            if (r7 <= 0) goto L_0x03db
        L_0x03c9:
            r7 = -1
            if (r3 == r7) goto L_0x03cf
            r1 = 0
            r20[r3] = r1
        L_0x03cf:
            java.lang.Object r1 = r6.first
            com.google.android.gms.internal.ads.l84 r1 = (com.google.android.gms.internal.ads.l84) r1
            r20[r4] = r1
            java.lang.Object r1 = r6.second
            com.google.android.gms.internal.ads.i84 r1 = (com.google.android.gms.internal.ads.i84) r1
            r3 = r4
            goto L_0x03dc
        L_0x03db:
            r7 = -1
        L_0x03dc:
            int r4 = r4 + 1
            r6 = 2
            goto L_0x02e4
        L_0x03e1:
            r3 = r6
            r1 = 0
        L_0x03e3:
            if (r1 >= r3) goto L_0x045f
            r3 = r20[r1]
            int r4 = r0.mo9466a(r1)
            boolean r5 = r2.mo6416f(r1)
            if (r5 != 0) goto L_0x0457
            com.google.android.gms.internal.ads.p73<java.lang.Integer> r5 = r2.f11675x
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L_0x0400
        L_0x03fd:
            r3 = 0
            r6 = 0
            goto L_0x0459
        L_0x0400:
            com.google.android.gms.internal.ads.hm0 r4 = r0.mo9468c(r1)
            boolean r5 = r2.mo6417g(r1, r4)
            if (r5 == 0) goto L_0x041d
            com.google.android.gms.internal.ads.h84 r3 = r2.mo6414e(r1, r4)
            if (r3 != 0) goto L_0x0411
            goto L_0x03fd
        L_0x0411:
            com.google.android.gms.internal.ads.l84 r3 = new com.google.android.gms.internal.ads.l84
            r5 = 0
            com.google.android.gms.internal.ads.gk0 r4 = r4.mo7964b(r5)
            r6 = 0
            r3.<init>(r4, r6, r5)
            goto L_0x0459
        L_0x041d:
            r6 = 0
            r5 = 0
        L_0x041f:
            int r7 = r4.f8338a
            if (r5 >= r7) goto L_0x0459
            com.google.android.gms.internal.ads.gk0 r7 = r4.mo7964b(r5)
            com.google.android.gms.internal.ads.i73<com.google.android.gms.internal.ads.gk0, com.google.android.gms.internal.ads.mr0> r8 = r2.f11674w
            java.lang.Object r8 = r8.get(r7)
            com.google.android.gms.internal.ads.mr0 r8 = (com.google.android.gms.internal.ads.mr0) r8
            if (r8 == 0) goto L_0x0454
            com.google.android.gms.internal.ads.l84 r3 = new com.google.android.gms.internal.ads.l84
            com.google.android.gms.internal.ads.p73<java.lang.Integer> r4 = r8.f11012a
            java.lang.Object[] r4 = r4.toArray()
            int r5 = r4.length
            int[] r8 = new int[r5]
            r9 = 0
        L_0x043d:
            if (r9 >= r5) goto L_0x044f
            r10 = r4[r9]
            java.util.Objects.requireNonNull(r10)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r8[r9] = r10
            int r9 = r9 + 1
            goto L_0x043d
        L_0x044f:
            r9 = 0
            r3.<init>(r7, r8, r9)
            goto L_0x0459
        L_0x0454:
            int r5 = r5 + 1
            goto L_0x041f
        L_0x0457:
            r6 = 0
            r3 = r6
        L_0x0459:
            r20[r1] = r3
            int r1 = r1 + 1
            r3 = 2
            goto L_0x03e3
        L_0x045f:
            r1 = r27
            r6 = 0
            com.google.android.gms.internal.ads.s74 r3 = r1.f9437e
            com.google.android.gms.internal.ads.a94 r4 = r27.mo10258c()
            com.google.android.gms.internal.ads.e73 r5 = com.google.android.gms.internal.ads.t74.m17181e(r20)
            r7 = 2
            com.google.android.gms.internal.ads.w74[] r13 = new com.google.android.gms.internal.ads.w74[r7]
            r14 = 0
        L_0x0470:
            if (r14 >= r7) goto L_0x04b1
            r7 = r20[r14]
            if (r7 == 0) goto L_0x04aa
            int[] r9 = r7.f9946b
            int r8 = r9.length
            if (r8 != 0) goto L_0x047c
            goto L_0x04aa
        L_0x047c:
            r15 = 1
            if (r8 != r15) goto L_0x0495
            com.google.android.gms.internal.ads.m84 r8 = new com.google.android.gms.internal.ads.m84
            com.google.android.gms.internal.ads.gk0 r7 = r7.f9945a
            r16 = 0
            r23 = r9[r16]
            r24 = 0
            r25 = 0
            r26 = 0
            r21 = r8
            r22 = r7
            r21.<init>(r22, r23, r24, r25, r26)
            goto L_0x04a7
        L_0x0495:
            r16 = 0
            com.google.android.gms.internal.ads.gk0 r8 = r7.f9945a
            r10 = 0
            java.lang.Object r7 = r5.get(r14)
            r12 = r7
            com.google.android.gms.internal.ads.e73 r12 = (com.google.android.gms.internal.ads.e73) r12
            r7 = r3
            r11 = r4
            com.google.android.gms.internal.ads.t74 r8 = r7.mo10745a(r8, r9, r10, r11, r12)
        L_0x04a7:
            r13[r14] = r8
            goto L_0x04ad
        L_0x04aa:
            r15 = 1
            r16 = 0
        L_0x04ad:
            int r14 = r14 + 1
            r7 = 2
            goto L_0x0470
        L_0x04b1:
            r16 = 0
            com.google.android.gms.internal.ads.zx3[] r3 = new com.google.android.gms.internal.ads.zx3[r7]
            r5 = r16
        L_0x04b7:
            if (r5 >= r7) goto L_0x04e4
            int r4 = r0.mo9466a(r5)
            boolean r8 = r2.mo6416f(r5)
            if (r8 != 0) goto L_0x04de
            com.google.android.gms.internal.ads.p73<java.lang.Integer> r8 = r2.f11675x
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r8.contains(r4)
            if (r4 == 0) goto L_0x04d0
            goto L_0x04de
        L_0x04d0:
            int r4 = r0.mo9466a(r5)
            r8 = -2
            if (r4 == r8) goto L_0x04db
            r4 = r13[r5]
            if (r4 == 0) goto L_0x04de
        L_0x04db:
            com.google.android.gms.internal.ads.zx3 r4 = com.google.android.gms.internal.ads.zx3.f18406a
            goto L_0x04df
        L_0x04de:
            r4 = r6
        L_0x04df:
            r3[r5] = r4
            int r5 = r5 + 1
            goto L_0x04b7
        L_0x04e4:
            boolean r0 = r2.f5706K
            android.util.Pair r0 = android.util.Pair.create(r3, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k84.mo8639f(com.google.android.gms.internal.ads.n84, int[][][], int[], com.google.android.gms.internal.ads.s54, com.google.android.gms.internal.ads.ei0):android.util.Pair");
    }

    /* renamed from: h */
    public final d84 mo8640h() {
        return this.f9436d.get();
    }

    /* renamed from: l */
    public final void mo8641l(f84 f84) {
        d84 d84 = new d84(f84);
        if (!this.f9436d.getAndSet(d84).equals(d84)) {
            mo10260e();
        }
    }
}
