package com.google.android.gms.internal.ads;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.m0 */
final class C1945m0 implements C1908l0 {

    /* renamed from: a */
    private final long[] f10220a;

    /* renamed from: b */
    private final long[] f10221b;

    /* renamed from: c */
    private final long f10222c;

    /* renamed from: d */
    private final long f10223d;

    private C1945m0(long[] jArr, long[] jArr2, long j, long j2) {
        this.f10220a = jArr;
        this.f10221b = jArr2;
        this.f10222c = j;
        this.f10223d = j2;
    }

    /* renamed from: c */
    public static C1945m0 m12996c(long j, long j2, jd4 jd4, dr2 dr2) {
        int i;
        long j3 = j;
        jd4 jd42 = jd4;
        dr2 dr22 = dr2;
        dr22.mo6581g(10);
        int m = dr2.mo6587m();
        if (m <= 0) {
            return null;
        }
        int i2 = jd42.f9111d;
        long Z = n13.m13621Z((long) m, ((long) (i2 >= 32000 ? 1152 : 576)) * 1000000, (long) i2);
        int w = dr2.mo6597w();
        int w2 = dr2.mo6597w();
        int w3 = dr2.mo6597w();
        dr22.mo6581g(2);
        long j4 = j2 + ((long) jd42.f9110c);
        long[] jArr = new long[w];
        long[] jArr2 = new long[w];
        int i3 = 0;
        long j5 = j2;
        while (i3 < w) {
            int i4 = w2;
            jArr[i3] = (((long) i3) * Z) / ((long) w);
            long j6 = j4;
            jArr2[i3] = Math.max(j5, j6);
            if (w3 == 1) {
                i = dr2.mo6593s();
            } else if (w3 == 2) {
                i = dr2.mo6597w();
            } else if (w3 == 3) {
                i = dr2.mo6595u();
            } else if (w3 != 4) {
                return null;
            } else {
                i = dr2.mo6596v();
            }
            j5 += (long) (i * i4);
            i3++;
            j4 = j6;
            w2 = i4;
        }
        if (!(j3 == -1 || j3 == j5)) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("VBRI data size mismatch: ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j5);
            Log.w("VbriSeeker", sb.toString());
        }
        return new C1945m0(jArr, jArr2, Z, j5);
    }

    /* renamed from: a */
    public final long mo6763a() {
        return this.f10223d;
    }

    /* renamed from: b */
    public final long mo5810b() {
        return this.f10222c;
    }

    /* renamed from: d */
    public final nd4 mo5811d(long j) {
        int J = n13.m13605J(this.f10220a, j, true, true);
        qd4 qd4 = new qd4(this.f10220a[J], this.f10221b[J]);
        if (qd4.f13141a < j) {
            long[] jArr = this.f10220a;
            if (J != jArr.length - 1) {
                int i = J + 1;
                return new nd4(qd4, new qd4(jArr[i], this.f10221b[i]));
            }
        }
        return new nd4(qd4, qd4);
    }

    /* renamed from: f */
    public final boolean mo5812f() {
        return true;
    }

    /* renamed from: i */
    public final long mo6764i(long j) {
        return this.f10220a[n13.m13605J(this.f10221b, j, true, true)];
    }
}
