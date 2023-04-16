package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jr */
public enum C1861jr implements cq3 {
    AD_INITIATER_UNSPECIFIED(0),
    BANNER(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);
    

    /* renamed from: s */
    private static final dq3<C1861jr> f9244s = null;

    /* renamed from: f */
    private final int f9246f;

    static {
        f9244s = new C1787hr();
    }

    private C1861jr(int i) {
        this.f9246f = i;
    }

    /* renamed from: b */
    public static C1861jr m11811b(int i) {
        switch (i) {
            case 0:
                return AD_INITIATER_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return DFP_BANNER;
            case 3:
                return INTERSTITIAL;
            case 4:
                return DFP_INTERSTITIAL;
            case 5:
                return NATIVE_EXPRESS;
            case 6:
                return AD_LOADER;
            case 7:
                return REWARD_BASED_VIDEO_AD;
            case 8:
                return BANNER_SEARCH_ADS;
            case 9:
                return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
            case 10:
                return APP_OPEN;
            case 11:
                return REWARDED_INTERSTITIAL;
            default:
                return null;
        }
    }

    /* renamed from: d */
    public static eq3 m11812d() {
        return C1824ir.f8760a;
    }

    public final String toString() {
        return Integer.toString(this.f9246f);
    }

    public final int zza() {
        return this.f9246f;
    }
}
