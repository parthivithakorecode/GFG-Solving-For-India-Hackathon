package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
import p034e2.C2547d;
import p069j1.C3208t1;

final class ul0 {

    /* renamed from: a */
    private Context f15622a;

    /* renamed from: b */
    private C2547d f15623b;

    /* renamed from: c */
    private C3208t1 f15624c;

    /* renamed from: d */
    private pm0 f15625d;

    /* synthetic */ ul0(tl0 tl0) {
    }

    /* renamed from: a */
    public final ul0 mo11237a(C3208t1 t1Var) {
        this.f15624c = t1Var;
        return this;
    }

    /* renamed from: b */
    public final ul0 mo11238b(Context context) {
        Objects.requireNonNull(context);
        this.f15622a = context;
        return this;
    }

    /* renamed from: c */
    public final ul0 mo11239c(C2547d dVar) {
        Objects.requireNonNull(dVar);
        this.f15623b = dVar;
        return this;
    }

    /* renamed from: d */
    public final ul0 mo11240d(pm0 pm0) {
        this.f15625d = pm0;
        return this;
    }

    /* renamed from: e */
    public final qm0 mo11241e() {
        sv3.m16998c(this.f15622a, Context.class);
        sv3.m16998c(this.f15623b, C2547d.class);
        sv3.m16998c(this.f15624c, C3208t1.class);
        sv3.m16998c(this.f15625d, pm0.class);
        return new wl0(this.f15622a, this.f15623b, this.f15624c, this.f15625d, (vl0) null);
    }
}
