package com.google.android.gms.internal.ads;

public final class ft0 implements dx3 {

    /* renamed from: a */
    private final g94 f6907a = new g94(true, 65536);

    /* renamed from: b */
    private long f6908b = 15000000;

    /* renamed from: c */
    private long f6909c = 30000000;

    /* renamed from: d */
    private long f6910d = 2500000;

    /* renamed from: e */
    private long f6911e = 5000000;

    /* renamed from: f */
    private int f6912f;

    /* renamed from: g */
    private boolean f6913g;

    ft0() {
    }

    /* renamed from: a */
    public final void mo6711a() {
        mo7388i(false);
    }

    /* renamed from: b */
    public final boolean mo6712b() {
        return false;
    }

    /* renamed from: c */
    public final void mo6713c() {
        mo7388i(true);
    }

    /* renamed from: d */
    public final void mo6714d(xx3[] xx3Arr, hm0 hm0, w74[] w74Arr) {
        this.f6912f = 0;
        for (int i = 0; i < 2; i++) {
            if (w74Arr[i] != null) {
                this.f6912f += xx3Arr[i].mo5787a() != 1 ? 131072000 : 13107200;
            }
        }
        this.f6907a.mo7541f(this.f6912f);
    }

    /* renamed from: e */
    public final boolean mo6715e(long j, float f, boolean z, long j2) {
        long j3 = z ? this.f6911e : this.f6910d;
        return j3 <= 0 || j >= j3;
    }

    /* renamed from: f */
    public final g94 mo6716f() {
        return this.f6907a;
    }

    /* renamed from: g */
    public final void mo6717g() {
        mo7388i(true);
    }

    /* renamed from: h */
    public final boolean mo6718h(long j, long j2, float f) {
        boolean z = true;
        boolean z2 = j2 > this.f6909c ? false : j2 < this.f6908b ? true : true;
        int a = this.f6907a.mo7536a();
        int i = this.f6912f;
        if (!z2 && (!z2 || !this.f6913g || a >= i)) {
            z = false;
        }
        this.f6913g = z;
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo7388i(boolean z) {
        this.f6912f = 0;
        this.f6913g = false;
        if (z) {
            this.f6907a.mo7540e();
        }
    }

    /* renamed from: j */
    public final synchronized void mo7389j(int i) {
        this.f6910d = ((long) i) * 1000;
    }

    /* renamed from: k */
    public final synchronized void mo7390k(int i) {
        this.f6911e = ((long) i) * 1000;
    }

    /* renamed from: l */
    public final synchronized void mo7391l(int i) {
        this.f6909c = ((long) i) * 1000;
    }

    /* renamed from: m */
    public final synchronized void mo7392m(int i) {
        this.f6908b = ((long) i) * 1000;
    }

    public final long zza() {
        return 0;
    }
}
