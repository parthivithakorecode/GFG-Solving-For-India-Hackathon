package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.mb */
public final class C1956mb extends C2065p9<Integer, Long> {

    /* renamed from: b */
    public long f10789b = -1;

    /* renamed from: c */
    public long f10790c = -1;

    public C1956mb(String str) {
        HashMap a = C2065p9.m14882a(str);
        if (a != null) {
            this.f10789b = ((Long) a.get(0)).longValue();
            this.f10790c = ((Long) a.get(1)).longValue();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final HashMap<Integer, Long> mo5778b() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.f10789b));
        hashMap.put(1, Long.valueOf(this.f10790c));
        return hashMap;
    }
}
