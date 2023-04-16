package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class m31 implements kv3<JSONObject> {

    /* renamed from: a */
    private final yv3<rr2> f10706a;

    public m31(yv3<rr2> yv3) {
        this.f10706a = yv3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        try {
            return new JSONObject(((m71) this.f10706a).mo9148b().f13858A);
        } catch (JSONException unused) {
            return null;
        }
    }
}
