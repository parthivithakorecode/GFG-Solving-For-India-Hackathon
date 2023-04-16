package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.bm */
public final class C1559bm {

    /* renamed from: a */
    private final Map<String, String> f4979a = new HashMap();

    /* renamed from: b */
    private Map<String, String> f4980b;

    /* renamed from: a */
    public final synchronized Map<String, String> mo5882a() {
        if (this.f4980b == null) {
            this.f4980b = Collections.unmodifiableMap(new HashMap(this.f4979a));
        }
        return this.f4980b;
    }
}
