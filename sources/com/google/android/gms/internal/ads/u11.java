package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

final class u11 {

    /* renamed from: a */
    private final MediaCodec.CryptoInfo f15328a;

    /* renamed from: b */
    private final MediaCodec.CryptoInfo.Pattern f15329b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* synthetic */ u11(MediaCodec.CryptoInfo cryptoInfo, t01 t01) {
        this.f15328a = cryptoInfo;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m17650a(u11 u11, int i, int i2) {
        u11.f15329b.set(i, i2);
        u11.f15328a.setPattern(u11.f15329b);
    }
}
