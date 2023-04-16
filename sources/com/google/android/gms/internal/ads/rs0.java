package com.google.android.gms.internal.ads;

import java.util.HashMap;

final class rs0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ String f13923f;

    /* renamed from: g */
    final /* synthetic */ String f13924g;

    /* renamed from: h */
    final /* synthetic */ long f13925h;

    /* renamed from: i */
    final /* synthetic */ ts0 f13926i;

    rs0(ts0 ts0, String str, String str2, long j) {
        this.f13926i = ts0;
        this.f13923f = str;
        this.f13924g = str2;
        this.f13925h = j;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f13923f);
        hashMap.put("cachedSrc", this.f13924g);
        hashMap.put("totalDuration", Long.toString(this.f13925h));
        ts0.m17483f(this.f13926i, "onPrecacheEvent", hashMap);
    }
}
