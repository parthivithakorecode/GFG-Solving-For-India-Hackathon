package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

final class pp0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ MediaPlayer f12755f;

    /* renamed from: g */
    final /* synthetic */ xp0 f12756g;

    pp0(xp0 xp0, MediaPlayer mediaPlayer) {
        this.f12756g = xp0;
        this.f12755f = mediaPlayer;
    }

    public final void run() {
        xp0.m19591L(this.f12756g, this.f12755f);
        if (this.f12756g.f17293w != null) {
            this.f12756g.f17293w.mo7684d();
        }
    }
}
