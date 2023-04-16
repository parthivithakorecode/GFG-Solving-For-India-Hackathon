package com.google.android.gms.internal.ads;

public class p20<T> {

    /* renamed from: a */
    private final String f12441a;

    /* renamed from: b */
    private final T f12442b;

    /* renamed from: c */
    private final int f12443c;

    protected p20(String str, T t, int i) {
        this.f12441a = str;
        this.f12442b = t;
        this.f12443c = i;
    }

    /* renamed from: a */
    public static p20<Double> m14767a(String str, double d) {
        return new p20<>(str, Double.valueOf(d), 3);
    }

    /* renamed from: b */
    public static p20<Long> m14768b(String str, long j) {
        return new p20<>(str, Long.valueOf(j), 2);
    }

    /* renamed from: c */
    public static p20<String> m14769c(String str, String str2) {
        return new p20<>(str, str2, 4);
    }

    /* renamed from: d */
    public static p20<Boolean> m14770d(String str, boolean z) {
        return new p20<>(str, Boolean.valueOf(z), 1);
    }

    /* renamed from: e */
    public final T mo9928e() {
        q30 a = s30.m16606a();
        if (a == null) {
            if (s30.m16607b() != null) {
                s30.m16607b().zza();
            }
            return this.f12442b;
        }
        int i = this.f12443c - 1;
        return i != 0 ? i != 1 ? i != 2 ? a.mo8326b(this.f12441a, (String) this.f12442b) : a.mo8325a(this.f12441a, ((Double) this.f12442b).doubleValue()) : a.mo8327c(this.f12441a, ((Long) this.f12442b).longValue()) : a.mo8328d(this.f12441a, ((Boolean) this.f12442b).booleanValue());
    }
}
