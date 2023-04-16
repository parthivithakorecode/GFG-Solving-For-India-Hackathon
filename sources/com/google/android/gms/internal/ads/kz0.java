package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

final class kz0 implements kr2 {

    /* renamed from: a */
    private final b01 f9819a;

    /* renamed from: b */
    private Context f9820b;

    /* renamed from: c */
    private String f9821c;

    /* synthetic */ kz0(b01 b01, jz0 jz0) {
        this.f9819a = b01;
    }

    /* renamed from: a */
    public final /* synthetic */ kr2 mo8777a(Context context) {
        Objects.requireNonNull(context);
        this.f9820b = context;
        return this;
    }

    /* renamed from: b */
    public final /* synthetic */ kr2 mo8778b(String str) {
        this.f9821c = str;
        return this;
    }

    /* renamed from: c */
    public final lr2 mo8779c() {
        sv3.m16998c(this.f9820b, Context.class);
        return new mz0(this.f9819a, this.f9820b, this.f9821c, (lz0) null);
    }
}
