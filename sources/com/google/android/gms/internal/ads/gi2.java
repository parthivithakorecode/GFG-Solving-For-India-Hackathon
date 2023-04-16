package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

public final /* synthetic */ class gi2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f7494a;

    public /* synthetic */ gi2(List list) {
        this.f7494a = list;
    }

    public final Object call() {
        List<cc3> list = this.f7494a;
        JSONArray jSONArray = new JSONArray();
        for (cc3 cc3 : list) {
            if (((JSONObject) cc3.get()) != null) {
                jSONArray.put(cc3.get());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return new ii2(jSONArray.toString());
    }
}
