package com.google.android.gms.internal.ads;

import android.util.Log;

public final class hh3 implements dx3 {

    /* renamed from: a */
    private final g94 f8241a;

    /* renamed from: b */
    private final long f8242b = nz3.m14195c(50000);

    /* renamed from: c */
    private final long f8243c = nz3.m14195c(50000);

    /* renamed from: d */
    private final long f8244d = nz3.m14195c(2500);

    /* renamed from: e */
    private final long f8245e = nz3.m14195c(5000);

    /* renamed from: f */
    private final long f8246f = nz3.m14195c(0);

    /* renamed from: g */
    private int f8247g = 13107200;

    /* renamed from: h */
    private boolean f8248h;

    public hh3() {
        g94 g94 = new g94(true, 65536);
        m10569i(2500, 0, "bufferForPlaybackMs", "0");
        m10569i(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m10569i(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        m10569i(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m10569i(50000, 50000, "maxBufferMs", "minBufferMs");
        m10569i(0, 0, "backBufferDurationMs", "0");
        this.f8241a = g94;
    }

    /* renamed from: i */
    private static void m10569i(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        StringBuilder sb = new StringBuilder(str.length() + 21 + str2.length());
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        wu1.m19206e(z, sb.toString());
    }

    /* renamed from: j */
    private final void m10570j(boolean z) {
        this.f8247g = 13107200;
        this.f8248h = false;
        if (z) {
            this.f8241a.mo7540e();
        }
    }

    /* renamed from: a */
    public final void mo6711a() {
        m10570j(false);
    }

    /* renamed from: b */
    public final boolean mo6712b() {
        return false;
    }

    /* renamed from: c */
    public final void mo6713c() {
        m10570j(true);
    }

    /* renamed from: d */
    public final void mo6714d(xx3[] xx3Arr, hm0 hm0, w74[] w74Arr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 13107200;
            if (i < 2) {
                if (w74Arr[i] != null) {
                    if (xx3Arr[i].mo5787a() != 1) {
                        i3 = 131072000;
                    }
                    i2 += i3;
                }
                i++;
            } else {
                int max = Math.max(13107200, i2);
                this.f8247g = max;
                this.f8241a.mo7541f(max);
                return;
            }
        }
    }

    /* renamed from: e */
    public final boolean mo6715e(long j, float f, boolean z, long j2) {
        long X = n13.m13619X(j, f);
        long j3 = z ? this.f8245e : this.f8244d;
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || X >= j3 || this.f8241a.mo7536a() >= this.f8247g;
    }

    /* renamed from: f */
    public final g94 mo6716f() {
        return this.f8241a;
    }

    /* renamed from: g */
    public final void mo6717g() {
        m10570j(true);
    }

    /* renamed from: h */
    public final boolean mo6718h(long j, long j2, float f) {
        int a = this.f8241a.mo7536a();
        int i = this.f8247g;
        long j3 = this.f8242b;
        if (f > 1.0f) {
            j3 = Math.min(n13.m13617V(j3, f), this.f8243c);
        }
        int i2 = (j2 > Math.max(j3, 500000) ? 1 : (j2 == Math.max(j3, 500000) ? 0 : -1));
        boolean z = false;
        if (i2 < 0) {
            if (a < i) {
                z = true;
            }
            this.f8248h = z;
            if (!z && j2 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.f8243c || a >= i) {
            this.f8248h = false;
        }
        return this.f8248h;
    }

    public final long zza() {
        return this.f8246f;
    }
}
