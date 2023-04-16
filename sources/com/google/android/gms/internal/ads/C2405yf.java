package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.yf */
class C2405yf {

    /* renamed from: a */
    protected AudioTrack f17694a;

    /* renamed from: b */
    private boolean f17695b;

    /* renamed from: c */
    private int f17696c;

    /* renamed from: d */
    private long f17697d;

    /* renamed from: e */
    private long f17698e;

    /* renamed from: f */
    private long f17699f;

    /* renamed from: g */
    private long f17700g;

    /* renamed from: h */
    private long f17701h;

    /* renamed from: i */
    private long f17702i;

    /* synthetic */ C2405yf(C2368xf xfVar) {
    }

    /* renamed from: a */
    public final long mo11996a() {
        if (this.f17700g != -9223372036854775807L) {
            return Math.min(this.f17702i, this.f17701h + ((((SystemClock.elapsedRealtime() * 1000) - this.f17700g) * ((long) this.f17696c)) / 1000000));
        }
        int playState = this.f17694a.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) this.f17694a.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f17695b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f17699f = this.f17697d;
            }
            playbackHeadPosition += this.f17699f;
        }
        if (this.f17697d > playbackHeadPosition) {
            this.f17698e++;
        }
        this.f17697d = playbackHeadPosition;
        return playbackHeadPosition + (this.f17698e << 32);
    }

    /* renamed from: b */
    public final long mo11997b() {
        return (mo11996a() * 1000000) / ((long) this.f17696c);
    }

    /* renamed from: c */
    public long mo11998c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public long mo11999d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final void mo12000e(long j) {
        this.f17701h = mo11996a();
        this.f17700g = SystemClock.elapsedRealtime() * 1000;
        this.f17702i = j;
        this.f17694a.stop();
    }

    /* renamed from: f */
    public final void mo12001f() {
        if (this.f17700g == -9223372036854775807L) {
            this.f17694a.pause();
        }
    }

    /* renamed from: g */
    public void mo12002g(AudioTrack audioTrack, boolean z) {
        this.f17694a = audioTrack;
        this.f17695b = z;
        this.f17700g = -9223372036854775807L;
        this.f17697d = 0;
        this.f17698e = 0;
        this.f17699f = 0;
        if (audioTrack != null) {
            this.f17696c = audioTrack.getSampleRate();
        }
    }

    /* renamed from: h */
    public boolean mo12003h() {
        return false;
    }
}
