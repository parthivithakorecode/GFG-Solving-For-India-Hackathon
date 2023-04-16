package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.google.android.gms.internal.ads.h2 */
abstract class C1762h2 {

    /* renamed from: a */
    private final C2428z1 f7955a = new C2428z1();

    /* renamed from: b */
    private td4 f7956b;

    /* renamed from: c */
    private rc4 f7957c;

    /* renamed from: d */
    private C1539b2 f7958d;

    /* renamed from: e */
    private long f7959e;

    /* renamed from: f */
    private long f7960f;

    /* renamed from: g */
    private long f7961g;

    /* renamed from: h */
    private int f7962h;

    /* renamed from: i */
    private int f7963i;

    /* renamed from: j */
    private C1613d2 f7964j = new C1613d2();

    /* renamed from: k */
    private long f7965k;

    /* renamed from: l */
    private boolean f7966l;

    /* renamed from: m */
    private boolean f7967m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo6028a(dr2 dr2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6029b(boolean z) {
        int i;
        if (z) {
            this.f7964j = new C1613d2();
            this.f7960f = 0;
            i = 0;
        } else {
            i = 1;
        }
        this.f7962h = i;
        this.f7959e = -1;
        this.f7961g = 0;
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: c */
    public abstract boolean mo6030c(dr2 dr2, long j, C1613d2 d2Var);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo7802d(pc4 pc4, md4 md4) {
        pc4 pc42 = pc4;
        wu1.m19203b(this.f7956b);
        int i = n13.f11236a;
        int i2 = this.f7962h;
        if (i2 == 0) {
            while (this.f7955a.mo12127e(pc42)) {
                this.f7965k = pc4.mo6908b() - this.f7960f;
                if (mo6030c(this.f7955a.mo12123a(), this.f7960f, this.f7964j)) {
                    this.f7960f = pc4.mo6908b();
                } else {
                    C1574c0 c0Var = this.f7964j.f5621a;
                    this.f7963i = c0Var.f5248z;
                    if (!this.f7967m) {
                        this.f7956b.mo7873b(c0Var);
                        this.f7967m = true;
                    }
                    C1539b2 b2Var = this.f7964j.f5622b;
                    if (b2Var != null) {
                        this.f7958d = b2Var;
                    } else if (pc4.mo6909c() == -1) {
                        this.f7958d = new C1725g2((C1688f2) null);
                    } else {
                        C1502a2 b = this.f7955a.mo12124b();
                        this.f7958d = new C2242u1(this, this.f7960f, pc4.mo6909c(), (long) (b.f3889d + b.f3890e), b.f3887b, (b.f3886a & 4) != 0);
                    }
                    this.f7962h = 2;
                    this.f7955a.mo12126d();
                    return 0;
                }
            }
            this.f7962h = 3;
            return -1;
        } else if (i2 == 1) {
            ((jc4) pc42).mo8447p((int) this.f7960f, false);
            this.f7962h = 2;
            return 0;
        } else if (i2 != 2) {
            return -1;
        } else {
            long c = this.f7958d.mo5626c(pc42);
            if (c >= 0) {
                md4.f10817a = c;
                return 1;
            }
            if (c < -1) {
                mo7806h(-(c + 2));
            }
            if (!this.f7966l) {
                pd4 b2 = this.f7958d.mo5625b();
                wu1.m19203b(b2);
                this.f7957c.mo10269p(b2);
                this.f7966l = true;
            }
            if (this.f7965k > 0 || this.f7955a.mo12127e(pc42)) {
                this.f7965k = 0;
                dr2 a = this.f7955a.mo12123a();
                long a2 = mo6028a(a);
                if (a2 >= 0) {
                    long j = this.f7961g;
                    if (j + a2 >= this.f7959e) {
                        long e = mo7803e(j);
                        rd4.m16162b(this.f7956b, a, a.mo6586l());
                        this.f7956b.mo7872a(e, 1, a.mo6586l(), 0, (sd4) null);
                        this.f7959e = -1;
                    }
                }
                this.f7961g += a2;
                return 0;
            }
            this.f7962h = 3;
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final long mo7803e(long j) {
        return (j * 1000000) / ((long) this.f7963i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final long mo7804f(long j) {
        return (((long) this.f7963i) * j) / 1000000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo7805g(rc4 rc4, td4 td4) {
        this.f7957c = rc4;
        this.f7956b = td4;
        mo6029b(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo7806h(long j) {
        this.f7961g = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo7807i(long j, long j2) {
        this.f7955a.mo12125c();
        if (j == 0) {
            mo6029b(!this.f7966l);
        } else if (this.f7962h != 0) {
            long f = mo7804f(j2);
            this.f7959e = f;
            C1539b2 b2Var = this.f7958d;
            int i = n13.f11236a;
            b2Var.mo5627d(f);
            this.f7962h = 2;
        }
    }
}
