package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

final class xx0 implements jm2 {

    /* renamed from: a */
    private final b01 f17367a;

    /* renamed from: b */
    private Context f17368b;

    /* renamed from: c */
    private String f17369c;

    /* synthetic */ xx0(b01 b01, wx0 wx0) {
        this.f17367a = b01;
    }

    /* renamed from: a */
    public final /* synthetic */ jm2 mo8493a(Context context) {
        Objects.requireNonNull(context);
        this.f17368b = context;
        return this;
    }

    /* renamed from: b */
    public final /* synthetic */ jm2 mo8494b(String str) {
        Objects.requireNonNull(str);
        this.f17369c = str;
        return this;
    }

    /* renamed from: c */
    public final km2 mo8495c() {
        sv3.m16998c(this.f17368b, Context.class);
        sv3.m16998c(this.f17369c, String.class);
        return new zx0(this.f17367a, this.f17368b, this.f17369c, (yx0) null);
    }
}
