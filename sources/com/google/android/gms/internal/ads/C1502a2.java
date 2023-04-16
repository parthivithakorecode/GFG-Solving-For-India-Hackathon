package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a2 */
final class C1502a2 {

    /* renamed from: a */
    public int f3886a;

    /* renamed from: b */
    public long f3887b;

    /* renamed from: c */
    public int f3888c;

    /* renamed from: d */
    public int f3889d;

    /* renamed from: e */
    public int f3890e;

    /* renamed from: f */
    public final int[] f3891f = new int[255];

    /* renamed from: g */
    private final dr2 f3892g = new dr2(255);

    C1502a2() {
    }

    /* renamed from: a */
    public final void mo5068a() {
        this.f3886a = 0;
        this.f3887b = 0;
        this.f3888c = 0;
        this.f3889d = 0;
        this.f3890e = 0;
    }

    /* renamed from: b */
    public final boolean mo5069b(pc4 pc4, boolean z) {
        mo5068a();
        this.f3892g.mo6577c(27);
        if (sc4.m16785c(pc4, this.f3892g.mo6582h(), 0, 27, z) && this.f3892g.mo6567A() == 1332176723) {
            if (this.f3892g.mo6593s() == 0) {
                this.f3886a = this.f3892g.mo6593s();
                this.f3887b = this.f3892g.mo6598x();
                this.f3892g.mo6599y();
                this.f3892g.mo6599y();
                this.f3892g.mo6599y();
                int s = this.f3892g.mo6593s();
                this.f3888c = s;
                this.f3889d = s + 27;
                this.f3892g.mo6577c(s);
                if (sc4.m16785c(pc4, this.f3892g.mo6582h(), 0, this.f3888c, z)) {
                    for (int i = 0; i < this.f3888c; i++) {
                        this.f3891f[i] = this.f3892g.mo6593s();
                        this.f3890e += this.f3891f[i];
                    }
                    return true;
                }
            } else if (z) {
                return false;
            } else {
                throw C1646dz.m8225c("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo5070c(pc4 pc4, long j) {
        int i;
        wu1.m19205d(pc4.mo6908b() == pc4.mo6913g());
        this.f3892g.mo6577c(4);
        while (true) {
            i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if ((i == 0 || pc4.mo6908b() + 4 < j) && sc4.m16785c(pc4, this.f3892g.mo6582h(), 0, 4, true)) {
                this.f3892g.mo6580f(0);
                if (this.f3892g.mo6567A() != 1332176723) {
                    ((jc4) pc4).mo8447p(1, false);
                } else {
                    pc4.mo6914i();
                    return true;
                }
            }
        }
        do {
            if ((i != 0 && pc4.mo6908b() >= j) || pc4.mo6907E(1) == -1) {
                return false;
            }
            break;
        } while (pc4.mo6907E(1) == -1);
        return false;
    }
}
