package com.google.android.gms.internal.ads;

import android.webkit.WebView;

final class fz2 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ WebView f7210f;

    /* renamed from: g */
    final /* synthetic */ String f7211g;

    fz2(gz2 gz2, WebView webView, String str) {
        this.f7210f = webView;
        this.f7211g = str;
    }

    public final void run() {
        this.f7210f.loadUrl(this.f7211g);
    }
}
