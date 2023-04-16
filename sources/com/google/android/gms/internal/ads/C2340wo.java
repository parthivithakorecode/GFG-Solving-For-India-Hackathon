package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.wo */
final class C2340wo implements Runnable {

    /* renamed from: f */
    final ValueCallback<String> f16881f = new C2302vo(this);

    /* renamed from: g */
    final /* synthetic */ C2043oo f16882g;

    /* renamed from: h */
    final /* synthetic */ WebView f16883h;

    /* renamed from: i */
    final /* synthetic */ boolean f16884i;

    /* renamed from: j */
    final /* synthetic */ C2414yo f16885j;

    C2340wo(C2414yo yoVar, C2043oo ooVar, WebView webView, boolean z) {
        this.f16885j = yoVar;
        this.f16882g = ooVar;
        this.f16883h = webView;
        this.f16884i = z;
    }

    public final void run() {
        if (this.f16883h.getSettings().getJavaScriptEnabled()) {
            try {
                this.f16883h.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f16881f);
            } catch (Throwable unused) {
                ((C2302vo) this.f16881f).onReceiveValue("");
            }
        }
    }
}
