package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

final class n44 implements l44 {
    /* synthetic */ n44(m44 m44) {
    }

    /* renamed from: E */
    public final MediaCodecInfo mo8874E(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    /* renamed from: a */
    public final boolean mo8875a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    /* renamed from: b */
    public final boolean mo8876b() {
        return false;
    }

    /* renamed from: c */
    public final boolean mo8877c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    public final int zza() {
        return MediaCodecList.getCodecCount();
    }
}
