package com.google.android.gms.internal.ads;

public final class r74 {

    /* renamed from: a */
    public final long f13531a;

    /* renamed from: b */
    public final long f13532b;

    public r74(long j, long j2) {
        this.f13531a = j;
        this.f13532b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r74)) {
            return false;
        }
        r74 r74 = (r74) obj;
        return this.f13531a == r74.f13531a && this.f13532b == r74.f13532b;
    }

    public final int hashCode() {
        return (((int) this.f13531a) * 31) + ((int) this.f13532b);
    }
}
