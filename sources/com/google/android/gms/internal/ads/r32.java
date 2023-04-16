package com.google.android.gms.internal.ads;

public final class r32 {

    /* renamed from: a */
    private int f13490a = 0;

    /* renamed from: b */
    private long f13491b = 0;

    /* renamed from: c */
    private long f13492c = 0;

    /* renamed from: d */
    private long f13493d = 0;

    /* renamed from: e */
    private final Object f13494e = new Object();

    /* renamed from: f */
    private final Object f13495f = new Object();

    /* renamed from: g */
    private final Object f13496g = new Object();

    /* renamed from: h */
    private final Object f13497h = new Object();

    /* renamed from: a */
    public final int mo10469a() {
        int i;
        synchronized (this.f13494e) {
            i = this.f13490a;
        }
        return i;
    }

    /* renamed from: b */
    public final synchronized long mo10470b() {
        long j;
        synchronized (this.f13497h) {
            j = this.f13493d;
        }
        return j;
    }

    /* renamed from: c */
    public final synchronized long mo10471c() {
        long j;
        synchronized (this.f13496g) {
            j = this.f13492c;
        }
        return j;
    }

    /* renamed from: d */
    public final long mo10472d() {
        long j;
        synchronized (this.f13495f) {
            j = this.f13491b;
        }
        return j;
    }

    /* renamed from: e */
    public final synchronized void mo10473e(long j) {
        synchronized (this.f13497h) {
            this.f13493d = j;
        }
    }

    /* renamed from: f */
    public final synchronized void mo10474f(long j) {
        synchronized (this.f13496g) {
            this.f13492c = j;
        }
    }

    /* renamed from: g */
    public final void mo10475g(int i) {
        synchronized (this.f13494e) {
            this.f13490a = i;
        }
    }

    /* renamed from: h */
    public final void mo10476h(long j) {
        synchronized (this.f13495f) {
            this.f13491b = j;
        }
    }
}
