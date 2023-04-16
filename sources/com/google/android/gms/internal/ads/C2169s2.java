package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import p038f.C2591j;

/* renamed from: com.google.android.gms.internal.ads.s2 */
public final class C2169s2 implements C2317w2 {

    /* renamed from: v */
    private static final byte[] f14199v = {73, 68, 51};

    /* renamed from: a */
    private final boolean f14200a;

    /* renamed from: b */
    private final cq2 f14201b = new cq2(new byte[7], 7);

    /* renamed from: c */
    private final dr2 f14202c = new dr2(Arrays.copyOf(f14199v, 10));

    /* renamed from: d */
    private final String f14203d;

    /* renamed from: e */
    private String f14204e;

    /* renamed from: f */
    private td4 f14205f;

    /* renamed from: g */
    private td4 f14206g;

    /* renamed from: h */
    private int f14207h;

    /* renamed from: i */
    private int f14208i;

    /* renamed from: j */
    private int f14209j;

    /* renamed from: k */
    private boolean f14210k;

    /* renamed from: l */
    private boolean f14211l;

    /* renamed from: m */
    private int f14212m;

    /* renamed from: n */
    private int f14213n;

    /* renamed from: o */
    private int f14214o;

    /* renamed from: p */
    private boolean f14215p;

    /* renamed from: q */
    private long f14216q;

    /* renamed from: r */
    private int f14217r;

    /* renamed from: s */
    private long f14218s;

    /* renamed from: t */
    private td4 f14219t;

    /* renamed from: u */
    private long f14220u;

    public C2169s2(boolean z, String str) {
        m16574h();
        this.f14212m = -1;
        this.f14213n = -1;
        this.f14216q = -9223372036854775807L;
        this.f14218s = -9223372036854775807L;
        this.f14200a = z;
        this.f14203d = str;
    }

    /* renamed from: f */
    public static boolean m16572f(int i) {
        return (i & 65526) == 65520;
    }

    /* renamed from: g */
    private final void m16573g() {
        this.f14211l = false;
        m16574h();
    }

    /* renamed from: h */
    private final void m16574h() {
        this.f14207h = 0;
        this.f14208i = 0;
        this.f14209j = 256;
    }

    /* renamed from: i */
    private final void m16575i() {
        this.f14207h = 3;
        this.f14208i = 0;
    }

    /* renamed from: j */
    private final void m16576j(td4 td4, long j, int i, int i2) {
        this.f14207h = 4;
        this.f14208i = i;
        this.f14219t = td4;
        this.f14220u = j;
        this.f14217r = i2;
    }

    /* renamed from: k */
    private final boolean m16577k(dr2 dr2, byte[] bArr, int i) {
        int min = Math.min(dr2.mo6583i(), i - this.f14208i);
        dr2.mo6576b(bArr, this.f14208i, min);
        int i2 = this.f14208i + min;
        this.f14208i = i2;
        return i2 == i;
    }

    /* renamed from: l */
    private static final boolean m16578l(byte b, byte b2) {
        return m16572f((b2 & 255) | 65280);
    }

    /* renamed from: m */
    private static final boolean m16579m(dr2 dr2, byte[] bArr, int i) {
        if (dr2.mo6583i() < i) {
            return false;
        }
        dr2.mo6576b(bArr, 0, i);
        return true;
    }

