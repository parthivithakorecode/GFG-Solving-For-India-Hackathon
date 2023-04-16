package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p069j1.C3138a1;

public final class r60 implements t70<Object> {

    /* renamed from: a */
    private final s60 f13519a;

    public r60(s60 s60) {
        this.f13519a = s60;
    }

    /* renamed from: a */
    public final void mo5150a(Object obj, Map<String, String> map) {
        if (this.f13519a != null) {
            String str = map.get("name");
            if (str == null) {
                io0.m11130f("Ad metadata with no name parameter.");
                str = "";
            }
            Bundle bundle = null;
            if (map.containsKey("info")) {
                try {
                    bundle = C3138a1.m23819a(new JSONObject(map.get("info")));
                } catch (JSONException e) {
                    io0.m11129e("Failed to convert ad metadata to JSON.", e);
                }
            }
            if (bundle == null) {
                io0.m11128d("Failed to convert ad metadata to Bundle.");
            } else {
                this.f13519a.mo9006t(str, bundle);
            }
        }
    }
}
