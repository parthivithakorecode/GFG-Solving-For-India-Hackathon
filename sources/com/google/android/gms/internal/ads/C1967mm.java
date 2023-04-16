package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.mm */
public final class C1967mm {

    /* renamed from: a */
    private int f10929a;

    /* renamed from: b */
    private long[] f10930b = new long[32];

    public C1967mm(int i) {
    }

    /* renamed from: a */
    public final int mo9279a() {
        return this.f10929a;
    }

    /* renamed from: b */
    public final long mo9280b(int i) {
        if (i >= 0 && i < this.f10929a) {
            return this.f10930b[i];
        }
        int i2 = this.f10929a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: c */
    public final void mo9281c(long j) {
        int i = this.f10929a;
        long[] jArr = this.f10930b;
        if (i == jArr.length) {
            this.f10930b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f10930b;
        int i2 = this.f10929a;
        this.f10929a = i2 + 1;
        jArr2[i2] = j;
    }
}
