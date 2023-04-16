package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

final class qw3 extends lx3 {

    /* renamed from: A */
    private int f13341A;

    /* renamed from: B */
    private long f13342B;

    /* renamed from: C */
    private final hw3 f13343C;

    /* renamed from: D */
    private l74 f13344D;

    /* renamed from: b */
    final r84 f13345b;

    /* renamed from: c */
    final z60 f13346c;

    /* renamed from: d */
    private final xx3[] f13347d;

    /* renamed from: e */
    private final q84 f13348e;

    /* renamed from: f */
    private final h52 f13349f;

    /* renamed from: g */
    private final ax3 f13350g;

    /* renamed from: h */
    private final nb2<a80> f13351h;

    /* renamed from: i */
    private final CopyOnWriteArraySet<mm3> f13352i;

    /* renamed from: j */
    private final pf0 f13353j;

    /* renamed from: k */
    private final List<pw3> f13354k;

    /* renamed from: l */
    private final boolean f13355l = true;

    /* renamed from: m */
    private final e64 f13356m;

    /* renamed from: n */
    private final q04 f13357n;

    /* renamed from: o */
    private final Looper f13358o;

    /* renamed from: p */
    private final a94 f13359p;

    /* renamed from: q */
    private final xv1 f13360q;

    /* renamed from: r */
    private int f13361r;

    /* renamed from: s */
    private int f13362s;

    /* renamed from: t */
    private boolean f13363t;

    /* renamed from: u */
    private int f13364u;

    /* renamed from: v */
    private ay3 f13365v;

    /* renamed from: w */
    private z60 f13366w;

    /* renamed from: x */
    private C1716fu f13367x;

    /* renamed from: y */
    private C1716fu f13368y;

    /* renamed from: z */
    private rx3 f13369z;

