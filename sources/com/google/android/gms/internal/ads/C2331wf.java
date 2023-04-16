package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* renamed from: com.google.android.gms.internal.ads.wf */
final class C2331wf extends Thread {

    /* renamed from: f */
    final /* synthetic */ AudioTrack f16797f;

    /* renamed from: g */
    final /* synthetic */ C1739gg f16798g;

    C2331wf(C1739gg ggVar, AudioTrack audioTrack) {
        this.f16798g = ggVar;
        this.f16797f = audioTrack;
    }

    public final void run() {
        try {
            this.f16797f.flush();
            this.f16797f.release();
        } finally {
            this.f16798g.f7444e.open();
        }
    }
}
