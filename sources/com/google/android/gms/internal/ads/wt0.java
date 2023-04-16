package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

final class wt0 implements DialogInterface.OnCancelListener {

    /* renamed from: f */
    final /* synthetic */ JsResult f16929f;

    wt0(JsResult jsResult) {
        this.f16929f = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f16929f.cancel();
    }
}
