package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

final class nr3<T> implements es3<T> {

    /* renamed from: q */
    private static final int[] f11630q = new int[0];

    /* renamed from: r */
    private static final Unsafe f11631r = gt3.m9992q();

    /* renamed from: a */
    private final int[] f11632a;

    /* renamed from: b */
    private final Object[] f11633b;

    /* renamed from: c */
    private final int f11634c;

    /* renamed from: d */
    private final int f11635d;

    /* renamed from: e */
    private final kr3 f11636e;

    /* renamed from: f */
    private final boolean f11637f;

    /* renamed from: g */
    private final boolean f11638g;

    /* renamed from: h */
    private final boolean f11639h;

    /* renamed from: i */
    private final int[] f11640i;

    /* renamed from: j */
    private final int f11641j;

    /* renamed from: k */
    private final int f11642k;

    /* renamed from: l */
    private final yq3 f11643l;

    /* renamed from: m */
    private final ws3<?, ?> f11644m;

    /* renamed from: n */
    private final np3<?> f11645n;

    /* renamed from: o */
    private final qr3 f11646o;

    /* renamed from: p */
    private final fr3 f11647p;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.google.android.gms.internal.ads.kr3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.google.android.gms.internal.ads.qr3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.gms.internal.ads.fr3} */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.np3, com.google.android.gms.internal.ads.np3<?>] */
    /* JADX WARNING: type inference failed for: r3v2, types: [int] */
    /* JADX WARNING: type inference failed for: r3v9, types: [int] */
    /* JADX WARNING: type inference failed for: r3v12, types: [com.google.android.gms.internal.ads.yq3] */
    /* JADX WARNING: type inference failed for: r3v13, types: [com.google.android.gms.internal.ads.ws3<?, ?>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private nr3(int[] r6, int[] r7, java.lang.Object[] r8, int r9, int r10, com.google.android.gms.internal.ads.kr3 r11, boolean r12, boolean r13, int[] r14, int r15, int r16, com.google.android.gms.internal.ads.qr3 r17, com.google.android.gms.internal.ads.yq3 r18, com.google.android.gms.internal.ads.ws3<?, ?> r19, com.google.android.gms.internal.ads.np3<?> r20, com.google.android.gms.internal.ads.fr3 r21) {
        /*
            r5 = this;
            r0 = r5
            r1 = r10
            r2 = r19
            r5.<init>()
            r3 = r6
            r0.f11632a = r3
            r3 = r7
            r0.f11633b = r3
            r3 = r8
            r0.f11634c = r3
            r3 = r9
            r0.f11635d = r3
            boolean r3 = r1 instanceof com.google.android.gms.internal.ads.aq3
            r0.f11638g = r3
            r3 = r11
            r0.f11639h = r3
            r3 = 0
            if (r2 == 0) goto L_0x0024
            boolean r4 = r2.mo9581h(r10)
            if (r4 == 0) goto L_0x0024
            r3 = 1
        L_0x0024:
            r0.f11637f = r3
            r3 = r13
            r0.f11640i = r3
            r3 = r14
            r0.f11641j = r3
            r3 = r15
            r0.f11642k = r3
            r3 = r16
            r0.f11646o = r3
            r3 = r17
            r0.f11643l = r3
            r3 = r18
            r0.f11644m = r3
            r0.f11645n = r2
            r0.f11636e = r1
            r1 = r20
            r0.f11647p = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nr3.<init>(int[], java.lang.Object[], int, int, com.google.android.gms.internal.ads.kr3, boolean, boolean, int[], int, int, com.google.android.gms.internal.ads.qr3, com.google.android.gms.internal.ads.yq3, com.google.android.gms.internal.ads.ws3, com.google.android.gms.internal.ads.np3, com.google.android.gms.internal.ads.fr3, byte[]):void");
    }

    /* renamed from: A */
    private final boolean m14046A(T t, int i) {
        int X = m14068X(i);
        long j = (long) (X & 1048575);
        if (j != 1048575) {
            return (gt3.m9987l(t, j) & (1 << (X >>> 20))) != 0;
        }
        int m = m14071m(i);
        long j2 = (long) (m & 1048575);
        switch (m14070l(m)) {
            case 0:
                return Double.doubleToRawLongBits(gt3.m9985j(t, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(gt3.m9986k(t, j2)) != 0;
            case 2:
                return gt3.m9989n(t, j2) != 0;
            case 3:
                return gt3.m9989n(t, j2) != 0;
            case 4:
                return gt3.m9987l(t, j2) != 0;
            case 5:
                return gt3.m9989n(t, j2) != 0;
            case 6:
                return gt3.m9987l(t, j2) != 0;
            case 7:
                return gt3.m9975H(t, j2);
            case 8:
                Object p = gt3.m9991p(t, j2);
                if (p instanceof String) {
                    return !((String) p).isEmpty();
                }
                if (p instanceof uo3) {
                    return !uo3.f15667g.equals(p);
                }
                throw new IllegalArgumentException();
            case 9:
                return gt3.m9991p(t, j2) != null;
            case 10:
                return !uo3.f15667g.equals(gt3.m9991p(t, j2));
            case 11:
                return gt3.m9987l(t, j2) != 0;
            case 12:
                return gt3.m9987l(t, j2) != 0;
            case 13:
                return gt3.m9987l(t, j2) != 0;
            case 14:
                return gt3.m9989n(t, j2) != 0;
            case 15:
                return gt3.m9987l(t, j2) != 0;
            case 16:
                return gt3.m9989n(t, j2) != 0;
            case 17:
                return gt3.m9991p(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: B */
    private final boolean m14047B(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m14046A(t, i) : (i3 & i4) != 0;
    }

    /* renamed from: C */
    private static boolean m14048C(Object obj, int i, es3 es3) {
        return es3.mo7070j(gt3.m9991p(obj, (long) (i & 1048575)));
    }

    /* renamed from: D */
    private final boolean m14049D(T t, int i, int i2) {
        return gt3.m9987l(t, (long) (m14068X(i2) & 1048575)) == i;
    }

    /* renamed from: E */
    private static <T> boolean m14050E(T t, long j) {
        return ((Boolean) gt3.m9991p(t, j)).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:156:0x044e, code lost:
        r7 = r7 + 3;
        r5 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x029d, code lost:
        r12 = r11;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m14051F(T r17, com.google.android.gms.internal.ads.ip3 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f11637f
            if (r3 != 0) goto L_0x045f
            int[] r3 = r0.f11632a
            int r3 = r3.length
            sun.misc.Unsafe r4 = f11631r
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r5
            r7 = 0
            r8 = 0
        L_0x0015:
            if (r7 >= r3) goto L_0x0455
            int r10 = r0.m14071m(r7)
            int[] r11 = r0.f11632a
            r11 = r11[r7]
            int r12 = m14070l(r10)
            r13 = 17
            r14 = 1
            if (r12 > r13) goto L_0x003d
            int[] r13 = r0.f11632a
            int r15 = r7 + 2
            r13 = r13[r15]
            r15 = r13 & r5
            if (r15 == r9) goto L_0x0038
            long r8 = (long) r15
            int r8 = r4.getInt(r1, r8)
            r9 = r15
        L_0x0038:
            int r13 = r13 >>> 20
            int r13 = r14 << r13
            goto L_0x003e
        L_0x003d:
            r13 = 0
        L_0x003e:
            r10 = r10 & r5
            long r5 = (long) r10
            switch(r12) {
                case 0: goto L_0x0442;
                case 1: goto L_0x0435;
                case 2: goto L_0x0428;
                case 3: goto L_0x041b;
                case 4: goto L_0x040e;
                case 5: goto L_0x0401;
                case 6: goto L_0x03f4;
                case 7: goto L_0x03e7;
                case 8: goto L_0x03d9;
                case 9: goto L_0x03c7;
                case 10: goto L_0x03b7;
                case 11: goto L_0x03a9;
                case 12: goto L_0x039b;
                case 13: goto L_0x038d;
                case 14: goto L_0x037f;
                case 15: goto L_0x0371;
                case 16: goto L_0x0363;
                case 17: goto L_0x0351;
                case 18: goto L_0x0341;
                case 19: goto L_0x0331;
                case 20: goto L_0x0321;
                case 21: goto L_0x0311;
                case 22: goto L_0x0301;
                case 23: goto L_0x02f1;
                case 24: goto L_0x02e1;
                case 25: goto L_0x02d1;
                case 26: goto L_0x02c2;
                case 27: goto L_0x02af;
                case 28: goto L_0x02a0;
                case 29: goto L_0x028f;
                case 30: goto L_0x0280;
                case 31: goto L_0x0271;
                case 32: goto L_0x0262;
                case 33: goto L_0x0253;
                case 34: goto L_0x0244;
                case 35: goto L_0x0235;
                case 36: goto L_0x0226;
                case 37: goto L_0x0217;
                case 38: goto L_0x0208;
                case 39: goto L_0x01f9;
                case 40: goto L_0x01ea;
                case 41: goto L_0x01db;
                case 42: goto L_0x01cc;
                case 43: goto L_0x01bd;
                case 44: goto L_0x01ae;
                case 45: goto L_0x019f;
                case 46: goto L_0x0190;
                case 47: goto L_0x0181;
                case 48: goto L_0x0172;
                case 49: goto L_0x015f;
                case 50: goto L_0x0156;
                case 51: goto L_0x0147;
                case 52: goto L_0x0138;
                case 53: goto L_0x0129;
                case 54: goto L_0x011a;
                case 55: goto L_0x010b;
                case 56: goto L_0x00fc;
                case 57: goto L_0x00ed;
                case 58: goto L_0x00de;
                case 59: goto L_0x00cf;
                case 60: goto L_0x00bc;
                case 61: goto L_0x00ac;
                case 62: goto L_0x009e;
                case 63: goto L_0x0090;
                case 64: goto L_0x0082;
                case 65: goto L_0x0074;
                case 66: goto L_0x0066;
                case 67: goto L_0x0058;
                case 68: goto L_0x0046;
                default: goto L_0x0043;
            }
        L_0x0043:
            r12 = 0
            goto L_0x044e
        L_0x0046:
            boolean r10 = r0.m14049D(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.ads.es3 r6 = r0.m14074p(r7)
            r2.mo8199B(r11, r5, r6)
            goto L_0x0043
        L_0x0058:
            boolean r10 = r0.m14049D(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            long r5 = m14072n(r1, r5)
            r2.mo8211c(r11, r5)
            goto L_0x0043
        L_0x0066:
            boolean r10 = r0.m14049D(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            int r5 = m14061Q(r1, r5)
            r2.mo8209a(r11, r5)
            goto L_0x0043
        L_0x0074:
            boolean r10 = r0.m14049D(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            long r5 = m14072n(r1, r5)
            r2.mo8207J(r11, r5)
            goto L_0x0043
        L_0x0082:
            boolean r10 = r0.m14049D(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            int r5 = m14061Q(r1, r5)
            r2.mo8205H(r11, r5)
            goto L_0x0043
        L_0x0090:
            boolean r10 = r0.m14049D(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            int r5 = m14061Q(r1, r5)
            r2.mo8227t(r11, r5)
            goto L_0x0043
        L_0x009e:
            boolean r10 = r0.m14049D(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            int r5 = m14061Q(r1, r5)
            r2.mo8216h(r11, r5)
            goto L_0x0043
        L_0x00ac:
            boolean r10 = r0.m14049D(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.ads.uo3 r5 = (com.google.android.gms.internal.ads.uo3) r5
            r2.mo8222o(r11, r5)
            goto L_0x0043
        L_0x00bc:
            boolean r10 = r0.m14049D(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.ads.es3 r6 = r0.m14074p(r7)
            r2.mo8204G(r11, r5, r6)
            goto L_0x0043
        L_0x00cf:
            boolean r10 = r0.m14049D(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            java.lang.Object r5 = r4.getObject(r1, r5)
            m14053H(r11, r5, r2)
            goto L_0x0043
        L_0x00de:
            boolean r10 = r0.m14049D(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            boolean r5 = m14050E(r1, r5)
            r2.mo8220m(r11, r5)
            goto L_0x0043
        L_0x00ed:
            boolean r10 = r0.m14049D(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            int r5 = m14061Q(r1, r5)
            r2.mo8229v(r11, r5)
            goto L_0x0043
        L_0x00fc:
            boolean r10 = r0.m14049D(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            long r5 = m14072n(r1, r5)
            r2.mo8231x(r11, r5)
            goto L_0x0043
        L_0x010b:
            boolean r10 = r0.m14049D(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            int r5 = m14061Q(r1, r5)
            r2.mo8200C(r11, r5)
            goto L_0x0043
        L_0x011a:
            boolean r10 = r0.m14049D(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            long r5 = m14072n(r1, r5)
            r2.mo8218j(r11, r5)
            goto L_0x0043
        L_0x0129:
            boolean r10 = r0.m14049D(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            long r5 = m14072n(r1, r5)
            r2.mo8202E(r11, r5)
            goto L_0x0043
        L_0x0138:
            boolean r10 = r0.m14049D(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            float r5 = m14058N(r1, r5)
            r2.mo8233z(r11, r5)
            goto L_0x0043
        L_0x0147:
            boolean r10 = r0.m14049D(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            double r5 = m14057M(r1, r5)
            r2.mo8224q(r11, r5)
            goto L_0x0043
        L_0x0156:
            java.lang.Object r5 = r4.getObject(r1, r5)
            r0.m14052G(r2, r11, r5, r7)
            goto L_0x0043
        L_0x015f:
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.es3 r6 = r0.m14074p(r7)
            com.google.android.gms.internal.ads.gs3.m9956q(r10, r5, r2, r6)
            goto L_0x0043
        L_0x0172:
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9963x(r10, r5, r2, r14)
            goto L_0x0043
        L_0x0181:
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9962w(r10, r5, r2, r14)
            goto L_0x0043
        L_0x0190:
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9961v(r10, r5, r2, r14)
            goto L_0x0043
        L_0x019f:
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9960u(r10, r5, r2, r14)
            goto L_0x0043
        L_0x01ae:
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9952m(r10, r5, r2, r14)
            goto L_0x0043
        L_0x01bd:
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9965z(r10, r5, r2, r14)
            goto L_0x0043
        L_0x01cc:
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9949j(r10, r5, r2, r14)
            goto L_0x0043
        L_0x01db:
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9953n(r10, r5, r2, r14)
            goto L_0x0043
        L_0x01ea:
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9954o(r10, r5, r2, r14)
            goto L_0x0043
        L_0x01f9:
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9957r(r10, r5, r2, r14)
            goto L_0x0043
        L_0x0208:
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9913B(r10, r5, r2, r14)
            goto L_0x0043
        L_0x0217:
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9958s(r10, r5, r2, r14)
            goto L_0x0043
        L_0x0226:
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9955p(r10, r5, r2, r14)
            goto L_0x0043
        L_0x0235:
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9951l(r10, r5, r2, r14)
            goto L_0x0043
        L_0x0244:
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r11 = 0
            com.google.android.gms.internal.ads.gs3.m9963x(r10, r5, r2, r11)
            goto L_0x029d
        L_0x0253:
            r11 = 0
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9962w(r10, r5, r2, r11)
            goto L_0x029d
        L_0x0262:
            r11 = 0
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9961v(r10, r5, r2, r11)
            goto L_0x029d
        L_0x0271:
            r11 = 0
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9960u(r10, r5, r2, r11)
            goto L_0x029d
        L_0x0280:
            r11 = 0
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9952m(r10, r5, r2, r11)
            goto L_0x029d
        L_0x028f:
            r11 = 0
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9965z(r10, r5, r2, r11)
        L_0x029d:
            r12 = r11
            goto L_0x044e
        L_0x02a0:
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9950k(r10, r5, r2)
            goto L_0x0043
        L_0x02af:
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.es3 r6 = r0.m14074p(r7)
            com.google.android.gms.internal.ads.gs3.m9959t(r10, r5, r2, r6)
            goto L_0x0043
        L_0x02c2:
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9964y(r10, r5, r2)
            goto L_0x0043
        L_0x02d1:
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            com.google.android.gms.internal.ads.gs3.m9949j(r10, r5, r2, r12)
            goto L_0x044e
        L_0x02e1:
            r12 = 0
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9953n(r10, r5, r2, r12)
            goto L_0x044e
        L_0x02f1:
            r12 = 0
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9954o(r10, r5, r2, r12)
            goto L_0x044e
        L_0x0301:
            r12 = 0
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9957r(r10, r5, r2, r12)
            goto L_0x044e
        L_0x0311:
            r12 = 0
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9913B(r10, r5, r2, r12)
            goto L_0x044e
        L_0x0321:
            r12 = 0
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9958s(r10, r5, r2, r12)
            goto L_0x044e
        L_0x0331:
            r12 = 0
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9955p(r10, r5, r2, r12)
            goto L_0x044e
        L_0x0341:
            r12 = 0
            int[] r10 = r0.f11632a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.ads.gs3.m9951l(r10, r5, r2, r12)
            goto L_0x044e
        L_0x0351:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.ads.es3 r6 = r0.m14074p(r7)
            r2.mo8199B(r11, r5, r6)
            goto L_0x044e
        L_0x0363:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            long r5 = r4.getLong(r1, r5)
            r2.mo8211c(r11, r5)
            goto L_0x044e
        L_0x0371:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            int r5 = r4.getInt(r1, r5)
            r2.mo8209a(r11, r5)
            goto L_0x044e
        L_0x037f:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            long r5 = r4.getLong(r1, r5)
            r2.mo8207J(r11, r5)
            goto L_0x044e
        L_0x038d:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            int r5 = r4.getInt(r1, r5)
            r2.mo8205H(r11, r5)
            goto L_0x044e
        L_0x039b:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            int r5 = r4.getInt(r1, r5)
            r2.mo8227t(r11, r5)
            goto L_0x044e
        L_0x03a9:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            int r5 = r4.getInt(r1, r5)
            r2.mo8216h(r11, r5)
            goto L_0x044e
        L_0x03b7:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.ads.uo3 r5 = (com.google.android.gms.internal.ads.uo3) r5
            r2.mo8222o(r11, r5)
            goto L_0x044e
        L_0x03c7:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.ads.es3 r6 = r0.m14074p(r7)
            r2.mo8204G(r11, r5, r6)
            goto L_0x044e
        L_0x03d9:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            java.lang.Object r5 = r4.getObject(r1, r5)
            m14053H(r11, r5, r2)
            goto L_0x044e
        L_0x03e7:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            boolean r5 = com.google.android.gms.internal.ads.gt3.m9975H(r1, r5)
            r2.mo8220m(r11, r5)
            goto L_0x044e
        L_0x03f4:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            int r5 = r4.getInt(r1, r5)
            r2.mo8229v(r11, r5)
            goto L_0x044e
        L_0x0401:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            long r5 = r4.getLong(r1, r5)
            r2.mo8231x(r11, r5)
            goto L_0x044e
        L_0x040e:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            int r5 = r4.getInt(r1, r5)
            r2.mo8200C(r11, r5)
            goto L_0x044e
        L_0x041b:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            long r5 = r4.getLong(r1, r5)
            r2.mo8218j(r11, r5)
            goto L_0x044e
        L_0x0428:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            long r5 = r4.getLong(r1, r5)
            r2.mo8202E(r11, r5)
            goto L_0x044e
        L_0x0435:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            float r5 = com.google.android.gms.internal.ads.gt3.m9986k(r1, r5)
            r2.mo8233z(r11, r5)
            goto L_0x044e
        L_0x0442:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            double r5 = com.google.android.gms.internal.ads.gt3.m9985j(r1, r5)
            r2.mo8224q(r11, r5)
        L_0x044e:
            int r7 = r7 + 3
            r5 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0015
        L_0x0455:
            com.google.android.gms.internal.ads.ws3<?, ?> r3 = r0.f11644m
            java.lang.Object r1 = r3.mo11706d(r1)
            r3.mo11720r(r1, r2)
            return
        L_0x045f:
            com.google.android.gms.internal.ads.np3<?> r2 = r0.f11645n
            r2.mo9574a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nr3.m14051F(java.lang.Object, com.google.android.gms.internal.ads.ip3):void");
    }

    /* renamed from: G */
    private final <K, V> void m14052G(ip3 ip3, int i, Object obj, int i2) {
        if (obj != null) {
            dr3 dr3 = (dr3) m14076r(i2);
            throw null;
        }
    }

    /* renamed from: H */
    private static final void m14053H(int i, Object obj, ip3 ip3) {
        if (obj instanceof String) {
            ip3.mo8214f(i, (String) obj);
        } else {
            ip3.mo8222o(i, (uo3) obj);
        }
    }

    /* renamed from: J */
    static xs3 m14054J(Object obj) {
        aq3 aq3 = (aq3) obj;
        xs3 xs3 = aq3.zzc;
        if (xs3 != xs3.m19644c()) {
            return xs3;
        }
        xs3 e = xs3.m19646e();
        aq3.zzc = e;
        return e;
    }

    /* renamed from: K */
    static <T> nr3<T> m14055K(Class<T> cls, hr3 hr3, qr3 qr3, yq3 yq3, ws3<?, ?> ws3, np3<?> np3, fr3 fr3) {
        if (hr3 instanceof vr3) {
            return m14056L((vr3) hr3, qr3, yq3, ws3, np3, fr3);
        }
        ts3 ts3 = (ts3) hr3;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0379  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.ads.nr3<T> m14056L(com.google.android.gms.internal.ads.vr3 r34, com.google.android.gms.internal.ads.qr3 r35, com.google.android.gms.internal.ads.yq3 r36, com.google.android.gms.internal.ads.ws3<?, ?> r37, com.google.android.gms.internal.ads.np3<?> r38, com.google.android.gms.internal.ads.fr3 r39) {
        /*
            int r0 = r34.mo7998c()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = r1
        L_0x000b:
            java.lang.String r0 = r34.mo11516b()
            int r3 = r0.length()
            char r4 = r0.charAt(r1)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0047
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0047:
            if (r6 != 0) goto L_0x0057
            int[] r6 = f11630q
            r8 = r1
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r16 = r14
            r13 = r6
            r6 = r16
            goto L_0x0166
        L_0x0057:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0076
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0063:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0073
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0063
        L_0x0073:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0076:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0095
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0082:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0092
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0082
        L_0x0092:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0095:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b4
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a1:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b1
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a1
        L_0x00b1:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b4:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d3
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c0:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c0
        L_0x00d0:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d3:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00df:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00df
        L_0x00ef:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f2:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0111
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fe:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fe
        L_0x010e:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0111:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0132
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011d:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011d
        L_0x012e:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0132:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0155
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013e:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0150
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013e
        L_0x0150:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0155:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r33 = r12
            r12 = r9
            r9 = r33
        L_0x0166:
            sun.misc.Unsafe r15 = f11631r
            java.lang.Object[] r17 = r34.mo11517d()
            com.google.android.gms.internal.ads.kr3 r18 = r34.zza()
            java.lang.Class r1 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r21 = r14 + r9
            r22 = r14
            r23 = r21
            r9 = 0
            r20 = 0
        L_0x0184:
            if (r4 >= r3) goto L_0x03ca
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ac
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = r24
            r24 = 13
        L_0x0194:
            int r26 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01a6
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r24
            r4 = r4 | r2
            int r24 = r24 + 13
            r2 = r26
            goto L_0x0194
        L_0x01a6:
            int r2 = r2 << r24
            r4 = r4 | r2
            r2 = r26
            goto L_0x01ae
        L_0x01ac:
            r2 = r24
        L_0x01ae:
            int r24 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01db
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01bc:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r3) goto L_0x01d5
            r3 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r2 = r2 | r3
            int r24 = r24 + 13
            r5 = r27
            r3 = r28
            goto L_0x01bc
        L_0x01d5:
            int r3 = r5 << r24
            r2 = r2 | r3
            r3 = r27
            goto L_0x01df
        L_0x01db:
            r28 = r3
            r3 = r24
        L_0x01df:
            r5 = r2 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r2 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ed
            int r14 = r20 + 1
            r13[r20] = r9
            r20 = r14
        L_0x01ed:
            r14 = 51
            if (r5 < r14) goto L_0x0296
            int r14 = r3 + 1
            char r3 = r0.charAt(r3)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x0223
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r14 = r27
            r27 = 13
        L_0x0204:
            int r31 = r14 + 1
            char r14 = r0.charAt(r14)
            r32 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021d
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r27
            r3 = r3 | r12
            int r27 = r27 + 13
            r14 = r31
            r12 = r32
            goto L_0x0204
        L_0x021d:
            int r12 = r14 << r27
            r3 = r3 | r12
            r14 = r31
            goto L_0x0227
        L_0x0223:
            r32 = r12
            r14 = r27
        L_0x0227:
            int r12 = r5 + -51
            r27 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0248
            r14 = 17
            if (r12 != r14) goto L_0x0234
            goto L_0x0248
        L_0x0234:
            r14 = 12
            if (r12 != r14) goto L_0x0257
            if (r10 != 0) goto L_0x0257
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0255
        L_0x0248:
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0255:
            r16 = r14
        L_0x0257:
            int r3 = r3 + r3
            r12 = r17[r3]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0261
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0269
        L_0x0261:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m14077s(r1, r12)
            r17[r3] = r12
        L_0x0269:
            r31 = r7
            r14 = r8
            long r7 = r15.objectFieldOffset(r12)
            int r7 = (int) r7
            int r3 = r3 + 1
            r8 = r17[r3]
            boolean r12 = r8 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027c
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x0284
        L_0x027c:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m14077s(r1, r8)
            r17[r3] = r8
        L_0x0284:
            r3 = r7
            long r7 = r15.objectFieldOffset(r8)
            int r7 = (int) r7
            r30 = r0
            r8 = r1
            r0 = r7
            r29 = r11
            r25 = 1
            r7 = r3
            r3 = 0
            goto L_0x0391
        L_0x0296:
            r31 = r7
            r14 = r8
            r32 = r12
            int r7 = r16 + 1
            r8 = r17[r16]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m14077s(r1, r8)
            r12 = 9
            if (r5 == r12) goto L_0x030e
            r12 = 17
            if (r5 != r12) goto L_0x02ae
            goto L_0x030e
        L_0x02ae:
            r12 = 27
            if (r5 == r12) goto L_0x02fe
            r12 = 49
            if (r5 != r12) goto L_0x02b7
            goto L_0x02fe
        L_0x02b7:
            r12 = 12
            if (r5 == r12) goto L_0x02ee
            r12 = 30
            if (r5 == r12) goto L_0x02ee
            r12 = 44
            if (r5 != r12) goto L_0x02c4
            goto L_0x02ee
        L_0x02c4:
            r12 = 50
            if (r5 != r12) goto L_0x02e4
            int r12 = r22 + 1
            r13[r22] = r9
            int r22 = r9 / 3
            int r22 = r22 + r22
            int r27 = r7 + 1
            r7 = r17[r7]
            r11[r22] = r7
            r7 = r2 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x02e7
            int r7 = r27 + 1
            int r22 = r22 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02e4:
            r25 = 1
            goto L_0x031b
        L_0x02e7:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x031c
        L_0x02ee:
            if (r10 != 0) goto L_0x02e4
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            goto L_0x030b
        L_0x02fe:
            r25 = 1
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
        L_0x030b:
            r12 = r27
            goto L_0x031c
        L_0x030e:
            r25 = 1
            int r12 = r9 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r27 = r8.getType()
            r11[r12] = r27
        L_0x031b:
            r12 = r7
        L_0x031c:
            long r7 = r15.objectFieldOffset(r8)
            int r7 = (int) r7
            r8 = r2 & 4096(0x1000, float:5.74E-42)
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r11
            r11 = 4096(0x1000, float:5.74E-42)
            if (r8 != r11) goto L_0x0379
            r8 = 17
            if (r5 > r8) goto L_0x0379
            int r8 = r3 + 1
            char r3 = r0.charAt(r3)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r11) goto L_0x0355
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x033f:
            int r27 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r11) goto L_0x0351
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r26
            r3 = r3 | r8
            int r26 = r26 + 13
            r8 = r27
            goto L_0x033f
        L_0x0351:
            int r8 = r8 << r26
            r3 = r3 | r8
            goto L_0x0357
        L_0x0355:
            r27 = r8
        L_0x0357:
            int r8 = r6 + r6
            int r26 = r3 / 32
            int r8 = r8 + r26
            r11 = r17[r8]
            r30 = r0
            boolean r0 = r11 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0368
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            goto L_0x0370
        L_0x0368:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = m14077s(r1, r11)
            r17[r8] = r11
        L_0x0370:
            r8 = r1
            long r0 = r15.objectFieldOffset(r11)
            int r0 = (int) r0
            int r3 = r3 % 32
            goto L_0x0381
        L_0x0379:
            r30 = r0
            r8 = r1
            r0 = r27
            r27 = r3
            r3 = 0
        L_0x0381:
            r1 = 18
            if (r5 < r1) goto L_0x038f
            r1 = 49
            if (r5 > r1) goto L_0x038f
            int r1 = r23 + 1
            r13[r23] = r7
            r23 = r1
        L_0x038f:
            r16 = r12
        L_0x0391:
            int r1 = r9 + 1
            r31[r9] = r4
            int r4 = r1 + 1
            r9 = r2 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x039e
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x039f
        L_0x039e:
            r9 = 0
        L_0x039f:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03a6
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a7
        L_0x03a6:
            r2 = 0
        L_0x03a7:
            r2 = r2 | r9
            int r5 = r5 << 20
            r2 = r2 | r5
            r2 = r2 | r7
            r31[r1] = r2
            int r9 = r4 + 1
            int r1 = r3 << 20
            r0 = r0 | r1
            r31[r4] = r0
            r1 = r8
            r8 = r14
            r14 = r24
            r4 = r27
            r3 = r28
            r11 = r29
            r0 = r30
            r7 = r31
            r12 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0184
        L_0x03ca:
            r31 = r7
            r29 = r11
            r32 = r12
            r24 = r14
            r14 = r8
            com.google.android.gms.internal.ads.nr3 r0 = new com.google.android.gms.internal.ads.nr3
            r4 = r0
            com.google.android.gms.internal.ads.kr3 r9 = r34.zza()
            r11 = 0
            r1 = r29
            r20 = 0
            r5 = r31
            r6 = r1
            r7 = r14
            r8 = r32
            r12 = r13
            r13 = r24
            r14 = r21
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nr3.m14056L(com.google.android.gms.internal.ads.vr3, com.google.android.gms.internal.ads.qr3, com.google.android.gms.internal.ads.yq3, com.google.android.gms.internal.ads.ws3, com.google.android.gms.internal.ads.np3, com.google.android.gms.internal.ads.fr3):com.google.android.gms.internal.ads.nr3");
    }

    /* renamed from: M */
    private static <T> double m14057M(T t, long j) {
        return ((Double) gt3.m9991p(t, j)).doubleValue();
    }

    /* renamed from: N */
    private static <T> float m14058N(T t, long j) {
        return ((Float) gt3.m9991p(t, j)).floatValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0268, code lost:
        r7 = com.google.android.gms.internal.ads.hp3.m10714y(r8, (com.google.android.gms.internal.ads.kr3) r0.getObject(r15, r12), m14074p(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x027f, code lost:
        r8 = com.google.android.gms.internal.ads.hp3.m10709a(r8 << 3);
        r7 = com.google.android.gms.internal.ads.hp3.m10710b((r9 >> 63) ^ (r9 + r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0297, code lost:
        r8 = com.google.android.gms.internal.ads.hp3.m10709a(r8 << 3);
        r7 = (r7 >> 31) ^ (r7 + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02bd, code lost:
        r8 = com.google.android.gms.internal.ads.hp3.m10709a(r8 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02c3, code lost:
        r7 = com.google.android.gms.internal.ads.hp3.m10709a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02cd, code lost:
        r7 = r0.getObject(r15, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02d1, code lost:
        r8 = com.google.android.gms.internal.ads.hp3.m10709a(r8 << 3);
        r7 = ((com.google.android.gms.internal.ads.uo3) r7).mo6627p();
        r8 = r8 + (com.google.android.gms.internal.ads.hp3.m10709a(r7) + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02e8, code lost:
        r7 = com.google.android.gms.internal.ads.gs3.m9928Q(r8, r0.getObject(r15, r12), m14074p(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0300, code lost:
        if ((r7 instanceof com.google.android.gms.internal.ads.uo3) != false) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0303, code lost:
        r8 = com.google.android.gms.internal.ads.hp3.m10709a(r8 << 3);
        r7 = com.google.android.gms.internal.ads.hp3.m10707C((java.lang.String) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0314, code lost:
        r7 = com.google.android.gms.internal.ads.hp3.m10709a(r8 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x032b, code lost:
        r7 = r0.getInt(r15, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x032f, code lost:
        r8 = com.google.android.gms.internal.ads.hp3.m10709a(r8 << 3);
        r7 = com.google.android.gms.internal.ads.hp3.m10715z(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0339, code lost:
        r8 = r8 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x033a, code lost:
        r4 = r4 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0345, code lost:
        r9 = r0.getLong(r15, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0349, code lost:
        r7 = com.google.android.gms.internal.ads.hp3.m10709a(r8 << 3) + com.google.android.gms.internal.ads.hp3.m10710b(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x035a, code lost:
        r7 = com.google.android.gms.internal.ads.hp3.m10709a(r8 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0368, code lost:
        r7 = com.google.android.gms.internal.ads.hp3.m10709a(r8 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0372, code lost:
        r3 = r3 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009e, code lost:
        if ((r7 instanceof com.google.android.gms.internal.ads.uo3) != false) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c0, code lost:
        r7 = m14061Q(r15, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d3, code lost:
        r9 = m14072n(r15, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c1, code lost:
        r8 = com.google.android.gms.internal.ads.hp3.m10708D(r8) + com.google.android.gms.internal.ads.hp3.m10709a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0261, code lost:
        r4 = r4 + r7;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m14059O(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = f11631r
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r6 = r1
            r3 = r2
            r4 = r3
            r5 = r4
        L_0x000a:
            int[] r7 = r14.f11632a
            int r7 = r7.length
            if (r3 >= r7) goto L_0x0376
            int r7 = r14.m14071m(r3)
            int[] r8 = r14.f11632a
            r8 = r8[r3]
            int r9 = m14070l(r7)
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L_0x0035
            int[] r10 = r14.f11632a
            int r12 = r3 + 2
            r10 = r10[r12]
            r12 = r10 & r1
            int r10 = r10 >>> 20
            int r10 = r11 << r10
            if (r12 == r6) goto L_0x0036
            long r5 = (long) r12
            int r5 = r0.getInt(r15, r5)
            r6 = r12
            goto L_0x0036
        L_0x0035:
            r10 = r2
        L_0x0036:
            r7 = r7 & r1
            long r12 = (long) r7
            r7 = 63
            switch(r9) {
                case 0: goto L_0x0364;
                case 1: goto L_0x0356;
                case 2: goto L_0x0341;
                case 3: goto L_0x033c;
                case 4: goto L_0x0327;
                case 5: goto L_0x0322;
                case 6: goto L_0x031d;
                case 7: goto L_0x0310;
                case 8: goto L_0x02f6;
                case 9: goto L_0x02e4;
                case 10: goto L_0x02c9;
                case 11: goto L_0x02b5;
                case 12: goto L_0x02af;
                case 13: goto L_0x02a9;
                case 14: goto L_0x02a3;
                case 15: goto L_0x028f;
                case 16: goto L_0x0277;
                case 17: goto L_0x0264;
                case 18: goto L_0x0257;
                case 19: goto L_0x024c;
                case 20: goto L_0x0241;
                case 21: goto L_0x0236;
                case 22: goto L_0x022b;
                case 23: goto L_0x0257;
                case 24: goto L_0x024c;
                case 25: goto L_0x0220;
                case 26: goto L_0x0215;
                case 27: goto L_0x0206;
                case 28: goto L_0x01fb;
                case 29: goto L_0x01f0;
                case 30: goto L_0x01e4;
                case 31: goto L_0x024c;
                case 32: goto L_0x0257;
                case 33: goto L_0x01d8;
                case 34: goto L_0x01cc;
                case 35: goto L_0x01b5;
                case 36: goto L_0x01a8;
                case 37: goto L_0x019b;
                case 38: goto L_0x018e;
                case 39: goto L_0x0181;
                case 40: goto L_0x0174;
                case 41: goto L_0x0167;
                case 42: goto L_0x015a;
                case 43: goto L_0x014c;
                case 44: goto L_0x013e;
                case 45: goto L_0x0130;
                case 46: goto L_0x0122;
                case 47: goto L_0x0114;
                case 48: goto L_0x0106;
                case 49: goto L_0x00f6;
                case 50: goto L_0x00e9;
                case 51: goto L_0x00e1;
                case 52: goto L_0x00d9;
                case 53: goto L_0x00cd;
                case 54: goto L_0x00c6;
                case 55: goto L_0x00ba;
                case 56: goto L_0x00b2;
                case 57: goto L_0x00aa;
                case 58: goto L_0x00a2;
                case 59: goto L_0x0092;
                case 60: goto L_0x008a;
                case 61: goto L_0x0082;
                case 62: goto L_0x0076;
                case 63: goto L_0x006f;
                case 64: goto L_0x0067;
                case 65: goto L_0x005f;
                case 66: goto L_0x0053;
                case 67: goto L_0x0047;
                case 68: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0372
        L_0x003f:
            boolean r7 = r14.m14049D(r15, r8, r3)
            if (r7 == 0) goto L_0x0372
            goto L_0x0268
        L_0x0047:
            boolean r9 = r14.m14049D(r15, r8, r3)
            if (r9 == 0) goto L_0x0372
            long r9 = m14072n(r15, r12)
            goto L_0x027f
        L_0x0053:
            boolean r7 = r14.m14049D(r15, r8, r3)
            if (r7 == 0) goto L_0x0372
            int r7 = m14061Q(r15, r12)
            goto L_0x0297
        L_0x005f:
            boolean r7 = r14.m14049D(r15, r8, r3)
            if (r7 == 0) goto L_0x0372
            goto L_0x0368
        L_0x0067:
            boolean r7 = r14.m14049D(r15, r8, r3)
            if (r7 == 0) goto L_0x0372
            goto L_0x035a
        L_0x006f:
            boolean r7 = r14.m14049D(r15, r8, r3)
            if (r7 == 0) goto L_0x0372
            goto L_0x00c0
        L_0x0076:
            boolean r7 = r14.m14049D(r15, r8, r3)
            if (r7 == 0) goto L_0x0372
            int r7 = m14061Q(r15, r12)
            goto L_0x02bd
        L_0x0082:
            boolean r7 = r14.m14049D(r15, r8, r3)
            if (r7 == 0) goto L_0x0372
            goto L_0x02cd
        L_0x008a:
            boolean r7 = r14.m14049D(r15, r8, r3)
            if (r7 == 0) goto L_0x0372
            goto L_0x02e8
        L_0x0092:
            boolean r7 = r14.m14049D(r15, r8, r3)
            if (r7 == 0) goto L_0x0372
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.ads.uo3
            if (r9 == 0) goto L_0x0303
            goto L_0x0302
        L_0x00a2:
            boolean r7 = r14.m14049D(r15, r8, r3)
            if (r7 == 0) goto L_0x0372
            goto L_0x0314
        L_0x00aa:
            boolean r7 = r14.m14049D(r15, r8, r3)
            if (r7 == 0) goto L_0x0372
            goto L_0x035a
        L_0x00b2:
            boolean r7 = r14.m14049D(r15, r8, r3)
            if (r7 == 0) goto L_0x0372
            goto L_0x0368
        L_0x00ba:
            boolean r7 = r14.m14049D(r15, r8, r3)
            if (r7 == 0) goto L_0x0372
        L_0x00c0:
            int r7 = m14061Q(r15, r12)
            goto L_0x032f
        L_0x00c6:
            boolean r7 = r14.m14049D(r15, r8, r3)
            if (r7 == 0) goto L_0x0372
            goto L_0x00d3
        L_0x00cd:
            boolean r7 = r14.m14049D(r15, r8, r3)
            if (r7 == 0) goto L_0x0372
        L_0x00d3:
            long r9 = m14072n(r15, r12)
            goto L_0x0349
        L_0x00d9:
            boolean r7 = r14.m14049D(r15, r8, r3)
            if (r7 == 0) goto L_0x0372
            goto L_0x035a
        L_0x00e1:
            boolean r7 = r14.m14049D(r15, r8, r3)
            if (r7 == 0) goto L_0x0372
            goto L_0x0368
        L_0x00e9:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.lang.Object r9 = r14.m14076r(r3)
            com.google.android.gms.internal.ads.fr3.m9274a(r8, r7, r9)
            goto L_0x0372
        L_0x00f6:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.es3 r9 = r14.m14074p(r3)
            int r7 = com.google.android.gms.internal.ads.gs3.m9923L(r8, r7, r9)
            goto L_0x0261
        L_0x0106:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9933V(r7)
            if (r7 <= 0) goto L_0x0372
            goto L_0x01c1
        L_0x0114:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9931T(r7)
            if (r7 <= 0) goto L_0x0372
            goto L_0x01c1
        L_0x0122:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9922K(r7)
            if (r7 <= 0) goto L_0x0372
            goto L_0x01c1
        L_0x0130:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9920I(r7)
            if (r7 <= 0) goto L_0x0372
            goto L_0x01c1
        L_0x013e:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9918G(r7)
            if (r7 <= 0) goto L_0x0372
            goto L_0x01c1
        L_0x014c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9936Y(r7)
            if (r7 <= 0) goto L_0x0372
            goto L_0x01c1
        L_0x015a:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9915D(r7)
            if (r7 <= 0) goto L_0x0372
            goto L_0x01c1
        L_0x0167:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9920I(r7)
            if (r7 <= 0) goto L_0x0372
            goto L_0x01c1
        L_0x0174:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9922K(r7)
            if (r7 <= 0) goto L_0x0372
            goto L_0x01c1
        L_0x0181:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9925N(r7)
            if (r7 <= 0) goto L_0x0372
            goto L_0x01c1
        L_0x018e:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9939a0(r7)
            if (r7 <= 0) goto L_0x0372
            goto L_0x01c1
        L_0x019b:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9927P(r7)
            if (r7 <= 0) goto L_0x0372
            goto L_0x01c1
        L_0x01a8:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9920I(r7)
            if (r7 <= 0) goto L_0x0372
            goto L_0x01c1
        L_0x01b5:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9922K(r7)
            if (r7 <= 0) goto L_0x0372
        L_0x01c1:
            int r8 = com.google.android.gms.internal.ads.hp3.m10708D(r8)
            int r9 = com.google.android.gms.internal.ads.hp3.m10709a(r7)
            int r8 = r8 + r9
            goto L_0x0339
        L_0x01cc:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9932U(r8, r7, r2)
            goto L_0x0261
        L_0x01d8:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9930S(r8, r7, r2)
            goto L_0x0261
        L_0x01e4:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9917F(r8, r7, r2)
            goto L_0x0261
        L_0x01f0:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9935X(r8, r7, r2)
            goto L_0x0261
        L_0x01fb:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9916E(r8, r7)
            goto L_0x0261
        L_0x0206:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.es3 r9 = r14.m14074p(r3)
            int r7 = com.google.android.gms.internal.ads.gs3.m9929R(r8, r7, r9)
            goto L_0x0261
        L_0x0215:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9934W(r8, r7)
            goto L_0x0261
        L_0x0220:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9912A(r8, r7, r2)
            goto L_0x0261
        L_0x022b:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9924M(r8, r7, r2)
            goto L_0x0261
        L_0x0236:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9937Z(r8, r7, r2)
            goto L_0x0261
        L_0x0241:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9926O(r8, r7, r2)
            goto L_0x0261
        L_0x024c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9919H(r8, r7, r2)
            goto L_0x0261
        L_0x0257:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.gs3.m9921J(r8, r7, r2)
        L_0x0261:
            int r4 = r4 + r7
            goto L_0x0372
        L_0x0264:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0372
        L_0x0268:
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.kr3 r7 = (com.google.android.gms.internal.ads.kr3) r7
            com.google.android.gms.internal.ads.es3 r9 = r14.m14074p(r3)
            int r7 = com.google.android.gms.internal.ads.hp3.m10714y(r8, r7, r9)
            goto L_0x0261
        L_0x0277:
            r9 = r5 & r10
            if (r9 == 0) goto L_0x0372
            long r9 = r0.getLong(r15, r12)
        L_0x027f:
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.hp3.m10709a(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.ads.hp3.m10710b(r9)
            goto L_0x0339
        L_0x028f:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0372
            int r7 = r0.getInt(r15, r12)
        L_0x0297:
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.hp3.m10709a(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            goto L_0x02c3
        L_0x02a3:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0372
            goto L_0x0368
        L_0x02a9:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0372
            goto L_0x035a
        L_0x02af:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0372
            goto L_0x032b
        L_0x02b5:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0372
            int r7 = r0.getInt(r15, r12)
        L_0x02bd:
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.hp3.m10709a(r8)
        L_0x02c3:
            int r7 = com.google.android.gms.internal.ads.hp3.m10709a(r7)
            goto L_0x0339
        L_0x02c9:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0372
        L_0x02cd:
            java.lang.Object r7 = r0.getObject(r15, r12)
        L_0x02d1:
            com.google.android.gms.internal.ads.uo3 r7 = (com.google.android.gms.internal.ads.uo3) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.hp3.m10709a(r8)
            int r7 = r7.mo6627p()
            int r9 = com.google.android.gms.internal.ads.hp3.m10709a(r7)
            int r9 = r9 + r7
            int r8 = r8 + r9
            goto L_0x033a
        L_0x02e4:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0372
        L_0x02e8:
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.es3 r9 = r14.m14074p(r3)
            int r7 = com.google.android.gms.internal.ads.gs3.m9928Q(r8, r7, r9)
            goto L_0x0261
        L_0x02f6:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0372
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.ads.uo3
            if (r9 == 0) goto L_0x0303
        L_0x0302:
            goto L_0x02d1
        L_0x0303:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.hp3.m10709a(r8)
            int r7 = com.google.android.gms.internal.ads.hp3.m10707C(r7)
            goto L_0x0339
        L_0x0310:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0372
        L_0x0314:
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.hp3.m10709a(r7)
            int r7 = r7 + r11
            goto L_0x0261
        L_0x031d:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0372
            goto L_0x035a
        L_0x0322:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0372
            goto L_0x0368
        L_0x0327:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0372
        L_0x032b:
            int r7 = r0.getInt(r15, r12)
        L_0x032f:
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.hp3.m10709a(r8)
            int r7 = com.google.android.gms.internal.ads.hp3.m10715z(r7)
        L_0x0339:
            int r8 = r8 + r7
        L_0x033a:
            int r4 = r4 + r8
            goto L_0x0372
        L_0x033c:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0372
            goto L_0x0345
        L_0x0341:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0372
        L_0x0345:
            long r9 = r0.getLong(r15, r12)
        L_0x0349:
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.hp3.m10709a(r7)
            int r8 = com.google.android.gms.internal.ads.hp3.m10710b(r9)
            int r7 = r7 + r8
            goto L_0x0261
        L_0x0356:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0372
        L_0x035a:
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.hp3.m10709a(r7)
            int r7 = r7 + 4
            goto L_0x0261
        L_0x0364:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0372
        L_0x0368:
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.hp3.m10709a(r7)
            int r7 = r7 + 8
            goto L_0x0261
        L_0x0372:
            int r3 = r3 + 3
            goto L_0x000a
        L_0x0376:
            com.google.android.gms.internal.ads.ws3<?, ?> r0 = r14.f11644m
            java.lang.Object r1 = r0.mo11706d(r15)
            int r0 = r0.mo11703a(r1)
            int r4 = r4 + r0
            boolean r0 = r14.f11637f
            if (r0 != 0) goto L_0x0386
            return r4
        L_0x0386:
            com.google.android.gms.internal.ads.np3<?> r0 = r14.f11645n
            r0.mo9574a(r15)
            r15 = 0
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nr3.m14059O(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0263, code lost:
        r4 = com.google.android.gms.internal.ads.hp3.m10714y(r6, (com.google.android.gms.internal.ads.kr3) com.google.android.gms.internal.ads.gt3.m9991p(r12, r7), m14074p(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x027c, code lost:
        r5 = com.google.android.gms.internal.ads.hp3.m10709a(r6 << 3);
        r4 = com.google.android.gms.internal.ads.hp3.m10710b((r7 >> 63) ^ (r7 + r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0297, code lost:
        r5 = com.google.android.gms.internal.ads.hp3.m10709a(r6 << 3);
        r4 = (r4 >> 31) ^ (r4 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02c5, code lost:
        r5 = com.google.android.gms.internal.ads.hp3.m10709a(r6 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02cb, code lost:
        r4 = com.google.android.gms.internal.ads.hp3.m10709a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02d7, code lost:
        r4 = com.google.android.gms.internal.ads.gt3.m9991p(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02db, code lost:
        r5 = com.google.android.gms.internal.ads.hp3.m10709a(r6 << 3);
        r4 = ((com.google.android.gms.internal.ads.uo3) r4).mo6627p();
        r5 = r5 + (com.google.android.gms.internal.ads.hp3.m10709a(r4) + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02f4, code lost:
        r4 = com.google.android.gms.internal.ads.gs3.m9928Q(r6, com.google.android.gms.internal.ads.gt3.m9991p(r12, r7), m14074p(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x030e, code lost:
        if ((r4 instanceof com.google.android.gms.internal.ads.uo3) != false) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0311, code lost:
        r5 = com.google.android.gms.internal.ads.hp3.m10709a(r6 << 3);
        r4 = com.google.android.gms.internal.ads.hp3.m10707C((java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0324, code lost:
        r4 = com.google.android.gms.internal.ads.hp3.m10709a(r6 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0342, code lost:
        r4 = com.google.android.gms.internal.ads.gt3.m9987l(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0346, code lost:
        r5 = com.google.android.gms.internal.ads.hp3.m10709a(r6 << 3);
        r4 = com.google.android.gms.internal.ads.hp3.m10715z(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0350, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0351, code lost:
        r3 = r3 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0360, code lost:
        r4 = com.google.android.gms.internal.ads.gt3.m9989n(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0364, code lost:
        r3 = r3 + (com.google.android.gms.internal.ads.hp3.m10709a(r6 << 3) + com.google.android.gms.internal.ads.hp3.m10710b(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0377, code lost:
        r4 = com.google.android.gms.internal.ads.hp3.m10709a(r6 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0387, code lost:
        r4 = com.google.android.gms.internal.ads.hp3.m10709a(r6 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0391, code lost:
        r2 = r2 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0097, code lost:
        if ((r4 instanceof com.google.android.gms.internal.ads.uo3) != false) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b9, code lost:
        r4 = m14061Q(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cc, code lost:
        r4 = m14072n(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ba, code lost:
        r5 = com.google.android.gms.internal.ads.hp3.m10708D(r6) + com.google.android.gms.internal.ads.hp3.m10709a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x025a, code lost:
        r3 = r3 + r4;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m14060P(T r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f11631r
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0005:
            int[] r4 = r11.f11632a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0395
            int r4 = r11.m14071m(r2)
            int r5 = m14070l(r4)
            int[] r6 = r11.f11632a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.ads.tp3 r4 = com.google.android.gms.internal.ads.tp3.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.ads.tp3 r4 = com.google.android.gms.internal.ads.tp3.SINT64_LIST_PACKED
            int r4 = r4.zza()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.f11632a
            int r9 = r2 + 2
            r4 = r4[r9]
        L_0x0031:
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0381;
                case 1: goto L_0x0371;
                case 2: goto L_0x035a;
                case 3: goto L_0x0353;
                case 4: goto L_0x033c;
                case 5: goto L_0x0335;
                case 6: goto L_0x032e;
                case 7: goto L_0x031e;
                case 8: goto L_0x0302;
                case 9: goto L_0x02ee;
                case 10: goto L_0x02d1;
                case 11: goto L_0x02bb;
                case 12: goto L_0x02b3;
                case 13: goto L_0x02ab;
                case 14: goto L_0x02a3;
                case 15: goto L_0x028d;
                case 16: goto L_0x0272;
                case 17: goto L_0x025d;
                case 18: goto L_0x0250;
                case 19: goto L_0x0245;
                case 20: goto L_0x023a;
                case 21: goto L_0x022f;
                case 22: goto L_0x0224;
                case 23: goto L_0x0250;
                case 24: goto L_0x0245;
                case 25: goto L_0x0219;
                case 26: goto L_0x020e;
                case 27: goto L_0x01ff;
                case 28: goto L_0x01f4;
                case 29: goto L_0x01e9;
                case 30: goto L_0x01dd;
                case 31: goto L_0x0245;
                case 32: goto L_0x0250;
                case 33: goto L_0x01d1;
                case 34: goto L_0x01c5;
                case 35: goto L_0x01ae;
                case 36: goto L_0x01a1;
                case 37: goto L_0x0194;
                case 38: goto L_0x0187;
                case 39: goto L_0x017a;
                case 40: goto L_0x016d;
                case 41: goto L_0x0160;
                case 42: goto L_0x0153;
                case 43: goto L_0x0145;
                case 44: goto L_0x0137;
                case 45: goto L_0x0129;
                case 46: goto L_0x011b;
                case 47: goto L_0x010d;
                case 48: goto L_0x00ff;
                case 49: goto L_0x00ef;
                case 50: goto L_0x00e2;
                case 51: goto L_0x00da;
                case 52: goto L_0x00d2;
                case 53: goto L_0x00c6;
                case 54: goto L_0x00bf;
                case 55: goto L_0x00b3;
                case 56: goto L_0x00ab;
                case 57: goto L_0x00a3;
                case 58: goto L_0x009b;
                case 59: goto L_0x008b;
                case 60: goto L_0x0083;
                case 61: goto L_0x007b;
                case 62: goto L_0x006f;
                case 63: goto L_0x0068;
                case 64: goto L_0x0060;
                case 65: goto L_0x0058;
                case 66: goto L_0x004c;
                case 67: goto L_0x0040;
                case 68: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0391
        L_0x0038:
            boolean r4 = r11.m14049D(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0263
        L_0x0040:
            boolean r5 = r11.m14049D(r12, r6, r2)
            if (r5 == 0) goto L_0x0391
            long r7 = m14072n(r12, r7)
            goto L_0x027c
        L_0x004c:
            boolean r4 = r11.m14049D(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            int r4 = m14061Q(r12, r7)
            goto L_0x0297
        L_0x0058:
            boolean r4 = r11.m14049D(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x0060:
            boolean r4 = r11.m14049D(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x0068:
            boolean r4 = r11.m14049D(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x00b9
        L_0x006f:
            boolean r4 = r11.m14049D(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            int r4 = m14061Q(r12, r7)
            goto L_0x02c5
        L_0x007b:
            boolean r4 = r11.m14049D(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x02d7
        L_0x0083:
            boolean r4 = r11.m14049D(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x02f4
        L_0x008b:
            boolean r4 = r11.m14049D(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.uo3
            if (r5 == 0) goto L_0x0311
            goto L_0x0310
        L_0x009b:
            boolean r4 = r11.m14049D(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0324
        L_0x00a3:
            boolean r4 = r11.m14049D(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x00ab:
            boolean r4 = r11.m14049D(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x00b3:
            boolean r4 = r11.m14049D(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
        L_0x00b9:
            int r4 = m14061Q(r12, r7)
            goto L_0x0346
        L_0x00bf:
            boolean r4 = r11.m14049D(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x00cc
        L_0x00c6:
            boolean r4 = r11.m14049D(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
        L_0x00cc:
            long r4 = m14072n(r12, r7)
            goto L_0x0364
        L_0x00d2:
            boolean r4 = r11.m14049D(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x00da:
            boolean r4 = r11.m14049D(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x00e2:
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r12, r7)
            java.lang.Object r5 = r11.m14076r(r2)
            com.google.android.gms.internal.ads.fr3.m9274a(r6, r4, r5)
            goto L_0x0391
        L_0x00ef:
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.es3 r5 = r11.m14074p(r2)
            int r4 = com.google.android.gms.internal.ads.gs3.m9923L(r6, r4, r5)
            goto L_0x025a
        L_0x00ff:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9933V(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x010d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9931T(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x011b:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9922K(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0129:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9920I(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0137:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9918G(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0145:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9936Y(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0153:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9915D(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0160:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9920I(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x016d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9922K(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x017a:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9925N(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0187:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9939a0(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0194:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9927P(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x01a1:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9920I(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x01ae:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9922K(r4)
            if (r4 <= 0) goto L_0x0391
        L_0x01ba:
            int r5 = com.google.android.gms.internal.ads.hp3.m10708D(r6)
            int r6 = com.google.android.gms.internal.ads.hp3.m10709a(r4)
            int r5 = r5 + r6
            goto L_0x0350
        L_0x01c5:
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9932U(r6, r4, r1)
            goto L_0x025a
        L_0x01d1:
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9930S(r6, r4, r1)
            goto L_0x025a
        L_0x01dd:
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9917F(r6, r4, r1)
            goto L_0x025a
        L_0x01e9:
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9935X(r6, r4, r1)
            goto L_0x025a
        L_0x01f4:
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9916E(r6, r4)
            goto L_0x025a
        L_0x01ff:
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.es3 r5 = r11.m14074p(r2)
            int r4 = com.google.android.gms.internal.ads.gs3.m9929R(r6, r4, r5)
            goto L_0x025a
        L_0x020e:
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9934W(r6, r4)
            goto L_0x025a
        L_0x0219:
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9912A(r6, r4, r1)
            goto L_0x025a
        L_0x0224:
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9924M(r6, r4, r1)
            goto L_0x025a
        L_0x022f:
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9937Z(r6, r4, r1)
            goto L_0x025a
        L_0x023a:
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9926O(r6, r4, r1)
            goto L_0x025a
        L_0x0245:
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9919H(r6, r4, r1)
            goto L_0x025a
        L_0x0250:
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.gs3.m9921J(r6, r4, r1)
        L_0x025a:
            int r3 = r3 + r4
            goto L_0x0391
        L_0x025d:
            boolean r4 = r11.m14046A(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0263:
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r12, r7)
            com.google.android.gms.internal.ads.kr3 r4 = (com.google.android.gms.internal.ads.kr3) r4
            com.google.android.gms.internal.ads.es3 r5 = r11.m14074p(r2)
            int r4 = com.google.android.gms.internal.ads.hp3.m10714y(r6, r4, r5)
            goto L_0x025a
        L_0x0272:
            boolean r5 = r11.m14046A(r12, r2)
            if (r5 == 0) goto L_0x0391
            long r7 = com.google.android.gms.internal.ads.gt3.m9989n(r12, r7)
        L_0x027c:
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.hp3.m10709a(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.ads.hp3.m10710b(r6)
            goto L_0x0350
        L_0x028d:
            boolean r4 = r11.m14046A(r12, r2)
            if (r4 == 0) goto L_0x0391
            int r4 = com.google.android.gms.internal.ads.gt3.m9987l(r12, r7)
        L_0x0297:
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.hp3.m10709a(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            goto L_0x02cb
        L_0x02a3:
            boolean r4 = r11.m14046A(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x02ab:
            boolean r4 = r11.m14046A(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x02b3:
            boolean r4 = r11.m14046A(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0342
        L_0x02bb:
            boolean r4 = r11.m14046A(r12, r2)
            if (r4 == 0) goto L_0x0391
            int r4 = com.google.android.gms.internal.ads.gt3.m9987l(r12, r7)
        L_0x02c5:
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.hp3.m10709a(r5)
        L_0x02cb:
            int r4 = com.google.android.gms.internal.ads.hp3.m10709a(r4)
            goto L_0x0350
        L_0x02d1:
            boolean r4 = r11.m14046A(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x02d7:
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r12, r7)
        L_0x02db:
            com.google.android.gms.internal.ads.uo3 r4 = (com.google.android.gms.internal.ads.uo3) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.hp3.m10709a(r5)
            int r4 = r4.mo6627p()
            int r6 = com.google.android.gms.internal.ads.hp3.m10709a(r4)
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L_0x0351
        L_0x02ee:
            boolean r4 = r11.m14046A(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x02f4:
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r12, r7)
            com.google.android.gms.internal.ads.es3 r5 = r11.m14074p(r2)
            int r4 = com.google.android.gms.internal.ads.gs3.m9928Q(r6, r4, r5)
            goto L_0x025a
        L_0x0302:
            boolean r4 = r11.m14046A(r12, r2)
            if (r4 == 0) goto L_0x0391
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.uo3
            if (r5 == 0) goto L_0x0311
        L_0x0310:
            goto L_0x02db
        L_0x0311:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.hp3.m10709a(r5)
            int r4 = com.google.android.gms.internal.ads.hp3.m10707C(r4)
            goto L_0x0350
        L_0x031e:
            boolean r4 = r11.m14046A(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0324:
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.hp3.m10709a(r4)
            int r4 = r4 + 1
            goto L_0x025a
        L_0x032e:
            boolean r4 = r11.m14046A(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x0335:
            boolean r4 = r11.m14046A(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x033c:
            boolean r4 = r11.m14046A(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0342:
            int r4 = com.google.android.gms.internal.ads.gt3.m9987l(r12, r7)
        L_0x0346:
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.hp3.m10709a(r5)
            int r4 = com.google.android.gms.internal.ads.hp3.m10715z(r4)
        L_0x0350:
            int r5 = r5 + r4
        L_0x0351:
            int r3 = r3 + r5
            goto L_0x0391
        L_0x0353:
            boolean r4 = r11.m14046A(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0360
        L_0x035a:
            boolean r4 = r11.m14046A(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0360:
            long r4 = com.google.android.gms.internal.ads.gt3.m9989n(r12, r7)
        L_0x0364:
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.ads.hp3.m10709a(r6)
            int r4 = com.google.android.gms.internal.ads.hp3.m10710b(r4)
            int r6 = r6 + r4
            int r3 = r3 + r6
            goto L_0x0391
        L_0x0371:
            boolean r4 = r11.m14046A(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0377:
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.hp3.m10709a(r4)
            int r4 = r4 + 4
            goto L_0x025a
        L_0x0381:
            boolean r4 = r11.m14046A(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0387:
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.hp3.m10709a(r4)
            int r4 = r4 + 8
            goto L_0x025a
        L_0x0391:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0395:
            com.google.android.gms.internal.ads.ws3<?, ?> r0 = r11.f11644m
            java.lang.Object r12 = r0.mo11706d(r12)
            int r12 = r0.mo11703a(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nr3.m14060P(java.lang.Object):int");
    }

    /* renamed from: Q */
    private static <T> int m14061Q(T t, long j) {
        return ((Integer) gt3.m9991p(t, j)).intValue();
    }

    /* renamed from: R */
    private final <K, V> int m14062R(T t, byte[] bArr, int i, int i2, int i3, long j, eo3 eo3) {
        Unsafe unsafe = f11631r;
        Object r = m14076r(i3);
        Object object = unsafe.getObject(t, j);
        if (fr3.m9275b(object)) {
            er3 b = er3.m8691a().mo7041b();
            fr3.m9276c(b, object);
            unsafe.putObject(t, j, b);
        }
        dr3 dr3 = (dr3) r;
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0066, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        r12.putObject(r1, r9, r3);
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007f, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ec, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010f, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return r2;
     */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m14063S(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.ads.eo3 r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f11631r
            int[] r7 = r0.f11632a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0183;
                case 52: goto L_0x016b;
                case 53: goto L_0x0160;
                case 54: goto L_0x0160;
                case 55: goto L_0x0155;
                case 56: goto L_0x0140;
                case 57: goto L_0x012b;
                case 58: goto L_0x0114;
                case 59: goto L_0x00e0;
                case 60: goto L_0x00be;
                case 61: goto L_0x00b3;
                case 62: goto L_0x0155;
                case 63: goto L_0x0084;
                case 64: goto L_0x012b;
                case 65: goto L_0x0140;
                case 66: goto L_0x0071;
                case 67: goto L_0x0058;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x019c
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x019c
            com.google.android.gms.internal.ads.es3 r5 = r0.m14074p(r6)
            r2 = r2 & -8
            r6 = r2 | 4
            r2 = r5
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r29
            int r2 = com.google.android.gms.internal.ads.fo3.m9250c(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            java.lang.Object r3 = r11.f6305c
            if (r15 != 0) goto L_0x0052
            goto L_0x00ec
        L_0x0052:
            java.lang.Object r3 = com.google.android.gms.internal.ads.kq3.m12306g(r15, r3)
            goto L_0x00ec
        L_0x0058:
            if (r5 == 0) goto L_0x005c
            goto L_0x019c
        L_0x005c:
            int r2 = com.google.android.gms.internal.ads.fo3.m9260m(r3, r4, r11)
            long r3 = r11.f6304b
            long r3 = com.google.android.gms.internal.ads.cp3.m7490f(r3)
        L_0x0066:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x006a:
            r12.putObject(r1, r9, r3)
            r12.putInt(r1, r13, r8)
            return r2
        L_0x0071:
            if (r5 == 0) goto L_0x0075
            goto L_0x019c
        L_0x0075:
            int r2 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r11)
            int r3 = r11.f6303a
            int r3 = com.google.android.gms.internal.ads.cp3.m7489e(r3)
        L_0x007f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x006a
        L_0x0084:
            if (r5 != 0) goto L_0x019c
            int r3 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r11)
            int r4 = r11.f6303a
            com.google.android.gms.internal.ads.eq3 r5 = r0.m14073o(r6)
            if (r5 == 0) goto L_0x00a6
            boolean r5 = r5.mo6282d(r4)
            if (r5 == 0) goto L_0x0099
            goto L_0x00a6
        L_0x0099:
            com.google.android.gms.internal.ads.xs3 r1 = m14054J(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo11916h(r2, r4)
            goto L_0x00b0
        L_0x00a6:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
        L_0x00b0:
            r2 = r3
            goto L_0x019d
        L_0x00b3:
            if (r5 == r15) goto L_0x00b7
            goto L_0x019c
        L_0x00b7:
            int r2 = com.google.android.gms.internal.ads.fo3.m9248a(r3, r4, r11)
            java.lang.Object r3 = r11.f6305c
            goto L_0x006a
        L_0x00be:
            if (r5 != r15) goto L_0x019c
            com.google.android.gms.internal.ads.es3 r2 = r0.m14074p(r6)
            r5 = r20
            int r2 = com.google.android.gms.internal.ads.fo3.m9251d(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00d5
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00d6
        L_0x00d5:
            r15 = 0
        L_0x00d6:
            java.lang.Object r3 = r11.f6305c
            if (r15 != 0) goto L_0x00db
            goto L_0x00ec
        L_0x00db:
            java.lang.Object r3 = com.google.android.gms.internal.ads.kq3.m12306g(r15, r3)
            goto L_0x00ec
        L_0x00e0:
            if (r5 != r15) goto L_0x019c
            int r2 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r11)
            int r4 = r11.f6303a
            if (r4 != 0) goto L_0x00f0
            java.lang.String r3 = ""
        L_0x00ec:
            r12.putObject(r1, r9, r3)
            goto L_0x010f
        L_0x00f0:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0104
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.ads.lt3.m12872j(r3, r2, r5)
            if (r5 == 0) goto L_0x00ff
            goto L_0x0104
        L_0x00ff:
            com.google.android.gms.internal.ads.mq3 r1 = com.google.android.gms.internal.ads.mq3.m13454d()
            throw r1
        L_0x0104:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.ads.kq3.f9606b
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x010f:
            r12.putInt(r1, r13, r8)
            goto L_0x019d
        L_0x0114:
            if (r5 != 0) goto L_0x019c
            int r2 = com.google.android.gms.internal.ads.fo3.m9260m(r3, r4, r11)
            long r3 = r11.f6304b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0124
            r15 = 1
            goto L_0x0125
        L_0x0124:
            r15 = 0
        L_0x0125:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x006a
        L_0x012b:
            if (r5 == r7) goto L_0x012f
            goto L_0x019c
        L_0x012f:
            int r2 = com.google.android.gms.internal.ads.fo3.m9249b(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 4
            return r1
        L_0x0140:
            r2 = 1
            if (r5 == r2) goto L_0x0144
            goto L_0x019c
        L_0x0144:
            long r2 = com.google.android.gms.internal.ads.fo3.m9261n(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L_0x0155:
            if (r5 == 0) goto L_0x0158
            goto L_0x019c
        L_0x0158:
            int r2 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r11)
            int r3 = r11.f6303a
            goto L_0x007f
        L_0x0160:
            if (r5 == 0) goto L_0x0163
            goto L_0x019c
        L_0x0163:
            int r2 = com.google.android.gms.internal.ads.fo3.m9260m(r3, r4, r11)
            long r3 = r11.f6304b
            goto L_0x0066
        L_0x016b:
            if (r5 == r7) goto L_0x016e
            goto L_0x019c
        L_0x016e:
            int r2 = com.google.android.gms.internal.ads.fo3.m9249b(r18, r19)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 4
            return r1
        L_0x0183:
            r2 = 1
            if (r5 == r2) goto L_0x0187
            goto L_0x019c
        L_0x0187:
            long r2 = com.google.android.gms.internal.ads.fo3.m9261n(r18, r19)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L_0x019c:
            r2 = r4
        L_0x019d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nr3.m14063S(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.ads.eo3):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x029b, code lost:
        if (r0 != r15) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02b3, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02e6, code lost:
        if (r0 != r15) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0307, code lost:
        if (r0 != r15) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00de, code lost:
        r10.putInt(r14, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f2, code lost:
        r6 = r6 | r21;
        r9 = r10;
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f6, code lost:
        r1 = r20;
        r8 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0144, code lost:
        r10.putObject(r14, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0178, code lost:
        r6 = r6 | r21;
        r9 = r10;
        r8 = r19;
        r1 = r20;
        r10 = -1;
        r29 = r13;
        r13 = r2;
        r2 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01fc, code lost:
        r6 = r6 | r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ff, code lost:
        r2 = r4;
        r28 = r10;
        r19 = r13;
        r18 = -1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m14064T(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.eo3 r35) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            sun.misc.Unsafe r9 = f11631r
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r7 = r8
            r1 = r10
            r2 = r16
            r6 = r2
        L_0x0019:
            if (r0 >= r13) goto L_0x0331
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = com.google.android.gms.internal.ads.fo3.m9258k(r0, r12, r3, r11)
            int r3 = r11.f6303a
            r4 = r0
            r17 = r3
            goto L_0x002e
        L_0x002b:
            r17 = r0
            r4 = r3
        L_0x002e:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003b
            int r2 = r2 / 3
            int r0 = r15.m14067W(r5, r2)
            goto L_0x003f
        L_0x003b:
            int r0 = r15.m14066V(r5)
        L_0x003f:
            r2 = r0
            if (r2 != r10) goto L_0x004d
            r2 = r4
            r20 = r5
            r28 = r9
            r18 = r10
            r19 = r16
            goto L_0x030a
        L_0x004d:
            int[] r0 = r15.f11632a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = m14070l(r1)
            r10 = r1 & r8
            r19 = r9
            long r8 = (long) r10
            r10 = 17
            r33 = r5
            if (r0 > r10) goto L_0x0208
            int[] r10 = r15.f11632a
            int r21 = r2 + 2
            r10 = r10[r21]
            int r21 = r10 >>> 20
            r5 = 1
            int r21 = r5 << r21
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r13
            r23 = r1
            r20 = r2
            if (r10 == r7) goto L_0x008f
            if (r7 == r13) goto L_0x0080
            long r1 = (long) r7
            r7 = r19
            r7.putInt(r14, r1, r6)
            goto L_0x0082
        L_0x0080:
            r7 = r19
        L_0x0082:
            if (r10 == r13) goto L_0x0089
            long r1 = (long) r10
            int r6 = r7.getInt(r14, r1)
        L_0x0089:
            r29 = r10
            r10 = r7
            r7 = r29
            goto L_0x0091
        L_0x008f:
            r10 = r19
        L_0x0091:
            r1 = 5
            switch(r0) {
                case 0: goto L_0x01e7;
                case 1: goto L_0x01d1;
                case 2: goto L_0x01b4;
                case 3: goto L_0x01b4;
                case 4: goto L_0x01a2;
                case 5: goto L_0x0187;
                case 6: goto L_0x0165;
                case 7: goto L_0x0148;
                case 8: goto L_0x0128;
                case 9: goto L_0x00fd;
                case 10: goto L_0x00e2;
                case 11: goto L_0x01a2;
                case 12: goto L_0x00d2;
                case 13: goto L_0x0165;
                case 14: goto L_0x0187;
                case 15: goto L_0x00c1;
                case 16: goto L_0x009d;
                default: goto L_0x0095;
            }
        L_0x0095:
            r19 = r13
            r13 = r20
            r20 = r33
            goto L_0x01ff
        L_0x009d:
            if (r3 != 0) goto L_0x00bb
            int r17 = com.google.android.gms.internal.ads.fo3.m9260m(r12, r4, r11)
            long r0 = r11.f6304b
            long r4 = com.google.android.gms.internal.ads.cp3.m7490f(r0)
            r0 = r10
            r1 = r31
            r13 = r20
            r2 = r8
            r20 = r33
            r0.putLong(r1, r2, r4)
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r0 = r17
            goto L_0x00f6
        L_0x00bb:
            r13 = r20
            r20 = r33
            goto L_0x0123
        L_0x00c1:
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x0123
            int r0 = com.google.android.gms.internal.ads.fo3.m9257j(r12, r4, r11)
            int r1 = r11.f6303a
            int r1 = com.google.android.gms.internal.ads.cp3.m7489e(r1)
            goto L_0x00de
        L_0x00d2:
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x0123
            int r0 = com.google.android.gms.internal.ads.fo3.m9257j(r12, r4, r11)
            int r1 = r11.f6303a
        L_0x00de:
            r10.putInt(r14, r8, r1)
            goto L_0x00f2
        L_0x00e2:
            r13 = r20
            r0 = 2
            r20 = r33
            if (r3 != r0) goto L_0x0123
            int r0 = com.google.android.gms.internal.ads.fo3.m9248a(r12, r4, r11)
            java.lang.Object r1 = r11.f6305c
            r10.putObject(r14, r8, r1)
        L_0x00f2:
            r6 = r6 | r21
            r9 = r10
            r2 = r13
        L_0x00f6:
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0250
        L_0x00fd:
            r13 = r20
            r0 = 2
            r20 = r33
            if (r3 != r0) goto L_0x0121
            com.google.android.gms.internal.ads.es3 r0 = r15.m14074p(r13)
            r2 = r34
            r19 = 1048575(0xfffff, float:1.469367E-39)
            int r0 = com.google.android.gms.internal.ads.fo3.m9251d(r0, r12, r4, r2, r11)
            java.lang.Object r1 = r10.getObject(r14, r8)
            if (r1 != 0) goto L_0x011a
            java.lang.Object r1 = r11.f6305c
            goto L_0x0144
        L_0x011a:
            java.lang.Object r3 = r11.f6305c
            java.lang.Object r1 = com.google.android.gms.internal.ads.kq3.m12306g(r1, r3)
            goto L_0x0144
        L_0x0121:
            r2 = r34
        L_0x0123:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x01ff
        L_0x0128:
            r2 = r34
            r19 = r13
            r13 = r20
            r0 = 2
            r20 = r33
            if (r3 != r0) goto L_0x01ff
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r23 & r0
            if (r0 != 0) goto L_0x013e
            int r0 = com.google.android.gms.internal.ads.fo3.m9254g(r12, r4, r11)
            goto L_0x0142
        L_0x013e:
            int r0 = com.google.android.gms.internal.ads.fo3.m9255h(r12, r4, r11)
        L_0x0142:
            java.lang.Object r1 = r11.f6305c
        L_0x0144:
            r10.putObject(r14, r8, r1)
            goto L_0x0178
        L_0x0148:
            r2 = r34
            r19 = r13
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x01ff
            int r0 = com.google.android.gms.internal.ads.fo3.m9260m(r12, r4, r11)
            long r3 = r11.f6304b
            r22 = 0
            int r1 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r1 == 0) goto L_0x015f
            goto L_0x0161
        L_0x015f:
            r5 = r16
        L_0x0161:
            com.google.android.gms.internal.ads.gt3.m9999x(r14, r8, r5)
            goto L_0x0178
        L_0x0165:
            r2 = r34
            r19 = r13
            r13 = r20
            r20 = r33
            if (r3 != r1) goto L_0x01ff
            int r0 = com.google.android.gms.internal.ads.fo3.m9249b(r12, r4)
            r10.putInt(r14, r8, r0)
            int r0 = r4 + 4
        L_0x0178:
            r6 = r6 | r21
            r9 = r10
            r8 = r19
            r1 = r20
            r10 = -1
            r29 = r13
            r13 = r2
            r2 = r29
            goto L_0x0019
        L_0x0187:
            r2 = r34
            r19 = r13
            r13 = r20
            r20 = r33
            if (r3 != r5) goto L_0x01ff
            long r22 = com.google.android.gms.internal.ads.fo3.m9261n(r12, r4)
            r0 = r10
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x01fc
        L_0x01a2:
            r19 = r13
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x01ff
            int r0 = com.google.android.gms.internal.ads.fo3.m9257j(r12, r4, r11)
            int r1 = r11.f6303a
            r10.putInt(r14, r8, r1)
            goto L_0x01fc
        L_0x01b4:
            r19 = r13
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x01ff
            int r17 = com.google.android.gms.internal.ads.fo3.m9260m(r12, r4, r11)
            long r4 = r11.f6304b
            r0 = r10
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r0 = r17
            goto L_0x024c
        L_0x01d1:
            r19 = r13
            r13 = r20
            r20 = r33
            if (r3 != r1) goto L_0x01ff
            int r0 = com.google.android.gms.internal.ads.fo3.m9249b(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.ads.gt3.m9968A(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x01fc
        L_0x01e7:
            r19 = r13
            r13 = r20
            r20 = r33
            if (r3 != r5) goto L_0x01ff
            long r0 = com.google.android.gms.internal.ads.fo3.m9261n(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.ads.gt3.m10001z(r14, r8, r0)
            int r0 = r4 + 8
        L_0x01fc:
            r6 = r6 | r21
            goto L_0x024a
        L_0x01ff:
            r2 = r4
            r28 = r10
            r19 = r13
            r18 = -1
            goto L_0x030a
        L_0x0208:
            r20 = r33
            r23 = r1
            r13 = r2
            r10 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 27
            if (r0 != r1) goto L_0x0262
            r1 = 2
            if (r3 != r1) goto L_0x0255
            java.lang.Object r0 = r10.getObject(r14, r8)
            com.google.android.gms.internal.ads.jq3 r0 = (com.google.android.gms.internal.ads.jq3) r0
            boolean r1 = r0.mo6246c()
            if (r1 != 0) goto L_0x0236
            int r1 = r0.size()
            if (r1 != 0) goto L_0x022e
            r1 = 10
            goto L_0x022f
        L_0x022e:
            int r1 = r1 + r1
        L_0x022f:
            com.google.android.gms.internal.ads.jq3 r0 = r0.mo5923e(r1)
            r10.putObject(r14, r8, r0)
        L_0x0236:
            r5 = r0
            com.google.android.gms.internal.ads.es3 r0 = r15.m14074p(r13)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.ads.fo3.m9252e(r0, r1, r2, r3, r4, r5, r6)
            r6 = r8
        L_0x024a:
            r9 = r10
            r2 = r13
        L_0x024c:
            r8 = r19
            r1 = r20
        L_0x0250:
            r10 = -1
            r13 = r34
            goto L_0x0019
        L_0x0255:
            r15 = r4
            r24 = r6
            r25 = r7
            r28 = r10
            r19 = r13
            r18 = -1
            goto L_0x02e9
        L_0x0262:
            r1 = 49
            if (r0 > r1) goto L_0x02b5
            r1 = r23
            long r1 = (long) r1
            r5 = r0
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r33 = r3
            r3 = r4
            r15 = r4
            r4 = r34
            r23 = r5
            r5 = r17
            r24 = r6
            r6 = r20
            r25 = r7
            r7 = r33
            r26 = r8
            r9 = r19
            r8 = r13
            r28 = r10
            r18 = -1
            r9 = r21
            r11 = r23
            r19 = r13
            r12 = r26
            r14 = r35
            int r0 = r0.m14065U(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02b3
        L_0x029d:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r10 = r18
            r2 = r19
            r1 = r20
            r6 = r24
            r7 = r25
            goto L_0x032a
        L_0x02b3:
            r2 = r0
            goto L_0x02ea
        L_0x02b5:
            r33 = r3
            r15 = r4
            r24 = r6
            r25 = r7
            r26 = r8
            r28 = r10
            r19 = r13
            r1 = r23
            r18 = -1
            r23 = r0
            r0 = 50
            r9 = r23
            r7 = r33
            if (r9 != r0) goto L_0x02ef
            r0 = 2
            if (r7 != r0) goto L_0x02e9
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r19
            r6 = r26
            r8 = r35
            int r0 = r0.m14062R(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02b3
            goto L_0x029d
        L_0x02e9:
            r2 = r15
        L_0x02ea:
            r6 = r24
            r7 = r25
            goto L_0x030a
        L_0x02ef:
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r20
            r10 = r26
            r12 = r19
            r13 = r35
            int r0 = r0.m14063S(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02b3
            goto L_0x029d
        L_0x030a:
            com.google.android.gms.internal.ads.xs3 r4 = m14054J(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.ads.fo3.m9256i(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r10 = r18
            r2 = r19
            r1 = r20
        L_0x032a:
            r9 = r28
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0019
        L_0x0331:
            r24 = r6
            r1 = r8
            r28 = r9
            if (r7 == r1) goto L_0x0342
            long r1 = (long) r7
            r3 = r31
            r6 = r24
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x0342:
            r1 = r34
            if (r0 != r1) goto L_0x0347
            return r0
        L_0x0347:
            com.google.android.gms.internal.ads.mq3 r0 = com.google.android.gms.internal.ads.mq3.m13457g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nr3.m14064T(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.eo3):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0258, code lost:
        if (r7.f6304b != 0) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x025a, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x025c, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x025d, code lost:
        r12.mo7667i(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0260, code lost:
        if (r4 >= r5) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0262, code lost:
        r6 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0268, code lost:
        if (r2 == r7.f6303a) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x026b, code lost:
        r4 = com.google.android.gms.internal.ads.fo3.m9260m(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0273, code lost:
        if (r7.f6304b == 0) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0276, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0122, code lost:
        if (r4 == 0) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0124, code lost:
        r12.add(com.google.android.gms.internal.ads.uo3.f15667g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012a, code lost:
        r12.add(com.google.android.gms.internal.ads.uo3.m17969J(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0132, code lost:
        if (r1 >= r5) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0134, code lost:
        r4 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013a, code lost:
        if (r2 == r7.f6303a) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013d, code lost:
        r1 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r7);
        r4 = r7.f6303a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0143, code lost:
        if (r4 < 0) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0147, code lost:
        if (r4 > (r3.length - r1)) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0149, code lost:
        if (r4 != 0) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0150, code lost:
        throw com.google.android.gms.internal.ads.mq3.m13459j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0155, code lost:
        throw com.google.android.gms.internal.ads.mq3.m13456f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0156, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a4  */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m14065U(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.ads.eo3 r29) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f11631r
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.ads.jq3 r12 = (com.google.android.gms.internal.ads.jq3) r12
            boolean r13 = r12.mo6246c()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.ads.jq3 r12 = r12.mo5923e(r13)
            r11.putObject(r1, r9, r12)
        L_0x0032:
            r9 = 5
            r10 = 0
            r13 = 1
            r14 = 2
            switch(r26) {
                case 18: goto L_0x038c;
                case 19: goto L_0x0346;
                case 20: goto L_0x030e;
                case 21: goto L_0x030e;
                case 22: goto L_0x02f3;
                case 23: goto L_0x02b5;
                case 24: goto L_0x0277;
                case 25: goto L_0x0223;
                case 26: goto L_0x017c;
                case 27: goto L_0x0161;
                case 28: goto L_0x0114;
                case 29: goto L_0x02f3;
                case 30: goto L_0x00dc;
                case 31: goto L_0x0277;
                case 32: goto L_0x02b5;
                case 33: goto L_0x009c;
                case 34: goto L_0x005c;
                case 35: goto L_0x038c;
                case 36: goto L_0x0346;
                case 37: goto L_0x030e;
                case 38: goto L_0x030e;
                case 39: goto L_0x02f3;
                case 40: goto L_0x02b5;
                case 41: goto L_0x0277;
                case 42: goto L_0x0223;
                case 43: goto L_0x02f3;
                case 44: goto L_0x00dc;
                case 45: goto L_0x0277;
                case 46: goto L_0x02b5;
                case 47: goto L_0x009c;
                case 48: goto L_0x005c;
                default: goto L_0x003a;
            }
        L_0x003a:
            r1 = 3
            if (r6 != r1) goto L_0x03ef
            com.google.android.gms.internal.ads.es3 r1 = r15.m14074p(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.ads.fo3.m9250c(r21, r22, r23, r24, r25, r26)
        L_0x0055:
            java.lang.Object r8 = r7.f6305c
            r12.add(r8)
            goto L_0x03d1
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.gms.internal.ads.zq3 r12 = (com.google.android.gms.internal.ads.zq3) r12
            int r1 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r7)
            int r2 = r7.f6303a
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.gms.internal.ads.fo3.m9260m(r3, r1, r7)
            long r4 = r7.f6304b
            long r4 = com.google.android.gms.internal.ads.cp3.m7490f(r4)
            r12.mo12260k(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x03f0
        L_0x007b:
            com.google.android.gms.internal.ads.mq3 r1 = com.google.android.gms.internal.ads.mq3.m13459j()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x03ef
            com.google.android.gms.internal.ads.zq3 r12 = (com.google.android.gms.internal.ads.zq3) r12
        L_0x0084:
            int r1 = com.google.android.gms.internal.ads.fo3.m9260m(r3, r4, r7)
            long r8 = r7.f6304b
            long r8 = com.google.android.gms.internal.ads.cp3.m7490f(r8)
            r12.mo12260k(r8)
            if (r1 >= r5) goto L_0x009b
            int r4 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r1, r7)
            int r6 = r7.f6303a
            if (r2 == r6) goto L_0x0084
        L_0x009b:
            return r1
        L_0x009c:
            if (r6 != r14) goto L_0x00c0
            com.google.android.gms.internal.ads.bq3 r12 = (com.google.android.gms.internal.ads.bq3) r12
            int r1 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r7)
            int r2 = r7.f6303a
            int r2 = r2 + r1
        L_0x00a7:
            if (r1 >= r2) goto L_0x00b7
            int r1 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r1, r7)
            int r4 = r7.f6303a
            int r4 = com.google.android.gms.internal.ads.cp3.m7489e(r4)
            r12.mo5918N(r4)
            goto L_0x00a7
        L_0x00b7:
            if (r1 != r2) goto L_0x00bb
            goto L_0x03f0
        L_0x00bb:
            com.google.android.gms.internal.ads.mq3 r1 = com.google.android.gms.internal.ads.mq3.m13459j()
            throw r1
        L_0x00c0:
            if (r6 != 0) goto L_0x03ef
            com.google.android.gms.internal.ads.bq3 r12 = (com.google.android.gms.internal.ads.bq3) r12
        L_0x00c4:
            int r1 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r7)
            int r4 = r7.f6303a
            int r4 = com.google.android.gms.internal.ads.cp3.m7489e(r4)
            r12.mo5918N(r4)
            if (r1 >= r5) goto L_0x00db
            int r4 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r1, r7)
            int r6 = r7.f6303a
            if (r2 == r6) goto L_0x00c4
        L_0x00db:
            return r1
        L_0x00dc:
            if (r6 != r14) goto L_0x00e3
            int r2 = com.google.android.gms.internal.ads.fo3.m9253f(r3, r4, r12, r7)
            goto L_0x00f4
        L_0x00e3:
            if (r6 != 0) goto L_0x03ef
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.ads.fo3.m9259l(r2, r3, r4, r5, r6, r7)
        L_0x00f4:
            com.google.android.gms.internal.ads.aq3 r1 = (com.google.android.gms.internal.ads.aq3) r1
            com.google.android.gms.internal.ads.xs3 r3 = r1.zzc
            com.google.android.gms.internal.ads.xs3 r4 = com.google.android.gms.internal.ads.xs3.m19644c()
            if (r3 != r4) goto L_0x00ff
            r3 = 0
        L_0x00ff:
            com.google.android.gms.internal.ads.eq3 r4 = r15.m14073o(r8)
            com.google.android.gms.internal.ads.ws3<?, ?> r5 = r0.f11644m
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.ads.gs3.m9942c(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x010f
            goto L_0x0244
        L_0x010f:
            com.google.android.gms.internal.ads.xs3 r3 = (com.google.android.gms.internal.ads.xs3) r3
            r1.zzc = r3
            return r2
        L_0x0114:
            if (r6 != r14) goto L_0x03ef
            int r1 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r7)
            int r4 = r7.f6303a
            if (r4 < 0) goto L_0x015c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0157
            if (r4 != 0) goto L_0x012a
        L_0x0124:
            com.google.android.gms.internal.ads.uo3 r4 = com.google.android.gms.internal.ads.uo3.f15667g
            r12.add(r4)
            goto L_0x0132
        L_0x012a:
            com.google.android.gms.internal.ads.uo3 r6 = com.google.android.gms.internal.ads.uo3.m17969J(r3, r1, r4)
            r12.add(r6)
            int r1 = r1 + r4
        L_0x0132:
            if (r1 >= r5) goto L_0x0156
            int r4 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r1, r7)
            int r6 = r7.f6303a
            if (r2 == r6) goto L_0x013d
            goto L_0x0156
        L_0x013d:
            int r1 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r7)
            int r4 = r7.f6303a
            if (r4 < 0) goto L_0x0151
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x014c
            if (r4 != 0) goto L_0x012a
            goto L_0x0124
        L_0x014c:
            com.google.android.gms.internal.ads.mq3 r1 = com.google.android.gms.internal.ads.mq3.m13459j()
            throw r1
        L_0x0151:
            com.google.android.gms.internal.ads.mq3 r1 = com.google.android.gms.internal.ads.mq3.m13456f()
            throw r1
        L_0x0156:
            return r1
        L_0x0157:
            com.google.android.gms.internal.ads.mq3 r1 = com.google.android.gms.internal.ads.mq3.m13459j()
            throw r1
        L_0x015c:
            com.google.android.gms.internal.ads.mq3 r1 = com.google.android.gms.internal.ads.mq3.m13456f()
            throw r1
        L_0x0161:
            if (r6 == r14) goto L_0x0165
            goto L_0x03ef
        L_0x0165:
            com.google.android.gms.internal.ads.es3 r1 = r15.m14074p(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.ads.fo3.m9252e(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x017c:
            if (r6 != r14) goto L_0x03ef
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01c9
            int r1 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r7)
            int r4 = r7.f6303a
            if (r4 < 0) goto L_0x01c4
            if (r4 != 0) goto L_0x0197
        L_0x0193:
            r12.add(r6)
            goto L_0x01a2
        L_0x0197:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.kq3.f9606b
            r8.<init>(r3, r1, r4, r9)
        L_0x019e:
            r12.add(r8)
            int r1 = r1 + r4
        L_0x01a2:
            if (r1 >= r5) goto L_0x03f0
            int r4 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r1, r7)
            int r8 = r7.f6303a
            if (r2 != r8) goto L_0x03f0
            int r1 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r7)
            int r4 = r7.f6303a
            if (r4 < 0) goto L_0x01bf
            if (r4 != 0) goto L_0x01b7
            goto L_0x0193
        L_0x01b7:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.kq3.f9606b
            r8.<init>(r3, r1, r4, r9)
            goto L_0x019e
        L_0x01bf:
            com.google.android.gms.internal.ads.mq3 r1 = com.google.android.gms.internal.ads.mq3.m13456f()
            throw r1
        L_0x01c4:
            com.google.android.gms.internal.ads.mq3 r1 = com.google.android.gms.internal.ads.mq3.m13456f()
            throw r1
        L_0x01c9:
            int r1 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r7)
            int r4 = r7.f6303a
            if (r4 < 0) goto L_0x021e
            if (r4 != 0) goto L_0x01d7
        L_0x01d3:
            r12.add(r6)
            goto L_0x01ea
        L_0x01d7:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.ads.lt3.m12872j(r3, r1, r8)
            if (r9 == 0) goto L_0x0219
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.kq3.f9606b
            r9.<init>(r3, r1, r4, r10)
        L_0x01e6:
            r12.add(r9)
            r1 = r8
        L_0x01ea:
            if (r1 >= r5) goto L_0x03f0
            int r4 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r1, r7)
            int r8 = r7.f6303a
            if (r2 != r8) goto L_0x03f0
            int r1 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r7)
            int r4 = r7.f6303a
            if (r4 < 0) goto L_0x0214
            if (r4 != 0) goto L_0x01ff
            goto L_0x01d3
        L_0x01ff:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.ads.lt3.m12872j(r3, r1, r8)
            if (r9 == 0) goto L_0x020f
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.kq3.f9606b
            r9.<init>(r3, r1, r4, r10)
            goto L_0x01e6
        L_0x020f:
            com.google.android.gms.internal.ads.mq3 r1 = com.google.android.gms.internal.ads.mq3.m13454d()
            throw r1
        L_0x0214:
            com.google.android.gms.internal.ads.mq3 r1 = com.google.android.gms.internal.ads.mq3.m13456f()
            throw r1
        L_0x0219:
            com.google.android.gms.internal.ads.mq3 r1 = com.google.android.gms.internal.ads.mq3.m13454d()
            throw r1
        L_0x021e:
            com.google.android.gms.internal.ads.mq3 r1 = com.google.android.gms.internal.ads.mq3.m13456f()
            throw r1
        L_0x0223:
            r1 = 0
            if (r6 != r14) goto L_0x024c
            com.google.android.gms.internal.ads.go3 r12 = (com.google.android.gms.internal.ads.go3) r12
            int r2 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r7)
            int r4 = r7.f6303a
            int r4 = r4 + r2
        L_0x022f:
            if (r2 >= r4) goto L_0x0242
            int r2 = com.google.android.gms.internal.ads.fo3.m9260m(r3, r2, r7)
            long r5 = r7.f6304b
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x023d
            r5 = r13
            goto L_0x023e
        L_0x023d:
            r5 = r1
        L_0x023e:
            r12.mo7667i(r5)
            goto L_0x022f
        L_0x0242:
            if (r2 != r4) goto L_0x0247
        L_0x0244:
            r1 = r2
            goto L_0x03f0
        L_0x0247:
            com.google.android.gms.internal.ads.mq3 r1 = com.google.android.gms.internal.ads.mq3.m13459j()
            throw r1
        L_0x024c:
            if (r6 != 0) goto L_0x03ef
            com.google.android.gms.internal.ads.go3 r12 = (com.google.android.gms.internal.ads.go3) r12
            int r4 = com.google.android.gms.internal.ads.fo3.m9260m(r3, r4, r7)
            long r8 = r7.f6304b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x025c
        L_0x025a:
            r6 = r13
            goto L_0x025d
        L_0x025c:
            r6 = r1
        L_0x025d:
            r12.mo7667i(r6)
            if (r4 >= r5) goto L_0x0276
            int r6 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r7)
            int r8 = r7.f6303a
            if (r2 == r8) goto L_0x026b
            goto L_0x0276
        L_0x026b:
            int r4 = com.google.android.gms.internal.ads.fo3.m9260m(r3, r6, r7)
            long r8 = r7.f6304b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x025c
            goto L_0x025a
        L_0x0276:
            return r4
        L_0x0277:
            if (r6 != r14) goto L_0x0297
            com.google.android.gms.internal.ads.bq3 r12 = (com.google.android.gms.internal.ads.bq3) r12
            int r1 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r7)
            int r2 = r7.f6303a
            int r2 = r2 + r1
        L_0x0282:
            if (r1 >= r2) goto L_0x028e
            int r4 = com.google.android.gms.internal.ads.fo3.m9249b(r3, r1)
            r12.mo5918N(r4)
            int r1 = r1 + 4
            goto L_0x0282
        L_0x028e:
            if (r1 != r2) goto L_0x0292
            goto L_0x03f0
        L_0x0292:
            com.google.android.gms.internal.ads.mq3 r1 = com.google.android.gms.internal.ads.mq3.m13459j()
            throw r1
        L_0x0297:
            if (r6 != r9) goto L_0x03ef
            com.google.android.gms.internal.ads.bq3 r12 = (com.google.android.gms.internal.ads.bq3) r12
            int r1 = com.google.android.gms.internal.ads.fo3.m9249b(r17, r18)
        L_0x029f:
            r12.mo5918N(r1)
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02b4
            int r4 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r1, r7)
            int r6 = r7.f6303a
            if (r2 == r6) goto L_0x02af
            goto L_0x02b4
        L_0x02af:
            int r1 = com.google.android.gms.internal.ads.fo3.m9249b(r3, r4)
            goto L_0x029f
        L_0x02b4:
            return r1
        L_0x02b5:
            if (r6 != r14) goto L_0x02d5
            com.google.android.gms.internal.ads.zq3 r12 = (com.google.android.gms.internal.ads.zq3) r12
            int r1 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r7)
            int r2 = r7.f6303a
            int r2 = r2 + r1
        L_0x02c0:
            if (r1 >= r2) goto L_0x02cc
            long r4 = com.google.android.gms.internal.ads.fo3.m9261n(r3, r1)
            r12.mo12260k(r4)
            int r1 = r1 + 8
            goto L_0x02c0
        L_0x02cc:
            if (r1 != r2) goto L_0x02d0
            goto L_0x03f0
        L_0x02d0:
            com.google.android.gms.internal.ads.mq3 r1 = com.google.android.gms.internal.ads.mq3.m13459j()
            throw r1
        L_0x02d5:
            if (r6 != r13) goto L_0x03ef
            com.google.android.gms.internal.ads.zq3 r12 = (com.google.android.gms.internal.ads.zq3) r12
            long r8 = com.google.android.gms.internal.ads.fo3.m9261n(r17, r18)
        L_0x02dd:
            r12.mo12260k(r8)
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x02f2
            int r4 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r1, r7)
            int r6 = r7.f6303a
            if (r2 == r6) goto L_0x02ed
            goto L_0x02f2
        L_0x02ed:
            long r8 = com.google.android.gms.internal.ads.fo3.m9261n(r3, r4)
            goto L_0x02dd
        L_0x02f2:
            return r1
        L_0x02f3:
            if (r6 != r14) goto L_0x02fb
            int r1 = com.google.android.gms.internal.ads.fo3.m9253f(r3, r4, r12, r7)
            goto L_0x03f0
        L_0x02fb:
            if (r6 == 0) goto L_0x02ff
            goto L_0x03ef
        L_0x02ff:
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.ads.fo3.m9259l(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x030e:
            if (r6 != r14) goto L_0x032e
            com.google.android.gms.internal.ads.zq3 r12 = (com.google.android.gms.internal.ads.zq3) r12
            int r1 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r7)
            int r2 = r7.f6303a
            int r2 = r2 + r1
        L_0x0319:
            if (r1 >= r2) goto L_0x0325
            int r1 = com.google.android.gms.internal.ads.fo3.m9260m(r3, r1, r7)
            long r4 = r7.f6304b
            r12.mo12260k(r4)
            goto L_0x0319
        L_0x0325:
            if (r1 != r2) goto L_0x0329
            goto L_0x03f0
        L_0x0329:
            com.google.android.gms.internal.ads.mq3 r1 = com.google.android.gms.internal.ads.mq3.m13459j()
            throw r1
        L_0x032e:
            if (r6 != 0) goto L_0x03ef
            com.google.android.gms.internal.ads.zq3 r12 = (com.google.android.gms.internal.ads.zq3) r12
        L_0x0332:
            int r1 = com.google.android.gms.internal.ads.fo3.m9260m(r3, r4, r7)
            long r8 = r7.f6304b
            r12.mo12260k(r8)
            if (r1 >= r5) goto L_0x0345
            int r4 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r1, r7)
            int r6 = r7.f6303a
            if (r2 == r6) goto L_0x0332
        L_0x0345:
            return r1
        L_0x0346:
            if (r6 != r14) goto L_0x036a
            com.google.android.gms.internal.ads.up3 r12 = (com.google.android.gms.internal.ads.up3) r12
            int r1 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r7)
            int r2 = r7.f6303a
            int r2 = r2 + r1
        L_0x0351:
            if (r1 >= r2) goto L_0x0361
            int r4 = com.google.android.gms.internal.ads.fo3.m9249b(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.mo11279i(r4)
            int r1 = r1 + 4
            goto L_0x0351
        L_0x0361:
            if (r1 != r2) goto L_0x0365
            goto L_0x03f0
        L_0x0365:
            com.google.android.gms.internal.ads.mq3 r1 = com.google.android.gms.internal.ads.mq3.m13459j()
            throw r1
        L_0x036a:
            if (r6 != r9) goto L_0x03ef
            com.google.android.gms.internal.ads.up3 r12 = (com.google.android.gms.internal.ads.up3) r12
            int r1 = com.google.android.gms.internal.ads.fo3.m9249b(r17, r18)
        L_0x0372:
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo11279i(r1)
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x038b
            int r4 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r1, r7)
            int r6 = r7.f6303a
            if (r2 == r6) goto L_0x0386
            goto L_0x038b
        L_0x0386:
            int r1 = com.google.android.gms.internal.ads.fo3.m9249b(r3, r4)
            goto L_0x0372
        L_0x038b:
            return r1
        L_0x038c:
            if (r6 != r14) goto L_0x03af
            com.google.android.gms.internal.ads.jp3 r12 = (com.google.android.gms.internal.ads.jp3) r12
            int r1 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r7)
            int r2 = r7.f6303a
            int r2 = r2 + r1
        L_0x0397:
            if (r1 >= r2) goto L_0x03a7
            long r4 = com.google.android.gms.internal.ads.fo3.m9261n(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.mo8509i(r4)
            int r1 = r1 + 8
            goto L_0x0397
        L_0x03a7:
            if (r1 != r2) goto L_0x03aa
            goto L_0x03f0
        L_0x03aa:
            com.google.android.gms.internal.ads.mq3 r1 = com.google.android.gms.internal.ads.mq3.m13459j()
            throw r1
        L_0x03af:
            if (r6 != r13) goto L_0x03ef
            com.google.android.gms.internal.ads.jp3 r12 = (com.google.android.gms.internal.ads.jp3) r12
            long r8 = com.google.android.gms.internal.ads.fo3.m9261n(r17, r18)
        L_0x03b7:
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo8509i(r8)
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x03d0
            int r4 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r1, r7)
            int r6 = r7.f6303a
            if (r2 == r6) goto L_0x03cb
            goto L_0x03d0
        L_0x03cb:
            long r8 = com.google.android.gms.internal.ads.fo3.m9261n(r3, r4)
            goto L_0x03b7
        L_0x03d0:
            return r1
        L_0x03d1:
            if (r4 >= r5) goto L_0x03ee
            int r8 = com.google.android.gms.internal.ads.fo3.m9257j(r3, r4, r7)
            int r9 = r7.f6303a
            if (r2 == r9) goto L_0x03dc
            goto L_0x03ee
        L_0x03dc:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.ads.fo3.m9250c(r21, r22, r23, r24, r25, r26)
            goto L_0x0055
        L_0x03ee:
            return r4
        L_0x03ef:
            r1 = r4
        L_0x03f0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nr3.m14065U(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.eo3):int");
    }

    /* renamed from: V */
    private final int m14066V(int i) {
        if (i < this.f11634c || i > this.f11635d) {
            return -1;
        }
        return m14069k(i, 0);
    }

    /* renamed from: W */
    private final int m14067W(int i, int i2) {
        if (i < this.f11634c || i > this.f11635d) {
            return -1;
        }
        return m14069k(i, i2);
    }

    /* renamed from: X */
    private final int m14068X(int i) {
        return this.f11632a[i + 2];
    }

    /* renamed from: k */
    private final int m14069k(int i, int i2) {
        int length = (this.f11632a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f11632a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: l */
    private static int m14070l(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: m */
    private final int m14071m(int i) {
        return this.f11632a[i + 1];
    }

    /* renamed from: n */
    private static <T> long m14072n(T t, long j) {
        return ((Long) gt3.m9991p(t, j)).longValue();
    }

    /* renamed from: o */
    private final eq3 m14073o(int i) {
        int i2 = i / 3;
        return (eq3) this.f11633b[i2 + i2 + 1];
    }

    /* renamed from: p */
    private final es3 m14074p(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        es3 es3 = (es3) this.f11633b[i3];
        if (es3 != null) {
            return es3;
        }
        es3 b = tr3.m17481a().mo11101b((Class) this.f11633b[i3 + 1]);
        this.f11633b[i3] = b;
        return b;
    }

    /* renamed from: q */
    private final <UT, UB> UB m14075q(Object obj, int i, UB ub, ws3<UT, UB> ws3) {
        int i2 = this.f11632a[i];
        Object p = gt3.m9991p(obj, (long) (m14071m(i) & 1048575));
        if (p == null || m14073o(i) == null) {
            return ub;
        }
        er3 er3 = (er3) p;
        dr3 dr3 = (dr3) m14076r(i);
        throw null;
    }

    /* renamed from: r */
    private final Object m14076r(int i) {
        int i2 = i / 3;
        return this.f11633b[i2 + i2];
    }

    /* renamed from: s */
    private static Field m14077s(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: t */
    private final void m14078t(T t, T t2, int i) {
        long m = (long) (m14071m(i) & 1048575);
        if (m14046A(t2, i)) {
            Object p = gt3.m9991p(t, m);
            Object p2 = gt3.m9991p(t2, m);
            if (p != null && p2 != null) {
                p2 = kq3.m12306g(p, p2);
            } else if (p2 == null) {
                return;
            }
            gt3.m9971D(t, m, p2);
            m14081w(t, i);
        }
    }

    /* renamed from: u */
    private final void m14079u(T t, T t2, int i) {
        int m = m14071m(i);
        int i2 = this.f11632a[i];
        long j = (long) (m & 1048575);
        if (m14049D(t2, i2, i)) {
            Object p = m14049D(t, i2, i) ? gt3.m9991p(t, j) : null;
            Object p2 = gt3.m9991p(t2, j);
            if (p != null && p2 != null) {
                p2 = kq3.m12306g(p, p2);
            } else if (p2 == null) {
                return;
            }
            gt3.m9971D(t, j, p2);
            m14082x(t, i2, i);
        }
    }

    /* renamed from: v */
    private final void m14080v(Object obj, int i, wr3 wr3) {
        long j;
        Object l;
        if (m14084z(i)) {
            j = (long) (i & 1048575);
            l = wr3.mo6561y();
        } else {
            int i2 = i & 1048575;
            if (this.f11638g) {
                j = (long) i2;
                l = wr3.mo6553q();
            } else {
                j = (long) i2;
                l = wr3.mo6548l();
            }
        }
        gt3.m9971D(obj, j, l);
    }

    /* renamed from: w */
    private final void m14081w(T t, int i) {
        int X = m14068X(i);
        long j = (long) (1048575 & X);
        if (j != 1048575) {
            gt3.m9969B(t, j, (1 << (X >>> 20)) | gt3.m9987l(t, j));
        }
    }

    /* renamed from: x */
    private final void m14082x(T t, int i, int i2) {
        gt3.m9969B(t, (long) (m14068X(i2) & 1048575), i);
    }

    /* renamed from: y */
    private final boolean m14083y(T t, T t2, int i) {
        return m14046A(t, i) == m14046A(t2, i);
    }

    /* renamed from: z */
    private static boolean m14084z(int i) {
        return (i & 536870912) != 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x032d, code lost:
        if (r0 != r15) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0349, code lost:
        r7 = r33;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0373, code lost:
        if (r0 != r15) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0397, code lost:
        if (r0 != r15) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ff, code lost:
        r10.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0149, code lost:
        r10.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01f8, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0230, code lost:
        r0.putLong(r1, r2, r4);
        r5 = r6 | r24;
        r3 = r7;
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0270, code lost:
        r5 = r6 | r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0272, code lost:
        r3 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0273, code lost:
        r1 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x028a, code lost:
        r18 = r6;
        r19 = r7;
        r26 = r10;
        r8 = r11;
        r23 = r20;
        r6 = r25;
        r7 = r33;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9590I(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.ads.eo3 r34) {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            sun.misc.Unsafe r10 = f11631r
            r16 = 0
            r0 = r31
            r1 = r16
            r3 = r1
            r5 = r3
            r2 = -1
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x040b
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = com.google.android.gms.internal.ads.fo3.m9258k(r0, r12, r1, r9)
            int r1 = r9.f6303a
            goto L_0x002e
        L_0x0029:
            r27 = r1
            r1 = r0
            r0 = r27
        L_0x002e:
            int r7 = r1 >>> 3
            r8 = r1 & 7
            r4 = 3
            if (r7 <= r2) goto L_0x003b
            int r3 = r3 / r4
            int r2 = r15.m14067W(r7, r3)
            goto L_0x003f
        L_0x003b:
            int r2 = r15.m14066V(r7)
        L_0x003f:
            r3 = -1
            if (r2 != r3) goto L_0x0051
            r2 = r0
            r8 = r1
            r17 = r3
            r18 = r5
            r23 = r7
            r26 = r10
            r7 = r11
            r19 = r16
            goto L_0x039a
        L_0x0051:
            int[] r3 = r15.f11632a
            int r19 = r2 + 1
            r3 = r3[r19]
            int r4 = m14070l(r3)
            r20 = r1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r3 & r17
            r21 = r0
            long r0 = (long) r1
            r22 = r0
            r0 = 17
            if (r4 > r0) goto L_0x0299
            int[] r0 = r15.f11632a
            int r24 = r2 + 2
            r0 = r0[r24]
            int r24 = r0 >>> 20
            r1 = 1
            int r24 = r1 << r24
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r11
            r17 = r2
            if (r0 == r6) goto L_0x008c
            if (r6 == r11) goto L_0x0084
            long r1 = (long) r6
            r10.putInt(r14, r1, r5)
        L_0x0084:
            long r1 = (long) r0
            int r5 = r10.getInt(r14, r1)
            r25 = r0
            goto L_0x008e
        L_0x008c:
            r25 = r6
        L_0x008e:
            r6 = r5
            r0 = 5
            switch(r4) {
                case 0: goto L_0x0254;
                case 1: goto L_0x0238;
                case 2: goto L_0x0214;
                case 3: goto L_0x0214;
                case 4: goto L_0x01fb;
                case 5: goto L_0x01d7;
                case 6: goto L_0x01be;
                case 7: goto L_0x019b;
                case 8: goto L_0x0177;
                case 9: goto L_0x014e;
                case 10: goto L_0x0134;
                case 11: goto L_0x01fb;
                case 12: goto L_0x0104;
                case 13: goto L_0x01be;
                case 14: goto L_0x01d7;
                case 15: goto L_0x00e7;
                case 16: goto L_0x00be;
                default: goto L_0x0093;
            }
        L_0x0093:
            r11 = r20
            r2 = r21
            r4 = r22
            r0 = 3
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x028a
            com.google.android.gms.internal.ads.es3 r0 = r15.m14074p(r7)
            int r1 = r20 << 3
            r8 = r1 | 4
            r1 = r30
            r3 = r32
            r12 = r4
            r4 = r8
            r5 = r34
            int r0 = com.google.android.gms.internal.ads.fo3.m9250c(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r24
            if (r1 != 0) goto L_0x0276
            java.lang.Object r1 = r9.f6305c
            goto L_0x0280
        L_0x00be:
            if (r8 != 0) goto L_0x00db
            r1 = r21
            int r8 = com.google.android.gms.internal.ads.fo3.m9260m(r12, r1, r9)
            long r0 = r9.f6304b
            long r4 = com.google.android.gms.internal.ads.cp3.m7490f(r0)
            r2 = r22
            r0 = r10
            r11 = r20
            r1 = r29
            r20 = r7
            r7 = r17
            r17 = -1
            goto L_0x0230
        L_0x00db:
            r11 = r20
            r20 = r7
            r7 = r17
            r17 = -1
            r2 = r21
            goto L_0x028a
        L_0x00e7:
            r11 = r20
            r1 = r21
            r2 = r22
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x01f8
            int r0 = com.google.android.gms.internal.ads.fo3.m9257j(r12, r1, r9)
            int r1 = r9.f6303a
            int r1 = com.google.android.gms.internal.ads.cp3.m7489e(r1)
        L_0x00ff:
            r10.putInt(r14, r2, r1)
            goto L_0x0270
        L_0x0104:
            r11 = r20
            r1 = r21
            r2 = r22
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x01f8
            int r0 = com.google.android.gms.internal.ads.fo3.m9257j(r12, r1, r9)
            int r1 = r9.f6303a
            com.google.android.gms.internal.ads.eq3 r4 = r15.m14073o(r7)
            if (r4 == 0) goto L_0x00ff
            boolean r4 = r4.mo6282d(r1)
            if (r4 == 0) goto L_0x0125
            goto L_0x00ff
        L_0x0125:
            com.google.android.gms.internal.ads.xs3 r2 = m14054J(r29)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo11916h(r11, r1)
            r5 = r6
            goto L_0x0272
        L_0x0134:
            r11 = r20
            r1 = r21
            r2 = r22
            r0 = 2
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x01f8
            int r0 = com.google.android.gms.internal.ads.fo3.m9248a(r12, r1, r9)
            java.lang.Object r1 = r9.f6305c
        L_0x0149:
            r10.putObject(r14, r2, r1)
            goto L_0x0270
        L_0x014e:
            r11 = r20
            r1 = r21
            r2 = r22
            r0 = 2
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x01f8
            com.google.android.gms.internal.ads.es3 r0 = r15.m14074p(r7)
            int r0 = com.google.android.gms.internal.ads.fo3.m9251d(r0, r12, r1, r13, r9)
            r1 = r6 & r24
            if (r1 != 0) goto L_0x016c
            java.lang.Object r1 = r9.f6305c
            goto L_0x0149
        L_0x016c:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r9.f6305c
            java.lang.Object r1 = com.google.android.gms.internal.ads.kq3.m12306g(r1, r4)
            goto L_0x0149
        L_0x0177:
            r11 = r20
            r1 = r21
            r4 = r22
            r0 = 2
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x01f8
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x0190
            int r0 = com.google.android.gms.internal.ads.fo3.m9254g(r12, r1, r9)
            goto L_0x0194
        L_0x0190:
            int r0 = com.google.android.gms.internal.ads.fo3.m9255h(r12, r1, r9)
        L_0x0194:
            java.lang.Object r1 = r9.f6305c
            r10.putObject(r14, r4, r1)
            goto L_0x0270
        L_0x019b:
            r11 = r20
            r1 = r21
            r4 = r22
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x01f8
            int r0 = com.google.android.gms.internal.ads.fo3.m9260m(r12, r1, r9)
            long r1 = r9.f6304b
            r21 = 0
            int r1 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r1 == 0) goto L_0x01b7
            r1 = 1
            goto L_0x01b9
        L_0x01b7:
            r1 = r16
        L_0x01b9:
            com.google.android.gms.internal.ads.gt3.m9999x(r14, r4, r1)
            goto L_0x0270
        L_0x01be:
            r11 = r20
            r1 = r21
            r4 = r22
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x01f8
            int r0 = com.google.android.gms.internal.ads.fo3.m9249b(r12, r1)
            r10.putInt(r14, r4, r0)
            int r0 = r1 + 4
            goto L_0x0270
        L_0x01d7:
            r11 = r20
            r1 = r21
            r4 = r22
            r0 = 1
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x01f8
            long r21 = com.google.android.gms.internal.ads.fo3.m9261n(r12, r1)
            r8 = r1
            r0 = r10
            r1 = r29
            r2 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0270
        L_0x01f8:
            r2 = r1
            goto L_0x028a
        L_0x01fb:
            r11 = r20
            r2 = r21
            r4 = r22
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x028a
            int r0 = com.google.android.gms.internal.ads.fo3.m9257j(r12, r2, r9)
            int r1 = r9.f6303a
            r10.putInt(r14, r4, r1)
            goto L_0x0270
        L_0x0214:
            r11 = r20
            r2 = r21
            r4 = r22
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x028a
            int r8 = com.google.android.gms.internal.ads.fo3.m9260m(r12, r2, r9)
            long r2 = r9.f6304b
            r0 = r10
            r1 = r29
            r21 = r2
            r2 = r4
            r4 = r21
        L_0x0230:
            r0.putLong(r1, r2, r4)
            r5 = r6 | r24
            r3 = r7
            r0 = r8
            goto L_0x0273
        L_0x0238:
            r11 = r20
            r2 = r21
            r4 = r22
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x028a
            int r0 = com.google.android.gms.internal.ads.fo3.m9249b(r12, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.ads.gt3.m9968A(r14, r4, r0)
            int r0 = r2 + 4
            goto L_0x0270
        L_0x0254:
            r11 = r20
            r2 = r21
            r4 = r22
            r0 = 1
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x028a
            long r0 = com.google.android.gms.internal.ads.fo3.m9261n(r12, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.ads.gt3.m10001z(r14, r4, r0)
            int r0 = r2 + 8
        L_0x0270:
            r5 = r6 | r24
        L_0x0272:
            r3 = r7
        L_0x0273:
            r1 = r11
            goto L_0x02e5
        L_0x0276:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r9.f6305c
            java.lang.Object r1 = com.google.android.gms.internal.ads.kq3.m12306g(r1, r2)
        L_0x0280:
            r10.putObject(r14, r12, r1)
            r5 = r6 | r24
            r12 = r30
            r13 = r32
            goto L_0x0272
        L_0x028a:
            r18 = r6
            r19 = r7
            r26 = r10
            r8 = r11
            r23 = r20
            r6 = r25
            r7 = r33
            goto L_0x039a
        L_0x0299:
            r11 = r20
            r12 = r22
            r17 = -1
            r20 = r7
            r7 = r2
            r2 = r21
            r0 = 27
            if (r4 != r0) goto L_0x02fc
            r0 = 2
            if (r8 != r0) goto L_0x02ed
            java.lang.Object r0 = r10.getObject(r14, r12)
            com.google.android.gms.internal.ads.jq3 r0 = (com.google.android.gms.internal.ads.jq3) r0
            boolean r1 = r0.mo6246c()
            if (r1 != 0) goto L_0x02c8
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02c0
            r1 = 10
            goto L_0x02c1
        L_0x02c0:
            int r1 = r1 + r1
        L_0x02c1:
            com.google.android.gms.internal.ads.jq3 r0 = r0.mo5923e(r1)
            r10.putObject(r14, r12, r0)
        L_0x02c8:
            r8 = r0
            com.google.android.gms.internal.ads.es3 r0 = r15.m14074p(r7)
            r1 = r11
            r3 = r2
            r2 = r30
            r4 = r32
            r18 = r5
            r5 = r8
            r25 = r6
            r6 = r34
            int r0 = com.google.android.gms.internal.ads.fo3.m9252e(r0, r1, r2, r3, r4, r5, r6)
            r12 = r30
            r13 = r32
            r3 = r7
            r5 = r18
        L_0x02e5:
            r2 = r20
            r6 = r25
            r11 = r33
            goto L_0x001a
        L_0x02ed:
            r18 = r5
            r25 = r6
            r15 = r2
            r19 = r7
            r26 = r10
            r23 = r20
            r20 = r11
            goto L_0x0376
        L_0x02fc:
            r18 = r5
            r25 = r6
            r6 = r2
            r0 = 49
            if (r4 > r0) goto L_0x034d
            long r2 = (long) r3
            r0 = r28
            r1 = r29
            r21 = r2
            r2 = r30
            r3 = r6
            r5 = r4
            r4 = r32
            r31 = r5
            r5 = r11
            r15 = r6
            r6 = r20
            r19 = r7
            r23 = r20
            r7 = r8
            r8 = r19
            r26 = r10
            r9 = r21
            r20 = r11
            r11 = r31
            r14 = r34
            int r0 = r0.m14065U(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0349
        L_0x032f:
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            r5 = r18
            r3 = r19
            r1 = r20
            r2 = r23
            r6 = r25
            r10 = r26
            goto L_0x001a
        L_0x0349:
            r7 = r33
            r2 = r0
            goto L_0x0379
        L_0x034d:
            r31 = r4
            r15 = r6
            r19 = r7
            r26 = r10
            r23 = r20
            r20 = r11
            r0 = 50
            r9 = r31
            if (r9 != r0) goto L_0x037e
            r0 = 2
            if (r8 != r0) goto L_0x0376
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r19
            r6 = r12
            r8 = r34
            int r0 = r0.m14062R(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0349
            goto L_0x032f
        L_0x0376:
            r7 = r33
            r2 = r15
        L_0x0379:
            r8 = r20
            r6 = r25
            goto L_0x039a
        L_0x037e:
            r0 = r28
            r1 = r29
            r2 = r30
            r10 = r3
            r3 = r15
            r4 = r32
            r5 = r20
            r6 = r23
            r7 = r8
            r8 = r10
            r10 = r12
            r12 = r19
            r13 = r34
            int r0 = r0.m14063S(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0349
            goto L_0x032f
        L_0x039a:
            if (r8 != r7) goto L_0x03ac
            if (r7 == 0) goto L_0x03ac
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r28
            r12 = r29
            r0 = r2
            r1 = r8
            r5 = r18
            r2 = 0
            goto L_0x0418
        L_0x03ac:
            r9 = r28
            boolean r0 = r9.f11637f
            if (r0 == 0) goto L_0x03e4
            r10 = r34
            com.google.android.gms.internal.ads.mp3 r0 = r10.f6306d
            com.google.android.gms.internal.ads.mp3 r1 = com.google.android.gms.internal.ads.mp3.m13445a()
            if (r0 == r1) goto L_0x03e1
            com.google.android.gms.internal.ads.kr3 r0 = r9.f11636e
            com.google.android.gms.internal.ads.mp3 r1 = r10.f6306d
            r11 = r23
            com.google.android.gms.internal.ads.zp3 r0 = r1.mo9348c(r0, r11)
            if (r0 != 0) goto L_0x03da
            com.google.android.gms.internal.ads.xs3 r4 = m14054J(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.ads.fo3.m9256i(r0, r1, r2, r3, r4, r5)
            r12 = r29
            goto L_0x03f9
        L_0x03da:
            r12 = r29
            r0 = r12
            com.google.android.gms.internal.ads.yp3 r0 = (com.google.android.gms.internal.ads.yp3) r0
            r2 = 0
            throw r2
        L_0x03e1:
            r12 = r29
            goto L_0x03e8
        L_0x03e4:
            r12 = r29
            r10 = r34
        L_0x03e8:
            r11 = r23
            com.google.android.gms.internal.ads.xs3 r4 = m14054J(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.ads.fo3.m9256i(r0, r1, r2, r3, r4, r5)
        L_0x03f9:
            r13 = r32
            r1 = r8
            r15 = r9
            r9 = r10
            r2 = r11
            r14 = r12
            r5 = r18
            r3 = r19
            r10 = r26
            r12 = r30
            r11 = r7
            goto L_0x001a
        L_0x040b:
            r18 = r5
            r25 = r6
            r26 = r10
            r7 = r11
            r12 = r14
            r9 = r15
            r2 = 0
            r3 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0418:
            if (r6 == r3) goto L_0x0420
            long r3 = (long) r6
            r6 = r26
            r6.putInt(r12, r3, r5)
        L_0x0420:
            int r3 = r9.f11641j
        L_0x0422:
            int r4 = r9.f11642k
            if (r3 >= r4) goto L_0x0432
            int[] r4 = r9.f11640i
            r4 = r4[r3]
            com.google.android.gms.internal.ads.ws3<?, ?> r5 = r9.f11644m
            r9.m14075q(r12, r4, r2, r5)
            int r3 = r3 + 1
            goto L_0x0422
        L_0x0432:
            r2 = r32
            if (r7 != 0) goto L_0x043e
            if (r0 != r2) goto L_0x0439
            goto L_0x0442
        L_0x0439:
            com.google.android.gms.internal.ads.mq3 r0 = com.google.android.gms.internal.ads.mq3.m13457g()
            throw r0
        L_0x043e:
            if (r0 > r2) goto L_0x0443
            if (r1 != r7) goto L_0x0443
        L_0x0442:
            return r0
        L_0x0443:
            com.google.android.gms.internal.ads.mq3 r0 = com.google.android.gms.internal.ads.mq3.m13457g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nr3.mo9590I(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.eo3):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        r2 = r2 * 53;
        r3 = m14061Q(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a2, code lost:
        r2 = r2 * 53;
        r3 = m14072n(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        if (r3 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.ads.gt3.m9991p(r9, r5).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00da, code lost:
        if (r3 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e4, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) com.google.android.gms.internal.ads.gt3.m9991p(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f7, code lost:
        r3 = com.google.android.gms.internal.ads.kq3.m12300a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0110, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011b, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011f, code lost:
        r3 = com.google.android.gms.internal.ads.kq3.m12302c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0123, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0124, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo7061a(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f11632a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x0128
            int r3 = r8.m14071m(r1)
            int[] r4 = r8.f11632a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = m14070l(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0115;
                case 1: goto L_0x010a;
                case 2: goto L_0x0103;
                case 3: goto L_0x0103;
                case 4: goto L_0x00fc;
                case 5: goto L_0x0103;
                case 6: goto L_0x00fc;
                case 7: goto L_0x00f1;
                case 8: goto L_0x00e4;
                case 9: goto L_0x00d6;
                case 10: goto L_0x00cb;
                case 11: goto L_0x00fc;
                case 12: goto L_0x00fc;
                case 13: goto L_0x00fc;
                case 14: goto L_0x0103;
                case 15: goto L_0x00fc;
                case 16: goto L_0x0103;
                case 17: goto L_0x00c4;
                case 18: goto L_0x00cb;
                case 19: goto L_0x00cb;
                case 20: goto L_0x00cb;
                case 21: goto L_0x00cb;
                case 22: goto L_0x00cb;
                case 23: goto L_0x00cb;
                case 24: goto L_0x00cb;
                case 25: goto L_0x00cb;
                case 26: goto L_0x00cb;
                case 27: goto L_0x00cb;
                case 28: goto L_0x00cb;
                case 29: goto L_0x00cb;
                case 30: goto L_0x00cb;
                case 31: goto L_0x00cb;
                case 32: goto L_0x00cb;
                case 33: goto L_0x00cb;
                case 34: goto L_0x00cb;
                case 35: goto L_0x00cb;
                case 36: goto L_0x00cb;
                case 37: goto L_0x00cb;
                case 38: goto L_0x00cb;
                case 39: goto L_0x00cb;
                case 40: goto L_0x00cb;
                case 41: goto L_0x00cb;
                case 42: goto L_0x00cb;
                case 43: goto L_0x00cb;
                case 44: goto L_0x00cb;
                case 45: goto L_0x00cb;
                case 46: goto L_0x00cb;
                case 47: goto L_0x00cb;
                case 48: goto L_0x00cb;
                case 49: goto L_0x00cb;
                case 50: goto L_0x00cb;
                case 51: goto L_0x00b7;
                case 52: goto L_0x00aa;
                case 53: goto L_0x009c;
                case 54: goto L_0x0095;
                case 55: goto L_0x0087;
                case 56: goto L_0x0080;
                case 57: goto L_0x0079;
                case 58: goto L_0x006b;
                case 59: goto L_0x0063;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0124
        L_0x001f:
            boolean r3 = r8.m14049D(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00cb
        L_0x0027:
            boolean r3 = r8.m14049D(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00a2
        L_0x002f:
            boolean r3 = r8.m14049D(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x004b
        L_0x0036:
            boolean r3 = r8.m14049D(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00a2
        L_0x003e:
            boolean r3 = r8.m14049D(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x004b
        L_0x0045:
            boolean r3 = r8.m14049D(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
        L_0x004b:
            goto L_0x008d
        L_0x004c:
            boolean r3 = r8.m14049D(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x008d
        L_0x0053:
            boolean r3 = r8.m14049D(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00cb
        L_0x005b:
            boolean r3 = r8.m14049D(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00cb
        L_0x0063:
            boolean r3 = r8.m14049D(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00e4
        L_0x006b:
            boolean r3 = r8.m14049D(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            int r2 = r2 * 53
            boolean r3 = m14050E(r9, r5)
            goto L_0x00f7
        L_0x0079:
            boolean r3 = r8.m14049D(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x008d
        L_0x0080:
            boolean r3 = r8.m14049D(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00a2
        L_0x0087:
            boolean r3 = r8.m14049D(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
        L_0x008d:
            int r2 = r2 * 53
            int r3 = m14061Q(r9, r5)
            goto L_0x0123
        L_0x0095:
            boolean r3 = r8.m14049D(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00a2
        L_0x009c:
            boolean r3 = r8.m14049D(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
        L_0x00a2:
            int r2 = r2 * 53
            long r3 = m14072n(r9, r5)
            goto L_0x011f
        L_0x00aa:
            boolean r3 = r8.m14049D(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            int r2 = r2 * 53
            float r3 = m14058N(r9, r5)
            goto L_0x0110
        L_0x00b7:
            boolean r3 = r8.m14049D(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            int r2 = r2 * 53
            double r3 = m14057M(r9, r5)
            goto L_0x011b
        L_0x00c4:
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r9, r5)
            if (r3 == 0) goto L_0x00e0
            goto L_0x00dc
        L_0x00cb:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0123
        L_0x00d6:
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r9, r5)
            if (r3 == 0) goto L_0x00e0
        L_0x00dc:
            int r7 = r3.hashCode()
        L_0x00e0:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0124
        L_0x00e4:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0123
        L_0x00f1:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.ads.gt3.m9975H(r9, r5)
        L_0x00f7:
            int r3 = com.google.android.gms.internal.ads.kq3.m12300a(r3)
            goto L_0x0123
        L_0x00fc:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.gt3.m9987l(r9, r5)
            goto L_0x0123
        L_0x0103:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.gt3.m9989n(r9, r5)
            goto L_0x011f
        L_0x010a:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.ads.gt3.m9986k(r9, r5)
        L_0x0110:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0123
        L_0x0115:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.ads.gt3.m9985j(r9, r5)
        L_0x011b:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x011f:
            int r3 = com.google.android.gms.internal.ads.kq3.m12302c(r3)
        L_0x0123:
            int r2 = r2 + r3
        L_0x0124:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0128:
            int r2 = r2 * 53
            com.google.android.gms.internal.ads.ws3<?, ?> r0 = r8.f11644m
            java.lang.Object r0 = r0.mo11706d(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f11637f
            if (r0 != 0) goto L_0x013a
            return r2
        L_0x013a:
            com.google.android.gms.internal.ads.np3<?> r0 = r8.f11645n
            r0.mo9574a(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nr3.mo7061a(java.lang.Object):int");
    }

    /* renamed from: b */
    public final T mo7062b() {
        return ((aq3) this.f11636e).mo5181E(4, (Object) null, (Object) null);
    }

    /* renamed from: c */
    public final int mo7063c(T t) {
        return this.f11639h ? m14060P(t) : m14059O(t);
    }

    /* renamed from: d */
    public final void mo7064d(T t) {
        int i;
        int i2 = this.f11641j;
        while (true) {
            i = this.f11642k;
            if (i2 >= i) {
                break;
            }
            long m = (long) (m14071m(this.f11640i[i2]) & 1048575);
            Object p = gt3.m9991p(t, m);
            if (p != null) {
                ((er3) p).mo7042c();
                gt3.m9971D(t, m, p);
            }
            i2++;
        }
        int length = this.f11640i.length;
        while (i < length) {
            this.f11643l.mo11291b(t, (long) this.f11640i[i]);
            i++;
        }
        this.f11644m.mo11715m(t);
        if (this.f11637f) {
            this.f11645n.mo9578e(t);
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: e */
    public final void mo7065e(T r13, com.google.android.gms.internal.ads.wr3 r14, com.google.android.gms.internal.ads.mp3 r15) {
        /*
            r12 = this;
            java.util.Objects.requireNonNull(r15)
            com.google.android.gms.internal.ads.ws3<?, ?> r7 = r12.f11644m
            com.google.android.gms.internal.ads.np3<?> r8 = r12.f11645n
            r9 = 0
            r0 = r9
            r10 = r0
        L_0x000a:
            int r1 = r14.mo6539c()     // Catch:{ all -> 0x0079 }
            int r2 = r12.m14066V(r1)     // Catch:{ all -> 0x0079 }
            if (r2 >= 0) goto L_0x007c
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0030
            int r14 = r12.f11641j
        L_0x001b:
            int r15 = r12.f11642k
            if (r14 >= r15) goto L_0x002a
            int[] r15 = r12.f11640i
            r15 = r15[r14]
            java.lang.Object r10 = r12.m14075q(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x001b
        L_0x002a:
            if (r10 == 0) goto L_0x051b
            r7.mo11716n(r13, r10)
            return
        L_0x0030:
            boolean r2 = r12.f11637f     // Catch:{ all -> 0x0079 }
            if (r2 != 0) goto L_0x0036
            r2 = r9
            goto L_0x003d
        L_0x0036:
            com.google.android.gms.internal.ads.kr3 r2 = r12.f11636e     // Catch:{ all -> 0x0079 }
            java.lang.Object r1 = r8.mo9576c(r15, r2, r1)     // Catch:{ all -> 0x0079 }
            r2 = r1
        L_0x003d:
            if (r2 == 0) goto L_0x0052
            if (r0 != 0) goto L_0x0045
            com.google.android.gms.internal.ads.sp3 r0 = r8.mo9575b(r13)     // Catch:{ all -> 0x0079 }
        L_0x0045:
            r11 = r0
            r0 = r8
            r1 = r14
            r3 = r15
            r4 = r11
            r5 = r10
            r6 = r7
            java.lang.Object r10 = r0.mo9577d(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0079 }
            r0 = r11
            goto L_0x000a
        L_0x0052:
            r7.mo11719q(r14)     // Catch:{ all -> 0x0079 }
            if (r10 != 0) goto L_0x005c
            java.lang.Object r1 = r7.mo11705c(r13)     // Catch:{ all -> 0x0079 }
            r10 = r1
        L_0x005c:
            boolean r1 = r7.mo11718p(r10, r14)     // Catch:{ all -> 0x0079 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.f11641j
        L_0x0064:
            int r15 = r12.f11642k
            if (r14 >= r15) goto L_0x0073
            int[] r15 = r12.f11640i
            r15 = r15[r14]
            java.lang.Object r10 = r12.m14075q(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x0064
        L_0x0073:
            if (r10 == 0) goto L_0x051b
            r7.mo11716n(r13, r10)
            return
        L_0x0079:
            r14 = move-exception
            goto L_0x051c
        L_0x007c:
            int r3 = r12.m14071m(r2)     // Catch:{ all -> 0x0079 }
            int r4 = m14070l(r3)     // Catch:{ lq3 -> 0x04f5 }
            r5 = 1048575(0xfffff, float:1.469367E-39)
            switch(r4) {
                case 0: goto L_0x04cb;
                case 1: goto L_0x04bf;
                case 2: goto L_0x04b3;
                case 3: goto L_0x04a7;
                case 4: goto L_0x049b;
                case 5: goto L_0x048f;
                case 6: goto L_0x0483;
                case 7: goto L_0x0477;
                case 8: goto L_0x0472;
                case 9: goto L_0x0447;
                case 10: goto L_0x043c;
                case 11: goto L_0x0431;
                case 12: goto L_0x041a;
                case 13: goto L_0x040f;
                case 14: goto L_0x0404;
                case 15: goto L_0x03f9;
                case 16: goto L_0x03ee;
                case 17: goto L_0x03bd;
                case 18: goto L_0x03b2;
                case 19: goto L_0x03a7;
                case 20: goto L_0x039c;
                case 21: goto L_0x0391;
                case 22: goto L_0x0386;
                case 23: goto L_0x037b;
                case 24: goto L_0x0370;
                case 25: goto L_0x0365;
                case 26: goto L_0x033b;
                case 27: goto L_0x0329;
                case 28: goto L_0x031b;
                case 29: goto L_0x0310;
                case 30: goto L_0x02ff;
                case 31: goto L_0x02f4;
                case 32: goto L_0x02e9;
                case 33: goto L_0x02de;
                case 34: goto L_0x02d3;
                case 35: goto L_0x02c5;
                case 36: goto L_0x02b7;
                case 37: goto L_0x02a9;
                case 38: goto L_0x029b;
                case 39: goto L_0x028d;
                case 40: goto L_0x027f;
                case 41: goto L_0x0271;
                case 42: goto L_0x0263;
                case 43: goto L_0x0255;
                case 44: goto L_0x0240;
                case 45: goto L_0x0232;
                case 46: goto L_0x0224;
                case 47: goto L_0x0216;
                case 48: goto L_0x0208;
                case 49: goto L_0x01f6;
                case 50: goto L_0x01c0;
                case 51: goto L_0x01b1;
                case 52: goto L_0x01a2;
                case 53: goto L_0x0193;
                case 54: goto L_0x0184;
                case 55: goto L_0x0175;
                case 56: goto L_0x0166;
                case 57: goto L_0x0157;
                case 58: goto L_0x0148;
                case 59: goto L_0x0143;
                case 60: goto L_0x0115;
                case 61: goto L_0x010b;
                case 62: goto L_0x00fd;
                case 63: goto L_0x00dc;
                case 64: goto L_0x00ce;
                case 65: goto L_0x00c0;
                case 66: goto L_0x00b2;
                case 67: goto L_0x00a4;
                case 68: goto L_0x0092;
                default: goto L_0x008a;
            }     // Catch:{ lq3 -> 0x04f5 }
        L_0x008a:
            if (r10 != 0) goto L_0x04d8
            java.lang.Object r1 = r7.mo11708f()     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x04d7
        L_0x0092:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.es3 r5 = r12.m14074p(r2)     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Object r5 = r14.mo6532I(r5, r15)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
        L_0x009f:
            r12.m14082x(r13, r1, r2)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x00a4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ lq3 -> 0x04f5 }
            long r5 = r14.mo6549m()     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x009f
        L_0x00b2:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ lq3 -> 0x04f5 }
            int r5 = r14.mo6544h()     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x009f
        L_0x00c0:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ lq3 -> 0x04f5 }
            long r5 = r14.mo6551o()     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x009f
        L_0x00ce:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ lq3 -> 0x04f5 }
            int r5 = r14.mo6542f()     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x009f
        L_0x00dc:
            int r4 = r14.mo6538b()     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.eq3 r6 = r12.m14073o(r2)     // Catch:{ lq3 -> 0x04f5 }
            if (r6 == 0) goto L_0x00f3
            boolean r6 = r6.mo6282d(r4)     // Catch:{ lq3 -> 0x04f5 }
            if (r6 == 0) goto L_0x00ed
            goto L_0x00f3
        L_0x00ed:
            java.lang.Object r10 = com.google.android.gms.internal.ads.gs3.m9943d(r1, r4, r10, r7)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x00f3:
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r5, r3)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x009f
        L_0x00fd:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ lq3 -> 0x04f5 }
            int r5 = r14.mo6545i()     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x009f
        L_0x010b:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.uo3 r5 = r14.mo6548l()     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x009f
        L_0x0115:
            boolean r4 = r12.m14049D(r13, r1, r2)     // Catch:{ lq3 -> 0x04f5 }
            r3 = r3 & r5
            if (r4 == 0) goto L_0x0132
            long r3 = (long) r3     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Object r5 = com.google.android.gms.internal.ads.gt3.m9991p(r13, r3)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.es3 r6 = r12.m14074p(r2)     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Object r6 = r14.mo6527D(r6, r15)     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Object r5 = com.google.android.gms.internal.ads.kq3.m12306g(r5, r6)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x009f
        L_0x0132:
            long r3 = (long) r3     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.es3 r5 = r12.m14074p(r2)     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Object r5 = r14.mo6527D(r5, r15)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
            r12.m14081w(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x009f
        L_0x0143:
            r12.m14080v(r13, r3, r14)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x009f
        L_0x0148:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ lq3 -> 0x04f5 }
            boolean r5 = r14.mo6536O()     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x009f
        L_0x0157:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ lq3 -> 0x04f5 }
            int r5 = r14.mo6540d()     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x009f
        L_0x0166:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ lq3 -> 0x04f5 }
            long r5 = r14.mo6546j()     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x009f
        L_0x0175:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ lq3 -> 0x04f5 }
            int r5 = r14.mo6541e()     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x009f
        L_0x0184:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ lq3 -> 0x04f5 }
            long r5 = r14.mo6550n()     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x009f
        L_0x0193:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ lq3 -> 0x04f5 }
            long r5 = r14.mo6547k()     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x009f
        L_0x01a2:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ lq3 -> 0x04f5 }
            float r5 = r14.mo6537a()     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x009f
        L_0x01b1:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ lq3 -> 0x04f5 }
            double r5 = r14.zza()     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x009f
        L_0x01c0:
            java.lang.Object r1 = r12.m14076r(r2)     // Catch:{ lq3 -> 0x04f5 }
            int r2 = r12.m14071m(r2)     // Catch:{ lq3 -> 0x04f5 }
            r2 = r2 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
            if (r4 == 0) goto L_0x01e6
            boolean r5 = com.google.android.gms.internal.ads.fr3.m9275b(r4)     // Catch:{ lq3 -> 0x04f5 }
            if (r5 == 0) goto L_0x01f1
            com.google.android.gms.internal.ads.er3 r5 = com.google.android.gms.internal.ads.er3.m8691a()     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.er3 r5 = r5.mo7041b()     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.fr3.m9276c(r5, r4)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r2, r5)     // Catch:{ lq3 -> 0x04f5 }
            r4 = r5
            goto L_0x01f1
        L_0x01e6:
            com.google.android.gms.internal.ads.er3 r4 = com.google.android.gms.internal.ads.er3.m8691a()     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.er3 r4 = r4.mo7041b()     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r2, r4)     // Catch:{ lq3 -> 0x04f5 }
        L_0x01f1:
            com.google.android.gms.internal.ads.er3 r4 = (com.google.android.gms.internal.ads.er3) r4     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.dr3 r1 = (com.google.android.gms.internal.ads.dr3) r1     // Catch:{ lq3 -> 0x04f5 }
            throw r9     // Catch:{ lq3 -> 0x04f5 }
        L_0x01f6:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.es3 r1 = r12.m14074p(r2)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.yq3 r2 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r2 = r2.mo11290a(r13, r3)     // Catch:{ lq3 -> 0x04f5 }
            r14.mo6526C(r2, r1, r15)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x0208:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
        L_0x0211:
            r14.mo6552p(r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x0216:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
        L_0x021f:
            r14.mo6562z(r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x0224:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
        L_0x022d:
            r14.mo6529F(r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x0232:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
        L_0x023b:
            r14.mo6531H(r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x0240:
            com.google.android.gms.internal.ads.yq3 r4 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r3 = r4.mo11290a(r13, r5)     // Catch:{ lq3 -> 0x04f5 }
            r14.mo6554r(r3)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.eq3 r2 = r12.m14073o(r2)     // Catch:{ lq3 -> 0x04f5 }
        L_0x024f:
            java.lang.Object r10 = com.google.android.gms.internal.ads.gs3.m9942c(r1, r3, r2, r10, r7)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x0255:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
        L_0x025e:
            r14.mo6528E(r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x0263:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
        L_0x026c:
            r14.mo6530G(r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x0271:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
        L_0x027a:
            r14.mo6533J(r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x027f:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
        L_0x0288:
            r14.mo6558v(r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x028d:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
        L_0x0296:
            r14.mo6525B(r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x029b:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
        L_0x02a4:
            r14.mo6559w(r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x02a9:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
        L_0x02b2:
            r14.mo6556t(r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x02b7:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
        L_0x02c0:
            r14.mo6534K(r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x02c5:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
        L_0x02ce:
            r14.mo6560x(r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x02d3:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x0211
        L_0x02de:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x021f
        L_0x02e9:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x022d
        L_0x02f4:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x023b
        L_0x02ff:
            com.google.android.gms.internal.ads.yq3 r4 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r3 = r4.mo11290a(r13, r5)     // Catch:{ lq3 -> 0x04f5 }
            r14.mo6554r(r3)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.eq3 r2 = r12.m14073o(r2)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x024f
        L_0x0310:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x025e
        L_0x031b:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
            r14.mo6524A(r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x0329:
            com.google.android.gms.internal.ads.es3 r1 = r12.m14074p(r2)     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.yq3 r4 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r2 = r4.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
            r14.mo6555s(r2, r1, r15)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x033b:
            boolean r1 = m14084z(r3)     // Catch:{ lq3 -> 0x04f5 }
            if (r1 == 0) goto L_0x0353
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
            r2 = r14
            com.google.android.gms.internal.ads.dp3 r2 = (com.google.android.gms.internal.ads.dp3) r2     // Catch:{ lq3 -> 0x04f5 }
            r3 = 1
            r2.mo6535L(r1, r3)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x0353:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
            r2 = r14
            com.google.android.gms.internal.ads.dp3 r2 = (com.google.android.gms.internal.ads.dp3) r2     // Catch:{ lq3 -> 0x04f5 }
            r3 = 0
            r2.mo6535L(r1, r3)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x0365:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x026c
        L_0x0370:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x027a
        L_0x037b:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x0288
        L_0x0386:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x0296
        L_0x0391:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x02a4
        L_0x039c:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x02b2
        L_0x03a7:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x02c0
        L_0x03b2:
            com.google.android.gms.internal.ads.yq3 r1 = r12.f11643l     // Catch:{ lq3 -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ lq3 -> 0x04f5 }
            java.util.List r1 = r1.mo11290a(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x02ce
        L_0x03bd:
            boolean r1 = r12.m14046A(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
            if (r1 == 0) goto L_0x03db
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.gt3.m9991p(r13, r3)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.es3 r2 = r12.m14074p(r2)     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Object r2 = r14.mo6532I(r2, r15)     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.kq3.m12306g(r1, r2)     // Catch:{ lq3 -> 0x04f5 }
        L_0x03d6:
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r3, r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x03db:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.es3 r1 = r12.m14074p(r2)     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Object r1 = r14.mo6532I(r1, r15)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r3, r1)     // Catch:{ lq3 -> 0x04f5 }
        L_0x03e9:
            r12.m14081w(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x000a
        L_0x03ee:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ lq3 -> 0x04f5 }
            long r5 = r14.mo6549m()     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9970C(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x03e9
        L_0x03f9:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ lq3 -> 0x04f5 }
            int r1 = r14.mo6544h()     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9969B(r13, r3, r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x03e9
        L_0x0404:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ lq3 -> 0x04f5 }
            long r5 = r14.mo6551o()     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9970C(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x03e9
        L_0x040f:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ lq3 -> 0x04f5 }
            int r1 = r14.mo6542f()     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9969B(r13, r3, r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x03e9
        L_0x041a:
            int r4 = r14.mo6538b()     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.eq3 r6 = r12.m14073o(r2)     // Catch:{ lq3 -> 0x04f5 }
            if (r6 == 0) goto L_0x042a
            boolean r6 = r6.mo6282d(r4)     // Catch:{ lq3 -> 0x04f5 }
            if (r6 == 0) goto L_0x00ed
        L_0x042a:
            r1 = r3 & r5
            long r5 = (long) r1     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9969B(r13, r5, r4)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x03e9
        L_0x0431:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ lq3 -> 0x04f5 }
            int r1 = r14.mo6545i()     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9969B(r13, r3, r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x03e9
        L_0x043c:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.uo3 r1 = r14.mo6548l()     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r3, r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x03e9
        L_0x0447:
            boolean r1 = r12.m14046A(r13, r2)     // Catch:{ lq3 -> 0x04f5 }
            if (r1 == 0) goto L_0x0462
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.gt3.m9991p(r13, r3)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.es3 r2 = r12.m14074p(r2)     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Object r2 = r14.mo6527D(r2, r15)     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.kq3.m12306g(r1, r2)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x03d6
        L_0x0462:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.es3 r1 = r12.m14074p(r2)     // Catch:{ lq3 -> 0x04f5 }
            java.lang.Object r1 = r14.mo6527D(r1, r15)     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9971D(r13, r3, r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x03e9
        L_0x0472:
            r12.m14080v(r13, r3, r14)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x03e9
        L_0x0477:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ lq3 -> 0x04f5 }
            boolean r1 = r14.mo6536O()     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9999x(r13, r3, r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x03e9
        L_0x0483:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ lq3 -> 0x04f5 }
            int r1 = r14.mo6540d()     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9969B(r13, r3, r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x03e9
        L_0x048f:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ lq3 -> 0x04f5 }
            long r5 = r14.mo6546j()     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9970C(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x03e9
        L_0x049b:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ lq3 -> 0x04f5 }
            int r1 = r14.mo6541e()     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9969B(r13, r3, r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x03e9
        L_0x04a7:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ lq3 -> 0x04f5 }
            long r5 = r14.mo6550n()     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9970C(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x03e9
        L_0x04b3:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ lq3 -> 0x04f5 }
            long r5 = r14.mo6547k()     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9970C(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x03e9
        L_0x04bf:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ lq3 -> 0x04f5 }
            float r1 = r14.mo6537a()     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m9968A(r13, r3, r1)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x03e9
        L_0x04cb:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ lq3 -> 0x04f5 }
            double r5 = r14.zza()     // Catch:{ lq3 -> 0x04f5 }
            com.google.android.gms.internal.ads.gt3.m10001z(r13, r3, r5)     // Catch:{ lq3 -> 0x04f5 }
            goto L_0x03e9
        L_0x04d7:
            r10 = r1
        L_0x04d8:
            boolean r1 = r7.mo11718p(r10, r14)     // Catch:{ lq3 -> 0x04f5 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.f11641j
        L_0x04e0:
            int r15 = r12.f11642k
            if (r14 >= r15) goto L_0x04ef
            int[] r15 = r12.f11640i
            r15 = r15[r14]
            java.lang.Object r10 = r12.m14075q(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x04e0
        L_0x04ef:
            if (r10 == 0) goto L_0x051b
            r7.mo11716n(r13, r10)
            return
        L_0x04f5:
            r7.mo11719q(r14)     // Catch:{ all -> 0x0079 }
            if (r10 != 0) goto L_0x04ff
            java.lang.Object r1 = r7.mo11705c(r13)     // Catch:{ all -> 0x0079 }
            r10 = r1
        L_0x04ff:
            boolean r1 = r7.mo11718p(r10, r14)     // Catch:{ all -> 0x0079 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.f11641j
        L_0x0507:
            int r15 = r12.f11642k
            if (r14 >= r15) goto L_0x0516
            int[] r15 = r12.f11640i
            r15 = r15[r14]
            java.lang.Object r10 = r12.m14075q(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x0507
        L_0x0516:
            if (r10 == 0) goto L_0x051b
            r7.mo11716n(r13, r10)
        L_0x051b:
            return
        L_0x051c:
            int r15 = r12.f11641j
        L_0x051e:
            int r0 = r12.f11642k
            if (r15 >= r0) goto L_0x052d
            int[] r0 = r12.f11640i
            r0 = r0[r15]
            java.lang.Object r10 = r12.m14075q(r13, r0, r10, r7)
            int r15 = r15 + 1
            goto L_0x051e
        L_0x052d:
            if (r10 == 0) goto L_0x0532
            r7.mo11716n(r13, r10)
        L_0x0532:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nr3.mo7065e(java.lang.Object, com.google.android.gms.internal.ads.wr3, com.google.android.gms.internal.ads.mp3):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        com.google.android.gms.internal.ads.gt3.m9971D(r7, r2, com.google.android.gms.internal.ads.gt3.m9991p(r8, r2));
        m14082x(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
        com.google.android.gms.internal.ads.gt3.m9971D(r7, r2, com.google.android.gms.internal.ads.gt3.m9991p(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b3, code lost:
        com.google.android.gms.internal.ads.gt3.m9969B(r7, r2, com.google.android.gms.internal.ads.gt3.m9987l(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c8, code lost:
        com.google.android.gms.internal.ads.gt3.m9970C(r7, r2, com.google.android.gms.internal.ads.gt3.m9989n(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00eb, code lost:
        m14081w(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ee, code lost:
        r0 = r0 + 3;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7066f(T r7, T r8) {
        /*
            r6 = this;
            java.util.Objects.requireNonNull(r8)
            r0 = 0
        L_0x0004:
            int[] r1 = r6.f11632a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x00f2
            int r1 = r6.m14071m(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.f11632a
            r4 = r4[r0]
            int r1 = m14070l(r1)
            switch(r1) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00d0;
                case 2: goto L_0x00c2;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00ad;
                case 5: goto L_0x00a6;
                case 6: goto L_0x009f;
                case 7: goto L_0x0091;
                case 8: goto L_0x0083;
                case 9: goto L_0x007e;
                case 10: goto L_0x0077;
                case 11: goto L_0x0070;
                case 12: goto L_0x0069;
                case 13: goto L_0x0062;
                case 14: goto L_0x005a;
                case 15: goto L_0x0053;
                case 16: goto L_0x004b;
                case 17: goto L_0x007e;
                case 18: goto L_0x0044;
                case 19: goto L_0x0044;
                case 20: goto L_0x0044;
                case 21: goto L_0x0044;
                case 22: goto L_0x0044;
                case 23: goto L_0x0044;
                case 24: goto L_0x0044;
                case 25: goto L_0x0044;
                case 26: goto L_0x0044;
                case 27: goto L_0x0044;
                case 28: goto L_0x0044;
                case 29: goto L_0x0044;
                case 30: goto L_0x0044;
                case 31: goto L_0x0044;
                case 32: goto L_0x0044;
                case 33: goto L_0x0044;
                case 34: goto L_0x0044;
                case 35: goto L_0x0044;
                case 36: goto L_0x0044;
                case 37: goto L_0x0044;
                case 38: goto L_0x0044;
                case 39: goto L_0x0044;
                case 40: goto L_0x0044;
                case 41: goto L_0x0044;
                case 42: goto L_0x0044;
                case 43: goto L_0x0044;
                case 44: goto L_0x0044;
                case 45: goto L_0x0044;
                case 46: goto L_0x0044;
                case 47: goto L_0x0044;
                case 48: goto L_0x0044;
                case 49: goto L_0x0044;
                case 50: goto L_0x003d;
                case 51: goto L_0x002b;
                case 52: goto L_0x002b;
                case 53: goto L_0x002b;
                case 54: goto L_0x002b;
                case 55: goto L_0x002b;
                case 56: goto L_0x002b;
                case 57: goto L_0x002b;
                case 58: goto L_0x002b;
                case 59: goto L_0x002b;
                case 60: goto L_0x0026;
                case 61: goto L_0x001f;
                case 62: goto L_0x001f;
                case 63: goto L_0x001f;
                case 64: goto L_0x001f;
                case 65: goto L_0x001f;
                case 66: goto L_0x001f;
                case 67: goto L_0x001f;
                case 68: goto L_0x0026;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x00ee
        L_0x001f:
            boolean r1 = r6.m14049D(r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0031
        L_0x0026:
            r6.m14079u(r7, r8, r0)
            goto L_0x00ee
        L_0x002b:
            boolean r1 = r6.m14049D(r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0031:
            java.lang.Object r1 = com.google.android.gms.internal.ads.gt3.m9991p(r8, r2)
            com.google.android.gms.internal.ads.gt3.m9971D(r7, r2, r1)
            r6.m14082x(r7, r4, r0)
            goto L_0x00ee
        L_0x003d:
            com.google.android.gms.internal.ads.fr3 r1 = r6.f11647p
            com.google.android.gms.internal.ads.gs3.m9948i(r1, r7, r8, r2)
            goto L_0x00ee
        L_0x0044:
            com.google.android.gms.internal.ads.yq3 r1 = r6.f11643l
            r1.mo11292c(r7, r8, r2)
            goto L_0x00ee
        L_0x004b:
            boolean r1 = r6.m14046A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0053:
            boolean r1 = r6.m14046A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x005a:
            boolean r1 = r6.m14046A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0062:
            boolean r1 = r6.m14046A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x0069:
            boolean r1 = r6.m14046A(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x006f:
            goto L_0x00b3
        L_0x0070:
            boolean r1 = r6.m14046A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x0077:
            boolean r1 = r6.m14046A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0089
        L_0x007e:
            r6.m14078t(r7, r8, r0)
            goto L_0x00ee
        L_0x0083:
            boolean r1 = r6.m14046A(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0089:
            java.lang.Object r1 = com.google.android.gms.internal.ads.gt3.m9991p(r8, r2)
            com.google.android.gms.internal.ads.gt3.m9971D(r7, r2, r1)
            goto L_0x00eb
        L_0x0091:
            boolean r1 = r6.m14046A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            boolean r1 = com.google.android.gms.internal.ads.gt3.m9975H(r8, r2)
            com.google.android.gms.internal.ads.gt3.m9999x(r7, r2, r1)
            goto L_0x00eb
        L_0x009f:
            boolean r1 = r6.m14046A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x00a6:
            boolean r1 = r6.m14046A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00ad:
            boolean r1 = r6.m14046A(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00b3:
            int r1 = com.google.android.gms.internal.ads.gt3.m9987l(r8, r2)
            com.google.android.gms.internal.ads.gt3.m9969B(r7, r2, r1)
            goto L_0x00eb
        L_0x00bb:
            boolean r1 = r6.m14046A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00c2:
            boolean r1 = r6.m14046A(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00c8:
            long r4 = com.google.android.gms.internal.ads.gt3.m9989n(r8, r2)
            com.google.android.gms.internal.ads.gt3.m9970C(r7, r2, r4)
            goto L_0x00eb
        L_0x00d0:
            boolean r1 = r6.m14046A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            float r1 = com.google.android.gms.internal.ads.gt3.m9986k(r8, r2)
            com.google.android.gms.internal.ads.gt3.m9968A(r7, r2, r1)
            goto L_0x00eb
        L_0x00de:
            boolean r1 = r6.m14046A(r8, r0)
            if (r1 == 0) goto L_0x00ee
            double r4 = com.google.android.gms.internal.ads.gt3.m9985j(r8, r2)
            com.google.android.gms.internal.ads.gt3.m10001z(r7, r2, r4)
        L_0x00eb:
            r6.m14081w(r7, r0)
        L_0x00ee:
            int r0 = r0 + 3
            goto L_0x0004
        L_0x00f2:
            com.google.android.gms.internal.ads.ws3<?, ?> r0 = r6.f11644m
            com.google.android.gms.internal.ads.gs3.m9945f(r0, r7, r8)
            boolean r0 = r6.f11637f
            if (r0 == 0) goto L_0x0100
            com.google.android.gms.internal.ads.np3<?> r0 = r6.f11645n
            com.google.android.gms.internal.ads.gs3.m9944e(r0, r7, r8)
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nr3.mo7066f(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x036d, code lost:
        r11.mo8209a(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x037e, code lost:
        r11.mo8207J(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x038f, code lost:
        r11.mo8205H(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03a0, code lost:
        r11.mo8227t(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03b1, code lost:
        r11.mo8216h(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03bc, code lost:
        r11.mo8222o(r4, (com.google.android.gms.internal.ads.uo3) com.google.android.gms.internal.ads.gt3.m9991p(r10, (long) (r3 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03cf, code lost:
        r11.mo8204G(r4, com.google.android.gms.internal.ads.gt3.m9991p(r10, (long) (r3 & 1048575)), m14074p(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03e4, code lost:
        m14053H(r4, com.google.android.gms.internal.ads.gt3.m9991p(r10, (long) (r3 & 1048575)), r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03fb, code lost:
        r11.mo8220m(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x040c, code lost:
        r11.mo8229v(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x041c, code lost:
        r11.mo8231x(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x042c, code lost:
        r11.mo8200C(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x043c, code lost:
        r11.mo8218j(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x044c, code lost:
        r11.mo8202E(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x045c, code lost:
        r11.mo8233z(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x046c, code lost:
        r11.mo8224q(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0341, code lost:
        r11.mo8199B(r4, com.google.android.gms.internal.ads.gt3.m9991p(r10, (long) (r3 & 1048575)), m14074p(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x035c, code lost:
        r11.mo8211c(r4, r5);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7067g(T r10, com.google.android.gms.internal.ads.ip3 r11) {
        /*
            r9 = this;
            boolean r0 = r9.f11639h
            if (r0 == 0) goto L_0x0484
            boolean r0 = r9.f11637f
            if (r0 != 0) goto L_0x047d
            int[] r0 = r9.f11632a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x000d:
            if (r2 >= r0) goto L_0x0473
            int r3 = r9.m14071m(r2)
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            int r5 = m14070l(r3)
            r6 = 1
            r7 = 1048575(0xfffff, float:1.469367E-39)
            switch(r5) {
                case 0: goto L_0x0460;
                case 1: goto L_0x0450;
                case 2: goto L_0x0440;
                case 3: goto L_0x0430;
                case 4: goto L_0x0420;
                case 5: goto L_0x0410;
                case 6: goto L_0x0400;
                case 7: goto L_0x03ef;
                case 8: goto L_0x03de;
                case 9: goto L_0x03c9;
                case 10: goto L_0x03b6;
                case 11: goto L_0x03a5;
                case 12: goto L_0x0394;
                case 13: goto L_0x0383;
                case 14: goto L_0x0372;
                case 15: goto L_0x0361;
                case 16: goto L_0x0350;
                case 17: goto L_0x033b;
                case 18: goto L_0x032a;
                case 19: goto L_0x0319;
                case 20: goto L_0x0308;
                case 21: goto L_0x02f7;
                case 22: goto L_0x02e6;
                case 23: goto L_0x02d5;
                case 24: goto L_0x02c4;
                case 25: goto L_0x02b3;
                case 26: goto L_0x02a2;
                case 27: goto L_0x028d;
                case 28: goto L_0x027c;
                case 29: goto L_0x026b;
                case 30: goto L_0x025a;
                case 31: goto L_0x0249;
                case 32: goto L_0x0238;
                case 33: goto L_0x0227;
                case 34: goto L_0x0216;
                case 35: goto L_0x0205;
                case 36: goto L_0x01f4;
                case 37: goto L_0x01e3;
                case 38: goto L_0x01d2;
                case 39: goto L_0x01c1;
                case 40: goto L_0x01b0;
                case 41: goto L_0x019f;
                case 42: goto L_0x018e;
                case 43: goto L_0x017d;
                case 44: goto L_0x016c;
                case 45: goto L_0x015b;
                case 46: goto L_0x014a;
                case 47: goto L_0x0139;
                case 48: goto L_0x0128;
                case 49: goto L_0x0113;
                case 50: goto L_0x0108;
                case 51: goto L_0x00fa;
                case 52: goto L_0x00ec;
                case 53: goto L_0x00de;
                case 54: goto L_0x00d0;
                case 55: goto L_0x00c2;
                case 56: goto L_0x00b4;
                case 57: goto L_0x00a6;
                case 58: goto L_0x0098;
                case 59: goto L_0x0090;
                case 60: goto L_0x0088;
                case 61: goto L_0x0080;
                case 62: goto L_0x0072;
                case 63: goto L_0x0064;
                case 64: goto L_0x0056;
                case 65: goto L_0x0048;
                case 66: goto L_0x003a;
                case 67: goto L_0x002c;
                case 68: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x046f
        L_0x0024:
            boolean r5 = r9.m14049D(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            goto L_0x0341
        L_0x002c:
            boolean r5 = r9.m14049D(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = m14072n(r10, r5)
            goto L_0x035c
        L_0x003a:
            boolean r5 = r9.m14049D(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = m14061Q(r10, r5)
            goto L_0x036d
        L_0x0048:
            boolean r5 = r9.m14049D(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = m14072n(r10, r5)
            goto L_0x037e
        L_0x0056:
            boolean r5 = r9.m14049D(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = m14061Q(r10, r5)
            goto L_0x038f
        L_0x0064:
            boolean r5 = r9.m14049D(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = m14061Q(r10, r5)
            goto L_0x03a0
        L_0x0072:
            boolean r5 = r9.m14049D(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = m14061Q(r10, r5)
            goto L_0x03b1
        L_0x0080:
            boolean r5 = r9.m14049D(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            goto L_0x03bc
        L_0x0088:
            boolean r5 = r9.m14049D(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            goto L_0x03cf
        L_0x0090:
            boolean r5 = r9.m14049D(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            goto L_0x03e4
        L_0x0098:
            boolean r5 = r9.m14049D(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            boolean r3 = m14050E(r10, r5)
            goto L_0x03fb
        L_0x00a6:
            boolean r5 = r9.m14049D(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = m14061Q(r10, r5)
            goto L_0x040c
        L_0x00b4:
            boolean r5 = r9.m14049D(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = m14072n(r10, r5)
            goto L_0x041c
        L_0x00c2:
            boolean r5 = r9.m14049D(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = m14061Q(r10, r5)
            goto L_0x042c
        L_0x00d0:
            boolean r5 = r9.m14049D(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = m14072n(r10, r5)
            goto L_0x043c
        L_0x00de:
            boolean r5 = r9.m14049D(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = m14072n(r10, r5)
            goto L_0x044c
        L_0x00ec:
            boolean r5 = r9.m14049D(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            float r3 = m14058N(r10, r5)
            goto L_0x045c
        L_0x00fa:
            boolean r5 = r9.m14049D(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            double r5 = m14057M(r10, r5)
            goto L_0x046c
        L_0x0108:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            r9.m14052G(r11, r4, r3, r2)
            goto L_0x046f
        L_0x0113:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.es3 r5 = r9.m14074p(r2)
            com.google.android.gms.internal.ads.gs3.m9956q(r4, r3, r11, r5)
            goto L_0x046f
        L_0x0128:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9963x(r4, r3, r11, r6)
            goto L_0x046f
        L_0x0139:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9962w(r4, r3, r11, r6)
            goto L_0x046f
        L_0x014a:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9961v(r4, r3, r11, r6)
            goto L_0x046f
        L_0x015b:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9960u(r4, r3, r11, r6)
            goto L_0x046f
        L_0x016c:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9952m(r4, r3, r11, r6)
            goto L_0x046f
        L_0x017d:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9965z(r4, r3, r11, r6)
            goto L_0x046f
        L_0x018e:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9949j(r4, r3, r11, r6)
            goto L_0x046f
        L_0x019f:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9953n(r4, r3, r11, r6)
            goto L_0x046f
        L_0x01b0:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9954o(r4, r3, r11, r6)
            goto L_0x046f
        L_0x01c1:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9957r(r4, r3, r11, r6)
            goto L_0x046f
        L_0x01d2:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9913B(r4, r3, r11, r6)
            goto L_0x046f
        L_0x01e3:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9958s(r4, r3, r11, r6)
            goto L_0x046f
        L_0x01f4:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9955p(r4, r3, r11, r6)
            goto L_0x046f
        L_0x0205:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9951l(r4, r3, r11, r6)
            goto L_0x046f
        L_0x0216:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9963x(r4, r3, r11, r1)
            goto L_0x046f
        L_0x0227:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9962w(r4, r3, r11, r1)
            goto L_0x046f
        L_0x0238:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9961v(r4, r3, r11, r1)
            goto L_0x046f
        L_0x0249:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9960u(r4, r3, r11, r1)
            goto L_0x046f
        L_0x025a:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9952m(r4, r3, r11, r1)
            goto L_0x046f
        L_0x026b:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9965z(r4, r3, r11, r1)
            goto L_0x046f
        L_0x027c:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9950k(r4, r3, r11)
            goto L_0x046f
        L_0x028d:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.es3 r5 = r9.m14074p(r2)
            com.google.android.gms.internal.ads.gs3.m9959t(r4, r3, r11, r5)
            goto L_0x046f
        L_0x02a2:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9964y(r4, r3, r11)
            goto L_0x046f
        L_0x02b3:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9949j(r4, r3, r11, r1)
            goto L_0x046f
        L_0x02c4:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9953n(r4, r3, r11, r1)
            goto L_0x046f
        L_0x02d5:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9954o(r4, r3, r11, r1)
            goto L_0x046f
        L_0x02e6:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9957r(r4, r3, r11, r1)
            goto L_0x046f
        L_0x02f7:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9913B(r4, r3, r11, r1)
            goto L_0x046f
        L_0x0308:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9958s(r4, r3, r11, r1)
            goto L_0x046f
        L_0x0319:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9955p(r4, r3, r11, r1)
            goto L_0x046f
        L_0x032a:
            int[] r4 = r9.f11632a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.gs3.m9951l(r4, r3, r11, r1)
            goto L_0x046f
        L_0x033b:
            boolean r5 = r9.m14046A(r10, r2)
            if (r5 == 0) goto L_0x046f
        L_0x0341:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            com.google.android.gms.internal.ads.es3 r5 = r9.m14074p(r2)
            r11.mo8199B(r4, r3, r5)
            goto L_0x046f
        L_0x0350:
            boolean r5 = r9.m14046A(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = com.google.android.gms.internal.ads.gt3.m9989n(r10, r5)
        L_0x035c:
            r11.mo8211c(r4, r5)
            goto L_0x046f
        L_0x0361:
            boolean r5 = r9.m14046A(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.ads.gt3.m9987l(r10, r5)
        L_0x036d:
            r11.mo8209a(r4, r3)
            goto L_0x046f
        L_0x0372:
            boolean r5 = r9.m14046A(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = com.google.android.gms.internal.ads.gt3.m9989n(r10, r5)
        L_0x037e:
            r11.mo8207J(r4, r5)
            goto L_0x046f
        L_0x0383:
            boolean r5 = r9.m14046A(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.ads.gt3.m9987l(r10, r5)
        L_0x038f:
            r11.mo8205H(r4, r3)
            goto L_0x046f
        L_0x0394:
            boolean r5 = r9.m14046A(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.ads.gt3.m9987l(r10, r5)
        L_0x03a0:
            r11.mo8227t(r4, r3)
            goto L_0x046f
        L_0x03a5:
            boolean r5 = r9.m14046A(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.ads.gt3.m9987l(r10, r5)
        L_0x03b1:
            r11.mo8216h(r4, r3)
            goto L_0x046f
        L_0x03b6:
            boolean r5 = r9.m14046A(r10, r2)
            if (r5 == 0) goto L_0x046f
        L_0x03bc:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            com.google.android.gms.internal.ads.uo3 r3 = (com.google.android.gms.internal.ads.uo3) r3
            r11.mo8222o(r4, r3)
            goto L_0x046f
        L_0x03c9:
            boolean r5 = r9.m14046A(r10, r2)
            if (r5 == 0) goto L_0x046f
        L_0x03cf:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            com.google.android.gms.internal.ads.es3 r5 = r9.m14074p(r2)
            r11.mo8204G(r4, r3, r5)
            goto L_0x046f
        L_0x03de:
            boolean r5 = r9.m14046A(r10, r2)
            if (r5 == 0) goto L_0x046f
        L_0x03e4:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            m14053H(r4, r3, r11)
            goto L_0x046f
        L_0x03ef:
            boolean r5 = r9.m14046A(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            boolean r3 = com.google.android.gms.internal.ads.gt3.m9975H(r10, r5)
        L_0x03fb:
            r11.mo8220m(r4, r3)
            goto L_0x046f
        L_0x0400:
            boolean r5 = r9.m14046A(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.ads.gt3.m9987l(r10, r5)
        L_0x040c:
            r11.mo8229v(r4, r3)
            goto L_0x046f
        L_0x0410:
            boolean r5 = r9.m14046A(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = com.google.android.gms.internal.ads.gt3.m9989n(r10, r5)
        L_0x041c:
            r11.mo8231x(r4, r5)
            goto L_0x046f
        L_0x0420:
            boolean r5 = r9.m14046A(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.ads.gt3.m9987l(r10, r5)
        L_0x042c:
            r11.mo8200C(r4, r3)
            goto L_0x046f
        L_0x0430:
            boolean r5 = r9.m14046A(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = com.google.android.gms.internal.ads.gt3.m9989n(r10, r5)
        L_0x043c:
            r11.mo8218j(r4, r5)
            goto L_0x046f
        L_0x0440:
            boolean r5 = r9.m14046A(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = com.google.android.gms.internal.ads.gt3.m9989n(r10, r5)
        L_0x044c:
            r11.mo8202E(r4, r5)
            goto L_0x046f
        L_0x0450:
            boolean r5 = r9.m14046A(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            float r3 = com.google.android.gms.internal.ads.gt3.m9986k(r10, r5)
        L_0x045c:
            r11.mo8233z(r4, r3)
            goto L_0x046f
        L_0x0460:
            boolean r5 = r9.m14046A(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            double r5 = com.google.android.gms.internal.ads.gt3.m9985j(r10, r5)
        L_0x046c:
            r11.mo8224q(r4, r5)
        L_0x046f:
            int r2 = r2 + 3
            goto L_0x000d
        L_0x0473:
            com.google.android.gms.internal.ads.ws3<?, ?> r0 = r9.f11644m
            java.lang.Object r10 = r0.mo11706d(r10)
            r0.mo11720r(r10, r11)
            return
        L_0x047d:
            com.google.android.gms.internal.ads.np3<?> r11 = r9.f11645n
            r11.mo9574a(r10)
            r10 = 0
            throw r10
        L_0x0484:
            r9.m14051F(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nr3.mo7067g(java.lang.Object, com.google.android.gms.internal.ads.ip3):void");
    }

    /* renamed from: h */
    public final void mo7068h(T t, byte[] bArr, int i, int i2, eo3 eo3) {
        if (this.f11639h) {
            m14064T(t, bArr, i, i2, eo3);
        } else {
            mo9590I(t, bArr, i, i2, 0, eo3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b6, code lost:
        r2 = r2 + 3;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7069i(T r9, T r10) {
        /*
            r8 = this;
            int[] r0 = r8.f11632a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r2 >= r0) goto L_0x01ba
            int r3 = r8.m14071m(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r3 & r4
            long r5 = (long) r5
            int r3 = m14070l(r3)
            switch(r3) {
                case 0: goto L_0x019a;
                case 1: goto L_0x0181;
                case 2: goto L_0x016e;
                case 3: goto L_0x015b;
                case 4: goto L_0x014a;
                case 5: goto L_0x0136;
                case 6: goto L_0x0124;
                case 7: goto L_0x0112;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009a;
                case 14: goto L_0x0086;
                case 15: goto L_0x0074;
                case 16: goto L_0x0060;
                case 17: goto L_0x004a;
                case 18: goto L_0x003a;
                case 19: goto L_0x003a;
                case 20: goto L_0x003a;
                case 21: goto L_0x003a;
                case 22: goto L_0x003a;
                case 23: goto L_0x003a;
                case 24: goto L_0x003a;
                case 25: goto L_0x003a;
                case 26: goto L_0x003a;
                case 27: goto L_0x003a;
                case 28: goto L_0x003a;
                case 29: goto L_0x003a;
                case 30: goto L_0x003a;
                case 31: goto L_0x003a;
                case 32: goto L_0x003a;
                case 33: goto L_0x003a;
                case 34: goto L_0x003a;
                case 35: goto L_0x003a;
                case 36: goto L_0x003a;
                case 37: goto L_0x003a;
                case 38: goto L_0x003a;
                case 39: goto L_0x003a;
                case 40: goto L_0x003a;
                case 41: goto L_0x003a;
                case 42: goto L_0x003a;
                case 43: goto L_0x003a;
                case 44: goto L_0x003a;
                case 45: goto L_0x003a;
                case 46: goto L_0x003a;
                case 47: goto L_0x003a;
                case 48: goto L_0x003a;
                case 49: goto L_0x003a;
                case 50: goto L_0x003a;
                case 51: goto L_0x001a;
                case 52: goto L_0x001a;
                case 53: goto L_0x001a;
                case 54: goto L_0x001a;
                case 55: goto L_0x001a;
                case 56: goto L_0x001a;
                case 57: goto L_0x001a;
                case 58: goto L_0x001a;
                case 59: goto L_0x001a;
                case 60: goto L_0x001a;
                case 61: goto L_0x001a;
                case 62: goto L_0x001a;
                case 63: goto L_0x001a;
                case 64: goto L_0x001a;
                case 65: goto L_0x001a;
                case 66: goto L_0x001a;
                case 67: goto L_0x001a;
                case 68: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x01b6
        L_0x001a:
            int r3 = r8.m14068X(r2)
            r3 = r3 & r4
            long r3 = (long) r3
            int r7 = com.google.android.gms.internal.ads.gt3.m9987l(r9, r3)
            int r3 = com.google.android.gms.internal.ads.gt3.m9987l(r10, r3)
            if (r7 != r3) goto L_0x01b5
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            boolean r3 = com.google.android.gms.internal.ads.gs3.m9947h(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x003a:
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            boolean r3 = com.google.android.gms.internal.ads.gs3.m9947h(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x004a:
            boolean r3 = r8.m14083y(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            boolean r3 = com.google.android.gms.internal.ads.gs3.m9947h(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0060:
            boolean r3 = r8.m14083y(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.google.android.gms.internal.ads.gt3.m9989n(r9, r5)
            long r5 = com.google.android.gms.internal.ads.gt3.m9989n(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0074:
            boolean r3 = r8.m14083y(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.ads.gt3.m9987l(r9, r5)
            int r4 = com.google.android.gms.internal.ads.gt3.m9987l(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0086:
            boolean r3 = r8.m14083y(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.google.android.gms.internal.ads.gt3.m9989n(r9, r5)
            long r5 = com.google.android.gms.internal.ads.gt3.m9989n(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x009a:
            boolean r3 = r8.m14083y(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.ads.gt3.m9987l(r9, r5)
            int r4 = com.google.android.gms.internal.ads.gt3.m9987l(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00ac:
            boolean r3 = r8.m14083y(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.ads.gt3.m9987l(r9, r5)
            int r4 = com.google.android.gms.internal.ads.gt3.m9987l(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00be:
            boolean r3 = r8.m14083y(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.ads.gt3.m9987l(r9, r5)
            int r4 = com.google.android.gms.internal.ads.gt3.m9987l(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00d0:
            boolean r3 = r8.m14083y(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            boolean r3 = com.google.android.gms.internal.ads.gs3.m9947h(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00e6:
            boolean r3 = r8.m14083y(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            boolean r3 = com.google.android.gms.internal.ads.gs3.m9947h(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00fc:
            boolean r3 = r8.m14083y(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.google.android.gms.internal.ads.gt3.m9991p(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.ads.gt3.m9991p(r10, r5)
            boolean r3 = com.google.android.gms.internal.ads.gs3.m9947h(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0112:
            boolean r3 = r8.m14083y(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            boolean r3 = com.google.android.gms.internal.ads.gt3.m9975H(r9, r5)
            boolean r4 = com.google.android.gms.internal.ads.gt3.m9975H(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0124:
            boolean r3 = r8.m14083y(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.ads.gt3.m9987l(r9, r5)
            int r4 = com.google.android.gms.internal.ads.gt3.m9987l(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0136:
            boolean r3 = r8.m14083y(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.google.android.gms.internal.ads.gt3.m9989n(r9, r5)
            long r5 = com.google.android.gms.internal.ads.gt3.m9989n(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x014a:
            boolean r3 = r8.m14083y(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.ads.gt3.m9987l(r9, r5)
            int r4 = com.google.android.gms.internal.ads.gt3.m9987l(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x015b:
            boolean r3 = r8.m14083y(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.google.android.gms.internal.ads.gt3.m9989n(r9, r5)
            long r5 = com.google.android.gms.internal.ads.gt3.m9989n(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x016e:
            boolean r3 = r8.m14083y(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.google.android.gms.internal.ads.gt3.m9989n(r9, r5)
            long r5 = com.google.android.gms.internal.ads.gt3.m9989n(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0181:
            boolean r3 = r8.m14083y(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            float r3 = com.google.android.gms.internal.ads.gt3.m9986k(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            float r4 = com.google.android.gms.internal.ads.gt3.m9986k(r10, r5)
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x019a:
            boolean r3 = r8.m14083y(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            double r3 = com.google.android.gms.internal.ads.gt3.m9985j(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = com.google.android.gms.internal.ads.gt3.m9985j(r10, r5)
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x01b5:
            return r1
        L_0x01b6:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01ba:
            com.google.android.gms.internal.ads.ws3<?, ?> r0 = r8.f11644m
            java.lang.Object r0 = r0.mo11706d(r9)
            com.google.android.gms.internal.ads.ws3<?, ?> r2 = r8.f11644m
            java.lang.Object r2 = r2.mo11706d(r10)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01cd
            return r1
        L_0x01cd:
            boolean r0 = r8.f11637f
            if (r0 != 0) goto L_0x01d3
            r9 = 1
            return r9
        L_0x01d3:
            com.google.android.gms.internal.ads.np3<?> r0 = r8.f11645n
            r0.mo9574a(r9)
            com.google.android.gms.internal.ads.np3<?> r9 = r8.f11645n
            r9.mo9574a(r10)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nr3.mo7069i(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: j */
    public final boolean mo7070j(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f11641j) {
            int i6 = this.f11640i[i5];
            int i7 = this.f11632a[i6];
            int m = m14071m(i6);
            int i8 = this.f11632a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f11631r.getInt(t2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & m) != 0 && !m14047B(t, i6, i2, i, i10)) {
                return false;
            }
            int l = m14070l(m);
            if (l != 9 && l != 17) {
                if (l != 27) {
                    if (l == 60 || l == 68) {
                        if (m14049D(t2, i7, i6) && !m14048C(t2, m, m14074p(i6))) {
                            return false;
                        }
                    } else if (l != 49) {
                        if (l == 50 && !((er3) gt3.m9991p(t2, (long) (m & 1048575))).isEmpty()) {
                            dr3 dr3 = (dr3) m14076r(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) gt3.m9991p(t2, (long) (m & 1048575));
                if (!list.isEmpty()) {
                    es3 p = m14074p(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!p.mo7070j(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (m14047B(t, i6, i2, i, i10) && !m14048C(t2, m, m14074p(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.f11637f) {
            return true;
        }
        this.f11645n.mo9574a(t2);
        throw null;
    }
}
