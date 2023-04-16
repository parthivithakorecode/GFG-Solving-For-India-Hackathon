package com.google.android.gms.internal.ads;

public final class ay3 {

    /* renamed from: c */
    public static final ay3 f4429c;

    /* renamed from: d */
    public static final ay3 f4430d = new ay3(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: e */
    public static final ay3 f4431e = new ay3(Long.MAX_VALUE, 0);

    /* renamed from: f */
    public static final ay3 f4432f = new ay3(0, Long.MAX_VALUE);

    /* renamed from: g */
    public static final ay3 f4433g;

    /* renamed from: a */
    public final long f4434a;

    /* renamed from: b */
    public final long f4435b;

    static {
        ay3 ay3 = new ay3(0, 0);
        f4429c = ay3;
        f4433g = ay3;
    }

    public ay3(long j, long j2) {
        boolean z = true;
        wu1.m19205d(j >= 0);
        wu1.m19205d(j2 < 0 ? false : z);
        this.f4434a = j;
        this.f4435b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ay3.class == obj.getClass()) {
            ay3 ay3 = (ay3) obj;
            return this.f4434a == ay3.f4434a && this.f4435b == ay3.f4435b;
        }
    }

    public final int hashCode() {
        return (((int) this.f4434a) * 31) + ((int) this.f4435b);
    }
}
