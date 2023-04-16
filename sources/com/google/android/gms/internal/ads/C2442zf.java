package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
/* renamed from: com.google.android.gms.internal.ads.zf */
final class C2442zf extends C2405yf {

    /* renamed from: j */
    private final AudioTimestamp f18178j = new AudioTimestamp();

    /* renamed from: k */
    private long f18179k;

    /* renamed from: l */
    private long f18180l;

    /* renamed from: m */
    private long f18181m;

    public C2442zf() {
        super((C2368xf) null);
    }

    /* renamed from: c */
    public final long mo11998c() {
        return this.f18181m;
    }

    /* renamed from: d */
    public final long mo11999d() {
        return this.f18178j.nanoTime;
    }

    /* renamed from: g */
    public final void mo12002g(AudioTrack audioTrack, boolean z) {
        super.mo12002g(audioTrack, z);
        this.f18179k = 0;
        this.f18180l = 0;
        this.f18181m = 0;
    }

    /* renamed from: h */
    public final boolean mo12003h() {
        boolean timestamp = this.f17694a.getTimestamp(this.f18178j);
        if (timestamp) {
            long j = this.f18178j.framePosition;
            if (this.f18180l > j) {
                this.f18179k++;
            }
            this.f18180l = j;
            this.f18181m = j + (this.f18179k << 32);
        }
        return timestamp;
    }
}
