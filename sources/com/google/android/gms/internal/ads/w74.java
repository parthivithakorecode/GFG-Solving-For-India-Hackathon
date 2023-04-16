package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

public class w74 {

    /* renamed from: a */
    protected final gk0 f16740a;

    /* renamed from: b */
    protected final int f16741b;

    /* renamed from: c */
    protected final int[] f16742c;

    /* renamed from: d */
    private final C1574c0[] f16743d;

    /* renamed from: e */
    private int f16744e;

    public w74(gk0 gk0, int[] iArr, int i) {
        int length = iArr.length;
        wu1.m19207f(length > 0);
        Objects.requireNonNull(gk0);
        this.f16740a = gk0;
        this.f16741b = length;
        this.f16743d = new C1574c0[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f16743d[i2] = gk0.mo7652b(iArr[i2]);
        }
        Arrays.sort(this.f16743d, v74.f15937f);
        this.f16742c = new int[this.f16741b];
        for (int i3 = 0; i3 < this.f16741b; i3++) {
            this.f16742c[i3] = gk0.mo7651a(this.f16743d[i3]);
        }
    }

    /* renamed from: a */
    public final int mo11593a(int i) {
        return this.f16742c[0];
    }

    /* renamed from: b */
    public final int mo11594b() {
        return this.f16742c.length;
    }

    /* renamed from: c */
    public final C1574c0 mo11595c(int i) {
        return this.f16743d[i];
    }

    /* renamed from: d */
    public final gk0 mo11596d() {
        return this.f16740a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            w74 w74 = (w74) obj;
            return this.f16740a == w74.f16740a && Arrays.equals(this.f16742c, w74.f16742c);
        }
    }

    public final int hashCode() {
        int i = this.f16744e;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.f16740a) * 31) + Arrays.hashCode(this.f16742c);
        this.f16744e = identityHashCode;
        return identityHashCode;
    }
}
