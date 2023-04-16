package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
import p069j1.C3138a1;

public final class vm1 extends wm1 {

    /* renamed from: b */
    private final JSONObject f16353b;

    /* renamed from: c */
    private final boolean f16354c;

    /* renamed from: d */
    private final boolean f16355d;

    /* renamed from: e */
    private final boolean f16356e;

    /* renamed from: f */
    private final boolean f16357f;

    /* renamed from: g */
    private final String f16358g;

    public vm1(rr2 rr2, JSONObject jSONObject) {
        super(rr2);
        this.f16353b = C3138a1.m23825g(jSONObject, "tracking_urls_and_actions", "active_view");
        boolean z = false;
        this.f16354c = C3138a1.m23829k(false, jSONObject, "allow_pub_owned_ad_view");
        this.f16355d = C3138a1.m23829k(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f16356e = C3138a1.m23829k(false, jSONObject, "enable_omid");
        this.f16358g = C3138a1.m23820b("", jSONObject, "watermark_overlay_png_base64");
        this.f16357f = jSONObject.optJSONObject("overlay") != null ? true : z;
    }

    /* renamed from: a */
    public final String mo11493a() {
        return this.f16358g;
    }

    /* renamed from: b */
    public final JSONObject mo11494b() {
        JSONObject jSONObject = this.f16353b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f16858a.f13858A);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final boolean mo11495c() {
        return this.f16356e;
    }

    /* renamed from: d */
    public final boolean mo11496d() {
        return this.f16354c;
    }

    /* renamed from: e */
    public final boolean mo11497e() {
        return this.f16355d;
    }

    /* renamed from: f */
    public final boolean mo11498f() {
        return this.f16357f;
    }
}
