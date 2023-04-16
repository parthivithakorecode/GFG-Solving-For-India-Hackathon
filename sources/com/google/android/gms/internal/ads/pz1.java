package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.TimeUnit;
import p054h1.C2694t;

public final class pz1 implements kv3<cc3<String>> {

    /* renamed from: a */
    private final yv3<nw2> f12970a;

    /* renamed from: b */
    private final yv3<Context> f12971b;

    public pz1(yv3<nw2> yv3, yv3<Context> yv32) {
        this.f12970a = yv3;
        this.f12971b = yv32;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        CookieManager l = C2694t.m21609r().mo14007l(this.f12971b.mo5051a());
        gw2 gw2 = gw2.WEBVIEW_COOKIE;
        return wv2.m19222a(new mz1(l), gw2, this.f12970a.mo5051a()).mo6689i(1, TimeUnit.SECONDS).mo6683c(Exception.class, new yv2(lz1.f10212a)).mo6681a();
    }
}
