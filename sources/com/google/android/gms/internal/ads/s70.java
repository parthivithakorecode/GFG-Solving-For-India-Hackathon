package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URISyntaxException;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class s70 {

    /* renamed from: a */
    public static final t70<eu0> f14292a = a70.f3996a;

    /* renamed from: b */
    public static final t70<eu0> f14293b = x60.f17044a;

    /* renamed from: c */
    public static final t70<eu0> f14294c = y60.f17618a;

    /* renamed from: d */
    public static final t70<eu0> f14295d = new k70();

    /* renamed from: e */
    public static final t70<eu0> f14296e = new l70();

    /* renamed from: f */
    public static final t70<eu0> f14297f = b70.f4779a;

    /* renamed from: g */
    public static final t70<Object> f14298g = new m70();

    /* renamed from: h */
    public static final t70<eu0> f14299h = new n70();

    /* renamed from: i */
    public static final t70<eu0> f14300i = c70.f5325a;

    /* renamed from: j */
    public static final t70<eu0> f14301j = new o70();

    /* renamed from: k */
    public static final t70<eu0> f14302k = new p70();

    /* renamed from: l */
    public static final t70<tq0> f14303l = new gs0();

    /* renamed from: m */
    public static final t70<tq0> f14304m = new hs0();

    /* renamed from: n */
    public static final t70<eu0> f14305n = new v60();

    /* renamed from: o */
    public static final i80 f14306o = new i80();

    /* renamed from: p */
    public static final t70<eu0> f14307p = new q70();

    /* renamed from: q */
    public static final t70<eu0> f14308q = new r70();

    /* renamed from: r */
    public static final t70<eu0> f14309r = new g70();

    /* renamed from: s */
    public static final t70<eu0> f14310s = new h70();

    /* renamed from: t */
    public static final t70<eu0> f14311t = new i70();

    /* renamed from: a */
    public static t70<eu0> m16640a(pi1 pi1) {
        return new w60(pi1);
    }

    /* renamed from: b */
    public static cc3<String> m16641b(eu0 eu0, String str) {
        Uri parse = Uri.parse(str);
        try {
            C1734gb H = eu0.mo7083H();
            if (H != null && H.mo7563f(parse)) {
                parse = H.mo7558a(parse, eu0.getContext(), eu0.mo7105Y(), eu0.mo7127j());
            }
        } catch (C1771hb unused) {
            io0.m11131g(str.length() != 0 ? "Unable to append parameter to URL: ".concat(str) : new String("Unable to append parameter to URL: "));
        }
        String b = rm0.m16268b(parse, eu0.getContext());
        long longValue = a30.f3915e.mo9928e().longValue();
        if (longValue <= 0 || longValue > 214106404) {
            return rb3.m16131i(b);
        }
        ib3<String> E = ib3.m10985E(eu0.mo7152z0());
        f70 f70 = f70.f6728a;
        dc3 dc3 = wo0.f16891f;
        return rb3.m16128f(rb3.m16135m(rb3.m16128f(E, Throwable.class, f70, dc3), new d70(b), dc3), Throwable.class, new e70(b), dc3);
    }

    /* renamed from: c */
    static /* synthetic */ void m16642c(gv0 gv0, Map map) {
        JSONException jSONException;
        String str;
        PackageManager packageManager = gv0.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString("p");
                        String optString6 = jSONObject2.optString("c");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e) {
                                URISyntaxException uRISyntaxException = e;
                                String valueOf = String.valueOf(optString7);
                                io0.m11129e(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), uRISyntaxException);
                            }
                        }
                        boolean z = true;
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        if (packageManager.resolveActivity(intent, 65536) == null) {
                            z = false;
                        }
                        try {
                            jSONObject.put(optString, z);
                        } catch (JSONException e2) {
                            jSONException = e2;
                            str = "Error constructing openable urls response.";
                        }
                    } catch (JSONException e3) {
                        jSONException = e3;
                        str = "Error parsing the intent data.";
                        io0.m11129e(str, jSONException);
                    }
                }
                ((da0) gv0).mo6423s("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((da0) gv0).mo6423s("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((da0) gv0).mo6423s("openableIntents", new JSONObject());
        }
    }

    /* renamed from: d */
    public static void m16643d(Map<String, String> map, pi1 pi1) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10548l7)).booleanValue() && map.containsKey("sc") && map.get("sc").equals("1") && pi1 != null) {
            pi1.mo8182r();
        }
    }
}