    /* renamed from: a */
    public final void mo5638a(dr2 dr2) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        td4 td4;
        dr2 dr22 = dr2;
        Objects.requireNonNull(this.f14205f);
        int i5 = n13.f11236a;
        while (dr2.mo6583i() > 0) {
            int i6 = this.f14207h;
            int i7 = 13;
            int i8 = 2;
            if (i6 == 0) {
                byte[] h = dr2.mo6582h();
                int k = dr2.mo6585k();
                int l = dr2.mo6586l();
                while (k < l) {
                    int i9 = k + 1;
                    byte b = h[k] & 255;
                    if (this.f14209j == 512 && m16578l((byte) -1, (byte) b)) {
                        if (!this.f14211l) {
                            int i10 = i9 - 2;
                            dr22.mo6580f(i10 + 1);
                            if (m16579m(dr22, this.f14201b.f5494a, 1)) {
                                this.f14201b.mo6267h(4);
                                int c = this.f14201b.mo6262c(1);
                                int i11 = this.f14212m;
                                if (i11 == -1 || c == i11) {
                                    if (this.f14213n != -1) {
                                        if (m16579m(dr22, this.f14201b.f5494a, 1)) {
                                            this.f14201b.mo6267h(i8);
                                            if (this.f14201b.mo6262c(4) == this.f14213n) {
                                                dr22.mo6580f(i10 + 2);
                                            }
                                        }
                                    }
                                    if (m16579m(dr22, this.f14201b.f5494a, 4)) {
                                        this.f14201b.mo6267h(14);
                                        int c2 = this.f14201b.mo6262c(i7);
                                        if (c2 >= 7) {
                                            byte[] h2 = dr2.mo6582h();
                                            int l2 = dr2.mo6586l();
                                            int i12 = i10 + c2;
                                            if (i12 < l2) {
                                                if ((r8 = h2[i12]) != -1) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        this.f14214o = (b & 8) >> 3;
                        this.f14210k = 1 == ((b & 1) ^ 1);
                        if (!this.f14211l) {
                            this.f14207h = 1;
                            this.f14208i = 0;
                        } else {
                            m16575i();
                        }
                        dr22.mo6580f(i9);
                        break;
                    }
                    int i13 = this.f14209j;
                    byte b2 = i13 | b;
                    if (b2 == 329) {
                        i = 2;
                        i2 = 768;
                    } else if (b2 == 511) {
                        i = 2;
                        i2 = 512;
                    } else if (b2 != 836) {
                        if (b2 == 1075) {
                            this.f14207h = 2;
                            this.f14208i = 3;
                            this.f14217r = 0;
                            this.f14202c.mo6580f(0);
                            dr22.mo6580f(i9);
                            break;
                            break;
                        } else if (i13 != 256) {
                            this.f14209j = 256;
                            k = i9 - 1;
                            i7 = 13;
                            i8 = 2;
                        } else {
                            i = 2;
                            i8 = i;
                            k = i9;
                            i7 = 13;
                        }
                    } else {
                        i = 2;
                        i2 = 1024;
                    }
                    this.f14209j = i2;
                    i8 = i;
                    k = i9;
                    i7 = 13;
                }
                dr22.mo6580f(k);
            } else if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        int min = Math.min(dr2.mo6583i(), this.f14217r - this.f14208i);
                        this.f14219t.mo7876e(dr22, min);
                        int i14 = this.f14208i + min;
                        this.f14208i = i14;
                        int i15 = this.f14217r;
                        if (i14 == i15) {
                            long j2 = this.f14218s;
                            if (j2 != -9223372036854775807L) {
                                this.f14219t.mo7872a(j2, 1, i15, 0, (sd4) null);
                                this.f14218s += this.f14220u;
                            }
                            m16574h();
                        }
                    } else {
                        if (m16577k(dr22, this.f14201b.f5494a, true != this.f14210k ? 5 : 7)) {
                            this.f14201b.mo6267h(0);
                            if (!this.f14215p) {
                                int c3 = this.f14201b.mo6262c(2) + 1;
                                if (c3 != 2) {
                                    StringBuilder sb = new StringBuilder(61);
                                    sb.append("Detected audio object type: ");
                                    sb.append(c3);
                                    sb.append(", but assuming AAC LC.");
                                    Log.w("AdtsReader", sb.toString());
                                }
                                this.f14201b.mo6269j(5);
                                int c4 = this.f14201b.mo6262c(3);
                                int i16 = this.f14213n;
                                int i17 = qb4.f13123c;
                                byte[] bArr = {(byte) (((i16 >> 1) & 7) | 16), (byte) (((c4 << 3) & C2591j.f18729G0) | ((i16 << 7) & 128))};
                                pb4 a = qb4.m15554a(bArr);
                                bf4 bf4 = new bf4();
                                bf4.mo5830h(this.f14204e);
                                bf4.mo5842s("audio/mp4a-latm");
                                bf4.mo5827f0(a.f12599c);
                                bf4.mo5825e0(a.f12598b);
                                bf4.mo5843t(a.f12597a);
                                bf4.mo5832i(Collections.singletonList(bArr));
                                bf4.mo5834k(this.f14203d);
                                C1574c0 y = bf4.mo5848y();
                                this.f14216q = 1024000000 / ((long) y.f5248z);
                                this.f14205f.mo7873b(y);
                                this.f14215p = true;
                            } else {
                                this.f14201b.mo6269j(10);
                            }
                            this.f14201b.mo6269j(4);
                            int c5 = this.f14201b.mo6262c(13) - 7;
                            if (this.f14210k) {
                                c5 -= 2;
                            }
                            i3 = c5;
                            td4 = this.f14205f;
                            j = this.f14216q;
                            i4 = 0;
                        }
                    }
                } else if (m16577k(dr22, this.f14202c.mo6582h(), 10)) {
                    this.f14206g.mo7876e(this.f14202c, 10);
                    this.f14202c.mo6580f(6);
                    td4 = this.f14206g;
                    j = 0;
                    i4 = 10;
                    i3 = 10 + this.f14202c.mo6592r();
                }
                m16576j(td4, j, i4, i3);
            } else if (dr2.mo6583i() != 0) {
                this.f14201b.f5494a[0] = dr2.mo6582h()[dr2.mo6585k()];
                this.f14201b.mo6267h(2);
                int c6 = this.f14201b.mo6262c(4);
                int i18 = this.f14213n;
                if (i18 == -1 || c6 == i18) {
                    if (!this.f14211l) {
                        this.f14211l = true;
                        this.f14212m = this.f14214o;
                        this.f14213n = c6;
                    }
                    m16575i();
                } else {
                    m16573g();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo5639b() {
        this.f14218s = -9223372036854775807L;
        m16573g();
    }

    /* renamed from: c */
    public final void mo5640c() {
    }

    /* renamed from: d */
    public final void mo5641d(rc4 rc4, C1875k4 k4Var) {
        k4Var.mo8612c();
        this.f14204e = k4Var.mo8611b();
        td4 r = rc4.mo10270r(k4Var.mo8610a(), 1);
        this.f14205f = r;
        this.f14219t = r;
        if (this.f14200a) {
            k4Var.mo8612c();
            td4 r2 = rc4.mo10270r(k4Var.mo8610a(), 5);
            this.f14206g = r2;
            bf4 bf4 = new bf4();
            bf4.mo5830h(k4Var.mo8611b());
            bf4.mo5842s("application/id3");
            r2.mo7873b(bf4.mo5848y());
            return;
        }
        this.f14206g = new nc4();
    }

    /* renamed from: e */
    public final void mo5642e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f14218s = j;
        }
    }
}
