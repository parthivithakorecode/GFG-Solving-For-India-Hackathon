package com.google.android.gms.internal.ads;

final class t83<E> extends e73<E> {

    /* renamed from: j */
    static final e73<Object> f14783j = new t83(new Object[0], 0);

    /* renamed from: h */
    final transient Object[] f14784h;

    /* renamed from: i */
    private final transient int f14785i;

    t83(Object[] objArr, int i) {
        this.f14784h = objArr;
        this.f14785i = i;
    }

    public final E get(int i) {
        q43.m15458a(i, this.f14785i, "index");
        E e = this.f14784h[i];
        e.getClass();
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo6858h(Object[] objArr, int i) {
        System.arraycopy(this.f14784h, 0, objArr, i, this.f14785i);
        return i + this.f14785i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final int mo6404i() {
        return this.f14785i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final int mo6405j() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo6406m() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final Object[] mo6407n() {
        return this.f14784h;
    }

    public final int size() {
        return this.f14785i;
    }
}
