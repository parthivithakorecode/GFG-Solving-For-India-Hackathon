package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONObject;
import p054h1.C2694t;

@ParametersAreNonnullByDefault
public final class xc0 {

    /* renamed from: a */
    public final String f17114a;

    /* renamed from: b */
    public final String f17115b;

    /* renamed from: c */
    public final List<String> f17116c;

    /* renamed from: d */
    public final String f17117d;

    /* renamed from: e */
    public final String f17118e;

    /* renamed from: f */
    public final List<String> f17119f;

    /* renamed from: g */
    public final List<String> f17120g;

    /* renamed from: h */
    public final List<String> f17121h;

    /* renamed from: i */
    public final List<String> f17122i;

    /* renamed from: j */
    public final List<String> f17123j;

    /* renamed from: k */
    public final String f17124k;

    /* renamed from: l */
    public final List<String> f17125l;

    /* renamed from: m */
    public final List<String> f17126m;

    /* renamed from: n */
    public final List<String> f17127n;

    /* renamed from: o */
    public final String f17128o;

    /* renamed from: p */
    public final String f17129p;

    /* renamed from: q */
    public final String f17130q;

    /* renamed from: r */
    public final String f17131r;

    /* renamed from: s */
    public final String f17132s;

    /* renamed from: t */
    public final List<String> f17133t;

    /* renamed from: u */
    public final String f17134u;

    /* renamed from: v */
    public final String f17135v;

    public xc0(JSONObject jSONObject) {
        List<String> list;
        this.f17115b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f17116c = Collections.unmodifiableList(arrayList);
        this.f17117d = jSONObject.optString("allocation_id", (String) null);
        C2694t.m21599h();
        this.f17119f = zc0.m20589a(jSONObject, "clickurl");
        C2694t.m21599h();
        this.f17120g = zc0.m20589a(jSONObject, "imp_urls");
        C2694t.m21599h();
        this.f17121h = zc0.m20589a(jSONObject, "downloaded_imp_urls");
        C2694t.m21599h();
        this.f17123j = zc0.m20589a(jSONObject, "fill_urls");
        C2694t.m21599h();
        this.f17125l = zc0.m20589a(jSONObject, "video_start_urls");
        C2694t.m21599h();
        this.f17127n = zc0.m20589a(jSONObject, "video_complete_urls");
        C2694t.m21599h();
        this.f17126m = zc0.m20589a(jSONObject, "video_reward_urls");
        this.f17128o = jSONObject.optString("transaction_id");
        this.f17129p = jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            C2694t.m21599h();
            list = zc0.m20589a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.f17122i = list;
        this.f17114a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f17124k = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f17118e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.f17130q = jSONObject.optString("html_template", (String) null);
        this.f17131r = jSONObject.optString("ad_base_url", (String) null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.f17132s = optJSONObject3 != null ? optJSONObject3.toString() : null;
        C2694t.m21599h();
        this.f17133t = zc0.m20589a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.f17134u = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.f17135v = jSONObject.optString("response_type", (String) null);
        jSONObject.optLong("ad_network_timeout_millis", -1);
    }
}
