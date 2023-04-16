package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
import p069j1.C3202r1;

public final class fk2 implements hj2<JSONObject> {

    /* renamed from: a */
    private final String f6838a;

    public fk2(String str) {
        this.f6838a = str;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.f6838a);
        } catch (JSONException e) {
            C3202r1.m24016l("Failed putting Ad ID.", e);
        }
    }
}
