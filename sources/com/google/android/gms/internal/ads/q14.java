package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

final class q14 {

    /* renamed from: a */
    private final AudioTrack f13020a;

    /* renamed from: b */
    private final AudioTimestamp f13021b = new AudioTimestamp();

    /* renamed from: c */
    private long f13022c;

    /* renamed from: d */
    private long f13023d;

    /* renamed from: e */
    private long f13024e;

    public q14(AudioTrack audioTrack) {
        this.f13020a = audioTrack;
    }

    /* renamed from: a */
    public final long mo10232a() {
        return this.f13024e;
    }

    /* renamed from: b */
    public final long mo10233b() {
        return this.f13021b.nanoTime / 1000;
    }

    /* renamed from: c */
    public final boolean mo10234c() {
        boolean timestamp = this.f13020a.getTimestamp(this.f13021b);
        if (timestamp) {
            long j = this.f13021b.framePosition;
            if (this.f13023d > j) {
                this.f13022c++;
            }
            this.f13023d = j;
            this.f13024e = j + (this.f13022c << 32);
        }
        return timestamp;
    }
}
