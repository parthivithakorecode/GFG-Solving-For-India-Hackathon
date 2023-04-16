package com.google.android.gms.internal.ads;

final class a13 extends w03 {

    /* renamed from: a */
    private final String f3881a;

    /* renamed from: b */
    private final boolean f3882b;

    /* renamed from: c */
    private final boolean f3883c;

    /* synthetic */ a13(String str, boolean z, boolean z2, z03 z03) {
        this.f3881a = str;
        this.f3882b = z;
        this.f3883c = z2;
    }

    /* renamed from: b */
    public final String mo5061b() {
        return this.f3881a;
    }

    /* renamed from: c */
    public final boolean mo5062c() {
        return this.f3883c;
    }

    /* renamed from: d */
    public final boolean mo5063d() {
        return this.f3882b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w03) {
            w03 w03 = (w03) obj;
            return this.f3881a.equals(w03.mo5061b()) && this.f3882b == w03.mo5063d() && this.f3883c == w03.mo5062c();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.f3881a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f3882b ? 1237 : 1231)) * 1000003;
        if (true == this.f3883c) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f3881a;
        boolean z = this.f3882b;
        boolean z2 = this.f3883c;
        StringBuilder sb = new StringBuilder(str.length() + 99);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
