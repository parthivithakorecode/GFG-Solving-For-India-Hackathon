package com.google.android.gms.internal.ads;

public final class bd4 implements pd4 {

    /* renamed from: a */
    private final dd4 f4869a;

    /* renamed from: b */
    private final long f4870b;

    public bd4(dd4 dd4, long j) {
        this.f4869a = dd4;
        this.f4870b = j;
    }

    /* renamed from: c */
    private final qd4 m6812c(long j, long j2) {
        return new qd4((j * 1000000) / ((long) this.f4869a.f5766e), this.f4870b + j2);
    }

    /* renamed from: b */
    public final long mo5810b() {
        return this.f4869a.mo6453a();
    }

    /* renamed from: d */
    public final nd4 mo5811d(long j) {
        wu1.m19203b(this.f4869a.f5772k);
        dd4 dd4 = this.f4869a;
        cd4 cd4 = dd4.f5772k;
        long[] jArr = cd4.f5393a;
        long[] jArr2 = cd4.f5394b;
        int J = n13.m13605J(jArr, dd4.mo6454b(j), true, false);
        long j2 = 0;
        long j3 = J == -1 ? 0 : jArr[J];
        if (J != -1) {
            j2 = jArr2[J];
        }
        qd4 c = m6812c(j3, j2);
        if (c.f13141a == j || J == jArr.length - 1) {
            return new nd4(c, c);
        }
        int i = J + 1;
        return new nd4(c, m6812c(jArr[i], jArr2[i]));
    }

    /* renamed from: f */
    public final boolean mo5812f() {
        return true;
    }
}
