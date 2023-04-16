package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.google.android.gms.internal.ads.a0 */
public final class C1500a0 implements oc4 {

    /* renamed from: b0 */
    public static final vc4 f3816b0 = C2240u.f15293b;

    /* renamed from: c0 */
    private static final byte[] f3817c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public static final byte[] f3818d0 = n13.m13650w("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: e0 */
    private static final byte[] f3819e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public static final UUID f3820f0 = new UUID(72057594037932032L, -9223371306706625679L);
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public static final Map<String, Integer> f3821g0;

    /* renamed from: A */
    private long f3822A = -9223372036854775807L;

    /* renamed from: B */
    private pd2 f3823B;

    /* renamed from: C */
    private pd2 f3824C;

    /* renamed from: D */
    private boolean f3825D;

    /* renamed from: E */
    private boolean f3826E;

    /* renamed from: F */
    private int f3827F;

    /* renamed from: G */
    private long f3828G;

    /* renamed from: H */
    private long f3829H;

    /* renamed from: I */
    private int f3830I;

    /* renamed from: J */
    private int f3831J;

    /* renamed from: K */
    private int[] f3832K;

    /* renamed from: L */
    private int f3833L;

    /* renamed from: M */
    private int f3834M;

    /* renamed from: N */
    private int f3835N;

    /* renamed from: O */
    private int f3836O;

    /* renamed from: P */
    private boolean f3837P;

    /* renamed from: Q */
    private int f3838Q;

    /* renamed from: R */
    private int f3839R;

    /* renamed from: S */
    private int f3840S;

    /* renamed from: T */
    private boolean f3841T;

    /* renamed from: U */
    private boolean f3842U;

    /* renamed from: V */
    private boolean f3843V;

    /* renamed from: W */
    private int f3844W;

    /* renamed from: X */
    private byte f3845X;

    /* renamed from: Y */
    private boolean f3846Y;

    /* renamed from: Z */
    private rc4 f3847Z;

    /* renamed from: a */
    private final C1611d0 f3848a;

    /* renamed from: a0 */
    private final C2166s f3849a0;

    /* renamed from: b */
    private final SparseArray<C2389y> f3850b;

    /* renamed from: c */
    private final boolean f3851c;

    /* renamed from: d */
    private final dr2 f3852d;

    /* renamed from: e */
    private final dr2 f3853e;

    /* renamed from: f */
    private final dr2 f3854f;

    /* renamed from: g */
    private final dr2 f3855g;

    /* renamed from: h */
    private final dr2 f3856h;

    /* renamed from: i */
    private final dr2 f3857i;

    /* renamed from: j */
    private final dr2 f3858j;

    /* renamed from: k */
    private final dr2 f3859k;

    /* renamed from: l */
    private final dr2 f3860l;

    /* renamed from: m */
    private final dr2 f3861m;

    /* renamed from: n */
    private ByteBuffer f3862n;

    /* renamed from: o */
    private long f3863o;

    /* renamed from: p */
    private long f3864p = -1;

    /* renamed from: q */
    private long f3865q = -9223372036854775807L;

    /* renamed from: r */
    private long f3866r = -9223372036854775807L;

    /* renamed from: s */
    private long f3867s = -9223372036854775807L;

    /* renamed from: t */
    private C2389y f3868t;

    /* renamed from: u */
    private boolean f3869u;

    /* renamed from: v */
    private int f3870v;

    /* renamed from: w */
    private long f3871w;

    /* renamed from: x */
    private boolean f3872x;

    /* renamed from: y */
    private long f3873y = -1;

    /* renamed from: z */
    private long f3874z = -1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f3821g0 = Collections.unmodifiableMap(hashMap);
    }

    public C1500a0(int i) {
        C2166s sVar = new C2166s();
        this.f3849a0 = sVar;
        sVar.mo10692a(new C2314w(this, (C2277v) null));
        this.f3851c = true;
        this.f3848a = new C1611d0();
        this.f3850b = new SparseArray<>();
        this.f3854f = new dr2(4);
        this.f3855g = new dr2(ByteBuffer.allocate(4).putInt(-1).array());
        this.f3856h = new dr2(4);
        this.f3852d = new dr2(th2.f14860a);
        this.f3853e = new dr2(4);
        this.f3857i = new dr2();
        this.f3858j = new dr2();
        this.f3859k = new dr2(8);
        this.f3860l = new dr2();
        this.f3861m = new dr2();
        this.f3832K = new int[1];
    }

