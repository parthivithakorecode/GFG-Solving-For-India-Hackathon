package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class io3 extends lo3 {

    /* renamed from: f */
    private int f8741f = 0;

    /* renamed from: g */
    private final int f8742g;

    /* renamed from: h */
    final /* synthetic */ uo3 f8743h;

    io3(uo3 uo3) {
        this.f8743h = uo3;
        this.f8742g = uo3.mo6627p();
    }

    public final boolean hasNext() {
        return this.f8741f < this.f8742g;
    }

    public final byte zza() {
        int i = this.f8741f;
        if (i < this.f8742g) {
            this.f8741f = i + 1;
            return this.f8743h.mo6626n(i);
        }
        throw new NoSuchElementException();
    }
}
