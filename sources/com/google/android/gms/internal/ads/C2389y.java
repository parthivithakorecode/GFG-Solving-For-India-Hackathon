package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.google.android.gms.internal.ads.y */
final class C2389y {

    /* renamed from: A */
    public int f17476A = -1;

    /* renamed from: B */
    public int f17477B = 1000;

    /* renamed from: C */
    public int f17478C = 200;

    /* renamed from: D */
    public float f17479D = -1.0f;

    /* renamed from: E */
    public float f17480E = -1.0f;

    /* renamed from: F */
    public float f17481F = -1.0f;

    /* renamed from: G */
    public float f17482G = -1.0f;

    /* renamed from: H */
    public float f17483H = -1.0f;

    /* renamed from: I */
    public float f17484I = -1.0f;

    /* renamed from: J */
    public float f17485J = -1.0f;

    /* renamed from: K */
    public float f17486K = -1.0f;

    /* renamed from: L */
    public float f17487L = -1.0f;

    /* renamed from: M */
    public float f17488M = -1.0f;

    /* renamed from: N */
    public byte[] f17489N;

    /* renamed from: O */
    public int f17490O = 1;

    /* renamed from: P */
    public int f17491P = -1;

    /* renamed from: Q */
    public int f17492Q = 8000;

    /* renamed from: R */
    public long f17493R = 0;

    /* renamed from: S */
    public long f17494S = 0;

    /* renamed from: T */
    public C2426z f17495T;

    /* renamed from: U */
    public boolean f17496U;

    /* renamed from: V */
    public boolean f17497V = true;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public String f17498W = "eng";

    /* renamed from: X */
    public td4 f17499X;

    /* renamed from: Y */
    public int f17500Y;

    /* renamed from: a */
    public String f17501a;

    /* renamed from: b */
    public String f17502b;

    /* renamed from: c */
    public int f17503c;

    /* renamed from: d */
    public int f17504d;

    /* renamed from: e */
    public int f17505e;

    /* renamed from: f */
    public int f17506f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f17507g;

    /* renamed from: h */
    public boolean f17508h;

    /* renamed from: i */
    public byte[] f17509i;

    /* renamed from: j */
    public sd4 f17510j;

    /* renamed from: k */
    public byte[] f17511k;

    /* renamed from: l */
    public u74 f17512l;

    /* renamed from: m */
    public int f17513m = -1;

    /* renamed from: n */
    public int f17514n = -1;

    /* renamed from: o */
    public int f17515o = -1;

    /* renamed from: p */
    public int f17516p = -1;

    /* renamed from: q */
    public int f17517q = 0;

    /* renamed from: r */
    public int f17518r = -1;

    /* renamed from: s */
    public float f17519s = 0.0f;

    /* renamed from: t */
    public float f17520t = 0.0f;

    /* renamed from: u */
    public float f17521u = 0.0f;

    /* renamed from: v */
    public byte[] f17522v = null;

    /* renamed from: w */
    public int f17523w = -1;

    /* renamed from: x */
    public boolean f17524x = false;

    /* renamed from: y */
    public int f17525y = -1;

    /* renamed from: z */
    public int f17526z = -1;

    private C2389y() {
    }

    /* synthetic */ C2389y(C2352x xVar) {
    }

    /* renamed from: f */
    private static Pair<String, List<byte[]>> m19779f(dr2 dr2) {
        try {
            dr2.mo6581g(16);
            long y = dr2.mo6599y();
            if (y == 1482049860) {
                return new Pair<>("video/divx", (Object) null);
            }
            if (y == 859189832) {
                return new Pair<>("video/3gpp", (Object) null);
            }
            if (y == 826496599) {
                int k = dr2.mo6585k() + 20;
                byte[] h = dr2.mo6582h();
                while (true) {
                    int length = h.length;
                    if (k >= length - 4) {
                        throw C1646dz.m8223a("Failed to find FourCC VC1 initialization data", (Throwable) null);
                    } else if (h[k] == 0 && h[k + 1] == 0 && h[k + 2] == 1 && h[k + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(h, k, length)));
                    } else {
                        k++;
                    }
                }
            } else {
                Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", (Object) null);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw C1646dz.m8223a("Error parsing FourCC private data", (Throwable) null);
        }
    }

