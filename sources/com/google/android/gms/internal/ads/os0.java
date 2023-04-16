package com.google.android.gms.internal.ads;

import java.util.HashMap;
import p054h1.C2694t;

final class os0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ String f12181f;

    /* renamed from: g */
    final /* synthetic */ String f12182g;

    /* renamed from: h */
    final /* synthetic */ long f12183h;

    /* renamed from: i */
    final /* synthetic */ long f12184i;

    /* renamed from: j */
    final /* synthetic */ long f12185j;

    /* renamed from: k */
    final /* synthetic */ long f12186k;

    /* renamed from: l */
    final /* synthetic */ long f12187l;

    /* renamed from: m */
    final /* synthetic */ boolean f12188m;

    /* renamed from: n */
    final /* synthetic */ int f12189n;

    /* renamed from: o */
    final /* synthetic */ int f12190o;

    /* renamed from: p */
    final /* synthetic */ ts0 f12191p;

    os0(ts0 ts0, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.f12191p = ts0;
        this.f12181f = str;
        this.f12182g = str2;
        this.f12183h = j;
        this.f12184i = j2;
        this.f12185j = j3;
        this.f12186k = j4;
        this.f12187l = j5;
        this.f12188m = z;
        this.f12189n = i;
        this.f12190o = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f12181f);
        hashMap.put("cachedSrc", this.f12182g);
        hashMap.put("bufferedDuration", Long.toString(this.f12183h));
        hashMap.put("totalDuration", Long.toString(this.f12184i));
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10596r1)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.f12185j));
            hashMap.put("qoeCachedBytes", Long.toString(this.f12186k));
            hashMap.put("totalBytes", Long.toString(this.f12187l));
            hashMap.put("reportTime", Long.toString(C2694t.m21592a().mo12462a()));
        }
        hashMap.put("cacheReady", true != this.f12188m ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f12189n));
        hashMap.put("playerPreparedCount", Integer.toString(this.f12190o));
        ts0.m17483f(this.f12191p, "onPrecacheEvent", hashMap);
    }
}
