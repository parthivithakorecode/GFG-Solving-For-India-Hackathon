package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

@TargetApi(21)
/* renamed from: com.google.android.gms.internal.ads.ij */
final class C1816ij implements C1705fj {

    /* renamed from: a */
    private final int f8664a;

    /* renamed from: b */
    private MediaCodecInfo[] f8665b;

    public C1816ij(boolean z) {
        this.f8664a = z ? 1 : 0;
    }

    /* renamed from: a */
    private final void m11040a() {
        if (this.f8665b == null) {
            this.f8665b = new MediaCodecList(this.f8664a).getCodecInfos();
        }
    }

    /* renamed from: E */
    public final MediaCodecInfo mo7347E(int i) {
        m11040a();
        return this.f8665b[i];
    }

    /* renamed from: F */
    public final boolean mo7348F(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: g */
    public final boolean mo7349g() {
        return true;
    }

    public final int zza() {
        m11040a();
        return this.f8665b.length;
    }
}
