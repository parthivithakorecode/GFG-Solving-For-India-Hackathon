package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002a1.C0024h;
import p054h1.C2675a;
import p054h1.C2676b;
import p054h1.C2686l;
import p054h1.C2694t;
import p069j1.C3138a1;

public final class tp1 {

    /* renamed from: a */
    private final Context f14940a;

    /* renamed from: b */
    private final bp1 f14941b;

    /* renamed from: c */
    private final C1734gb f14942c;

    /* renamed from: d */
    private final po0 f14943d;

    /* renamed from: e */
    private final C2675a f14944e;

    /* renamed from: f */
    private final C1527ar f14945f;

    /* renamed from: g */
    private final Executor f14946g;

    /* renamed from: h */
    private final b40 f14947h;

    /* renamed from: i */
    private final lq1 f14948i;

    /* renamed from: j */
    private final et1 f14949j;

    /* renamed from: k */
    private final ScheduledExecutorService f14950k;

    /* renamed from: l */
    private final yr1 f14951l;

    /* renamed from: m */
    private final wv1 f14952m;

    /* renamed from: n */
    private final xw2 f14953n;

    /* renamed from: o */
    private final cy2 f14954o;

    /* renamed from: p */
    private final o42 f14955p;

    public tp1(Context context, bp1 bp1, C1734gb gbVar, po0 po0, C2675a aVar, C1527ar arVar, Executor executor, ks2 ks2, lq1 lq1, et1 et1, ScheduledExecutorService scheduledExecutorService, wv1 wv1, xw2 xw2, cy2 cy2, o42 o42, yr1 yr1) {
        this.f14940a = context;
        this.f14941b = bp1;
        this.f14942c = gbVar;
        this.f14943d = po0;
        this.f14944e = aVar;
        this.f14945f = arVar;
        this.f14946g = executor;
        this.f14947h = ks2.f9644i;
        this.f14948i = lq1;
        this.f14949j = et1;
        this.f14950k = scheduledExecutorService;
        this.f14952m = wv1;
        this.f14953n = xw2;
        this.f14954o = cy2;
        this.f14955p = o42;
        this.f14951l = yr1;
    }

    /* renamed from: i */
    public static final C2351wz m17392i(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return m17401r(optJSONObject);
    }

