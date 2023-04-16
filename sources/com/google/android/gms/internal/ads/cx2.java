package com.google.android.gms.internal.ads;

final class cx2 {

    /* renamed from: a */
    public final String f5553a;

    /* renamed from: b */
    public final String f5554b;

    public cx2(String str, String str2) {
        this.f5553a = str;
        this.f5554b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx2)) {
            return false;
        }
        cx2 cx2 = (cx2) obj;
        return this.f5553a.equals(cx2.f5553a) && this.f5554b.equals(cx2.f5554b);
    }

    public final int hashCode() {
        String valueOf = String.valueOf(this.f5553a);
        String valueOf2 = String.valueOf(this.f5554b);
        return (valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).hashCode();
    }
}
