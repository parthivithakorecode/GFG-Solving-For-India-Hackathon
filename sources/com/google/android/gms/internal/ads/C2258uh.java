package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.uh */
final class C2258uh {

    /* renamed from: A */
    public float f15557A = -1.0f;

    /* renamed from: B */
    public float f15558B = -1.0f;

    /* renamed from: C */
    public float f15559C = -1.0f;

    /* renamed from: D */
    public float f15560D = -1.0f;

    /* renamed from: E */
    public float f15561E = -1.0f;

    /* renamed from: F */
    public float f15562F = -1.0f;

    /* renamed from: G */
    public int f15563G = 1;

    /* renamed from: H */
    public int f15564H = -1;

    /* renamed from: I */
    public int f15565I = 8000;

    /* renamed from: J */
    public long f15566J = 0;

    /* renamed from: K */
    public long f15567K = 0;

    /* renamed from: L */
    public boolean f15568L;

    /* renamed from: M */
    public boolean f15569M = true;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public String f15570N = "eng";

    /* renamed from: O */
    public C1925lh f15571O;

    /* renamed from: P */
    public int f15572P;

    /* renamed from: a */
    public String f15573a;

    /* renamed from: b */
    public int f15574b;

    /* renamed from: c */
    public int f15575c;

    /* renamed from: d */
    public int f15576d;

    /* renamed from: e */
    public boolean f15577e;

    /* renamed from: f */
    public byte[] f15578f;

    /* renamed from: g */
    public C1888kh f15579g;

    /* renamed from: h */
    public byte[] f15580h;

    /* renamed from: i */
    public C2406yg f15581i;

    /* renamed from: j */
    public int f15582j = -1;

    /* renamed from: k */
    public int f15583k = -1;

    /* renamed from: l */
    public int f15584l = -1;

    /* renamed from: m */
    public int f15585m = -1;

    /* renamed from: n */
    public int f15586n = 0;

    /* renamed from: o */
    public byte[] f15587o = null;

    /* renamed from: p */
    public int f15588p = -1;

    /* renamed from: q */
    public boolean f15589q = false;

    /* renamed from: r */
    public int f15590r = -1;

    /* renamed from: s */
    public int f15591s = -1;

    /* renamed from: t */
    public int f15592t = -1;

    /* renamed from: u */
    public int f15593u = 1000;

    /* renamed from: v */
    public int f15594v = 200;

    /* renamed from: w */
    public float f15595w = -1.0f;

    /* renamed from: x */
    public float f15596x = -1.0f;

    /* renamed from: y */
    public float f15597y = -1.0f;

    /* renamed from: z */
    public float f15598z = -1.0f;

    private C2258uh() {
    }

    /* synthetic */ C2258uh(C2184sh shVar) {
    }

