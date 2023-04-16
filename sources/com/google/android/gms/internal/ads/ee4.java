package com.google.android.gms.internal.ads;

final class ee4 implements ec4 {

    /* renamed from: a */
    private final dd4 f6191a;

    /* renamed from: b */
    private final int f6192b;

    /* renamed from: c */
    private final wc4 f6193c = new wc4();

    /* synthetic */ ee4(dd4 dd4, int i, de4 de4) {
        this.f6191a = dd4;
        this.f6192b = i;
    }

    /* renamed from: c */
    private final long m8536c(pc4 pc4) {
        while (pc4.mo6913g() < pc4.mo6909c() - 6) {
            dd4 dd4 = this.f6191a;
            int i = this.f6192b;
            wc4 wc4 = this.f6193c;
            long g = pc4.mo6913g();
            byte[] bArr = new byte[2];
            jc4 jc4 = (jc4) pc4;
            jc4.mo6917n(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                pc4.mo6914i();
                jc4.mo8446o((int) (g - pc4.mo6908b()), false);
            } else {
                dr2 dr2 = new dr2(16);
                System.arraycopy(bArr, 0, dr2.mo6582h(), 0, 2);
                dr2.mo6579e(sc4.m16783a(pc4, dr2.mo6582h(), 2, 14));
                pc4.mo6914i();
                jc4.mo8446o((int) (g - pc4.mo6908b()), false);
                if (xc4.m19455c(dr2, dd4, i, wc4)) {
                    break;
                }
            }
            jc4.mo8446o(1, false);
        }
        if (pc4.mo6913g() < pc4.mo6909c() - 6) {
            return this.f6193c.f16785a;
        }
        ((jc4) pc4).mo8446o((int) (pc4.mo6909c() - pc4.mo6913g()), false);
        return this.f6191a.f5771j;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo6902a() {
    }

    /* renamed from: b */
    public final dc4 mo6903b(pc4 pc4, long j) {
        long b = pc4.mo6908b();
        long c = m8536c(pc4);
        long g = pc4.mo6913g();
        ((jc4) pc4).mo8446o(Math.max(6, this.f6191a.f5764c), false);
        long c2 = m8536c(pc4);
        return (c > j || c2 <= j) ? c2 <= j ? dc4.m7822f(c2, pc4.mo6913g()) : dc4.m7820d(c, b) : dc4.m7821e(g);
    }
}
