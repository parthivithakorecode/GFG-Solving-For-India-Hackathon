package com.google.android.gms.internal.ads;

import android.os.SystemClock;

public final class hy3 implements ex3 {

    /* renamed from: f */
    private final xv1 f8463f;

    /* renamed from: g */
    private boolean f8464g;

    /* renamed from: h */
    private long f8465h;

    /* renamed from: i */
    private long f8466i;

    /* renamed from: j */
    private e30 f8467j = e30.f6075d;

    public hy3(xv1 xv1) {
        this.f8463f = xv1;
    }

    /* renamed from: Y */
    public final void mo7179Y(e30 e30) {
        if (this.f8464g) {
            mo8041a(zza());
        }
        this.f8467j = e30;
    }

    /* renamed from: a */
    public final void mo8041a(long j) {
        this.f8465h = j;
        if (this.f8464g) {
            this.f8466i = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: b */
    public final void mo8042b() {
        if (!this.f8464g) {
            this.f8466i = SystemClock.elapsedRealtime();
            this.f8464g = true;
        }
    }

    /* renamed from: c */
    public final e30 mo7180c() {
        return this.f8467j;
    }

    /* renamed from: d */
    public final void mo8043d() {
        if (this.f8464g) {
            mo8041a(zza());
            this.f8464g = false;
        }
    }

    public final long zza() {
        long j = this.f8465h;
        if (!this.f8464g) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f8466i;
        e30 e30 = this.f8467j;
        return j + (e30.f6077a == 1.0f ? nz3.m14195c(elapsedRealtime) : e30.mo6784a(elapsedRealtime));
    }
}
