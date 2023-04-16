package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p054h1.C2694t;
import p069j1.C3202r1;

public final class yc0 {

    /* renamed from: a */
    public final List<xc0> f17662a;

    /* renamed from: b */
    public final List<String> f17663b;

    /* renamed from: c */
    public final List<String> f17664c;

    /* renamed from: d */
    public final List<String> f17665d;

    /* renamed from: e */
    public final List<String> f17666e;

    /* renamed from: f */
    public final List<String> f17667f;

    /* renamed from: g */
    public final String f17668g;

    /* renamed from: h */
    public final String f17669h;

    public yc0(JSONObject jSONObject) {
        if (io0.m11134j(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            C3202r1.m24015k(valueOf.length() != 0 ? "Mediation Response JSON: ".concat(valueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                xc0 xc0 = new xc0(jSONArray.getJSONObject(i2));
                "banner".equalsIgnoreCase(xc0.f17135v);
                arrayList.add(xc0);
                if (i < 0) {
                    Iterator<String> it = xc0.f17116c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f17662a = Collections.unmodifiableList(arrayList);
        this.f17668g = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        String str = null;
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1);
            C2694t.m21599h();
            this.f17663b = zc0.m20589a(optJSONObject, "click_urls");
            C2694t.m21599h();
            this.f17664c = zc0.m20589a(optJSONObject, "imp_urls");
            C2694t.m21599h();
            this.f17665d = zc0.m20589a(optJSONObject, "downloaded_imp_urls");
            C2694t.m21599h();
            this.f17666e = zc0.m20589a(optJSONObject, "nofill_urls");
            C2694t.m21599h();
            this.f17667f = zc0.m20589a(optJSONObject, "remote_ping_urls");
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong("refresh", -1);
            yj0 c = yj0.m20048c(optJSONObject.optJSONArray("rewards"));
            this.f17669h = c != null ? c.f17763f : str;
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
            return;
        }
        this.f17663b = null;
        this.f17664c = null;
        this.f17665d = null;
        this.f17666e = null;
        this.f17667f = null;
        this.f17669h = null;
    }
}
