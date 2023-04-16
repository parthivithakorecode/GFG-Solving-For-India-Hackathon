package com.google.android.gms.internal.ads;

import java.util.HashMap;

final class ps0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ String f12786f;

    /* renamed from: g */
    final /* synthetic */ String f12787g;

    /* renamed from: h */
    final /* synthetic */ int f12788h;

    /* renamed from: i */
    final /* synthetic */ int f12789i;

    /* renamed from: j */
    final /* synthetic */ long f12790j;

    /* renamed from: k */
    final /* synthetic */ long f12791k;

    /* renamed from: l */
    final /* synthetic */ boolean f12792l;

    /* renamed from: m */
    final /* synthetic */ int f12793m;

    /* renamed from: n */
    final /* synthetic */ int f12794n;

    /* renamed from: o */
    final /* synthetic */ ts0 f12795o;

    ps0(ts0 ts0, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.f12795o = ts0;
        this.f12786f = str;
        this.f12787g = str2;
        this.f12788h = i;
        this.f12789i = i2;
        this.f12790j = j;
        this.f12791k = j2;
        this.f12792l = z;
        this.f12793m = i3;
        this.f12794n = i4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f12786f);
        hashMap.put("cachedSrc", this.f12787g);
        hashMap.put("bytesLoaded", Integer.toString(this.f12788h));
        hashMap.put("totalBytes", Integer.toString(this.f12789i));
        hashMap.put("bufferedDuration", Long.toString(this.f12790j));
        hashMap.put("totalDuration", Long.toString(this.f12791k));
        hashMap.put("cacheReady", true != this.f12792l ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f12793m));
        hashMap.put("playerPreparedCount", Integer.toString(this.f12794n));
        ts0.m17483f(this.f12795o, "onPrecacheEvent", hashMap);
    }
}
