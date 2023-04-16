package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

final class w14 extends Thread {

    /* renamed from: f */
    final /* synthetic */ AudioTrack f16654f;

    /* renamed from: g */
    final /* synthetic */ h24 f16655g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    w14(h24 h24, String str, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.f16655g = h24;
        this.f16654f = audioTrack;
    }

    public final void run() {
        try {
            this.f16654f.flush();
            this.f16654f.release();
        } finally {
            this.f16655g.f7992e.open();
        }
    }
}
