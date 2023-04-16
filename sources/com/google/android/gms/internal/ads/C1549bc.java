package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.bc */
public final class C1549bc extends C2065p9<Integer, Long> {

    /* renamed from: b */
    public Long f4845b;

    /* renamed from: c */
    public Long f4846c;

    public C1549bc(String str) {
        HashMap a = C2065p9.m14882a(str);
        if (a != null) {
            this.f4845b = (Long) a.get(0);
            this.f4846c = (Long) a.get(1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final HashMap<Integer, Long> mo5778b() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f4845b);
        hashMap.put(1, this.f4846c);
        return hashMap;
    }
}
