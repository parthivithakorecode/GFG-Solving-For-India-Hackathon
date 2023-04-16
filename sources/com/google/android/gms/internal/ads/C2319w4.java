package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.w4 */
final class C2319w4 implements pd4 {

    /* renamed from: a */
    private final C2208t4 f16686a;

    /* renamed from: b */
    private final int f16687b;

    /* renamed from: c */
    private final long f16688c;

    /* renamed from: d */
    private final long f16689d;

    /* renamed from: e */
    private final long f16690e;

    public C2319w4(C2208t4 t4Var, int i, long j, long j2) {
        this.f16686a = t4Var;
        this.f16687b = i;
        this.f16688c = j;
        long j3 = (j2 - j) / ((long) t4Var.f14699d);
        this.f16689d = j3;
        this.f16690e = m18858c(j3);
    }

    /* renamed from: c */
    private final long m18858c(long j) {
        return n13.m13621Z(j * ((long) this.f16687b), 1000000, (long) this.f16686a.f14698c);
    }

    /* renamed from: b */
    public final long mo5810b() {
        return this.f16690e;
    }

    /* renamed from: d */
    public final nd4 mo5811d(long j) {
        long U = n13.m13616U((((long) this.f16686a.f14698c) * j) / (((long) this.f16687b) * 1000000), 0, this.f16689d - 1);
        long j2 = this.f16688c;
        int i = this.f16686a.f14699d;
        long c = m18858c(U);
        qd4 qd4 = new qd4(c, j2 + (((long) i) * U));
        if (c >= j || U == this.f16689d - 1) {
            return new nd4(qd4, qd4);
        }
        long j3 = U + 1;
        return new nd4(qd4, new qd4(m18858c(j3), this.f16688c + (j3 * ((long) this.f16686a.f14699d))));
    }

    /* renamed from: f */
    public final boolean mo5812f() {
        return true;
    }
}
