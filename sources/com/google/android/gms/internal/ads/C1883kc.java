package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.kc */
public final class C1883kc extends C2065p9<Integer, Long> {

    /* renamed from: b */
    public Long f9470b;

    /* renamed from: c */
    public Long f9471c;

    /* renamed from: d */
    public Long f9472d;

    /* renamed from: e */
    public Long f9473e;

    public C1883kc(String str) {
        HashMap a = C2065p9.m14882a(str);
        if (a != null) {
            this.f9470b = (Long) a.get(0);
            this.f9471c = (Long) a.get(1);
            this.f9472d = (Long) a.get(2);
            this.f9473e = (Long) a.get(3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final HashMap<Integer, Long> mo5778b() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f9470b);
        hashMap.put(1, this.f9471c);
        hashMap.put(2, this.f9472d);
        hashMap.put(3, this.f9473e);
        return hashMap;
    }
}
