package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

final class xt0 implements DialogInterface.OnClickListener {

    /* renamed from: f */
    final /* synthetic */ JsResult f17345f;

    xt0(JsResult jsResult) {
        this.f17345f = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f17345f.cancel();
    }
}