    /* renamed from: c */
    private static List<byte[]> m17900c(C2152rm rmVar) {
        try {
            rmVar.mo10553w(16);
            if (rmVar.mo10541k() != 826496599) {
                return null;
            }
            int c = rmVar.mo10533c() + 20;
            byte[] bArr = rmVar.f13709a;
            while (true) {
                int length = bArr.length;
                if (c >= length - 4) {
                    throw new C1515af("Failed to find FourCC VC1 initialization data");
                } else if (bArr[c] == 0 && bArr[c + 1] == 0 && bArr[c + 2] == 1 && bArr[c + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, c, length));
                } else {
                    c++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C1515af("Error parsing FourCC VC1 codec private");
        }
    }

    /* renamed from: d */
    private static List<byte[]> m17901d(byte[] bArr) {
        byte b;
        byte b2;
        try {
            if (bArr[0] == 2) {
                int i = 0;
                int i2 = 1;
                while (true) {
                    b = bArr[i2];
                    if (b != -1) {
                        break;
                    }
                    i += 255;
                    i2++;
                }
                int i3 = i2 + 1;
                int i4 = i + b;
                int i5 = 0;
                while (true) {
                    b2 = bArr[i3];
                    if (b2 != -1) {
                        break;
                    }
                    i5 += 255;
                    i3++;
                }
                int i6 = i3 + 1;
                int i7 = i5 + b2;
                if (bArr[i6] == 1) {
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(bArr, i6, bArr2, 0, i4);
                    int i8 = i6 + i4;
                    if (bArr[i8] == 3) {
                        int i9 = i8 + i7;
                        if (bArr[i9] == 5) {
                            int length = bArr.length - i9;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i9, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new C1515af("Error parsing vorbis codec private");
                    }
                    throw new C1515af("Error parsing vorbis codec private");
                }
                throw new C1515af("Error parsing vorbis codec private");
            }
            throw new C1515af("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C1515af("Error parsing vorbis codec private");
        }
    }

    /* renamed from: e */
    private static boolean m17902e(C2152rm rmVar) {
        try {
            int f = rmVar.mo10536f();
            if (f == 1) {
                return true;
            }
            if (f == 65534) {
                rmVar.mo10552v(24);
                return rmVar.mo10542l() == C2295vh.f16236c0.getMostSignificantBits() && rmVar.mo10542l() == C2295vh.f16236c0.getLeastSignificantBits();
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C1515af("Error parsing MS/ACM codec private");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e4, code lost:
        android.util.Log.w("MatroskaExtractor", r1);
        r12 = "audio/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x020e, code lost:
        r32 = 4096;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0268, code lost:
        r32 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x026a, code lost:
        r27 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02af, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02c7, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02c9, code lost:
        r27 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02cb, code lost:
        r32 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02cd, code lost:
        r2 = r0.f15569M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02d1, code lost:
        if (true == r0.f15568L) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02d3, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02d5, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02d6, code lost:
        r2 = r2 | r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02db, code lost:
        if (com.google.android.gms.internal.ads.C2041om.m14519a(r12) == false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02dd, code lost:
        r1 = com.google.android.gms.internal.ads.C2367xe.m19466i(java.lang.Integer.toString(r45), r12, (java.lang.String) null, -1, r32, r0.f15563G, r0.f15565I, r27, -1, -1, r1, r0.f15581i, r2 ? 1 : 0, r0.f15570N, (com.google.android.gms.internal.ads.C1964mj) null);
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x030e, code lost:
        if (com.google.android.gms.internal.ads.C2041om.m14520b(r12) == false) goto L_0x0430;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0312, code lost:
        if (r0.f15586n != 0) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0314, code lost:
        r2 = r0.f15584l;
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0317, code lost:
        if (r2 != -1) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0319, code lost:
        r2 = r0.f15582j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x031b, code lost:
        r0.f15584l = r2;
        r2 = r0.f15585m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x031f, code lost:
        if (r2 != -1) goto L_0x0323;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0321, code lost:
        r2 = r0.f15583k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0323, code lost:
        r0.f15585m = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0326, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0327, code lost:
        r2 = r0.f15584l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x032b, code lost:
        if (r2 == r3) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x032d, code lost:
        r5 = r0.f15585m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x032f, code lost:
        if (r5 == r3) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0331, code lost:
        r38 = ((float) (r0.f15583k * r2)) / ((float) (r0.f15582j * r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x033d, code lost:
        r38 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0341, code lost:
        if (r0.f15589q == false) goto L_0x0405;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0347, code lost:
        if (r0.f15595w == -1.0f) goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x034d, code lost:
        if (r0.f15596x == -1.0f) goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0353, code lost:
        if (r0.f15597y == -1.0f) goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0359, code lost:
        if (r0.f15598z == -1.0f) goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x035f, code lost:
        if (r0.f15557A == -1.0f) goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0365, code lost:
        if (r0.f15558B == -1.0f) goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x036b, code lost:
        if (r0.f15559C == -1.0f) goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0371, code lost:
        if (r0.f15560D == -1.0f) goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0377, code lost:
        if (r0.f15561E == -1.0f) goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x037d, code lost:
        if (r0.f15562F != -1.0f) goto L_0x0380;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0380, code lost:
        r2 = new byte[25];
        r3 = java.nio.ByteBuffer.wrap(r2);
        r3.put((byte) 0);
        r3.putShort((short) ((int) ((r0.f15595w * 50000.0f) + 0.5f)));
        r3.putShort((short) ((int) ((r0.f15596x * 50000.0f) + 0.5f)));
        r3.putShort((short) ((int) ((r0.f15597y * 50000.0f) + 0.5f)));
        r3.putShort((short) ((int) ((r0.f15598z * 50000.0f) + 0.5f)));
        r3.putShort((short) ((int) ((r0.f15557A * 50000.0f) + 0.5f)));
        r3.putShort((short) ((int) ((r0.f15558B * 50000.0f) + 0.5f)));
        r3.putShort((short) ((int) ((r0.f15559C * 50000.0f) + 0.5f)));
        r3.putShort((short) ((int) ((r0.f15560D * 50000.0f) + 0.5f)));
        r3.putShort((short) ((int) (r0.f15561E + 0.5f)));
        r3.putShort((short) ((int) (r0.f15562F + 0.5f)));
        r3.putShort((short) r0.f15593u);
        r3.putShort((short) r0.f15594v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03f5, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03f7, code lost:
        r41 = new com.google.android.gms.internal.ads.C1597cn(r0.f15590r, r0.f15592t, r0.f15591s, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0405, code lost:
        r41 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0407, code lost:
        r1 = com.google.android.gms.internal.ads.C2367xe.m19470m(java.lang.Integer.toString(r45), r12, (java.lang.String) null, -1, r32, r0.f15582j, r0.f15583k, -1.0f, r1, -1, r38, r0.f15587o, r0.f15588p, r41, r0.f15581i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0434, code lost:
        if ("application/x-subrip".equals(r12) == false) goto L_0x045b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0436, code lost:
        r1 = com.google.android.gms.internal.ads.C2367xe.m19469l(java.lang.Integer.toString(r45), r12, (java.lang.String) null, -1, r2 ? 1 : 0, r0.f15570N, -1, r0.f15581i, Long.MAX_VALUE, java.util.Collections.emptyList());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0459, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x045f, code lost:
        if ("application/vobsub".equals(r12) != false) goto L_0x0476;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0465, code lost:
        if ("application/pgs".equals(r12) != false) goto L_0x0476;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x046b, code lost:
        if ("application/dvbsubs".equals(r12) == false) goto L_0x046e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0475, code lost:
        throw new com.google.android.gms.internal.ads.C1515af("Unexpected MIME type.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0476, code lost:
        r1 = com.google.android.gms.internal.ads.C2367xe.m19467j(java.lang.Integer.toString(r45), r12, (java.lang.String) null, -1, r1, r0.f15570N, r0.f15581i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x048f, code lost:
        r2 = r44.mo6476c(r0.f15574b, r6);
        r0.f15571O = r2;
        r2.mo8952b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x049c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01af, code lost:
        r4.append("Unsupported PCM bit depth: ");
        r4.append(r1);
        r4.append(". Setting mimeType to audio/x-unknown");
        r1 = r4.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01bf, code lost:
        r27 = r1;
        r1 = null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11222b(com.google.android.gms.internal.ads.C1628dh r44, int r45) {
        /*
            r43 = this;
            r0 = r43
            java.lang.String r1 = r0.f15573a
            int r2 = r1.hashCode()
            r4 = 4
            r5 = 8
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 3
            switch(r2) {
                case -2095576542: goto L_0x0148;
                case -2095575984: goto L_0x013e;
                case -1985379776: goto L_0x0133;
                case -1784763192: goto L_0x0128;
                case -1730367663: goto L_0x011d;
                case -1482641358: goto L_0x0112;
                case -1482641357: goto L_0x0107;
                case -1373388978: goto L_0x00fd;
                case -933872740: goto L_0x00f2;
                case -538363189: goto L_0x00e7;
                case -538363109: goto L_0x00dc;
                case -425012669: goto L_0x00d0;
                case -356037306: goto L_0x00c4;
                case 62923557: goto L_0x00b8;
                case 62923603: goto L_0x00ac;
                case 62927045: goto L_0x00a0;
                case 82338133: goto L_0x0095;
                case 82338134: goto L_0x008a;
                case 99146302: goto L_0x007e;
                case 444813526: goto L_0x0072;
                case 542569478: goto L_0x0066;
                case 725957860: goto L_0x005a;
                case 855502857: goto L_0x004f;
                case 1422270023: goto L_0x0043;
                case 1809237540: goto L_0x0038;
                case 1950749482: goto L_0x002c;
                case 1950789798: goto L_0x0020;
                case 1951062397: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0152
        L_0x0014:
            java.lang.String r2 = "A_OPUS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 11
            goto L_0x0153
        L_0x0020:
            java.lang.String r2 = "A_FLAC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 21
            goto L_0x0153
        L_0x002c:
            java.lang.String r2 = "A_EAC3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 16
            goto L_0x0153
        L_0x0038:
            java.lang.String r2 = "V_MPEG2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = r6
            goto L_0x0153
        L_0x0043:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 24
            goto L_0x0153
        L_0x004f:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 7
            goto L_0x0153
        L_0x005a:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 23
            goto L_0x0153
        L_0x0066:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 19
            goto L_0x0153
        L_0x0072:
            java.lang.String r2 = "V_THEORA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 9
            goto L_0x0153
        L_0x007e:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 26
            goto L_0x0153
        L_0x008a:
            java.lang.String r2 = "V_VP9"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = r7
            goto L_0x0153
        L_0x0095:
            java.lang.String r2 = "V_VP8"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = r8
            goto L_0x0153
        L_0x00a0:
            java.lang.String r2 = "A_DTS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 18
            goto L_0x0153
        L_0x00ac:
            java.lang.String r2 = "A_AC3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 15
            goto L_0x0153
        L_0x00b8:
            java.lang.String r2 = "A_AAC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 12
            goto L_0x0153
        L_0x00c4:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 20
            goto L_0x0153
        L_0x00d0:
            java.lang.String r2 = "S_VOBSUB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 25
            goto L_0x0153
        L_0x00dc:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 6
            goto L_0x0153
        L_0x00e7:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = r4
            goto L_0x0153
        L_0x00f2:
            java.lang.String r2 = "S_DVBSUB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 27
            goto L_0x0153
        L_0x00fd:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = r5
            goto L_0x0153
        L_0x0107:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 14
            goto L_0x0153
        L_0x0112:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 13
            goto L_0x0153
        L_0x011d:
            java.lang.String r2 = "A_VORBIS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 10
            goto L_0x0153
        L_0x0128:
            java.lang.String r2 = "A_TRUEHD"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 17
            goto L_0x0153
        L_0x0133:
            java.lang.String r2 = "A_MS/ACM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 22
            goto L_0x0153
        L_0x013e:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = r9
            goto L_0x0153
        L_0x0148:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 5
            goto L_0x0153
        L_0x0152:
            r1 = -1
        L_0x0153:
            java.lang.String r2 = ". Setting mimeType to audio/x-unknown"
            r11 = 75
            java.lang.String r12 = "audio/raw"
            java.lang.String r13 = "application/dvbsubs"
            java.lang.String r14 = "application/pgs"
            java.lang.String r15 = "application/vobsub"
            java.lang.String r3 = "application/x-subrip"
            r16 = 4096(0x1000, float:5.74E-42)
            java.lang.String r17 = "video/x-unknown"
            java.lang.String r18 = "audio/x-unknown"
            java.lang.String r10 = "MatroskaExtractor"
            r19 = 0
            switch(r1) {
                case 0: goto L_0x02c5;
                case 1: goto L_0x02c2;
                case 2: goto L_0x02bf;
                case 3: goto L_0x02b1;
                case 4: goto L_0x02b1;
                case 5: goto L_0x02b1;
                case 6: goto L_0x029c;
                case 7: goto L_0x0288;
                case 8: goto L_0x0270;
                case 9: goto L_0x026d;
                case 10: goto L_0x025e;
                case 11: goto L_0x021d;
                case 12: goto L_0x0213;
                case 13: goto L_0x020c;
                case 14: goto L_0x0209;
                case 15: goto L_0x0205;
                case 16: goto L_0x0201;
                case 17: goto L_0x01fd;
                case 18: goto L_0x01f9;
                case 19: goto L_0x01f9;
                case 20: goto L_0x01f5;
                case 21: goto L_0x01eb;
                case 22: goto L_0x01c5;
                case 23: goto L_0x01a0;
                case 24: goto L_0x019d;
                case 25: goto L_0x0194;
                case 26: goto L_0x0191;
                case 27: goto L_0x0176;
                default: goto L_0x016e;
            }
        L_0x016e:
            com.google.android.gms.internal.ads.af r1 = new com.google.android.gms.internal.ads.af
            java.lang.String r2 = "Unrecognized codec identifier."
            r1.<init>(r2)
            throw r1
        L_0x0176:
            byte[] r1 = new byte[r4]
            byte[] r2 = r0.f15580h
            byte r4 = r2[r8]
            r1[r8] = r4
            byte r4 = r2[r7]
            r1[r7] = r4
            byte r4 = r2[r6]
            r1[r6] = r4
            byte r2 = r2[r9]
            r1[r9] = r2
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r12 = r13
            goto L_0x02c9
        L_0x0191:
            r12 = r14
            goto L_0x02c7
        L_0x0194:
            byte[] r1 = r0.f15580h
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r12 = r15
            goto L_0x02c9
        L_0x019d:
            r12 = r3
            goto L_0x02c7
        L_0x01a0:
            int r1 = r0.f15564H
            int r1 = com.google.android.gms.internal.ads.C2449zm.m20729h(r1)
            if (r1 != 0) goto L_0x01bf
            int r1 = r0.f15564H
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r11)
        L_0x01af:
            java.lang.String r5 = "Unsupported PCM bit depth: "
            r4.append(r5)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            goto L_0x01e4
        L_0x01bf:
            r27 = r1
            r1 = r19
            goto L_0x02cb
        L_0x01c5:
            com.google.android.gms.internal.ads.rm r1 = new com.google.android.gms.internal.ads.rm
            byte[] r4 = r0.f15580h
            r1.<init>((byte[]) r4)
            boolean r1 = m17902e(r1)
            if (r1 == 0) goto L_0x01e2
            int r1 = r0.f15564H
            int r1 = com.google.android.gms.internal.ads.C2449zm.m20729h(r1)
            if (r1 != 0) goto L_0x01bf
            int r1 = r0.f15564H
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r11)
            goto L_0x01af
        L_0x01e2:
            java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"
        L_0x01e4:
            android.util.Log.w(r10, r1)
            r12 = r18
            goto L_0x02c7
        L_0x01eb:
            byte[] r1 = r0.f15580h
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r12 = "audio/x-flac"
            goto L_0x02c9
        L_0x01f5:
            java.lang.String r12 = "audio/vnd.dts.hd"
            goto L_0x02c7
        L_0x01f9:
            java.lang.String r12 = "audio/vnd.dts"
            goto L_0x02c7
        L_0x01fd:
            java.lang.String r12 = "audio/true-hd"
            goto L_0x02c7
        L_0x0201:
            java.lang.String r12 = "audio/eac3"
            goto L_0x02c7
        L_0x0205:
            java.lang.String r12 = "audio/ac3"
            goto L_0x02c7
        L_0x0209:
            java.lang.String r12 = "audio/mpeg"
            goto L_0x020e
        L_0x020c:
            java.lang.String r12 = "audio/mpeg-L2"
        L_0x020e:
            r32 = r16
            r1 = r19
            goto L_0x026a
        L_0x0213:
            byte[] r1 = r0.f15580h
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r12 = "audio/mp4a-latm"
            goto L_0x02c9
        L_0x021d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r9)
            byte[] r2 = r0.f15580h
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r5)
            java.nio.ByteOrder r4 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r4)
            long r10 = r0.f15566J
            java.nio.ByteBuffer r2 = r2.putLong(r10)
            byte[] r2 = r2.array()
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r5)
            java.nio.ByteOrder r4 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r4)
            long r4 = r0.f15567K
            java.nio.ByteBuffer r2 = r2.putLong(r4)
            byte[] r2 = r2.array()
            r1.add(r2)
            r16 = 5760(0x1680, float:8.071E-42)
            java.lang.String r12 = "audio/opus"
            goto L_0x0268
        L_0x025e:
            byte[] r1 = r0.f15580h
            java.util.List r1 = m17901d(r1)
            r16 = 8192(0x2000, float:1.14794E-41)
            java.lang.String r12 = "audio/vorbis"
        L_0x0268:
            r32 = r16
        L_0x026a:
            r27 = -1
            goto L_0x02cd
        L_0x026d:
            r12 = r17
            goto L_0x02c7
        L_0x0270:
            com.google.android.gms.internal.ads.rm r1 = new com.google.android.gms.internal.ads.rm
            byte[] r2 = r0.f15580h
            r1.<init>((byte[]) r2)
            java.util.List r1 = m17900c(r1)
            if (r1 == 0) goto L_0x0280
            java.lang.String r12 = "video/wvc1"
            goto L_0x02c9
        L_0x0280:
            java.lang.String r2 = "Unsupported FourCC. Setting mimeType to video/x-unknown"
            android.util.Log.w(r10, r2)
            r12 = r17
            goto L_0x02c9
        L_0x0288:
            com.google.android.gms.internal.ads.rm r1 = new com.google.android.gms.internal.ads.rm
            byte[] r2 = r0.f15580h
            r1.<init>((byte[]) r2)
            com.google.android.gms.internal.ads.gn r1 = com.google.android.gms.internal.ads.C1746gn.m9842a(r1)
            java.util.List<byte[]> r2 = r1.f7531a
            int r1 = r1.f7532b
            r0.f15572P = r1
            java.lang.String r12 = "video/hevc"
            goto L_0x02af
        L_0x029c:
            com.google.android.gms.internal.ads.rm r1 = new com.google.android.gms.internal.ads.rm
            byte[] r2 = r0.f15580h
            r1.<init>((byte[]) r2)
            com.google.android.gms.internal.ads.an r1 = com.google.android.gms.internal.ads.C1523an.m6121a(r1)
            java.util.List<byte[]> r2 = r1.f4250a
            int r1 = r1.f4251b
            r0.f15572P = r1
            java.lang.String r12 = "video/avc"
        L_0x02af:
            r1 = r2
            goto L_0x02c9
        L_0x02b1:
            byte[] r1 = r0.f15580h
            if (r1 != 0) goto L_0x02b8
            r1 = r19
            goto L_0x02bc
        L_0x02b8:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x02bc:
            java.lang.String r12 = "video/mp4v-es"
            goto L_0x02c9
        L_0x02bf:
            java.lang.String r12 = "video/mpeg2"
            goto L_0x02c7
        L_0x02c2:
            java.lang.String r12 = "video/x-vnd.on2.vp9"
            goto L_0x02c7
        L_0x02c5:
            java.lang.String r12 = "video/x-vnd.on2.vp8"
        L_0x02c7:
            r1 = r19
        L_0x02c9:
            r27 = -1
        L_0x02cb:
            r32 = -1
        L_0x02cd:
            boolean r2 = r0.f15569M
            boolean r4 = r0.f15568L
            if (r7 == r4) goto L_0x02d5
            r4 = r8
            goto L_0x02d6
        L_0x02d5:
            r4 = r6
        L_0x02d6:
            r2 = r2 | r4
            boolean r4 = com.google.android.gms.internal.ads.C2041om.m14519a(r12)
            if (r4 == 0) goto L_0x030a
            java.lang.String r20 = java.lang.Integer.toString(r45)
            r22 = 0
            r23 = -1
            int r3 = r0.f15563G
            int r4 = r0.f15565I
            r28 = -1
            r29 = -1
            com.google.android.gms.internal.ads.yg r5 = r0.f15581i
            java.lang.String r6 = r0.f15570N
            r34 = 0
            r21 = r12
            r24 = r32
            r25 = r3
            r26 = r4
            r30 = r1
            r31 = r5
            r32 = r2
            r33 = r6
            com.google.android.gms.internal.ads.xe r1 = com.google.android.gms.internal.ads.C2367xe.m19466i(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r6 = r7
            goto L_0x048f
        L_0x030a:
            boolean r4 = com.google.android.gms.internal.ads.C2041om.m14520b(r12)
            if (r4 == 0) goto L_0x0430
            int r2 = r0.f15586n
            if (r2 != 0) goto L_0x0326
            int r2 = r0.f15584l
            r3 = -1
            if (r2 != r3) goto L_0x031b
            int r2 = r0.f15582j
        L_0x031b:
            r0.f15584l = r2
            int r2 = r0.f15585m
            if (r2 != r3) goto L_0x0323
            int r2 = r0.f15583k
        L_0x0323:
            r0.f15585m = r2
            goto L_0x0327
        L_0x0326:
            r3 = -1
        L_0x0327:
            int r2 = r0.f15584l
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == r3) goto L_0x033d
            int r5 = r0.f15585m
            if (r5 == r3) goto L_0x033d
            int r3 = r0.f15583k
            int r3 = r3 * r2
            float r2 = (float) r3
            int r3 = r0.f15582j
            int r3 = r3 * r5
            float r3 = (float) r3
            float r2 = r2 / r3
            r38 = r2
            goto L_0x033f
        L_0x033d:
            r38 = r4
        L_0x033f:
            boolean r2 = r0.f15589q
            if (r2 == 0) goto L_0x0405
            float r2 = r0.f15595w
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x03f5
            float r2 = r0.f15596x
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x03f5
            float r2 = r0.f15597y
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x03f5
            float r2 = r0.f15598z
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x03f5
            float r2 = r0.f15557A
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x03f5
            float r2 = r0.f15558B
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x03f5
            float r2 = r0.f15559C
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x03f5
            float r2 = r0.f15560D
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x03f5
            float r2 = r0.f15561E
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x03f5
            float r2 = r0.f15562F
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0380
            goto L_0x03f5
        L_0x0380:
            r2 = 25
            byte[] r2 = new byte[r2]
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r2)
            r3.put(r8)
            float r4 = r0.f15595w
            r5 = 1195593728(0x47435000, float:50000.0)
            float r4 = r4 * r5
            r7 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r7
            int r4 = (int) r4
            short r4 = (short) r4
            r3.putShort(r4)
            float r4 = r0.f15596x
            float r4 = r4 * r5
            float r4 = r4 + r7
            int r4 = (int) r4
            short r4 = (short) r4
            r3.putShort(r4)
            float r4 = r0.f15597y
            float r4 = r4 * r5
            float r4 = r4 + r7
            int r4 = (int) r4
            short r4 = (short) r4
            r3.putShort(r4)
            float r4 = r0.f15598z
            float r4 = r4 * r5
            float r4 = r4 + r7
            int r4 = (int) r4
            short r4 = (short) r4
            r3.putShort(r4)
            float r4 = r0.f15557A
            float r4 = r4 * r5
            float r4 = r4 + r7
            int r4 = (int) r4
            short r4 = (short) r4
            r3.putShort(r4)
            float r4 = r0.f15558B
            float r4 = r4 * r5
            float r4 = r4 + r7
            int r4 = (int) r4
            short r4 = (short) r4
            r3.putShort(r4)
            float r4 = r0.f15559C
            float r4 = r4 * r5
            float r4 = r4 + r7
            int r4 = (int) r4
            short r4 = (short) r4
            r3.putShort(r4)
            float r4 = r0.f15560D
            float r4 = r4 * r5
            float r4 = r4 + r7
            int r4 = (int) r4
            short r4 = (short) r4
            r3.putShort(r4)
            float r4 = r0.f15561E
            float r4 = r4 + r7
            int r4 = (int) r4
            short r4 = (short) r4
            r3.putShort(r4)
            float r4 = r0.f15562F
            float r4 = r4 + r7
            int r4 = (int) r4
            short r4 = (short) r4
            r3.putShort(r4)
            int r4 = r0.f15593u
            short r4 = (short) r4
            r3.putShort(r4)
            int r4 = r0.f15594v
            short r4 = (short) r4
            r3.putShort(r4)
            goto L_0x03f7
        L_0x03f5:
            r2 = r19
        L_0x03f7:
            com.google.android.gms.internal.ads.cn r3 = new com.google.android.gms.internal.ads.cn
            int r4 = r0.f15590r
            int r5 = r0.f15592t
            int r7 = r0.f15591s
            r3.<init>(r4, r5, r7, r2)
            r41 = r3
            goto L_0x0407
        L_0x0405:
            r41 = r19
        L_0x0407:
            java.lang.String r28 = java.lang.Integer.toString(r45)
            r30 = 0
            r31 = -1
            int r2 = r0.f15582j
            int r3 = r0.f15583k
            r35 = -1082130432(0xffffffffbf800000, float:-1.0)
            r37 = -1
            byte[] r4 = r0.f15587o
            int r5 = r0.f15588p
            com.google.android.gms.internal.ads.yg r7 = r0.f15581i
            r29 = r12
            r33 = r2
            r34 = r3
            r36 = r1
            r39 = r4
            r40 = r5
            r42 = r7
            com.google.android.gms.internal.ads.xe r1 = com.google.android.gms.internal.ads.C2367xe.m19470m(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            goto L_0x048f
        L_0x0430:
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x045b
            java.lang.String r28 = java.lang.Integer.toString(r45)
            r30 = 0
            r31 = -1
            java.lang.String r1 = r0.f15570N
            r34 = -1
            com.google.android.gms.internal.ads.yg r3 = r0.f15581i
            r36 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List r38 = java.util.Collections.emptyList()
            r29 = r12
            r32 = r2
            r33 = r1
            r35 = r3
            com.google.android.gms.internal.ads.xe r1 = com.google.android.gms.internal.ads.C2367xe.m19469l(r28, r29, r30, r31, r32, r33, r34, r35, r36, r38)
        L_0x0459:
            r6 = r9
            goto L_0x048f
        L_0x045b:
            boolean r2 = r15.equals(r12)
            if (r2 != 0) goto L_0x0476
            boolean r2 = r14.equals(r12)
            if (r2 != 0) goto L_0x0476
            boolean r2 = r13.equals(r12)
            if (r2 == 0) goto L_0x046e
            goto L_0x0476
        L_0x046e:
            com.google.android.gms.internal.ads.af r1 = new com.google.android.gms.internal.ads.af
            java.lang.String r2 = "Unexpected MIME type."
            r1.<init>(r2)
            throw r1
        L_0x0476:
            java.lang.String r20 = java.lang.Integer.toString(r45)
            r22 = 0
            r23 = -1
            java.lang.String r2 = r0.f15570N
            com.google.android.gms.internal.ads.yg r3 = r0.f15581i
            r21 = r12
            r24 = r1
            r25 = r2
            r26 = r3
            com.google.android.gms.internal.ads.xe r1 = com.google.android.gms.internal.ads.C2367xe.m19467j(r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0459
        L_0x048f:
            int r2 = r0.f15574b
            r3 = r44
            com.google.android.gms.internal.ads.lh r2 = r3.mo6476c(r2, r6)
            r0.f15571O = r2
            r2.mo8952b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2258uh.mo11222b(com.google.android.gms.internal.ads.dh, int):void");
    }
}
