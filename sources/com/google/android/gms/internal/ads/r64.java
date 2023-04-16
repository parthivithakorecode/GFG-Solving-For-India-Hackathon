package com.google.android.gms.internal.ads;

final class r64 {

    /* renamed from: a */
    public final int f13526a;

    /* renamed from: b */
    public final boolean f13527b;

    public r64(int i, boolean z) {
        this.f13526a = i;
        this.f13527b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r64.class == obj.getClass()) {
            r64 r64 = (r64) obj;
            return this.f13526a == r64.f13526a && this.f13527b == r64.f13527b;
        }
    }

    public final int hashCode() {
        return (this.f13526a * 31) + (this.f13527b ? 1 : 0);
    }
}
