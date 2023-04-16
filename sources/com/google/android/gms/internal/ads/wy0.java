package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

final class wy0 implements hx1 {

    /* renamed from: a */
    private final b01 f16956a;

    /* renamed from: b */
    private Context f16957b;

    /* renamed from: c */
    private n80 f16958c;

    /* synthetic */ wy0(b01 b01, vy0 vy0) {
        this.f16956a = b01;
    }

    /* renamed from: a */
    public final /* synthetic */ hx1 mo8031a(Context context) {
        Objects.requireNonNull(context);
        this.f16957b = context;
        return this;
    }

    /* renamed from: b */
    public final /* synthetic */ hx1 mo8032b(n80 n80) {
        Objects.requireNonNull(n80);
        this.f16958c = n80;
        return this;
    }

    /* renamed from: c */
    public final ix1 mo8033c() {
        sv3.m16998c(this.f16957b, Context.class);
        sv3.m16998c(this.f16958c, n80.class);
        return new yy0(this.f16956a, this.f16957b, this.f16958c, (xy0) null);
    }
}
