package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTrack;

final class r14 {

    /* renamed from: a */
    private final q14 f13460a;

    /* renamed from: b */
    private int f13461b;

    /* renamed from: c */
    private long f13462c;

    /* renamed from: d */
    private long f13463d;

    /* renamed from: e */
    private long f13464e;

    /* renamed from: f */
    private long f13465f;

    public r14(AudioTrack audioTrack) {
        if (n13.f11236a >= 19) {
            this.f13460a = new q14(audioTrack);
            mo10460e();
            return;
        }
        this.f13460a = null;
        m16004h(3);
    }

    /* renamed from: h */
    private final void m16004h(int i) {
        this.f13461b = i;
        long j = 10000;
        if (i == 0) {
            this.f13464e = 0;
            this.f13465f = -1;
            this.f13462c = System.nanoTime() / 1000;
        } else if (i != 1) {
            j = (i == 2 || i == 3) ? 10000000 : 500000;
        } else {
            this.f13463d = 10000;
            return;
        }
        this.f13463d = j;
    }

    @TargetApi(19)
    /* renamed from: a */
    public final long mo10456a() {
        q14 q14 = this.f13460a;
        if (q14 != null) {
            return q14.mo10232a();
        }
        return -1;
    }

    @TargetApi(19)
    /* renamed from: b */
    public final long mo10457b() {
        q14 q14 = this.f13460a;
        if (q14 != null) {
            return q14.mo10233b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: c */
    public final void mo10458c() {
        if (this.f13461b == 4) {
            mo10460e();
        }
    }

    /* renamed from: d */
    public final void mo10459d() {
        m16004h(4);
    }

    /* renamed from: e */
    public final void mo10460e() {
        if (this.f13460a != null) {
            m16004h(0);
        }
    }

    /* renamed from: f */
    public final boolean mo10461f() {
        return this.f13461b == 2;
    }

    @TargetApi(19)
    /* renamed from: g */
    public final boolean mo10462g(long j) {
        q14 q14 = this.f13460a;
        if (q14 != null && j - this.f13464e >= this.f13463d) {
            this.f13464e = j;
            boolean c = q14.mo10234c();
            int i = this.f13461b;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3 && c) {
                            mo10460e();
                            return true;
                        }
                    } else if (!c) {
                        mo10460e();
                        return false;
                    }
                } else if (!c) {
                    mo10460e();
                } else if (this.f13460a.mo10232a() > this.f13465f) {
                    m16004h(2);
                    return true;
                }
            } else if (c) {
                if (this.f13460a.mo10233b() < this.f13462c) {
                    return false;
                }
                this.f13465f = this.f13460a.mo10232a();
                m16004h(1);
                return true;
            } else if (j - this.f13462c > 500000) {
                m16004h(3);
            }
            return c;
        }
        return false;
    }
}
