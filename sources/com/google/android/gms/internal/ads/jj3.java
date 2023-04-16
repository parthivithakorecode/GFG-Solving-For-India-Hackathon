package com.google.android.gms.internal.ads;

import java.util.Objects;

final class jj3 implements ex3 {

    /* renamed from: f */
    private final hy3 f9163f;

    /* renamed from: g */
    private final ii3 f9164g;

    /* renamed from: h */
    private xx3 f9165h;

    /* renamed from: i */
    private ex3 f9166i;

    /* renamed from: j */
    private boolean f9167j = true;

    /* renamed from: k */
    private boolean f9168k;

    public jj3(ii3 ii3, xv1 xv1) {
        this.f9164g = ii3;
        this.f9163f = new hy3(xv1);
    }

    /* renamed from: Y */
    public final void mo7179Y(e30 e30) {
        ex3 ex3 = this.f9166i;
        if (ex3 != null) {
            ex3.mo7179Y(e30);
            e30 = this.f9166i.mo7180c();
        }
        this.f9163f.mo7179Y(e30);
    }

    /* renamed from: a */
    public final long mo8474a(boolean z) {
        xx3 xx3 = this.f9165h;
        if (xx3 == null || xx3.mo5675J() || (!this.f9165h.mo5686a0() && (z || this.f9165h.mo5779A()))) {
            this.f9167j = true;
            if (this.f9168k) {
                this.f9163f.mo8042b();
            }
        } else {
            ex3 ex3 = this.f9166i;
            Objects.requireNonNull(ex3);
            long zza = ex3.zza();
            if (this.f9167j) {
                if (zza < this.f9163f.zza()) {
                    this.f9163f.mo8043d();
                } else {
                    this.f9167j = false;
                    if (this.f9168k) {
                        this.f9163f.mo8042b();
                    }
                }
            }
            this.f9163f.mo8041a(zza);
            e30 c = ex3.mo7180c();
            if (!c.equals(this.f9163f.mo7180c())) {
                this.f9163f.mo7179Y(c);
                this.f9164g.mo5555a(c);
            }
        }
        if (this.f9167j) {
            return this.f9163f.zza();
        }
        ex3 ex32 = this.f9166i;
        Objects.requireNonNull(ex32);
        return ex32.zza();
    }

    /* renamed from: b */
    public final void mo8475b(xx3 xx3) {
        if (xx3 == this.f9165h) {
            this.f9166i = null;
            this.f9165h = null;
            this.f9167j = true;
        }
    }

    /* renamed from: c */
    public final e30 mo7180c() {
        ex3 ex3 = this.f9166i;
        return ex3 != null ? ex3.mo7180c() : this.f9163f.mo7180c();
    }

    /* renamed from: d */
    public final void mo8476d(xx3 xx3) {
        ex3 ex3;
        ex3 h = xx3.mo5791h();
        if (h != null && h != (ex3 = this.f9166i)) {
            if (ex3 == null) {
                this.f9166i = h;
                this.f9165h = xx3;
                h.mo7179Y(this.f9163f.mo7180c());
                return;
            }
            throw ll3.m12787d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    /* renamed from: e */
    public final void mo8477e(long j) {
        this.f9163f.mo8041a(j);
    }

    /* renamed from: f */
    public final void mo8478f() {
        this.f9168k = true;
        this.f9163f.mo8042b();
    }

    /* renamed from: g */
    public final void mo8479g() {
        this.f9168k = false;
        this.f9163f.mo8043d();
    }

    public final long zza() {
        throw null;
    }
}
