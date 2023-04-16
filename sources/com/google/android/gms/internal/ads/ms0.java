package com.google.android.gms.internal.ads;

import java.util.HashMap;

final class ms0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ String f11015f;

    /* renamed from: g */
    final /* synthetic */ String f11016g;

    /* renamed from: h */
    final /* synthetic */ int f11017h;

    /* renamed from: i */
    final /* synthetic */ int f11018i;

    /* renamed from: j */
    final /* synthetic */ ts0 f11019j;

    ms0(ts0 ts0, String str, String str2, int i, int i2, boolean z) {
        this.f11019j = ts0;
        this.f11015f = str;
        this.f11016g = str2;
        this.f11017h = i;
        this.f11018i = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f11015f);
        hashMap.put("cachedSrc", this.f11016g);
        hashMap.put("bytesLoaded", Integer.toString(this.f11017h));
        hashMap.put("totalBytes", Integer.toString(this.f11018i));
        hashMap.put("cacheReady", "0");
        ts0.m17483f(this.f11019j, "onPrecacheEvent", hashMap);
    }
}
