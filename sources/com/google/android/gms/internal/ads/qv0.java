package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class qv0 {

    /* renamed from: e */
    public static final my3<qv0> f13324e = pu0.f12802a;

    /* renamed from: a */
    private final gk0 f13325a;

    /* renamed from: b */
    private final int[] f13326b;

    /* renamed from: c */
    private final int f13327c;

    /* renamed from: d */
    private final boolean[] f13328d;

    public qv0(gk0 gk0, int[] iArr, int i, boolean[] zArr) {
        int i2 = gk0.f7515a;
        this.f13325a = gk0;
        this.f13326b = (int[]) iArr.clone();
        this.f13327c = i;
        this.f13328d = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qv0.class == obj.getClass()) {
            qv0 qv0 = (qv0) obj;
            return this.f13327c == qv0.f13327c && this.f13325a.equals(qv0.f13325a) && Arrays.equals(this.f13326b, qv0.f13326b) && Arrays.equals(this.f13328d, qv0.f13328d);
        }
    }

    public final int hashCode() {
        return (((((this.f13325a.hashCode() * 31) + Arrays.hashCode(this.f13326b)) * 31) + this.f13327c) * 31) + Arrays.hashCode(this.f13328d);
    }
}
