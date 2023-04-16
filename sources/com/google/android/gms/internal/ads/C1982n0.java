package com.google.android.gms.internal.ads;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.n0 */
final class C1982n0 implements C1908l0 {

    /* renamed from: a */
    private final long f11210a;

    /* renamed from: b */
    private final int f11211b;

    /* renamed from: c */
    private final long f11212c;

    /* renamed from: d */
    private final long f11213d;

    /* renamed from: e */
    private final long f11214e;

    /* renamed from: f */
    private final long[] f11215f;

    private C1982n0(long j, int i, long j2, long j3, long[] jArr) {
        this.f11210a = j;
        this.f11211b = i;
        this.f11212c = j2;
        this.f11215f = jArr;
        this.f11213d = j3;
        this.f11214e = j3 != -1 ? j + j3 : -1;
    }

    /* renamed from: c */
    public static C1982n0 m13560c(long j, long j2, jd4 jd4, dr2 dr2) {
        int v;
        long j3 = j;
        jd4 jd42 = jd4;
        int i = jd42.f9114g;
        int i2 = jd42.f9111d;
        int m = dr2.mo6587m();
        if ((m & 1) != 1 || (v = dr2.mo6596v()) == 0) {
            return null;
        }
        long Z = n13.m13621Z((long) v, ((long) i) * 1000000, (long) i2);
        if ((m & 6) != 6) {
            return new C1982n0(j2, jd42.f9110c, Z, -1, (long[]) null);
        }
        long A = dr2.mo6567A();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = (long) dr2.mo6593s();
        }
        if (j3 != -1) {
            long j4 = j2 + A;
            if (j3 != j4) {
                StringBuilder sb = new StringBuilder(67);
                sb.append("XING data size mismatch: ");
                sb.append(j3);
                sb.append(", ");
                sb.append(j4);
                Log.w("XingSeeker", sb.toString());
            }
        }
        return new C1982n0(j2, jd42.f9110c, Z, A, jArr);
    }

    /* renamed from: e */
    private final long m13561e(int i) {
        return (this.f11212c * ((long) i)) / 100;
    }

    /* renamed from: a */
    public final long mo6763a() {
        return this.f11214e;
    }

    /* renamed from: b */
    public final long mo5810b() {
        return this.f11212c;
    }

    /* renamed from: d */
    public final nd4 mo5811d(long j) {
        if (!mo5812f()) {
            qd4 qd4 = new qd4(0, this.f11210a + ((long) this.f11211b));
            return new nd4(qd4, qd4);
        }
        long U = n13.m13616U(j, 0, this.f11212c);
        double d = (((double) U) * 100.0d) / ((double) this.f11212c);
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = (long[]) wu1.m19203b(this.f11215f);
                double d3 = (double) jArr[i];
                d2 = d3 + ((d - ((double) i)) * ((i == 99 ? 256.0d : (double) jArr[i + 1]) - d3));
            }
        }
        qd4 qd42 = new qd4(U, this.f11210a + n13.m13616U(Math.round((d2 / 256.0d) * ((double) this.f11213d)), (long) this.f11211b, this.f11213d - 1));
        return new nd4(qd42, qd42);
    }

    /* renamed from: f */
    public final boolean mo5812f() {
        return this.f11215f != null;
    }

    /* renamed from: i */
    public final long mo6764i(long j) {
        long j2 = j - this.f11210a;
        if (!mo5812f() || j2 <= ((long) this.f11211b)) {
            return 0;
        }
        long[] jArr = (long[]) wu1.m19203b(this.f11215f);
        double d = (((double) j2) * 256.0d) / ((double) this.f11213d);
        int J = n13.m13605J(jArr, (long) d, true, true);
        long e = m13561e(J);
        long j3 = jArr[J];
        int i = J + 1;
        long e2 = m13561e(i);
        long j4 = J == 99 ? 256 : jArr[i];
        return e + Math.round((j3 == j4 ? 0.0d : (d - ((double) j3)) / ((double) (j4 - j3))) * ((double) (e2 - e)));
    }
}
