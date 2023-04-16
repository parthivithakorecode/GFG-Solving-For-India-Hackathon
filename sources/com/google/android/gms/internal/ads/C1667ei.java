package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ei */
final class C1667ei implements C1592ci {

    /* renamed from: a */
    private final int f6216a;

    /* renamed from: b */
    private final int f6217b;

    /* renamed from: c */
    private final C2152rm f6218c;

    public C1667ei(C2444zh zhVar) {
        C2152rm rmVar = zhVar.f18191P0;
        this.f6218c = rmVar;
        rmVar.mo10552v(12);
        this.f6216a = rmVar.mo10539i();
        this.f6217b = rmVar.mo10539i();
    }

    /* renamed from: a */
    public final int mo6202a() {
        int i = this.f6216a;
        return i == 0 ? this.f6218c.mo10539i() : i;
    }

    /* renamed from: c */
    public final boolean mo6203c() {
        return this.f6216a != 0;
    }

    public final int zza() {
        return this.f6217b;
    }
}
