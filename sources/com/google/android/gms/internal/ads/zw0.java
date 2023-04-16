package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;
import p054h1.C2694t;

public final class zw0 implements kv3<hj0> {

    /* renamed from: a */
    private final yv3<Context> f18376a;

    public zw0(yv3<Context> yv3) {
        this.f18376a = yv3;
    }

    /* renamed from: b */
    public final hj0 mo5051a() {
        Context b = ((gw0) this.f18376a).mo7719b();
        cc0 b2 = C2694t.m21598g().mo10759b(b, po0.m15177c());
        wb0<JSONObject> wb0 = zb0.f18143b;
        b2.mo6122a("google.afma.request.getAdDictionary", wb0, wb0);
        return new gj0(b, C2694t.m21598g().mo10759b(b, po0.m15177c()).mo6122a("google.afma.sdkConstants.getSdkConstants", wb0, wb0));
    }
}
