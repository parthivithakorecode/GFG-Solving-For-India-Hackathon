package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

public final class w94 {

    /* renamed from: a */
    private final SparseBooleanArray f16768a = new SparseBooleanArray();

    /* renamed from: b */
    private boolean f16769b;

    /* renamed from: a */
    public final w94 mo11623a(int i) {
        wu1.m19207f(!this.f16769b);
        this.f16768a.append(i, true);
        return this;
    }

    /* renamed from: b */
    public final yb4 mo11624b() {
        wu1.m19207f(!this.f16769b);
        this.f16769b = true;
        return new yb4(this.f16768a, (xa4) null);
    }
}
