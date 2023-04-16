package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

public final class h92 implements c52<at2, z62> {
    @GuardedBy("this")

    /* renamed from: a */
    private final Map<String, d52<at2, z62>> f8117a = new HashMap();

    /* renamed from: b */
    private final rt1 f8118b;

    public h92(rt1 rt1) {
        this.f8118b = rt1;
    }

    /* renamed from: a */
    public final d52<at2, z62> mo6058a(String str, JSONObject jSONObject) {
        d52<at2, z62> d52;
        synchronized (this) {
            d52 = this.f8117a.get(str);
            if (d52 == null) {
                d52 = new d52<>(this.f8118b.mo10664b(str, jSONObject), new z62(), str);
                this.f8117a.put(str, d52);
            }
        }
        return d52;
    }
}
