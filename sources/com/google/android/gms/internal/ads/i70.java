package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

final class i70 implements t70<eu0> {
    i70() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5150a(Object obj, Map map) {
        JSONObject a;
        eu0 eu0 = (eu0) obj;
        a40 a0 = eu0.mo7107a0();
        if (a0 == null || (a = a0.mo5081a()) == null) {
            eu0.mo6423s("nativeClickMetaReady", new JSONObject());
        } else {
            eu0.mo6423s("nativeClickMetaReady", a);
        }
    }
}
