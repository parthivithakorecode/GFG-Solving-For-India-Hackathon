package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p054h1.C2694t;
import p069j1.C3202r1;

public final class zl2 implements hj2<JSONObject> {

    /* renamed from: a */
    private final Map<String, Object> f18286a;

    public zl2(Map<String, Object> map) {
        this.f18286a = map;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", C2694t.m21608q().mo14024N(this.f18286a));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e.getMessage());
            C3202r1.m24015k(valueOf.length() != 0 ? "Could not encode video decoder properties: ".concat(valueOf) : new String("Could not encode video decoder properties: "));
        }
    }
}
