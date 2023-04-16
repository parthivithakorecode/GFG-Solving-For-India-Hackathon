package com.google.android.gms.internal.ads;

import java.util.Objects;

public final class xv3<T> implements yv3<T> {

    /* renamed from: c */
    private static final Object f17362c = new Object();

    /* renamed from: a */
    private volatile yv3<T> f17363a;

    /* renamed from: b */
    private volatile Object f17364b = f17362c;

    private xv3(yv3<T> yv3) {
        this.f17363a = yv3;
    }

    /* renamed from: b */
    public static <P extends yv3<T>, T> yv3<T> m19695b(P p) {
        if ((p instanceof xv3) || (p instanceof jv3)) {
            return p;
        }
        Objects.requireNonNull(p);
        return new xv3(p);
    }

    /* renamed from: a */
    public final T mo5051a() {
        T t = this.f17364b;
        if (t != f17362c) {
            return t;
        }
        yv3<T> yv3 = this.f17363a;
        if (yv3 == null) {
            return this.f17364b;
        }
        T a = yv3.mo5051a();
        this.f17364b = a;
        this.f17363a = null;
        return a;
    }
}
