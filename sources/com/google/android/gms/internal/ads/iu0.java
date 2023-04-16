package com.google.android.gms.internal.ads;

import android.view.View;

final class iu0 implements View.OnAttachStateChangeListener {

    /* renamed from: f */
    final /* synthetic */ ml0 f8802f;

    /* renamed from: g */
    final /* synthetic */ lu0 f8803g;

    iu0(lu0 lu0, ml0 ml0) {
        this.f8803g = lu0;
        this.f8802f = ml0;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f8803g.m12883s(view, this.f8802f, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
