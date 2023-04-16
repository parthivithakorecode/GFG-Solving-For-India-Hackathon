package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p054h1.C2694t;

public final class xt1 {

    /* renamed from: a */
    private final Map<String, Map<String, JSONObject>> f17346a = new ConcurrentHashMap();

    /* renamed from: b */
    private JSONObject f17347b;

    /* renamed from: c */
    private final Executor f17348c;

    /* renamed from: d */
    private boolean f17349d;

    /* renamed from: e */
    private JSONObject f17350e;

    public xt1(Executor executor) {
        this.f17348c = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final synchronized void mo11925f() {
        Map map;
        this.f17349d = true;
        on0 e = C2694t.m21607p().mo11025h().mo14084e();
        if (e != null) {
            JSONObject f = e.mo9804f();
            if (f != null) {
                this.f17347b = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10252C2)).booleanValue() ? f.optJSONObject("common_settings") : null;
                this.f17350e = f.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = f.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (!(optString == null || optJSONObject2 == null || optString2 == null)) {
                                if (this.f17346a.containsKey(optString2)) {
                                    map = this.f17346a.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.f17346a.put(optString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        }
    }

    @CheckForNull
    /* renamed from: a */
    public final JSONObject mo11920a() {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10252C2)).booleanValue()) {
            return null;
        }
        return this.f17347b;
    }

    @CheckForNull
    /* renamed from: b */
    public final JSONObject mo11921b(String str, String str2) {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10244B2)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f17349d) {
            mo11925f();
        }
        Map map = this.f17346a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String a = zt1.m20834a(this.f17350e, str, str2);
        if (a == null) {
            return null;
        }
        return (JSONObject) map.get(a);
    }

    /* renamed from: c */
    public final void mo11922c() {
        C2694t.m21607p().mo11025h().mo14072D(new ut1(this));
        this.f17348c.execute(new wt1(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo11924e() {
        this.f17348c.execute(new tt1(this));
    }
}
