package com.google.android.gms.internal.ads;

public final class lv3<T> implements kv3, ev3 {

    /* renamed from: b */
    private static final lv3<Object> f10191b = new lv3<>((Object) null);

    /* renamed from: a */
    private final T f10192a;

    private lv3(T t) {
        this.f10192a = t;
    }

    /* renamed from: b */
    public static <T> kv3<T> m12941b(T t) {
        sv3.m16996a(t, "instance cannot be null");
        return new lv3(t);
    }

    /* renamed from: c */
    public static <T> kv3<T> m12942c(T t) {
        return t == null ? f10191b : new lv3(t);
    }

    /* renamed from: a */
    public final T mo5051a() {
        return this.f10192a;
    }
}
