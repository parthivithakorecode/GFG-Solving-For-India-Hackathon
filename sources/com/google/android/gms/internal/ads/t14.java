package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Objects;

final class t14 {

    /* renamed from: A */
    private long f14648A;

    /* renamed from: B */
    private long f14649B;

    /* renamed from: C */
    private long f14650C;

    /* renamed from: D */
    private boolean f14651D;

    /* renamed from: E */
    private long f14652E;

    /* renamed from: F */
    private long f14653F;

    /* renamed from: a */
    private final s14 f14654a;

    /* renamed from: b */
    private final long[] f14655b;

    /* renamed from: c */
    private AudioTrack f14656c;

    /* renamed from: d */
    private int f14657d;

    /* renamed from: e */
    private int f14658e;

    /* renamed from: f */
    private r14 f14659f;

    /* renamed from: g */
    private int f14660g;

    /* renamed from: h */
    private boolean f14661h;

    /* renamed from: i */
    private long f14662i;

    /* renamed from: j */
    private float f14663j;

    /* renamed from: k */
    private boolean f14664k;

    /* renamed from: l */
    private long f14665l;

    /* renamed from: m */
    private long f14666m;

    /* renamed from: n */
    private Method f14667n;

    /* renamed from: o */
    private long f14668o;

    /* renamed from: p */
    private boolean f14669p;

    /* renamed from: q */
    private boolean f14670q;

    /* renamed from: r */
    private long f14671r;

    /* renamed from: s */
    private long f14672s;

    /* renamed from: t */
    private long f14673t;

    /* renamed from: u */
    private long f14674u;

    /* renamed from: v */
    private int f14675v;

    /* renamed from: w */
    private int f14676w;

    /* renamed from: x */
    private long f14677x;

    /* renamed from: y */
    private long f14678y;

    /* renamed from: z */
    private long f14679z;

