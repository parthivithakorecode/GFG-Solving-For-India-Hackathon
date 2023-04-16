package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

public final /* synthetic */ class f34 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ MediaCodec f6684f;

    public /* synthetic */ f34(MediaCodec mediaCodec) {
        this.f6684f = mediaCodec;
    }

    public final void run() {
        this.f6684f.start();
    }
}
