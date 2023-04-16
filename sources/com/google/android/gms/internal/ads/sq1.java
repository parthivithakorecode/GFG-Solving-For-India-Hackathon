package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class sq1 {

    /* renamed from: a */
    private final Map<String, String> f14551a = new HashMap();

    /* renamed from: b */
    private Map<String, String> f14552b;

    /* renamed from: a */
    public final synchronized Map<String, String> mo10842a() {
        if (this.f14552b == null) {
            this.f14552b = Collections.unmodifiableMap(new HashMap(this.f14551a));
        }
        return this.f14552b;
    }
}
