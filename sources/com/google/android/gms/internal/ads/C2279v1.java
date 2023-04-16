package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.v1 */
final class C2279v1 implements C1539b2 {

    /* renamed from: a */
    private final dd4 f15845a;

    /* renamed from: b */
    private final cd4 f15846b;

    /* renamed from: c */
    private long f15847c = -1;

    /* renamed from: d */
    private long f15848d = -1;

    public C2279v1(dd4 dd4, cd4 cd4) {
        this.f15845a = dd4;
        this.f15846b = cd4;
    }

    /* renamed from: a */
    public final void mo11365a(long j) {
        this.f15847c = j;
    }

    /* renamed from: b */
    public final pd4 mo5625b() {
        wu1.m19207f(this.f15847c != -1);
        return new bd4(this.f15845a, this.f15847c);
    }

    /* renamed from: c */
    public final long mo5626c(pc4 pc4) {
        long j = this.f15848d;
        if (j < 0) {
            return -1;
        }
        this.f15848d = -1;
        return -(j + 2);
    }

    /* renamed from: d */
    public final void mo5627d(long j) {
        long[] jArr = this.f15846b.f5393a;
        this.f15848d = jArr[n13.m13605J(jArr, j, true, true)];
    }
}