    /* renamed from: g */
    private static List<byte[]> m19780g(byte[] bArr) {
        byte b;
        byte b2;
        try {
            if (bArr[0] == 2) {
                int i = 0;
                int i2 = 1;
                while (true) {
                    b = bArr[i2] & 255;
                    if (b != 255) {
                        break;
                    }
                    i += 255;
                    i2++;
                }
                int i3 = i2 + 1;
                int i4 = i + b;
                int i5 = 0;
                while (true) {
                    b2 = bArr[i3] & 255;
                    if (b2 != 255) {
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
                        throw C1646dz.m8223a("Error parsing vorbis codec private", (Throwable) null);
                    }
                    throw C1646dz.m8223a("Error parsing vorbis codec private", (Throwable) null);
                }
                throw C1646dz.m8223a("Error parsing vorbis codec private", (Throwable) null);
            }
            throw C1646dz.m8223a("Error parsing vorbis codec private", (Throwable) null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw C1646dz.m8223a("Error parsing vorbis codec private", (Throwable) null);
        }
    }

    /* renamed from: h */
    private static boolean m19781h(dr2 dr2) {
        try {
            int q = dr2.mo6591q();
            if (q == 1) {
                return true;
            }
            if (q == 65534) {
                dr2.mo6580f(24);
                return dr2.mo6600z() == C1500a0.f3820f0.getMostSignificantBits() && dr2.mo6600z() == C1500a0.f3820f0.getLeastSignificantBits();
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw C1646dz.m8223a("Error parsing MS/ACM codec private", (Throwable) null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    /* renamed from: i */
    private final byte[] m19782i(String str) {
        byte[] bArr = this.f17511k;
        if (bArr != null) {
            return bArr;
        }
        String valueOf = String.valueOf(str);
        throw C1646dz.m8223a(valueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(valueOf) : new String("Missing CodecPrivate for codec "), (Throwable) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v16, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x020f, code lost:
        r2.append(r4);
        r2.append(r1);
        r2.append(". Setting mimeType to audio/x-unknown");
        r1 = r2.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x021d, code lost:
        r10 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x021e, code lost:
        r1 = null;
        r2 = null;
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0248, code lost:
        android.util.Log.w("MatroskaExtractor", r1);
        r17 = "audio/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x027b, code lost:
        r3 = 4096;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02e6, code lost:
        r3 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02e8, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0335, code lost:
        r3 = -1;
        r10 = -1;
        r19 = r2;
        r2 = r1;
        r1 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0355, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0356, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0357, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0358, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0359, code lost:
        r7 = r0.f17489N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x035b, code lost:
        if (r7 == null) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x035d, code lost:
        r7 = com.google.android.gms.internal.ads.lc4.m12688a(new com.google.android.gms.internal.ads.dr2(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0366, code lost:
        if (r7 == null) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0368, code lost:
        r2 = r7.f10007a;
        r17 = "video/dolby-vision";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x036c, code lost:
        r7 = r17;
        r11 = r0.f17497V;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0372, code lost:
        if (true == r0.f17496U) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0374, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0376, code lost:
        r12 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0377, code lost:
        r11 = r11 | r12;
        r12 = new com.google.android.gms.internal.ads.bf4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0381, code lost:
        if (com.google.android.gms.internal.ads.C1645dy.m8170g(r7) == false) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0383, code lost:
        r12.mo5825e0(r0.f17490O);
        r12.mo5843t(r0.f17492Q);
        r12.mo5837n(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0396, code lost:
        if (com.google.android.gms.internal.ads.C1645dy.m8171h(r7) == false) goto L_0x0520;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x039a, code lost:
        if (r0.f17517q != 0) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x039c, code lost:
        r4 = r0.f17515o;
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x039f, code lost:
        if (r4 != -1) goto L_0x03a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03a1, code lost:
        r4 = r0.f17513m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03a3, code lost:
        r0.f17515o = r4;
        r4 = r0.f17516p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03a7, code lost:
        if (r4 != -1) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03a9, code lost:
        r4 = r0.f17514n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03ab, code lost:
        r0.f17516p = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03ae, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03af, code lost:
        r4 = r0.f17515o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03b3, code lost:
        if (r4 == r5) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03b5, code lost:
        r10 = r0.f17516p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03b7, code lost:
        if (r10 == r5) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03b9, code lost:
        r4 = ((float) (r0.f17514n * r4)) / ((float) (r0.f17513m * r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03c3, code lost:
        r4 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03c6, code lost:
        if (r0.f17524x == false) goto L_0x048f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03cc, code lost:
        if (r0.f17479D == -1.0f) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03d2, code lost:
        if (r0.f17480E == -1.0f) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03d8, code lost:
        if (r0.f17481F == -1.0f) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03de, code lost:
        if (r0.f17482G == -1.0f) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03e4, code lost:
        if (r0.f17483H == -1.0f) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03ea, code lost:
        if (r0.f17484I == -1.0f) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x03f0, code lost:
        if (r0.f17485J == -1.0f) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x03f6, code lost:
        if (r0.f17486K == -1.0f) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03fc, code lost:
        if (r0.f17487L == -1.0f) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0402, code lost:
        if (r0.f17488M != -1.0f) goto L_0x0406;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0406, code lost:
        r6 = new byte[25];
        r8 = java.nio.ByteBuffer.wrap(r6).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r8.put((byte) 0);
        r8.putShort((short) ((int) ((r0.f17479D * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.f17480E * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.f17481F * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.f17482G * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.f17483H * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.f17484I * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.f17485J * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.f17486K * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) (r0.f17487L + 0.5f)));
        r8.putShort((short) ((int) (r0.f17488M + 0.5f)));
        r8.putShort((short) r0.f17477B);
        r8.putShort((short) r0.f17478C);
        r8 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0482, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0483, code lost:
        r6 = new com.google.android.gms.internal.ads.p14(r0.f17525y, r0.f17476A, r0.f17526z, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x048f, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0492, code lost:
        if (r0.f17501a == null) goto L_0x04b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x049e, code lost:
        if (com.google.android.gms.internal.ads.C1500a0.f3821g0.containsKey(r0.f17501a) == false) goto L_0x04b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04a0, code lost:
        r5 = ((java.lang.Integer) com.google.android.gms.internal.ads.C1500a0.f3821g0.get(r0.f17501a)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04b2, code lost:
        if (r0.f17518r != 0) goto L_0x0500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04bb, code lost:
        if (java.lang.Float.compare(r0.f17519s, 0.0f) != 0) goto L_0x0500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04c3, code lost:
        if (java.lang.Float.compare(r0.f17520t, 0.0f) != 0) goto L_0x0500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04cb, code lost:
        if (java.lang.Float.compare(r0.f17521u, 0.0f) != 0) goto L_0x04ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04d6, code lost:
        if (java.lang.Float.compare(r0.f17520t, 90.0f) != 0) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04d8, code lost:
        r9 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04e3, code lost:
        if (java.lang.Float.compare(r0.f17520t, -180.0f) == 0) goto L_0x04fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04ed, code lost:
        if (java.lang.Float.compare(r0.f17520t, 180.0f) != 0) goto L_0x04f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04f8, code lost:
        if (java.lang.Float.compare(r0.f17520t, -90.0f) != 0) goto L_0x0500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04fa, code lost:
        r9 = 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04fd, code lost:
        r9 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0500, code lost:
        r9 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0501, code lost:
        r12.mo5847x(r0.f17513m);
        r12.mo5826f(r0.f17514n);
        r12.mo5839p(r4);
        r12.mo5841r(r9);
        r12.mo5840q(r0.f17522v);
        r12.mo5845v(r0.f17523w);
        r12.mo5829g0(r6);
        r5 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0524, code lost:
        if ("application/x-subrip".equals(r7) != false) goto L_0x0549;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x052a, code lost:
        if ("text/x-ssa".equals(r7) != false) goto L_0x0549;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0530, code lost:
        if ("application/vobsub".equals(r7) != false) goto L_0x0549;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0536, code lost:
        if ("application/pgs".equals(r7) != false) goto L_0x0549;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x053e, code lost:
        if ("application/dvbsubs".equals(r7) == false) goto L_0x0541;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0548, code lost:
        throw com.google.android.gms.internal.ads.C1646dz.m8223a("Unexpected MIME type.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0549, code lost:
        r5 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x054c, code lost:
        if (r0.f17501a == null) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0558, code lost:
        if (com.google.android.gms.internal.ads.C1500a0.f3821g0.containsKey(r0.f17501a) != false) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x055a, code lost:
        r12.mo5833j(r0.f17501a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x055f, code lost:
        r12.mo5828g(r22);
        r12.mo5842s(r7);
        r12.mo5835l(r3);
        r12.mo5834k(r0.f17498W);
        r12.mo5844u(r11);
        r12.mo5832i(r1);
        r12.mo5827f0(r2);
        r12.mo5819b(r0.f17512l);
        r1 = r12.mo5848y();
        r2 = r21.mo10270r(r0.f17503c, r5);
        r0.f17499X = r2;
        r2.mo7873b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x058e, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11946e(com.google.android.gms.internal.ads.rc4 r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            java.lang.String r1 = r0.f17502b
            int r2 = r1.hashCode()
            r4 = 16
            r5 = 1
            r7 = 8
            r8 = 4
            r9 = 0
            r10 = 3
            switch(r2) {
                case -2095576542: goto L_0x0178;
                case -2095575984: goto L_0x016e;
                case -1985379776: goto L_0x0163;
                case -1784763192: goto L_0x0158;
                case -1730367663: goto L_0x014d;
                case -1482641358: goto L_0x0142;
                case -1482641357: goto L_0x0137;
                case -1373388978: goto L_0x012c;
                case -933872740: goto L_0x0121;
                case -538363189: goto L_0x0116;
                case -538363109: goto L_0x010b;
                case -425012669: goto L_0x00ff;
                case -356037306: goto L_0x00f3;
                case 62923557: goto L_0x00e7;
                case 62923603: goto L_0x00dc;
                case 62927045: goto L_0x00d0;
                case 82318131: goto L_0x00c5;
                case 82338133: goto L_0x00ba;
                case 82338134: goto L_0x00af;
                case 99146302: goto L_0x00a3;
                case 444813526: goto L_0x0097;
                case 542569478: goto L_0x008b;
                case 635596514: goto L_0x007f;
                case 725948237: goto L_0x0073;
                case 725957860: goto L_0x0067;
                case 738597099: goto L_0x005b;
                case 855502857: goto L_0x0050;
                case 1422270023: goto L_0x0044;
                case 1809237540: goto L_0x0039;
                case 1950749482: goto L_0x002d;
                case 1950789798: goto L_0x0021;
                case 1951062397: goto L_0x0015;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0182
        L_0x0015:
            java.lang.String r2 = "A_OPUS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 12
            goto L_0x0183
        L_0x0021:
            java.lang.String r2 = "A_FLAC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 22
            goto L_0x0183
        L_0x002d:
            java.lang.String r2 = "A_EAC3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 17
            goto L_0x0183
        L_0x0039:
            java.lang.String r2 = "V_MPEG2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = r10
            goto L_0x0183
        L_0x0044:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 27
            goto L_0x0183
        L_0x0050:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = r7
            goto L_0x0183
        L_0x005b:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 28
            goto L_0x0183
        L_0x0067:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 24
            goto L_0x0183
        L_0x0073:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 25
            goto L_0x0183
        L_0x007f:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 26
            goto L_0x0183
        L_0x008b:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 20
            goto L_0x0183
        L_0x0097:
            java.lang.String r2 = "V_THEORA"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 10
            goto L_0x0183
        L_0x00a3:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 30
            goto L_0x0183
        L_0x00af:
            java.lang.String r2 = "V_VP9"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = r5
            goto L_0x0183
        L_0x00ba:
            java.lang.String r2 = "V_VP8"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = r9
            goto L_0x0183
        L_0x00c5:
            java.lang.String r2 = "V_AV1"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 2
            goto L_0x0183
        L_0x00d0:
            java.lang.String r2 = "A_DTS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 19
            goto L_0x0183
        L_0x00dc:
            java.lang.String r2 = "A_AC3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = r4
            goto L_0x0183
        L_0x00e7:
            java.lang.String r2 = "A_AAC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 13
            goto L_0x0183
        L_0x00f3:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 21
            goto L_0x0183
        L_0x00ff:
            java.lang.String r2 = "S_VOBSUB"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 29
            goto L_0x0183
        L_0x010b:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 7
            goto L_0x0183
        L_0x0116:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 5
            goto L_0x0183
        L_0x0121:
            java.lang.String r2 = "S_DVBSUB"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 31
            goto L_0x0183
        L_0x012c:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 9
            goto L_0x0183
        L_0x0137:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 15
            goto L_0x0183
        L_0x0142:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 14
            goto L_0x0183
        L_0x014d:
            java.lang.String r2 = "A_VORBIS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 11
            goto L_0x0183
        L_0x0158:
            java.lang.String r2 = "A_TRUEHD"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 18
            goto L_0x0183
        L_0x0163:
            java.lang.String r2 = "A_MS/ACM"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 23
            goto L_0x0183
        L_0x016e:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = r8
            goto L_0x0183
        L_0x0178:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0182
            r2 = 6
            goto L_0x0183
        L_0x0182:
            r2 = -1
        L_0x0183:
            java.lang.String r12 = ". Setting mimeType to audio/x-unknown"
            java.lang.String r13 = "application/pgs"
            java.lang.String r14 = "application/vobsub"
            java.lang.String r15 = "text/x-ssa"
            java.lang.String r6 = "application/x-subrip"
            r16 = 4096(0x1000, float:5.74E-42)
            java.lang.String r17 = "audio/raw"
            java.lang.String r18 = "audio/x-unknown"
            java.lang.String r3 = "MatroskaExtractor"
            switch(r2) {
                case 0: goto L_0x0353;
                case 1: goto L_0x0350;
                case 2: goto L_0x034d;
                case 3: goto L_0x034a;
                case 4: goto L_0x033d;
                case 5: goto L_0x033d;
                case 6: goto L_0x033d;
                case 7: goto L_0x031e;
                case 8: goto L_0x0306;
                case 9: goto L_0x02ee;
                case 10: goto L_0x02eb;
                case 11: goto L_0x02da;
                case 12: goto L_0x029b;
                case 13: goto L_0x027f;
                case 14: goto L_0x0279;
                case 15: goto L_0x0276;
                case 16: goto L_0x0272;
                case 17: goto L_0x026e;
                case 18: goto L_0x0263;
                case 19: goto L_0x025f;
                case 20: goto L_0x025f;
                case 21: goto L_0x025b;
                case 22: goto L_0x024f;
                case 23: goto L_0x0223;
                case 24: goto L_0x01fc;
                case 25: goto L_0x01e8;
                case 26: goto L_0x01d7;
                case 27: goto L_0x01d3;
                case 28: goto L_0x01c1;
                case 29: goto L_0x01b5;
                case 30: goto L_0x01b1;
                case 31: goto L_0x01a0;
                default: goto L_0x0198;
            }
        L_0x0198:
            java.lang.String r1 = "Unrecognized codec identifier."
            r2 = 0
            com.google.android.gms.internal.ads.dz r1 = com.google.android.gms.internal.ads.C1646dz.m8223a(r1, r2)
            throw r1
        L_0x01a0:
            byte[] r2 = new byte[r8]
            byte[] r1 = r0.m19782i(r1)
            java.lang.System.arraycopy(r1, r9, r2, r9, r8)
            com.google.android.gms.internal.ads.e73 r1 = com.google.android.gms.internal.ads.e73.m8348w(r2)
            java.lang.String r17 = "application/dvbsubs"
            goto L_0x0356
        L_0x01b1:
            r17 = r13
            goto L_0x0355
        L_0x01b5:
            byte[] r1 = r0.m19782i(r1)
            com.google.android.gms.internal.ads.e73 r1 = com.google.android.gms.internal.ads.e73.m8348w(r1)
            r17 = r14
            goto L_0x0356
        L_0x01c1:
            byte[] r1 = com.google.android.gms.internal.ads.C1500a0.f3818d0
            java.lang.String r2 = r0.f17502b
            byte[] r2 = r0.m19782i(r2)
            com.google.android.gms.internal.ads.e73 r1 = com.google.android.gms.internal.ads.e73.m8349x(r1, r2)
            r17 = r15
            goto L_0x0356
        L_0x01d3:
            r17 = r6
            goto L_0x0355
        L_0x01d7:
            int r1 = r0.f17491P
            r2 = 32
            if (r1 != r2) goto L_0x01de
            goto L_0x021d
        L_0x01de:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 90
            r2.<init>(r4)
            java.lang.String r4 = "Unsupported floating point PCM bit depth: "
            goto L_0x020f
        L_0x01e8:
            int r1 = r0.f17491P
            if (r1 != r7) goto L_0x01ed
            goto L_0x021e
        L_0x01ed:
            if (r1 != r4) goto L_0x01f2
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x021d
        L_0x01f2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 86
            r2.<init>(r4)
            java.lang.String r4 = "Unsupported big endian PCM bit depth: "
            goto L_0x020f
        L_0x01fc:
            int r1 = r0.f17491P
            int r8 = com.google.android.gms.internal.ads.n13.m13613R(r1)
            if (r8 != 0) goto L_0x021d
            int r1 = r0.f17491P
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 89
            r2.<init>(r4)
            java.lang.String r4 = "Unsupported little endian PCM bit depth: "
        L_0x020f:
            r2.append(r4)
            r2.append(r1)
            r2.append(r12)
            java.lang.String r1 = r2.toString()
            goto L_0x0248
        L_0x021d:
            r10 = r8
        L_0x021e:
            r1 = 0
            r2 = 0
            r3 = -1
            goto L_0x0359
        L_0x0223:
            com.google.android.gms.internal.ads.dr2 r2 = new com.google.android.gms.internal.ads.dr2
            byte[] r1 = r0.m19782i(r1)
            r2.<init>((byte[]) r1)
            boolean r1 = m19781h(r2)
            if (r1 == 0) goto L_0x0246
            int r1 = r0.f17491P
            int r8 = com.google.android.gms.internal.ads.n13.m13613R(r1)
            if (r8 != 0) goto L_0x021d
            int r1 = r0.f17491P
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 75
            r2.<init>(r4)
            java.lang.String r4 = "Unsupported PCM bit depth: "
            goto L_0x020f
        L_0x0246:
            java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"
        L_0x0248:
            android.util.Log.w(r3, r1)
            r17 = r18
            goto L_0x0355
        L_0x024f:
            byte[] r1 = r0.m19782i(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r17 = "audio/flac"
            goto L_0x0356
        L_0x025b:
            java.lang.String r17 = "audio/vnd.dts.hd"
            goto L_0x0355
        L_0x025f:
            java.lang.String r17 = "audio/vnd.dts"
            goto L_0x0355
        L_0x0263:
            com.google.android.gms.internal.ads.z r1 = new com.google.android.gms.internal.ads.z
            r1.<init>()
            r0.f17495T = r1
            java.lang.String r17 = "audio/true-hd"
            goto L_0x0355
        L_0x026e:
            java.lang.String r17 = "audio/eac3"
            goto L_0x0355
        L_0x0272:
            java.lang.String r17 = "audio/ac3"
            goto L_0x0355
        L_0x0276:
            java.lang.String r17 = "audio/mpeg"
            goto L_0x027b
        L_0x0279:
            java.lang.String r17 = "audio/mpeg-L2"
        L_0x027b:
            r3 = r16
            r1 = 0
            goto L_0x02e8
        L_0x027f:
            byte[] r1 = r0.m19782i(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            byte[] r2 = r0.f17511k
            com.google.android.gms.internal.ads.pb4 r2 = com.google.android.gms.internal.ads.qb4.m15554a(r2)
            int r3 = r2.f12597a
            r0.f17492Q = r3
            int r3 = r2.f12598b
            r0.f17490O = r3
            java.lang.String r2 = r2.f12599c
            java.lang.String r17 = "audio/mp4a-latm"
            goto L_0x0357
        L_0x029b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r10)
            java.lang.String r2 = r0.f17502b
            byte[] r2 = r0.m19782i(r2)
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r7)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r10 = r0.f17493R
            java.nio.ByteBuffer r2 = r2.putLong(r10)
            byte[] r2 = r2.array()
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r7)
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r10 = r0.f17494S
            java.nio.ByteBuffer r2 = r2.putLong(r10)
            byte[] r2 = r2.array()
            r1.add(r2)
            r16 = 5760(0x1680, float:8.071E-42)
            java.lang.String r17 = "audio/opus"
            goto L_0x02e6
        L_0x02da:
            byte[] r1 = r0.m19782i(r1)
            java.util.List r1 = m19780g(r1)
            r16 = 8192(0x2000, float:1.14794E-41)
            java.lang.String r17 = "audio/vorbis"
        L_0x02e6:
            r3 = r16
        L_0x02e8:
            r2 = 0
            goto L_0x0358
        L_0x02eb:
            java.lang.String r17 = "video/x-unknown"
            goto L_0x0355
        L_0x02ee:
            com.google.android.gms.internal.ads.dr2 r2 = new com.google.android.gms.internal.ads.dr2
            byte[] r1 = r0.m19782i(r1)
            r2.<init>((byte[]) r1)
            android.util.Pair r1 = m19779f(r2)
            java.lang.Object r2 = r1.first
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            java.lang.Object r1 = r1.second
            java.util.List r1 = (java.util.List) r1
            goto L_0x0356
        L_0x0306:
            com.google.android.gms.internal.ads.dr2 r2 = new com.google.android.gms.internal.ads.dr2
            byte[] r1 = r0.m19782i(r1)
            r2.<init>((byte[]) r1)
            com.google.android.gms.internal.ads.gd4 r1 = com.google.android.gms.internal.ads.gd4.m9697a(r2)
            java.util.List<byte[]> r2 = r1.f7379a
            int r3 = r1.f7380b
            r0.f17500Y = r3
            java.lang.String r1 = r1.f7382d
            java.lang.String r17 = "video/hevc"
            goto L_0x0335
        L_0x031e:
            com.google.android.gms.internal.ads.dr2 r2 = new com.google.android.gms.internal.ads.dr2
            byte[] r1 = r0.m19782i(r1)
            r2.<init>((byte[]) r1)
            com.google.android.gms.internal.ads.xb4 r1 = com.google.android.gms.internal.ads.xb4.m19444a(r2)
            java.util.List<byte[]> r2 = r1.f17106a
            int r3 = r1.f17107b
            r0.f17500Y = r3
            java.lang.String r1 = r1.f17111f
            java.lang.String r17 = "video/avc"
        L_0x0335:
            r3 = -1
            r10 = -1
            r19 = r2
            r2 = r1
            r1 = r19
            goto L_0x0359
        L_0x033d:
            byte[] r1 = r0.f17511k
            if (r1 != 0) goto L_0x0343
            r1 = 0
            goto L_0x0347
        L_0x0343:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x0347:
            java.lang.String r17 = "video/mp4v-es"
            goto L_0x0356
        L_0x034a:
            java.lang.String r17 = "video/mpeg2"
            goto L_0x0355
        L_0x034d:
            java.lang.String r17 = "video/av01"
            goto L_0x0355
        L_0x0350:
            java.lang.String r17 = "video/x-vnd.on2.vp9"
            goto L_0x0355
        L_0x0353:
            java.lang.String r17 = "video/x-vnd.on2.vp8"
        L_0x0355:
            r1 = 0
        L_0x0356:
            r2 = 0
        L_0x0357:
            r3 = -1
        L_0x0358:
            r10 = -1
        L_0x0359:
            byte[] r7 = r0.f17489N
            if (r7 == 0) goto L_0x036c
            com.google.android.gms.internal.ads.dr2 r11 = new com.google.android.gms.internal.ads.dr2
            r11.<init>((byte[]) r7)
            com.google.android.gms.internal.ads.lc4 r7 = com.google.android.gms.internal.ads.lc4.m12688a(r11)
            if (r7 == 0) goto L_0x036c
            java.lang.String r2 = r7.f10007a
            java.lang.String r17 = "video/dolby-vision"
        L_0x036c:
            r7 = r17
            boolean r11 = r0.f17497V
            boolean r12 = r0.f17496U
            if (r5 == r12) goto L_0x0376
            r12 = r9
            goto L_0x0377
        L_0x0376:
            r12 = 2
        L_0x0377:
            r11 = r11 | r12
            com.google.android.gms.internal.ads.bf4 r12 = new com.google.android.gms.internal.ads.bf4
            r12.<init>()
            boolean r16 = com.google.android.gms.internal.ads.C1645dy.m8170g(r7)
            if (r16 == 0) goto L_0x0392
            int r4 = r0.f17490O
            r12.mo5825e0(r4)
            int r4 = r0.f17492Q
            r12.mo5843t(r4)
            r12.mo5837n(r10)
            goto L_0x054a
        L_0x0392:
            boolean r5 = com.google.android.gms.internal.ads.C1645dy.m8171h(r7)
            if (r5 == 0) goto L_0x0520
            int r4 = r0.f17517q
            if (r4 != 0) goto L_0x03ae
            int r4 = r0.f17515o
            r5 = -1
            if (r4 != r5) goto L_0x03a3
            int r4 = r0.f17513m
        L_0x03a3:
            r0.f17515o = r4
            int r4 = r0.f17516p
            if (r4 != r5) goto L_0x03ab
            int r4 = r0.f17514n
        L_0x03ab:
            r0.f17516p = r4
            goto L_0x03af
        L_0x03ae:
            r5 = -1
        L_0x03af:
            int r4 = r0.f17515o
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r4 == r5) goto L_0x03c3
            int r10 = r0.f17516p
            if (r10 == r5) goto L_0x03c3
            int r13 = r0.f17514n
            int r13 = r13 * r4
            float r4 = (float) r13
            int r13 = r0.f17513m
            int r13 = r13 * r10
            float r10 = (float) r13
            float r4 = r4 / r10
            goto L_0x03c4
        L_0x03c3:
            r4 = r6
        L_0x03c4:
            boolean r10 = r0.f17524x
            if (r10 == 0) goto L_0x048f
            float r10 = r0.f17479D
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0482
            float r10 = r0.f17480E
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0482
            float r10 = r0.f17481F
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0482
            float r10 = r0.f17482G
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0482
            float r10 = r0.f17483H
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0482
            float r10 = r0.f17484I
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0482
            float r10 = r0.f17485J
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0482
            float r10 = r0.f17486K
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0482
            float r10 = r0.f17487L
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0482
            float r10 = r0.f17488M
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0406
            goto L_0x0482
        L_0x0406:
            r6 = 25
            byte[] r6 = new byte[r6]
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r6)
            java.nio.ByteOrder r10 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r8 = r8.order(r10)
            r8.put(r9)
            float r10 = r0.f17479D
            r13 = 1195593728(0x47435000, float:50000.0)
            float r10 = r10 * r13
            r14 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.f17480E
            float r10 = r10 * r13
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.f17481F
            float r10 = r10 * r13
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.f17482G
            float r10 = r10 * r13
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.f17483H
            float r10 = r10 * r13
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.f17484I
            float r10 = r10 * r13
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.f17485J
            float r10 = r10 * r13
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.f17486K
            float r10 = r10 * r13
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.f17487L
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.f17488M
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            int r10 = r0.f17477B
            short r10 = (short) r10
            r8.putShort(r10)
            int r10 = r0.f17478C
            short r10 = (short) r10
            r8.putShort(r10)
            r8 = r6
            goto L_0x0483
        L_0x0482:
            r8 = 0
        L_0x0483:
            com.google.android.gms.internal.ads.p14 r6 = new com.google.android.gms.internal.ads.p14
            int r10 = r0.f17525y
            int r13 = r0.f17476A
            int r14 = r0.f17526z
            r6.<init>(r10, r13, r14, r8)
            goto L_0x0490
        L_0x048f:
            r6 = 0
        L_0x0490:
            java.lang.String r8 = r0.f17501a
            if (r8 == 0) goto L_0x04b0
            java.util.Map r8 = com.google.android.gms.internal.ads.C1500a0.f3821g0
            java.lang.String r10 = r0.f17501a
            boolean r8 = r8.containsKey(r10)
            if (r8 == 0) goto L_0x04b0
            java.util.Map r5 = com.google.android.gms.internal.ads.C1500a0.f3821g0
            java.lang.String r8 = r0.f17501a
            java.lang.Object r5 = r5.get(r8)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
        L_0x04b0:
            int r8 = r0.f17518r
            if (r8 != 0) goto L_0x0500
            float r8 = r0.f17519s
            r10 = 0
            int r8 = java.lang.Float.compare(r8, r10)
            if (r8 != 0) goto L_0x0500
            float r8 = r0.f17520t
            int r8 = java.lang.Float.compare(r8, r10)
            if (r8 != 0) goto L_0x0500
            float r8 = r0.f17521u
            int r8 = java.lang.Float.compare(r8, r10)
            if (r8 != 0) goto L_0x04ce
            goto L_0x0501
        L_0x04ce:
            float r8 = r0.f17520t
            r9 = 1119092736(0x42b40000, float:90.0)
            int r8 = java.lang.Float.compare(r8, r9)
            if (r8 != 0) goto L_0x04db
            r9 = 90
            goto L_0x0501
        L_0x04db:
            float r8 = r0.f17520t
            r9 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r8 = java.lang.Float.compare(r8, r9)
            if (r8 == 0) goto L_0x04fd
            float r8 = r0.f17520t
            r9 = 1127481344(0x43340000, float:180.0)
            int r8 = java.lang.Float.compare(r8, r9)
            if (r8 != 0) goto L_0x04f0
            goto L_0x04fd
        L_0x04f0:
            float r8 = r0.f17520t
            r9 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r8 = java.lang.Float.compare(r8, r9)
            if (r8 != 0) goto L_0x0500
            r9 = 270(0x10e, float:3.78E-43)
            goto L_0x0501
        L_0x04fd:
            r9 = 180(0xb4, float:2.52E-43)
            goto L_0x0501
        L_0x0500:
            r9 = r5
        L_0x0501:
            int r5 = r0.f17513m
            r12.mo5847x(r5)
            int r5 = r0.f17514n
            r12.mo5826f(r5)
            r12.mo5839p(r4)
            r12.mo5841r(r9)
            byte[] r4 = r0.f17522v
            r12.mo5840q(r4)
            int r4 = r0.f17523w
            r12.mo5845v(r4)
            r12.mo5829g0(r6)
            r5 = 2
            goto L_0x054a
        L_0x0520:
            boolean r5 = r6.equals(r7)
            if (r5 != 0) goto L_0x0549
            boolean r5 = r15.equals(r7)
            if (r5 != 0) goto L_0x0549
            boolean r5 = r14.equals(r7)
            if (r5 != 0) goto L_0x0549
            boolean r5 = r13.equals(r7)
            if (r5 != 0) goto L_0x0549
            java.lang.String r5 = "application/dvbsubs"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x0541
            goto L_0x0549
        L_0x0541:
            java.lang.String r1 = "Unexpected MIME type."
            r2 = 0
            com.google.android.gms.internal.ads.dz r1 = com.google.android.gms.internal.ads.C1646dz.m8223a(r1, r2)
            throw r1
        L_0x0549:
            r5 = 3
        L_0x054a:
            java.lang.String r4 = r0.f17501a
            if (r4 == 0) goto L_0x055f
            java.util.Map r4 = com.google.android.gms.internal.ads.C1500a0.f3821g0
            java.lang.String r6 = r0.f17501a
            boolean r4 = r4.containsKey(r6)
            if (r4 != 0) goto L_0x055f
            java.lang.String r4 = r0.f17501a
            r12.mo5833j(r4)
        L_0x055f:
            r4 = r22
            r12.mo5828g(r4)
            r12.mo5842s(r7)
            r12.mo5835l(r3)
            java.lang.String r3 = r0.f17498W
            r12.mo5834k(r3)
            r12.mo5844u(r11)
            r12.mo5832i(r1)
            r12.mo5827f0(r2)
            com.google.android.gms.internal.ads.u74 r1 = r0.f17512l
            r12.mo5819b(r1)
            com.google.android.gms.internal.ads.c0 r1 = r12.mo5848y()
            int r2 = r0.f17503c
            r3 = r21
            com.google.android.gms.internal.ads.td4 r2 = r3.mo10270r(r2, r5)
            r0.f17499X = r2
            r2.mo7873b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2389y.mo11946e(com.google.android.gms.internal.ads.rc4, int):void");
    }
}
