package com.google.android.gms.internal.ads;

import java.util.Objects;

public abstract class bc3 implements xx3, yx3 {

    /* renamed from: f */
    private final int f4849f;

    /* renamed from: g */
    private final cx3 f4850g = new cx3();

    /* renamed from: h */
    private zx3 f4851h;

    /* renamed from: i */
    private int f4852i;

    /* renamed from: j */
    private int f4853j;

    /* renamed from: k */
    private i74 f4854k;

    /* renamed from: l */
    private C1574c0[] f4855l;

    /* renamed from: m */
    private long f4856m;

    /* renamed from: n */
    private long f4857n = Long.MIN_VALUE;

    /* renamed from: o */
    private boolean f4858o;

    /* renamed from: p */
    private boolean f4859p;

    public bc3(int i) {
        this.f4849f = i;
    }

    /* renamed from: A */
    public final boolean mo5779A() {
        return this.f4857n == Long.MIN_VALUE;
    }

    /* renamed from: B */
    public final void mo5780B() {
        wu1.m19207f(this.f4853j == 0);
        cx3 cx3 = this.f4850g;
        cx3.f5556b = null;
        cx3.f5555a = null;
        mo5674G();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo5671C();

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo5672D(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract void mo5673E(long j, boolean z);

    /* renamed from: F */
    public final void mo5781F() {
        this.f4858o = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo5674G() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo5782H() {
    }

    /* renamed from: I */
    public final boolean mo5783I() {
        return this.f4858o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo5784K() {
    }

    /* renamed from: L */
    public final void mo5785L() {
        wu1.m19207f(this.f4853j == 2);
        this.f4853j = 1;
        mo5784K();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public abstract void mo5676M(C1574c0[] c0VarArr, long j, long j2);

    /* renamed from: Z */
    public final void mo5786Z() {
        boolean z = true;
        if (this.f4853j != 1) {
            z = false;
        }
        wu1.m19207f(z);
        this.f4853j = 2;
        mo5782H();
    }

    /* renamed from: a */
    public final int mo5787a() {
        return this.f4849f;
    }

    /* renamed from: b */
    public int mo5687b() {
        return 0;
    }

    /* renamed from: d */
    public final long mo5788d() {
        return this.f4857n;
    }

    /* renamed from: f */
    public final void mo5789f(int i) {
        this.f4852i = i;
    }

    /* renamed from: g */
    public final void mo5790g(long j) {
        this.f4858o = false;
        this.f4857n = j;
        mo5673E(j, false);
    }

    /* renamed from: h */
    public ex3 mo5791h() {
        return null;
    }

    /* renamed from: i */
    public final yx3 mo5792i() {
        return this;
    }

    /* renamed from: k */
    public final i74 mo5793k() {
        return this.f4854k;
    }

    /* renamed from: l */
    public final void mo5794l() {
        i74 i74 = this.f4854k;
        Objects.requireNonNull(i74);
        i74.mo7522g();
    }

    /* renamed from: m */
    public void mo5795m(int i, Object obj) {
    }

    /* renamed from: n */
    public /* synthetic */ void mo5696n(float f, float f2) {
    }

    /* renamed from: o */
    public final void mo5796o() {
        boolean z = true;
        if (this.f4853j != 1) {
            z = false;
        }
        wu1.m19207f(z);
        cx3 cx3 = this.f4850g;
        cx3.f5556b = null;
        cx3.f5555a = null;
        this.f4853j = 0;
        this.f4854k = null;
        this.f4855l = null;
        this.f4858o = false;
        mo5671C();
    }

    /* renamed from: p */
    public final void mo5797p(zx3 zx3, C1574c0[] c0VarArr, i74 i74, long j, boolean z, boolean z2, long j2, long j3) {
        boolean z3 = z;
        wu1.m19207f(this.f4853j == 0);
        this.f4851h = zx3;
        this.f4853j = 1;
        mo5672D(z, z2);
        mo5799r(c0VarArr, i74, j2, j3);
        long j4 = j;
        mo5673E(j, z);
    }

    /* renamed from: q */
    public final int mo5798q() {
        return this.f4853j;
    }

    /* renamed from: r */
    public final void mo5799r(C1574c0[] c0VarArr, i74 i74, long j, long j2) {
        wu1.m19207f(!this.f4858o);
        this.f4854k = i74;
        if (this.f4857n == Long.MIN_VALUE) {
            this.f4857n = j;
        }
        this.f4855l = c0VarArr;
        this.f4856m = j2;
        mo5676M(c0VarArr, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final boolean mo5800s() {
        if (mo5779A()) {
            return this.f4858o;
        }
        i74 i74 = this.f4854k;
        Objects.requireNonNull(i74);
        return i74.mo7519b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final C1574c0[] mo5801t() {
        C1574c0[] c0VarArr = this.f4855l;
        Objects.requireNonNull(c0VarArr);
        return c0VarArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final int mo5802u(cx3 cx3, z51 z51, int i) {
        i74 i74 = this.f4854k;
        Objects.requireNonNull(i74);
        int c = i74.mo7520c(cx3, z51, i);
        if (c == -4) {
            if (z51.mo10915g()) {
                this.f4857n = Long.MIN_VALUE;
                return this.f4858o ? -4 : -3;
            }
            long j = z51.f18035e + this.f4856m;
            z51.f18035e = j;
            this.f4857n = Math.max(this.f4857n, j);
        } else if (c == -5) {
            C1574c0 c0Var = cx3.f5555a;
            Objects.requireNonNull(c0Var);
            if (c0Var.f5238p != Long.MAX_VALUE) {
                bf4 b = c0Var.mo6004b();
                b.mo5846w(c0Var.f5238p + this.f4856m);
                cx3.f5555a = b.mo5848y();
                return -5;
            }
        }
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final ll3 mo5803w(Throwable th, C1574c0 c0Var, boolean z, int i) {
        int i2 = 4;
        if (c0Var != null && !this.f4859p) {
            this.f4859p = true;
            try {
                i2 = mo5691j(c0Var) & 7;
            } catch (ll3 unused) {
            } catch (Throwable th2) {
                this.f4859p = false;
                throw th2;
            }
            this.f4859p = false;
        }
        return ll3.m12785b(th, mo8857v(), this.f4852i, c0Var, i2, z, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final int mo5804x(long j) {
        i74 i74 = this.f4854k;
        Objects.requireNonNull(i74);
        return i74.mo7518a(j - this.f4856m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final cx3 mo5805y() {
        cx3 cx3 = this.f4850g;
        cx3.f5556b = null;
        cx3.f5555a = null;
        return cx3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final zx3 mo5806z() {
        zx3 zx3 = this.f4851h;
        Objects.requireNonNull(zx3);
        return zx3;
    }
}
