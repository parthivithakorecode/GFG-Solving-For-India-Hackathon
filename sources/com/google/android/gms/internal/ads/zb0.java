package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

public final class zb0 {

    /* renamed from: a */
    private static final Charset f18142a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final wb0<JSONObject> f18143b = new yb0();

    /* renamed from: c */
    public static final tb0<InputStream> f18144c = xb0.f17100a;

    /* renamed from: a */
    static /* synthetic */ InputStream m20577a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f18142a));
    }
}
