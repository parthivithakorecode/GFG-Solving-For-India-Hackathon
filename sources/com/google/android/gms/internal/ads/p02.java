package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p054h1.C2694t;

public final class p02 {

    /* renamed from: a */
    private final bw0 f12393a;

    /* renamed from: b */
    private final Context f12394b;

    /* renamed from: c */
    private final po0 f12395c;

    /* renamed from: d */
    private final ks2 f12396d;

    /* renamed from: e */
    private final Executor f12397e;

    /* renamed from: f */
    private final String f12398f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final rd1 f12399g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final vd1 f12400h;

    public p02(bw0 bw0, Context context, po0 po0, ks2 ks2, Executor executor, String str, rd1 rd1, vd1 vd1) {
        this.f12393a = bw0;
        this.f12394b = context;
        this.f12395c = po0;
        this.f12396d = ks2;
        this.f12397e = executor;
        this.f12398f = str;
        this.f12399g = rd1;
        this.f12400h = vd1;
    }

    /* renamed from: e */
    private final cc3<ds2> m14735e(String str, String str2) {
        cc0 a = C2694t.m21598g().mo10758a(this.f12394b, this.f12395c);
        wb0<JSONObject> wb0 = zb0.f18143b;
        cc3<ds2> n = rb3.m16136n(rb3.m16136n(rb3.m16136n(rb3.m16131i(""), new n02(this, str, str2), this.f12397e), new l02(a.mo6122a("google.afma.response.normalize", wb0, wb0)), this.f12397e), new m02(this), this.f12397e);
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10609s5)).booleanValue()) {
            rb3.m16140r(n, new o02(this), wo0.f16891f);
        }
        return n;
    }

    /* renamed from: f */
    private final String m14736f(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f12398f));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            io0.m11131g("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    /* renamed from: g */
    private static final String m14737g(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: c */
    public final cc3<ds2> mo9910c() {
        String str = this.f12396d.f9639d.f9666C;
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10582p5)).booleanValue()) {
                String g = m14737g(str);
                if (TextUtils.isEmpty(g)) {
                    if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10609s5)).booleanValue()) {
                        this.f12400h.mo8544h(true);
                    }
                    return rb3.m16130h(new u82(15, "Invalid ad string."));
                }
                String b = this.f12393a.mo5613u().mo15370b(g);
                if (!TextUtils.isEmpty(b)) {
                    return m14735e(str, m14736f(b));
                }
            }
        }
        C1531av avVar = this.f12396d.f9639d.f9685x;
        if (avVar != null) {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10564n5)).booleanValue()) {
                String g2 = m14737g(avVar.f4363f);
                String g3 = m14737g(avVar.f4364g);
                if (!TextUtils.isEmpty(g3) && g2.equals(g3)) {
                    this.f12393a.mo5613u().mo15372d(g2);
                }
            }
            return m14735e(avVar.f4363f, m14736f(avVar.f4364g));
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10609s5)).booleanValue()) {
            this.f12400h.mo8544h(true);
        }
        return rb3.m16130h(new u82(14, "Mismatch request IDs."));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ cc3 mo9911d(JSONObject jSONObject) {
        return rb3.m16131i(new ds2(new as2(this.f12396d), cs2.m7548a(new StringReader(jSONObject.toString()))));
    }
}
