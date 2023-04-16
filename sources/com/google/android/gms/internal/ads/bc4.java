package com.google.android.gms.internal.ads;

public final class bc4 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f4860a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f4861b;

    /* renamed from: c */
    private final long f4862c;

    /* renamed from: d */
    private long f4863d = 0;

    /* renamed from: e */
    private long f4864e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f4865f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f4866g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f4867h;

    protected bc4(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f4860a = j;
        long j8 = j2;
        this.f4861b = j8;
        long j9 = j4;
        this.f4864e = j9;
        long j10 = j5;
        this.f4865f = j10;
        long j11 = j6;
        this.f4866g = j11;
        long j12 = j7;
        this.f4862c = j12;
        this.f4867h = m6800f(j8, 0, j9, j10, j11, j12);
    }

    /* renamed from: f */
    protected static long m6800f(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
        return n13.m13616U(((j4 + j7) - j6) - (j7 / 20), j4, -1 + j5);
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ void m6801g(bc4 bc4, long j, long j2) {
        bc4.f4864e = j;
        bc4.f4866g = j2;
        bc4.m6803i();
    }

    /* renamed from: h */
    static /* bridge */ /* synthetic */ void m6802h(bc4 bc4, long j, long j2) {
        bc4.f4863d = j;
        bc4.f4865f = j2;
        bc4.m6803i();
    }

    /* renamed from: i */
    private final void m6803i() {
        this.f4867h = m6800f(this.f4861b, this.f4863d, this.f4864e, this.f4865f, this.f4866g, this.f4862c);
    }
}
