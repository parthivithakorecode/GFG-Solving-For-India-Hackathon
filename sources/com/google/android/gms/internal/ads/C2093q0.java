package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.q0 */
class C2093q0 {

    /* renamed from: a */
    public final int f12974a;

    public C2093q0(int i) {
        this.f12974a = i;
    }

    /* renamed from: a */
    public static int m15345a(int i) {
        return (i >> 24) & 255;
    }

    /* renamed from: b */
    public static String m15346b(int i) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return m15346b(this.f12974a);
    }
}
