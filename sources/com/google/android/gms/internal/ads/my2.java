package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class my2 {

    /* renamed from: a */
    private final ty2 f11176a;

    /* renamed from: b */
    private final ty2 f11177b;

    /* renamed from: c */
    private final qy2 f11178c;

    /* renamed from: d */
    private final sy2 f11179d;

    private my2(qy2 qy2, sy2 sy2, ty2 ty2, ty2 ty22, boolean z) {
        this.f11178c = qy2;
        this.f11179d = sy2;
        this.f11176a = ty2;
        if (ty22 == null) {
            this.f11177b = ty2.NONE;
        } else {
            this.f11177b = ty22;
        }
    }

    /* renamed from: a */
    public static my2 m13528a(qy2 qy2, sy2 sy2, ty2 ty2, ty2 ty22, boolean z) {
        uz2.m18276b(sy2, "ImpressionType is null");
        uz2.m18276b(ty2, "Impression owner is null");
        if (ty2 == ty2.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (qy2 == qy2.DEFINED_BY_JAVASCRIPT && ty2 == ty2.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (sy2 != sy2.DEFINED_BY_JAVASCRIPT || ty2 != ty2.NATIVE) {
            return new my2(qy2, sy2, ty2, ty22, true);
        } else {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: b */
    public final JSONObject mo9369b() {
        String str;
        Object obj;
        JSONObject jSONObject = new JSONObject();
        sz2.m17046g(jSONObject, "impressionOwner", this.f11176a);
        if (this.f11179d != null) {
            sz2.m17046g(jSONObject, "mediaEventsOwner", this.f11177b);
            sz2.m17046g(jSONObject, "creativeType", this.f11178c);
            obj = this.f11179d;
            str = "impressionType";
        } else {
            obj = this.f11177b;
            str = "videoEventsOwner";
        }
        sz2.m17046g(jSONObject, str, obj);
        sz2.m17046g(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
