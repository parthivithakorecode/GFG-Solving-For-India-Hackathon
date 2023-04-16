package com.google.android.gms.internal.ads;

public final class r84 {

    /* renamed from: a */
    public final int f13542a;

    /* renamed from: b */
    public final zx3[] f13543b;

    /* renamed from: c */
    public final pw0 f13544c;

    /* renamed from: d */
    public final Object f13545d;

    /* renamed from: e */
    public final w74[] f13546e;

    public r84(zx3[] zx3Arr, w74[] w74Arr, pw0 pw0, Object obj, byte[] bArr) {
        this.f13543b = zx3Arr;
        this.f13546e = (w74[]) w74Arr.clone();
        this.f13544c = pw0;
        this.f13545d = obj;
        this.f13542a = zx3Arr.length;
    }

    /* renamed from: a */
    public final boolean mo10494a(r84 r84, int i) {
        return r84 != null && n13.m13643p(this.f13543b[i], r84.f13543b[i]) && n13.m13643p(this.f13546e[i], r84.f13546e[i]);
    }

    /* renamed from: b */
    public final boolean mo10495b(int i) {
        return this.f13543b[i] != null;
    }
}
