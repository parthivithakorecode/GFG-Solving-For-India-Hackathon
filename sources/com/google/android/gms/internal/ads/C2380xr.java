package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xr */
public enum C2380xr implements cq3 {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);
    

    /* renamed from: r */
    private static final dq3<C2380xr> f17323r = null;

    /* renamed from: f */
    private final int f17325f;

    static {
        f17323r = new C2305vr();
    }

    private C2380xr(int i) {
        this.f17325f = i;
    }

    /* renamed from: b */
    public static C2380xr m19632b(int i) {
        switch (i) {
            case 0:
                return AD_FORMAT_TYPE_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return INTERSTITIAL;
            case 3:
                return NATIVE_EXPRESS;
            case 4:
                return NATIVE_CONTENT;
            case 5:
                return NATIVE_APP_INSTALL;
            case 6:
                return NATIVE_CUSTOM_TEMPLATE;
            case 7:
                return DFP_BANNER;
            case 8:
                return DFP_INTERSTITIAL;
            case 9:
                return REWARD_BASED_VIDEO_AD;
            case 10:
                return BANNER_SEARCH_ADS;
            default:
                return null;
        }
    }

    /* renamed from: d */
    public static eq3 m19633d() {
        return C2343wr.f16913a;
    }

    public final String toString() {
        return Integer.toString(this.f17325f);
    }

    public final int zza() {
        return this.f17325f;
    }
}
