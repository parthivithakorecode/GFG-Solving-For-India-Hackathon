package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.yb */
public final class C2401yb extends C2065p9<Integer, Object> {

    /* renamed from: b */
    public Long f17654b;

    /* renamed from: c */
    public Boolean f17655c;

    /* renamed from: d */
    public Boolean f17656d;

    public C2401yb(String str) {
        HashMap a = C2065p9.m14882a(str);
        if (a != null) {
            this.f17654b = (Long) a.get(0);
            this.f17655c = (Boolean) a.get(1);
            this.f17656d = (Boolean) a.get(2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final HashMap<Integer, Object> mo5778b() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f17654b);
        hashMap.put(1, this.f17655c);
        hashMap.put(2, this.f17656d);
        return hashMap;
    }
}
