package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class hc4 implements pd4 {

    /* renamed from: a */
    public final int f8159a;

    /* renamed from: b */
    public final int[] f8160b;

    /* renamed from: c */
    public final long[] f8161c;

    /* renamed from: d */
    public final long[] f8162d;

    /* renamed from: e */
    public final long[] f8163e;

    /* renamed from: f */
    private final long f8164f;

    public hc4(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f8160b = iArr;
        this.f8161c = jArr;
        this.f8162d = jArr2;
        this.f8163e = jArr3;
        int length = iArr.length;
        this.f8159a = length;
        if (length > 0) {
            int i = length - 1;
            this.f8164f = jArr2[i] + jArr3[i];
            return;
        }
        this.f8164f = 0;
    }

    /* renamed from: b */
    public final long mo5810b() {
        return this.f8164f;
    }

    /* renamed from: d */
    public final nd4 mo5811d(long j) {
        int J = n13.m13605J(this.f8163e, j, true, true);
        qd4 qd4 = new qd4(this.f8163e[J], this.f8161c[J]);
        if (qd4.f13141a >= j || J == this.f8159a - 1) {
            return new nd4(qd4, qd4);
        }
        int i = J + 1;
        return new nd4(qd4, new qd4(this.f8163e[i], this.f8161c[i]));
    }

    /* renamed from: f */
    public final boolean mo5812f() {
        return true;
    }

    public final String toString() {
        int i = this.f8159a;
        String arrays = Arrays.toString(this.f8160b);
        String arrays2 = Arrays.toString(this.f8161c);
        String arrays3 = Arrays.toString(this.f8163e);
        String arrays4 = Arrays.toString(this.f8162d);
        int length = String.valueOf(arrays).length();
        int length2 = String.valueOf(arrays2).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + String.valueOf(arrays3).length() + String.valueOf(arrays4).length());
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        sb.append(arrays2);
        sb.append(", timeUs=");
        sb.append(arrays3);
        sb.append(", durationsUs=");
        sb.append(arrays4);
        sb.append(")");
        return sb.toString();
    }
}
