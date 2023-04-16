package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p054h1.C2694t;
import p069j1.C3208t1;

public abstract class qm0 {

    /* renamed from: a */
    static qm0 f13233a;

    /* renamed from: d */
    public static synchronized qm0 m15707d(Context context) {
        synchronized (qm0.class) {
            qm0 qm0 = f13233a;
            if (qm0 != null) {
                return qm0;
            }
            Context applicationContext = context.getApplicationContext();
            m10.m13007c(applicationContext);
            C3208t1 h = C2694t.m21607p().mo11025h();
            h.mo14103x(applicationContext);
            ul0 ul0 = new ul0((tl0) null);
            ul0.mo11238b(applicationContext);
            ul0.mo11239c(C2694t.m21592a());
            ul0.mo11237a(h);
            ul0.mo11240d(C2694t.m21606o());
            qm0 e = ul0.mo11241e();
            f13233a = e;
            e.mo10324a().mo9547a();
            f13233a.mo10325b().mo10527c();
            um0 c = f13233a.mo10326c();
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10541l0)).booleanValue()) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject((String) C2199sw.m17001c().mo8579b(m10.f10559n0));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        HashSet hashSet = new HashSet();
                        JSONArray optJSONArray = jSONObject.optJSONArray(next);
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                String optString = optJSONArray.optString(i);
                                if (optString != null) {
                                    hashSet.add(optString);
                                }
                            }
                            hashMap.put(next, hashSet);
                        }
                    }
                    for (String c2 : hashMap.keySet()) {
                        c.mo11247c(c2);
                    }
                    c.mo11248d(new sm0(c, hashMap));
                } catch (JSONException e2) {
                    io0.m11127c("Failed to parse listening list", e2);
                }
            }
            qm0 qm02 = f13233a;
            return qm02;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract nl0 mo10324a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract rl0 mo10325b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract um0 mo10326c();
}
