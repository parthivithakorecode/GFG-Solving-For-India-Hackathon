package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import p054h1.C2694t;
import p111p1.C3911o;

public final class ww2 {

    /* renamed from: a */
    private final HashMap<String, String> f16948a;

    /* renamed from: b */
    private final dx2 f16949b = new dx2(C2694t.m21592a());

    private ww2() {
        HashMap<String, String> hashMap = new HashMap<>();
        this.f16948a = hashMap;
        hashMap.put("new_csi", "1");
    }

    /* renamed from: b */
    public static ww2 m19233b(String str) {
        ww2 ww2 = new ww2();
        ww2.f16948a.put("action", str);
        return ww2;
    }

    /* renamed from: c */
    public static ww2 m19234c(String str) {
        ww2 ww2 = new ww2();
        ww2.f16948a.put("request_id", str);
        return ww2;
    }

    /* renamed from: a */
    public final ww2 mo11742a(String str, String str2) {
        this.f16948a.put(str, str2);
        return this;
    }

    /* renamed from: d */
    public final ww2 mo11743d(String str) {
        this.f16949b.mo6709b(str);
        return this;
    }

    /* renamed from: e */
    public final ww2 mo11744e(String str, String str2) {
        this.f16949b.mo6710c(str, str2);
        return this;
    }

    /* renamed from: f */
    public final ww2 mo11745f(rr2 rr2) {
        this.f16948a.put("aai", rr2.f13918x);
        return this;
    }

    /* renamed from: g */
    public final ww2 mo11746g(ur2 ur2) {
        if (!TextUtils.isEmpty(ur2.f15729b)) {
            this.f16948a.put("gqi", ur2.f15729b);
        }
        return this;
    }

    /* renamed from: h */
    public final ww2 mo11747h(ds2 ds2, xn0 xn0) {
        HashMap<String, String> hashMap;
        String str;
        cs2 cs2 = ds2.f5904b;
        mo11746g(cs2.f5509b);
        if (!cs2.f5508a.isEmpty()) {
            switch (cs2.f5508a.get(0).f13886b) {
                case 1:
                    hashMap = this.f16948a;
                    str = "banner";
                    break;
                case 2:
                    hashMap = this.f16948a;
                    str = "interstitial";
                    break;
                case 3:
                    hashMap = this.f16948a;
                    str = "native_express";
                    break;
                case 4:
                    hashMap = this.f16948a;
                    str = "native_advanced";
                    break;
                case 5:
                    hashMap = this.f16948a;
                    str = "rewarded";
                    break;
                case 6:
                    this.f16948a.put("ad_format", "app_open_ad");
                    if (xn0 != null) {
                        this.f16948a.put("as", true != xn0.mo11873j() ? "0" : "1");
                        break;
                    }
                    break;
                default:
                    hashMap = this.f16948a;
                    str = "unknown";
                    break;
            }
            hashMap.put("ad_format", str);
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10609s5)).booleanValue()) {
            boolean d = C3911o.m26067d(ds2);
            this.f16948a.put("scar", String.valueOf(d));
            if (d) {
                String b = C3911o.m26065b(ds2);
                if (!TextUtils.isEmpty(b)) {
                    this.f16948a.put("ragent", b);
                }
                String a = C3911o.m26064a(ds2);
                if (!TextUtils.isEmpty(a)) {
                    this.f16948a.put("rtype", a);
                }
            }
        }
        return this;
    }

    /* renamed from: i */
    public final ww2 mo11748i(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f16948a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f16948a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    /* renamed from: j */
    public final Map<String, String> mo11749j() {
        HashMap hashMap = new HashMap(this.f16948a);
        for (cx2 next : this.f16949b.mo6708a()) {
            hashMap.put(next.f5553a, next.f5554b);
        }
        return hashMap;
    }
}
