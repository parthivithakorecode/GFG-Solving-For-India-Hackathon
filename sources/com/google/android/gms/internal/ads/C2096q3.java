package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.q3 */
final class C2096q3 implements ec4 {

    /* renamed from: a */
    private final ky2 f13042a;

    /* renamed from: b */
    private final dr2 f13043b = new dr2();

    /* synthetic */ C2096q3(ky2 ky2, C2059p3 p3Var) {
        this.f13042a = ky2;
    }

    /* renamed from: a */
    public final void mo6902a() {
        dr2 dr2 = this.f13043b;
        byte[] bArr = n13.f11241f;
        int length = bArr.length;
        dr2.mo6578d(bArr, 0);
    }

    /* renamed from: b */
    public final dc4 mo6903b(pc4 pc4, long j) {
        int h;
        long j2;
        long b = pc4.mo6908b();
        int min = (int) Math.min(20000, pc4.mo6909c() - b);
        this.f13043b.mo6577c(min);
        ((jc4) pc4).mo6917n(this.f13043b.mo6582h(), 0, min, false);
        dr2 dr2 = this.f13043b;
        int i = -1;
        int i2 = -1;
        long j3 = -9223372036854775807L;
        while (dr2.mo6583i() >= 4) {
            if (C2133r3.m16027h(dr2.mo6582h(), dr2.mo6585k()) != 442) {
                dr2.mo6581g(1);
            } else {
                dr2.mo6581g(4);
                long c = C2170s3.m16599c(dr2);
                if (c != -9223372036854775807L) {
                    long b2 = this.f13042a.mo8817b(c);
                    if (b2 > j) {
                        if (j3 == -9223372036854775807L) {
                            return dc4.m7820d(b2, b);
                        }
                        j2 = (long) i2;
                    } else if (100000 + b2 > j) {
                        j2 = (long) dr2.mo6585k();
                    } else {
                        i2 = dr2.mo6585k();
                        j3 = b2;
                    }
                    return dc4.m7821e(b + j2);
                }
                int l = dr2.mo6586l();
                if (dr2.mo6583i() >= 10) {
                    dr2.mo6581g(9);
                    int s = dr2.mo6593s() & 7;
                    if (dr2.mo6583i() >= s) {
                        dr2.mo6581g(s);
                        if (dr2.mo6583i() >= 4) {
                            if (C2133r3.m16027h(dr2.mo6582h(), dr2.mo6585k()) == 443) {
                                dr2.mo6581g(4);
                                int w = dr2.mo6597w();
                                if (dr2.mo6583i() >= w) {
                                    dr2.mo6581g(w);
                                }
                            }
                            while (true) {
                                if (dr2.mo6583i() < 4 || (h = C2133r3.m16027h(dr2.mo6582h(), dr2.mo6585k())) == 442 || h == 441 || (h >>> 8) != 1) {
                                    break;
                                }
                                dr2.mo6581g(4);
                                if (dr2.mo6583i() < 2) {
                                    break;
                                }
                                dr2.mo6580f(Math.min(dr2.mo6586l(), dr2.mo6585k() + dr2.mo6597w()));
                            }
                            i = dr2.mo6585k();
                        }
                    }
                }
                dr2.mo6580f(l);
                i = dr2.mo6585k();
            }
        }
        return j3 != -9223372036854775807L ? dc4.m7822f(j3, b + ((long) i)) : dc4.f5757d;
    }
}
