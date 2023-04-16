package com.google.android.gms.internal.ads;

final class x83 extends e73<Object> {

    /* renamed from: h */
    private final transient Object[] f17078h;

    /* renamed from: i */
    private final transient int f17079i;

    /* renamed from: j */
    private final transient int f17080j;

    x83(Object[] objArr, int i, int i2) {
        this.f17078h = objArr;
        this.f17079i = i;
        this.f17080j = i2;
    }

    public final Object get(int i) {
        q43.m15458a(i, this.f17080j, "index");
        Object obj = this.f17078h[i + i + this.f17079i];
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo6406m() {
        return true;
    }

    public final int size() {
        return this.f17080j;
    }
}
