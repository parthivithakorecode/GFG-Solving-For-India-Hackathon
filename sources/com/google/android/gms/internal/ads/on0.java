package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p054h1.C2694t;

public final class on0 {

    /* renamed from: a */
    private final List<String> f12101a = new ArrayList();

    /* renamed from: b */
    private final List<String> f12102b = new ArrayList();

    /* renamed from: c */
    private final Map<String, yc0> f12103c = new HashMap();

    /* renamed from: d */
    private String f12104d;

    /* renamed from: e */
    private String f12105e;

    /* renamed from: f */
    private long f12106f;

    /* renamed from: g */
    private JSONObject f12107g;

    /* renamed from: h */
    private boolean f12108h = false;

    /* renamed from: i */
    private final List<String> f12109i = new ArrayList();

    /* renamed from: j */
    private boolean f12110j = false;

    public on0(String str, long j) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        JSONObject optJSONObject2;
        this.f12105e = str;
        this.f12106f = j;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f12107g = jSONObject;
                if (jSONObject.optInt("status", -1) != 1) {
                    this.f12108h = false;
                    io0.m11131g("App settings could not be fetched successfully.");
                    return;
                }
                this.f12108h = true;
                this.f12104d = this.f12107g.optString("app_id");
                JSONArray optJSONArray2 = this.f12107g.optJSONArray("ad_unit_id_settings");
                if (optJSONArray2 != null) {
                    for (int i = 0; i < optJSONArray2.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                        String optString = jSONObject2.optString("format");
                        String optString2 = jSONObject2.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.f12102b.add(optString2);
                                } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject2 = jSONObject2.optJSONObject("mediation_config")) != null) {
                                    this.f12103c.put(optString2, new yc0(optJSONObject2));
                                }
                            }
                        }
                    }
                }
                JSONArray optJSONArray3 = this.f12107g.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray3 != null) {
                    for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                        this.f12101a.add(optJSONArray3.optString(i2));
                    }
                }
                if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10555m5)).booleanValue()) {
                    JSONObject optJSONObject3 = this.f12107g.optJSONObject("common_settings");
                    if (!(optJSONObject3 == null || (optJSONArray = optJSONObject3.optJSONArray("loeid")) == null)) {
                        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                            this.f12109i.add(optJSONArray.get(i3).toString());
                        }
                    }
                }
                if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10318K4)).booleanValue() && (optJSONObject = this.f12107g.optJSONObject("common_settings")) != null) {
                    this.f12110j = optJSONObject.optBoolean("is_prefetching_enabled", false);
                }
            } catch (JSONException e) {
                io0.m11132h("Exception occurred while processing app setting json", e);
                C2694t.m21607p().mo11034s(e, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    /* renamed from: a */
    public final long mo9799a() {
        return this.f12106f;
    }

    /* renamed from: b */
    public final String mo9800b() {
        return this.f12104d;
    }

    /* renamed from: c */
    public final String mo9801c() {
        return this.f12105e;
    }

    /* renamed from: d */
    public final List<String> mo9802d() {
        return this.f12109i;
    }

    /* renamed from: e */
    public final Map<String, yc0> mo9803e() {
        return this.f12103c;
    }

    /* renamed from: f */
    public final JSONObject mo9804f() {
        return this.f12107g;
    }

    /* renamed from: g */
    public final void mo9805g(long j) {
        this.f12106f = j;
    }

    /* renamed from: h */
    public final boolean mo9806h() {
        return this.f12110j;
    }

    /* renamed from: i */
    public final boolean mo9807i() {
        return this.f12108h;
    }
}
