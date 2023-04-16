package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

final class f24 extends AudioTrack.StreamEventCallback {

    /* renamed from: a */
    final /* synthetic */ h24 f6669a;

    /* renamed from: b */
    final /* synthetic */ g24 f6670b;

    f24(g24 g24, h24 h24) {
        this.f6670b = g24;
        this.f6669a = h24;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        wu1.m19207f(audioTrack == this.f6670b.f7240c.f8001n);
        if (this.f6670b.f7240c.f7998k != null && this.f6670b.f7240c.f7980I) {
            this.f6670b.f7240c.f7998k.mo8591a();
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        wu1.m19207f(audioTrack == this.f6670b.f7240c.f8001n);
        if (this.f6670b.f7240c.f7998k != null && this.f6670b.f7240c.f7980I) {
            this.f6670b.f7240c.f7998k.mo8591a();
        }
    }
}
