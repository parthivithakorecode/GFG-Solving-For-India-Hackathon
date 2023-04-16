package com.google.android.gms.internal.ads;

public final class mj1 implements gd1 {

    /* renamed from: a */
    private final sq1 f10911a = new sq1();

    /* renamed from: b */
    private vt1 f10912b;

    /* renamed from: c */
    private String f10913c;

    /* renamed from: d */
    private int f10914d = 8000;

    /* renamed from: e */
    private int f10915e = 8000;

    /* renamed from: f */
    private boolean f10916f;

    /* renamed from: a */
    public final mj1 mo9264a(boolean z) {
        this.f10916f = true;
        return this;
    }

    /* renamed from: b */
    public final mj1 mo9265b(int i) {
        this.f10914d = i;
        return this;
    }

    /* renamed from: c */
    public final mj1 mo9266c(int i) {
        this.f10915e = i;
        return this;
    }

    /* renamed from: d */
    public final mj1 mo9267d(vt1 vt1) {
        this.f10912b = vt1;
        return this;
    }

    /* renamed from: e */
    public final mj1 mo9268e(String str) {
        this.f10913c = str;
        return this;
    }

    /* renamed from: f */
    public final ol1 zza() {
        ol1 ol1 = new ol1(this.f10913c, this.f10914d, this.f10915e, this.f10916f, this.f10911a, (r43) null, false, (nk1) null);
        vt1 vt1 = this.f10912b;
        if (vt1 != null) {
            ol1.mo6892j(vt1);
        }
        return ol1;
    }
}
