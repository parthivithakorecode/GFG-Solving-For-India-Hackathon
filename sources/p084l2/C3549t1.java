package p084l2;

import p038f.C2591j;

/* renamed from: l2.t1 */
public final class C3549t1<T> implements C3556v1<T> {

    /* renamed from: c */
    private static final Object f21204c = new Object();

    /* renamed from: a */
    private volatile C3556v1<T> f21205a;

    /* renamed from: b */
    private volatile Object f21206b = f21204c;

    private C3549t1(C3556v1<T> v1Var) {
        this.f21205a = v1Var;
    }

    /* renamed from: a */
    public static <P extends C3556v1<T>, T> C3556v1<T> m24942a(P p) {
        C3559w1.m24965a(p);
        return p instanceof C3549t1 ? p : new C3549t1(p);
    }

    public final T zza() {
        T t = this.f21206b;
        T t2 = f21204c;
        if (t == t2) {
            synchronized (this) {
                t = this.f21206b;
                if (t == t2) {
                    t = this.f21205a.zza();
                    T t3 = this.f21206b;
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
                    this.f21206b = t;
                    this.f21205a = null;
                }
            }
        }
        return t;
    }
}
