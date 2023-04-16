package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ot */
public enum C2048ot implements cq3 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);
    

    /* renamed from: m */
    private static final dq3<C2048ot> f12199m = null;

    /* renamed from: f */
    private final int f12201f;

    static {
        f12199m = new C1974mt();
    }

    private C2048ot(int i) {
        this.f12201f = i;
    }

    /* renamed from: b */
    public static C2048ot m14629b(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return CONNECTING;
        }
        if (i == 2) {
            return CONNECTED;
        }
        if (i == 3) {
            return DISCONNECTING;
        }
        if (i == 4) {
            return DISCONNECTED;
        }
        if (i != 5) {
            return null;
        }
        return SUSPENDED;
    }

    /* renamed from: d */
    public static eq3 m14630d() {
        return C2011nt.f11684a;
    }

    public final String toString() {
        return Integer.toString(this.f12201f);
    }

    public final int zza() {
        return this.f12201f;
    }
}
