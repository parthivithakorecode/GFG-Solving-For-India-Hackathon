package com.google.android.gms.internal.ads;

final class g64 implements i74 {

    /* renamed from: a */
    private final i74 f7288a;

    /* renamed from: b */
    private final long f7289b;

    public g64(i74 i74, long j) {
        this.f7288a = i74;
        this.f7289b = j;
    }

    /* renamed from: a */
    public final int mo7518a(long j) {
        return this.f7288a.mo7518a(j - this.f7289b);
    }

    /* renamed from: b */
    public final boolean mo7519b() {
        return this.f7288a.mo7519b();
    }

    /* renamed from: c */
    public final int mo7520c(cx3 cx3, z51 z51, int i) {
        int c = this.f7288a.mo7520c(cx3, z51, i);
        if (c != -4) {
            return c;
        }
        z51.f18035e = Math.max(0, z51.f18035e + this.f7289b);
        return -4;
    }

    /* renamed from: d */
    public final i74 mo7521d() {
        return this.f7288a;
    }

    /* renamed from: g */
    public final void mo7522g() {
        this.f7288a.mo7522g();
    }
}
