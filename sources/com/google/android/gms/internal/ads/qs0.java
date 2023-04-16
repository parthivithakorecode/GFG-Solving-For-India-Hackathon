package com.google.android.gms.internal.ads;

import java.util.HashMap;

final class qs0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ String f13296f;

    /* renamed from: g */
    final /* synthetic */ String f13297g;

    /* renamed from: h */
    final /* synthetic */ int f13298h;

    /* renamed from: i */
    final /* synthetic */ ts0 f13299i;

    qs0(ts0 ts0, String str, String str2, int i) {
        this.f13299i = ts0;
        this.f13296f = str;
        this.f13297g = str2;
        this.f13298h = i;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f13296f);
        hashMap.put("cachedSrc", this.f13297g);
        hashMap.put("totalBytes", Integer.toString(this.f13298h));
        ts0.m17483f(this.f13299i, "onPrecacheEvent", hashMap);
    }
}
