package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d4 */
final class C1615d4 implements C2318w3 {

    /* renamed from: a */
    private final cq2 f5639a = new cq2(new byte[4], 4);

    /* renamed from: b */
    final /* synthetic */ C1690f4 f5640b;

    public C1615d4(C1690f4 f4Var) {
        this.f5640b = f4Var;
    }

    /* renamed from: a */
    public final void mo6379a(dr2 dr2) {
        if (dr2.mo6593s() == 0 && (dr2.mo6593s() & 128) != 0) {
            dr2.mo6581g(6);
            int i = dr2.mo6583i() / 4;
            for (int i2 = 0; i2 < i; i2++) {
                dr2.mo6575a(this.f5639a, 4);
                int c = this.f5639a.mo6262c(16);
                this.f5639a.mo6269j(3);
                if (c == 0) {
                    this.f5639a.mo6269j(13);
                } else {
                    int c2 = this.f5639a.mo6262c(13);
                    if (this.f5640b.f6690e.get(c2) == null) {
                        this.f5640b.f6690e.put(c2, new C2356x3(new C1652e4(this.f5640b, c2)));
                        C1690f4 f4Var = this.f5640b;
                        f4Var.f6696k = f4Var.f6696k + 1;
                    }
                }
            }
            this.f5640b.f6690e.remove(0);
        }
    }

    /* renamed from: b */
    public final void mo6380b(ky2 ky2, rc4 rc4, C1875k4 k4Var) {
    }
}
