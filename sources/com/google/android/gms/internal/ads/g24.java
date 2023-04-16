package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;

final class g24 {

    /* renamed from: a */
    private final Handler f7238a = new Handler();

    /* renamed from: b */
    private final AudioTrack.StreamEventCallback f7239b;

    /* renamed from: c */
    final /* synthetic */ h24 f7240c;

    public g24(h24 h24) {
        this.f7240c = h24;
        this.f7239b = new f24(this, h24);
    }

    /* renamed from: a */
    public final void mo7499a(AudioTrack audioTrack) {
        audioTrack.registerStreamEventCallback(new e24(this.f7238a), this.f7239b);
    }

    /* renamed from: b */
    public final void mo7500b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f7239b);
        this.f7238a.removeCallbacksAndMessages((Object) null);
    }
}
