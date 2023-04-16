package com.google.android.gms.internal.ads;

public final class qd4 {

    /* renamed from: c */
    public static final qd4 f13140c = new qd4(0, 0);

    /* renamed from: a */
    public final long f13141a;

    /* renamed from: b */
    public final long f13142b;

    public qd4(long j, long j2) {
        this.f13141a = j;
        this.f13142b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qd4.class == obj.getClass()) {
            qd4 qd4 = (qd4) obj;
            return this.f13141a == qd4.f13141a && this.f13142b == qd4.f13142b;
        }
    }

    public final int hashCode() {
        return (((int) this.f13141a) * 31) + ((int) this.f13142b);
    }

    public final String toString() {
        long j = this.f13141a;
        long j2 = this.f13142b;
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(j);
        sb.append(", position=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
