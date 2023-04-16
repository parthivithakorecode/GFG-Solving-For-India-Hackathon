package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import java.util.Objects;

@TargetApi(16)
/* renamed from: com.google.android.gms.internal.ads.xi */
public final class C2371xi {

    /* renamed from: a */
    public final String f17214a;

    /* renamed from: b */
    public final boolean f17215b;

    /* renamed from: c */
    public final boolean f17216c;

    /* renamed from: d */
    public final boolean f17217d;

    /* renamed from: e */
    private final String f17218e;

    /* renamed from: f */
    private final MediaCodecInfo.CodecCapabilities f17219f;

    private C2371xi(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        Objects.requireNonNull(str);
        this.f17214a = str;
        this.f17218e = str2;
        this.f17219f = codecCapabilities;
        boolean z3 = true;
        this.f17215b = !z && codecCapabilities != null && C2449zm.f18287a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        this.f17216c = codecCapabilities != null && C2449zm.f18287a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
        if (!z2 && (codecCapabilities == null || C2449zm.f18287a < 21 || !codecCapabilities.isFeatureSupported("secure-playback"))) {
            z3 = false;
        }
        this.f17217d = z3;
    }

    /* renamed from: a */
    public static C2371xi m19519a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new C2371xi(str, str2, codecCapabilities, z, z2);
    }

    /* renamed from: b */
    public static C2371xi m19520b(String str) {
        return new C2371xi("OMX.google.raw.decoder", (String) null, (MediaCodecInfo.CodecCapabilities) null, false, false);
    }

    /* renamed from: h */
    private final void m19521h(String str) {
        String str2 = this.f17214a;
        String str3 = this.f17218e;
        String str4 = C2449zm.f18291e;
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(str.length() + 20 + length + length2 + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }

    @TargetApi(21)
    /* renamed from: i */
    private static boolean m19522i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        return (d == -1.0d || d <= 0.0d) ? videoCapabilities.isSizeSupported(i, i2) : videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }

    @TargetApi(21)
    /* renamed from: c */
    public final boolean mo11849c(int i) {
        String sb;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f17219f;
        if (codecCapabilities == null) {
            sb = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                sb = "channelCount.aCaps";
            } else if (audioCapabilities.getMaxInputChannelCount() >= i) {
                return true;
            } else {
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("channelCount.support, ");
                sb2.append(i);
                sb = sb2.toString();
            }
        }
        m19521h(sb);
        return false;
    }

    @TargetApi(21)
    /* renamed from: d */
    public final boolean mo11850d(int i) {
        String sb;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f17219f;
        if (codecCapabilities == null) {
            sb = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                sb = "sampleRate.aCaps";
            } else if (audioCapabilities.isSampleRateSupported(i)) {
                return true;
            } else {
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("sampleRate.support, ");
                sb2.append(i);
                sb = sb2.toString();
            }
        }
        m19521h(sb);
        return false;
    }

    /* renamed from: e */
    public final boolean mo11851e(String str) {
        StringBuilder sb;
        String str2;
        if (str == null || this.f17218e == null) {
            return true;
        }
        String trim = str.trim();
        String str3 = (trim.startsWith("avc1") || trim.startsWith("avc3")) ? "video/avc" : (trim.startsWith("hev1") || trim.startsWith("hvc1")) ? "video/hevc" : trim.startsWith("vp9") ? "video/x-vnd.on2.vp9" : trim.startsWith("vp8") ? "video/x-vnd.on2.vp8" : trim.startsWith("mp4a") ? "audio/mp4a-latm" : (trim.startsWith("ac-3") || trim.startsWith("dac3")) ? "audio/ac3" : (trim.startsWith("ec-3") || trim.startsWith("dec3")) ? "audio/eac3" : (trim.startsWith("dtsc") || trim.startsWith("dtse")) ? "audio/vnd.dts" : (trim.startsWith("dtsh") || trim.startsWith("dtsl")) ? "audio/vnd.dts.hd" : trim.startsWith("opus") ? "audio/opus" : trim.startsWith("vorbis") ? "audio/vorbis" : null;
        if (str3 == null) {
            return true;
        }
        if (!this.f17218e.equals(str3)) {
            sb = new StringBuilder(str.length() + 13 + str3.length());
            str2 = "codec.mime ";
        } else {
            Pair<Integer, Integer> b = C1853jj.m11670b(str);
            if (b == null) {
                return true;
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mo11853g()) {
                if (codecProfileLevel.profile == ((Integer) b.first).intValue() && codecProfileLevel.level >= ((Integer) b.second).intValue()) {
                    return true;
                }
            }
            sb = new StringBuilder(str.length() + 22 + str3.length());
            str2 = "codec.profileLevel, ";
        }
        sb.append(str2);
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        m19521h(sb.toString());
        return false;
    }

    @TargetApi(21)
    /* renamed from: f */
    public final boolean mo11852f(int i, int i2, double d) {
        String sb;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f17219f;
        if (codecCapabilities == null) {
            sb = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                sb = "sizeAndRate.vCaps";
            } else if (m19522i(videoCapabilities, i, i2, d)) {
                return true;
            } else {
                if (i >= i2 || !m19522i(videoCapabilities, i2, i, d)) {
                    StringBuilder sb2 = new StringBuilder(69);
                    sb2.append("sizeAndRate.support, ");
                    sb2.append(i);
                    sb2.append("x");
                    sb2.append(i2);
                    sb2.append("x");
                    sb2.append(d);
                    sb = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder(69);
                    sb3.append("sizeAndRate.rotated, ");
                    sb3.append(i);
                    sb3.append("x");
                    sb3.append(i2);
                    sb3.append("x");
                    sb3.append(d);
                    String sb4 = sb3.toString();
                    String str = this.f17214a;
                    String str2 = this.f17218e;
                    String str3 = C2449zm.f18291e;
                    int length = String.valueOf(str).length();
                    int length2 = String.valueOf(str2).length();
                    StringBuilder sb5 = new StringBuilder(sb4.length() + 25 + length + length2 + String.valueOf(str3).length());
                    sb5.append("AssumedSupport [");
                    sb5.append(sb4);
                    sb5.append("] [");
                    sb5.append(str);
                    sb5.append(", ");
                    sb5.append(str2);
                    sb5.append("] [");
                    sb5.append(str3);
                    sb5.append("]");
                    Log.d("MediaCodecInfo", sb5.toString());
                    return true;
                }
            }
        }
        m19521h(sb);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.media.MediaCodecInfo.CodecProfileLevel[] mo11853g() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.f17219f
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2371xi.mo11853g():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }
}