    public t14(s14 s14) {
        this.f14654a = s14;
        if (n13.f11236a >= 18) {
            try {
                this.f14667n = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f14655b = new long[10];
    }

    /* renamed from: m */
    private final long m17059m(long j) {
        return (j * 1000000) / ((long) this.f14660g);
    }

    /* renamed from: n */
    private final long m17060n() {
        AudioTrack audioTrack = this.f14656c;
        Objects.requireNonNull(audioTrack);
        if (this.f14677x != -9223372036854775807L) {
            return Math.min(this.f14648A, this.f14679z + ((((SystemClock.elapsedRealtime() * 1000) - this.f14677x) * ((long) this.f14660g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f14661h) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.f14674u = this.f14672s;
                }
                playState = 2;
            }
            playbackHeadPosition += this.f14674u;
        }
        if (n13.f11236a <= 29) {
            if (playbackHeadPosition == 0 && this.f14672s > 0 && playState == 3) {
                if (this.f14678y == -9223372036854775807L) {
                    this.f14678y = SystemClock.elapsedRealtime();
                }
                return this.f14672s;
            }
            this.f14678y = -9223372036854775807L;
        }
        if (this.f14672s > playbackHeadPosition) {
            this.f14673t++;
        }
        this.f14672s = playbackHeadPosition;
        return playbackHeadPosition + (this.f14673t << 32);
    }

    /* renamed from: o */
    private final void m17061o() {
        this.f14665l = 0;
        this.f14676w = 0;
        this.f14675v = 0;
        this.f14666m = 0;
        this.f14650C = 0;
        this.f14653F = 0;
        this.f14664k = false;
    }

    /* renamed from: a */
    public final int mo10920a(long j) {
        return this.f14658e - ((int) (j - (m17060n() * ((long) this.f14657d))));
    }

    /* renamed from: b */
    public final long mo10921b(boolean z) {
        long j;
        String str;
        Method method;
        t14 t14 = this;
        AudioTrack audioTrack = t14.f14656c;
        Objects.requireNonNull(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long m = t14.m17059m(m17060n());
            if (m != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - t14.f14666m >= 30000) {
                    long[] jArr = t14.f14655b;
                    int i = t14.f14675v;
                    jArr[i] = m - nanoTime;
                    t14.f14675v = (i + 1) % 10;
                    int i2 = t14.f14676w;
                    if (i2 < 10) {
                        t14.f14676w = i2 + 1;
                    }
                    t14.f14666m = nanoTime;
                    t14.f14665l = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = t14.f14676w;
                        if (i3 >= i4) {
                            break;
                        }
                        t14.f14665l += t14.f14655b[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!t14.f14661h) {
                    r14 r14 = t14.f14659f;
                    Objects.requireNonNull(r14);
                    if (!r14.mo10462g(nanoTime)) {
                        str = "DefaultAudioSink";
                    } else {
                        long b = r14.mo10457b();
                        long a = r14.mo10456a();
                        if (Math.abs(b - nanoTime) > 5000000) {
                            d24 d24 = (d24) t14.f14654a;
                            long M = d24.f5630a.m10241x();
                            long N = d24.f5630a.m10242y();
                            StringBuilder sb = new StringBuilder(180);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(a);
                            sb.append(", ");
                            sb.append(b);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(m);
                            sb.append(", ");
                            sb.append(M);
                            sb.append(", ");
                            sb.append(N);
                            String str2 = "DefaultAudioSink";
                            Log.w(str2, sb.toString());
                            r14.mo10459d();
                            t14 = this;
                            str = str2;
                        } else {
                            String str3 = "DefaultAudioSink";
                            if (Math.abs(t14.m17059m(a) - m) > 5000000) {
                                d24 d242 = (d24) t14.f14654a;
                                long M2 = d242.f5630a.m10241x();
                                r14 r142 = r14;
                                long N2 = d242.f5630a.m10242y();
                                StringBuilder sb2 = new StringBuilder(182);
                                sb2.append("Spurious audio timestamp (frame position mismatch): ");
                                sb2.append(a);
                                sb2.append(", ");
                                sb2.append(b);
                                sb2.append(", ");
                                sb2.append(nanoTime);
                                sb2.append(", ");
                                sb2.append(m);
                                sb2.append(", ");
                                sb2.append(M2);
                                sb2.append(", ");
                                sb2.append(N2);
                                str = str3;
                                Log.w(str, sb2.toString());
                                r142.mo10459d();
                            } else {
                                str = str3;
                                r14.mo10458c();
                            }
                            t14 = this;
                        }
                    }
                    if (t14.f14670q && (method = t14.f14667n) != null && nanoTime - t14.f14671r >= 500000) {
                        try {
                            AudioTrack audioTrack2 = t14.f14656c;
                            Objects.requireNonNull(audioTrack2);
                            int i5 = n13.f11236a;
                            long intValue = (((long) ((Integer) method.invoke(audioTrack2, new Object[0])).intValue()) * 1000) - t14.f14662i;
                            t14.f14668o = intValue;
                            long max = Math.max(intValue, 0);
                            t14.f14668o = max;
                            if (max > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(max);
                                Log.w(str, sb3.toString());
                                t14.f14668o = 0;
                            }
                        } catch (Exception unused) {
                            t14.f14667n = null;
                        }
                        t14.f14671r = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        r14 r143 = t14.f14659f;
        Objects.requireNonNull(r143);
        boolean f = r143.mo10461f();
        if (f) {
            j = t14.m17059m(r143.mo10456a()) + n13.m13617V(nanoTime2 - r143.mo10457b(), t14.f14663j);
        } else {
            j = t14.f14676w == 0 ? t14.m17059m(m17060n()) : t14.f14665l + nanoTime2;
            if (!z) {
                j = Math.max(0, j - t14.f14668o);
            }
        }
        if (t14.f14651D != f) {
            t14.f14653F = t14.f14650C;
            t14.f14652E = t14.f14649B;
        }
        long j2 = nanoTime2 - t14.f14653F;
        if (j2 < 1000000) {
            long j3 = (j2 * 1000) / 1000000;
            j = ((j * j3) + ((1000 - j3) * (t14.f14652E + n13.m13617V(j2, t14.f14663j)))) / 1000;
        }
        if (!t14.f14664k) {
            long j4 = t14.f14649B;
            if (j > j4) {
                t14.f14664k = true;
                long currentTimeMillis = System.currentTimeMillis() - nz3.m14196d(n13.m13619X(nz3.m14196d(j - j4), t14.f14663j));
                d24 d243 = (d24) t14.f14654a;
                if (d243.f5630a.f7998k != null) {
                    ((k24) d243.f5630a.f7998k).f9353a.f9854H0.mo7799r(currentTimeMillis);
                }
            }
        }
        t14.f14650C = nanoTime2;
        t14.f14649B = j;
        t14.f14651D = f;
        return j;
    }

    /* renamed from: c */
    public final long mo10922c(long j) {
        return nz3.m14196d(m17059m(-m17060n()));
    }

    /* renamed from: d */
    public final void mo10923d(long j) {
        this.f14679z = m17060n();
        this.f14677x = SystemClock.elapsedRealtime() * 1000;
        this.f14648A = j;
    }

    /* renamed from: e */
    public final void mo10924e() {
        m17061o();
        this.f14656c = null;
        this.f14659f = null;
    }

    /* renamed from: f */
    public final void mo10925f(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.f14656c = audioTrack;
        this.f14657d = i2;
        this.f14658e = i3;
        this.f14659f = new r14(audioTrack);
        this.f14660g = audioTrack.getSampleRate();
        this.f14661h = false;
        boolean r = n13.m13645r(i);
        this.f14670q = r;
        this.f14662i = r ? m17059m((long) (i3 / i2)) : -9223372036854775807L;
        this.f14672s = 0;
        this.f14673t = 0;
        this.f14674u = 0;
        this.f14669p = false;
        this.f14677x = -9223372036854775807L;
        this.f14678y = -9223372036854775807L;
        this.f14671r = 0;
        this.f14668o = 0;
        this.f14663j = 1.0f;
    }

    /* renamed from: g */
    public final void mo10926g() {
        r14 r14 = this.f14659f;
        Objects.requireNonNull(r14);
        r14.mo10460e();
    }

    /* renamed from: h */
    public final boolean mo10927h(long j) {
        if (j > m17060n()) {
            return true;
        }
        if (!this.f14661h) {
            return false;
        }
        AudioTrack audioTrack = this.f14656c;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 2 && m17060n() == 0;
    }

    /* renamed from: i */
    public final boolean mo10928i() {
        AudioTrack audioTrack = this.f14656c;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    /* renamed from: j */
    public final boolean mo10929j(long j) {
        return this.f14678y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f14678y >= 200;
    }

    /* renamed from: k */
    public final boolean mo10930k(long j) {
        AudioTrack audioTrack = this.f14656c;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.f14661h) {
            if (playState == 2) {
                this.f14669p = false;
                return false;
            } else if (playState == 1) {
                if (m17060n() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.f14669p;
        boolean h = mo10927h(j);
        this.f14669p = h;
        if (z && !h && playState != 1) {
            s14 s14 = this.f14654a;
            int i = this.f14658e;
            long d = nz3.m14196d(this.f14662i);
            d24 d24 = (d24) s14;
            if (d24.f5630a.f7998k != null) {
                ((k24) d24.f5630a.f7998k).f9353a.f9854H0.mo7801t(i, d, SystemClock.elapsedRealtime() - d24.f5630a.f7984M);
            }
        }
        return true;
    }

    /* renamed from: l */
    public final boolean mo10931l() {
        m17061o();
        if (this.f14677x != -9223372036854775807L) {
            return false;
        }
        r14 r14 = this.f14659f;
        Objects.requireNonNull(r14);
        r14.mo10460e();
        return true;
    }
}
