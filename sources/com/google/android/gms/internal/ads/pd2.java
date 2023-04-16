package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class pd2 {

    /* renamed from: a */
    private int f12606a;

    /* renamed from: b */
    private long[] f12607b = new long[32];

    public pd2(int i) {
    }

    /* renamed from: a */
    public final int mo10035a() {
        return this.f12606a;
    }

    /* renamed from: b */
    public final long mo10036b(int i) {
        if (i >= 0 && i < this.f12606a) {
            return this.f12607b[i];
        }
        int i2 = this.f12606a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: c */
    public final void mo10037c(long j) {
        int i = this.f12606a;
        long[] jArr = this.f12607b;
        if (i == jArr.length) {
            this.f12607b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f12607b;
        int i2 = this.f12606a;
        this.f12606a = i2 + 1;
        jArr2[i2] = j;
    }
}
