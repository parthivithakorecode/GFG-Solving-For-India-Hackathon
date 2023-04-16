package com.google.android.gms.internal.ads;

public class ic4 implements pd4 {

    /* renamed from: a */
    private final long f8610a;

    /* renamed from: b */
    private final long f8611b;

    /* renamed from: c */
    private final int f8612c;

    /* renamed from: d */
    private final long f8613d;

    /* renamed from: e */
    private final int f8614e;

    /* renamed from: f */
    private final long f8615f;

    public ic4(long j, long j2, int i, int i2, boolean z) {
        long e;
        this.f8610a = j;
        this.f8611b = j2;
        this.f8612c = i2 == -1 ? 1 : i2;
        this.f8614e = i;
        if (j == -1) {
            this.f8613d = -1;
            e = -9223372036854775807L;
        } else {
            this.f8613d = j - j2;
            e = m10990e(j, j2, i);
        }
        this.f8615f = e;
    }

    /* renamed from: e */
    private static long m10990e(long j, long j2, int i) {
        return (Math.max(0, j - j2) * 8000000) / ((long) i);
    }

    /* renamed from: b */
    public final long mo5810b() {
        return this.f8615f;
    }

    /* renamed from: c */
    public final long mo8131c(long j) {
        return m10990e(j, this.f8611b, this.f8614e);
    }

    /* renamed from: d */
    public final nd4 mo5811d(long j) {
        long j2 = this.f8613d;
        int i = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
        if (i != 0) {
            int i2 = this.f8614e;
            long j3 = (long) this.f8612c;
            long j4 = (((((long) i2) * j) / 8000000) / j3) * j3;
            if (i != 0) {
                j4 = Math.min(j4, j2 - j3);
            }
            long max = this.f8611b + Math.max(j4, 0);
            long c = mo8131c(max);
            qd4 qd4 = new qd4(c, max);
            if (this.f8613d != -1 && c < j) {
                long j5 = max + ((long) this.f8612c);
                if (j5 < this.f8610a) {
                    return new nd4(qd4, new qd4(mo8131c(j5), j5));
                }
            }
            return new nd4(qd4, qd4);
        }
        qd4 qd42 = new qd4(0, this.f8611b);
        return new nd4(qd42, qd42);
    }

    /* renamed from: f */
    public final boolean mo5812f() {
        return this.f8613d != -1;
    }
}
