package com.google.android.gms.internal.ads;

import java.util.List;

final class dp3 implements wr3 {

    /* renamed from: a */
    private final cp3 f5863a;

    /* renamed from: b */
    private int f5864b;

    /* renamed from: c */
    private int f5865c;

    /* renamed from: d */
    private int f5866d = 0;

    private dp3(cp3 cp3) {
        kq3.m12305f(cp3, "input");
        this.f5863a = cp3;
        cp3.f5490c = this;
    }

    /* renamed from: M */
    private final <T> T m7942M(es3<T> es3, mp3 mp3) {
        int i = this.f5865c;
        this.f5865c = ((this.f5864b >>> 3) << 3) | 4;
        try {
            T b = es3.mo7062b();
            es3.mo7065e(b, this, mp3);
            es3.mo7064d(b);
            if (this.f5864b == this.f5865c) {
                return b;
            }
            throw mq3.m13457g();
        } finally {
            this.f5865c = i;
        }
    }

    /* renamed from: N */
    private final <T> T m7943N(es3<T> es3, mp3 mp3) {
        int r = this.f5863a.mo5379r();
        cp3 cp3 = this.f5863a;
        if (cp3.f5488a < cp3.f5489b) {
            int k = cp3.mo5372k(r);
            T b = es3.mo7062b();
            this.f5863a.f5488a++;
            es3.mo7065e(b, this, mp3);
            es3.mo7064d(b);
            this.f5863a.mo5357A(0);
            cp3 cp32 = this.f5863a;
            cp32.f5488a--;
            cp32.mo5365a(k);
            return b;
        }
        throw new mq3("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: P */
    private final void m7944P(int i) {
        if (this.f5863a.mo5371j() != i) {
            throw mq3.m13459j();
        }
    }

    /* renamed from: Q */
    private final void m7945Q(int i) {
        if ((this.f5864b & 7) != i) {
            throw mq3.m13451a();
        }
    }

    /* renamed from: R */
    private static final void m7946R(int i) {
        if ((i & 3) != 0) {
            throw mq3.m13457g();
        }
    }

    /* renamed from: S */
    private static final void m7947S(int i) {
        if ((i & 7) != 0) {
            throw mq3.m13457g();
        }
    }

    /* renamed from: T */
    public static dp3 m7948T(cp3 cp3) {
        dp3 dp3 = cp3.f5490c;
        return dp3 != null ? dp3 : new dp3(cp3);
    }

    /* renamed from: A */
    public final void mo6524A(List<uo3> list) {
        int q;
        if ((this.f5864b & 7) == 2) {
            do {
                list.add(mo6548l());
                if (!this.f5863a.mo5366b()) {
                    q = this.f5863a.mo5378q();
                } else {
                    return;
                }
            } while (q == this.f5864b);
            this.f5866d = q;
            return;
        }
        throw mq3.m13451a();
    }

    /* renamed from: B */
    public final void mo6525B(List<Integer> list) {
        int q;
        int q2;
        if (list instanceof bq3) {
            bq3 bq3 = (bq3) list;
            int i = this.f5864b & 7;
            if (i == 0) {
                do {
                    bq3.mo5918N(this.f5863a.mo5375n());
                    if (!this.f5863a.mo5366b()) {
                        q2 = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q2 == this.f5864b);
                this.f5866d = q2;
            } else if (i == 2) {
                int j = this.f5863a.mo5371j() + this.f5863a.mo5379r();
                do {
                    bq3.mo5918N(this.f5863a.mo5375n());
                } while (this.f5863a.mo5371j() < j);
                m7944P(j);
            } else {
                throw mq3.m13451a();
            }
        } else {
            int i2 = this.f5864b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5863a.mo5375n()));
                    if (!this.f5863a.mo5366b()) {
                        q = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q == this.f5864b);
                this.f5866d = q;
            } else if (i2 == 2) {
                int j2 = this.f5863a.mo5371j() + this.f5863a.mo5379r();
                do {
                    list.add(Integer.valueOf(this.f5863a.mo5375n()));
                } while (this.f5863a.mo5371j() < j2);
                m7944P(j2);
            } else {
                throw mq3.m13451a();
            }
        }
    }

    /* renamed from: C */
    public final <T> void mo6526C(List<T> list, es3<T> es3, mp3 mp3) {
        int q;
        int i = this.f5864b;
        if ((i & 7) == 3) {
            do {
                list.add(m7942M(es3, mp3));
                if (!this.f5863a.mo5366b() && this.f5866d == 0) {
                    q = this.f5863a.mo5378q();
                } else {
                    return;
                }
            } while (q == i);
            this.f5866d = q;
            return;
        }
        throw mq3.m13451a();
    }

