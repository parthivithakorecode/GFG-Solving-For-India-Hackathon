package com.google.android.gms.internal.ads;

public final class iv3<T> implements kv3<T> {

    /* renamed from: a */
    private yv3<T> f8814a;

    /* renamed from: b */
    public static <T> void m11298b(yv3<T> yv3, yv3<T> yv32) {
        iv3 iv3 = (iv3) yv3;
        if (iv3.f8814a == null) {
            iv3.f8814a = yv32;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final T mo5051a() {
        yv3<T> yv3 = this.f8814a;
        if (yv3 != null) {
            return yv3.mo5051a();
        }
        throw new IllegalStateException();
    }
}
