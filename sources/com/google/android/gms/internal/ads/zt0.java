package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

final class zt0 implements DialogInterface.OnCancelListener {

    /* renamed from: f */
    final /* synthetic */ JsPromptResult f18360f;

    zt0(JsPromptResult jsPromptResult) {
        this.f18360f = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f18360f.cancel();
    }
}
