package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import p034e2.C2547d;

public final class cm1 implements kv3<l31> {

    /* renamed from: a */
    private final yv3<C2264un> f5439a;

    /* renamed from: b */
    private final yv3<Executor> f5440b;

    /* renamed from: c */
    private final yv3<Context> f5441c;

    /* renamed from: d */
    private final yv3<C2547d> f5442d;

    public cm1(yv3<C2264un> yv3, yv3<Executor> yv32, yv3<Context> yv33, yv3<C2547d> yv34) {
        this.f5439a = yv3;
        this.f5440b = yv32;
        this.f5441c = yv33;
        this.f5442d = yv34;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        return new l31(this.f5440b.mo5051a(), new x21(this.f5441c.mo5051a(), this.f5439a.mo5051a()), this.f5442d.mo5051a());
    }
}
