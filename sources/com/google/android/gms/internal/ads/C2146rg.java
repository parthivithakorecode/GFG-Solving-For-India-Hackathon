package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

/* renamed from: com.google.android.gms.internal.ads.rg */
public final class C2146rg {

    /* renamed from: a */
    public byte[] f13629a;

    /* renamed from: b */
    public byte[] f13630b;

    /* renamed from: c */
    public int f13631c;

    /* renamed from: d */
    public int[] f13632d;

    /* renamed from: e */
    public int[] f13633e;

    /* renamed from: f */
    public int f13634f;

    /* renamed from: g */
    private final MediaCodec.CryptoInfo f13635g;

    /* renamed from: h */
    private final C2109qg f13636h;

    public C2146rg() {
        int i = C2449zm.f18287a;
        C2109qg qgVar = null;
        MediaCodec.CryptoInfo cryptoInfo = i >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f13635g = cryptoInfo;
        this.f13636h = i >= 24 ? new C2109qg(cryptoInfo, (C2072pg) null) : qgVar;
    }

    @TargetApi(16)
    /* renamed from: a */
    public final MediaCodec.CryptoInfo mo10519a() {
        return this.f13635g;
    }

    /* renamed from: b */
    public final void mo10520b(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.f13634f = i;
        this.f13632d = iArr;
        this.f13633e = iArr2;
        this.f13630b = bArr;
        this.f13629a = bArr2;
        this.f13631c = 1;
        int i3 = C2449zm.f18287a;
        if (i3 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f13635g;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i3 >= 24) {
                C2109qg.m15612a(this.f13636h, 0, 0);
            }
        }
    }
}
