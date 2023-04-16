package com.google.android.gms.internal.ads;

import java.util.Objects;
import p038f.C2591j;

public final class jv3<T> implements yv3, ev3 {

    /* renamed from: c */
    private static final Object f9272c = new Object();

    /* renamed from: a */
    private volatile yv3<T> f9273a;

    /* renamed from: b */
    private volatile Object f9274b = f9272c;

    private jv3(yv3<T> yv3) {
        this.f9273a = yv3;
    }

    /* renamed from: b */
    public static <P extends yv3<T>, T> ev3<T> m11855b(P p) {
        if (p instanceof ev3) {
            return (ev3) p;
        }
        Objects.requireNonNull(p);
        return new jv3(p);
    }

    /* renamed from: c */
    public static <P extends yv3<T>, T> yv3<T> m11856c(P p) {
        Objects.requireNonNull(p);
        return p instanceof jv3 ? p : new jv3(p);
    }

    /* renamed from: a */
    public final T mo5051a() {
        T t = this.f9274b;
        T t2 = f9272c;
        if (t == t2) {
            synchronized (this) {
                t = this.f9274b;
                if (t == t2) {
                    t = this.f9273a.mo5051a();
                    T t3 = this.f9274b;
                    if (t3 != t2) {
                        if (t3 != t) {
                            String valueOf = String.valueOf(t3);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(valueOf.length() + C2591j.f18719E0 + valueOf2.length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f9274b = t;
                    this.f9273a = null;
                }
            }
        }
        return t;
    }
}
