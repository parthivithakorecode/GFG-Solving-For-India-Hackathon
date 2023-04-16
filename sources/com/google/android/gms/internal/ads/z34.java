package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import java.util.Objects;

public final class z34 {

    /* renamed from: a */
    public final String f18012a;

    /* renamed from: b */
    public final String f18013b;

    /* renamed from: c */
    public final String f18014c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f18015d;

    /* renamed from: e */
    public final boolean f18016e;

    /* renamed from: f */
    public final boolean f18017f;

    /* renamed from: g */
    private final boolean f18018g;

    z34(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Objects.requireNonNull(str);
        this.f18012a = str;
        this.f18013b = str2;
        this.f18014c = str3;
        this.f18015d = codecCapabilities;
        this.f18016e = z4;
        this.f18017f = z6;
        this.f18018g = C1645dy.m8171h(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if ("Nexus 10".equals(r3) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.z34 m20410c(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.gms.internal.ads.z34 r11 = new com.google.android.gms.internal.ads.z34
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L_0x003f
            int r3 = com.google.android.gms.internal.ads.n13.f11236a
            r5 = 19
            if (r3 < r5) goto L_0x003f
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x003f
            r5 = 22
            if (r3 > r5) goto L_0x003d
            java.lang.String r3 = com.google.android.gms.internal.ads.n13.f11239d
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x003d
        L_0x002c:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L_0x003f
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r8 = r0
            goto L_0x0040
        L_0x003f:
            r8 = r2
        L_0x0040:
            r3 = 21
            if (r4 == 0) goto L_0x0052
            int r5 = com.google.android.gms.internal.ads.n13.f11236a
            if (r5 < r3) goto L_0x0052
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x0052
            r9 = r0
            goto L_0x0053
        L_0x0052:
            r9 = r2
        L_0x0053:
            if (r20 != 0) goto L_0x0066
            if (r4 == 0) goto L_0x0064
            int r5 = com.google.android.gms.internal.ads.n13.f11236a
            if (r5 < r3) goto L_0x0064
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r10 = r2
            goto L_0x0067
        L_0x0066:
            r10 = r0
        L_0x0067:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z34.m20410c(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.z34");
    }

    /* renamed from: h */
    private static Point m20411h(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(n13.m13606K(i, widthAlignment) * widthAlignment, n13.m13606K(i2, heightAlignment) * heightAlignment);
    }

    /* renamed from: i */
    private final void m20412i(String str) {
        String str2 = this.f18012a;
        String str3 = this.f18013b;
        String str4 = n13.f11240e;
        int length = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(str.length() + 20 + length + str3.length() + String.valueOf(str4).length());
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

    /* renamed from: j */
    private static boolean m20413j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point h = m20411h(videoCapabilities, i, i2);
        int i3 = h.x;
        int i4 = h.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* renamed from: a */
    public final Point mo12137a(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f18015d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m20411h(videoCapabilities, i, i2);
    }

    /* renamed from: b */
    public final de3 mo12138b(C1574c0 c0Var, C1574c0 c0Var2) {
        int i = true != n13.m13643p(c0Var.f5234l, c0Var2.f5234l) ? 8 : 0;
        if (this.f18018g) {
            if (c0Var.f5242t != c0Var2.f5242t) {
                i |= 1024;
            }
            if (!this.f18016e && !(c0Var.f5239q == c0Var2.f5239q && c0Var.f5240r == c0Var2.f5240r)) {
                i |= 512;
            }
            if (!n13.m13643p(c0Var.f5246x, c0Var2.f5246x)) {
                i |= 2048;
            }
            String str = this.f18012a;
            if (n13.f11239d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !c0Var.mo6006d(c0Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new de3(this.f18012a, c0Var, c0Var2, true != c0Var.mo6006d(c0Var2) ? 2 : 3, 0);
            }
        } else {
            if (c0Var.f5247y != c0Var2.f5247y) {
                i |= 4096;
            }
            if (c0Var.f5248z != c0Var2.f5248z) {
                i |= 8192;
            }
            if (c0Var.f5217A != c0Var2.f5217A) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f18013b)) {
                Pair<Integer, Integer> b = q44.m15467b(c0Var);
                Pair<Integer, Integer> b2 = q44.m15467b(c0Var2);
                if (!(b == null || b2 == null)) {
                    int intValue = ((Integer) b.first).intValue();
                    int intValue2 = ((Integer) b2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new de3(this.f18012a, c0Var, c0Var2, 3, 0);
                    }
                }
            }
            if (!c0Var.mo6006d(c0Var2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.f18013b)) {
                i |= 2;
            }
            if (i == 0) {
                return new de3(this.f18012a, c0Var, c0Var2, 1, 0);
            }
        }
        return new de3(this.f18012a, c0Var, c0Var2, 0, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0081, code lost:
        r7 = r7.getVideoCapabilities();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12139d(com.google.android.gms.internal.ads.C1574c0 r13) {
        /*
            r12 = this;
            java.lang.String r0 = r13.f5231i
            r1 = 16
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x011e
            java.lang.String r0 = com.google.android.gms.internal.ads.C1645dy.m8166c(r0)
            if (r0 != 0) goto L_0x0010
            goto L_0x011e
        L_0x0010:
            java.lang.String r4 = r12.f18013b
            boolean r4 = r4.equals(r0)
            java.lang.String r5 = ", "
            if (r4 != 0) goto L_0x0047
            java.lang.String r13 = r13.f5231i
            java.lang.String r1 = java.lang.String.valueOf(r13)
            int r1 = r1.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 13
            int r4 = r0.length()
            int r1 = r1 + r4
            r3.<init>(r1)
            java.lang.String r1 = "codec.mime "
        L_0x0032:
            r3.append(r1)
            r3.append(r13)
            r3.append(r5)
            r3.append(r0)
            java.lang.String r13 = r3.toString()
            r12.m20412i(r13)
            goto L_0x011d
        L_0x0047:
            android.util.Pair r4 = com.google.android.gms.internal.ads.q44.m15467b(r13)
            if (r4 == 0) goto L_0x011e
            java.lang.Object r6 = r4.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            boolean r7 = r12.f18018g
            r8 = 42
            if (r7 != 0) goto L_0x0066
            if (r6 != r8) goto L_0x011e
            r6 = r8
        L_0x0066:
            android.media.MediaCodecInfo$CodecProfileLevel[] r7 = r12.mo12142g()
            int r8 = com.google.android.gms.internal.ads.n13.f11236a
            r9 = 23
            if (r8 > r9) goto L_0x00f2
            java.lang.String r8 = r12.f18013b
            java.lang.String r9 = "video/x-vnd.on2.vp9"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x00f2
            int r8 = r7.length
            if (r8 != 0) goto L_0x00f2
            android.media.MediaCodecInfo$CodecCapabilities r7 = r12.f18015d
            if (r7 == 0) goto L_0x0096
            android.media.MediaCodecInfo$VideoCapabilities r7 = r7.getVideoCapabilities()
            if (r7 == 0) goto L_0x0096
            android.util.Range r7 = r7.getBitrateRange()
            java.lang.Comparable r7 = r7.getUpper()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            goto L_0x0097
        L_0x0096:
            r7 = r2
        L_0x0097:
            r8 = 180000000(0xaba9500, float:1.7967196E-32)
            if (r7 < r8) goto L_0x009f
            r7 = 1024(0x400, float:1.435E-42)
            goto L_0x00e5
        L_0x009f:
            r8 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r7 < r8) goto L_0x00a7
            r7 = 512(0x200, float:7.175E-43)
            goto L_0x00e5
        L_0x00a7:
            r8 = 60000000(0x3938700, float:8.670878E-37)
            if (r7 < r8) goto L_0x00af
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x00e5
        L_0x00af:
            r8 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r7 < r8) goto L_0x00b7
            r7 = 128(0x80, float:1.794E-43)
            goto L_0x00e5
        L_0x00b7:
            r8 = 18000000(0x112a880, float:2.6936858E-38)
            if (r7 < r8) goto L_0x00bf
            r7 = 64
            goto L_0x00e5
        L_0x00bf:
            r8 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r7 < r8) goto L_0x00c7
            r7 = 32
            goto L_0x00e5
        L_0x00c7:
            r8 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r7 < r8) goto L_0x00ce
            r7 = r1
            goto L_0x00e5
        L_0x00ce:
            r8 = 3600000(0x36ee80, float:5.044674E-39)
            if (r7 < r8) goto L_0x00d6
            r7 = 8
            goto L_0x00e5
        L_0x00d6:
            r8 = 1800000(0x1b7740, float:2.522337E-39)
            if (r7 < r8) goto L_0x00dd
            r7 = 4
            goto L_0x00e5
        L_0x00dd:
            r8 = 800000(0xc3500, float:1.121039E-39)
            if (r7 < r8) goto L_0x00e4
            r7 = 2
            goto L_0x00e5
        L_0x00e4:
            r7 = r3
        L_0x00e5:
            android.media.MediaCodecInfo$CodecProfileLevel r8 = new android.media.MediaCodecInfo$CodecProfileLevel
            r8.<init>()
            r8.profile = r3
            r8.level = r7
            android.media.MediaCodecInfo$CodecProfileLevel[] r7 = new android.media.MediaCodecInfo.CodecProfileLevel[r3]
            r7[r2] = r8
        L_0x00f2:
            int r8 = r7.length
            r9 = r2
        L_0x00f4:
            if (r9 >= r8) goto L_0x0103
            r10 = r7[r9]
            int r11 = r10.profile
            if (r11 != r6) goto L_0x0100
            int r10 = r10.level
            if (r10 >= r4) goto L_0x011e
        L_0x0100:
            int r9 = r9 + 1
            goto L_0x00f4
        L_0x0103:
            java.lang.String r13 = r13.f5231i
            java.lang.String r1 = java.lang.String.valueOf(r13)
            int r1 = r1.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 22
            int r4 = r0.length()
            int r1 = r1 + r4
            r3.<init>(r1)
            java.lang.String r1 = "codec.profileLevel, "
            goto L_0x0032
        L_0x011d:
            return r2
        L_0x011e:
            boolean r0 = r12.f18018g
            r4 = 21
            if (r0 == 0) goto L_0x0167
            int r0 = r13.f5239q
            if (r0 <= 0) goto L_0x0166
            int r1 = r13.f5240r
            if (r1 > 0) goto L_0x012d
            goto L_0x0166
        L_0x012d:
            int r5 = com.google.android.gms.internal.ads.n13.f11236a
            if (r5 < r4) goto L_0x0139
            float r13 = r13.f5241s
            double r2 = (double) r13
            boolean r13 = r12.mo12141f(r0, r1, r2)
            return r13
        L_0x0139:
            int r0 = r0 * r1
            int r1 = com.google.android.gms.internal.ads.q44.m15466a()
            if (r0 > r1) goto L_0x0141
            r2 = r3
        L_0x0141:
            if (r2 != 0) goto L_0x0165
            int r0 = r13.f5239q
            int r13 = r13.f5240r
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 40
            r1.<init>(r3)
            java.lang.String r3 = "legacyFrameSize, "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = "x"
            r1.append(r0)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r12.m20412i(r13)
        L_0x0165:
            return r2
        L_0x0166:
            return r3
        L_0x0167:
            int r0 = com.google.android.gms.internal.ads.n13.f11236a
            if (r0 < r4) goto L_0x0284
            int r4 = r13.f5248z
            r5 = -1
            if (r4 == r5) goto L_0x019e
            android.media.MediaCodecInfo$CodecCapabilities r6 = r12.f18015d
            if (r6 != 0) goto L_0x017b
            java.lang.String r13 = "sampleRate.caps"
        L_0x0176:
            r12.m20412i(r13)
            goto L_0x0285
        L_0x017b:
            android.media.MediaCodecInfo$AudioCapabilities r6 = r6.getAudioCapabilities()
            if (r6 != 0) goto L_0x0184
            java.lang.String r13 = "sampleRate.aCaps"
            goto L_0x0176
        L_0x0184:
            boolean r6 = r6.isSampleRateSupported(r4)
            if (r6 != 0) goto L_0x019e
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r0 = 31
            r13.<init>(r0)
            java.lang.String r0 = "sampleRate.support, "
            r13.append(r0)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            goto L_0x0176
        L_0x019e:
            int r13 = r13.f5247y
            if (r13 == r5) goto L_0x0284
            android.media.MediaCodecInfo$CodecCapabilities r4 = r12.f18015d
            if (r4 != 0) goto L_0x01ad
            java.lang.String r13 = "channelCount.caps"
        L_0x01a8:
            r12.m20412i(r13)
            goto L_0x0283
        L_0x01ad:
            android.media.MediaCodecInfo$AudioCapabilities r4 = r4.getAudioCapabilities()
            if (r4 != 0) goto L_0x01b6
            java.lang.String r13 = "channelCount.aCaps"
            goto L_0x01a8
        L_0x01b6:
            java.lang.String r5 = r12.f18012a
            java.lang.String r6 = r12.f18013b
            int r4 = r4.getMaxInputChannelCount()
            if (r4 > r3) goto L_0x026c
            r7 = 26
            if (r0 < r7) goto L_0x01c8
            if (r4 <= 0) goto L_0x01c8
            goto L_0x026c
        L_0x01c8:
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x026c
            java.lang.String r0 = "audio/3gpp"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x026c
            java.lang.String r0 = "audio/amr-wb"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x026c
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x026c
            java.lang.String r0 = "audio/vorbis"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x026c
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x026c
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x026c
            java.lang.String r0 = "audio/flac"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x026c
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x026c
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x026c
            java.lang.String r0 = "audio/gsm"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0221
            goto L_0x026c
        L_0x0221:
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x022b
            r1 = 6
            goto L_0x0236
        L_0x022b:
            java.lang.String r0 = "audio/eac3"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0234
            goto L_0x0236
        L_0x0234:
            r1 = 30
        L_0x0236:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            int r0 = r0.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r0 = r0 + 59
            r6.<init>(r0)
            java.lang.String r0 = "AssumedMaxChannelAdjustment: "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = ", ["
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = " to "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = "]"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r4 = "MediaCodecInfo"
            android.util.Log.w(r4, r0)
            r4 = r1
        L_0x026c:
            if (r4 >= r13) goto L_0x0284
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 33
            r0.<init>(r1)
            java.lang.String r1 = "channelCount.support, "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            goto L_0x01a8
        L_0x0283:
            return r2
        L_0x0284:
            r2 = r3
        L_0x0285:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z34.mo12139d(com.google.android.gms.internal.ads.c0):boolean");
    }

    /* renamed from: e */
    public final boolean mo12140e(C1574c0 c0Var) {
        if (this.f18018g) {
            return this.f18016e;
        }
        Pair<Integer, Integer> b = q44.m15467b(c0Var);
        return b != null && ((Integer) b.first).intValue() == 42;
    }

    /* renamed from: f */
    public final boolean mo12141f(int i, int i2, double d) {
        String sb;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f18015d;
        if (codecCapabilities == null) {
            sb = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                sb = "sizeAndRate.vCaps";
            } else if (m20413j(videoCapabilities, i, i2, d)) {
                return true;
            } else {
                if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f18012a) && "mcv5a".equals(n13.f11237b)) || !m20413j(videoCapabilities, i2, i, d))) {
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
                    String str = this.f18012a;
                    String str2 = this.f18013b;
                    String str3 = n13.f11240e;
                    int length = String.valueOf(str).length();
                    StringBuilder sb5 = new StringBuilder(sb4.length() + 25 + length + str2.length() + String.valueOf(str3).length());
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
        m20412i(sb);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.media.MediaCodecInfo.CodecProfileLevel[] mo12142g() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.f18015d
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z34.mo12142g():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    public final String toString() {
        return this.f18012a;
    }
}
