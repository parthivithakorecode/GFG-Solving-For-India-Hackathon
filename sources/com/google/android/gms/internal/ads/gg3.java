package com.google.android.gms.internal.ads;

import android.os.SystemClock;

public final class gg3 {

    /* renamed from: a */
    private final long f7470a;

    /* renamed from: b */
    private final long f7471b;

    /* renamed from: c */
    private long f7472c = -9223372036854775807L;

    /* renamed from: d */
    private long f7473d = -9223372036854775807L;

    /* renamed from: e */
    private long f7474e = -9223372036854775807L;

    /* renamed from: f */
    private long f7475f = -9223372036854775807L;

    /* renamed from: g */
    private long f7476g = -9223372036854775807L;

    /* renamed from: h */
    private long f7477h = -9223372036854775807L;

    /* renamed from: i */
    private float f7478i = 1.03f;

    /* renamed from: j */
    private float f7479j = 0.97f;

    /* renamed from: k */
    private float f7480k = 1.0f;

    /* renamed from: l */
    private long f7481l = -9223372036854775807L;

    /* renamed from: m */
    private long f7482m = -9223372036854775807L;

    /* renamed from: n */
    private long f7483n = -9223372036854775807L;

    /* synthetic */ gg3(float f, float f2, long j, float f3, long j2, long j3, float f4, ff3 ff3) {
        this.f7470a = j2;
        this.f7471b = j3;
    }

    /* renamed from: f */
    private static long m9775f(long j, long j2, float f) {
        return (long) ((((float) j) * 0.999f) + (((float) j2) * 9.999871E-4f));
    }

    /* renamed from: g */
    private final void m9776g() {
        long j = this.f7472c;
        if (j != -9223372036854775807L) {
            long j2 = this.f7473d;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f7475f;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f7476g;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f7474e != j) {
            this.f7474e = j;
            this.f7477h = j;
            this.f7482m = -9223372036854775807L;
            this.f7483n = -9223372036854775807L;
            this.f7481l = -9223372036854775807L;
        }
    }

    /* renamed from: a */
    public final float mo7633a(long j, long j2) {
        long j3;
        long j4;
        float f = 1.0f;
        if (this.f7472c != -9223372036854775807L) {
            long j5 = j - j2;
            long j6 = this.f7482m;
            if (j6 == -9223372036854775807L) {
                this.f7482m = j5;
                j3 = 0;
            } else {
                long max = Math.max(j5, m9775f(j6, j5, 0.999f));
                this.f7482m = max;
                j3 = m9775f(this.f7483n, Math.abs(j5 - max), 0.999f);
            }
            this.f7483n = j3;
            if (this.f7481l != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f7481l < 1000) {
                return this.f7480k;
            }
            this.f7481l = SystemClock.elapsedRealtime();
            long j7 = this.f7482m + (this.f7483n * 3);
            if (this.f7477h > j7) {
                long c = nz3.m14195c(1000);
                float f2 = this.f7480k;
                float f3 = (float) c;
                float f4 = this.f7478i;
                long[] jArr = new long[3];
                jArr[0] = j7;
                jArr[1] = this.f7474e;
                long[] jArr2 = jArr;
                jArr2[2] = this.f7477h - (((long) ((f2 - 4.0f) * f3)) + ((long) ((f4 - 4.0f) * f3)));
                j4 = jArr2[0];
                for (int i = 1; i < 3; i++) {
                    long j8 = jArr2[i];
                    if (j8 > j4) {
                        j4 = j8;
                    }
                }
                this.f7477h = j4;
            } else {
                long U = n13.m13616U(j - ((long) (Math.max(0.0f, this.f7480k - 4.0f) / 1.0E-7f)), this.f7477h, j7);
                this.f7477h = U;
                long j9 = this.f7476g;
                if (j9 == -9223372036854775807L || U <= j9) {
                    j4 = U;
                } else {
                    this.f7477h = j9;
                    j4 = j9;
                }
            }
            long j10 = j - j4;
            if (Math.abs(j10) >= this.f7470a) {
                f = n13.m13596A((((float) j10) * 1.0E-7f) + 1.0f, this.f7479j, this.f7478i);
            }
            this.f7480k = f;
        }
        return f;
    }

    /* renamed from: b */
    public final long mo7634b() {
        return this.f7477h;
    }

    /* renamed from: c */
    public final void mo7635c() {
        long j = this.f7477h;
        if (j != -9223372036854775807L) {
            long j2 = j + this.f7471b;
            this.f7477h = j2;
            long j3 = this.f7476g;
            if (j3 != -9223372036854775807L && j2 > j3) {
                this.f7477h = j3;
            }
            this.f7481l = -9223372036854775807L;
        }
    }

    /* renamed from: d */
    public final void mo7636d(C2221th thVar) {
        long j = thVar.f14855a;
        this.f7472c = nz3.m14195c(-9223372036854775807L);
        this.f7475f = nz3.m14195c(-9223372036854775807L);
        this.f7476g = nz3.m14195c(-9223372036854775807L);
        this.f7479j = 0.97f;
        this.f7478i = 1.03f;
        m9776g();
    }

    /* renamed from: e */
    public final void mo7637e(long j) {
        this.f7473d = j;
        m9776g();
    }
}
