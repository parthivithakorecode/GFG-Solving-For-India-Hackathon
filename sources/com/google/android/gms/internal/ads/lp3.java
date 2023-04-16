package com.google.android.gms.internal.ads;

final class lp3 {

    /* renamed from: a */
    private final Object f10116a;

    /* renamed from: b */
    private final int f10117b;

    lp3(Object obj, int i) {
        this.f10116a = obj;
        this.f10117b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lp3)) {
            return false;
        }
        lp3 lp3 = (lp3) obj;
        return this.f10116a == lp3.f10116a && this.f10117b == lp3.f10117b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f10116a) * 65535) + this.f10117b;
    }
}
