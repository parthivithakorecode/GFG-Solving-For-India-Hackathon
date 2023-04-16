package com.google.android.gms.internal.ads;

import android.content.Context;

final class yy0 implements ix1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f17928a;

    /* renamed from: b */
    private final n80 f17929b;

    /* renamed from: c */
    private final b01 f17930c;

    /* renamed from: d */
    private final yy0 f17931d = this;

    /* renamed from: e */
    private final yv3<ix1> f17932e;

    /* renamed from: f */
    private final yv3<n80> f17933f;

    /* renamed from: g */
    private final yv3<dx1> f17934g;

    /* renamed from: h */
    private final yv3<fx1> f17935h;

    /* synthetic */ yy0(b01 b01, Context context, n80 n80, xy0 xy0) {
        this.f17930c = b01;
        this.f17928a = context;
        this.f17929b = n80;
        kv3 b = lv3.m12941b(this);
        this.f17932e = b;
        kv3 b2 = lv3.m12941b(n80);
        this.f17933f = b2;
        ex1 ex1 = new ex1(b2);
        this.f17934g = ex1;
        this.f17935h = jv3.m11856c(new gx1(b, ex1));
    }

    /* renamed from: a */
    public final xw1 mo8287a() {
        return new sy0(this.f17930c, this.f17931d, (qy0) null);
    }

    /* renamed from: g */
    public final fx1 mo8288g() {
        return this.f17935h.mo5051a();
    }
}
