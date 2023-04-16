package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.g6 */
public final class C1729g6<T> {

    /* renamed from: a */
    public final T f7278a;

    /* renamed from: b */
    public final C1839j5 f7279b;

    /* renamed from: c */
    public final C1877k6 f7280c;

    /* renamed from: d */
    public boolean f7281d;

    private C1729g6(C1877k6 k6Var) {
        this.f7281d = false;
        this.f7278a = null;
        this.f7279b = null;
        this.f7280c = k6Var;
    }

    private C1729g6(T t, C1839j5 j5Var) {
        this.f7281d = false;
        this.f7278a = t;
        this.f7279b = j5Var;
        this.f7280c = null;
    }

    /* renamed from: a */
    public static <T> C1729g6<T> m9544a(C1877k6 k6Var) {
        return new C1729g6<>(k6Var);
    }

    /* renamed from: b */
    public static <T> C1729g6<T> m9545b(T t, C1839j5 j5Var) {
        return new C1729g6<>(t, j5Var);
    }

    /* renamed from: c */
    public final boolean mo7509c() {
        return this.f7280c == null;
    }
}
