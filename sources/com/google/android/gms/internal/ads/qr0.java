package com.google.android.gms.internal.ads;

public final class qr0 {

    /* renamed from: a */
    private final C2337wl f13281a = new C2337wl(true, 65536);

    /* renamed from: b */
    private long f13282b = 15000000;

    /* renamed from: c */
    private long f13283c = 30000000;

    /* renamed from: d */
    private long f13284d = 2500000;

    /* renamed from: e */
    private long f13285e = 5000000;

    /* renamed from: f */
    private int f13286f;

    /* renamed from: g */
    private boolean f13287g;

    qr0() {
    }

    /* renamed from: a */
    public final void mo10361a() {
        mo10365e(false);
    }

    /* renamed from: b */
    public final void mo10362b() {
        mo10365e(true);
    }

    /* renamed from: c */
    public final void mo10363c() {
        mo10365e(true);
    }

    /* renamed from: d */
    public final void mo10364d(C1589cf[] cfVarArr, C1521al alVar, C1966ml mlVar) {
        this.f13286f = 0;
        for (int i = 0; i < 2; i++) {
            if (mlVar.mo9274a(i) != null) {
                this.f13286f += C2449zm.m20727f(cfVarArr[i].mo6181c());
            }
        }
        this.f13281a.mo11677f(this.f13286f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo10365e(boolean z) {
        this.f13286f = 0;
        this.f13287g = false;
        if (z) {
            this.f13281a.mo11676e();
        }
    }

    /* renamed from: f */
    public final synchronized void mo10366f(int i) {
        this.f13284d = ((long) i) * 1000;
    }

    /* renamed from: g */
    public final synchronized void mo10367g(int i) {
        this.f13285e = ((long) i) * 1000;
    }

    /* renamed from: h */
    public final synchronized void mo10368h(int i) {
        this.f13283c = ((long) i) * 1000;
    }

    /* renamed from: i */
    public final synchronized void mo10369i(int i) {
        this.f13282b = ((long) i) * 1000;
    }

    /* renamed from: j */
    public final synchronized boolean mo10370j(long j) {
        boolean z;
        z = true;
        boolean z2 = j > this.f13283c ? false : j < this.f13282b ? true : true;
        int a = this.f13281a.mo11672a();
        int i = this.f13286f;
        if (!z2) {
            if (!z2 || !this.f13287g || a >= i) {
                z = false;
            }
        }
        this.f13287g = z;
        return z;
    }

    /* renamed from: k */
    public final synchronized boolean mo10371k(long j, boolean z) {
        long j2;
        j2 = z ? this.f13285e : this.f13284d;
        return j2 <= 0 || j >= j2;
    }

    /* renamed from: l */
    public final C2337wl mo10372l() {
        return this.f13281a;
    }
}
