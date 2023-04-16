package com.google.android.gms.internal.ads;

public final class nd4 {

    /* renamed from: a */
    public final qd4 f11427a;

    /* renamed from: b */
    public final qd4 f11428b;

    public nd4(qd4 qd4, qd4 qd42) {
        this.f11427a = qd4;
        this.f11428b = qd42;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nd4.class == obj.getClass()) {
            nd4 nd4 = (nd4) obj;
            return this.f11427a.equals(nd4.f11427a) && this.f11428b.equals(nd4.f11428b);
        }
    }

    public final int hashCode() {
        return (this.f11427a.hashCode() * 31) + this.f11428b.hashCode();
    }

    public final String toString() {
        String obj = this.f11427a.toString();
        String concat = this.f11427a.equals(this.f11428b) ? "" : ", ".concat(this.f11428b.toString());
        StringBuilder sb = new StringBuilder(obj.length() + 2 + concat.length());
        sb.append("[");
        sb.append(obj);
        sb.append(concat);
        sb.append("]");
        return sb.toString();
    }
}
