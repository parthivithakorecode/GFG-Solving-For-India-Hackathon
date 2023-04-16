package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.g0 */
final class C1723g0 implements C1908l0 {

    /* renamed from: a */
    private final long[] f7216a;

    /* renamed from: b */
    private final long[] f7217b;

    /* renamed from: c */
    private final long f7218c;

    private C1723g0(long[] jArr, long[] jArr2, long j) {
        this.f7216a = jArr;
        this.f7217b = jArr2;
        this.f7218c = j == -9223372036854775807L ? nz3.m14195c(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: c */
    public static C1723g0 m9443c(long j, ag4 ag4, long j2) {
        int length = ag4.f4105j.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (ag4.f4103h + ag4.f4105j[i3]);
            j3 += (long) (ag4.f4104i + ag4.f4106k[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new C1723g0(jArr, jArr2, j2);
    }

    /* renamed from: e */
    private static Pair<Long, Long> m9444e(long j, long[] jArr, long[] jArr2) {
        Long valueOf;
        Long valueOf2;
        int J = n13.m13605J(jArr, j, true, true);
        long j2 = jArr[J];
        long j3 = jArr2[J];
        int i = J + 1;
        if (i == jArr.length) {
            valueOf = Long.valueOf(j2);
            valueOf2 = Long.valueOf(j3);
        } else {
            long j4 = jArr[i];
            long j5 = jArr2[i];
            double d = j4 == j2 ? 0.0d : (((double) j) - ((double) j2)) / ((double) (j4 - j2));
            valueOf = Long.valueOf(j);
            valueOf2 = Long.valueOf(((long) (d * ((double) (j5 - j3)))) + j3);
        }
        return Pair.create(valueOf, valueOf2);
    }

    /* renamed from: a */
    public final long mo6763a() {
        return -1;
    }

    /* renamed from: b */
    public final long mo5810b() {
        return this.f7218c;
    }

    /* renamed from: d */
    public final nd4 mo5811d(long j) {
        Pair<Long, Long> e = m9444e(nz3.m14196d(n13.m13616U(j, 0, this.f7218c)), this.f7217b, this.f7216a);
        qd4 qd4 = new qd4(nz3.m14195c(((Long) e.first).longValue()), ((Long) e.second).longValue());
        return new nd4(qd4, qd4);
    }

    /* renamed from: f */
    public final boolean mo5812f() {
        return true;
    }

    /* renamed from: i */
    public final long mo6764i(long j) {
        return nz3.m14195c(((Long) m9444e(j, this.f7216a, this.f7217b).second).longValue());
    }
}
