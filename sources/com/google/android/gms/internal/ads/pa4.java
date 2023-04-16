package com.google.android.gms.internal.ads;

final class pa4 {

    /* renamed from: a */
    private oa4 f12583a = new oa4();

    /* renamed from: b */
    private oa4 f12584b = new oa4();

    /* renamed from: c */
    private boolean f12585c;

    /* renamed from: d */
    private long f12586d = -9223372036854775807L;

    /* renamed from: e */
    private int f12587e;

    /* renamed from: a */
    public final float mo10007a() {
        if (this.f12583a.mo9714f()) {
            return (float) (1.0E9d / ((double) this.f12583a.mo9709a()));
        }
        return -1.0f;
    }

    /* renamed from: b */
    public final int mo10008b() {
        return this.f12587e;
    }

    /* renamed from: c */
    public final long mo10009c() {
        if (this.f12583a.mo9714f()) {
            return this.f12583a.mo9709a();
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public final long mo10010d() {
        if (this.f12583a.mo9714f()) {
            return this.f12583a.mo9710b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public final void mo10011e(long j) {
        this.f12583a.mo9711c(j);
        int i = 0;
        if (this.f12583a.mo9714f()) {
            this.f12585c = false;
        } else if (this.f12586d != -9223372036854775807L) {
            if (!this.f12585c || this.f12584b.mo9713e()) {
                this.f12584b.mo9712d();
                this.f12584b.mo9711c(this.f12586d);
            }
            this.f12585c = true;
            this.f12584b.mo9711c(j);
        }
        if (this.f12585c && this.f12584b.mo9714f()) {
            oa4 oa4 = this.f12583a;
            this.f12583a = this.f12584b;
            this.f12584b = oa4;
            this.f12585c = false;
        }
        this.f12586d = j;
        if (!this.f12583a.mo9714f()) {
            i = this.f12587e + 1;
        }
        this.f12587e = i;
    }

    /* renamed from: f */
    public final void mo10012f() {
        this.f12583a.mo9712d();
        this.f12584b.mo9712d();
        this.f12585c = false;
        this.f12586d = -9223372036854775807L;
        this.f12587e = 0;
    }

    /* renamed from: g */
    public final boolean mo10013g() {
        return this.f12583a.mo9714f();
    }
}