    /* renamed from: n */
    protected static final int m5762n(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: o */
    protected static final boolean m5763o(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    @RequiresNonNull({"#2.output"})
    /* renamed from: p */
    private final int m5764p(pc4 pc4, C2389y yVar, int i) {
        int i2;
        if ("S_TEXT/UTF8".equals(yVar.f17502b)) {
            m5772x(pc4, f3817c0, i);
        } else if ("S_TEXT/ASS".equals(yVar.f17502b)) {
            m5772x(pc4, f3819e0, i);
        } else {
            td4 td4 = yVar.f17499X;
            boolean z = true;
            if (!this.f3841T) {
                if (yVar.f17508h) {
                    this.f3835N &= -1073741825;
                    int i3 = 128;
                    if (!this.f3842U) {
                        ((jc4) pc4).mo6916m(this.f3854f.mo6582h(), 0, 1, false);
                        this.f3838Q++;
                        if ((this.f3854f.mo6582h()[0] & 128) != 128) {
                            this.f3845X = this.f3854f.mo6582h()[0];
                            this.f3842U = true;
                        } else {
                            throw C1646dz.m8223a("Extension bit is set in signal byte", (Throwable) null);
                        }
                    }
                    byte b = this.f3845X;
                    if ((b & 1) == 1) {
                        byte b2 = b & 2;
                        this.f3835N |= 1073741824;
                        if (!this.f3846Y) {
                            ((jc4) pc4).mo6916m(this.f3859k.mo6582h(), 0, 8, false);
                            this.f3838Q += 8;
                            this.f3846Y = true;
                            byte[] h = this.f3854f.mo6582h();
                            if (b2 != 2) {
                                i3 = 0;
                            }
                            h[0] = (byte) (i3 | 8);
                            this.f3854f.mo6580f(0);
                            td4.mo7877f(this.f3854f, 1, 1);
                            this.f3839R++;
                            this.f3859k.mo6580f(0);
                            td4.mo7877f(this.f3859k, 8, 1);
                            this.f3839R += 8;
                        }
                        if (b2 == 2) {
                            if (!this.f3843V) {
                                ((jc4) pc4).mo6916m(this.f3854f.mo6582h(), 0, 1, false);
                                this.f3838Q++;
                                this.f3854f.mo6580f(0);
                                this.f3844W = this.f3854f.mo6593s();
                                this.f3843V = true;
                            }
                            int i4 = this.f3844W * 4;
                            this.f3854f.mo6577c(i4);
                            ((jc4) pc4).mo6916m(this.f3854f.mo6582h(), 0, i4, false);
                            this.f3838Q += i4;
                            int i5 = (this.f3844W >> 1) + 1;
                            int i6 = (i5 * 6) + 2;
                            ByteBuffer byteBuffer = this.f3862n;
                            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                                this.f3862n = ByteBuffer.allocate(i6);
                            }
                            this.f3862n.position(0);
                            this.f3862n.putShort((short) i5);
                            int i7 = 0;
                            int i8 = 0;
                            while (true) {
                                i2 = this.f3844W;
                                if (i7 >= i2) {
                                    break;
                                }
                                int v = this.f3854f.mo6596v();
                                if (i7 % 2 == 0) {
                                    this.f3862n.putShort((short) (v - i8));
                                } else {
                                    this.f3862n.putInt(v - i8);
                                }
                                i7++;
                                i8 = v;
                            }
                            int i9 = (i - this.f3838Q) - i8;
                            if ((i2 & 1) == 1) {
                                this.f3862n.putInt(i9);
                            } else {
                                this.f3862n.putShort((short) i9);
                                this.f3862n.putInt(0);
                            }
                            this.f3860l.mo6578d(this.f3862n.array(), i6);
                            td4.mo7877f(this.f3860l, i6, 1);
                            this.f3839R += i6;
                        }
                    }
                } else {
                    byte[] bArr = yVar.f17509i;
                    if (bArr != null) {
                        this.f3857i.mo6578d(bArr, bArr.length);
                    }
                }
                if (yVar.f17506f > 0) {
                    this.f3835N |= 268435456;
                    this.f3861m.mo6577c(0);
                    this.f3854f.mo6577c(4);
                    this.f3854f.mo6582h()[0] = (byte) ((i >> 24) & 255);
                    this.f3854f.mo6582h()[1] = (byte) ((i >> 16) & 255);
                    this.f3854f.mo6582h()[2] = (byte) ((i >> 8) & 255);
                    this.f3854f.mo6582h()[3] = (byte) (i & 255);
                    td4.mo7877f(this.f3854f, 4, 2);
                    this.f3839R += 4;
                }
                this.f3841T = true;
            }
            int l = i + this.f3857i.mo6586l();
            if (!"V_MPEG4/ISO/AVC".equals(yVar.f17502b) && !"V_MPEGH/ISO/HEVC".equals(yVar.f17502b)) {
                if (yVar.f17495T != null) {
                    if (this.f3857i.mo6586l() != 0) {
                        z = false;
                    }
                    wu1.m19207f(z);
                    yVar.f17495T.mo12120d(pc4);
                }
                while (true) {
                    int i10 = this.f3838Q;
                    if (i10 >= l) {
                        break;
                    }
                    int q = m5765q(pc4, td4, l - i10);
                    this.f3838Q += q;
                    this.f3839R += q;
                }
            } else {
                byte[] h2 = this.f3853e.mo6582h();
                h2[0] = 0;
                h2[1] = 0;
                h2[2] = 0;
                int i11 = yVar.f17500Y;
                int i12 = 4 - i11;
                while (this.f3838Q < l) {
                    int i13 = this.f3840S;
                    if (i13 == 0) {
                        int min = Math.min(i11, this.f3857i.mo6583i());
                        ((jc4) pc4).mo6916m(h2, i12 + min, i11 - min, false);
                        if (min > 0) {
                            this.f3857i.mo6576b(h2, i12, min);
                        }
                        this.f3838Q += i11;
                        this.f3853e.mo6580f(0);
                        this.f3840S = this.f3853e.mo6596v();
                        this.f3852d.mo6580f(0);
                        rd4.m16162b(td4, this.f3852d, 4);
                        this.f3839R += 4;
                    } else {
                        int q2 = m5765q(pc4, td4, i13);
                        this.f3838Q += q2;
                        this.f3839R += q2;
                        this.f3840S -= q2;
                    }
                }
            }
            if ("A_VORBIS".equals(yVar.f17502b)) {
                this.f3855g.mo6580f(0);
                rd4.m16162b(td4, this.f3855g, 4);
                this.f3839R += 4;
            }
        }
        int i14 = this.f3839R;
        m5771w();
        return i14;
    }

    /* renamed from: q */
    private final int m5765q(pc4 pc4, td4 td4, int i) {
        int i2 = this.f3857i.mo6583i();
        if (i2 <= 0) {
            return rd4.m16161a(td4, pc4, i, false);
        }
        int min = Math.min(i, i2);
        rd4.m16162b(td4, this.f3857i, min);
        return min;
    }

    /* renamed from: r */
    private final long m5766r(long j) {
        long j2 = this.f3865q;
        if (j2 != -9223372036854775807L) {
            return n13.m13621Z(j, j2, 1000);
        }
        throw C1646dz.m8223a("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    /* renamed from: s */
    private final void m5767s(int i) {
        if (this.f3823B == null || this.f3824C == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a Cues");
            throw C1646dz.m8223a(sb.toString(), (Throwable) null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    /* renamed from: t */
    private final void m5768t(int i) {
        if (this.f3868t == null) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a TrackEntry");
            throw C1646dz.m8223a(sb.toString(), (Throwable) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b7 A[EDGE_INSN: B:50:0x00b7->B:39:0x00b7 ?: BREAK  , SYNTHETIC] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m5769u(com.google.android.gms.internal.ads.C2389y r17, long r18, int r20, int r21, int r22) {
        /*
            r16 = this;
            r0 = r16
            r2 = r17
            com.google.android.gms.internal.ads.z r1 = r2.f17495T
            r8 = 1
            if (r1 == 0) goto L_0x0018
            r2 = r17
            r3 = r18
            r5 = r20
            r6 = r21
            r7 = r22
            r1.mo12119c(r2, r3, r5, r6, r7)
            goto L_0x00f9
        L_0x0018:
            java.lang.String r1 = r2.f17502b
            java.lang.String r3 = "S_TEXT/UTF8"
            boolean r1 = r3.equals(r1)
            java.lang.String r4 = "S_TEXT/ASS"
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = r2.f17502b
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0046
        L_0x002c:
            int r1 = r0.f3831J
            java.lang.String r5 = "MatroskaExtractor"
            if (r1 <= r8) goto L_0x0038
            java.lang.String r1 = "Skipping subtitle sample in laced block."
        L_0x0034:
            android.util.Log.w(r5, r1)
            goto L_0x0046
        L_0x0038:
            long r6 = r0.f3829H
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x004a
            java.lang.String r1 = "Skipping subtitle sample with no duration."
            goto L_0x0034
        L_0x0046:
            r1 = r21
            goto L_0x00ca
        L_0x004a:
            java.lang.String r1 = r2.f17502b
            com.google.android.gms.internal.ads.dr2 r5 = r0.f3858j
            byte[] r5 = r5.mo6582h()
            int r9 = r1.hashCode()
            r10 = 738597099(0x2c0618eb, float:1.9056378E-12)
            r11 = 0
            if (r9 == r10) goto L_0x006a
            r4 = 1422270023(0x54c61e47, float:6.807292E12)
            if (r9 == r4) goto L_0x0062
            goto L_0x0072
        L_0x0062:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0072
            r1 = r11
            goto L_0x0073
        L_0x006a:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0072
            r1 = r8
            goto L_0x0073
        L_0x0072:
            r1 = -1
        L_0x0073:
            if (r1 == 0) goto L_0x0088
            if (r1 != r8) goto L_0x0082
            r3 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r1 = "%01d:%02d:%02d:%02d"
            byte[] r1 = m5773y(r6, r1, r3)
            r3 = 21
            goto L_0x0092
        L_0x0082:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x0088:
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r1 = "%02d:%02d:%02d,%03d"
            byte[] r1 = m5773y(r6, r1, r3)
            r3 = 19
        L_0x0092:
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r11, r5, r3, r4)
            com.google.android.gms.internal.ads.dr2 r1 = r0.f3858j
            int r1 = r1.mo6585k()
        L_0x009c:
            com.google.android.gms.internal.ads.dr2 r3 = r0.f3858j
            int r3 = r3.mo6586l()
            if (r1 >= r3) goto L_0x00b7
            com.google.android.gms.internal.ads.dr2 r3 = r0.f3858j
            byte[] r3 = r3.mo6582h()
            byte r3 = r3[r1]
            if (r3 != 0) goto L_0x00b4
            com.google.android.gms.internal.ads.dr2 r3 = r0.f3858j
            r3.mo6579e(r1)
            goto L_0x00b7
        L_0x00b4:
            int r1 = r1 + 1
            goto L_0x009c
        L_0x00b7:
            com.google.android.gms.internal.ads.td4 r1 = r2.f17499X
            com.google.android.gms.internal.ads.dr2 r3 = r0.f3858j
            int r4 = r3.mo6586l()
            com.google.android.gms.internal.ads.rd4.m16162b(r1, r3, r4)
            com.google.android.gms.internal.ads.dr2 r1 = r0.f3858j
            int r1 = r1.mo6586l()
            int r1 = r21 + r1
        L_0x00ca:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r20 & r3
            if (r3 == 0) goto L_0x00eb
            int r3 = r0.f3831J
            if (r3 <= r8) goto L_0x00dc
            r3 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r3 = r20 & r3
            r13 = r1
            r12 = r3
            goto L_0x00ee
        L_0x00dc:
            com.google.android.gms.internal.ads.dr2 r3 = r0.f3861m
            int r3 = r3.mo6586l()
            com.google.android.gms.internal.ads.td4 r4 = r2.f17499X
            com.google.android.gms.internal.ads.dr2 r5 = r0.f3861m
            r6 = 2
            r4.mo7877f(r5, r3, r6)
            int r1 = r1 + r3
        L_0x00eb:
            r12 = r20
            r13 = r1
        L_0x00ee:
            com.google.android.gms.internal.ads.td4 r9 = r2.f17499X
            com.google.android.gms.internal.ads.sd4 r15 = r2.f17510j
            r10 = r18
            r14 = r22
            r9.mo7872a(r10, r12, r13, r14, r15)
        L_0x00f9:
            r0.f3826E = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1500a0.m5769u(com.google.android.gms.internal.ads.y, long, int, int, int):void");
    }

    /* renamed from: v */
    private final void m5770v(pc4 pc4, int i) {
        if (this.f3854f.mo6586l() < i) {
            if (this.f3854f.mo6584j() < i) {
                dr2 dr2 = this.f3854f;
                int j = dr2.mo6584j();
                dr2.mo6574H(Math.max(j + j, i));
            }
            ((jc4) pc4).mo6916m(this.f3854f.mo6582h(), this.f3854f.mo6586l(), i - this.f3854f.mo6586l(), false);
            this.f3854f.mo6579e(i);
        }
    }

    /* renamed from: w */
    private final void m5771w() {
        this.f3838Q = 0;
        this.f3839R = 0;
        this.f3840S = 0;
        this.f3841T = false;
        this.f3842U = false;
        this.f3843V = false;
        this.f3844W = 0;
        this.f3845X = 0;
        this.f3846Y = false;
        this.f3857i.mo6577c(0);
    }

    /* renamed from: x */
    private final void m5772x(pc4 pc4, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = i + 32;
        if (this.f3858j.mo6584j() < i2) {
            dr2 dr2 = this.f3858j;
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            dr2.mo6578d(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.f3858j.mo6582h(), 0, 32);
        }
        ((jc4) pc4).mo6916m(this.f3858j.mo6582h(), 32, i, false);
        this.f3858j.mo6580f(0);
        this.f3858j.mo6579e(i2);
    }

    /* renamed from: y */
    private static byte[] m5773y(long j, String str, long j2) {
        wu1.m19205d(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) (i * 3600)) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) (i2 * 60)) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return n13.m13650w(String.format(Locale.US, str, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))}));
    }

    /* renamed from: z */
    private static int[] m5774z(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    /* renamed from: c */
    public final boolean mo5040c(pc4 pc4) {
        return new C1537b0().mo5592a(pc4);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0281, code lost:
        throw com.google.android.gms.internal.ads.C1646dz.m8223a("EBML lacing sample size out of range.", (java.lang.Throwable) null);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5041d(int r19, int r20, com.google.android.gms.internal.ads.pc4 r21) {
        /*
            r18 = this;
            r7 = r18
            r0 = r19
            r1 = r20
            r8 = r21
            r2 = 161(0xa1, float:2.26E-43)
            r3 = 0
            r4 = 4
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 2
            r9 = 1
            r10 = 0
            if (r0 == r2) goto L_0x0114
            if (r0 == r5) goto L_0x0114
            r2 = 165(0xa5, float:2.31E-43)
            if (r0 == r2) goto L_0x00de
            r2 = 16877(0x41ed, float:2.365E-41)
            if (r0 == r2) goto L_0x00b4
            r2 = 16981(0x4255, float:2.3795E-41)
            if (r0 == r2) goto L_0x00a4
            r2 = 18402(0x47e2, float:2.5787E-41)
            if (r0 == r2) goto L_0x008f
            r2 = 21419(0x53ab, float:3.0014E-41)
            if (r0 == r2) goto L_0x0069
            r2 = 25506(0x63a2, float:3.5742E-41)
            if (r0 == r2) goto L_0x0059
            r2 = 30322(0x7672, float:4.249E-41)
            if (r0 != r2) goto L_0x0041
            r18.m5768t(r19)
            com.google.android.gms.internal.ads.y r0 = r7.f3868t
            byte[] r2 = new byte[r1]
            r0.f17522v = r2
            r0 = r8
            com.google.android.gms.internal.ads.jc4 r0 = (com.google.android.gms.internal.ads.jc4) r0
            r0.mo6916m(r2, r10, r1, r10)
            return
        L_0x0041:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 26
            r1.<init>(r2)
            java.lang.String r2 = "Unexpected id: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.dz r0 = com.google.android.gms.internal.ads.C1646dz.m8223a(r0, r3)
            throw r0
        L_0x0059:
            r18.m5768t(r19)
            com.google.android.gms.internal.ads.y r0 = r7.f3868t
            byte[] r2 = new byte[r1]
            r0.f17511k = r2
            r0 = r8
            com.google.android.gms.internal.ads.jc4 r0 = (com.google.android.gms.internal.ads.jc4) r0
            r0.mo6916m(r2, r10, r1, r10)
            return
        L_0x0069:
            com.google.android.gms.internal.ads.dr2 r0 = r7.f3856h
            byte[] r0 = r0.mo6582h()
            java.util.Arrays.fill(r0, r10)
            com.google.android.gms.internal.ads.dr2 r0 = r7.f3856h
            byte[] r0 = r0.mo6582h()
            r2 = r8
            com.google.android.gms.internal.ads.jc4 r2 = (com.google.android.gms.internal.ads.jc4) r2
            int r3 = 4 - r1
            r2.mo6916m(r0, r3, r1, r10)
            com.google.android.gms.internal.ads.dr2 r0 = r7.f3856h
            r0.mo6580f(r10)
            com.google.android.gms.internal.ads.dr2 r0 = r7.f3856h
            long r0 = r0.mo6567A()
            int r0 = (int) r0
            r7.f3870v = r0
            return
        L_0x008f:
            byte[] r2 = new byte[r1]
            r3 = r8
            com.google.android.gms.internal.ads.jc4 r3 = (com.google.android.gms.internal.ads.jc4) r3
            r3.mo6916m(r2, r10, r1, r10)
            r18.m5768t(r19)
            com.google.android.gms.internal.ads.y r0 = r7.f3868t
            com.google.android.gms.internal.ads.sd4 r1 = new com.google.android.gms.internal.ads.sd4
            r1.<init>(r9, r2, r10, r10)
            r0.f17510j = r1
            return
        L_0x00a4:
            r18.m5768t(r19)
            com.google.android.gms.internal.ads.y r0 = r7.f3868t
            byte[] r2 = new byte[r1]
            r0.f17509i = r2
            r0 = r8
            com.google.android.gms.internal.ads.jc4 r0 = (com.google.android.gms.internal.ads.jc4) r0
            r0.mo6916m(r2, r10, r1, r10)
            return
        L_0x00b4:
            r18.m5768t(r19)
            com.google.android.gms.internal.ads.y r0 = r7.f3868t
            int r2 = r0.f17507g
            r3 = 1685485123(0x64767643, float:1.8185683E22)
            if (r2 == r3) goto L_0x00d3
            int r2 = r0.f17507g
            r3 = 1685480259(0x64766343, float:1.8180206E22)
            if (r2 != r3) goto L_0x00cc
            goto L_0x00d3
        L_0x00cc:
            r0 = r8
            com.google.android.gms.internal.ads.jc4 r0 = (com.google.android.gms.internal.ads.jc4) r0
            r0.mo8447p(r1, r10)
            return
        L_0x00d3:
            byte[] r2 = new byte[r1]
            r0.f17489N = r2
            r0 = r8
            com.google.android.gms.internal.ads.jc4 r0 = (com.google.android.gms.internal.ads.jc4) r0
            r0.mo6916m(r2, r10, r1, r10)
            return
        L_0x00de:
            int r0 = r7.f3827F
            if (r0 == r6) goto L_0x00e3
            return
        L_0x00e3:
            android.util.SparseArray<com.google.android.gms.internal.ads.y> r0 = r7.f3850b
            int r2 = r7.f3833L
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.ads.y r0 = (com.google.android.gms.internal.ads.C2389y) r0
            int r2 = r7.f3836O
            if (r2 != r4) goto L_0x010d
            java.lang.String r0 = r0.f17502b
            java.lang.String r2 = "V_VP9"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x010d
            com.google.android.gms.internal.ads.dr2 r0 = r7.f3861m
            r0.mo6577c(r1)
            com.google.android.gms.internal.ads.dr2 r0 = r7.f3861m
            byte[] r0 = r0.mo6582h()
            r2 = r8
            com.google.android.gms.internal.ads.jc4 r2 = (com.google.android.gms.internal.ads.jc4) r2
            r2.mo6916m(r0, r10, r1, r10)
            return
        L_0x010d:
            r0 = r8
            com.google.android.gms.internal.ads.jc4 r0 = (com.google.android.gms.internal.ads.jc4) r0
            r0.mo8447p(r1, r10)
            return
        L_0x0114:
            int r2 = r7.f3827F
            r11 = 8
            if (r2 != 0) goto L_0x0139
            com.google.android.gms.internal.ads.d0 r2 = r7.f3848a
            long r12 = r2.mo6356d(r8, r10, r9, r11)
            int r2 = (int) r12
            r7.f3833L = r2
            com.google.android.gms.internal.ads.d0 r2 = r7.f3848a
            int r2 = r2.mo6355a()
            r7.f3834M = r2
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f3829H = r12
            r7.f3827F = r9
            com.google.android.gms.internal.ads.dr2 r2 = r7.f3854f
            r2.mo6577c(r10)
        L_0x0139:
            android.util.SparseArray<com.google.android.gms.internal.ads.y> r2 = r7.f3850b
            int r12 = r7.f3833L
            java.lang.Object r2 = r2.get(r12)
            r12 = r2
            com.google.android.gms.internal.ads.y r12 = (com.google.android.gms.internal.ads.C2389y) r12
            if (r12 != 0) goto L_0x0153
            int r0 = r7.f3834M
            r2 = r8
            com.google.android.gms.internal.ads.jc4 r2 = (com.google.android.gms.internal.ads.jc4) r2
            int r0 = r1 - r0
            r2.mo8447p(r0, r10)
            r7.f3827F = r10
            return
        L_0x0153:
            java.util.Objects.requireNonNull(r12.f17499X)
            int r2 = r7.f3827F
            if (r2 != r9) goto L_0x02e4
            r2 = 3
            r7.m5770v(r8, r2)
            com.google.android.gms.internal.ads.dr2 r13 = r7.f3854f
            byte[] r13 = r13.mo6582h()
            byte r13 = r13[r6]
            r13 = r13 & 6
            int r13 = r13 >> r9
            r14 = 255(0xff, float:3.57E-43)
            if (r13 != 0) goto L_0x0180
            r7.f3831J = r9
            int[] r2 = r7.f3832K
            int[] r2 = m5774z(r2, r9)
            r7.f3832K = r2
            int r3 = r7.f3834M
            int r1 = r1 - r3
            int r1 = r1 + -3
            r2[r10] = r1
            goto L_0x0292
        L_0x0180:
            r7.m5770v(r8, r4)
            com.google.android.gms.internal.ads.dr2 r15 = r7.f3854f
            byte[] r15 = r15.mo6582h()
            byte r15 = r15[r2]
            r15 = r15 & r14
            int r15 = r15 + r9
            r7.f3831J = r15
            int[] r4 = r7.f3832K
            int[] r4 = m5774z(r4, r15)
            r7.f3832K = r4
            if (r13 != r6) goto L_0x01a6
            int r2 = r7.f3834M
            int r3 = r7.f3831J
            int r1 = r1 - r2
            int r1 = r1 + -4
            int r1 = r1 / r3
            java.util.Arrays.fill(r4, r10, r3, r1)
            goto L_0x0292
        L_0x01a6:
            if (r13 != r9) goto L_0x01de
            r2 = r10
            r3 = r2
            r4 = 4
        L_0x01ab:
            int r13 = r7.f3831J
            int r13 = r13 + -1
            if (r2 >= r13) goto L_0x01d3
            int[] r13 = r7.f3832K
            r13[r2] = r10
        L_0x01b5:
            int r4 = r4 + r9
            r7.m5770v(r8, r4)
            com.google.android.gms.internal.ads.dr2 r13 = r7.f3854f
            byte[] r13 = r13.mo6582h()
            int r15 = r4 + -1
            byte r13 = r13[r15]
            r13 = r13 & r14
            int[] r15 = r7.f3832K
            r16 = r15[r2]
            int r16 = r16 + r13
            r15[r2] = r16
            if (r13 == r14) goto L_0x01b5
            int r3 = r3 + r16
            int r2 = r2 + 1
            goto L_0x01ab
        L_0x01d3:
            int[] r2 = r7.f3832K
            int r15 = r7.f3834M
            int r1 = r1 - r15
            int r1 = r1 - r4
            int r1 = r1 - r3
            r2[r13] = r1
            goto L_0x0292
        L_0x01de:
            if (r13 != r2) goto L_0x02dd
            r2 = r10
            r13 = r2
            r4 = 4
        L_0x01e3:
            int r15 = r7.f3831J
            int r15 = r15 + -1
            if (r2 >= r15) goto L_0x0289
            int[] r15 = r7.f3832K
            r15[r2] = r10
            int r4 = r4 + 1
            r7.m5770v(r8, r4)
            int r15 = r4 + -1
            com.google.android.gms.internal.ads.dr2 r5 = r7.f3854f
            byte[] r5 = r5.mo6582h()
            byte r5 = r5[r15]
            if (r5 == 0) goto L_0x0282
            r5 = r10
        L_0x01ff:
            if (r5 >= r11) goto L_0x0251
            int r17 = 7 - r5
            int r6 = r9 << r17
            com.google.android.gms.internal.ads.dr2 r9 = r7.f3854f
            byte[] r9 = r9.mo6582h()
            byte r9 = r9[r15]
            r9 = r9 & r6
            if (r9 == 0) goto L_0x0247
            int r4 = r4 + r5
            r7.m5770v(r8, r4)
            int r9 = r15 + 1
            com.google.android.gms.internal.ads.dr2 r10 = r7.f3854f
            byte[] r10 = r10.mo6582h()
            byte r10 = r10[r15]
            r10 = r10 & r14
            int r6 = ~r6
            r6 = r6 & r10
            long r14 = (long) r6
        L_0x0222:
            if (r9 >= r4) goto L_0x0238
            int r6 = r9 + 1
            long r14 = r14 << r11
            com.google.android.gms.internal.ads.dr2 r10 = r7.f3854f
            byte[] r10 = r10.mo6582h()
            byte r9 = r10[r9]
            r10 = 255(0xff, float:3.57E-43)
            r9 = r9 & r10
            long r10 = (long) r9
            long r14 = r14 | r10
            r9 = r6
            r11 = 8
            goto L_0x0222
        L_0x0238:
            if (r2 <= 0) goto L_0x0253
            r9 = 1
            int r5 = r5 * 7
            int r5 = r5 + 6
            long r5 = r9 << r5
            r9 = -1
            long r5 = r5 + r9
            long r14 = r14 - r5
            goto L_0x0253
        L_0x0247:
            int r5 = r5 + 1
            r6 = 2
            r9 = 1
            r10 = 0
            r11 = 8
            r14 = 255(0xff, float:3.57E-43)
            goto L_0x01ff
        L_0x0251:
            r14 = 0
        L_0x0253:
            r5 = -2147483648(0xffffffff80000000, double:NaN)
            int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x027b
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x027b
            int r5 = (int) r14
            int[] r6 = r7.f3832K
            if (r2 == 0) goto L_0x026b
            int r9 = r2 + -1
            r9 = r6[r9]
            int r5 = r5 + r9
        L_0x026b:
            r6[r2] = r5
            int r13 = r13 + r5
            int r2 = r2 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 2
            r9 = 1
            r10 = 0
            r11 = 8
            r14 = 255(0xff, float:3.57E-43)
            goto L_0x01e3
        L_0x027b:
            java.lang.String r0 = "EBML lacing sample size out of range."
            com.google.android.gms.internal.ads.dz r0 = com.google.android.gms.internal.ads.C1646dz.m8223a(r0, r3)
            throw r0
        L_0x0282:
            java.lang.String r0 = "No valid varint length mask found"
            com.google.android.gms.internal.ads.dz r0 = com.google.android.gms.internal.ads.C1646dz.m8223a(r0, r3)
            throw r0
        L_0x0289:
            int[] r2 = r7.f3832K
            int r3 = r7.f3834M
            int r1 = r1 - r3
            int r1 = r1 - r4
            int r1 = r1 - r13
            r2[r15] = r1
        L_0x0292:
            com.google.android.gms.internal.ads.dr2 r1 = r7.f3854f
            byte[] r1 = r1.mo6582h()
            r2 = 0
            byte r1 = r1[r2]
            com.google.android.gms.internal.ads.dr2 r2 = r7.f3854f
            byte[] r2 = r2.mo6582h()
            r3 = 1
            byte r2 = r2[r3]
            long r3 = r7.f3822A
            r5 = 8
            int r1 = r1 << r5
            r5 = 255(0xff, float:3.57E-43)
            r2 = r2 & r5
            r1 = r1 | r2
            long r1 = (long) r1
            long r1 = r7.m5766r(r1)
            long r3 = r3 + r1
            r7.f3828G = r3
            int r1 = r12.f17504d
            r2 = 2
            if (r1 == r2) goto L_0x02d2
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x02d0
            com.google.android.gms.internal.ads.dr2 r0 = r7.f3854f
            byte[] r0 = r0.mo6582h()
            byte r0 = r0[r2]
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            if (r0 != r1) goto L_0x02ce
            r0 = 163(0xa3, float:2.28E-43)
            goto L_0x02d2
        L_0x02ce:
            r0 = 163(0xa3, float:2.28E-43)
        L_0x02d0:
            r1 = 0
            goto L_0x02d3
        L_0x02d2:
            r1 = 1
        L_0x02d3:
            r7.f3835N = r1
            r7.f3827F = r2
            r1 = 0
            r7.f3830I = r1
            r1 = 163(0xa3, float:2.28E-43)
            goto L_0x02e5
        L_0x02dd:
            java.lang.String r0 = "Unexpected lacing value: 2"
            com.google.android.gms.internal.ads.dz r0 = com.google.android.gms.internal.ads.C1646dz.m8223a(r0, r3)
            throw r0
        L_0x02e4:
            r1 = r5
        L_0x02e5:
            if (r0 != r1) goto L_0x0314
        L_0x02e7:
            int r0 = r7.f3830I
            int r1 = r7.f3831J
            if (r0 >= r1) goto L_0x0310
            int[] r1 = r7.f3832K
            r0 = r1[r0]
            int r5 = r7.m5764p(r8, r12, r0)
            long r0 = r7.f3828G
            int r2 = r7.f3830I
            int r3 = r12.f17505e
            int r2 = r2 * r3
            int r2 = r2 / 1000
            long r2 = (long) r2
            long r2 = r2 + r0
            int r4 = r7.f3835N
            r6 = 0
            r0 = r18
            r1 = r12
            r0.m5769u(r1, r2, r4, r5, r6)
            int r0 = r7.f3830I
            r1 = 1
            int r0 = r0 + r1
            r7.f3830I = r0
            goto L_0x02e7
        L_0x0310:
            r0 = 0
            r7.f3827F = r0
            return
        L_0x0314:
            int r0 = r7.f3830I
            int r1 = r7.f3831J
            if (r0 >= r1) goto L_0x032b
            int[] r1 = r7.f3832K
            r2 = r1[r0]
            int r2 = r7.m5764p(r8, r12, r2)
            r1[r0] = r2
            int r0 = r7.f3830I
            r1 = 1
            int r0 = r0 + r1
            r7.f3830I = r0
            goto L_0x0314
        L_0x032b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1500a0.mo5041d(int, int, com.google.android.gms.internal.ads.pc4):void");
    }

    /* renamed from: e */
    public final int mo5042e(pc4 pc4, md4 md4) {
        this.f3826E = false;
        while (!this.f3826E) {
            if (this.f3849a0.mo10694c(pc4)) {
                long b = pc4.mo6908b();
                if (this.f3872x) {
                    this.f3874z = b;
                    md4.f10817a = this.f3873y;
                    this.f3872x = false;
                    return 1;
                } else if (this.f3869u) {
                    long j = this.f3874z;
                    if (j != -1) {
                        md4.f10817a = j;
                        this.f3874z = -1;
                        return 1;
                    }
                }
            } else {
                for (int i = 0; i < this.f3850b.size(); i++) {
                    C2389y valueAt = this.f3850b.valueAt(i);
                    Objects.requireNonNull(valueAt.f17499X);
                    C2426z zVar = valueAt.f17495T;
                    if (zVar != null) {
                        zVar.mo12117a(valueAt);
                    }
                }
                return -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0252, code lost:
        if (r3.equals("V_AV1") != false) goto L_0x030a;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5043f(int r22) {
        /*
            r21 = this;
            r7 = r21
            r0 = r22
            com.google.android.gms.internal.ads.rc4 r1 = r7.f3847Z
            com.google.android.gms.internal.ads.wu1.m19203b(r1)
            r1 = 160(0xa0, float:2.24E-43)
            r2 = 2
            if (r0 == r1) goto L_0x0329
            r1 = 174(0xae, float:2.44E-43)
            r3 = -1
            if (r0 == r1) goto L_0x0188
            r1 = 19899(0x4dbb, float:2.7884E-41)
            r5 = -1
            r2 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r0 == r1) goto L_0x0170
            r1 = 25152(0x6240, float:3.5245E-41)
            if (r0 == r1) goto L_0x013d
            r1 = 28032(0x6d80, float:3.9281E-41)
            if (r0 == r1) goto L_0x0127
            r1 = 357149030(0x1549a966, float:4.072526E-26)
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == r1) goto L_0x010f
            r1 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r0 == r1) goto L_0x00f9
            if (r0 == r2) goto L_0x0037
            goto L_0x017f
        L_0x0037:
            boolean r0 = r7.f3869u
            if (r0 != 0) goto L_0x00f3
            com.google.android.gms.internal.ads.rc4 r0 = r7.f3847Z
            com.google.android.gms.internal.ads.pd2 r1 = r7.f3823B
            com.google.android.gms.internal.ads.pd2 r2 = r7.f3824C
            long r12 = r7.f3864p
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            r12 = 0
            if (r5 == 0) goto L_0x00e6
            long r5 = r7.f3867s
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x00e6
            if (r1 == 0) goto L_0x00e6
            int r5 = r1.mo10035a()
            if (r5 == 0) goto L_0x00e6
            if (r2 == 0) goto L_0x00e6
            int r5 = r2.mo10035a()
            int r6 = r1.mo10035a()
            if (r5 == r6) goto L_0x0065
            goto L_0x00e6
        L_0x0065:
            int r5 = r1.mo10035a()
            int[] r6 = new int[r5]
            long[] r10 = new long[r5]
            long[] r11 = new long[r5]
            long[] r14 = new long[r5]
            r15 = 0
        L_0x0072:
            if (r15 >= r5) goto L_0x0087
            long r16 = r1.mo10036b(r15)
            r14[r15] = r16
            long r8 = r7.f3864p
            long r18 = r2.mo10036b(r15)
            long r8 = r8 + r18
            r10[r15] = r8
            int r15 = r15 + 1
            goto L_0x0072
        L_0x0087:
            r9 = 0
        L_0x0088:
            int r1 = r5 + -1
            if (r9 >= r1) goto L_0x00a2
            int r1 = r9 + 1
            r17 = r10[r1]
            r19 = r10[r9]
            long r3 = r17 - r19
            int r2 = (int) r3
            r6[r9] = r2
            r2 = r14[r1]
            r17 = r14[r9]
            long r2 = r2 - r17
            r11[r9] = r2
            r9 = r1
            r3 = -1
            goto L_0x0088
        L_0x00a2:
            long r2 = r7.f3864p
            long r4 = r7.f3863o
            long r2 = r2 + r4
            r4 = r10[r1]
            long r2 = r2 - r4
            int r2 = (int) r2
            r6[r1] = r2
            long r2 = r7.f3867s
            r4 = r14[r1]
            long r2 = r2 - r4
            r11[r1] = r2
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 > 0) goto L_0x00e0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 72
            r4.<init>(r5)
            java.lang.String r5 = "Discarding last cue point with unexpected duration: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "MatroskaExtractor"
            android.util.Log.w(r3, r2)
            int[] r6 = java.util.Arrays.copyOf(r6, r1)
            long[] r10 = java.util.Arrays.copyOf(r10, r1)
            long[] r11 = java.util.Arrays.copyOf(r11, r1)
            long[] r14 = java.util.Arrays.copyOf(r14, r1)
        L_0x00e0:
            com.google.android.gms.internal.ads.hc4 r1 = new com.google.android.gms.internal.ads.hc4
            r1.<init>(r6, r10, r11, r14)
            goto L_0x00ed
        L_0x00e6:
            com.google.android.gms.internal.ads.od4 r1 = new com.google.android.gms.internal.ads.od4
            long r2 = r7.f3867s
            r1.<init>(r2, r12)
        L_0x00ed:
            r0.mo10269p(r1)
            r0 = 1
            r7.f3869u = r0
        L_0x00f3:
            r0 = 0
            r7.f3823B = r0
            r7.f3824C = r0
            return
        L_0x00f9:
            r0 = 0
            android.util.SparseArray<com.google.android.gms.internal.ads.y> r1 = r7.f3850b
            int r1 = r1.size()
            if (r1 == 0) goto L_0x0108
            com.google.android.gms.internal.ads.rc4 r0 = r7.f3847Z
            r0.mo10268G()
            return
        L_0x0108:
            java.lang.String r1 = "No valid tracks were found"
            com.google.android.gms.internal.ads.dz r0 = com.google.android.gms.internal.ads.C1646dz.m8223a(r1, r0)
            throw r0
        L_0x010f:
            long r0 = r7.f3865q
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x011a
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r7.f3865q = r0
        L_0x011a:
            long r0 = r7.f3866r
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x017f
            long r0 = r7.m5766r(r0)
            r7.f3867s = r0
            return
        L_0x0127:
            r21.m5768t(r22)
            com.google.android.gms.internal.ads.y r0 = r7.f3868t
            boolean r1 = r0.f17508h
            if (r1 == 0) goto L_0x017f
            byte[] r0 = r0.f17509i
            if (r0 != 0) goto L_0x0135
            goto L_0x017f
        L_0x0135:
            java.lang.String r0 = "Combining encryption and compression is not supported"
            r1 = 0
            com.google.android.gms.internal.ads.dz r0 = com.google.android.gms.internal.ads.C1646dz.m8223a(r0, r1)
            throw r0
        L_0x013d:
            r21.m5768t(r22)
            com.google.android.gms.internal.ads.y r0 = r7.f3868t
            boolean r1 = r0.f17508h
            if (r1 == 0) goto L_0x017f
            com.google.android.gms.internal.ads.sd4 r1 = r0.f17510j
            if (r1 == 0) goto L_0x0168
            com.google.android.gms.internal.ads.u74 r1 = new com.google.android.gms.internal.ads.u74
            r2 = 1
            com.google.android.gms.internal.ads.u64[] r2 = new com.google.android.gms.internal.ads.u64[r2]
            com.google.android.gms.internal.ads.u64 r3 = new com.google.android.gms.internal.ads.u64
            java.util.UUID r4 = com.google.android.gms.internal.ads.nz3.f11781a
            com.google.android.gms.internal.ads.y r5 = r7.f3868t
            com.google.android.gms.internal.ads.sd4 r5 = r5.f17510j
            byte[] r5 = r5.f14410b
            java.lang.String r6 = "video/webm"
            r8 = 0
            r3.<init>(r4, r8, r6, r5)
            r4 = 0
            r2[r4] = r3
            r1.<init>(r8, r2)
            r0.f17512l = r1
            return
        L_0x0168:
            r8 = 0
            java.lang.String r0 = "Encrypted Track found but ContentEncKeyID was not found"
            com.google.android.gms.internal.ads.dz r0 = com.google.android.gms.internal.ads.C1646dz.m8223a(r0, r8)
            throw r0
        L_0x0170:
            int r0 = r7.f3870v
            r1 = -1
            if (r0 == r1) goto L_0x0180
            long r3 = r7.f3871w
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0180
            if (r0 != r2) goto L_0x017f
            r7.f3873y = r3
        L_0x017f:
            return
        L_0x0180:
            java.lang.String r0 = "Mandatory element SeekID or SeekPosition not found"
            r1 = 0
            com.google.android.gms.internal.ads.dz r0 = com.google.android.gms.internal.ads.C1646dz.m8223a(r0, r1)
            throw r0
        L_0x0188:
            r1 = r3
            com.google.android.gms.internal.ads.y r0 = r7.f3868t
            com.google.android.gms.internal.ads.wu1.m19203b(r0)
            java.lang.String r3 = r0.f17502b
            if (r3 == 0) goto L_0x0321
            int r4 = r3.hashCode()
            switch(r4) {
                case -2095576542: goto L_0x02ff;
                case -2095575984: goto L_0x02f5;
                case -1985379776: goto L_0x02ea;
                case -1784763192: goto L_0x02df;
                case -1730367663: goto L_0x02d4;
                case -1482641358: goto L_0x02c9;
                case -1482641357: goto L_0x02be;
                case -1373388978: goto L_0x02b3;
                case -933872740: goto L_0x02a8;
                case -538363189: goto L_0x029d;
                case -538363109: goto L_0x0292;
                case -425012669: goto L_0x0286;
                case -356037306: goto L_0x027a;
                case 62923557: goto L_0x026e;
                case 62923603: goto L_0x0262;
                case 62927045: goto L_0x0256;
                case 82318131: goto L_0x024c;
                case 82338133: goto L_0x0241;
                case 82338134: goto L_0x0236;
                case 99146302: goto L_0x022a;
                case 444813526: goto L_0x021e;
                case 542569478: goto L_0x0212;
                case 635596514: goto L_0x0206;
                case 725948237: goto L_0x01fa;
                case 725957860: goto L_0x01ee;
                case 738597099: goto L_0x01e2;
                case 855502857: goto L_0x01d6;
                case 1422270023: goto L_0x01ca;
                case 1809237540: goto L_0x01bf;
                case 1950749482: goto L_0x01b3;
                case 1950789798: goto L_0x01a7;
                case 1951062397: goto L_0x019b;
                default: goto L_0x0199;
            }
        L_0x0199:
            goto L_0x0309
        L_0x019b:
            java.lang.String r2 = "A_OPUS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 11
            goto L_0x030a
        L_0x01a7:
            java.lang.String r2 = "A_FLAC"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 22
            goto L_0x030a
        L_0x01b3:
            java.lang.String r2 = "A_EAC3"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 17
            goto L_0x030a
        L_0x01bf:
            java.lang.String r2 = "V_MPEG2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 3
            goto L_0x030a
        L_0x01ca:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 27
            goto L_0x030a
        L_0x01d6:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 8
            goto L_0x030a
        L_0x01e2:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 28
            goto L_0x030a
        L_0x01ee:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 24
            goto L_0x030a
        L_0x01fa:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 25
            goto L_0x030a
        L_0x0206:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 26
            goto L_0x030a
        L_0x0212:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 20
            goto L_0x030a
        L_0x021e:
            java.lang.String r2 = "V_THEORA"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 10
            goto L_0x030a
        L_0x022a:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 30
            goto L_0x030a
        L_0x0236:
            java.lang.String r2 = "V_VP9"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 1
            goto L_0x030a
        L_0x0241:
            java.lang.String r2 = "V_VP8"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 0
            goto L_0x030a
        L_0x024c:
            java.lang.String r4 = "V_AV1"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0309
            goto L_0x030a
        L_0x0256:
            java.lang.String r2 = "A_DTS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 19
            goto L_0x030a
        L_0x0262:
            java.lang.String r2 = "A_AC3"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 16
            goto L_0x030a
        L_0x026e:
            java.lang.String r2 = "A_AAC"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 13
            goto L_0x030a
        L_0x027a:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 21
            goto L_0x030a
        L_0x0286:
            java.lang.String r2 = "S_VOBSUB"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 29
            goto L_0x030a
        L_0x0292:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 7
            goto L_0x030a
        L_0x029d:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 5
            goto L_0x030a
        L_0x02a8:
            java.lang.String r2 = "S_DVBSUB"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 31
            goto L_0x030a
        L_0x02b3:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 9
            goto L_0x030a
        L_0x02be:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 15
            goto L_0x030a
        L_0x02c9:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 14
            goto L_0x030a
        L_0x02d4:
            java.lang.String r2 = "A_VORBIS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 12
            goto L_0x030a
        L_0x02df:
            java.lang.String r2 = "A_TRUEHD"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 18
            goto L_0x030a
        L_0x02ea:
            java.lang.String r2 = "A_MS/ACM"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 23
            goto L_0x030a
        L_0x02f5:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 4
            goto L_0x030a
        L_0x02ff:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 6
            goto L_0x030a
        L_0x0309:
            r2 = r1
        L_0x030a:
            switch(r2) {
                case 0: goto L_0x030f;
                case 1: goto L_0x030f;
                case 2: goto L_0x030f;
                case 3: goto L_0x030f;
                case 4: goto L_0x030f;
                case 5: goto L_0x030f;
                case 6: goto L_0x030f;
                case 7: goto L_0x030f;
                case 8: goto L_0x030f;
                case 9: goto L_0x030f;
                case 10: goto L_0x030f;
                case 11: goto L_0x030f;
                case 12: goto L_0x030f;
                case 13: goto L_0x030f;
                case 14: goto L_0x030f;
                case 15: goto L_0x030f;
                case 16: goto L_0x030f;
                case 17: goto L_0x030f;
                case 18: goto L_0x030f;
                case 19: goto L_0x030f;
                case 20: goto L_0x030f;
                case 21: goto L_0x030f;
                case 22: goto L_0x030f;
                case 23: goto L_0x030f;
                case 24: goto L_0x030f;
                case 25: goto L_0x030f;
                case 26: goto L_0x030f;
                case 27: goto L_0x030f;
                case 28: goto L_0x030f;
                case 29: goto L_0x030f;
                case 30: goto L_0x030f;
                case 31: goto L_0x030f;
                default: goto L_0x030d;
            }
        L_0x030d:
            r0 = 0
            goto L_0x031e
        L_0x030f:
            com.google.android.gms.internal.ads.rc4 r1 = r7.f3847Z
            int r2 = r0.f17503c
            r0.mo11946e(r1, r2)
            android.util.SparseArray<com.google.android.gms.internal.ads.y> r1 = r7.f3850b
            int r2 = r0.f17503c
            r1.put(r2, r0)
            goto L_0x030d
        L_0x031e:
            r7.f3868t = r0
            return
        L_0x0321:
            r0 = 0
            java.lang.String r1 = "CodecId is missing in TrackEntry element"
            com.google.android.gms.internal.ads.dz r0 = com.google.android.gms.internal.ads.C1646dz.m8223a(r1, r0)
            throw r0
        L_0x0329:
            int r0 = r7.f3827F
            if (r0 != r2) goto L_0x037c
            r0 = 0
            r4 = 0
        L_0x032f:
            int r1 = r7.f3831J
            if (r4 >= r1) goto L_0x033b
            int[] r1 = r7.f3832K
            r1 = r1[r4]
            int r0 = r0 + r1
            int r4 = r4 + 1
            goto L_0x032f
        L_0x033b:
            android.util.SparseArray<com.google.android.gms.internal.ads.y> r1 = r7.f3850b
            int r2 = r7.f3833L
            java.lang.Object r1 = r1.get(r2)
            r8 = r1
            com.google.android.gms.internal.ads.y r8 = (com.google.android.gms.internal.ads.C2389y) r8
            java.util.Objects.requireNonNull(r8.f17499X)
            r4 = 0
        L_0x034a:
            int r1 = r7.f3831J
            if (r4 >= r1) goto L_0x0379
            long r1 = r7.f3828G
            int r3 = r8.f17505e
            int r3 = r3 * r4
            int r3 = r3 / 1000
            long r5 = (long) r3
            long r2 = r1 + r5
            int r1 = r7.f3835N
            if (r4 != 0) goto L_0x0365
            boolean r4 = r7.f3837P
            if (r4 != 0) goto L_0x0362
            r1 = r1 | 1
        L_0x0362:
            r4 = r1
            r9 = 0
            goto L_0x0367
        L_0x0365:
            r9 = r4
            r4 = r1
        L_0x0367:
            int[] r1 = r7.f3832K
            r5 = r1[r9]
            int r10 = r0 - r5
            r0 = r21
            r1 = r8
            r6 = r10
            r0.m5769u(r1, r2, r4, r5, r6)
            r0 = 1
            int r4 = r9 + 1
            r0 = r10
            goto L_0x034a
        L_0x0379:
            r1 = 0
            r7.f3827F = r1
        L_0x037c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1500a0.mo5043f(int):void");
    }

    /* renamed from: g */
    public final void mo5044g(rc4 rc4) {
        this.f3847Z = rc4;
    }

    /* renamed from: h */
    public final void mo5045h(long j, long j2) {
        this.f3822A = -9223372036854775807L;
        this.f3827F = 0;
        this.f3849a0.mo10693b();
        this.f3848a.mo6357e();
        m5771w();
        for (int i = 0; i < this.f3850b.size(); i++) {
            C2426z zVar = this.f3850b.valueAt(i).f17495T;
            if (zVar != null) {
                zVar.mo12118b();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo5046i(int i, double d) {
        if (i == 181) {
            m5768t(i);
            this.f3868t.f17492Q = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    m5768t(i);
                    this.f3868t.f17479D = (float) d;
                    return;
                case 21970:
                    m5768t(i);
                    this.f3868t.f17480E = (float) d;
                    return;
                case 21971:
                    m5768t(i);
                    this.f3868t.f17481F = (float) d;
                    return;
                case 21972:
                    m5768t(i);
                    this.f3868t.f17482G = (float) d;
                    return;
                case 21973:
                    m5768t(i);
                    this.f3868t.f17483H = (float) d;
                    return;
                case 21974:
                    m5768t(i);
                    this.f3868t.f17484I = (float) d;
                    return;
                case 21975:
                    m5768t(i);
                    this.f3868t.f17485J = (float) d;
                    return;
                case 21976:
                    m5768t(i);
                    this.f3868t.f17486K = (float) d;
                    return;
                case 21977:
                    m5768t(i);
                    this.f3868t.f17487L = (float) d;
                    return;
                case 21978:
                    m5768t(i);
                    this.f3868t.f17488M = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            m5768t(i);
                            this.f3868t.f17519s = (float) d;
                            return;
                        case 30324:
                            m5768t(i);
                            this.f3868t.f17520t = (float) d;
                            return;
                        case 30325:
                            m5768t(i);
                            this.f3868t.f17521u = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f3866r = (long) d;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo5047j(int i, long j) {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        m5768t(i);
                        this.f3868t.f17504d = (int) j;
                        return;
                    case 136:
                        m5768t(i);
                        C2389y yVar = this.f3868t;
                        if (j == 1) {
                            z = true;
                        }
                        yVar.f17497V = z;
                        return;
                    case 155:
                        this.f3829H = m5766r(j);
                        return;
                    case 159:
                        m5768t(i);
                        this.f3868t.f17490O = (int) j;
                        return;
                    case 176:
                        m5768t(i);
                        this.f3868t.f17513m = (int) j;
                        return;
                    case 179:
                        m5767s(i);
                        this.f3823B.mo10037c(m5766r(j));
                        return;
                    case 186:
                        m5768t(i);
                        this.f3868t.f17514n = (int) j;
                        return;
                    case 215:
                        m5768t(i);
                        this.f3868t.f17503c = (int) j;
                        return;
                    case 231:
                        this.f3822A = m5766r(j);
                        return;
                    case 238:
                        this.f3836O = (int) j;
                        return;
                    case 241:
                        if (!this.f3825D) {
                            m5767s(i);
                            this.f3824C.mo10037c(j);
                            this.f3825D = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f3837P = true;
                        return;
                    case 16871:
                        m5768t(i);
                        this.f3868t.f17507g = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("ContentCompAlgo ");
                            sb.append(j);
                            sb.append(" not supported");
                            throw C1646dz.m8223a(sb.toString(), (Throwable) null);
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j);
                            sb2.append(" not supported");
                            throw C1646dz.m8223a(sb2.toString(), (Throwable) null);
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j);
                            sb3.append(" not supported");
                            throw C1646dz.m8223a(sb3.toString(), (Throwable) null);
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            StringBuilder sb4 = new StringBuilder(49);
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j);
                            sb4.append(" not supported");
                            throw C1646dz.m8223a(sb4.toString(), (Throwable) null);
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            StringBuilder sb5 = new StringBuilder(56);
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j);
                            sb5.append(" not supported");
                            throw C1646dz.m8223a(sb5.toString(), (Throwable) null);
                        }
                        return;
                    case 21420:
                        this.f3871w = j + this.f3864p;
                        return;
                    case 21432:
                        m5768t(i);
                        int i2 = (int) j;
                        if (i2 == 0) {
                            this.f3868t.f17523w = 0;
                            return;
                        } else if (i2 == 1) {
                            this.f3868t.f17523w = 2;
                            return;
                        } else if (i2 == 3) {
                            this.f3868t.f17523w = 1;
                            return;
                        } else if (i2 == 15) {
                            this.f3868t.f17523w = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        m5768t(i);
                        this.f3868t.f17515o = (int) j;
                        return;
                    case 21682:
                        m5768t(i);
                        this.f3868t.f17517q = (int) j;
                        return;
                    case 21690:
                        m5768t(i);
                        this.f3868t.f17516p = (int) j;
                        return;
                    case 21930:
                        m5768t(i);
                        C2389y yVar2 = this.f3868t;
                        if (j == 1) {
                            z = true;
                        }
                        yVar2.f17496U = z;
                        return;
                    case 21998:
                        m5768t(i);
                        this.f3868t.f17506f = (int) j;
                        return;
                    case 22186:
                        m5768t(i);
                        this.f3868t.f17493R = j;
                        return;
                    case 22203:
                        m5768t(i);
                        this.f3868t.f17494S = j;
                        return;
                    case 25188:
                        m5768t(i);
                        this.f3868t.f17491P = (int) j;
                        return;
                    case 30321:
                        m5768t(i);
                        int i3 = (int) j;
                        if (i3 == 0) {
                            this.f3868t.f17518r = 0;
                            return;
                        } else if (i3 == 1) {
                            this.f3868t.f17518r = 1;
                            return;
                        } else if (i3 == 2) {
                            this.f3868t.f17518r = 2;
                            return;
                        } else if (i3 == 3) {
                            this.f3868t.f17518r = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        m5768t(i);
                        this.f3868t.f17505e = (int) j;
                        return;
                    case 2807729:
                        this.f3865q = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                m5768t(i);
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    this.f3868t.f17476A = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.f3868t.f17476A = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                m5768t(i);
                                int b = p14.m14761b((int) j);
                                if (b != -1) {
                                    this.f3868t.f17526z = b;
                                    return;
                                }
                                return;
                            case 21947:
                                m5768t(i);
                                this.f3868t.f17524x = true;
                                int a = p14.m14760a((int) j);
                                if (a != -1) {
                                    this.f3868t.f17525y = a;
                                    return;
                                }
                                return;
                            case 21948:
                                m5768t(i);
                                this.f3868t.f17477B = (int) j;
                                return;
                            case 21949:
                                m5768t(i);
                                this.f3868t.f17478C = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                StringBuilder sb6 = new StringBuilder(55);
                sb6.append("ContentEncodingScope ");
                sb6.append(j);
                sb6.append(" not supported");
                throw C1646dz.m8223a(sb6.toString(), (Throwable) null);
            }
        } else if (j != 0) {
            StringBuilder sb7 = new StringBuilder(55);
            sb7.append("ContentEncodingOrder ");
            sb7.append(j);
            sb7.append(" not supported");
            throw C1646dz.m8223a(sb7.toString(), (Throwable) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo5048k(int i, long j, long j2) {
        wu1.m19203b(this.f3847Z);
        if (i == 160) {
            this.f3837P = false;
        } else if (i == 174) {
            this.f3868t = new C2389y((C2352x) null);
        } else if (i == 187) {
            this.f3825D = false;
        } else if (i == 19899) {
            this.f3870v = -1;
            this.f3871w = -1;
        } else if (i == 20533) {
            m5768t(i);
            this.f3868t.f17508h = true;
        } else if (i == 21968) {
            m5768t(i);
            this.f3868t.f17524x = true;
        } else if (i == 408125543) {
            long j3 = this.f3864p;
            if (j3 == -1 || j3 == j) {
                this.f3864p = j;
                this.f3863o = j2;
                return;
            }
            throw C1646dz.m8223a("Multiple Segment elements not supported", (Throwable) null);
        } else if (i == 475249515) {
            this.f3823B = new pd2(32);
            this.f3824C = new pd2(32);
        } else if (i != 524531317 || this.f3869u) {
        } else {
            if (!this.f3851c || this.f3873y == -1) {
                this.f3847Z.mo10269p(new od4(this.f3867s, 0));
                this.f3869u = true;
                return;
            }
            this.f3872x = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo5049l(int i, String str) {
        if (i == 134) {
            m5768t(i);
            this.f3868t.f17502b = str;
        } else if (i != 17026) {
            if (i == 21358) {
                m5768t(i);
                this.f3868t.f17501a = str;
            } else if (i == 2274716) {
                m5768t(i);
                this.f3868t.f17498W = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder(str.length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw C1646dz.m8223a(sb.toString(), (Throwable) null);
        }
    }
}
