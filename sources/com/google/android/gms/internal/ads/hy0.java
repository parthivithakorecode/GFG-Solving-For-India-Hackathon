package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

final class hy0 implements yn2 {

    /* renamed from: a */
    private final b01 f8454a;

    /* renamed from: b */
    private Context f8455b;

    /* renamed from: c */
    private String f8456c;

    /* renamed from: d */
    private C2087pv f8457d;

    /* synthetic */ hy0(b01 b01, gy0 gy0) {
        this.f8454a = b01;
    }

    /* renamed from: Q */
    public final /* synthetic */ yn2 mo8037Q(Context context) {
        Objects.requireNonNull(context);
        this.f8455b = context;
        return this;
    }

    /* renamed from: a */
    public final /* synthetic */ yn2 mo8038a(C2087pv pvVar) {
        Objects.requireNonNull(pvVar);
        this.f8457d = pvVar;
        return this;
    }

    /* renamed from: g */
    public final bo2 mo8039g() {
        sv3.m16998c(this.f8455b, Context.class);
        sv3.m16998c(this.f8456c, String.class);
        sv3.m16998c(this.f8457d, C2087pv.class);
        return new jy0(this.f8454a, this.f8455b, this.f8456c, this.f8457d, (iy0) null);
    }

    /* renamed from: s */
    public final /* synthetic */ yn2 mo8040s(String str) {
        Objects.requireNonNull(str);
        this.f8456c = str;
        return this;
    }
}
