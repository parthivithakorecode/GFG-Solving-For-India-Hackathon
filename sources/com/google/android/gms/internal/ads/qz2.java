package com.google.android.gms.internal.ads;

import android.webkit.WebView;

final class qz2 implements Runnable {

    /* renamed from: f */
    private final WebView f13411f;

    /* renamed from: g */
    final /* synthetic */ rz2 f13412g;

    qz2(rz2 rz2) {
        this.f13412g = rz2;
        this.f13411f = rz2.f14178d;
    }

    public final void run() {
        this.f13411f.destroy();
    }
}
