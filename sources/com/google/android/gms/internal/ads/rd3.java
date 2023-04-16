package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class rd3<P> {

    /* renamed from: a */
    private final P f13593a;

    /* renamed from: b */
    private final byte[] f13594b;

    /* renamed from: c */
    private final int f13595c;

    /* renamed from: d */
    private final int f13596d;

    rd3(P p, byte[] bArr, int i, int i2, int i3) {
        this.f13593a = p;
        this.f13594b = Arrays.copyOf(bArr, bArr.length);
        this.f13595c = i;
        this.f13596d = i2;
    }

    /* renamed from: a */
    public final P mo10505a() {
        return this.f13593a;
    }

    /* renamed from: b */
    public final byte[] mo10506b() {
        byte[] bArr = this.f13594b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: c */
    public final int mo10507c() {
        return this.f13595c;
    }

    /* renamed from: d */
    public final int mo10508d() {
        return this.f13596d;
    }
}
