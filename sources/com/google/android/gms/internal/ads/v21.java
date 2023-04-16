package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import java.util.Objects;

public final class v21 {

    /* renamed from: a */
    public byte[] f15864a;

    /* renamed from: b */
    public byte[] f15865b;

    /* renamed from: c */
    public int f15866c;

    /* renamed from: d */
    public int[] f15867d;

    /* renamed from: e */
    public int[] f15868e;

    /* renamed from: f */
    public int f15869f;

    /* renamed from: g */
    public int f15870g;

    /* renamed from: h */
    public int f15871h;

    /* renamed from: i */
    private final MediaCodec.CryptoInfo f15872i;

    /* renamed from: j */
    private final u11 f15873j;

    public v21() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f15872i = cryptoInfo;
        this.f15873j = n13.f11236a >= 24 ? new u11(cryptoInfo, (t01) null) : null;
    }

    /* renamed from: a */
    public final MediaCodec.CryptoInfo mo11368a() {
        return this.f15872i;
    }

    /* renamed from: b */
    public final void mo11369b(int i) {
        if (i != 0) {
            if (this.f15867d == null) {
                int[] iArr = new int[1];
                this.f15867d = iArr;
                this.f15872i.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.f15867d;
            iArr2[0] = iArr2[0] + i;
        }
    }

    /* renamed from: c */
    public final void mo11370c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f15869f = i;
        this.f15867d = iArr;
        this.f15868e = iArr2;
        this.f15865b = bArr;
        this.f15864a = bArr2;
        this.f15866c = i2;
        this.f15870g = i3;
        this.f15871h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f15872i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (n13.f11236a >= 24) {
            u11 u11 = this.f15873j;
            Objects.requireNonNull(u11);
            u11.m17650a(u11, i3, i4);
        }
    }
}
