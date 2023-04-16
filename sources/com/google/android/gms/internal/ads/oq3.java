package com.google.android.gms.internal.ads;

public enum oq3 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(uo3.class, uo3.class, uo3.f15667g),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: f */
    private final Class<?> f12157f;

    /* renamed from: g */
    private final Class<?> f12158g;

    /* renamed from: h */
    private final Object f12159h;

    private oq3(Class<?> cls, Class<?> cls2, Object obj) {
        this.f12157f = cls;
        this.f12158g = cls2;
        this.f12159h = obj;
    }

    /* renamed from: b */
    public final Class<?> mo9837b() {
        return this.f12158g;
    }
}
