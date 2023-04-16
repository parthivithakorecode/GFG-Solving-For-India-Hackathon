package com.google.android.gms.internal.ads;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Objects;

final class s34 {

    /* renamed from: a */
    private long f14246a;

    /* renamed from: b */
    private long f14247b;

    /* renamed from: c */
    private boolean f14248c;

    s34() {
    }

    /* renamed from: d */
    private final long m16612d(long j) {
        return this.f14246a + Math.max(0, ((this.f14247b - 529) * 1000000) / j);
    }

    /* renamed from: a */
    public final long mo10718a(C1574c0 c0Var) {
        return m16612d((long) c0Var.f5248z);
    }

    /* renamed from: b */
    public final long mo10719b(C1574c0 c0Var, z51 z51) {
        if (this.f14247b == 0) {
            this.f14246a = z51.f18035e;
        }
        if (this.f14248c) {
            return z51.f18035e;
        }
        ByteBuffer byteBuffer = z51.f18033c;
        Objects.requireNonNull(byteBuffer);
        byte b = 0;
        for (int i = 0; i < 4; i++) {
            b = (b << 8) | (byteBuffer.get(i) & 255);
        }
        int c = kd4.m12123c(b);
        if (c == -1) {
            this.f14248c = true;
            this.f14247b = 0;
            this.f14246a = z51.f18035e;
            Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return z51.f18035e;
        }
        long d = m16612d((long) c0Var.f5248z);
        this.f14247b += (long) c;
        return d;
    }

    /* renamed from: c */
    public final void mo10720c() {
        this.f14246a = 0;
        this.f14247b = 0;
        this.f14248c = false;
    }
}
