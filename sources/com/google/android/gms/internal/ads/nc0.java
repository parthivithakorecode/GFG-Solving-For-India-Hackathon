package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

final class nc0 implements h80 {

    /* renamed from: a */
    private final bp0 f11412a;

    /* renamed from: b */
    final /* synthetic */ oc0 f11413b;

    public nc0(oc0 oc0, bp0 bp0) {
        this.f11413b = oc0;
        this.f11412a = bp0;
    }

    /* renamed from: a */
    public final void mo7286a(JSONObject jSONObject) {
        try {
            this.f11412a.mo5907e(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f11412a.mo5908f(e);
        }
    }

    /* renamed from: b */
    public final void mo7287b(String str) {
        if (str == null) {
            try {
                this.f11412a.mo5908f(new qb0());
            } catch (IllegalStateException unused) {
            }
        } else {
            this.f11412a.mo5908f(new qb0(str));
        }
    }
}
