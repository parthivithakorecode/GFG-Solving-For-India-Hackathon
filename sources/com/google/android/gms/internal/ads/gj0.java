package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;
import p054h1.C2694t;
import p160x1.C4288j;

public final class gj0 extends hj0 {

    /* renamed from: a */
    private final Object f7495a = new Object();

    /* renamed from: b */
    private final Context f7496b;

    /* renamed from: c */
    private SharedPreferences f7497c;

    /* renamed from: d */
    private final rb0<JSONObject, JSONObject> f7498d;

    public gj0(Context context, rb0<JSONObject, JSONObject> rb0) {
        this.f7496b = context.getApplicationContext();
        this.f7498d = rb0;
    }

    /* renamed from: c */
    public static JSONObject m9800c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", po0.m15177c().f12729f);
            jSONObject.put("mf", b30.f4659a.mo9928e());
            jSONObject.put("cl", "428884702");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", C4288j.f22593a);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.m5726c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", C4288j.f22593a);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final cc3<Void> mo7643a() {
        synchronized (this.f7495a) {
            if (this.f7497c == null) {
                this.f7497c = this.f7496b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (C2694t.m21592a().mo12462a() - this.f7497c.getLong("js_last_update", 0) < b30.f4660b.mo9928e().longValue()) {
            return rb3.m16131i(null);
        }
        return rb3.m16135m(this.f7498d.mo7584a(m9800c(this.f7496b)), new ej0(this), wo0.f16891f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ Void mo7644b(JSONObject jSONObject) {
        m10.m13008d(this.f7496b, 1, jSONObject);
        this.f7497c.edit().putLong("js_last_update", C2694t.m21592a().mo12462a()).apply();
        return null;
    }
}
