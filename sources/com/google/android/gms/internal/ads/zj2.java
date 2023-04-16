package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p033e1.C2538a;
import p069j1.C3138a1;
import p069j1.C3202r1;

public final class zj2 implements hj2<JSONObject> {

    /* renamed from: a */
    private final C2538a.C2539a f18265a;

    /* renamed from: b */
    private final String f18266b;

    public zj2(C2538a.C2539a aVar, String str) {
        this.f18265a = aVar;
        this.f18266b = str;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        try {
            JSONObject f = C3138a1.m23824f((JSONObject) obj, "pii");
            C2538a.C2539a aVar = this.f18265a;
            if (aVar == null || TextUtils.isEmpty(aVar.mo12454a())) {
                f.put("pdid", this.f18266b);
                f.put("pdidtype", "ssaid");
                return;
            }
            f.put("rdid", this.f18265a.mo12454a());
            f.put("is_lat", this.f18265a.mo12455b());
            f.put("idtype", "adid");
        } catch (JSONException e) {
            C3202r1.m24016l("Failed putting Ad ID.", e);
        }
    }
}
