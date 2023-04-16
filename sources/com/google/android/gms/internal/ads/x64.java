package com.google.android.gms.internal.ads;

import java.util.Objects;

public final class x64 implements e64 {

    /* renamed from: a */
    private final gd1 f17054a;

    /* renamed from: b */
    private int f17055b = 1048576;

    /* renamed from: c */
    private final w64 f17056c;

    /* renamed from: d */
    private final m94 f17057d = new m94(-1);

    /* renamed from: e */
    private final s24 f17058e = new s24();

    public x64(gd1 gd1, vc4 vc4) {
        w64 w64 = new w64(vc4);
        this.f17054a = gd1;
        this.f17056c = w64;
    }

    /* renamed from: a */
    public final x64 mo11777a(int i) {
        this.f17055b = i;
        return this;
    }

    /* renamed from: b */
    public final z64 mo11778b(C2451zo zoVar) {
        Objects.requireNonNull(zoVar.f18304b);
        return new z64(zoVar, this.f17054a, this.f17056c, b34.f4671a, this.f17057d, this.f17055b, (y64) null, (byte[]) null);
    }
}
