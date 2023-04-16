package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ge */
public abstract class C1737ge implements C1589cf, C1626df {

    /* renamed from: a */
    private final int f7383a;

    /* renamed from: b */
    private C1664ef f7384b;

    /* renamed from: c */
    private int f7385c;

    /* renamed from: d */
    private int f7386d;

    /* renamed from: e */
    private C2261uk f7387e;

    /* renamed from: f */
    private long f7388f;

    /* renamed from: g */
    private boolean f7389g = true;

    /* renamed from: h */
    private boolean f7390h;

    public C1737ge(int i) {
        this.f7383a = i;
    }

    /* renamed from: B */
    public final void mo6170B() {
        boolean z = true;
        if (this.f7386d != 1) {
            z = false;
        }
        C1856jm.m11730e(z);
        this.f7386d = 2;
        mo7600r();
    }

    /* renamed from: F */
    public final boolean mo6171F() {
        return this.f7389g;
    }

    /* renamed from: G */
    public final boolean mo6172G() {
        return this.f7390h;
    }

    /* renamed from: U */
    public final void mo6174U() {
        C1856jm.m11730e(this.f7386d == 2);
        this.f7386d = 1;
        mo7601s();
    }

    /* renamed from: V */
    public final void mo6175V(C1664ef efVar, C2367xe[] xeVarArr, C2261uk ukVar, long j, boolean z, long j2) {
        C1856jm.m11730e(this.f7386d == 0);
        this.f7384b = efVar;
        this.f7386d = 1;
        mo7598p(z);
        mo6177X(xeVarArr, ukVar, j2);
        mo7599q(j, z);
    }

    /* renamed from: X */
    public final void mo6177X(C2367xe[] xeVarArr, C2261uk ukVar, long j) {
        C1856jm.m11730e(!this.f7390h);
        this.f7387e = ukVar;
        this.f7389g = false;
        this.f7388f = j;
        mo7602t(xeVarArr, j);
    }

    /* renamed from: Y */
    public final void mo6178Y(int i) {
        this.f7385c = i;
    }

    /* renamed from: Z */
    public final void mo6179Z(long j) {
        this.f7390h = false;
        this.f7389g = false;
        mo7599q(j, false);
    }

    /* renamed from: a */
    public final int mo6180a() {
        return this.f7386d;
    }

    /* renamed from: c */
    public final int mo6181c() {
        return this.f7383a;
    }

    /* renamed from: d */
    public final C1626df mo6182d() {
        return this;
    }

    /* renamed from: f */
    public final C2261uk mo6183f() {
        return this.f7387e;
    }

    /* renamed from: h */
    public C2004nm mo6184h() {
        return null;
    }

    /* renamed from: i */
    public final void mo6185i() {
        boolean z = true;
        if (this.f7386d != 1) {
            z = false;
        }
        C1856jm.m11730e(z);
        this.f7386d = 0;
        this.f7387e = null;
        this.f7390h = false;
        mo7597n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo7593j() {
        return this.f7389g ? this.f7390h : this.f7387e.mo6482b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final int mo7594k() {
        return this.f7385c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int mo7595l(C2404ye yeVar, C2257ug ugVar, boolean z) {
        C2404ye yeVar2 = yeVar;
        C2257ug ugVar2 = ugVar;
        int d = this.f7387e.mo6484d(yeVar2, ugVar2, z);
        if (d == -4) {
            if (ugVar.mo9763f()) {
                this.f7389g = true;
                return this.f7390h ? -4 : -3;
            }
            ugVar2.f15547d += this.f7388f;
        } else if (d == -5) {
            C2367xe xeVar = yeVar2.f17688a;
            long j = xeVar.f17153B;
            if (j != Long.MAX_VALUE) {
                yeVar2.f17688a = new C2367xe(xeVar.f17158f, xeVar.f17162j, xeVar.f17163k, xeVar.f17160h, xeVar.f17159g, xeVar.f17164l, xeVar.f17167o, xeVar.f17168p, xeVar.f17169q, xeVar.f17170r, xeVar.f17171s, xeVar.f17173u, xeVar.f17172t, xeVar.f17174v, xeVar.f17175w, xeVar.f17176x, xeVar.f17177y, xeVar.f17178z, xeVar.f17152A, xeVar.f17154C, xeVar.f17155D, xeVar.f17156E, j + this.f7388f, xeVar.f17165m, xeVar.f17166n, xeVar.f17161i);
                return -5;
            }
        }
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final C1664ef mo7596m() {
        return this.f7384b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract void mo7597n();

    /* renamed from: o */
    public final void mo6186o() {
        this.f7387e.mo6483c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract void mo7598p(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract void mo7599q(long j, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract void mo7600r();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract void mo7601s();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo7602t(C2367xe[] xeVarArr, long j) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo7603u(long j) {
        this.f7387e.mo6481a(j - this.f7388f);
    }

    /* renamed from: x */
    public final void mo6187x() {
        this.f7390h = true;
    }
}
