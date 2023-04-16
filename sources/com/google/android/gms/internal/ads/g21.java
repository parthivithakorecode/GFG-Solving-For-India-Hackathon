package com.google.android.gms.internal.ads;

import android.content.Context;

public final class g21 implements rb1 {

    /* renamed from: f */
    private final at2 f7234f;

    public g21(at2 at2) {
        this.f7234f = at2;
    }

    /* renamed from: f */
    public final void mo5651f(Context context) {
        try {
            this.f7234f.mo5516w();
            if (context != null) {
                this.f7234f.mo5514u(context);
            }
        } catch (ps2 e) {
            io0.m11132h("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    /* renamed from: r */
    public final void mo5654r(Context context) {
        try {
            this.f7234f.mo5515v();
        } catch (ps2 e) {
            io0.m11132h("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    /* renamed from: y */
    public final void mo5656y(Context context) {
        try {
            this.f7234f.mo5503j();
        } catch (ps2 e) {
            io0.m11132h("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }
}
