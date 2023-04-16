package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

final class au0 implements DialogInterface.OnClickListener {

    /* renamed from: f */
    final /* synthetic */ JsPromptResult f4345f;

    au0(JsPromptResult jsPromptResult) {
        this.f4345f = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4345f.cancel();
    }
}
