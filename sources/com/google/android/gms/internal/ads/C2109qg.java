package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

@TargetApi(24)
/* renamed from: com.google.android.gms.internal.ads.qg */
final class C2109qg {

    /* renamed from: a */
    private final MediaCodec.CryptoInfo f13155a;

    /* renamed from: b */
    private final MediaCodec.CryptoInfo.Pattern f13156b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* synthetic */ C2109qg(MediaCodec.CryptoInfo cryptoInfo, C2072pg pgVar) {
        this.f13155a = cryptoInfo;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m15612a(C2109qg qgVar, int i, int i2) {
        qgVar.f13156b.set(0, 0);
        qgVar.f13155a.setPattern(qgVar.f13156b);
    }
}
