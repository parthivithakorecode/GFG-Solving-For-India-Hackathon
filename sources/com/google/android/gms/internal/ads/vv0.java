package com.google.android.gms.internal.ads;

public final class vv0 {

    /* renamed from: a */
    private final int f16419a;

    /* renamed from: b */
    public final int f16420b;

    /* renamed from: c */
    public final int f16421c;

    private vv0(int i, int i2, int i3) {
        this.f16419a = i;
        this.f16421c = i2;
        this.f16420b = i3;
    }

    /* renamed from: a */
    public static vv0 m18686a() {
        return new vv0(0, 0, 0);
    }

    /* renamed from: b */
    public static vv0 m18687b(int i, int i2) {
        return new vv0(1, i, i2);
    }

    /* renamed from: c */
    public static vv0 m18688c(C2087pv pvVar) {
        return pvVar.f12807i ? new vv0(3, 0, 0) : pvVar.f12812n ? new vv0(2, 0, 0) : pvVar.f12811m ? m18686a() : m18687b(pvVar.f12809k, pvVar.f12806h);
    }

    /* renamed from: d */
    public static vv0 m18689d() {
        return new vv0(5, 0, 0);
    }

    /* renamed from: e */
    public static vv0 m18690e() {
        return new vv0(4, 0, 0);
    }

    /* renamed from: f */
    public final boolean mo11528f() {
        return this.f16419a == 0;
    }

    /* renamed from: g */
    public final boolean mo11529g() {
        return this.f16419a == 2;
    }

    /* renamed from: h */
    public final boolean mo11530h() {
        return this.f16419a == 5;
    }

    /* renamed from: i */
    public final boolean mo11531i() {
        return this.f16419a == 3;
    }

    /* renamed from: j */
    public final boolean mo11532j() {
        return this.f16419a == 4;
    }
}
