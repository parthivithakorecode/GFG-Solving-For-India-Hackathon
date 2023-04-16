package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p069j1.C3202r1;

public final class el2 implements hj2<JSONObject> {

    /* renamed from: a */
    private final List<String> f6274a;

    public el2(List<String> list) {
        this.f6274a = list;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.f6274a));
        } catch (JSONException unused) {
            C3202r1.m24015k("Failed putting experiment ids.");
        }
    }
}
