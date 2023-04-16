package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p069j1.C3202r1;

final class vo2 implements e43<k12, yo2> {

    /* renamed from: a */
    final /* synthetic */ zo2 f16377a;

    vo2(zo2 zo2) {
        this.f16377a = zo2;
    }

    @NullableDecl
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5054a(@NullableDecl Object obj) {
        io0.m11129e("", (k12) obj);
        C3202r1.m24015k("Failed to get a cache key, reverting to legacy flow.");
        zo2 zo2 = this.f16377a;
        zo2.f18316d = new yo2((vi0) null, zo2.m20775e(), (xo2) null);
        return this.f16377a.f18316d;
    }
}
