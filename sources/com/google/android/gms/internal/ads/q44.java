package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
public final class q44 {

    /* renamed from: a */
    private static final Pattern f13055a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    private static final HashMap<i44, List<z34>> f13056b = new HashMap<>();

    /* renamed from: c */
    private static int f13057c = -1;

    /* renamed from: d */
    public static final /* synthetic */ int f13058d = 0;

    /* renamed from: a */
    public static int m15466a() {
        int i;
        if (f13057c == -1) {
            int i2 = 0;
            z34 c = m15468c("video/avc", false, false);
            if (c != null) {
                MediaCodecInfo.CodecProfileLevel[] g = c.mo12142g();
                int length = g.length;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = g[i2].level;
                    if (i4 != 1 && i4 != 2) {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i = 35651584;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    i3 = Math.max(i, i3);
                    i2++;
                }
                i2 = Math.max(i3, n13.f11236a >= 21 ? 345600 : 172800);
            }
            f13057c = i2;
        }
        return f13057c;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x05f8, code lost:
        r2 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x016a, code lost:
        r1 = java.lang.Integer.valueOf(r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x06e2  */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x06f5  */
    /* JADX WARNING: Removed duplicated region for block: B:490:0x07a1  */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x07b3  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m15467b(com.google.android.gms.internal.ads.C1574c0 r17) {
        /*
            r0 = r17
            java.lang.String r1 = r0.f5231i
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            java.lang.String r3 = "\\."
            java.lang.String[] r1 = r1.split(r3)
            java.lang.String r3 = r0.f5234l
            java.lang.String r4 = "video/dolby-vision"
            boolean r3 = r4.equals(r3)
            r7 = 512(0x200, float:7.175E-43)
            r8 = 256(0x100, float:3.59E-43)
            r9 = 128(0x80, float:1.794E-43)
            r11 = 64
            r13 = 4096(0x1000, float:5.74E-42)
            r14 = 32
            r15 = 16
            r5 = 8
            r2 = 3
            r10 = 4
            r12 = 2
            java.lang.String r4 = "MediaCodecUtil"
            r6 = 1
            if (r3 == 0) goto L_0x0211
            java.lang.String r0 = r0.f5231i
            int r3 = r1.length
            if (r3 >= r2) goto L_0x004f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed Dolby Vision codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0044
        L_0x003f:
            java.lang.String r0 = r1.concat(r0)
            goto L_0x0049
        L_0x0044:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x0049:
            android.util.Log.w(r4, r0)
            r2 = 0
            goto L_0x0210
        L_0x004f:
            java.util.regex.Pattern r3 = f13055a
            r2 = r1[r6]
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 != 0) goto L_0x0070
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed Dolby Vision codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x006a
            goto L_0x003f
        L_0x006a:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x0049
        L_0x0070:
            java.lang.String r0 = r2.group(r6)
            if (r0 != 0) goto L_0x0079
        L_0x0076:
            r2 = 0
            goto L_0x011e
        L_0x0079:
            int r2 = r0.hashCode()
            switch(r2) {
                case 1536: goto L_0x00de;
                case 1537: goto L_0x00d4;
                case 1538: goto L_0x00ca;
                case 1539: goto L_0x00c0;
                case 1540: goto L_0x00b6;
                case 1541: goto L_0x00ac;
                case 1542: goto L_0x00a2;
                case 1543: goto L_0x0098;
                case 1544: goto L_0x008e;
                case 1545: goto L_0x0082;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x00e8
        L_0x0082:
            java.lang.String r2 = "09"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00e8
            r2 = 9
            goto L_0x00e9
        L_0x008e:
            java.lang.String r2 = "08"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00e8
            r2 = r5
            goto L_0x00e9
        L_0x0098:
            java.lang.String r2 = "07"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00e8
            r2 = 7
            goto L_0x00e9
        L_0x00a2:
            java.lang.String r2 = "06"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00e8
            r2 = 6
            goto L_0x00e9
        L_0x00ac:
            java.lang.String r2 = "05"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00e8
            r2 = 5
            goto L_0x00e9
        L_0x00b6:
            java.lang.String r2 = "04"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00e8
            r2 = r10
            goto L_0x00e9
        L_0x00c0:
            java.lang.String r2 = "03"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00e8
            r2 = 3
            goto L_0x00e9
        L_0x00ca:
            java.lang.String r2 = "02"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00e8
            r2 = r12
            goto L_0x00e9
        L_0x00d4:
            java.lang.String r2 = "01"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00e8
            r2 = r6
            goto L_0x00e9
        L_0x00de:
            java.lang.String r2 = "00"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00e8
            r2 = 0
            goto L_0x00e9
        L_0x00e8:
            r2 = -1
        L_0x00e9:
            switch(r2) {
                case 0: goto L_0x011a;
                case 1: goto L_0x0115;
                case 2: goto L_0x0110;
                case 3: goto L_0x010b;
                case 4: goto L_0x0106;
                case 5: goto L_0x0101;
                case 6: goto L_0x00fc;
                case 7: goto L_0x00f7;
                case 8: goto L_0x00f2;
                case 9: goto L_0x00ed;
                default: goto L_0x00ec;
            }
        L_0x00ec:
            goto L_0x0076
        L_0x00ed:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x011e
        L_0x00f2:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L_0x011e
        L_0x00f7:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            goto L_0x011e
        L_0x00fc:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            goto L_0x011e
        L_0x0101:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            goto L_0x011e
        L_0x0106:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            goto L_0x011e
        L_0x010b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            goto L_0x011e
        L_0x0110:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            goto L_0x011e
        L_0x0115:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            goto L_0x011e
        L_0x011a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
        L_0x011e:
            if (r2 != 0) goto L_0x0135
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unknown Dolby Vision profile string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x012e
            goto L_0x003f
        L_0x012e:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x0049
        L_0x0135:
            r0 = r1[r12]
            if (r0 != 0) goto L_0x013c
        L_0x0139:
            r1 = 0
            goto L_0x01f3
        L_0x013c:
            int r1 = r0.hashCode()
            switch(r1) {
                case 1537: goto L_0x01e7;
                case 1538: goto L_0x01da;
                case 1539: goto L_0x01cd;
                case 1540: goto L_0x01c0;
                case 1541: goto L_0x01b3;
                case 1542: goto L_0x01a6;
                case 1543: goto L_0x0199;
                case 1544: goto L_0x018c;
                case 1545: goto L_0x017e;
                default: goto L_0x0143;
            }
        L_0x0143:
            switch(r1) {
                case 1567: goto L_0x0170;
                case 1568: goto L_0x0160;
                case 1569: goto L_0x0155;
                case 1570: goto L_0x0147;
                default: goto L_0x0146;
            }
        L_0x0146:
            goto L_0x0139
        L_0x0147:
            java.lang.String r1 = "13"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0139
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            goto L_0x01f3
        L_0x0155:
            java.lang.String r1 = "12"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0139
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x016a
        L_0x0160:
            java.lang.String r1 = "11"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0139
            r1 = 1024(0x400, float:1.435E-42)
        L_0x016a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x01f3
        L_0x0170:
            java.lang.String r1 = "10"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0139
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            goto L_0x01f3
        L_0x017e:
            java.lang.String r1 = "09"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0139
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            goto L_0x01f3
        L_0x018c:
            java.lang.String r1 = "08"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0139
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            goto L_0x01f3
        L_0x0199:
            java.lang.String r1 = "07"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0139
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            goto L_0x01f3
        L_0x01a6:
            java.lang.String r1 = "06"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0139
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            goto L_0x01f3
        L_0x01b3:
            java.lang.String r1 = "05"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0139
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            goto L_0x01f3
        L_0x01c0:
            java.lang.String r1 = "04"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0139
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            goto L_0x01f3
        L_0x01cd:
            java.lang.String r1 = "03"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0139
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            goto L_0x01f3
        L_0x01da:
            java.lang.String r1 = "02"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0139
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            goto L_0x01f3
        L_0x01e7:
            java.lang.String r1 = "01"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0139
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
        L_0x01f3:
            if (r1 != 0) goto L_0x020a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unknown Dolby Vision level string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0203
            goto L_0x003f
        L_0x0203:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x0049
        L_0x020a:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            r2 = r0
        L_0x0210:
            return r2
        L_0x0211:
            r2 = 0
            r3 = r1[r2]
            int r2 = r3.hashCode()
            switch(r2) {
                case 3004662: goto L_0x0258;
                case 3006243: goto L_0x024e;
                case 3006244: goto L_0x0244;
                case 3199032: goto L_0x023a;
                case 3214780: goto L_0x0230;
                case 3356560: goto L_0x0226;
                case 3624515: goto L_0x021c;
                default: goto L_0x021b;
            }
        L_0x021b:
            goto L_0x0262
        L_0x021c:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0262
            r2 = r12
            goto L_0x0263
        L_0x0226:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0262
            r2 = 6
            goto L_0x0263
        L_0x0230:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0262
            r2 = r10
            goto L_0x0263
        L_0x023a:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0262
            r2 = 3
            goto L_0x0263
        L_0x0244:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0262
            r2 = r6
            goto L_0x0263
        L_0x024e:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0262
            r2 = 0
            goto L_0x0263
        L_0x0258:
            java.lang.String r2 = "av01"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0262
            r2 = 5
            goto L_0x0263
        L_0x0262:
            r2 = -1
        L_0x0263:
            r3 = 30
            r11 = 20
            switch(r2) {
                case 0: goto L_0x0719;
                case 1: goto L_0x0719;
                case 2: goto L_0x063e;
                case 3: goto L_0x03ff;
                case 4: goto L_0x03ff;
                case 5: goto L_0x030b;
                case 6: goto L_0x026c;
                default: goto L_0x026a;
            }
        L_0x026a:
            r0 = 0
            return r0
        L_0x026c:
            java.lang.String r0 = r0.f5231i
            int r2 = r1.length
            r3 = 3
            if (r2 == r3) goto L_0x028e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed MP4A codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0283
        L_0x027e:
            java.lang.String r0 = r1.concat(r0)
            goto L_0x0288
        L_0x0283:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x0288:
            android.util.Log.w(r4, r0)
        L_0x028b:
            r2 = 0
            goto L_0x030a
        L_0x028e:
            java.lang.String r2 = "audio/mp4a-latm"
            r3 = r1[r6]     // Catch:{ NumberFormatException -> 0x02f5 }
            int r3 = java.lang.Integer.parseInt(r3, r15)     // Catch:{ NumberFormatException -> 0x02f5 }
            java.lang.String r3 = com.google.android.gms.internal.ads.C1645dy.m8167d(r3)     // Catch:{ NumberFormatException -> 0x02f5 }
            boolean r2 = r2.equals(r3)     // Catch:{ NumberFormatException -> 0x02f5 }
            if (r2 == 0) goto L_0x028b
            r1 = r1[r12]     // Catch:{ NumberFormatException -> 0x02f5 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x02f5 }
            r2 = 17
            if (r1 == r2) goto L_0x02e0
            if (r1 == r11) goto L_0x02de
            r2 = 23
            if (r1 == r2) goto L_0x02db
            r2 = 29
            if (r1 == r2) goto L_0x02d8
            r2 = 39
            if (r1 == r2) goto L_0x02d5
            r2 = 42
            if (r1 == r2) goto L_0x02d2
            switch(r1) {
                case 1: goto L_0x02cf;
                case 2: goto L_0x02cd;
                case 3: goto L_0x02ca;
                case 4: goto L_0x02c8;
                case 5: goto L_0x02c5;
                case 6: goto L_0x02c2;
                default: goto L_0x02bf;
            }     // Catch:{ NumberFormatException -> 0x02f5 }
        L_0x02bf:
            r1 = -1
            r5 = -1
            goto L_0x02e3
        L_0x02c2:
            r1 = -1
            r5 = 6
            goto L_0x02e3
        L_0x02c5:
            r1 = -1
            r5 = 5
            goto L_0x02e3
        L_0x02c8:
            r5 = r10
            goto L_0x02d0
        L_0x02ca:
            r1 = -1
            r5 = 3
            goto L_0x02e3
        L_0x02cd:
            r5 = r12
            goto L_0x02d0
        L_0x02cf:
            r5 = r6
        L_0x02d0:
            r1 = -1
            goto L_0x02e3
        L_0x02d2:
            r5 = 42
            goto L_0x02d0
        L_0x02d5:
            r5 = 39
            goto L_0x02d0
        L_0x02d8:
            r5 = 29
            goto L_0x02d0
        L_0x02db:
            r5 = 23
            goto L_0x02d0
        L_0x02de:
            r5 = r11
            goto L_0x02d0
        L_0x02e0:
            r5 = 17
            goto L_0x02d0
        L_0x02e3:
            if (r5 == r1) goto L_0x028b
            android.util.Pair r1 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x02f5 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ NumberFormatException -> 0x02f5 }
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x02f5 }
            r1.<init>(r2, r3)     // Catch:{ NumberFormatException -> 0x02f5 }
            r2 = r1
            goto L_0x030a
        L_0x02f5:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed MP4A codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0303
            goto L_0x027e
        L_0x0303:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x0288
        L_0x030a:
            return r2
        L_0x030b:
            java.lang.String r2 = r0.f5231i
            com.google.android.gms.internal.ads.p14 r0 = r0.f5246x
            int r11 = r1.length
            if (r11 >= r10) goto L_0x032e
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Ignoring malformed AV1 codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0323
        L_0x031e:
            java.lang.String r0 = r1.concat(r0)
            goto L_0x0328
        L_0x0323:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x0328:
            android.util.Log.w(r4, r0)
            r2 = 0
            goto L_0x03fe
        L_0x032e:
            r11 = r1[r6]     // Catch:{ NumberFormatException -> 0x03e9 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x03e9 }
            r15 = r1[r12]     // Catch:{ NumberFormatException -> 0x03e9 }
            r8 = 0
            java.lang.String r8 = r15.substring(r8, r12)     // Catch:{ NumberFormatException -> 0x03e9 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x03e9 }
            r15 = 3
            r1 = r1[r15]     // Catch:{ NumberFormatException -> 0x03e9 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x03e9 }
            if (r11 == 0) goto L_0x035a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            java.lang.String r1 = "Unknown AV1 profile: "
            r0.append(r1)
            r0.append(r11)
        L_0x0355:
            java.lang.String r0 = r0.toString()
            goto L_0x0328
        L_0x035a:
            if (r1 == r5) goto L_0x0382
            r2 = 10
            if (r1 == r2) goto L_0x0370
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = 34
            r0.<init>(r2)
            java.lang.String r2 = "Unknown AV1 bit depth: "
            r0.append(r2)
            r0.append(r1)
            goto L_0x0355
        L_0x0370:
            if (r0 == 0) goto L_0x0380
            byte[] r1 = r0.f12426d
            if (r1 != 0) goto L_0x037e
            int r0 = r0.f12425c
            r1 = 7
            if (r0 == r1) goto L_0x037e
            r1 = 6
            if (r0 != r1) goto L_0x0380
        L_0x037e:
            r0 = r13
            goto L_0x0383
        L_0x0380:
            r0 = r12
            goto L_0x0383
        L_0x0382:
            r0 = r6
        L_0x0383:
            switch(r8) {
                case 0: goto L_0x03c8;
                case 1: goto L_0x03c6;
                case 2: goto L_0x03c4;
                case 3: goto L_0x03c2;
                case 4: goto L_0x03bf;
                case 5: goto L_0x03bd;
                case 6: goto L_0x03ba;
                case 7: goto L_0x03b8;
                case 8: goto L_0x03b5;
                case 9: goto L_0x03b3;
                case 10: goto L_0x03b0;
                case 11: goto L_0x03ad;
                case 12: goto L_0x03ab;
                case 13: goto L_0x03a8;
                case 14: goto L_0x03a5;
                case 15: goto L_0x03a1;
                case 16: goto L_0x039e;
                case 17: goto L_0x039b;
                case 18: goto L_0x0398;
                case 19: goto L_0x0395;
                case 20: goto L_0x0392;
                case 21: goto L_0x038f;
                case 22: goto L_0x038c;
                case 23: goto L_0x0389;
                default: goto L_0x0386;
            }
        L_0x0386:
            r1 = -1
            goto L_0x03c9
        L_0x0389:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x03c9
        L_0x038c:
            r1 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x03c9
        L_0x038f:
            r1 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x03c9
        L_0x0392:
            r1 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x03c9
        L_0x0395:
            r1 = 524288(0x80000, float:7.34684E-40)
            goto L_0x03c9
        L_0x0398:
            r1 = 262144(0x40000, float:3.67342E-40)
            goto L_0x03c9
        L_0x039b:
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L_0x03c9
        L_0x039e:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x03c9
        L_0x03a1:
            r1 = 32768(0x8000, float:4.5918E-41)
            goto L_0x03c9
        L_0x03a5:
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x03c9
        L_0x03a8:
            r1 = 8192(0x2000, float:1.14794E-41)
            goto L_0x03c9
        L_0x03ab:
            r1 = r13
            goto L_0x03c9
        L_0x03ad:
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x03c9
        L_0x03b0:
            r1 = 1024(0x400, float:1.435E-42)
            goto L_0x03c9
        L_0x03b3:
            r1 = r7
            goto L_0x03c9
        L_0x03b5:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x03c9
        L_0x03b8:
            r1 = r9
            goto L_0x03c9
        L_0x03ba:
            r1 = 64
            goto L_0x03c9
        L_0x03bd:
            r1 = r14
            goto L_0x03c9
        L_0x03bf:
            r1 = 16
            goto L_0x03c9
        L_0x03c2:
            r1 = r5
            goto L_0x03c9
        L_0x03c4:
            r1 = r10
            goto L_0x03c9
        L_0x03c6:
            r1 = r12
            goto L_0x03c9
        L_0x03c8:
            r1 = r6
        L_0x03c9:
            r2 = -1
            if (r1 != r2) goto L_0x03db
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.String r1 = "Unknown AV1 level: "
            r0.append(r1)
            r0.append(r8)
            goto L_0x0355
        L_0x03db:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.<init>(r0, r1)
            goto L_0x03fe
        L_0x03e9:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Ignoring malformed AV1 codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x03f7
            goto L_0x031e
        L_0x03f7:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x0328
        L_0x03fe:
            return r2
        L_0x03ff:
            java.lang.String r0 = r0.f5231i
            int r2 = r1.length
            if (r2 >= r10) goto L_0x0420
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed HEVC codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0415
        L_0x0410:
            java.lang.String r0 = r1.concat(r0)
            goto L_0x041a
        L_0x0415:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x041a:
            android.util.Log.w(r4, r0)
            r2 = 0
            goto L_0x063d
        L_0x0420:
            java.util.regex.Pattern r2 = f13055a
            r3 = r1[r6]
            java.util.regex.Matcher r2 = r2.matcher(r3)
            boolean r3 = r2.matches()
            if (r3 != 0) goto L_0x0441
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed HEVC codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x043b
            goto L_0x0410
        L_0x043b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x041a
        L_0x0441:
            java.lang.String r0 = r2.group(r6)
            java.lang.String r2 = "1"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0450
            r0 = r6
        L_0x044e:
            r2 = 3
            goto L_0x045a
        L_0x0450:
            java.lang.String r2 = "2"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0628
            r0 = r12
            goto L_0x044e
        L_0x045a:
            r1 = r1[r2]
            if (r1 != 0) goto L_0x0461
        L_0x045e:
            r2 = 0
            goto L_0x0606
        L_0x0461:
            int r2 = r1.hashCode()
            switch(r2) {
                case 70821: goto L_0x0584;
                case 70914: goto L_0x0579;
                case 70917: goto L_0x056e;
                case 71007: goto L_0x0563;
                case 71010: goto L_0x0558;
                case 74665: goto L_0x054e;
                case 74758: goto L_0x0544;
                case 74761: goto L_0x053a;
                case 74851: goto L_0x0530;
                case 74854: goto L_0x0525;
                case 2193639: goto L_0x0519;
                case 2193642: goto L_0x050d;
                case 2193732: goto L_0x0502;
                case 2193735: goto L_0x04f6;
                case 2193738: goto L_0x04ea;
                case 2193825: goto L_0x04de;
                case 2193828: goto L_0x04d2;
                case 2193831: goto L_0x04c6;
                case 2312803: goto L_0x04bb;
                case 2312806: goto L_0x04b0;
                case 2312896: goto L_0x04a5;
                case 2312899: goto L_0x049a;
                case 2312902: goto L_0x048e;
                case 2312989: goto L_0x0482;
                case 2312992: goto L_0x0476;
                case 2312995: goto L_0x046a;
                default: goto L_0x0468;
            }
        L_0x0468:
            goto L_0x058f
        L_0x046a:
            java.lang.String r2 = "L186"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = 12
            goto L_0x0590
        L_0x0476:
            java.lang.String r2 = "L183"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = 11
            goto L_0x0590
        L_0x0482:
            java.lang.String r2 = "L180"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = 10
            goto L_0x0590
        L_0x048e:
            java.lang.String r2 = "L156"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = 9
            goto L_0x0590
        L_0x049a:
            java.lang.String r2 = "L153"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = r5
            goto L_0x0590
        L_0x04a5:
            java.lang.String r2 = "L150"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = 7
            goto L_0x0590
        L_0x04b0:
            java.lang.String r2 = "L123"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = 6
            goto L_0x0590
        L_0x04bb:
            java.lang.String r2 = "L120"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = 5
            goto L_0x0590
        L_0x04c6:
            java.lang.String r2 = "H186"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = 25
            goto L_0x0590
        L_0x04d2:
            java.lang.String r2 = "H183"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = 24
            goto L_0x0590
        L_0x04de:
            java.lang.String r2 = "H180"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = 23
            goto L_0x0590
        L_0x04ea:
            java.lang.String r2 = "H156"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = 22
            goto L_0x0590
        L_0x04f6:
            java.lang.String r2 = "H153"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = 21
            goto L_0x0590
        L_0x0502:
            java.lang.String r2 = "H150"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = r11
            goto L_0x0590
        L_0x050d:
            java.lang.String r2 = "H123"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = 19
            goto L_0x0590
        L_0x0519:
            java.lang.String r2 = "H120"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = 18
            goto L_0x0590
        L_0x0525:
            java.lang.String r2 = "L93"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = r10
            goto L_0x0590
        L_0x0530:
            java.lang.String r2 = "L90"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = 3
            goto L_0x0590
        L_0x053a:
            java.lang.String r2 = "L63"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = r12
            goto L_0x0590
        L_0x0544:
            java.lang.String r2 = "L60"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = r6
            goto L_0x0590
        L_0x054e:
            java.lang.String r2 = "L30"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = 0
            goto L_0x0590
        L_0x0558:
            java.lang.String r2 = "H93"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = 17
            goto L_0x0590
        L_0x0563:
            java.lang.String r2 = "H90"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = 16
            goto L_0x0590
        L_0x056e:
            java.lang.String r2 = "H63"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = 15
            goto L_0x0590
        L_0x0579:
            java.lang.String r2 = "H60"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = 14
            goto L_0x0590
        L_0x0584:
            java.lang.String r2 = "H30"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x058f
            r2 = 13
            goto L_0x0590
        L_0x058f:
            r2 = -1
        L_0x0590:
            switch(r2) {
                case 0: goto L_0x0602;
                case 1: goto L_0x05fd;
                case 2: goto L_0x05f6;
                case 3: goto L_0x05ef;
                case 4: goto L_0x05e8;
                case 5: goto L_0x05e1;
                case 6: goto L_0x05dc;
                case 7: goto L_0x05d9;
                case 8: goto L_0x05d6;
                case 9: goto L_0x05d3;
                case 10: goto L_0x05d0;
                case 11: goto L_0x05cd;
                case 12: goto L_0x05ca;
                case 13: goto L_0x05c5;
                case 14: goto L_0x05c0;
                case 15: goto L_0x05bb;
                case 16: goto L_0x05b6;
                case 17: goto L_0x05b1;
                case 18: goto L_0x05ae;
                case 19: goto L_0x05ab;
                case 20: goto L_0x05a7;
                case 21: goto L_0x05a4;
                case 22: goto L_0x05a1;
                case 23: goto L_0x059d;
                case 24: goto L_0x0599;
                case 25: goto L_0x0595;
                default: goto L_0x0593;
            }
        L_0x0593:
            goto L_0x045e
        L_0x0595:
            r2 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x05f8
        L_0x0599:
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x05f8
        L_0x059d:
            r2 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x05f8
        L_0x05a1:
            r2 = 524288(0x80000, float:7.34684E-40)
            goto L_0x05f8
        L_0x05a4:
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x05f8
        L_0x05a7:
            r2 = 32768(0x8000, float:4.5918E-41)
            goto L_0x05f8
        L_0x05ab:
            r2 = 8192(0x2000, float:1.14794E-41)
            goto L_0x05f8
        L_0x05ae:
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x05f8
        L_0x05b1:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x0606
        L_0x05b6:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            goto L_0x0606
        L_0x05bb:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            goto L_0x0606
        L_0x05c0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            goto L_0x0606
        L_0x05c5:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            goto L_0x0606
        L_0x05ca:
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            goto L_0x05f8
        L_0x05cd:
            r2 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x05f8
        L_0x05d0:
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x05f8
        L_0x05d3:
            r2 = 262144(0x40000, float:3.67342E-40)
            goto L_0x05f8
        L_0x05d6:
            r2 = 65536(0x10000, float:9.18355E-41)
            goto L_0x05f8
        L_0x05d9:
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x05f8
        L_0x05dc:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            goto L_0x0606
        L_0x05e1:
            r8 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L_0x0606
        L_0x05e8:
            r15 = 256(0x100, float:3.59E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            goto L_0x0606
        L_0x05ef:
            r16 = 64
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            goto L_0x0606
        L_0x05f6:
            r2 = 16
        L_0x05f8:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0606
        L_0x05fd:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            goto L_0x0606
        L_0x0602:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
        L_0x0606:
            if (r2 != 0) goto L_0x061d
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "Unknown HEVC level string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0616
            goto L_0x0410
        L_0x0616:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x041a
        L_0x061d:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.<init>(r0, r2)
            r2 = r1
            goto L_0x063d
        L_0x0628:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unknown HEVC profile string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0636
            goto L_0x0410
        L_0x0636:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x041a
        L_0x063d:
            return r2
        L_0x063e:
            r15 = r8
            r2 = 2048(0x800, float:2.87E-42)
            r16 = 64
            java.lang.String r0 = r0.f5231i
            int r8 = r1.length
            r2 = 3
            if (r8 >= r2) goto L_0x0665
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x065a
        L_0x0655:
            java.lang.String r0 = r1.concat(r0)
            goto L_0x065f
        L_0x065a:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x065f:
            android.util.Log.w(r4, r0)
            r2 = 0
            goto L_0x0718
        L_0x0665:
            r2 = r1[r6]     // Catch:{ NumberFormatException -> 0x0703 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0703 }
            r1 = r1[r12]     // Catch:{ NumberFormatException -> 0x0703 }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0703 }
            if (r2 == 0) goto L_0x0682
            if (r2 == r6) goto L_0x0680
            if (r2 == r12) goto L_0x067e
            r1 = 3
            if (r2 == r1) goto L_0x067c
            r1 = -1
            goto L_0x0683
        L_0x067c:
            r1 = r5
            goto L_0x0683
        L_0x067e:
            r1 = r10
            goto L_0x0683
        L_0x0680:
            r1 = r12
            goto L_0x0683
        L_0x0682:
            r1 = r6
        L_0x0683:
            r8 = -1
            if (r1 != r8) goto L_0x0698
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            java.lang.String r1 = "Unknown VP9 profile: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L_0x065f
        L_0x0698:
            r2 = 10
            if (r0 == r2) goto L_0x06df
            r2 = 11
            if (r0 == r2) goto L_0x06de
            if (r0 == r11) goto L_0x06dc
            r2 = 21
            if (r0 == r2) goto L_0x06da
            if (r0 == r3) goto L_0x06d6
            r2 = 31
            if (r0 == r2) goto L_0x06d4
            r2 = 40
            if (r0 == r2) goto L_0x06d1
            r2 = 41
            if (r0 == r2) goto L_0x06cf
            r2 = 50
            if (r0 == r2) goto L_0x06cd
            r2 = 51
            if (r0 == r2) goto L_0x06cb
            switch(r0) {
                case 60: goto L_0x06c7;
                case 61: goto L_0x06c5;
                case 62: goto L_0x06c2;
                default: goto L_0x06bf;
            }
        L_0x06bf:
            r2 = -1
            r6 = -1
            goto L_0x06e0
        L_0x06c2:
            r6 = 8192(0x2000, float:1.14794E-41)
            goto L_0x06df
        L_0x06c5:
            r6 = r13
            goto L_0x06df
        L_0x06c7:
            r2 = -1
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x06e0
        L_0x06cb:
            r6 = r7
            goto L_0x06df
        L_0x06cd:
            r6 = r15
            goto L_0x06df
        L_0x06cf:
            r6 = r9
            goto L_0x06df
        L_0x06d1:
            r6 = r16
            goto L_0x06df
        L_0x06d4:
            r6 = r14
            goto L_0x06df
        L_0x06d6:
            r2 = -1
            r6 = 16
            goto L_0x06e0
        L_0x06da:
            r6 = r5
            goto L_0x06df
        L_0x06dc:
            r6 = r10
            goto L_0x06df
        L_0x06de:
            r6 = r12
        L_0x06df:
            r2 = -1
        L_0x06e0:
            if (r6 != r2) goto L_0x06f5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r2 = "Unknown VP9 level: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x065f
        L_0x06f5:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r2.<init>(r0, r1)
            goto L_0x0718
        L_0x0703:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0711
            goto L_0x0655
        L_0x0711:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x065f
        L_0x0718:
            return r2
        L_0x0719:
            r15 = r8
            r8 = 1024(0x400, float:1.435E-42)
            r16 = 64
            java.lang.String r0 = r0.f5231i
            int r2 = r1.length
            if (r2 >= r12) goto L_0x073f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed AVC codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0734
        L_0x072f:
            java.lang.String r0 = r1.concat(r0)
            goto L_0x0739
        L_0x0734:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x0739:
            android.util.Log.w(r4, r0)
        L_0x073c:
            r2 = 0
            goto L_0x0840
        L_0x073f:
            r11 = r1[r6]     // Catch:{ NumberFormatException -> 0x082b }
            int r11 = r11.length()     // Catch:{ NumberFormatException -> 0x082b }
            r5 = 6
            if (r11 != r5) goto L_0x0760
            r2 = r1[r6]     // Catch:{ NumberFormatException -> 0x082b }
            r5 = 0
            java.lang.String r2 = r2.substring(r5, r12)     // Catch:{ NumberFormatException -> 0x082b }
            r5 = 16
            int r2 = java.lang.Integer.parseInt(r2, r5)     // Catch:{ NumberFormatException -> 0x082b }
            r1 = r1[r6]     // Catch:{ NumberFormatException -> 0x082b }
            java.lang.String r1 = r1.substring(r10)     // Catch:{ NumberFormatException -> 0x082b }
            int r0 = java.lang.Integer.parseInt(r1, r5)     // Catch:{ NumberFormatException -> 0x082b }
            goto L_0x0771
        L_0x0760:
            r5 = 16
            r11 = 3
            if (r2 < r11) goto L_0x080f
            r2 = r1[r6]     // Catch:{ NumberFormatException -> 0x082b }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x082b }
            r1 = r1[r12]     // Catch:{ NumberFormatException -> 0x082b }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x082b }
        L_0x0771:
            r1 = 66
            if (r2 == r1) goto L_0x079d
            r1 = 77
            if (r2 == r1) goto L_0x079e
            r1 = 88
            if (r2 == r1) goto L_0x079b
            r1 = 100
            if (r2 == r1) goto L_0x0797
            r1 = 110(0x6e, float:1.54E-43)
            if (r2 == r1) goto L_0x0795
            r1 = 122(0x7a, float:1.71E-43)
            if (r2 == r1) goto L_0x0793
            r1 = 244(0xf4, float:3.42E-43)
            if (r2 == r1) goto L_0x0790
            r1 = -1
            r12 = -1
            goto L_0x079f
        L_0x0790:
            r12 = r16
            goto L_0x079e
        L_0x0793:
            r12 = r14
            goto L_0x079e
        L_0x0795:
            r12 = r5
            goto L_0x079e
        L_0x0797:
            r1 = -1
            r12 = 8
            goto L_0x079f
        L_0x079b:
            r12 = r10
            goto L_0x079e
        L_0x079d:
            r12 = r6
        L_0x079e:
            r1 = -1
        L_0x079f:
            if (r12 != r1) goto L_0x07b3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            java.lang.String r1 = "Unknown AVC profile: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L_0x0739
        L_0x07b3:
            switch(r0) {
                case 10: goto L_0x07ea;
                case 11: goto L_0x07e8;
                case 12: goto L_0x07e5;
                case 13: goto L_0x07e3;
                default: goto L_0x07b6;
            }
        L_0x07b6:
            switch(r0) {
                case 20: goto L_0x07e1;
                case 21: goto L_0x07de;
                case 22: goto L_0x07dc;
                default: goto L_0x07b9;
            }
        L_0x07b9:
            switch(r0) {
                case 30: goto L_0x07da;
                case 31: goto L_0x07d8;
                case 32: goto L_0x07d6;
                default: goto L_0x07bc;
            }
        L_0x07bc:
            switch(r0) {
                case 40: goto L_0x07d3;
                case 41: goto L_0x07d1;
                case 42: goto L_0x07ce;
                default: goto L_0x07bf;
            }
        L_0x07bf:
            switch(r0) {
                case 50: goto L_0x07cb;
                case 51: goto L_0x07c7;
                case 52: goto L_0x07c4;
                default: goto L_0x07c2;
            }
        L_0x07c2:
            r1 = -1
            goto L_0x07eb
        L_0x07c4:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x07eb
        L_0x07c7:
            r1 = 32768(0x8000, float:4.5918E-41)
            goto L_0x07eb
        L_0x07cb:
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x07eb
        L_0x07ce:
            r1 = 8192(0x2000, float:1.14794E-41)
            goto L_0x07eb
        L_0x07d1:
            r1 = r13
            goto L_0x07eb
        L_0x07d3:
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x07eb
        L_0x07d6:
            r1 = r8
            goto L_0x07eb
        L_0x07d8:
            r1 = r7
            goto L_0x07eb
        L_0x07da:
            r1 = r15
            goto L_0x07eb
        L_0x07dc:
            r1 = r9
            goto L_0x07eb
        L_0x07de:
            r1 = r16
            goto L_0x07eb
        L_0x07e1:
            r1 = r14
            goto L_0x07eb
        L_0x07e3:
            r1 = r5
            goto L_0x07eb
        L_0x07e5:
            r1 = 8
            goto L_0x07eb
        L_0x07e8:
            r1 = r10
            goto L_0x07eb
        L_0x07ea:
            r1 = r6
        L_0x07eb:
            r2 = -1
            if (r1 != r2) goto L_0x0801
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r2 = "Unknown AVC level: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0739
        L_0x0801:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.<init>(r0, r1)
            goto L_0x0840
        L_0x080f:
            java.lang.String r1 = "Ignoring malformed AVC codec string: "
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x082b }
            int r3 = r2.length()     // Catch:{ NumberFormatException -> 0x082b }
            if (r3 == 0) goto L_0x0820
            java.lang.String r1 = r1.concat(r2)     // Catch:{ NumberFormatException -> 0x082b }
            goto L_0x0826
        L_0x0820:
            java.lang.String r2 = new java.lang.String     // Catch:{ NumberFormatException -> 0x082b }
            r2.<init>(r1)     // Catch:{ NumberFormatException -> 0x082b }
            r1 = r2
        L_0x0826:
            android.util.Log.w(r4, r1)     // Catch:{ NumberFormatException -> 0x082b }
            goto L_0x073c
        L_0x082b:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed AVC codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0839
            goto L_0x072f
        L_0x0839:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x0739
        L_0x0840:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q44.m15467b(com.google.android.gms.internal.ads.c0):android.util.Pair");
    }

    /* renamed from: c */
    public static z34 m15468c(String str, boolean z, boolean z2) {
        List<z34> e = m15470e(str, false, false);
        if (e.isEmpty()) {
            return null;
        }
        return e.get(0);
    }

    /* renamed from: d */
    public static z34 m15469d() {
        return m15468c("audio/raw", false, false);
    }

    /* renamed from: e */
    public static synchronized List<z34> m15470e(String str, boolean z, boolean z2) {
        String str2 = str;
        boolean z3 = z;
        boolean z4 = z2;
        synchronized (q44.class) {
            i44 i44 = new i44(str2, z3, z4);
            HashMap<i44, List<z34>> hashMap = f13056b;
            List<z34> list = hashMap.get(i44);
            if (list != null) {
                return list;
            }
            int i = n13.f11236a;
            ArrayList<z34> g = m15472g(i44, i >= 21 ? new o44(z3, z4) : new n44((m44) null));
            if (z3 && g.isEmpty() && i >= 21 && i <= 23) {
                g = m15472g(i44, new n44((m44) null));
                if (!g.isEmpty()) {
                    String str3 = g.get(0).f18012a;
                    StringBuilder sb = new StringBuilder(str.length() + 63 + String.valueOf(str3).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str2);
                    sb.append(". Assuming: ");
                    sb.append(str3);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            if ("audio/raw".equals(str2)) {
                if (i < 26 && n13.f11237b.equals("R9") && g.size() == 1 && g.get(0).f18012a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    g.add(z34.m20410c("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false, false));
                }
                m15473h(g, f44.f6711a);
            }
            if (i < 21 && g.size() > 1) {
                String str4 = g.get(0).f18012a;
                if ("OMX.SEC.mp3.dec".equals(str4) || "OMX.SEC.MP3.Decoder".equals(str4) || "OMX.brcm.audio.mp3.decoder".equals(str4)) {
                    m15473h(g, g44.f7271a);
                }
            }
            if (i < 32 && g.size() > 1 && "OMX.qti.audio.decoder.flac".equals(g.get(0).f18012a)) {
                g.add(g.remove(0));
            }
            List<z34> unmodifiableList = Collections.unmodifiableList(g);
            hashMap.put(i44, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* renamed from: f */
    public static List<z34> m15471f(List<z34> list, C1574c0 c0Var) {
        ArrayList arrayList = new ArrayList(list);
        m15473h(arrayList, new e44(c0Var));
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x019c, code lost:
        if ("SCV31".equals(r5) == false) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01da, code lost:
        if (r8.startsWith("t0") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r12.endsWith(".secure") == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a2, code lost:
        if (r11.startsWith("HM") == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0110, code lost:
        if ("SO-02E".equals(r11) == false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x013c, code lost:
        if ("C1605".equals(r10) == false) goto L_0x013e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0333 A[SYNTHETIC, Splitter:B:213:0x0333] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x035f A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<com.google.android.gms.internal.ads.z34> m15472g(com.google.android.gms.internal.ads.i44 r23, com.google.android.gms.internal.ads.l44 r24) {
        /*
            r1 = r23
            r2 = r24
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x039c }
            r6.<init>()     // Catch:{ Exception -> 0x039c }
            java.lang.String r15 = r1.f8538a     // Catch:{ Exception -> 0x039c }
            int r14 = r24.zza()     // Catch:{ Exception -> 0x039c }
            boolean r16 = r24.mo8876b()     // Catch:{ Exception -> 0x039c }
            r17 = 0
            r13 = r17
        L_0x001b:
            if (r13 >= r14) goto L_0x039b
            android.media.MediaCodecInfo r0 = r2.mo8874E(r13)     // Catch:{ Exception -> 0x039c }
            int r7 = com.google.android.gms.internal.ads.n13.f11236a     // Catch:{ Exception -> 0x039c }
            r8 = 29
            if (r7 < r8) goto L_0x0034
            boolean r9 = r0.isAlias()     // Catch:{ Exception -> 0x039c }
            if (r9 == 0) goto L_0x0034
        L_0x002d:
            r21 = r13
            r22 = r14
            r2 = r15
            goto L_0x0392
        L_0x0034:
            java.lang.String r12 = r0.getName()     // Catch:{ Exception -> 0x039c }
            boolean r9 = r0.isEncoder()     // Catch:{ Exception -> 0x039c }
            if (r9 != 0) goto L_0x002d
            java.lang.String r9 = ".secure"
            if (r16 != 0) goto L_0x0048
            boolean r10 = r12.endsWith(r9)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
        L_0x0048:
            r10 = 21
            if (r7 >= r10) goto L_0x007c
            java.lang.String r10 = "CIPAACDecoder"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
            java.lang.String r10 = "CIPMP3Decoder"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
            java.lang.String r10 = "CIPVorbisDecoder"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
            java.lang.String r10 = "CIPAMRNBDecoder"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
            java.lang.String r10 = "AACDecoder"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
            java.lang.String r10 = "MP3Decoder"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
        L_0x007c:
            r10 = 18
            if (r7 >= r10) goto L_0x00a4
            java.lang.String r10 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x039c }
            if (r10 == 0) goto L_0x00a4
            java.lang.String r10 = "a70"
            java.lang.String r11 = com.google.android.gms.internal.ads.n13.f11237b     // Catch:{ Exception -> 0x039c }
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
            java.lang.String r10 = "Xiaomi"
            java.lang.String r5 = com.google.android.gms.internal.ads.n13.f11238c     // Catch:{ Exception -> 0x039c }
            boolean r5 = r10.equals(r5)     // Catch:{ Exception -> 0x039c }
            if (r5 == 0) goto L_0x00a4
            java.lang.String r5 = "HM"
            boolean r5 = r11.startsWith(r5)     // Catch:{ Exception -> 0x039c }
            if (r5 != 0) goto L_0x002d
        L_0x00a4:
            r5 = 16
            if (r7 != r5) goto L_0x0112
            java.lang.String r10 = "OMX.qcom.audio.decoder.mp3"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x039c }
            if (r10 == 0) goto L_0x0112
            java.lang.String r10 = "dlxu"
            java.lang.String r11 = com.google.android.gms.internal.ads.n13.f11237b     // Catch:{ Exception -> 0x039c }
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
            java.lang.String r10 = "protou"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
            java.lang.String r10 = "ville"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
            java.lang.String r10 = "villeplus"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
            java.lang.String r10 = "villec2"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
            java.lang.String r10 = "gee"
            boolean r10 = r11.startsWith(r10)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
            java.lang.String r10 = "C6602"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
            java.lang.String r10 = "C6603"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
            java.lang.String r10 = "C6606"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
            java.lang.String r10 = "C6616"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
            java.lang.String r10 = "L36h"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
            java.lang.String r10 = "SO-02E"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
        L_0x0112:
            if (r7 != r5) goto L_0x013e
            java.lang.String r5 = "OMX.qcom.audio.decoder.aac"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x039c }
            if (r5 == 0) goto L_0x013e
            java.lang.String r5 = "C1504"
            java.lang.String r10 = com.google.android.gms.internal.ads.n13.f11237b     // Catch:{ Exception -> 0x039c }
            boolean r5 = r5.equals(r10)     // Catch:{ Exception -> 0x039c }
            if (r5 != 0) goto L_0x002d
            java.lang.String r5 = "C1505"
            boolean r5 = r5.equals(r10)     // Catch:{ Exception -> 0x039c }
            if (r5 != 0) goto L_0x002d
            java.lang.String r5 = "C1604"
            boolean r5 = r5.equals(r10)     // Catch:{ Exception -> 0x039c }
            if (r5 != 0) goto L_0x002d
            java.lang.String r5 = "C1605"
            boolean r5 = r5.equals(r10)     // Catch:{ Exception -> 0x039c }
            if (r5 != 0) goto L_0x002d
        L_0x013e:
            r5 = 24
            java.lang.String r10 = "samsung"
            if (r7 >= r5) goto L_0x019e
            java.lang.String r5 = "OMX.SEC.aac.dec"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x039c }
            if (r5 != 0) goto L_0x0154
            java.lang.String r5 = "OMX.Exynos.AAC.Decoder"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x039c }
            if (r5 == 0) goto L_0x019e
        L_0x0154:
            java.lang.String r5 = com.google.android.gms.internal.ads.n13.f11238c     // Catch:{ Exception -> 0x039c }
            boolean r5 = r10.equals(r5)     // Catch:{ Exception -> 0x039c }
            if (r5 == 0) goto L_0x019e
            java.lang.String r5 = com.google.android.gms.internal.ads.n13.f11237b     // Catch:{ Exception -> 0x039c }
            java.lang.String r11 = "zeroflte"
            boolean r11 = r5.startsWith(r11)     // Catch:{ Exception -> 0x039c }
            if (r11 != 0) goto L_0x002d
            java.lang.String r11 = "zerolte"
            boolean r11 = r5.startsWith(r11)     // Catch:{ Exception -> 0x039c }
            if (r11 != 0) goto L_0x002d
            java.lang.String r11 = "zenlte"
            boolean r11 = r5.startsWith(r11)     // Catch:{ Exception -> 0x039c }
            if (r11 != 0) goto L_0x002d
            java.lang.String r11 = "SC-05G"
            boolean r11 = r11.equals(r5)     // Catch:{ Exception -> 0x039c }
            if (r11 != 0) goto L_0x002d
            java.lang.String r11 = "marinelteatt"
            boolean r11 = r11.equals(r5)     // Catch:{ Exception -> 0x039c }
            if (r11 != 0) goto L_0x002d
            java.lang.String r11 = "404SC"
            boolean r11 = r11.equals(r5)     // Catch:{ Exception -> 0x039c }
            if (r11 != 0) goto L_0x002d
            java.lang.String r11 = "SC-04G"
            boolean r11 = r11.equals(r5)     // Catch:{ Exception -> 0x039c }
            if (r11 != 0) goto L_0x002d
            java.lang.String r11 = "SCV31"
            boolean r5 = r11.equals(r5)     // Catch:{ Exception -> 0x039c }
            if (r5 != 0) goto L_0x002d
        L_0x019e:
            java.lang.String r5 = "jflte"
            r11 = 19
            if (r7 > r11) goto L_0x01dc
            java.lang.String r8 = "OMX.SEC.vp8.dec"
            boolean r8 = r8.equals(r12)     // Catch:{ Exception -> 0x039c }
            if (r8 == 0) goto L_0x01dc
            java.lang.String r8 = com.google.android.gms.internal.ads.n13.f11238c     // Catch:{ Exception -> 0x039c }
            boolean r8 = r10.equals(r8)     // Catch:{ Exception -> 0x039c }
            if (r8 == 0) goto L_0x01dc
            java.lang.String r8 = com.google.android.gms.internal.ads.n13.f11237b     // Catch:{ Exception -> 0x039c }
            java.lang.String r10 = "d2"
            boolean r10 = r8.startsWith(r10)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
            java.lang.String r10 = "serrano"
            boolean r10 = r8.startsWith(r10)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
            boolean r10 = r8.startsWith(r5)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
            java.lang.String r10 = "santos"
            boolean r10 = r8.startsWith(r10)     // Catch:{ Exception -> 0x039c }
            if (r10 != 0) goto L_0x002d
            java.lang.String r10 = "t0"
            boolean r8 = r8.startsWith(r10)     // Catch:{ Exception -> 0x039c }
            if (r8 != 0) goto L_0x002d
        L_0x01dc:
            if (r7 > r11) goto L_0x01ee
            java.lang.String r7 = com.google.android.gms.internal.ads.n13.f11237b     // Catch:{ Exception -> 0x039c }
            boolean r5 = r7.startsWith(r5)     // Catch:{ Exception -> 0x039c }
            if (r5 == 0) goto L_0x01ee
            java.lang.String r5 = "OMX.qcom.video.decoder.vp8"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x039c }
            if (r5 != 0) goto L_0x002d
        L_0x01ee:
            java.lang.String r5 = "audio/eac3-joc"
            boolean r5 = r5.equals(r15)     // Catch:{ Exception -> 0x039c }
            if (r5 == 0) goto L_0x01fe
            java.lang.String r5 = "OMX.MTK.AUDIO.DECODER.DSPAC3"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x039c }
            if (r5 != 0) goto L_0x002d
        L_0x01fe:
            java.lang.String[] r5 = r0.getSupportedTypes()     // Catch:{ Exception -> 0x039c }
            int r7 = r5.length     // Catch:{ Exception -> 0x039c }
            r8 = r17
        L_0x0205:
            if (r8 >= r7) goto L_0x0214
            r10 = r5[r8]     // Catch:{ Exception -> 0x039c }
            boolean r11 = r10.equalsIgnoreCase(r15)     // Catch:{ Exception -> 0x039c }
            if (r11 == 0) goto L_0x0211
        L_0x020f:
            r5 = r10
            goto L_0x0261
        L_0x0211:
            int r8 = r8 + 1
            goto L_0x0205
        L_0x0214:
            java.lang.String r5 = "video/dolby-vision"
            boolean r5 = r15.equals(r5)     // Catch:{ Exception -> 0x039c }
            if (r5 == 0) goto L_0x023a
            java.lang.String r5 = "OMX.MS.HEVCDV.Decoder"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x039c }
            if (r5 == 0) goto L_0x0227
            java.lang.String r10 = "video/hevcdv"
            goto L_0x020f
        L_0x0227:
            java.lang.String r5 = "OMX.RTK.video.decoder"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x039c }
            if (r5 != 0) goto L_0x0237
            java.lang.String r5 = "OMX.realtek.video.decoder.tunneled"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x039c }
            if (r5 == 0) goto L_0x0260
        L_0x0237:
            java.lang.String r10 = "video/dv_hevc"
            goto L_0x020f
        L_0x023a:
            java.lang.String r5 = "audio/alac"
            boolean r5 = r15.equals(r5)     // Catch:{ Exception -> 0x039c }
            if (r5 == 0) goto L_0x024d
            java.lang.String r5 = "OMX.lge.alac.decoder"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x039c }
            if (r5 == 0) goto L_0x024d
            java.lang.String r10 = "audio/x-lg-alac"
            goto L_0x020f
        L_0x024d:
            java.lang.String r5 = "audio/flac"
            boolean r5 = r15.equals(r5)     // Catch:{ Exception -> 0x039c }
            if (r5 == 0) goto L_0x0260
            java.lang.String r5 = "OMX.lge.flac.decoder"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x039c }
            if (r5 == 0) goto L_0x0260
            java.lang.String r10 = "audio/x-lg-flac"
            goto L_0x020f
        L_0x0260:
            r5 = 0
        L_0x0261:
            if (r5 == 0) goto L_0x002d
            android.media.MediaCodecInfo$CodecCapabilities r10 = r0.getCapabilitiesForType(r5)     // Catch:{ Exception -> 0x0323 }
            boolean r7 = r2.mo8875a(r4, r5, r10)     // Catch:{ Exception -> 0x0323 }
            boolean r8 = r2.mo8877c(r4, r5, r10)     // Catch:{ Exception -> 0x0323 }
            boolean r11 = r1.f8540c     // Catch:{ Exception -> 0x0323 }
            if (r11 != 0) goto L_0x0276
            if (r8 != 0) goto L_0x002d
            goto L_0x027a
        L_0x0276:
            if (r7 != 0) goto L_0x027a
            goto L_0x002d
        L_0x027a:
            boolean r7 = r2.mo8875a(r3, r5, r10)     // Catch:{ Exception -> 0x0323 }
            boolean r8 = r2.mo8877c(r3, r5, r10)     // Catch:{ Exception -> 0x0323 }
            boolean r11 = r1.f8539b     // Catch:{ Exception -> 0x0323 }
            r19 = 1
            if (r11 != 0) goto L_0x028b
            if (r8 != 0) goto L_0x002d
            goto L_0x028f
        L_0x028b:
            if (r7 == 0) goto L_0x002d
            r7 = r19
        L_0x028f:
            int r8 = com.google.android.gms.internal.ads.n13.f11236a     // Catch:{ Exception -> 0x0323 }
            r11 = 29
            if (r8 < r11) goto L_0x029a
            boolean r11 = r0.isHardwareAccelerated()     // Catch:{ Exception -> 0x0323 }
            goto L_0x02a5
        L_0x029a:
            boolean r11 = m15474i(r0)     // Catch:{ Exception -> 0x0323 }
            if (r11 != 0) goto L_0x02a3
            r11 = r19
            goto L_0x02a5
        L_0x02a3:
            r11 = r17
        L_0x02a5:
            boolean r20 = m15474i(r0)     // Catch:{ Exception -> 0x0323 }
            r2 = 29
            if (r8 < r2) goto L_0x02b2
            boolean r0 = r0.isVendor()     // Catch:{ Exception -> 0x0323 }
            goto L_0x02d7
        L_0x02b2:
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0323 }
            java.lang.String r0 = com.google.android.gms.internal.ads.w33.m18852a(r0)     // Catch:{ Exception -> 0x0323 }
            java.lang.String r2 = "omx.google."
            boolean r2 = r0.startsWith(r2)     // Catch:{ Exception -> 0x0323 }
            if (r2 != 0) goto L_0x02d5
            java.lang.String r2 = "c2.android."
            boolean r2 = r0.startsWith(r2)     // Catch:{ Exception -> 0x0323 }
            if (r2 != 0) goto L_0x02d5
            java.lang.String r2 = "c2.google."
            boolean r0 = r0.startsWith(r2)     // Catch:{ Exception -> 0x0323 }
            if (r0 != 0) goto L_0x02d5
            r0 = r19
            goto L_0x02d7
        L_0x02d5:
            r0 = r17
        L_0x02d7:
            if (r16 == 0) goto L_0x02dd
            boolean r2 = r1.f8539b     // Catch:{ Exception -> 0x0323 }
            if (r2 == r7) goto L_0x02e3
        L_0x02dd:
            if (r16 != 0) goto L_0x0301
            boolean r2 = r1.f8539b     // Catch:{ Exception -> 0x0323 }
            if (r2 != 0) goto L_0x0301
        L_0x02e3:
            r2 = 0
            r18 = 0
            r7 = r12
            r8 = r15
            r9 = r5
            r19 = r12
            r12 = r20
            r21 = r13
            r13 = r0
            r22 = r14
            r14 = r2
            r2 = r15
            r15 = r18
            com.google.android.gms.internal.ads.z34 r0 = com.google.android.gms.internal.ads.z34.m20410c(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x02ff }
            r6.add(r0)     // Catch:{ Exception -> 0x02ff }
            goto L_0x0392
        L_0x02ff:
            r0 = move-exception
            goto L_0x032b
        L_0x0301:
            r19 = r12
            r21 = r13
            r22 = r14
            r2 = r15
            if (r16 != 0) goto L_0x0392
            if (r7 == 0) goto L_0x0392
            java.lang.String r7 = java.lang.String.valueOf(r19)     // Catch:{ Exception -> 0x02ff }
            java.lang.String r7 = r7.concat(r9)     // Catch:{ Exception -> 0x02ff }
            r14 = 0
            r15 = 1
            r8 = r2
            r9 = r5
            r12 = r20
            r13 = r0
            com.google.android.gms.internal.ads.z34 r0 = com.google.android.gms.internal.ads.z34.m20410c(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x02ff }
            r6.add(r0)     // Catch:{ Exception -> 0x02ff }
            return r6
        L_0x0323:
            r0 = move-exception
            r19 = r12
            r21 = r13
            r22 = r14
            r2 = r15
        L_0x032b:
            int r7 = com.google.android.gms.internal.ads.n13.f11236a     // Catch:{ Exception -> 0x039c }
            r8 = 23
            java.lang.String r9 = "MediaCodecUtil"
            if (r7 > r8) goto L_0x035f
            boolean r7 = r6.isEmpty()     // Catch:{ Exception -> 0x039c }
            if (r7 != 0) goto L_0x035f
            java.lang.String r0 = java.lang.String.valueOf(r19)     // Catch:{ Exception -> 0x039c }
            int r0 = r0.length()     // Catch:{ Exception -> 0x039c }
            int r0 = r0 + 46
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x039c }
            r5.<init>(r0)     // Catch:{ Exception -> 0x039c }
            java.lang.String r0 = "Skipping codec "
            r5.append(r0)     // Catch:{ Exception -> 0x039c }
            r7 = r19
            r5.append(r7)     // Catch:{ Exception -> 0x039c }
            java.lang.String r0 = " (failed to query capabilities)"
            r5.append(r0)     // Catch:{ Exception -> 0x039c }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x039c }
            android.util.Log.e(r9, r0)     // Catch:{ Exception -> 0x039c }
            goto L_0x0392
        L_0x035f:
            r7 = r19
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x039c }
            int r1 = r1.length()     // Catch:{ Exception -> 0x039c }
            int r1 = r1 + 25
            int r2 = r5.length()     // Catch:{ Exception -> 0x039c }
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x039c }
            r2.<init>(r1)     // Catch:{ Exception -> 0x039c }
            java.lang.String r1 = "Failed to query codec "
            r2.append(r1)     // Catch:{ Exception -> 0x039c }
            r2.append(r7)     // Catch:{ Exception -> 0x039c }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x039c }
            r2.append(r5)     // Catch:{ Exception -> 0x039c }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x039c }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x039c }
            android.util.Log.e(r9, r1)     // Catch:{ Exception -> 0x039c }
            throw r0     // Catch:{ Exception -> 0x039c }
        L_0x0392:
            int r13 = r21 + 1
            r15 = r2
            r14 = r22
            r2 = r24
            goto L_0x001b
        L_0x039b:
            return r6
        L_0x039c:
            r0 = move-exception
            com.google.android.gms.internal.ads.k44 r1 = new com.google.android.gms.internal.ads.k44
            r2 = 0
            r1.<init>(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q44.m15472g(com.google.android.gms.internal.ads.i44, com.google.android.gms.internal.ads.l44):java.util.ArrayList");
    }

    /* renamed from: h */
    private static <T> void m15473h(List<T> list, p44<T> p44) {
        Collections.sort(list, new h44(p44));
    }

    /* renamed from: i */
    private static boolean m15474i(MediaCodecInfo mediaCodecInfo) {
        if (n13.f11236a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        String a = w33.m18852a(mediaCodecInfo.getName());
        if (a.startsWith("arc.")) {
            return false;
        }
        return a.startsWith("omx.google.") || a.startsWith("omx.ffmpeg.") || (a.startsWith("omx.sec.") && a.contains(".sw.")) || a.equals("omx.qcom.video.decoder.hevcswvdec") || a.startsWith("c2.android.") || a.startsWith("c2.google.") || (!a.startsWith("omx.") && !a.startsWith("c2."));
    }
}
