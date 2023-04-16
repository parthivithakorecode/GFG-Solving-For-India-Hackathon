package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;

final class ix3 {

    /* renamed from: a */
    private final pf0 f8851a = new pf0();

    /* renamed from: b */
    private final hh0 f8852b = new hh0();

    /* renamed from: c */
    private final q04 f8853c;

    /* renamed from: d */
    private final Handler f8854d;

    /* renamed from: e */
    private long f8855e;

    /* renamed from: f */
    private int f8856f;

    /* renamed from: g */
    private boolean f8857g;

    /* renamed from: h */
    private fx3 f8858h;

    /* renamed from: i */
    private fx3 f8859i;

    /* renamed from: j */
    private fx3 f8860j;

    /* renamed from: k */
    private int f8861k;

    /* renamed from: l */
    private Object f8862l;

    /* renamed from: m */
    private long f8863m;

    public ix3(q04 q04, Handler handler) {
        this.f8853c = q04;
        this.f8854d = handler;
    }

    /* renamed from: A */
    private static s54 m11327A(ei0 ei0, Object obj, long j, long j2, pf0 pf0) {
        ei0.mo6969n(obj, pf0);
        int c = pf0.mo10044c(j);
        if (c == -1) {
            return new s54(obj, j2, pf0.mo10043b(j));
        }
        return new s54(obj, c, pf0.mo10045d(c), j2);
    }

    /* renamed from: B */
    private final void m11328B() {
        b73 p = e73.m8341p();
        for (fx3 fx3 = this.f8858h; fx3 != null; fx3 = fx3.mo7425h()) {
            p.mo5730f(fx3.f6985f.f7876a);
        }
        fx3 fx32 = this.f8859i;
        this.f8854d.post(new hx3(this, p, fx32 == null ? null : fx32.f6985f.f7876a));
    }

    /* renamed from: C */
    private final boolean m11329C(ei0 ei0, s54 s54, boolean z) {
        int a = ei0.mo6954a(s54.f7614a);
        if (!ei0.mo6958e(ei0.mo6957d(a, this.f8851a, false).f12646c, this.f8852b, 0).f8231g) {
            return ei0.mo6964i(a, this.f8851a, this.f8852b, this.f8856f, this.f8857g) == -1 && z;
        }
    }

    /* renamed from: a */
    private final boolean m11330a(ei0 ei0, s54 s54) {
        if (!m11332c(s54)) {
            return false;
        }
        return ei0.mo6958e(ei0.mo6969n(s54.f7614a, this.f8851a).f12646c, this.f8852b, 0).f8238n == ei0.mo6954a(s54.f7614a);
    }

    /* renamed from: b */
    private final boolean m11331b(ei0 ei0) {
        fx3 fx3 = this.f8858h;
        if (fx3 == null) {
            return true;
        }
        int a = ei0.mo6954a(fx3.f6981b);
        while (true) {
            a = ei0.mo6964i(a, this.f8851a, this.f8852b, this.f8856f, this.f8857g);
            while (fx3.mo7425h() != null && !fx3.f6985f.f7882g) {
                fx3 = fx3.mo7425h();
            }
            fx3 h = fx3.mo7425h();
            if (a == -1 || h == null || ei0.mo6954a(h.f6981b) != a) {
                boolean p = mo8302p(fx3);
                fx3.f6985f = mo8296j(ei0, fx3.f6985f);
            } else {
                fx3 = h;
            }
        }
        boolean p2 = mo8302p(fx3);
        fx3.f6985f = mo8296j(ei0, fx3.f6985f);
        return !p2;
    }

    /* renamed from: c */
    private static final boolean m11332c(s54 s54) {
        return !s54.mo7714b() && s54.f7618e == -1;
    }

    /* renamed from: v */
    private final long m11333v(ei0 ei0, Object obj, int i) {
        ei0.mo6969n(obj, this.f8851a);
        this.f8851a.mo10049g(i);
        this.f8851a.mo10052i(i);
        return 0;
    }

