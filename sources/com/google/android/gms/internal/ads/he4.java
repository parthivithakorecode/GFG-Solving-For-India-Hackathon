package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public final class he4 implements oc4 {

    /* renamed from: n */
    public static final vc4 f8179n = ge4.f7409b;

    /* renamed from: a */
    private final byte[] f8180a = new byte[42];

    /* renamed from: b */
    private final dr2 f8181b = new dr2(new byte[32768], 0);

    /* renamed from: c */
    private final wc4 f8182c = new wc4();

    /* renamed from: d */
    private rc4 f8183d;

    /* renamed from: e */
    private td4 f8184e;

    /* renamed from: f */
    private int f8185f = 0;

    /* renamed from: g */
    private c91 f8186g;

    /* renamed from: h */
    private dd4 f8187h;

    /* renamed from: i */
    private int f8188i;

    /* renamed from: j */
    private int f8189j;

    /* renamed from: k */
    private fe4 f8190k;

    /* renamed from: l */
    private int f8191l;

    /* renamed from: m */
    private long f8192m;

    public he4(int i) {
    }

    /* renamed from: a */
    private final long m10533a(dr2 dr2, boolean z) {
        boolean z2;
        Objects.requireNonNull(this.f8187h);
        int k = dr2.mo6585k();
        while (true) {
            if (k <= dr2.mo6586l() - 16) {
                dr2.mo6580f(k);
                if (xc4.m19455c(dr2, this.f8187h, this.f8189j, this.f8182c)) {
                    break;
                }
                k++;
            } else if (z) {
                while (k <= dr2.mo6586l() - this.f8188i) {
                    dr2.mo6580f(k);
                    try {
                        z2 = xc4.m19455c(dr2, this.f8187h, this.f8189j, this.f8182c);
                    } catch (IndexOutOfBoundsException unused) {
                        z2 = false;
                    }
                    if (dr2.mo6585k() > dr2.mo6586l() || !z2) {
                        k++;
                    }
                }
                dr2.mo6580f(dr2.mo6586l());
                return -1;
            } else {
                dr2.mo6580f(k);
                return -1;
            }
        }
        dr2.mo6580f(k);
        return this.f8182c.f16785a;
    }

    /* renamed from: b */
    private final void m10534b() {
        long j = this.f8192m;
        dd4 dd4 = this.f8187h;
        int i = n13.f11236a;
        this.f8184e.mo7872a((j * 1000000) / ((long) dd4.f5766e), 1, this.f8191l, 0, (sd4) null);
    }

    /* renamed from: c */
    public final boolean mo5040c(pc4 pc4) {
        ad4.m6032a(pc4, false);
        dr2 dr2 = new dr2(4);
        ((jc4) pc4).mo6917n(dr2.mo6582h(), 0, 4, false);
        return dr2.mo6567A() == 1716281667;
    }

    /* renamed from: e */
    public final int mo5042e(pc4 pc4, md4 md4) {
        boolean l;
        dd4 dd4;
        dd4 e;
        pd4 pd4;
        pc4 pc42 = pc4;
        int i = this.f8185f;
        boolean z = true;
        if (i == 0) {
            pc4.mo6914i();
            long g = pc4.mo6913g();
            c91 a = ad4.m6032a(pc42, true);
            ((jc4) pc42).mo8447p((int) (pc4.mo6913g() - g), false);
            this.f8186g = a;
            this.f8185f = 1;
            return 0;
        } else if (i == 1) {
            ((jc4) pc42).mo6917n(this.f8180a, 0, 42, false);
            pc4.mo6914i();
            this.f8185f = 2;
            return 0;
        } else if (i == 2) {
            dr2 dr2 = new dr2(4);
            ((jc4) pc42).mo6916m(dr2.mo6582h(), 0, 4, false);
            if (dr2.mo6567A() == 1716281667) {
                this.f8185f = 3;
                return 0;
            }
            throw C1646dz.m8223a("Failed to read FLAC stream marker.", (Throwable) null);
        } else if (i == 3) {
            yc4 yc4 = new yc4(this.f8187h);
            do {
                pc4.mo6914i();
                cq2 cq2 = new cq2(new byte[4], 4);
                jc4 jc4 = (jc4) pc42;
                jc4.mo6917n(cq2.f5494a, 0, 4, false);
                l = cq2.mo6271l();
                int c = cq2.mo6262c(7);
                int c2 = cq2.mo6262c(24) + 4;
                if (c == 0) {
                    byte[] bArr = new byte[38];
                    jc4.mo6916m(bArr, 0, 38, false);
                    e = new dd4(bArr, 4);
                } else {
                    dd4 dd42 = yc4.f17674a;
                    if (dd42 == null) {
                        throw new IllegalArgumentException();
                    } else if (c == 3) {
                        dr2 dr22 = new dr2(c2);
                        jc4.mo6916m(dr22.mo6582h(), 0, c2, false);
                        e = dd42.mo6458f(ad4.m6033b(dr22));
                    } else if (c == 4) {
                        dr2 dr23 = new dr2(c2);
                        jc4.mo6916m(dr23.mo6582h(), 0, c2, false);
                        dr23.mo6581g(4);
                        e = dd42.mo6459g(Arrays.asList(yd4.m19981b(dr23, false, false).f16174b));
                    } else if (c == 6) {
                        dr2 dr24 = new dr2(c2);
                        jc4.mo6916m(dr24.mo6582h(), 0, c2, false);
                        dr24.mo6581g(4);
                        int m = dr24.mo6587m();
                        String F = dr24.mo6572F(dr24.mo6587m(), c43.f5302a);
                        String F2 = dr24.mo6572F(dr24.mo6587m(), c43.f5304c);
                        int m2 = dr24.mo6587m();
                        int m3 = dr24.mo6587m();
                        int m4 = dr24.mo6587m();
                        int m5 = dr24.mo6587m();
                        int m6 = dr24.mo6587m();
                        byte[] bArr2 = new byte[m6];
                        dr24.mo6576b(bArr2, 0, m6);
                        e = dd42.mo6457e(Collections.singletonList(new af4(m, F, F2, m2, m3, m4, m5, bArr2)));
                    } else {
                        jc4.mo8447p(c2, false);
                        dd4 = yc4.f17674a;
                        int i2 = n13.f11236a;
                        this.f8187h = dd4;
                    }
                }
                yc4.f17674a = e;
                dd4 = yc4.f17674a;
                int i22 = n13.f11236a;
                this.f8187h = dd4;
            } while (!l);
            Objects.requireNonNull(dd4);
            this.f8188i = Math.max(dd4.f5764c, 6);
            this.f8184e.mo7873b(this.f8187h.mo6455c(this.f8180a, this.f8186g));
            this.f8185f = 4;
            return 0;
        } else if (i != 4) {
            Objects.requireNonNull(this.f8184e);
            Objects.requireNonNull(this.f8187h);
            fe4 fe4 = this.f8190k;
            if (fe4 != null && fe4.mo7299e()) {
                return this.f8190k.mo7295a(pc42, md4);
            }
            if (this.f8192m == -1) {
                this.f8192m = xc4.m19454b(pc42, this.f8187h);
                return 0;
            }
            int l2 = this.f8181b.mo6586l();
            if (l2 < 32768) {
                int a2 = pc42.mo5752a(this.f8181b.mo6582h(), l2, 32768 - l2);
                if (a2 != -1) {
                    z = false;
                }
                if (!z) {
                    this.f8181b.mo6579e(l2 + a2);
                } else if (this.f8181b.mo6583i() == 0) {
                    m10534b();
                    return -1;
                }
            } else {
                z = false;
            }
            int k = this.f8181b.mo6585k();
            int i3 = this.f8191l;
            int i4 = this.f8188i;
            if (i3 < i4) {
                dr2 dr25 = this.f8181b;
                dr25.mo6581g(Math.min(i4 - i3, dr25.mo6583i()));
            }
            long a3 = m10533a(this.f8181b, z);
            int k2 = this.f8181b.mo6585k() - k;
            this.f8181b.mo6580f(k);
            rd4.m16162b(this.f8184e, this.f8181b, k2);
            this.f8191l += k2;
            if (a3 != -1) {
                m10534b();
                this.f8191l = 0;
                this.f8192m = a3;
            }
            if (this.f8181b.mo6583i() >= 16) {
                return 0;
            }
            int i5 = this.f8181b.mo6583i();
            System.arraycopy(this.f8181b.mo6582h(), this.f8181b.mo6585k(), this.f8181b.mo6582h(), 0, i5);
            this.f8181b.mo6580f(0);
            this.f8181b.mo6579e(i5);
            return 0;
        } else {
            pc4.mo6914i();
            dr2 dr26 = new dr2(2);
            ((jc4) pc42).mo6917n(dr26.mo6582h(), 0, 2, false);
            int w = dr26.mo6597w();
            int i6 = w >> 2;
            pc4.mo6914i();
            if (i6 == 16382) {
                this.f8189j = w;
                rc4 rc4 = this.f8183d;
                int i7 = n13.f11236a;
                long b = pc4.mo6908b();
                long c3 = pc4.mo6909c();
                dd4 dd43 = this.f8187h;
                Objects.requireNonNull(dd43);
                if (dd43.f5772k != null) {
                    pd4 = new bd4(dd43, b);
                } else if (c3 == -1 || dd43.f5771j <= 0) {
                    pd4 = new od4(dd43.mo6453a(), 0);
                } else {
                    fe4 fe42 = new fe4(dd43, this.f8189j, b, c3);
                    this.f8190k = fe42;
                    pd4 = fe42.mo7296b();
                }
                rc4.mo10269p(pd4);
                this.f8185f = 5;
                return 0;
            }
            throw C1646dz.m8223a("First frame does not start with sync code.", (Throwable) null);
        }
    }

    /* renamed from: g */
    public final void mo5044g(rc4 rc4) {
        this.f8183d = rc4;
        this.f8184e = rc4.mo10270r(0, 1);
        rc4.mo10268G();
    }

    /* renamed from: h */
    public final void mo5045h(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.f8185f = 0;
        } else {
            fe4 fe4 = this.f8190k;
            if (fe4 != null) {
                fe4.mo7298d(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.f8192m = j3;
        this.f8191l = 0;
        this.f8181b.mo6577c(0);
    }
}
