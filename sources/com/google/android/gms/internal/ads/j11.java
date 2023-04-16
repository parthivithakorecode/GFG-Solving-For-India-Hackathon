package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class j11 {

    /* renamed from: a */
    private final Map<String, m11> f8942a;

    /* renamed from: b */
    private final Map<String, l11> f8943b;

    j11(Map<String, m11> map, Map<String, l11> map2) {
        this.f8942a = map;
        this.f8943b = map2;
    }

    /* renamed from: a */
    public final void mo8329a(ds2 ds2) {
        for (bs2 next : ds2.f5904b.f5510c) {
            if (this.f8942a.containsKey(next.f5028a)) {
                this.f8942a.get(next.f5028a).mo5073b(next.f5029b);
            } else if (this.f8943b.containsKey(next.f5028a)) {
                l11 l11 = this.f8943b.get(next.f5028a);
                JSONObject jSONObject = next.f5029b;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next2 = keys.next();
                    String optString = jSONObject.optString(next2);
                    if (optString != null) {
                        hashMap.put(next2, optString);
                    }
                }
                l11.mo6036a(hashMap);
            }
        }
    }
}
