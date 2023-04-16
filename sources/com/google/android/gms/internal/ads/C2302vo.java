package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* renamed from: com.google.android.gms.internal.ads.vo */
final class C2302vo implements ValueCallback<String> {

    /* renamed from: a */
    final /* synthetic */ C2340wo f16374a;

    C2302vo(C2340wo woVar) {
        this.f16374a = woVar;
    }

    /* renamed from: a */
    public final void onReceiveValue(String str) {
        C2340wo woVar = this.f16374a;
        woVar.f16885j.mo12057d(woVar.f16882g, woVar.f16883h, str, woVar.f16884i);
    }
}
