package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p069j1.C3138a1;
import p069j1.C3202r1;

public final class ik2 implements hj2<JSONObject> {

    /* renamed from: a */
    private final JSONObject f8675a;

    public ik2(JSONObject jSONObject) {
        this.f8675a = jSONObject;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        try {
            JSONObject f = C3138a1.m23824f((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.f8675a;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                f.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
            C3202r1.m24015k("Failed putting app indexing json.");
        }
    }
}
