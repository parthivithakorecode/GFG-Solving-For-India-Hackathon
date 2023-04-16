package com.google.android.gms.internal.ads;

import java.util.Objects;

public final class ky2 {

    /* renamed from: a */
    private long f9796a;

    /* renamed from: b */
    private long f9797b;

    /* renamed from: c */
    private long f9798c;

    /* renamed from: d */
    private final ThreadLocal<Long> f9799d = new ThreadLocal<>();

    public ky2(long j) {
        mo8821f(0);
    }

    /* renamed from: a */
    public final synchronized long mo8816a(long j) {
        if (this.f9797b == -9223372036854775807L) {
            long j2 = this.f9796a;
            if (j2 == 9223372036854775806L) {
                Long l = this.f9799d.get();
                Objects.requireNonNull(l);
                j2 = l.longValue();
            }
            this.f9797b = j2 - j;
            notifyAll();
        }
        this.f9798c = j;
        return j + this.f9797b;
    }

    /* renamed from: b */
    public final synchronized long mo8817b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f9798c;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = ((-1 + j4) * 8589934592L) + j;
            j += j4 * 8589934592L;
            if (Math.abs(j5 - j3) < Math.abs(j - j3)) {
                j = j5;
            }
        }
        return mo8816a((j * 1000000) / 90000);
    }

    /* renamed from: c */
    public final synchronized long mo8818c() {
        long j = this.f9796a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    /* renamed from: d */
    public final synchronized long mo8819d() {
        long j;
        j = this.f9798c;
        return j != -9223372036854775807L ? j + this.f9797b : mo8818c();
    }

    /* renamed from: e */
    public final synchronized long mo8820e() {
        return this.f9797b;
    }

    /* renamed from: f */
    public final synchronized void mo8821f(long j) {
        this.f9796a = j;
        this.f9797b = j == Long.MAX_VALUE ? 0 : -9223372036854775807L;
        this.f9798c = -9223372036854775807L;
    }
}
