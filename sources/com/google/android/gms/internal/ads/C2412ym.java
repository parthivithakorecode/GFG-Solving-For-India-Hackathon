package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.ads.ym */
final class C2412ym implements ThreadFactory {

    /* renamed from: a */
    final /* synthetic */ String f17798a = "Loader:ExtractorMediaPeriod";

    C2412ym(String str) {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f17798a);
    }
}
