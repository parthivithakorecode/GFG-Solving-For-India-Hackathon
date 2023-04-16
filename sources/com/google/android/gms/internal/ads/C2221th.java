package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.th */
public final class C2221th {

    /* renamed from: f */
    public static final C2221th f14853f = new C2221th(new C2145rf());

    /* renamed from: g */
    public static final my3<C2221th> f14854g = C2107qe.f13143a;

    /* renamed from: a */
    public final long f14855a;

    /* renamed from: b */
    public final long f14856b;

    /* renamed from: c */
    public final long f14857c;

    /* renamed from: d */
    public final float f14858d;

    /* renamed from: e */
    public final float f14859e;

    private C2221th(C2145rf rfVar) {
        this.f14855a = -9223372036854775807L;
        this.f14856b = -9223372036854775807L;
        this.f14857c = -9223372036854775807L;
        this.f14858d = -3.4028235E38f;
        this.f14859e = -3.4028235E38f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2221th)) {
            return false;
        }
        long j = ((C2221th) obj).f14855a;
        return true;
    }

    public final int hashCode() {
        int i = (int) -9223372034707292159L;
        return (((((((i * 31) + i) * 31) + i) * 31) + Float.floatToIntBits(-3.4028235E38f)) * 31) + Float.floatToIntBits(-3.4028235E38f);
    }
}