    /* renamed from: j */
    public static final List<C2351wz> m17393j(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return e73.m8347v();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return e73.m8347v();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            C2351wz r = m17401r(optJSONArray.optJSONObject(i));
            if (r != null) {
                arrayList.add(r);
            }
        }
        return e73.m8345t(arrayList);
    }

    /* renamed from: k */
    private final C2087pv m17394k(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return C2087pv.m15287e();
            }
            i = 0;
        }
        return new C2087pv(this.f14940a, new C0024h(i, i2));
    }

    /* renamed from: l */
    private static <T> cc3<T> m17395l(cc3<T> cc3, T t) {
        return rb3.m16129g(cc3, Exception.class, new ip1((Object) null), wo0.f16891f);
    }

    /* renamed from: m */
    private static <T> cc3<T> m17396m(boolean z, cc3<T> cc3, T t) {
        return z ? rb3.m16136n(cc3, new pp1(cc3), wo0.f16891f) : m17395l(cc3, (Object) null);
    }

    /* renamed from: n */
    private final cc3<z30> m17397n(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return rb3.m16131i(null);
        }
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return rb3.m16131i(null);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        int optInt = jSONObject.optInt("width", -1);
        int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return rb3.m16131i(new z30((Drawable) null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return m17396m(jSONObject.optBoolean("require"), rb3.m16135m(this.f14941b.mo5913b(optString, optDouble, optBoolean), new lp1(optString, optDouble, optInt, optInt2), this.f14946g), (Object) null);
    }

    /* renamed from: o */
    private final cc3<List<z30>> m17398o(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return rb3.m16131i(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(m17397n(jSONArray.optJSONObject(i), z));
        }
        return rb3.m16135m(rb3.m16127e(arrayList), mp1.f10987a, this.f14946g);
    }

    /* renamed from: p */
    private final cc3<eu0> m17399p(JSONObject jSONObject, rr2 rr2, ur2 ur2) {
        cc3<eu0> b = this.f14948i.mo8991b(jSONObject.optString("base_url"), jSONObject.optString("html"), rr2, ur2, m17394k(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return rb3.m16136n(b, new sp1(b), wo0.f16891f);
    }

    /* renamed from: q */
    private static Integer m17400q(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: r */
    private static final C2351wz m17401r(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new C2351wz(optString, optString2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ w30 mo11047a(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer q = m17400q(jSONObject, "bg_color");
        Integer q2 = m17400q(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", 4000);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new w30(optString, list, q, q2, num, optInt3 + optInt2, this.f14947h.f4685j, optBoolean);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ cc3 mo11048b(C2087pv pvVar, rr2 rr2, ur2 ur2, String str, String str2, Object obj) {
        eu0 a = this.f14949j.mo7072a(pvVar, rr2, ur2);
        ap0 g = ap0.m6161g(a);
        vr1 b = this.f14951l.mo12079b();
        vr1 vr1 = b;
        tv0 D0 = a.mo7077D0();
        C2676b bVar = r3;
        C2676b bVar2 = new C2676b(this.f14940a, (ml0) null, (ji0) null);
        D0.mo9053k0(b, vr1, b, b, b, false, (w70) null, bVar, (fg0) null, (ml0) null, this.f14955p, this.f14954o, this.f14952m, this.f14953n, (u70) null, b);
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10597r2)).booleanValue()) {
            a.mo7080F0("/getNativeAdViewSignals", s70.f14310s);
        }
        a.mo7080F0("/getNativeClickMeta", s70.f14311t);
        a.mo7077D0().mo9048f1(new hp1(g));
        a.mo7098P(str, str2, (String) null);
        return g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ cc3 mo11049c(String str, Object obj) {
        C2694t.m21591A();
        eu0 a = ru0.m16446a(this.f14940a, vv0.m18686a(), "native-omid", false, false, this.f14942c, (m20) null, this.f14943d, (b20) null, (C2686l) null, this.f14944e, this.f14945f, (rr2) null, (ur2) null);
        ap0 g = ap0.m6161g(a);
        a.mo7077D0().mo9048f1(new jp1(g));
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10269E3)).booleanValue()) {
            a.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            a.loadData(str, "text/html", "UTF-8");
        }
        return g;
    }

    /* renamed from: d */
    public final cc3<w30> mo11050d(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return rb3.m16131i(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return m17396m(optJSONObject.optBoolean("require"), rb3.m16135m(m17398o(optJSONArray, false, true), new kp1(this, optJSONObject), this.f14946g), (Object) null);
    }

    /* renamed from: e */
    public final cc3<z30> mo11051e(JSONObject jSONObject, String str) {
        return m17397n(jSONObject.optJSONObject(str), this.f14947h.f4682g);
    }

    /* renamed from: f */
    public final cc3<List<z30>> mo11052f(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        b40 b40 = this.f14947h;
        return m17398o(optJSONArray, b40.f4682g, b40.f4684i);
    }

    /* renamed from: g */
    public final cc3<eu0> mo11053g(JSONObject jSONObject, String str, rr2 rr2, ur2 ur2) {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10440Z6)).booleanValue()) {
            return rb3.m16131i(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return rb3.m16131i(null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return rb3.m16131i(null);
        }
        String optString = optJSONObject.optString("base_url");
        String optString2 = optJSONObject.optString("html");
        C2087pv k = m17394k(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(optString2)) {
            return rb3.m16131i(null);
        }
        cc3 n = rb3.m16136n(rb3.m16131i(null), new np1(this, k, rr2, ur2, optString, optString2), wo0.f16890e);
        return rb3.m16136n(n, new qp1(n), wo0.f16891f);
    }

    /* renamed from: h */
    public final cc3<eu0> mo11054h(JSONObject jSONObject, rr2 rr2, ur2 ur2) {
        cc3<eu0> cc3;
        JSONObject g = C3138a1.m23825g(jSONObject, "html_containers", "instream");
        if (g != null) {
            return m17399p(g, rr2, ur2);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("vast_xml");
            boolean z = false;
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10432Y6)).booleanValue() && optJSONObject.has("html")) {
                z = true;
            }
            if (TextUtils.isEmpty(optString)) {
                if (!z) {
                    io0.m11131g("Required field 'vast_xml' or 'html' is missing");
                }
            } else if (!z) {
                cc3 = this.f14948i.mo8990a(optJSONObject);
                return m17395l(rb3.m16137o(cc3, (long) ((Integer) C2199sw.m17001c().mo8579b(m10.f10606s2)).intValue(), TimeUnit.SECONDS, this.f14950k), (Object) null);
            }
            cc3 = m17399p(optJSONObject, rr2, ur2);
            return m17395l(rb3.m16137o(cc3, (long) ((Integer) C2199sw.m17001c().mo8579b(m10.f10606s2)).intValue(), TimeUnit.SECONDS, this.f14950k), (Object) null);
        }
        return rb3.m16131i(null);
    }
}