    /* renamed from: w */
    private final gx3 m11334w(ei0 ei0, fx3 fx3, long j) {
        long j2;
        ei0 ei02 = ei0;
        gx3 gx3 = fx3.f6985f;
        long e = (fx3.mo7422e() + gx3.f7880e) - j;
        if (gx3.f7882g) {
            long j3 = 0;
            int i = ei0.mo6964i(ei02.mo6954a(gx3.f7876a.f7614a), this.f8851a, this.f8852b, this.f8856f, this.f8857g);
            if (i == -1) {
                return null;
            }
            int i2 = ei02.mo6957d(i, this.f8851a, true).f12646c;
            Object obj = this.f8851a.f12645b;
            long j4 = gx3.f7876a.f7617d;
            if (ei02.mo6958e(i2, this.f8852b, 0).f8237m == i) {
                Pair<Object, Long> m = ei0.mo6968m(this.f8852b, this.f8851a, i2, -9223372036854775807L, Math.max(0, e));
                if (m == null) {
                    return null;
                }
                obj = m.first;
                long longValue = ((Long) m.second).longValue();
                fx3 h = fx3.mo7425h();
                if (h == null || !h.f6981b.equals(obj)) {
                    j4 = this.f8855e;
                    this.f8855e = 1 + j4;
                } else {
                    j4 = h.f6985f.f7876a.f7617d;
                }
                j2 = longValue;
                j3 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            return m11335x(ei0, m11327A(ei0, obj, j2, j4, this.f8851a), j3, j2);
        }
        s54 s54 = gx3.f7876a;
        ei02.mo6969n(s54.f7614a, this.f8851a);
        if (s54.mo7714b()) {
            int i3 = s54.f7615b;
            if (this.f8851a.mo10042a(i3) == -1) {
                return null;
            }
            int e2 = this.f8851a.mo10046e(i3, s54.f7616c);
            if (e2 < 0) {
                return m11336y(ei0, s54.f7614a, i3, e2, gx3.f7878c, s54.f7617d);
            }
            long j5 = gx3.f7878c;
            if (j5 == -9223372036854775807L) {
                hh0 hh0 = this.f8852b;
                pf0 pf0 = this.f8851a;
                Pair<Object, Long> m2 = ei0.mo6968m(hh0, pf0, pf0.f12646c, -9223372036854775807L, Math.max(0, e));
                if (m2 == null) {
                    return null;
                }
                j5 = ((Long) m2.second).longValue();
            }
            m11333v(ei02, s54.f7614a, s54.f7615b);
            return m11337z(ei0, s54.f7614a, Math.max(0, j5), gx3.f7878c, s54.f7617d);
        }
        int d = this.f8851a.mo10045d(s54.f7618e);
        if (d == this.f8851a.mo10042a(s54.f7618e)) {
            m11333v(ei02, s54.f7614a, s54.f7618e);
            return m11337z(ei0, s54.f7614a, 0, gx3.f7880e, s54.f7617d);
        }
        return m11336y(ei0, s54.f7614a, s54.f7618e, d, gx3.f7880e, s54.f7617d);
    }

    /* renamed from: x */
    private final gx3 m11335x(ei0 ei0, s54 s54, long j, long j2) {
        s54 s542 = s54;
        ei0 ei02 = ei0;
        ei0.mo6969n(s542.f7614a, this.f8851a);
        boolean b = s54.mo7714b();
        Object obj = s542.f7614a;
        if (b) {
            return m11336y(ei0, obj, s542.f7615b, s542.f7616c, j, s542.f7617d);
        }
        return m11337z(ei0, obj, j2, j, s542.f7617d);
    }

    /* renamed from: y */
    private final gx3 m11336y(ei0 ei0, Object obj, int i, int i2, long j, long j2) {
        s54 s54 = new s54(obj, i, i2, j2);
        long f = ei0.mo6969n(s54.f7614a, this.f8851a).mo10048f(s54.f7615b, s54.f7616c);
        if (i2 == this.f8851a.mo10045d(i)) {
            this.f8851a.mo10050h();
        }
        this.f8851a.mo10054k(s54.f7615b);
        return new gx3(s54, (f == -9223372036854775807L || f > 0) ? 0 : Math.max(0, -1 + f), j, -9223372036854775807L, f, false, false, false, false);
    }

    /* renamed from: z */
    private final gx3 m11337z(ei0 ei0, Object obj, long j, long j2, long j3) {
        long j4;
        ei0 ei02 = ei0;
        Object obj2 = obj;
        long j5 = j;
        ei02.mo6969n(obj2, this.f8851a);
        int b = this.f8851a.mo10043b(j5);
        s54 s54 = new s54(obj2, j3, b);
        boolean c = m11332c(s54);
        boolean a = m11330a(ei02, s54);
        boolean C = m11329C(ei02, s54, c);
        if (b != -1) {
            this.f8851a.mo10054k(b);
        }
        if (b != -1) {
            this.f8851a.mo10049g(b);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        long j6 = j4 != -9223372036854775807L ? j4 : this.f8851a.f12647d;
        if (j6 != -9223372036854775807L && j5 >= j6) {
            j5 = Math.max(0, -1 + j6);
        }
        return new gx3(s54, j5, j2, j4, j6, false, c, a, C);
    }

    /* renamed from: d */
    public final fx3 mo8290d() {
        fx3 fx3 = this.f8858h;
        if (fx3 == null) {
            return null;
        }
        if (fx3 == this.f8859i) {
            this.f8859i = fx3.mo7425h();
        }
        this.f8858h.mo7431n();
        int i = this.f8861k - 1;
        this.f8861k = i;
        if (i == 0) {
            this.f8860j = null;
            fx3 fx32 = this.f8858h;
            this.f8862l = fx32.f6981b;
            this.f8863m = fx32.f6985f.f7876a.f7617d;
        }
        this.f8858h = this.f8858h.mo7425h();
        m11328B();
        return this.f8858h;
    }

    /* renamed from: e */
    public final fx3 mo8291e() {
        fx3 fx3 = this.f8859i;
        boolean z = false;
        if (!(fx3 == null || fx3.mo7425h() == null)) {
            z = true;
        }
        wu1.m19207f(z);
        this.f8859i = this.f8859i.mo7425h();
        m11328B();
        return this.f8859i;
    }

    /* renamed from: f */
    public final fx3 mo8292f() {
        return this.f8860j;
    }

    /* renamed from: g */
    public final fx3 mo8293g() {
        return this.f8858h;
    }

    /* renamed from: h */
    public final fx3 mo8294h() {
        return this.f8859i;
    }

    /* renamed from: i */
    public final gx3 mo8295i(long j, rx3 rx3) {
        fx3 fx3 = this.f8860j;
        if (fx3 != null) {
            return m11334w(rx3.f14145a, fx3, j);
        }
        return m11335x(rx3.f14145a, rx3.f14146b, rx3.f14147c, rx3.f14163s);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.gx3 mo8296j(com.google.android.gms.internal.ads.ei0 r19, com.google.android.gms.internal.ads.gx3 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.s54 r3 = r2.f7876a
            boolean r12 = m11332c(r3)
            boolean r13 = r0.m11330a(r1, r3)
            boolean r14 = r0.m11329C(r1, r3, r12)
            com.google.android.gms.internal.ads.s54 r4 = r2.f7876a
            java.lang.Object r4 = r4.f7614a
            com.google.android.gms.internal.ads.pf0 r5 = r0.f8851a
            r1.mo6969n(r4, r5)
            boolean r1 = r3.mo7714b()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0036
            int r1 = r3.f7618e
            if (r1 != r4) goto L_0x002e
            goto L_0x0036
        L_0x002e:
            com.google.android.gms.internal.ads.pf0 r7 = r0.f8851a
            r7.mo10049g(r1)
            r7 = 0
            goto L_0x0037
        L_0x0036:
            r7 = r5
        L_0x0037:
            boolean r1 = r3.mo7714b()
            if (r1 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.pf0 r1 = r0.f8851a
            int r5 = r3.f7615b
            int r6 = r3.f7616c
            long r5 = r1.mo10048f(r5, r6)
        L_0x0047:
            r9 = r5
            goto L_0x0054
        L_0x0049:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x004f
            r9 = r7
            goto L_0x0054
        L_0x004f:
            com.google.android.gms.internal.ads.pf0 r1 = r0.f8851a
            long r5 = r1.f12647d
            goto L_0x0047
        L_0x0054:
            boolean r1 = r3.mo7714b()
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.ads.pf0 r1 = r0.f8851a
            int r4 = r3.f7615b
            r1.mo10054k(r4)
            goto L_0x006b
        L_0x0062:
            int r1 = r3.f7618e
            if (r1 == r4) goto L_0x006b
            com.google.android.gms.internal.ads.pf0 r4 = r0.f8851a
            r4.mo10054k(r1)
        L_0x006b:
            com.google.android.gms.internal.ads.gx3 r15 = new com.google.android.gms.internal.ads.gx3
            long r4 = r2.f7877b
            long r1 = r2.f7878c
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ix3.mo8296j(com.google.android.gms.internal.ads.ei0, com.google.android.gms.internal.ads.gx3):com.google.android.gms.internal.ads.gx3");
    }

    /* renamed from: k */
    public final s54 mo8297k(ei0 ei0, Object obj, long j) {
        fx3 fx3;
        long j2;
        int a;
        int i = ei0.mo6969n(obj, this.f8851a).f12646c;
        Object obj2 = this.f8862l;
        if (obj2 == null || (a = ei0.mo6954a(obj2)) == -1 || ei0.mo6957d(a, this.f8851a, false).f12646c != i) {
            fx3 fx32 = this.f8858h;
            while (true) {
                if (fx3 == null) {
                    fx3 = this.f8858h;
                    while (true) {
                        if (fx3 != null) {
                            int a2 = ei0.mo6954a(fx3.f6981b);
                            if (a2 != -1 && ei0.mo6957d(a2, this.f8851a, false).f12646c == i) {
                                break;
                            }
                            fx3 = fx3.mo7425h();
                        } else {
                            j2 = this.f8855e;
                            this.f8855e = 1 + j2;
                            if (this.f8858h == null) {
                                this.f8862l = obj;
                                this.f8863m = j2;
                            }
                        }
                    }
                } else if (fx3.f6981b.equals(obj)) {
                    break;
                } else {
                    fx32 = fx3.mo7425h();
                }
            }
            j2 = fx3.f6985f.f7876a.f7617d;
        } else {
            j2 = this.f8863m;
        }
        return m11327A(ei0, obj, j, j2, this.f8851a);
    }

    /* renamed from: l */
    public final void mo8298l() {
        if (this.f8861k != 0) {
            fx3 fx3 = this.f8858h;
            wu1.m19203b(fx3);
            this.f8862l = fx3.f6981b;
            this.f8863m = fx3.f6985f.f7876a.f7617d;
            while (fx3 != null) {
                fx3.mo7431n();
                fx3 = fx3.mo7425h();
            }
            this.f8858h = null;
            this.f8860j = null;
            this.f8859i = null;
            this.f8861k = 0;
            m11328B();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo8299m(b73 b73, s54 s54) {
        this.f8853c.mo10221S(b73.mo5731g(), s54);
    }

    /* renamed from: n */
    public final void mo8300n(long j) {
        fx3 fx3 = this.f8860j;
        if (fx3 != null) {
            fx3.mo7430m(j);
        }
    }

    /* renamed from: o */
    public final boolean mo8301o(r54 r54) {
        fx3 fx3 = this.f8860j;
        return fx3 != null && fx3.f6980a == r54;
    }

    /* renamed from: p */
    public final boolean mo8302p(fx3 fx3) {
        boolean z = false;
        wu1.m19207f(fx3 != null);
        if (fx3.equals(this.f8860j)) {
            return false;
        }
        this.f8860j = fx3;
        while (fx3.mo7425h() != null) {
            fx3 = fx3.mo7425h();
            if (fx3 == this.f8859i) {
                this.f8859i = this.f8858h;
                z = true;
            }
            fx3.mo7431n();
            this.f8861k--;
        }
        this.f8860j.mo7432o((fx3) null);
        m11328B();
        return z;
    }

    /* renamed from: q */
    public final boolean mo8303q() {
        fx3 fx3 = this.f8860j;
        if (fx3 == null) {
            return true;
        }
        if (fx3.f6985f.f7884i || !fx3.mo7435r() || this.f8860j.f6985f.f7880e == -9223372036854775807L) {
            return false;
        }
        return this.f8861k < 100;
    }

    /* renamed from: r */
    public final boolean mo8304r(ei0 ei0, long j, long j2) {
        gx3 gx3;
        boolean z;
        ei0 ei02 = ei0;
        fx3 fx3 = this.f8858h;
        fx3 fx32 = null;
        while (fx3 != null) {
            gx3 gx32 = fx3.f6985f;
            if (fx32 == null) {
                gx3 = mo8296j(ei02, gx32);
                long j3 = j;
            } else {
                gx3 w = m11334w(ei02, fx32, j);
                if (w == null) {
                    return !mo8302p(fx32);
                }
                if (gx32.f7877b != w.f7877b || !gx32.f7876a.equals(w.f7876a)) {
                    return !mo8302p(fx32);
                }
                gx3 = w;
            }
            fx3.f6985f = gx3.mo7728a(gx32.f7878c);
            long j4 = gx32.f7880e;
            long j5 = gx3.f7880e;
            if (j4 == -9223372036854775807L || j4 == j5) {
                fx32 = fx3;
                fx3 = fx3.mo7425h();
            } else {
                fx3.mo7434q();
                long j6 = gx3.f7880e;
                long e = j6 == -9223372036854775807L ? Long.MAX_VALUE : j6 + fx3.mo7422e();
                if (fx3 == this.f8859i) {
                    boolean z2 = fx3.f6985f.f7881f;
                    if (j2 == Long.MIN_VALUE || j2 >= e) {
                        z = true;
                        return mo8302p(fx3) && !z;
                    }
                }
                z = false;
                if (mo8302p(fx3)) {
                }
            }
        }
        return true;
    }

    /* renamed from: s */
    public final boolean mo8305s(ei0 ei0, int i) {
        this.f8856f = i;
        return m11331b(ei0);
    }

    /* renamed from: t */
    public final boolean mo8306t(ei0 ei0, boolean z) {
        this.f8857g = z;
        return m11331b(ei0);
    }

    /* renamed from: u */
    public final fx3 mo8307u(yx3[] yx3Arr, q84 q84, g94 g94, qx3 qx3, gx3 gx3, r84 r84) {
        long j;
        gx3 gx32 = gx3;
        fx3 fx3 = this.f8860j;
        if (fx3 == null) {
            if (gx32.f7876a.mo7714b()) {
                long j2 = gx32.f7878c;
                if (j2 != -9223372036854775807L) {
                    j = j2;
                }
            }
            j = 0;
        } else {
            j = (fx3.mo7422e() + this.f8860j.f6985f.f7880e) - gx32.f7877b;
        }
        fx3 fx32 = new fx3(yx3Arr, j, q84, g94, qx3, gx3, r84, (byte[]) null);
        fx3 fx33 = this.f8860j;
        if (fx33 != null) {
            fx33.mo7432o(fx32);
        } else {
            this.f8858h = fx32;
            this.f8859i = fx32;
        }
        this.f8862l = null;
        this.f8860j = fx32;
        this.f8861k++;
        m11328B();
        return fx32;
    }
}
