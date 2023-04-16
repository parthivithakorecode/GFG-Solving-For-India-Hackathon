package com.google.android.gms.internal.ads;

import android.os.Bundle;
import javax.annotation.Nullable;
import org.json.JSONObject;

public final class qf2 implements hj2<Bundle> {
    @Nullable

    /* renamed from: a */
    private final JSONObject f13153a;
    @Nullable

    /* renamed from: b */
    private final JSONObject f13154b;

    public qf2(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        this.f13153a = jSONObject;
        this.f13154b = jSONObject2;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        Bundle bundle = (Bundle) obj;
        JSONObject jSONObject = this.f13153a;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f13154b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
