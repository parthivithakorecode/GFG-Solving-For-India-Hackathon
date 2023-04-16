package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.rd */
public final class C2143rd<T> {

    /* renamed from: a */
    private final Map<String, AtomicReference<T>> f13590a = new HashMap();

    /* renamed from: a */
    public final AtomicReference<T> mo10504a(String str) {
        synchronized (this) {
            if (!this.f13590a.containsKey(str)) {
                this.f13590a.put(str, new AtomicReference());
            }
        }
        return this.f13590a.get(str);
    }
}