    /* renamed from: D */
    public final <T> T mo6527D(es3<T> es3, mp3 mp3) {
        m7945Q(2);
        return m7943N(es3, mp3);
    }

    /* renamed from: E */
    public final void mo6528E(List<Integer> list) {
        int q;
        int q2;
        if (list instanceof bq3) {
            bq3 bq3 = (bq3) list;
            int i = this.f5864b & 7;
            if (i == 0) {
                do {
                    bq3.mo5918N(this.f5863a.mo5379r());
                    if (!this.f5863a.mo5366b()) {
                        q2 = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q2 == this.f5864b);
                this.f5866d = q2;
            } else if (i == 2) {
                int j = this.f5863a.mo5371j() + this.f5863a.mo5379r();
                do {
                    bq3.mo5918N(this.f5863a.mo5379r());
                } while (this.f5863a.mo5371j() < j);
                m7944P(j);
            } else {
                throw mq3.m13451a();
            }
        } else {
            int i2 = this.f5864b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5863a.mo5379r()));
                    if (!this.f5863a.mo5366b()) {
                        q = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q == this.f5864b);
                this.f5866d = q;
            } else if (i2 == 2) {
                int j2 = this.f5863a.mo5371j() + this.f5863a.mo5379r();
                do {
                    list.add(Integer.valueOf(this.f5863a.mo5379r()));
                } while (this.f5863a.mo5371j() < j2);
                m7944P(j2);
            } else {
                throw mq3.m13451a();
            }
        }
    }

    /* renamed from: F */
    public final void mo6529F(List<Long> list) {
        int q;
        int q2;
        if (list instanceof zq3) {
            zq3 zq3 = (zq3) list;
            int i = this.f5864b & 7;
            if (i == 1) {
                do {
                    zq3.mo12260k(this.f5863a.mo5382u());
                    if (!this.f5863a.mo5366b()) {
                        q2 = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q2 == this.f5864b);
                this.f5866d = q2;
            } else if (i == 2) {
                int r = this.f5863a.mo5379r();
                m7947S(r);
                int j = this.f5863a.mo5371j() + r;
                do {
                    zq3.mo12260k(this.f5863a.mo5382u());
                } while (this.f5863a.mo5371j() < j);
            } else {
                throw mq3.m13451a();
            }
        } else {
            int i2 = this.f5864b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f5863a.mo5382u()));
                    if (!this.f5863a.mo5366b()) {
                        q = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q == this.f5864b);
                this.f5866d = q;
            } else if (i2 == 2) {
                int r2 = this.f5863a.mo5379r();
                m7947S(r2);
                int j2 = this.f5863a.mo5371j() + r2;
                do {
                    list.add(Long.valueOf(this.f5863a.mo5382u()));
                } while (this.f5863a.mo5371j() < j2);
            } else {
                throw mq3.m13451a();
            }
        }
    }

    /* renamed from: G */
    public final void mo6530G(List<Boolean> list) {
        int q;
        int q2;
        if (list instanceof go3) {
            go3 go3 = (go3) list;
            int i = this.f5864b & 7;
            if (i == 0) {
                do {
                    go3.mo7667i(this.f5863a.mo5367c());
                    if (!this.f5863a.mo5366b()) {
                        q2 = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q2 == this.f5864b);
                this.f5866d = q2;
            } else if (i == 2) {
                int j = this.f5863a.mo5371j() + this.f5863a.mo5379r();
                do {
                    go3.mo7667i(this.f5863a.mo5367c());
                } while (this.f5863a.mo5371j() < j);
                m7944P(j);
            } else {
                throw mq3.m13451a();
            }
        } else {
            int i2 = this.f5864b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f5863a.mo5367c()));
                    if (!this.f5863a.mo5366b()) {
                        q = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q == this.f5864b);
                this.f5866d = q;
            } else if (i2 == 2) {
                int j2 = this.f5863a.mo5371j() + this.f5863a.mo5379r();
                do {
                    list.add(Boolean.valueOf(this.f5863a.mo5367c()));
                } while (this.f5863a.mo5371j() < j2);
                m7944P(j2);
            } else {
                throw mq3.m13451a();
            }
        }
    }

    /* renamed from: H */
    public final void mo6531H(List<Integer> list) {
        int q;
        int q2;
        if (list instanceof bq3) {
            bq3 bq3 = (bq3) list;
            int i = this.f5864b & 7;
            if (i == 2) {
                int r = this.f5863a.mo5379r();
                m7946R(r);
                int j = this.f5863a.mo5371j() + r;
                do {
                    bq3.mo5918N(this.f5863a.mo5376o());
                } while (this.f5863a.mo5371j() < j);
            } else if (i == 5) {
                do {
                    bq3.mo5918N(this.f5863a.mo5376o());
                    if (!this.f5863a.mo5366b()) {
                        q2 = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q2 == this.f5864b);
                this.f5866d = q2;
            } else {
                throw mq3.m13451a();
            }
        } else {
            int i2 = this.f5864b & 7;
            if (i2 == 2) {
                int r2 = this.f5863a.mo5379r();
                m7946R(r2);
                int j2 = this.f5863a.mo5371j() + r2;
                do {
                    list.add(Integer.valueOf(this.f5863a.mo5376o()));
                } while (this.f5863a.mo5371j() < j2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f5863a.mo5376o()));
                    if (!this.f5863a.mo5366b()) {
                        q = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q == this.f5864b);
                this.f5866d = q;
            } else {
                throw mq3.m13451a();
            }
        }
    }

    /* renamed from: I */
    public final <T> T mo6532I(es3<T> es3, mp3 mp3) {
        m7945Q(3);
        return m7942M(es3, mp3);
    }

    /* renamed from: J */
    public final void mo6533J(List<Integer> list) {
        int q;
        int q2;
        if (list instanceof bq3) {
            bq3 bq3 = (bq3) list;
            int i = this.f5864b & 7;
            if (i == 2) {
                int r = this.f5863a.mo5379r();
                m7946R(r);
                int j = this.f5863a.mo5371j() + r;
                do {
                    bq3.mo5918N(this.f5863a.mo5374m());
                } while (this.f5863a.mo5371j() < j);
            } else if (i == 5) {
                do {
                    bq3.mo5918N(this.f5863a.mo5374m());
                    if (!this.f5863a.mo5366b()) {
                        q2 = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q2 == this.f5864b);
                this.f5866d = q2;
            } else {
                throw mq3.m13451a();
            }
        } else {
            int i2 = this.f5864b & 7;
            if (i2 == 2) {
                int r2 = this.f5863a.mo5379r();
                m7946R(r2);
                int j2 = this.f5863a.mo5371j() + r2;
                do {
                    list.add(Integer.valueOf(this.f5863a.mo5374m()));
                } while (this.f5863a.mo5371j() < j2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f5863a.mo5374m()));
                    if (!this.f5863a.mo5366b()) {
                        q = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q == this.f5864b);
                this.f5866d = q;
            } else {
                throw mq3.m13451a();
            }
        }
    }

    /* renamed from: K */
    public final void mo6534K(List<Float> list) {
        int q;
        int q2;
        if (list instanceof up3) {
            up3 up3 = (up3) list;
            int i = this.f5864b & 7;
            if (i == 2) {
                int r = this.f5863a.mo5379r();
                m7946R(r);
                int j = this.f5863a.mo5371j() + r;
                do {
                    up3.mo11279i(this.f5863a.mo5370i());
                } while (this.f5863a.mo5371j() < j);
            } else if (i == 5) {
                do {
                    up3.mo11279i(this.f5863a.mo5370i());
                    if (!this.f5863a.mo5366b()) {
                        q2 = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q2 == this.f5864b);
                this.f5866d = q2;
            } else {
                throw mq3.m13451a();
            }
        } else {
            int i2 = this.f5864b & 7;
            if (i2 == 2) {
                int r2 = this.f5863a.mo5379r();
                m7946R(r2);
                int j2 = this.f5863a.mo5371j() + r2;
                do {
                    list.add(Float.valueOf(this.f5863a.mo5370i()));
                } while (this.f5863a.mo5371j() < j2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f5863a.mo5370i()));
                    if (!this.f5863a.mo5366b()) {
                        q = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q == this.f5864b);
                this.f5866d = q;
            } else {
                throw mq3.m13451a();
            }
        }
    }

    /* renamed from: L */
    public final void mo6535L(List<String> list, boolean z) {
        int q;
        int q2;
        if ((this.f5864b & 7) != 2) {
            throw mq3.m13451a();
        } else if ((list instanceof sq3) && !z) {
            sq3 sq3 = (sq3) list;
            do {
                sq3.mo5949g(mo6548l());
                if (!this.f5863a.mo5366b()) {
                    q2 = this.f5863a.mo5378q();
                } else {
                    return;
                }
            } while (q2 == this.f5864b);
            this.f5866d = q2;
        } else {
            do {
                list.add(z ? mo6561y() : mo6553q());
                if (!this.f5863a.mo5366b()) {
                    q = this.f5863a.mo5378q();
                } else {
                    return;
                }
            } while (q == this.f5864b);
            this.f5866d = q;
        }
    }

    /* renamed from: O */
    public final boolean mo6536O() {
        m7945Q(0);
        return this.f5863a.mo5367c();
    }

    /* renamed from: a */
    public final float mo6537a() {
        m7945Q(5);
        return this.f5863a.mo5370i();
    }

    /* renamed from: b */
    public final int mo6538b() {
        m7945Q(0);
        return this.f5863a.mo5373l();
    }

    /* renamed from: c */
    public final int mo6539c() {
        int i = this.f5866d;
        if (i != 0) {
            this.f5864b = i;
            this.f5866d = 0;
        } else {
            i = this.f5863a.mo5378q();
            this.f5864b = i;
        }
        if (i == 0 || i == this.f5865c) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    /* renamed from: d */
    public final int mo6540d() {
        m7945Q(5);
        return this.f5863a.mo5374m();
    }

    /* renamed from: e */
    public final int mo6541e() {
        m7945Q(0);
        return this.f5863a.mo5375n();
    }

    /* renamed from: f */
    public final int mo6542f() {
        m7945Q(5);
        return this.f5863a.mo5376o();
    }

    /* renamed from: g */
    public final int mo6543g() {
        return this.f5864b;
    }

    /* renamed from: h */
    public final int mo6544h() {
        m7945Q(0);
        return this.f5863a.mo5377p();
    }

    /* renamed from: i */
    public final int mo6545i() {
        m7945Q(0);
        return this.f5863a.mo5379r();
    }

    /* renamed from: j */
    public final long mo6546j() {
        m7945Q(1);
        return this.f5863a.mo5380s();
    }

    /* renamed from: k */
    public final long mo6547k() {
        m7945Q(0);
        return this.f5863a.mo5381t();
    }

    /* renamed from: l */
    public final uo3 mo6548l() {
        m7945Q(2);
        return this.f5863a.mo5385x();
    }

    /* renamed from: m */
    public final long mo6549m() {
        m7945Q(0);
        return this.f5863a.mo5383v();
    }

    /* renamed from: n */
    public final long mo6550n() {
        m7945Q(0);
        return this.f5863a.mo5384w();
    }

    /* renamed from: o */
    public final long mo6551o() {
        m7945Q(1);
        return this.f5863a.mo5382u();
    }

    /* renamed from: p */
    public final void mo6552p(List<Long> list) {
        int q;
        int q2;
        if (list instanceof zq3) {
            zq3 zq3 = (zq3) list;
            int i = this.f5864b & 7;
            if (i == 0) {
                do {
                    zq3.mo12260k(this.f5863a.mo5383v());
                    if (!this.f5863a.mo5366b()) {
                        q2 = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q2 == this.f5864b);
                this.f5866d = q2;
            } else if (i == 2) {
                int j = this.f5863a.mo5371j() + this.f5863a.mo5379r();
                do {
                    zq3.mo12260k(this.f5863a.mo5383v());
                } while (this.f5863a.mo5371j() < j);
                m7944P(j);
            } else {
                throw mq3.m13451a();
            }
        } else {
            int i2 = this.f5864b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f5863a.mo5383v()));
                    if (!this.f5863a.mo5366b()) {
                        q = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q == this.f5864b);
                this.f5866d = q;
            } else if (i2 == 2) {
                int j2 = this.f5863a.mo5371j() + this.f5863a.mo5379r();
                do {
                    list.add(Long.valueOf(this.f5863a.mo5383v()));
                } while (this.f5863a.mo5371j() < j2);
                m7944P(j2);
            } else {
                throw mq3.m13451a();
            }
        }
    }

    /* renamed from: q */
    public final String mo6553q() {
        m7945Q(2);
        return this.f5863a.mo5386y();
    }

    /* renamed from: r */
    public final void mo6554r(List<Integer> list) {
        int q;
        int q2;
        if (list instanceof bq3) {
            bq3 bq3 = (bq3) list;
            int i = this.f5864b & 7;
            if (i == 0) {
                do {
                    bq3.mo5918N(this.f5863a.mo5373l());
                    if (!this.f5863a.mo5366b()) {
                        q2 = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q2 == this.f5864b);
                this.f5866d = q2;
            } else if (i == 2) {
                int j = this.f5863a.mo5371j() + this.f5863a.mo5379r();
                do {
                    bq3.mo5918N(this.f5863a.mo5373l());
                } while (this.f5863a.mo5371j() < j);
                m7944P(j);
            } else {
                throw mq3.m13451a();
            }
        } else {
            int i2 = this.f5864b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5863a.mo5373l()));
                    if (!this.f5863a.mo5366b()) {
                        q = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q == this.f5864b);
                this.f5866d = q;
            } else if (i2 == 2) {
                int j2 = this.f5863a.mo5371j() + this.f5863a.mo5379r();
                do {
                    list.add(Integer.valueOf(this.f5863a.mo5373l()));
                } while (this.f5863a.mo5371j() < j2);
                m7944P(j2);
            } else {
                throw mq3.m13451a();
            }
        }
    }

    /* renamed from: s */
    public final <T> void mo6555s(List<T> list, es3<T> es3, mp3 mp3) {
        int q;
        int i = this.f5864b;
        if ((i & 7) == 2) {
            do {
                list.add(m7943N(es3, mp3));
                if (!this.f5863a.mo5366b() && this.f5866d == 0) {
                    q = this.f5863a.mo5378q();
                } else {
                    return;
                }
            } while (q == i);
            this.f5866d = q;
            return;
        }
        throw mq3.m13451a();
    }

    /* renamed from: t */
    public final void mo6556t(List<Long> list) {
        int q;
        int q2;
        if (list instanceof zq3) {
            zq3 zq3 = (zq3) list;
            int i = this.f5864b & 7;
            if (i == 0) {
                do {
                    zq3.mo12260k(this.f5863a.mo5381t());
                    if (!this.f5863a.mo5366b()) {
                        q2 = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q2 == this.f5864b);
                this.f5866d = q2;
            } else if (i == 2) {
                int j = this.f5863a.mo5371j() + this.f5863a.mo5379r();
                do {
                    zq3.mo12260k(this.f5863a.mo5381t());
                } while (this.f5863a.mo5371j() < j);
                m7944P(j);
            } else {
                throw mq3.m13451a();
            }
        } else {
            int i2 = this.f5864b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f5863a.mo5381t()));
                    if (!this.f5863a.mo5366b()) {
                        q = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q == this.f5864b);
                this.f5866d = q;
            } else if (i2 == 2) {
                int j2 = this.f5863a.mo5371j() + this.f5863a.mo5379r();
                do {
                    list.add(Long.valueOf(this.f5863a.mo5381t()));
                } while (this.f5863a.mo5371j() < j2);
                m7944P(j2);
            } else {
                throw mq3.m13451a();
            }
        }
    }

    /* renamed from: u */
    public final boolean mo6557u() {
        int i;
        if (this.f5863a.mo5366b() || (i = this.f5864b) == this.f5865c) {
            return false;
        }
        return this.f5863a.mo5368d(i);
    }

    /* renamed from: v */
    public final void mo6558v(List<Long> list) {
        int q;
        int q2;
        if (list instanceof zq3) {
            zq3 zq3 = (zq3) list;
            int i = this.f5864b & 7;
            if (i == 1) {
                do {
                    zq3.mo12260k(this.f5863a.mo5380s());
                    if (!this.f5863a.mo5366b()) {
                        q2 = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q2 == this.f5864b);
                this.f5866d = q2;
            } else if (i == 2) {
                int r = this.f5863a.mo5379r();
                m7947S(r);
                int j = this.f5863a.mo5371j() + r;
                do {
                    zq3.mo12260k(this.f5863a.mo5380s());
                } while (this.f5863a.mo5371j() < j);
            } else {
                throw mq3.m13451a();
            }
        } else {
            int i2 = this.f5864b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f5863a.mo5380s()));
                    if (!this.f5863a.mo5366b()) {
                        q = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q == this.f5864b);
                this.f5866d = q;
            } else if (i2 == 2) {
                int r2 = this.f5863a.mo5379r();
                m7947S(r2);
                int j2 = this.f5863a.mo5371j() + r2;
                do {
                    list.add(Long.valueOf(this.f5863a.mo5380s()));
                } while (this.f5863a.mo5371j() < j2);
            } else {
                throw mq3.m13451a();
            }
        }
    }

    /* renamed from: w */
    public final void mo6559w(List<Long> list) {
        int q;
        int q2;
        if (list instanceof zq3) {
            zq3 zq3 = (zq3) list;
            int i = this.f5864b & 7;
            if (i == 0) {
                do {
                    zq3.mo12260k(this.f5863a.mo5384w());
                    if (!this.f5863a.mo5366b()) {
                        q2 = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q2 == this.f5864b);
                this.f5866d = q2;
            } else if (i == 2) {
                int j = this.f5863a.mo5371j() + this.f5863a.mo5379r();
                do {
                    zq3.mo12260k(this.f5863a.mo5384w());
                } while (this.f5863a.mo5371j() < j);
                m7944P(j);
            } else {
                throw mq3.m13451a();
            }
        } else {
            int i2 = this.f5864b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f5863a.mo5384w()));
                    if (!this.f5863a.mo5366b()) {
                        q = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q == this.f5864b);
                this.f5866d = q;
            } else if (i2 == 2) {
                int j2 = this.f5863a.mo5371j() + this.f5863a.mo5379r();
                do {
                    list.add(Long.valueOf(this.f5863a.mo5384w()));
                } while (this.f5863a.mo5371j() < j2);
                m7944P(j2);
            } else {
                throw mq3.m13451a();
            }
        }
    }

    /* renamed from: x */
    public final void mo6560x(List<Double> list) {
        int q;
        int q2;
        if (list instanceof jp3) {
            jp3 jp3 = (jp3) list;
            int i = this.f5864b & 7;
            if (i == 1) {
                do {
                    jp3.mo8509i(this.f5863a.mo5369h());
                    if (!this.f5863a.mo5366b()) {
                        q2 = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q2 == this.f5864b);
                this.f5866d = q2;
            } else if (i == 2) {
                int r = this.f5863a.mo5379r();
                m7947S(r);
                int j = this.f5863a.mo5371j() + r;
                do {
                    jp3.mo8509i(this.f5863a.mo5369h());
                } while (this.f5863a.mo5371j() < j);
            } else {
                throw mq3.m13451a();
            }
        } else {
            int i2 = this.f5864b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f5863a.mo5369h()));
                    if (!this.f5863a.mo5366b()) {
                        q = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q == this.f5864b);
                this.f5866d = q;
            } else if (i2 == 2) {
                int r2 = this.f5863a.mo5379r();
                m7947S(r2);
                int j2 = this.f5863a.mo5371j() + r2;
                do {
                    list.add(Double.valueOf(this.f5863a.mo5369h()));
                } while (this.f5863a.mo5371j() < j2);
            } else {
                throw mq3.m13451a();
            }
        }
    }

    /* renamed from: y */
    public final String mo6561y() {
        m7945Q(2);
        return this.f5863a.mo5387z();
    }

    /* renamed from: z */
    public final void mo6562z(List<Integer> list) {
        int q;
        int q2;
        if (list instanceof bq3) {
            bq3 bq3 = (bq3) list;
            int i = this.f5864b & 7;
            if (i == 0) {
                do {
                    bq3.mo5918N(this.f5863a.mo5377p());
                    if (!this.f5863a.mo5366b()) {
                        q2 = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q2 == this.f5864b);
                this.f5866d = q2;
            } else if (i == 2) {
                int j = this.f5863a.mo5371j() + this.f5863a.mo5379r();
                do {
                    bq3.mo5918N(this.f5863a.mo5377p());
                } while (this.f5863a.mo5371j() < j);
                m7944P(j);
            } else {
                throw mq3.m13451a();
            }
        } else {
            int i2 = this.f5864b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5863a.mo5377p()));
                    if (!this.f5863a.mo5366b()) {
                        q = this.f5863a.mo5378q();
                    } else {
                        return;
                    }
                } while (q == this.f5864b);
                this.f5866d = q;
            } else if (i2 == 2) {
                int j2 = this.f5863a.mo5371j() + this.f5863a.mo5379r();
                do {
                    list.add(Integer.valueOf(this.f5863a.mo5377p()));
                } while (this.f5863a.mo5371j() < j2);
                m7944P(j2);
            } else {
                throw mq3.m13451a();
            }
        }
    }

    public final double zza() {
        m7945Q(1);
        return this.f5863a.mo5369h();
    }
}
