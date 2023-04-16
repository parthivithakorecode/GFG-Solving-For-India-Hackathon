package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p111p1.C3911o;

@Deprecated
public final class sv1 {

    /* renamed from: a */
    private final ConcurrentHashMap<String, String> f14598a;

    /* renamed from: b */
    private final xn0 f14599b;

    public sv1(cw1 cw1, xn0 xn0) {
        this.f14598a = new ConcurrentHashMap<>(cw1.f6402b);
        this.f14599b = xn0;
    }

    /* renamed from: a */
    public final Map<String, String> mo10883a() {
        return this.f14598a;
    }

    /* renamed from: b */
    public final void mo10884b(ds2 ds2) {
        String str;
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (ds2.f5904b.f5508a.size() > 0) {
            switch (ds2.f5904b.f5508a.get(0).f13886b) {
                case 1:
                    concurrentHashMap = this.f14598a;
                    str = "banner";
                    break;
                case 2:
                    concurrentHashMap = this.f14598a;
                    str = "interstitial";
                    break;
                case 3:
                    concurrentHashMap = this.f14598a;
                    str = "native_express";
                    break;
                case 4:
                    concurrentHashMap = this.f14598a;
                    str = "native_advanced";
                    break;
                case 5:
                    concurrentHashMap = this.f14598a;
                    str = "rewarded";
                    break;
                case 6:
                    this.f14598a.put("ad_format", "app_open_ad");
                    this.f14598a.put("as", true != this.f14599b.mo11873j() ? "0" : "1");
                    break;
                default:
                    concurrentHashMap = this.f14598a;
                    str = "unknown";
                    break;
            }
            concurrentHashMap.put("ad_format", str);
        }
        if (!TextUtils.isEmpty(ds2.f5904b.f5509b.f15729b)) {
            this.f14598a.put("gqi", ds2.f5904b.f5509b.f15729b);
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10609s5)).booleanValue()) {
            boolean d = C3911o.m26067d(ds2);
            this.f14598a.put("scar", String.valueOf(d));
            if (d) {
                String b = C3911o.m26065b(ds2);
                if (!TextUtils.isEmpty(b)) {
                    this.f14598a.put("ragent", b);
                }
                String a = C3911o.m26064a(ds2);
                if (!TextUtils.isEmpty(a)) {
                    this.f14598a.put("rtype", a);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo10885c(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f14598a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f14598a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
