package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bi */
final class C1555bi {

    /* renamed from: a */
    public final int f4945a;

    /* renamed from: b */
    public int f4946b;

    /* renamed from: c */
    public int f4947c;

    /* renamed from: d */
    public long f4948d;

    /* renamed from: e */
    private final boolean f4949e;

    /* renamed from: f */
    private final C2152rm f4950f;

    /* renamed from: g */
    private final C2152rm f4951g;

    /* renamed from: h */
    private int f4952h;

    /* renamed from: i */
    private int f4953i;

    public C1555bi(C2152rm rmVar, C2152rm rmVar2, boolean z) {
        this.f4951g = rmVar;
        this.f4950f = rmVar2;
        this.f4949e = z;
        rmVar2.mo10552v(12);
        this.f4945a = rmVar2.mo10539i();
        rmVar.mo10552v(12);
        this.f4953i = rmVar.mo10539i();
        C1856jm.m11731f(rmVar.mo10535e() != 1 ? false : true, "first_chunk must be 1");
        this.f4946b = -1;
    }

    /* renamed from: a */
    public final boolean mo5864a() {
        int i = this.f4946b + 1;
        this.f4946b = i;
        if (i == this.f4945a) {
            return false;
        }
        this.f4948d = this.f4949e ? this.f4950f.mo10544n() : this.f4950f.mo10543m();
        if (this.f4946b == this.f4952h) {
            this.f4947c = this.f4951g.mo10539i();
            this.f4951g.mo10553w(4);
            int i2 = -1;
            int i3 = this.f4953i - 1;
            this.f4953i = i3;
            if (i3 > 0) {
                i2 = -1 + this.f4951g.mo10539i();
            }
            this.f4952h = i2;
        }
        return true;
    }
}
