package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: com.google.android.gms.internal.ads.hj */
final class C1779hj implements C1705fj {
    /* synthetic */ C1779hj(C1742gj gjVar) {
    }

    /* renamed from: E */
    public final MediaCodecInfo mo7347E(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    /* renamed from: F */
    public final boolean mo7348F(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }

    /* renamed from: g */
    public final boolean mo7349g() {
        return false;
    }

    public final int zza() {
        return MediaCodecList.getCodecCount();
    }
}
