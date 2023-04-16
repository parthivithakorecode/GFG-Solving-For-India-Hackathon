package com.google.android.gms.internal.ads;

import android.webkit.CookieManager;
import java.util.concurrent.Callable;

public final /* synthetic */ class mz1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ CookieManager f11206a;

    public /* synthetic */ mz1(CookieManager cookieManager) {
        this.f11206a = cookieManager;
    }

    public final Object call() {
        CookieManager cookieManager = this.f11206a;
        if (cookieManager == null) {
            return "";
        }
        return cookieManager.getCookie((String) C2199sw.m17001c().mo8579b(m10.f10250C0));
    }
}
