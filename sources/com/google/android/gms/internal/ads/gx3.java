package com.google.android.gms.internal.ads;

final class gx3 {

    /* renamed from: a */
    public final s54 f7876a;

    /* renamed from: b */
    public final long f7877b;

    /* renamed from: c */
    public final long f7878c;

    /* renamed from: d */
    public final long f7879d;

    /* renamed from: e */
    public final long f7880e;

    /* renamed from: f */
    public final boolean f7881f;

    /* renamed from: g */
    public final boolean f7882g;

    /* renamed from: h */
    public final boolean f7883h;

    /* renamed from: i */
    public final boolean f7884i;

    gx3(s54 s54, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        wu1.m19205d(!z4 || z2);
        if (z3 && !z2) {
            z5 = false;
        }
        wu1.m19205d(z5);
        this.f7876a = s54;
        this.f7877b = j;
        this.f7878c = j2;
        this.f7879d = j3;
        this.f7880e = j4;
        this.f7881f = false;
        this.f7882g = z2;
        this.f7883h = z3;
        this.f7884i = z4;
    }

    /* renamed from: a */
    public final gx3 mo7728a(long j) {
        if (j == this.f7878c) {
            return this;
        }
        return new gx3(this.f7876a, this.f7877b, j, this.f7879d, this.f7880e, false, this.f7882g, this.f7883h, this.f7884i);
    }

    /* renamed from: b */
    public final gx3 mo7729b(long j) {
        if (j == this.f7877b) {
            return this;
        }
        return new gx3(this.f7876a, j, this.f7878c, this.f7879d, this.f7880e, false, this.f7882g, this.f7883h, this.f7884i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gx3.class == obj.getClass()) {
            gx3 gx3 = (gx3) obj;
            return this.f7877b == gx3.f7877b && this.f7878c == gx3.f7878c && this.f7879d == gx3.f7879d && this.f7880e == gx3.f7880e && this.f7882g == gx3.f7882g && this.f7883h == gx3.f7883h && this.f7884i == gx3.f7884i && n13.m13643p(this.f7876a, gx3.f7876a);
        }
    }

    public final int hashCode() {
        return ((((((((((((((this.f7876a.hashCode() + 527) * 31) + ((int) this.f7877b)) * 31) + ((int) this.f7878c)) * 31) + ((int) this.f7879d)) * 31) + ((int) this.f7880e)) * 961) + (this.f7882g ? 1 : 0)) * 31) + (this.f7883h ? 1 : 0)) * 31) + (this.f7884i ? 1 : 0);
    }
}
