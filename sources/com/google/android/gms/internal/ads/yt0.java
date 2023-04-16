package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

final class yt0 implements DialogInterface.OnClickListener {

    /* renamed from: f */
    final /* synthetic */ JsResult f17857f;

    yt0(JsResult jsResult) {
        this.f17857f = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f17857f.confirm();
    }
}
