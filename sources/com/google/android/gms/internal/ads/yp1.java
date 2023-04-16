package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

public final class yp1 {

    /* renamed from: a */
    private final Executor f17836a;

    /* renamed from: b */
    private final tp1 f17837b;

    public yp1(Executor executor, tp1 tp1) {
        this.f17836a = executor;
        this.f17837b = tp1;
    }

    /* renamed from: a */
    public final cc3<List<xp1>> mo12071a(JSONObject jSONObject, String str) {
        cc3<O> cc3;
        String optString;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return rb3.m16131i(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            xp1 xp1 = null;
            if (!(optJSONObject == null || (optString = optJSONObject.optString("name")) == null)) {
                String optString2 = optJSONObject.optString("type");
                if ("string".equals(optString2)) {
                    xp1 = new xp1(optString, optJSONObject.optString("string_value"));
                } else if ("image".equals(optString2)) {
                    cc3 = rb3.m16135m(this.f17837b.mo11051e(optJSONObject, "image_value"), new vp1(optString), this.f17836a);
                    arrayList.add(cc3);
                }
            }
            cc3 = rb3.m16131i(xp1);
            arrayList.add(cc3);
        }
        return rb3.m16135m(rb3.m16127e(arrayList), wp1.f16902a, this.f17836a);
    }
}