    @SuppressLint({"HandlerLeak"})
    public qw3(xx3[] xx3Arr, q84 q84, e64 e64, dx3 dx3, a94 a94, q04 q04, boolean z, ay3 ay3, long j, long j2, gg3 gg3, long j3, boolean z2, xv1 xv1, Looper looper, ub0 ub0, z60 z60, byte[] bArr) {
        xx3[] xx3Arr2 = xx3Arr;
        a94 a942 = a94;
        q04 q042 = q04;
        xv1 xv12 = xv1;
        Looper looper2 = looper;
        ub0 ub02 = ub0;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = n13.f11240e;
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        sb.append("Init ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.15.1] [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        int length = xx3Arr2.length;
        this.f13347d = xx3Arr2;
        Objects.requireNonNull(q84);
        this.f13348e = q84;
        this.f13356m = e64;
        this.f13359p = a942;
        this.f13357n = q042;
        ay3 ay32 = ay3;
        this.f13365v = ay32;
        this.f13358o = looper2;
        this.f13360q = xv12;
        nb2<a80> nb2 = new nb2<>(looper2, xv12, new gw3(ub02));
        this.f13351h = nb2;
        this.f13352i = new CopyOnWriteArraySet<>();
        this.f13354k = new ArrayList();
        this.f13344D = new l74(0);
        r84 r84 = r16;
        r84 r842 = new r84(new zx3[2], new w74[2], pw0.f12823b, (Object) null, (byte[]) null);
        this.f13345b = r842;
        this.f13353j = new pf0();
        b50 b50 = new b50();
        b50.mo5712c(1, 2, 12, 13, 14, 15, 16, 17, 18, 19, 29);
        b50.mo5713d(28, true);
        b50.mo5711b(z60);
        z60 e = b50.mo5714e();
        this.f13346c = e;
        b50 b502 = new b50();
        b502.mo5711b(e);
        b502.mo5710a(3);
        b502.mo5710a(9);
        this.f13366w = b502.mo5714e();
        C1716fu fuVar = C1716fu.f6932t;
        this.f13367x = fuVar;
        this.f13368y = fuVar;
        this.f13341A = -1;
        this.f13349f = xv12.mo7393a(looper2, (Handler.Callback) null);
        hw3 hw3 = r5;
        hw3 hw32 = new hw3(this);
        this.f13343C = hw32;
        this.f13369z = rx3.m16527h(r842);
        q042.mo10220Q(ub02, looper2);
        nb2.mo9487b(q042);
        a942.mo5192b(new Handler(looper2), q042);
        ax3 ax3 = r1;
        ax3 ax32 = new ax3(xx3Arr, q84, r84, dx3, a94, 0, false, q04, ay32, gg3, 500, false, looper, xv1, hw3, (byte[]) null);
        this.f13350g = ax3;
    }

    /* renamed from: A */
    private final long m15905A(rx3 rx3) {
        if (rx3.f14145a.mo6970o()) {
            return nz3.m14195c(this.f13342B);
        }
        if (rx3.f14146b.mo7714b()) {
            return rx3.f14163s;
        }
        ei0 ei0 = rx3.f14145a;
        s54 s54 = rx3.f14146b;
        long j = rx3.f14163s;
        m15907C(ei0, s54, j);
        return j;
    }

    /* renamed from: B */
    private static long m15906B(rx3 rx3) {
        hh0 hh0 = new hh0();
        pf0 pf0 = new pf0();
        rx3.f14145a.mo6969n(rx3.f14146b.f7614a, pf0);
        long j = rx3.f14147c;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = rx3.f14145a.mo6958e(pf0.f12646c, hh0, 0).f8235k;
        return 0;
    }

    /* renamed from: C */
    private final long m15907C(ei0 ei0, s54 s54, long j) {
        ei0.mo6969n(s54.f7614a, this.f13353j);
        return j;
    }

    /* renamed from: D */
    private final Pair<Object, Long> m15908D(ei0 ei0, int i, long j) {
        if (ei0.mo6970o()) {
            this.f13341A = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f13342B = j;
            return null;
        }
        if (i == -1 || i >= ei0.mo6956c()) {
            i = ei0.mo6961g(false);
            long j2 = ei0.mo6958e(i, this.f10202a, 0).f8235k;
            j = nz3.m14196d(0);
        }
        return ei0.mo6967l(this.f10202a, this.f13353j, i, nz3.m14195c(j));
    }

    /* renamed from: E */
    private final rx3 m15909E(rx3 rx3, ei0 ei0, Pair<Object, Long> pair) {
        int i;
        rx3 rx32;
        long j;
        ei0 ei02 = ei0;
        Pair<Object, Long> pair2 = pair;
        wu1.m19205d(ei0.mo6970o() || pair2 != null);
        ei0 ei03 = rx3.f14145a;
        rx3 g = rx3.mo10688g(ei0);
        if (ei0.mo6970o()) {
            s54 i2 = rx3.m16528i();
            long c = nz3.m14195c(this.f13342B);
            rx3 a = g.mo10683b(i2, c, c, c, 0, hm0.f8336d, this.f13345b, e73.m8347v()).mo10682a(i2);
            a.f14161q = a.f14163s;
            return a;
        }
        Object obj = g.f14146b.f7614a;
        int i3 = n13.f11236a;
        boolean z = !obj.equals(pair2.first);
        s54 s54 = z ? new s54(pair2.first) : g.f14146b;
        long longValue = ((Long) pair2.second).longValue();
        long c2 = nz3.m14195c(mo7759i());
        if (!ei03.mo6970o()) {
            ei03.mo6969n(obj, this.f13353j);
        }
        if (z || longValue < c2) {
            s54 s542 = s54;
            wu1.m19207f(!s542.mo7714b());
            s54 s543 = s542;
            rx3 a2 = g.mo10683b(s543, longValue, longValue, longValue, 0, z ? hm0.f8336d : g.f14152h, z ? this.f13345b : g.f14153i, z ? e73.m8347v() : g.f14154j).mo10682a(s543);
            a2.f14161q = longValue;
            return a2;
        }
        if (i == 0) {
            int a3 = ei02.mo6954a(g.f14155k.f7614a);
            if (a3 != -1 && ei02.mo6957d(a3, this.f13353j, false).f12646c == ei02.mo6969n(s54.f7614a, this.f13353j).f12646c) {
                return g;
            }
            ei02.mo6969n(s54.f7614a, this.f13353j);
            j = s54.mo7714b() ? this.f13353j.mo10048f(s54.f7615b, s54.f7616c) : this.f13353j.f12647d;
            rx32 = g.mo10683b(s54, g.f14163s, g.f14163s, g.f14148d, j - g.f14163s, g.f14152h, g.f14153i, g.f14154j).mo10682a(s54);
        } else {
            s54 s544 = s54;
            wu1.m19207f(!s544.mo7714b());
            long max = Math.max(0, g.f14162r - (longValue - c2));
            long j2 = g.f14161q;
            if (g.f14155k.equals(g.f14146b)) {
                j2 = longValue + max;
            }
            rx32 = g.mo10683b(s544, longValue, longValue, longValue, max, g.f14152h, g.f14153i, g.f14154j);
        }
        rx32.f14161q = j;
        return rx32;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0424, code lost:
        if (r4.mo6958e(mo7756e(), r0.f10202a, 0).f8231g != false) goto L_0x0426;
     */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x045f  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x046f  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:196:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0265  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m15910F(com.google.android.gms.internal.ads.rx3 r41, int r42, int r43, boolean r44, boolean r45, int r46, long r47, int r49) {
        /*
            r40 = this;
            r0 = r40
            r1 = r41
            r2 = r46
            com.google.android.gms.internal.ads.rx3 r3 = r0.f13369z
            r0.f13369z = r1
            com.google.android.gms.internal.ads.ei0 r4 = r3.f14145a
            com.google.android.gms.internal.ads.ei0 r5 = r1.f14145a
            boolean r4 = r4.equals(r5)
            r5 = 1
            r4 = r4 ^ r5
            com.google.android.gms.internal.ads.ei0 r6 = r3.f14145a
            com.google.android.gms.internal.ads.ei0 r7 = r1.f14145a
            boolean r8 = r7.mo6970o()
            r10 = 3
            r11 = 0
            r13 = -1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r15 = 0
            if (r8 == 0) goto L_0x0036
            boolean r8 = r6.mo6970o()
            if (r8 == 0) goto L_0x0036
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r14)
            goto L_0x00c0
        L_0x0036:
            boolean r8 = r7.mo6970o()
            boolean r9 = r6.mo6970o()
            if (r8 == r9) goto L_0x004d
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r4.<init>(r6, r7)
            goto L_0x00c0
        L_0x004d:
            com.google.android.gms.internal.ads.s54 r8 = r3.f14146b
            java.lang.Object r8 = r8.f7614a
            com.google.android.gms.internal.ads.pf0 r9 = r0.f13353j
            com.google.android.gms.internal.ads.pf0 r8 = r6.mo6969n(r8, r9)
            int r8 = r8.f12646c
            com.google.android.gms.internal.ads.hh0 r9 = r0.f10202a
            com.google.android.gms.internal.ads.hh0 r6 = r6.mo6958e(r8, r9, r11)
            java.lang.Object r6 = r6.f8225a
            com.google.android.gms.internal.ads.s54 r8 = r1.f14146b
            java.lang.Object r8 = r8.f7614a
            com.google.android.gms.internal.ads.pf0 r9 = r0.f13353j
            com.google.android.gms.internal.ads.pf0 r8 = r7.mo6969n(r8, r9)
            int r8 = r8.f12646c
            com.google.android.gms.internal.ads.hh0 r9 = r0.f10202a
            com.google.android.gms.internal.ads.hh0 r7 = r7.mo6958e(r8, r9, r11)
            java.lang.Object r7 = r7.f8225a
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x009d
            if (r45 == 0) goto L_0x0081
            if (r2 != 0) goto L_0x0081
            r4 = r5
            goto L_0x008a
        L_0x0081:
            if (r45 == 0) goto L_0x0087
            if (r2 != r5) goto L_0x0087
            r4 = 2
            goto L_0x008a
        L_0x0087:
            if (r4 == 0) goto L_0x0097
            r4 = r10
        L_0x008a:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.<init>(r7, r4)
            r4 = r6
            goto L_0x00c0
        L_0x0097:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x009d:
            if (r45 == 0) goto L_0x00b9
            if (r2 != 0) goto L_0x00b9
            com.google.android.gms.internal.ads.s54 r4 = r3.f14146b
            long r6 = r4.f7617d
            com.google.android.gms.internal.ads.s54 r4 = r1.f14146b
            long r8 = r4.f7617d
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b9
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            r4.<init>(r6, r7)
            goto L_0x00c0
        L_0x00b9:
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r14)
        L_0x00c0:
            java.lang.Object r6 = r4.first
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.android.gms.internal.ads.fu r7 = r0.f13367x
            if (r6 == 0) goto L_0x0103
            com.google.android.gms.internal.ads.ei0 r7 = r1.f14145a
            boolean r7 = r7.mo6970o()
            if (r7 != 0) goto L_0x00f5
            com.google.android.gms.internal.ads.ei0 r7 = r1.f14145a
            com.google.android.gms.internal.ads.s54 r9 = r1.f14146b
            java.lang.Object r9 = r9.f7614a
            com.google.android.gms.internal.ads.pf0 r14 = r0.f13353j
            com.google.android.gms.internal.ads.pf0 r7 = r7.mo6969n(r9, r14)
            int r7 = r7.f12646c
            com.google.android.gms.internal.ads.ei0 r9 = r1.f14145a
            com.google.android.gms.internal.ads.hh0 r14 = r0.f10202a
            com.google.android.gms.internal.ads.hh0 r7 = r9.mo6958e(r7, r14, r11)
            com.google.android.gms.internal.ads.zo r7 = r7.f8226b
            goto L_0x00f6
        L_0x00f5:
            r7 = 0
        L_0x00f6:
            if (r7 == 0) goto L_0x00fb
            com.google.android.gms.internal.ads.fu r9 = r7.f18307e
            goto L_0x00fd
        L_0x00fb:
            com.google.android.gms.internal.ads.fu r9 = com.google.android.gms.internal.ads.C1716fu.f6932t
        L_0x00fd:
            r39 = r9
            r9 = r7
            r7 = r39
            goto L_0x0104
        L_0x0103:
            r9 = 0
        L_0x0104:
            if (r6 != 0) goto L_0x0110
            java.util.List<com.google.android.gms.internal.ads.c91> r14 = r3.f14154j
            java.util.List<com.google.android.gms.internal.ads.c91> r10 = r1.f14154j
            boolean r10 = r14.equals(r10)
            if (r10 != 0) goto L_0x013e
        L_0x0110:
            com.google.android.gms.internal.ads.ds r7 = r7.mo7403a()
            java.util.List<com.google.android.gms.internal.ads.c91> r10 = r1.f14154j
            r14 = r15
        L_0x0117:
            int r8 = r10.size()
            if (r14 >= r8) goto L_0x013a
            java.lang.Object r8 = r10.get(r14)
            com.google.android.gms.internal.ads.c91 r8 = (com.google.android.gms.internal.ads.c91) r8
            r13 = r15
        L_0x0124:
            int r11 = r8.mo6086b()
            if (r13 >= r11) goto L_0x0134
            com.google.android.gms.internal.ads.b81 r11 = r8.mo6087c(r13)
            r11.mo5272a(r7)
            int r13 = r13 + 1
            goto L_0x0124
        L_0x0134:
            int r14 = r14 + 1
            r11 = 0
            r13 = -1
            goto L_0x0117
        L_0x013a:
            com.google.android.gms.internal.ads.fu r7 = r7.mo6602B()
        L_0x013e:
            com.google.android.gms.internal.ads.fu r8 = r0.f13367x
            boolean r8 = r7.equals(r8)
            r8 = r8 ^ r5
            r0.f13367x = r7
            com.google.android.gms.internal.ads.ei0 r7 = r3.f14145a
            com.google.android.gms.internal.ads.ei0 r10 = r1.f14145a
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x015d
            com.google.android.gms.internal.ads.nb2<com.google.android.gms.internal.ads.a80> r7 = r0.f13351h
            com.google.android.gms.internal.ads.bw3 r10 = new com.google.android.gms.internal.ads.bw3
            r11 = r42
            r10.<init>(r1, r11)
            r7.mo9489d(r15, r10)
        L_0x015d:
            r7 = 11
            if (r45 == 0) goto L_0x0285
            com.google.android.gms.internal.ads.pf0 r10 = new com.google.android.gms.internal.ads.pf0
            r10.<init>()
            com.google.android.gms.internal.ads.ei0 r11 = r3.f14145a
            boolean r11 = r11.mo6970o()
            if (r11 != 0) goto L_0x019c
            com.google.android.gms.internal.ads.s54 r11 = r3.f14146b
            java.lang.Object r11 = r11.f7614a
            com.google.android.gms.internal.ads.ei0 r12 = r3.f14145a
            r12.mo6969n(r11, r10)
            int r12 = r10.f12646c
            com.google.android.gms.internal.ads.ei0 r13 = r3.f14145a
            int r13 = r13.mo6954a(r11)
            com.google.android.gms.internal.ads.ei0 r14 = r3.f14145a
            com.google.android.gms.internal.ads.hh0 r15 = r0.f10202a
            r16 = r6
            r5 = 0
            com.google.android.gms.internal.ads.hh0 r14 = r14.mo6958e(r12, r15, r5)
            java.lang.Object r5 = r14.f8225a
            com.google.android.gms.internal.ads.hh0 r6 = r0.f10202a
            com.google.android.gms.internal.ads.zo r6 = r6.f8226b
            r18 = r5
            r20 = r6
            r21 = r11
            r19 = r12
            r22 = r13
            goto L_0x01a8
        L_0x019c:
            r16 = r6
            r19 = r49
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = -1
        L_0x01a8:
            if (r2 != 0) goto L_0x01d7
            long r5 = r10.f12647d
            com.google.android.gms.internal.ads.s54 r11 = r3.f14146b
            boolean r11 = r11.mo7714b()
            if (r11 == 0) goto L_0x01bf
            com.google.android.gms.internal.ads.s54 r5 = r3.f14146b
            int r6 = r5.f7615b
            int r5 = r5.f7616c
            long r5 = r10.mo10048f(r6, r5)
            goto L_0x01e1
        L_0x01bf:
            com.google.android.gms.internal.ads.s54 r10 = r3.f14146b
            int r10 = r10.f7618e
            r11 = -1
            if (r10 == r11) goto L_0x01e8
            com.google.android.gms.internal.ads.rx3 r10 = r0.f13369z
            com.google.android.gms.internal.ads.s54 r10 = r10.f14146b
            boolean r10 = r10.mo7714b()
            if (r10 == 0) goto L_0x01e8
            com.google.android.gms.internal.ads.rx3 r5 = r0.f13369z
            long r5 = m15906B(r5)
            goto L_0x01e8
        L_0x01d7:
            com.google.android.gms.internal.ads.s54 r5 = r3.f14146b
            boolean r5 = r5.mo7714b()
            if (r5 == 0) goto L_0x01e6
            long r5 = r3.f14163s
        L_0x01e1:
            long r10 = m15906B(r3)
            goto L_0x01e9
        L_0x01e6:
            long r5 = r3.f14163s
        L_0x01e8:
            r10 = r5
        L_0x01e9:
            com.google.android.gms.internal.ads.ta0 r12 = new com.google.android.gms.internal.ads.ta0
            long r23 = com.google.android.gms.internal.ads.nz3.m14196d(r5)
            long r25 = com.google.android.gms.internal.ads.nz3.m14196d(r10)
            com.google.android.gms.internal.ads.s54 r5 = r3.f14146b
            int r6 = r5.f7615b
            int r5 = r5.f7616c
            r17 = r12
            r27 = r6
            r28 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r25, r27, r28)
            int r5 = r40.mo7756e()
            com.google.android.gms.internal.ads.rx3 r6 = r0.f13369z
            com.google.android.gms.internal.ads.ei0 r6 = r6.f14145a
            boolean r6 = r6.mo6970o()
            if (r6 != 0) goto L_0x0240
            com.google.android.gms.internal.ads.rx3 r6 = r0.f13369z
            com.google.android.gms.internal.ads.s54 r10 = r6.f14146b
            java.lang.Object r10 = r10.f7614a
            com.google.android.gms.internal.ads.ei0 r6 = r6.f14145a
            com.google.android.gms.internal.ads.pf0 r11 = r0.f13353j
            r6.mo6969n(r10, r11)
            com.google.android.gms.internal.ads.rx3 r6 = r0.f13369z
            com.google.android.gms.internal.ads.ei0 r6 = r6.f14145a
            int r6 = r6.mo6954a(r10)
            com.google.android.gms.internal.ads.rx3 r11 = r0.f13369z
            com.google.android.gms.internal.ads.ei0 r11 = r11.f14145a
            com.google.android.gms.internal.ads.hh0 r13 = r0.f10202a
            r14 = 0
            com.google.android.gms.internal.ads.hh0 r11 = r11.mo6958e(r5, r13, r14)
            java.lang.Object r11 = r11.f8225a
            com.google.android.gms.internal.ads.hh0 r13 = r0.f10202a
            com.google.android.gms.internal.ads.zo r13 = r13.f8226b
            r32 = r6
            r31 = r10
            r28 = r11
            r30 = r13
            goto L_0x0248
        L_0x0240:
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = -1
        L_0x0248:
            long r33 = com.google.android.gms.internal.ads.nz3.m14196d(r47)
            com.google.android.gms.internal.ads.ta0 r6 = new com.google.android.gms.internal.ads.ta0
            com.google.android.gms.internal.ads.rx3 r10 = r0.f13369z
            com.google.android.gms.internal.ads.s54 r10 = r10.f14146b
            boolean r10 = r10.mo7714b()
            if (r10 == 0) goto L_0x0265
            com.google.android.gms.internal.ads.rx3 r10 = r0.f13369z
            long r10 = m15906B(r10)
            long r10 = com.google.android.gms.internal.ads.nz3.m14196d(r10)
            r35 = r10
            goto L_0x0267
        L_0x0265:
            r35 = r33
        L_0x0267:
            com.google.android.gms.internal.ads.rx3 r10 = r0.f13369z
            com.google.android.gms.internal.ads.s54 r10 = r10.f14146b
            int r11 = r10.f7615b
            int r10 = r10.f7616c
            r27 = r6
            r29 = r5
            r37 = r11
            r38 = r10
            r27.<init>(r28, r29, r30, r31, r32, r33, r35, r37, r38)
            com.google.android.gms.internal.ads.nb2<com.google.android.gms.internal.ads.a80> r5 = r0.f13351h
            com.google.android.gms.internal.ads.dw3 r10 = new com.google.android.gms.internal.ads.dw3
            r10.<init>(r2, r12, r6)
            r5.mo9489d(r7, r10)
            goto L_0x0287
        L_0x0285:
            r16 = r6
        L_0x0287:
            if (r16 == 0) goto L_0x0294
            com.google.android.gms.internal.ads.nb2<com.google.android.gms.internal.ads.a80> r2 = r0.f13351h
            com.google.android.gms.internal.ads.jw3 r5 = new com.google.android.gms.internal.ads.jw3
            r5.<init>(r9, r4)
            r4 = 1
            r2.mo9489d(r4, r5)
        L_0x0294:
            com.google.android.gms.internal.ads.ll3 r2 = r3.f14150f
            com.google.android.gms.internal.ads.ll3 r4 = r1.f14150f
            r5 = 10
            if (r2 == r4) goto L_0x02b4
            com.google.android.gms.internal.ads.nb2<com.google.android.gms.internal.ads.a80> r2 = r0.f13351h
            com.google.android.gms.internal.ads.nw3 r4 = new com.google.android.gms.internal.ads.nw3
            r4.<init>(r1)
            r2.mo9489d(r5, r4)
            com.google.android.gms.internal.ads.ll3 r2 = r1.f14150f
            if (r2 == 0) goto L_0x02b4
            com.google.android.gms.internal.ads.nb2<com.google.android.gms.internal.ads.a80> r2 = r0.f13351h
            com.google.android.gms.internal.ads.ow3 r4 = new com.google.android.gms.internal.ads.ow3
            r4.<init>(r1)
            r2.mo9489d(r5, r4)
        L_0x02b4:
            com.google.android.gms.internal.ads.r84 r2 = r3.f14153i
            com.google.android.gms.internal.ads.r84 r4 = r1.f14153i
            if (r2 == r4) goto L_0x02e0
            com.google.android.gms.internal.ads.q84 r2 = r0.f13348e
            java.lang.Object r4 = r4.f13545d
            r2.mo9701b(r4)
            com.google.android.gms.internal.ads.in0 r2 = new com.google.android.gms.internal.ads.in0
            com.google.android.gms.internal.ads.r84 r4 = r1.f14153i
            com.google.android.gms.internal.ads.w74[] r4 = r4.f13546e
            r6 = 0
            r2.<init>(r4, r6)
            com.google.android.gms.internal.ads.nb2<com.google.android.gms.internal.ads.a80> r4 = r0.f13351h
            com.google.android.gms.internal.ads.cw3 r6 = new com.google.android.gms.internal.ads.cw3
            r6.<init>(r1, r2)
            r2 = 2
            r4.mo9489d(r2, r6)
            com.google.android.gms.internal.ads.nb2<com.google.android.gms.internal.ads.a80> r4 = r0.f13351h
            com.google.android.gms.internal.ads.oo3 r6 = new com.google.android.gms.internal.ads.oo3
            r6.<init>(r1)
            r4.mo9489d(r2, r6)
        L_0x02e0:
            if (r8 == 0) goto L_0x02f0
            com.google.android.gms.internal.ads.fu r2 = r0.f13367x
            com.google.android.gms.internal.ads.nb2<com.google.android.gms.internal.ads.a80> r4 = r0.f13351h
            com.google.android.gms.internal.ads.lw3 r6 = new com.google.android.gms.internal.ads.lw3
            r6.<init>(r2)
            r2 = 14
            r4.mo9489d(r2, r6)
        L_0x02f0:
            boolean r2 = r3.f14151g
            boolean r4 = r1.f14151g
            if (r2 == r4) goto L_0x0301
            com.google.android.gms.internal.ads.nb2<com.google.android.gms.internal.ads.a80> r2 = r0.f13351h
            com.google.android.gms.internal.ads.pp3 r4 = new com.google.android.gms.internal.ads.pp3
            r4.<init>(r1)
            r6 = 3
            r2.mo9489d(r6, r4)
        L_0x0301:
            int r2 = r3.f14149e
            int r4 = r1.f14149e
            if (r2 != r4) goto L_0x030d
            boolean r2 = r3.f14156l
            boolean r4 = r1.f14156l
            if (r2 == r4) goto L_0x0318
        L_0x030d:
            com.google.android.gms.internal.ads.nb2<com.google.android.gms.internal.ads.a80> r2 = r0.f13351h
            com.google.android.gms.internal.ads.pq3 r4 = new com.google.android.gms.internal.ads.pq3
            r4.<init>(r1)
            r6 = -1
            r2.mo9489d(r6, r4)
        L_0x0318:
            int r2 = r3.f14149e
            int r4 = r1.f14149e
            r6 = 4
            if (r2 == r4) goto L_0x0329
            com.google.android.gms.internal.ads.nb2<com.google.android.gms.internal.ads.a80> r2 = r0.f13351h
            com.google.android.gms.internal.ads.pr3 r4 = new com.google.android.gms.internal.ads.pr3
            r4.<init>(r1)
            r2.mo9489d(r6, r4)
        L_0x0329:
            boolean r2 = r3.f14156l
            boolean r4 = r1.f14156l
            r8 = 5
            if (r2 == r4) goto L_0x033c
            com.google.android.gms.internal.ads.nb2<com.google.android.gms.internal.ads.a80> r2 = r0.f13351h
            com.google.android.gms.internal.ads.tv3 r4 = new com.google.android.gms.internal.ads.tv3
            r9 = r43
            r4.<init>(r1, r9)
            r2.mo9489d(r8, r4)
        L_0x033c:
            int r2 = r3.f14157m
            int r4 = r1.f14157m
            r9 = 6
            if (r2 == r4) goto L_0x034d
            com.google.android.gms.internal.ads.nb2<com.google.android.gms.internal.ads.a80> r2 = r0.f13351h
            com.google.android.gms.internal.ads.qs3 r4 = new com.google.android.gms.internal.ads.qs3
            r4.<init>(r1)
            r2.mo9489d(r9, r4)
        L_0x034d:
            boolean r2 = m15911G(r3)
            boolean r4 = m15911G(r41)
            r10 = 7
            if (r2 == r4) goto L_0x0362
            com.google.android.gms.internal.ads.nb2<com.google.android.gms.internal.ads.a80> r2 = r0.f13351h
            com.google.android.gms.internal.ads.rt3 r4 = new com.google.android.gms.internal.ads.rt3
            r4.<init>(r1)
            r2.mo9489d(r10, r4)
        L_0x0362:
            com.google.android.gms.internal.ads.e30 r2 = r3.f14158n
            com.google.android.gms.internal.ads.e30 r4 = r1.f14158n
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0378
            com.google.android.gms.internal.ads.nb2<com.google.android.gms.internal.ads.a80> r2 = r0.f13351h
            com.google.android.gms.internal.ads.su3 r4 = new com.google.android.gms.internal.ads.su3
            r4.<init>(r1)
            r11 = 12
            r2.mo9489d(r11, r4)
        L_0x0378:
            if (r44 == 0) goto L_0x0382
            com.google.android.gms.internal.ads.nb2<com.google.android.gms.internal.ads.a80> r2 = r0.f13351h
            com.google.android.gms.internal.ads.fw3 r4 = com.google.android.gms.internal.ads.fw3.f6973a
            r11 = -1
            r2.mo9489d(r11, r4)
        L_0x0382:
            com.google.android.gms.internal.ads.z60 r2 = r0.f13366w
            com.google.android.gms.internal.ads.z60 r4 = r0.f13346c
            com.google.android.gms.internal.ads.b50 r11 = new com.google.android.gms.internal.ads.b50
            r11.<init>()
            r11.mo5711b(r4)
            boolean r4 = r40.mo7762l()
            r12 = 1
            r4 = r4 ^ r12
            r12 = 3
            r11.mo5713d(r12, r4)
            boolean r4 = r40.mo9089p()
            if (r4 == 0) goto L_0x03a6
            boolean r4 = r40.mo7762l()
            if (r4 != 0) goto L_0x03a6
            r4 = 1
            goto L_0x03a7
        L_0x03a6:
            r4 = 0
        L_0x03a7:
            r11.mo5713d(r6, r4)
            boolean r4 = r40.mo9087g()
            if (r4 == 0) goto L_0x03b8
            boolean r4 = r40.mo7762l()
            if (r4 != 0) goto L_0x03b8
            r4 = 1
            goto L_0x03b9
        L_0x03b8:
            r4 = 0
        L_0x03b9:
            r11.mo5713d(r8, r4)
            com.google.android.gms.internal.ads.rx3 r4 = r0.f13369z
            com.google.android.gms.internal.ads.ei0 r4 = r4.f14145a
            boolean r4 = r4.mo6970o()
            if (r4 != 0) goto L_0x03e0
            boolean r4 = r40.mo9087g()
            if (r4 != 0) goto L_0x03d8
            boolean r4 = r40.mo9088m()
            if (r4 == 0) goto L_0x03d8
            boolean r4 = r40.mo9089p()
            if (r4 == 0) goto L_0x03e0
        L_0x03d8:
            boolean r4 = r40.mo7762l()
            if (r4 != 0) goto L_0x03e0
            r4 = 1
            goto L_0x03e1
        L_0x03e0:
            r4 = 0
        L_0x03e1:
            r11.mo5713d(r9, r4)
            boolean r4 = r40.mo9086c()
            if (r4 == 0) goto L_0x03f2
            boolean r4 = r40.mo7762l()
            if (r4 != 0) goto L_0x03f2
            r4 = 1
            goto L_0x03f3
        L_0x03f2:
            r4 = 0
        L_0x03f3:
            r11.mo5713d(r10, r4)
            com.google.android.gms.internal.ads.rx3 r4 = r0.f13369z
            com.google.android.gms.internal.ads.ei0 r4 = r4.f14145a
            boolean r4 = r4.mo6970o()
            if (r4 != 0) goto L_0x042e
            boolean r4 = r40.mo9086c()
            if (r4 != 0) goto L_0x0426
            boolean r4 = r40.mo9088m()
            if (r4 == 0) goto L_0x042e
            com.google.android.gms.internal.ads.rx3 r4 = r0.f13369z
            com.google.android.gms.internal.ads.ei0 r4 = r4.f14145a
            boolean r6 = r4.mo6970o()
            if (r6 != 0) goto L_0x042e
            int r6 = r40.mo7756e()
            com.google.android.gms.internal.ads.hh0 r8 = r0.f10202a
            r9 = 0
            com.google.android.gms.internal.ads.hh0 r4 = r4.mo6958e(r6, r8, r9)
            boolean r4 = r4.f8231g
            if (r4 == 0) goto L_0x042e
        L_0x0426:
            boolean r4 = r40.mo7762l()
            if (r4 != 0) goto L_0x042e
            r4 = 1
            goto L_0x042f
        L_0x042e:
            r4 = 0
        L_0x042f:
            r6 = 8
            r11.mo5713d(r6, r4)
            r4 = 9
            boolean r6 = r40.mo7762l()
            r8 = 1
            r6 = r6 ^ r8
            r11.mo5713d(r4, r6)
            boolean r4 = r40.mo9089p()
            if (r4 == 0) goto L_0x044d
            boolean r4 = r40.mo7762l()
            if (r4 != 0) goto L_0x044d
            r4 = r8
            goto L_0x044e
        L_0x044d:
            r4 = 0
        L_0x044e:
            r11.mo5713d(r5, r4)
            boolean r4 = r40.mo9089p()
            if (r4 == 0) goto L_0x045f
            boolean r4 = r40.mo7762l()
            if (r4 != 0) goto L_0x045f
            r5 = r8
            goto L_0x0460
        L_0x045f:
            r5 = 0
        L_0x0460:
            r11.mo5713d(r7, r5)
            com.google.android.gms.internal.ads.z60 r4 = r11.mo5714e()
            r0.f13366w = r4
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x047b
            com.google.android.gms.internal.ads.nb2<com.google.android.gms.internal.ads.a80> r2 = r0.f13351h
            com.google.android.gms.internal.ads.mw3 r4 = new com.google.android.gms.internal.ads.mw3
            r4.<init>(r0)
            r5 = 13
            r2.mo9489d(r5, r4)
        L_0x047b:
            com.google.android.gms.internal.ads.nb2<com.google.android.gms.internal.ads.a80> r2 = r0.f13351h
            r2.mo9488c()
            boolean r2 = r3.f14159o
            boolean r4 = r1.f14159o
            if (r2 == r4) goto L_0x049e
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.gms.internal.ads.mm3> r2 = r0.f13352i
            java.util.Iterator r2 = r2.iterator()
        L_0x048c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x049e
            java.lang.Object r4 = r2.next()
            com.google.android.gms.internal.ads.mm3 r4 = (com.google.android.gms.internal.ads.mm3) r4
            boolean r5 = r1.f14159o
            r4.mo6734d(r5)
            goto L_0x048c
        L_0x049e:
            boolean r2 = r3.f14160p
            boolean r3 = r1.f14160p
            if (r2 == r3) goto L_0x04bc
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.gms.internal.ads.mm3> r2 = r0.f13352i
            java.util.Iterator r2 = r2.iterator()
        L_0x04aa:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04bc
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.ads.mm3 r3 = (com.google.android.gms.internal.ads.mm3) r3
            boolean r4 = r1.f14160p
            r3.mo6736g(r4)
            goto L_0x04aa
        L_0x04bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qw3.m15910F(com.google.android.gms.internal.ads.rx3, int, int, boolean, boolean, int, long, int):void");
    }

    /* renamed from: G */
    private static boolean m15911G(rx3 rx3) {
        return rx3.f14149e == 3 && rx3.f14156l && rx3.f14157m == 0;
    }

    /* renamed from: z */
    private final int m15913z() {
        if (this.f13369z.f14145a.mo6970o()) {
            return this.f13341A;
        }
        rx3 rx3 = this.f13369z;
        return rx3.f14145a.mo6969n(rx3.f14146b.f7614a, this.f13353j).f12646c;
    }

    /* renamed from: H */
    public final int mo10407H() {
        return this.f13369z.f14149e;
    }

    /* renamed from: I */
    public final int mo10408I() {
        int length = this.f13347d.length;
        return 2;
    }

    /* renamed from: J */
    public final long mo10409J() {
        if (mo7762l()) {
            rx3 rx3 = this.f13369z;
            return rx3.f14155k.equals(rx3.f14146b) ? nz3.m14196d(this.f13369z.f14161q) : mo10410K();
        } else if (this.f13369z.f14145a.mo6970o()) {
            return this.f13342B;
        } else {
            rx3 rx32 = this.f13369z;
            long j = 0;
            if (rx32.f14155k.f7617d != rx32.f14146b.f7617d) {
                return nz3.m14196d(rx32.f14145a.mo6958e(mo7756e(), this.f10202a, 0).f8236l);
            }
            long j2 = rx32.f14161q;
            if (this.f13369z.f14155k.mo7714b()) {
                rx3 rx33 = this.f13369z;
                rx33.f14145a.mo6969n(rx33.f14155k.f7614a, this.f13353j).mo10049g(this.f13369z.f14155k.f7615b);
            } else {
                j = j2;
            }
            rx3 rx34 = this.f13369z;
            m15907C(rx34.f14145a, rx34.f14155k, j);
            return nz3.m14196d(j);
        }
    }

    /* renamed from: K */
    public final long mo10410K() {
        long f;
        if (!mo7762l()) {
            ei0 ei0 = this.f13369z.f14145a;
            if (ei0.mo6970o()) {
                return -9223372036854775807L;
            }
            f = ei0.mo6958e(mo7756e(), this.f10202a, 0).f8236l;
        } else {
            rx3 rx3 = this.f13369z;
            s54 s54 = rx3.f14146b;
            rx3.f14145a.mo6969n(s54.f7614a, this.f13353j);
            f = this.f13353j.mo10048f(s54.f7615b, s54.f7616c);
        }
        return nz3.m14196d(f);
    }

    /* renamed from: L */
    public final Looper mo10411L() {
        return this.f13358o;
    }

    /* renamed from: M */
    public final ux3 mo10412M(tx3 tx3) {
        return new ux3(this.f13350g, tx3, this.f13369z.f14145a, mo7756e(), this.f13360q, this.f13350g.mo5548Q());
    }

    /* renamed from: N */
    public final void mo10413N(mm3 mm3) {
        this.f13352i.add(mm3);
    }

    /* renamed from: O */
    public final void mo10414O(a80 a80) {
        this.f13351h.mo9487b(a80);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final /* synthetic */ void mo10415P(yw3 yw3) {
        long j;
        boolean z;
        long j2;
        int i = this.f13361r - yw3.f17921c;
        this.f13361r = i;
        boolean z2 = true;
        if (yw3.f17922d) {
            this.f13362s = yw3.f17923e;
            this.f13363t = true;
        }
        if (yw3.f17924f) {
            this.f13364u = yw3.f17925g;
        }
        if (i == 0) {
            ei0 ei0 = yw3.f17920b.f14145a;
            if (!this.f13369z.f14145a.mo6970o() && ei0.mo6970o()) {
                this.f13341A = -1;
                this.f13342B = 0;
            }
            if (!ei0.mo6970o()) {
                List<ei0> y = ((vx3) ei0).mo11547y();
                wu1.m19207f(y.size() == this.f13354k.size());
                for (int i2 = 0; i2 < y.size(); i2++) {
                    this.f13354k.get(i2).f12833b = y.get(i2);
                }
            }
            if (this.f13363t) {
                if (yw3.f17920b.f14146b.equals(this.f13369z.f14146b) && yw3.f17920b.f14148d == this.f13369z.f14163s) {
                    z2 = false;
                }
                if (z2) {
                    if (ei0.mo6970o() || yw3.f17920b.f14146b.mo7714b()) {
                        j2 = yw3.f17920b.f14148d;
                    } else {
                        rx3 rx3 = yw3.f17920b;
                        s54 s54 = rx3.f14146b;
                        j2 = rx3.f14148d;
                        m15907C(ei0, s54, j2);
                    }
                    z = z2;
                    j = j2;
                } else {
                    j = -9223372036854775807L;
                    z = z2;
                }
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.f13363t = false;
            m15910F(yw3.f17920b, 1, this.f13364u, false, z, this.f13362s, j, -1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final /* synthetic */ void mo10416Q(yw3 yw3) {
        this.f13349f.mo7842E(new iw3(this, yw3));
    }

    /* renamed from: a */
    public final void mo7749a(int i, long j) {
        int i2 = i;
        long j2 = j;
        ei0 ei0 = this.f13369z.f14145a;
        if (i2 < 0 || (!ei0.mo6970o() && i2 >= ei0.mo6956c())) {
            throw new C1612d1(ei0, i, j2);
        }
        int i3 = 1;
        this.f13361r++;
        if (!mo7762l()) {
            if (this.f13369z.f14149e != 1) {
                i3 = 2;
            }
            int e = mo7756e();
            rx3 E = m15909E(this.f13369z.mo10687f(i3), ei0, m15908D(ei0, i, j2));
            this.f13350g.mo5551W(ei0, i, nz3.m14195c(j));
            m15910F(E, 0, 1, true, true, 1, m15905A(E), e);
            return;
        }
        Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
        yw3 yw3 = new yw3(this.f13369z);
        yw3.mo12101a(1);
        this.f13343C.f8448a.mo10416Q(yw3);
    }

    /* renamed from: b */
    public final int mo7751b() {
        if (mo7762l()) {
            return this.f13369z.f14146b.f7615b;
        }
        return -1;
    }

    /* renamed from: d */
    public final int mo7754d() {
        if (mo7762l()) {
            return this.f13369z.f14146b.f7616c;
        }
        return -1;
    }

    /* renamed from: e */
    public final int mo7756e() {
        int z = m15913z();
        if (z == -1) {
            return 0;
        }
        return z;
    }

    /* renamed from: f */
    public final int mo7757f() {
        if (this.f13369z.f14145a.mo6970o()) {
            return 0;
        }
        rx3 rx3 = this.f13369z;
        return rx3.f14145a.mo6954a(rx3.f14146b.f7614a);
    }

    /* renamed from: h */
    public final int mo7758h() {
        return 0;
    }

    /* renamed from: i */
    public final long mo7759i() {
        if (!mo7762l()) {
            return mo7760j();
        }
        rx3 rx3 = this.f13369z;
        rx3.f14145a.mo6969n(rx3.f14146b.f7614a, this.f13353j);
        rx3 rx32 = this.f13369z;
        if (rx32.f14147c != -9223372036854775807L) {
            return nz3.m14196d(0) + nz3.m14196d(this.f13369z.f14147c);
        }
        long j = rx32.f14145a.mo6958e(mo7756e(), this.f10202a, 0).f8235k;
        return nz3.m14196d(0);
    }

    /* renamed from: j */
    public final long mo7760j() {
        return nz3.m14196d(m15905A(this.f13369z));
    }

    /* renamed from: k */
    public final long mo7761k() {
        return nz3.m14196d(this.f13369z.f14162r);
    }

    /* renamed from: l */
    public final boolean mo7762l() {
        return this.f13369z.f14146b.mo7714b();
    }

    /* renamed from: n */
    public final boolean mo7763n() {
        return false;
    }

    /* renamed from: o */
    public final ei0 mo7764o() {
        return this.f13369z.f14145a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo10417q(a80 a80) {
        a80.mo5168e0(this.f13366w);
    }

    /* renamed from: s */
    public final void mo10418s() {
        rx3 rx3 = this.f13369z;
        if (rx3.f14149e == 1) {
            rx3 e = rx3.mo10686e((ll3) null);
            rx3 f = e.mo10687f(true != e.f14145a.mo6970o() ? 2 : 4);
            this.f13361r++;
            this.f13350g.mo5550V();
            m15910F(f, 1, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* renamed from: t */
    public final void mo10419t() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = n13.f11240e;
        String a = v84.m18402a();
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 36 + String.valueOf(str).length() + String.valueOf(a).length());
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.15.1] [");
        sb.append(str);
        sb.append("] [");
        sb.append(a);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        if (!this.f13350g.mo5554Z()) {
            nb2<a80> nb2 = this.f13351h;
            nb2.mo9489d(10, ew3.f6411a);
            nb2.mo9488c();
        }
        this.f13351h.mo9490e();
        this.f13349f.mo7844G((Object) null);
        q04 q04 = this.f13357n;
        if (q04 != null) {
            this.f13359p.mo5193c(q04);
        }
        rx3 f = this.f13369z.mo10687f(1);
        this.f13369z = f;
        rx3 a2 = f.mo10682a(f.f14146b);
        this.f13369z = a2;
        a2.f14161q = a2.f14163s;
        this.f13369z.f14162r = 0;
    }

    /* renamed from: u */
    public final void mo10420u(List<v54> list, boolean z) {
        m15913z();
        mo7760j();
        this.f13361r++;
        if (!this.f13354k.isEmpty()) {
            int size = this.f13354k.size();
            for (int i = size - 1; i >= 0; i--) {
                this.f13354k.remove(i);
            }
            this.f13344D = this.f13344D.mo8903h(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ox3 ox3 = new ox3(list.get(i2), this.f13355l);
            arrayList.add(ox3);
            this.f13354k.add(i2, new pw3(ox3.f12253b, ox3.f12252a.mo9687F()));
        }
        this.f13344D = this.f13344D.mo8902g(0, arrayList.size());
        vx3 vx3 = new vx3(this.f13354k, this.f13344D, (l74) null);
        if (vx3.mo6970o() || vx3.mo6956c() >= 0) {
            int g = vx3.mo6961g(false);
            rx3 E = m15909E(this.f13369z, vx3, m15908D(vx3, g, -9223372036854775807L));
            int i3 = E.f14149e;
            if (!(g == -1 || i3 == 1)) {
                i3 = (vx3.mo6970o() || g >= vx3.mo6956c()) ? 4 : 2;
            }
            rx3 f = E.mo10687f(i3);
            this.f13350g.mo5556a0(arrayList, g, nz3.m14195c(-9223372036854775807L), this.f13344D);
            m15910F(f, 0, 1, false, !this.f13369z.f14146b.f7614a.equals(f.f14146b.f7614a) && !this.f13369z.f14145a.mo6970o(), 4, m15905A(f), -1);
            return;
        }
        throw new C1612d1(vx3, -1, -9223372036854775807L);
    }

    /* renamed from: v */
    public final void mo10421v(boolean z, int i, int i2) {
        rx3 rx3 = this.f13369z;
        if (rx3.f14156l != z || rx3.f14157m != i) {
            this.f13361r++;
            rx3 d = rx3.mo10685d(z, i);
            this.f13350g.mo5552X(z, i);
            m15910F(d, 0, i2, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* renamed from: w */
    public final void mo10422w(boolean z, ll3 ll3) {
        rx3 rx3 = this.f13369z;
        rx3 a = rx3.mo10682a(rx3.f14146b);
        a.f14161q = a.f14163s;
        a.f14162r = 0;
        rx3 f = a.mo10687f(1);
        if (ll3 != null) {
            f = f.mo10686e(ll3);
        }
        rx3 rx32 = f;
        this.f13361r++;
        this.f13350g.mo5553Y();
        m15910F(rx32, 0, 1, false, rx32.f14145a.mo6970o() && !this.f13369z.f14145a.mo6970o(), 4, m15905A(rx32), -1);
    }

    /* renamed from: x */
    public final boolean mo10423x() {
        return this.f13369z.f14160p;
    }

    /* renamed from: y */
    public final boolean mo10424y() {
        return this.f13369z.f14156l;
    }
}
