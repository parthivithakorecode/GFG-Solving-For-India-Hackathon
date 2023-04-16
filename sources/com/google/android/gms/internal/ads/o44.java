package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

final class o44 implements l44 {

    /* renamed from: a */
    private final int f11883a;

    /* renamed from: b */
    private MediaCodecInfo[] f11884b;

    public o44(boolean z, boolean z2) {
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.f11883a = i;
    }

    @EnsuresNonNull({"mediaCodecInfos"})
    /* renamed from: d */
    private final void m14289d() {
        if (this.f11884b == null) {
            this.f11884b = new MediaCodecList(this.f11883a).getCodecInfos();
        }
    }

    /* renamed from: E */
    public final MediaCodecInfo mo8874E(int i) {
        m14289d();
        return this.f11884b[i];
    }

    /* renamed from: a */
    public final boolean mo8875a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    /* renamed from: b */
    public final boolean mo8876b() {
        return true;
    }

    /* renamed from: c */
    public final boolean mo8877c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public final int zza() {
        m14289d();
        return this.f11884b.length;
    }
}
