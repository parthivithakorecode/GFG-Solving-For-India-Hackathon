package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class bu0 implements DialogInterface.OnClickListener {

    /* renamed from: f */
    final /* synthetic */ JsPromptResult f5038f;

    /* renamed from: g */
    final /* synthetic */ EditText f5039g;

    bu0(JsPromptResult jsPromptResult, EditText editText) {
        this.f5038f = jsPromptResult;
        this.f5039g = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f5038f.confirm(this.f5039g.getText().toString());
    }
}
