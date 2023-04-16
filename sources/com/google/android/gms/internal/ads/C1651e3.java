package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* renamed from: com.google.android.gms.internal.ads.e3 */
final class C1651e3 {

    /* renamed from: a */
    private final td4 f6061a;

    /* renamed from: b */
    private final SparseArray<sg2> f6062b = new SparseArray<>();

    /* renamed from: c */
    private final SparseArray<rf2> f6063c = new SparseArray<>();

    /* renamed from: d */
    private final es2 f6064d;

    /* renamed from: e */
    private final byte[] f6065e;

    /* renamed from: f */
    private int f6066f;

    /* renamed from: g */
    private long f6067g;

    /* renamed from: h */
    private long f6068h;

    /* renamed from: i */
    private final C1614d3 f6069i = new C1614d3((C1577c3) null);

    /* renamed from: j */
    private final C1614d3 f6070j = new C1614d3((C1577c3) null);

    /* renamed from: k */
    private boolean f6071k;

    /* renamed from: l */
    private long f6072l;

    /* renamed from: m */
    private long f6073m;

    /* renamed from: n */
    private boolean f6074n;

    public C1651e3(td4 td4, boolean z, boolean z2) {
        this.f6061a = td4;
        byte[] bArr = new byte[128];
        this.f6065e = bArr;
        this.f6064d = new es2(bArr, 0, 0);
        this.f6071k = false;
    }

    /* renamed from: a */
    public final void mo6779a(rf2 rf2) {
        this.f6063c.append(rf2.f13622a, rf2);
    }

    /* renamed from: b */
    public final void mo6780b(sg2 sg2) {
        this.f6062b.append(sg2.f14438d, sg2);
    }

    /* renamed from: c */
    public final void mo6781c() {
        this.f6071k = false;
    }

    /* renamed from: d */
    public final void mo6782d(long j, int i, long j2) {
        this.f6066f = i;
        this.f6068h = j2;
        this.f6067g = j;
    }

    /* renamed from: e */
    public final boolean mo6783e(long j, int i, boolean z, boolean z2) {
        boolean z3 = false;
        if (this.f6066f == 9) {
            if (z && this.f6071k) {
                long j2 = this.f6067g;
                int i2 = i + ((int) (j - j2));
                long j3 = this.f6073m;
                if (j3 != -9223372036854775807L) {
                    this.f6061a.mo7872a(j3, this.f6074n ? 1 : 0, (int) (j2 - this.f6072l), i2, (sd4) null);
                }
            }
            this.f6072l = this.f6067g;
            this.f6073m = this.f6068h;
            this.f6074n = false;
            this.f6071k = true;
        }
        boolean z4 = this.f6074n;
        int i3 = this.f6066f;
        if (i3 == 5 || (z2 && i3 == 1)) {
            z3 = true;
        }
        boolean z5 = z4 | z3;
        this.f6074n = z5;
        return z5;
    }
}
