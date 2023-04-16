package com.google.android.gms.internal.ads;

final class fx3 {

    /* renamed from: a */
    public final r54 f6980a;

    /* renamed from: b */
    public final Object f6981b;

    /* renamed from: c */
    public final i74[] f6982c;

    /* renamed from: d */
    public boolean f6983d;

    /* renamed from: e */
    public boolean f6984e;

    /* renamed from: f */
    public gx3 f6985f;

    /* renamed from: g */
    public boolean f6986g;

    /* renamed from: h */
    private final boolean[] f6987h;

    /* renamed from: i */
    private final yx3[] f6988i;

    /* renamed from: j */
    private final q84 f6989j;

    /* renamed from: k */
    private final qx3 f6990k;

    /* renamed from: l */
    private fx3 f6991l;

    /* renamed from: m */
    private hm0 f6992m = hm0.f8336d;

    /* renamed from: n */
    private r84 f6993n;

    /* renamed from: o */
    private long f6994o;

    public fx3(yx3[] yx3Arr, long j, q84 q84, g94 g94, qx3 qx3, gx3 gx3, r84 r84, byte[] bArr) {
        gx3 gx32 = gx3;
        this.f6988i = yx3Arr;
        this.f6994o = j;
        this.f6989j = q84;
        this.f6990k = qx3;
        s54 s54 = gx32.f7876a;
        this.f6981b = s54.f7614a;
        this.f6985f = gx32;
        this.f6993n = r84;
        this.f6982c = new i74[2];
        this.f6987h = new boolean[2];
        long j2 = gx32.f7877b;
        long j3 = gx32.f7879d;
        g94 g942 = g94;
        r54 o = qx3.mo10440o(s54, g94, j2);
        this.f6980a = j3 != -9223372036854775807L ? new z44(o, true, 0, j3) : o;
    }

    /* renamed from: s */
    private final void m9347s() {
        if (m9349u()) {
            int i = 0;
            while (true) {
                r84 r84 = this.f6993n;
                if (i < r84.f13542a) {
                    r84.mo10495b(i);
                    w74 w74 = this.f6993n.f13546e[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: t */
    private final void m9348t() {
        if (m9349u()) {
            int i = 0;
            while (true) {
                r84 r84 = this.f6993n;
                if (i < r84.f13542a) {
                    r84.mo10495b(i);
                    w74 w74 = this.f6993n.f13546e[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: u */
    private final boolean m9349u() {
        return this.f6991l == null;
    }

    /* renamed from: a */
    public final long mo7418a(r84 r84, long j, boolean z) {
        return mo7419b(r84, j, false, new boolean[2]);
    }

    /* renamed from: b */
    public final long mo7419b(r84 r84, long j, boolean z, boolean[] zArr) {
        r84 r842 = r84;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= r842.f13542a) {
                break;
            }
            boolean[] zArr2 = this.f6987h;
            if (z || !r84.mo10494a(this.f6993n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            yx3[] yx3Arr = this.f6988i;
            if (i2 >= 2) {
                break;
            }
            yx3Arr[i2].mo5787a();
            i2++;
        }
        m9347s();
        this.f6993n = r842;
        m9348t();
        long j2 = this.f6980a.mo7247j(r842.f13546e, this.f6987h, this.f6982c, zArr, j);
        int i3 = 0;
        while (true) {
            yx3[] yx3Arr2 = this.f6988i;
            if (i3 >= 2) {
                break;
            }
            yx3Arr2[i3].mo5787a();
            i3++;
        }
        this.f6984e = false;
        int i4 = 0;
        while (true) {
            i74[] i74Arr = this.f6982c;
            if (i4 >= 2) {
                return j2;
            }
            if (i74Arr[i4] != null) {
                wu1.m19207f(r84.mo10495b(i4));
                this.f6988i[i4].mo5787a();
                this.f6984e = true;
            } else {
                wu1.m19207f(r842.f13546e[i4] == null);
            }
            i4++;
        }
    }

    /* renamed from: c */
    public final long mo7420c() {
        if (!this.f6983d) {
            return this.f6985f.f7877b;
        }
        long a = this.f6984e ? this.f6980a.mo6836a() : Long.MIN_VALUE;
        return a == Long.MIN_VALUE ? this.f6985f.f7880e : a;
    }

    /* renamed from: d */
    public final long mo7421d() {
        if (!this.f6983d) {
            return 0;
        }
        return this.f6980a.mo6837c();
    }

    /* renamed from: e */
    public final long mo7422e() {
        return this.f6994o;
    }

    /* renamed from: f */
    public final long mo7423f() {
        return this.f6985f.f7877b + this.f6994o;
    }

    /* renamed from: g */
    public final hm0 mo7424g() {
        return this.f6992m;
    }

    /* renamed from: h */
    public final fx3 mo7425h() {
        return this.f6991l;
    }

    /* renamed from: i */
    public final r84 mo7426i() {
        return this.f6993n;
    }

    /* renamed from: j */
    public final r84 mo7427j(float f, ei0 ei0) {
        r84 a = this.f6989j.mo9700a(this.f6988i, this.f6992m, this.f6985f.f7876a, ei0);
        for (w74 w74 : a.f13546e) {
        }
        return a;
    }

    /* renamed from: k */
    public final void mo7428k(long j) {
        wu1.m19207f(m9349u());
        this.f6980a.mo6838e(j - this.f6994o);
    }

    /* renamed from: l */
    public final void mo7429l(float f, ei0 ei0) {
        this.f6983d = true;
        this.f6992m = this.f6980a.mo7244d();
        r84 j = mo7427j(f, ei0);
        gx3 gx3 = this.f6985f;
        long j2 = gx3.f7877b;
        long j3 = gx3.f7880e;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0, j3 - 1);
        }
        long a = mo7418a(j, j2, false);
        long j4 = this.f6994o;
        gx3 gx32 = this.f6985f;
        this.f6994o = j4 + (gx32.f7877b - a);
        this.f6985f = gx32.mo7729b(a);
    }

    /* renamed from: m */
    public final void mo7430m(long j) {
        wu1.m19207f(m9349u());
        if (this.f6983d) {
            this.f6980a.mo6839f(j - this.f6994o);
        }
    }

    /* renamed from: n */
    public final void mo7431n() {
        m9347s();
        qx3 qx3 = this.f6990k;
        r54 r54 = this.f6980a;
        try {
            if (r54 instanceof z44) {
                qx3.mo10433h(((z44) r54).f18027f);
            } else {
                qx3.mo10433h(r54);
            }
        } catch (RuntimeException e) {
            oc2.m14399a("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* renamed from: o */
    public final void mo7432o(fx3 fx3) {
        if (fx3 != this.f6991l) {
            m9347s();
            this.f6991l = fx3;
            m9348t();
        }
    }

    /* renamed from: p */
    public final void mo7433p(long j) {
        this.f6994o = 0;
    }

    /* renamed from: q */
    public final void mo7434q() {
        r54 r54 = this.f6980a;
        if (r54 instanceof z44) {
            long j = this.f6985f.f7879d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((z44) r54).mo12146m(0, j);
        }
    }

    /* renamed from: r */
    public final boolean mo7435r() {
        return this.f6983d && (!this.f6984e || this.f6980a.mo6836a() == Long.MIN_VALUE);
    }
}
