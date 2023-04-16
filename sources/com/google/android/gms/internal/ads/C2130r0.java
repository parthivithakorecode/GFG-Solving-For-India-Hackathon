package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.r0 */
final class C2130r0 {

    /* renamed from: a */
    public final int f13418a;

    /* renamed from: b */
    public int f13419b;

    /* renamed from: c */
    public int f13420c;

    /* renamed from: d */
    public long f13421d;

    /* renamed from: e */
    private final boolean f13422e;

    /* renamed from: f */
    private final dr2 f13423f;

    /* renamed from: g */
    private final dr2 f13424g;

    /* renamed from: h */
    private int f13425h;

    /* renamed from: i */
    private int f13426i;

    public C2130r0(dr2 dr2, dr2 dr22, boolean z) {
        this.f13424g = dr2;
        this.f13423f = dr22;
        this.f13422e = z;
        dr22.mo6580f(12);
        this.f13418a = dr22.mo6596v();
        dr2.mo6580f(12);
        this.f13426i = dr2.mo6596v();
        sc4.m16784b(dr2.mo6587m() != 1 ? false : true, "first_chunk must be 1");
        this.f13419b = -1;
    }

    /* renamed from: a */
    public final boolean mo10443a() {
        int i = this.f13419b + 1;
        this.f13419b = i;
        if (i == this.f13418a) {
            return false;
        }
        this.f13421d = this.f13422e ? this.f13423f.mo6568B() : this.f13423f.mo6567A();
        if (this.f13419b == this.f13425h) {
            this.f13420c = this.f13424g.mo6596v();
            this.f13424g.mo6581g(4);
            int i2 = -1;
            int i3 = this.f13426i - 1;
            this.f13426i = i3;
            if (i3 > 0) {
                i2 = -1 + this.f13424g.mo6596v();
            }
            this.f13425h = i2;
        }
        return true;
    }
}
