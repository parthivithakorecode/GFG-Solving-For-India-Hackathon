package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fi */
final class C1704fi implements C1592ci {

    /* renamed from: a */
    private final C2152rm f6825a;

    /* renamed from: b */
    private final int f6826b;

    /* renamed from: c */
    private final int f6827c;

    /* renamed from: d */
    private int f6828d;

    /* renamed from: e */
    private int f6829e;

    public C1704fi(C2444zh zhVar) {
        C2152rm rmVar = zhVar.f18191P0;
        this.f6825a = rmVar;
        rmVar.mo10552v(12);
        this.f6827c = rmVar.mo10539i() & 255;
        this.f6826b = rmVar.mo10539i();
    }

    /* renamed from: a */
    public final int mo6202a() {
        int i = this.f6827c;
        if (i == 8) {
            return this.f6825a.mo10537g();
        }
        if (i == 16) {
            return this.f6825a.mo10540j();
        }
        int i2 = this.f6828d;
        this.f6828d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f6829e & 15;
        }
        int g = this.f6825a.mo10537g();
        this.f6829e = g;
        return (g & 240) >> 4;
    }

    /* renamed from: c */
    public final boolean mo6203c() {
        return false;
    }

    public final int zza() {
        return this.f6826b;
    }
}
