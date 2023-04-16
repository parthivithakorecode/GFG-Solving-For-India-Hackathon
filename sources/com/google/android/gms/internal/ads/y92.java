package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class y92 implements c52<cf0, y62> {

    /* renamed from: a */
    private final db2 f17641a;

    public y92(db2 db2) {
        this.f17641a = db2;
    }

    /* renamed from: a */
    public final d52<cf0, y62> mo6058a(String str, JSONObject jSONObject) {
        cf0 a = this.f17641a.mo6434a(str);
        if (a == null) {
            return null;
        }
        return new d52<>(a, new y62(), str);
    }
}
