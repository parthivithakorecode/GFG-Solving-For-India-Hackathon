package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Set;

public final class qg2 implements kv3<og2> {

    /* renamed from: a */
    private final yv3<dc3> f13158a;

    /* renamed from: b */
    private final yv3<ViewGroup> f13159b;

    /* renamed from: c */
    private final yv3<Context> f13160c;

    /* renamed from: d */
    private final yv3<Set<String>> f13161d;

    public qg2(yv3<dc3> yv3, yv3<ViewGroup> yv32, yv3<Context> yv33, yv3<Set<String>> yv34) {
        this.f13158a = yv3;
        this.f13159b = yv32;
        this.f13160c = yv33;
        this.f13161d = yv34;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return new og2(dc3, ((r41) this.f13159b).mo10479b(), this.f13160c.mo5051a(), ((wv3) this.f13161d).mo5051a());
    }
}
