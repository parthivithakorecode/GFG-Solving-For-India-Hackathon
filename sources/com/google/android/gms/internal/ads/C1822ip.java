package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ip */
public final class C1822ip {

    /* renamed from: a */
    final long f8744a;

    /* renamed from: b */
    final String f8745b;

    /* renamed from: c */
    final int f8746c;

    C1822ip(long j, String str, int i) {
        this.f8744a = j;
        this.f8745b = str;
        this.f8746c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1822ip)) {
            C1822ip ipVar = (C1822ip) obj;
            return ipVar.f8744a == this.f8744a && ipVar.f8746c == this.f8746c;
        }
    }

    public final int hashCode() {
        return (int) this.f8744a;
    }
}
