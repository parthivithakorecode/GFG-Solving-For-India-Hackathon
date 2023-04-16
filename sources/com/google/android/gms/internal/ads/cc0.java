package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import p069j1.C3165h0;

@ParametersAreNonnullByDefault
public final class cc0 {

    /* renamed from: b */
    static final C3165h0<ha0> f5374b = new ac0();

    /* renamed from: c */
    static final C3165h0<ha0> f5375c = new bc0();

    /* renamed from: a */
    private final nb0 f5376a;

    public cc0(Context context, po0 po0, String str) {
        this.f5376a = new nb0(context, po0, str, f5374b, f5375c);
    }

    /* renamed from: a */
    public final <I, O> rb0<I, O> mo6122a(String str, vb0<I> vb0, tb0<O> tb0) {
        return new gc0(this.f5376a, str, vb0, tb0);
    }

    /* renamed from: b */
    public final lc0 mo6123b() {
        return new lc0(this.f5376a);
    }
}
