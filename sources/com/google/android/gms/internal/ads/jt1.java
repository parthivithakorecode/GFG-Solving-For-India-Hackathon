package com.google.android.gms.internal.ads;

import android.content.Context;

public final class jt1 implements rb1 {

    /* renamed from: f */
    private final eu0 f9259f;

    jt1(eu0 eu0) {
        this.f9259f = eu0;
    }

    /* renamed from: f */
    public final void mo5651f(Context context) {
        eu0 eu0 = this.f9259f;
        if (eu0 != null) {
            eu0.onResume();
        }
    }

    /* renamed from: r */
    public final void mo5654r(Context context) {
        eu0 eu0 = this.f9259f;
        if (eu0 != null) {
            eu0.onPause();
        }
    }

    /* renamed from: y */
    public final void mo5656y(Context context) {
        eu0 eu0 = this.f9259f;
        if (eu0 != null) {
            eu0.destroy();
        }
    }
}
