package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.vh */
public final class C2295vh implements C1591ch {

    /* renamed from: Z */
    public static final C1666eh f16233Z = new C2073ph();

    /* renamed from: a0 */
    private static final byte[] f16234a0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: b0 */
    private static final byte[] f16235b0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public static final UUID f16236c0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: A */
    private C1967mm f16237A;

    /* renamed from: B */
    private C1967mm f16238B;

    /* renamed from: C */
    private boolean f16239C;

    /* renamed from: D */
    private int f16240D;

    /* renamed from: E */
    private long f16241E;

    /* renamed from: F */
    private long f16242F;

    /* renamed from: G */
    private int f16243G;

    /* renamed from: H */
    private int f16244H;

    /* renamed from: I */
    private int[] f16245I;

    /* renamed from: J */
    private int f16246J;

    /* renamed from: K */
    private int f16247K;

    /* renamed from: L */
    private int f16248L;

    /* renamed from: M */
    private int f16249M;

    /* renamed from: N */
    private boolean f16250N;

    /* renamed from: O */
    private boolean f16251O;

    /* renamed from: P */
    private boolean f16252P;

    /* renamed from: Q */
    private boolean f16253Q;

    /* renamed from: R */
    private byte f16254R;

    /* renamed from: S */
    private int f16255S;

    /* renamed from: T */
    private int f16256T;

    /* renamed from: U */
    private int f16257U;

    /* renamed from: V */
    private boolean f16258V;

    /* renamed from: W */
    private boolean f16259W;

    /* renamed from: X */
    private C1628dh f16260X;

    /* renamed from: Y */
    private final C2036oh f16261Y;

    /* renamed from: a */
    private final C2370xh f16262a;

    /* renamed from: b */
    private final SparseArray<C2258uh> f16263b;

    /* renamed from: c */
    private final boolean f16264c;

    /* renamed from: d */
    private final C2152rm f16265d;

    /* renamed from: e */
    private final C2152rm f16266e;

    /* renamed from: f */
    private final C2152rm f16267f;

    /* renamed from: g */
    private final C2152rm f16268g;

    /* renamed from: h */
    private final C2152rm f16269h;

    /* renamed from: i */
    private final C2152rm f16270i;

    /* renamed from: j */
    private final C2152rm f16271j;

    /* renamed from: k */
    private final C2152rm f16272k;

    /* renamed from: l */
    private final C2152rm f16273l;

    /* renamed from: m */
    private ByteBuffer f16274m;

    /* renamed from: n */
    private long f16275n;

    /* renamed from: o */
    private long f16276o = -1;

    /* renamed from: p */
    private long f16277p = -9223372036854775807L;

    /* renamed from: q */
    private long f16278q = -9223372036854775807L;

    /* renamed from: r */
    private long f16279r = -9223372036854775807L;

    /* renamed from: s */
    private C2258uh f16280s;

    /* renamed from: t */
    private boolean f16281t;

    /* renamed from: u */
    private int f16282u;

    /* renamed from: v */
    private long f16283v;

    /* renamed from: w */
    private boolean f16284w;

    /* renamed from: x */
    private long f16285x = -1;

    /* renamed from: y */
    private long f16286y = -1;

    /* renamed from: z */
    private long f16287z = -9223372036854775807L;

    public C2295vh(int i) {
        C2036oh ohVar = new C2036oh();
        this.f16261Y = ohVar;
        ohVar.mo9785b(new C2147rh(this, (C2110qh) null));
        this.f16264c = true;
        this.f16262a = new C2370xh();
        this.f16263b = new SparseArray<>();
        this.f16267f = new C2152rm(4);
        this.f16268g = new C2152rm(ByteBuffer.allocate(4).putInt(-1).array());
        this.f16269h = new C2152rm(4);
        this.f16265d = new C2152rm(C2078pm.f12700a);
        this.f16266e = new C2152rm(4);
        this.f16270i = new C2152rm();
        this.f16271j = new C2152rm();
        this.f16272k = new C2152rm(8);
        this.f16273l = new C2152rm();
    }

    /* renamed from: l */
    static final int m18536l(int i) {
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
            case 241:
            case 251:
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
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
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
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: m */
    static final boolean m18537m(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    /* renamed from: n */
    private final long m18538n(long j) {
        long j2 = this.f16277p;
        if (j2 != -9223372036854775807L) {
            return C2449zm.m20731j(j, j2, 1000);
        }
        throw new C1515af("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: o */
    private final void m18539o(C2258uh uhVar, long j) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(uhVar.f15573a)) {
            byte[] bArr2 = this.f16271j.f13709a;
            long j2 = this.f16242F;
            if (j2 == -9223372036854775807L) {
                bArr = f16235b0;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (((long) i) * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - ((long) (60000000 * i2));
                int i3 = (int) (j4 / 1000000);
                bArr = C2449zm.m20738q(String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - ((long) (i3 * 1000000))) / 1000))}));
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            C1925lh lhVar = uhVar.f15571O;
            C2152rm rmVar = this.f16271j;
            lhVar.mo8953c(rmVar, rmVar.mo10534d());
            this.f16257U += this.f16271j.mo10534d();
        }
        uhVar.f15571O.mo8951a(j, this.f16248L, this.f16257U, 0, uhVar.f15579g);
        this.f16258V = true;
        m18540p();
    }

    /* renamed from: p */
    private final void m18540p() {
        this.f16249M = 0;
        this.f16257U = 0;
        this.f16256T = 0;
        this.f16250N = false;
        this.f16251O = false;
        this.f16253Q = false;
        this.f16255S = 0;
        this.f16254R = 0;
        this.f16252P = false;
        this.f16270i.mo10548r();
    }

    /* renamed from: q */
    private static int[] m18541q(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    /* renamed from: r */
    private final int m18542r(C1554bh bhVar, C1925lh lhVar, int i) {
        int i2;
        int a = this.f16270i.mo10531a();
        if (a > 0) {
            i2 = Math.min(i, a);
            lhVar.mo8953c(this.f16270i, i2);
        } else {
            i2 = lhVar.mo8954d(bhVar, i, false);
        }
        this.f16249M += i2;
        this.f16257U += i2;
        return i2;
    }

    /* renamed from: s */
    private final void m18543s(C1554bh bhVar, int i) {
        if (this.f16267f.mo10534d() < i) {
            if (this.f16267f.mo10532b() < i) {
                C2152rm rmVar = this.f16267f;
                byte[] bArr = rmVar.f13709a;
                int length = bArr.length;
                rmVar.mo10550t(Arrays.copyOf(bArr, Math.max(length + length, i)), this.f16267f.mo10534d());
            }
            C2152rm rmVar2 = this.f16267f;
            bhVar.mo5861h(rmVar2.f13709a, rmVar2.mo10534d(), i - this.f16267f.mo10534d(), false);
            this.f16267f.mo10551u(i);
        }
    }

    /* renamed from: t */
    private final void m18544t(C1554bh bhVar, C2258uh uhVar, int i) {
        int i2;
        if ("S_TEXT/UTF8".equals(uhVar.f15573a)) {
            int i3 = i + 32;
            if (this.f16271j.mo10532b() < i3) {
                this.f16271j.f13709a = Arrays.copyOf(f16234a0, i3 + i);
            }
            bhVar.mo5861h(this.f16271j.f13709a, 32, i, false);
            this.f16271j.mo10552v(0);
            this.f16271j.mo10551u(i3);
            return;
        }
        C1925lh lhVar = uhVar.f15571O;
        if (!this.f16250N) {
            if (uhVar.f15577e) {
                this.f16248L &= -1073741825;
                int i4 = 128;
                if (!this.f16251O) {
                    bhVar.mo5861h(this.f16267f.f13709a, 0, 1, false);
                    this.f16249M++;
                    byte b = this.f16267f.f13709a[0];
                    if ((b & 128) != 128) {
                        this.f16254R = b;
                        this.f16251O = true;
                    } else {
                        throw new C1515af("Extension bit is set in signal byte");
                    }
                }
                byte b2 = this.f16254R;
                if ((b2 & 1) == 1) {
                    byte b3 = b2 & 2;
                    this.f16248L |= 1073741824;
                    if (!this.f16252P) {
                        bhVar.mo5861h(this.f16272k.f13709a, 0, 8, false);
                        this.f16249M += 8;
                        this.f16252P = true;
                        C2152rm rmVar = this.f16267f;
                        byte[] bArr = rmVar.f13709a;
                        if (b3 != 2) {
                            i4 = 0;
                        }
                        bArr[0] = (byte) (i4 | 8);
                        rmVar.mo10552v(0);
                        lhVar.mo8953c(this.f16267f, 1);
                        this.f16257U++;
                        this.f16272k.mo10552v(0);
                        lhVar.mo8953c(this.f16272k, 8);
                        this.f16257U += 8;
                    }
                    if (b3 == 2) {
                        if (!this.f16253Q) {
                            bhVar.mo5861h(this.f16267f.f13709a, 0, 1, false);
                            this.f16249M++;
                            this.f16267f.mo10552v(0);
                            this.f16255S = this.f16267f.mo10537g();
                            this.f16253Q = true;
                        }
                        int i5 = this.f16255S * 4;
                        this.f16267f.mo10549s(i5);
                        bhVar.mo5861h(this.f16267f.f13709a, 0, i5, false);
                        this.f16249M += i5;
                        int i6 = (this.f16255S >> 1) + 1;
                        int i7 = (i6 * 6) + 2;
                        ByteBuffer byteBuffer = this.f16274m;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.f16274m = ByteBuffer.allocate(i7);
                        }
                        this.f16274m.position(0);
                        this.f16274m.putShort((short) i6);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.f16255S;
                            if (i8 >= i2) {
                                break;
                            }
                            int i10 = this.f16267f.mo10539i();
                            if (i8 % 2 == 0) {
                                this.f16274m.putShort((short) (i10 - i9));
                            } else {
                                this.f16274m.putInt(i10 - i9);
                            }
                            i8++;
                            i9 = i10;
                        }
                        int i11 = (i - this.f16249M) - i9;
                        if ((i2 & 1) == 1) {
                            this.f16274m.putInt(i11);
                        } else {
                            this.f16274m.putShort((short) i11);
                            this.f16274m.putInt(0);
                        }
                        this.f16273l.mo10550t(this.f16274m.array(), i7);
                        lhVar.mo8953c(this.f16273l, i7);
                        this.f16257U += i7;
                    }
                }
            } else {
                byte[] bArr2 = uhVar.f15578f;
                if (bArr2 != null) {
                    this.f16270i.mo10550t(bArr2, bArr2.length);
                }
            }
            this.f16250N = true;
        }
        int d = i + this.f16270i.mo10534d();
        if (!"V_MPEG4/ISO/AVC".equals(uhVar.f15573a) && !"V_MPEGH/ISO/HEVC".equals(uhVar.f15573a)) {
            while (true) {
                int i12 = this.f16249M;
                if (i12 >= d) {
                    break;
                }
                m18542r(bhVar, lhVar, d - i12);
            }
        } else {
            byte[] bArr3 = this.f16266e.f13709a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i13 = uhVar.f15572P;
            int i14 = 4 - i13;
            while (this.f16249M < d) {
                int i15 = this.f16256T;
                if (i15 == 0) {
                    int min = Math.min(i13, this.f16270i.mo10531a());
                    bhVar.mo5861h(bArr3, i14 + min, i13 - min, false);
                    if (min > 0) {
                        this.f16270i.mo10547q(bArr3, i14, min);
                    }
                    this.f16249M += i13;
                    this.f16266e.mo10552v(0);
                    this.f16256T = this.f16266e.mo10539i();
                    this.f16265d.mo10552v(0);
                    lhVar.mo8953c(this.f16265d, 4);
                    this.f16257U += 4;
                } else {
                    this.f16256T = i15 - m18542r(bhVar, lhVar, i15);
                }
            }
        }
        if ("A_VORBIS".equals(uhVar.f15573a)) {
            this.f16268g.mo10552v(0);
            lhVar.mo8953c(this.f16268g, 4);
            this.f16257U += 4;
        }
    }

    /* renamed from: b */
    public final void mo6196b(long j, long j2) {
        this.f16287z = -9223372036854775807L;
        this.f16240D = 0;
        this.f16261Y.mo9784a();
        this.f16262a.mo11844d();
        m18540p();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo11469c(int i) {
        C1851jh jhVar;
        C1967mm mmVar;
        C1967mm mmVar2;
        int i2;
        int i3 = 0;
        if (i != 160) {
            if (i == 174) {
                String str = this.f16280s.f15573a;
                if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                    C2258uh uhVar = this.f16280s;
                    uhVar.mo11222b(this.f16260X, uhVar.f15574b);
                    SparseArray<C2258uh> sparseArray = this.f16263b;
                    C2258uh uhVar2 = this.f16280s;
                    sparseArray.put(uhVar2.f15574b, uhVar2);
                }
                this.f16280s = null;
            } else if (i == 19899) {
                int i4 = this.f16282u;
                if (i4 != -1) {
                    long j = this.f16283v;
                    if (j != -1) {
                        if (i4 == 475249515) {
                            this.f16285x = j;
                            return;
                        }
                        return;
                    }
                }
                throw new C1515af("Mandatory element SeekID or SeekPosition not found");
            } else if (i == 25152) {
                C2258uh uhVar3 = this.f16280s;
                if (!uhVar3.f15577e) {
                    return;
                }
                if (uhVar3.f15579g != null) {
                    uhVar3.f15581i = new C2406yg(new C2369xg(C1774he.f8172b, "video/webm", this.f16280s.f15579g.f9534b, false));
                    return;
                }
                throw new C1515af("Encrypted Track found but ContentEncKeyID was not found");
            } else if (i == 28032) {
                C2258uh uhVar4 = this.f16280s;
                if (uhVar4.f15577e && uhVar4.f15578f != null) {
                    throw new C1515af("Combining encryption and compression is not supported");
                }
            } else if (i == 357149030) {
                if (this.f16277p == -9223372036854775807L) {
                    this.f16277p = 1000000;
                }
                long j2 = this.f16278q;
                if (j2 != -9223372036854775807L) {
                    this.f16279r = m18538n(j2);
                }
            } else if (i != 374648427) {
                if (i == 475249515 && !this.f16281t) {
                    C1628dh dhVar = this.f16260X;
                    if (this.f16276o == -1 || this.f16279r == -9223372036854775807L || (mmVar = this.f16237A) == null || mmVar.mo9279a() == 0 || (mmVar2 = this.f16238B) == null || mmVar2.mo9279a() != this.f16237A.mo9279a()) {
                        this.f16237A = null;
                        this.f16238B = null;
                        jhVar = new C1814ih(this.f16279r);
                    } else {
                        int a = this.f16237A.mo9279a();
                        int[] iArr = new int[a];
                        long[] jArr = new long[a];
                        long[] jArr2 = new long[a];
                        long[] jArr3 = new long[a];
                        for (int i5 = 0; i5 < a; i5++) {
                            jArr3[i5] = this.f16237A.mo9280b(i5);
                            jArr[i5] = this.f16276o + this.f16238B.mo9280b(i5);
                        }
                        while (true) {
                            i2 = a - 1;
                            if (i3 >= i2) {
                                break;
                            }
                            int i6 = i3 + 1;
                            iArr[i3] = (int) (jArr[i6] - jArr[i3]);
                            jArr2[i3] = jArr3[i6] - jArr3[i3];
                            i3 = i6;
                        }
                        iArr[i2] = (int) ((this.f16276o + this.f16275n) - jArr[i2]);
                        jArr2[i2] = this.f16279r - jArr3[i2];
                        this.f16237A = null;
                        this.f16238B = null;
                        jhVar = new C1517ah(iArr, jArr, jArr2, jArr3);
                    }
                    dhVar.mo6475b(jhVar);
                    this.f16281t = true;
                }
            } else if (this.f16263b.size() != 0) {
                this.f16260X.mo6474a();
            } else {
                throw new C1515af("No valid tracks were found");
            }
        } else if (this.f16240D == 2) {
            if (!this.f16259W) {
                this.f16248L |= 1;
            }
            m18539o(this.f16263b.get(this.f16246J), this.f16241E);
            this.f16240D = 0;
        }
    }

    /* renamed from: d */
    public final boolean mo6197d(C1554bh bhVar) {
        return new C2333wh().mo11653a(bhVar);
    }

    /* renamed from: e */
    public final int mo6198e(C1554bh bhVar, C1777hh hhVar) {
        this.f16258V = false;
        while (!this.f16258V) {
            if (!this.f16261Y.mo9786c(bhVar)) {
                return -1;
            }
            long d = bhVar.mo5857d();
            if (this.f16284w) {
                this.f16286y = d;
                hhVar.f8220a = this.f16285x;
                this.f16284w = false;
                return 1;
            } else if (this.f16281t) {
                long j = this.f16286y;
                if (j != -1) {
                    hhVar.f8220a = j;
                    this.f16286y = -1;
                    return 1;
                }
            }
        }
        return 0;
    }

    /* renamed from: f */
    public final void mo6199f(C1628dh dhVar) {
        this.f16260X = dhVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo11470g(int i, double d) {
        if (i == 181) {
            this.f16280s.f15565I = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    this.f16280s.f15595w = (float) d;
                    return;
                case 21970:
                    this.f16280s.f15596x = (float) d;
                    return;
                case 21971:
                    this.f16280s.f15597y = (float) d;
                    return;
                case 21972:
                    this.f16280s.f15598z = (float) d;
                    return;
                case 21973:
                    this.f16280s.f15557A = (float) d;
                    return;
                case 21974:
                    this.f16280s.f15558B = (float) d;
                    return;
                case 21975:
                    this.f16280s.f15559C = (float) d;
                    return;
                case 21976:
                    this.f16280s.f15560D = (float) d;
                    return;
                case 21977:
                    this.f16280s.f15561E = (float) d;
                    return;
                case 21978:
                    this.f16280s.f15562F = (float) d;
                    return;
                default:
                    return;
            }
        } else {
            this.f16278q = (long) d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo11471h(int i, long j) {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        this.f16280s.f15575c = (int) j;
                        return;
                    case 136:
                        C2258uh uhVar = this.f16280s;
                        if (j == 1) {
                            z = true;
                        }
                        uhVar.f15568L = z;
                        return;
                    case 155:
                        this.f16242F = m18538n(j);
                        return;
                    case 159:
                        this.f16280s.f15563G = (int) j;
                        return;
                    case 176:
                        this.f16280s.f15582j = (int) j;
                        return;
                    case 179:
                        this.f16237A.mo9281c(m18538n(j));
                        return;
                    case 186:
                        this.f16280s.f15583k = (int) j;
                        return;
                    case 215:
                        this.f16280s.f15574b = (int) j;
                        return;
                    case 231:
                        this.f16287z = m18538n(j);
                        return;
                    case 241:
                        if (!this.f16239C) {
                            this.f16238B.mo9281c(j);
                            this.f16239C = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f16259W = true;
                        return;
                    case 16980:
                        if (j != 3) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("ContentCompAlgo ");
                            sb.append(j);
                            sb.append(" not supported");
                            throw new C1515af(sb.toString());
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j);
                            sb2.append(" not supported");
                            throw new C1515af(sb2.toString());
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j);
                            sb3.append(" not supported");
                            throw new C1515af(sb3.toString());
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            StringBuilder sb4 = new StringBuilder(49);
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j);
                            sb4.append(" not supported");
                            throw new C1515af(sb4.toString());
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            StringBuilder sb5 = new StringBuilder(56);
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j);
                            sb5.append(" not supported");
                            throw new C1515af(sb5.toString());
                        }
                        return;
                    case 21420:
                        this.f16283v = j + this.f16276o;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        if (i2 == 0) {
                            this.f16280s.f15588p = 0;
                            return;
                        } else if (i2 == 1) {
                            this.f16280s.f15588p = 2;
                            return;
                        } else if (i2 == 3) {
                            this.f16280s.f15588p = 1;
                            return;
                        } else if (i2 == 15) {
                            this.f16280s.f15588p = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        this.f16280s.f15584l = (int) j;
                        return;
                    case 21682:
                        this.f16280s.f15586n = (int) j;
                        return;
                    case 21690:
                        this.f16280s.f15585m = (int) j;
                        return;
                    case 21930:
                        C2258uh uhVar2 = this.f16280s;
                        if (j == 1) {
                            z = true;
                        }
                        uhVar2.f15569M = z;
                        return;
                    case 22186:
                        this.f16280s.f15566J = j;
                        return;
                    case 22203:
                        this.f16280s.f15567K = j;
                        return;
                    case 25188:
                        this.f16280s.f15564H = (int) j;
                        return;
                    case 2352003:
                        this.f16280s.f15576d = (int) j;
                        return;
                    case 2807729:
                        this.f16277p = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                int i3 = (int) j;
                                if (i3 == 1) {
                                    this.f16280s.f15592t = 2;
                                    return;
                                } else if (i3 == 2) {
                                    this.f16280s.f15592t = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i4 = (int) j;
                                if (i4 != 1) {
                                    if (i4 == 16) {
                                        this.f16280s.f15591s = 6;
                                        return;
                                    } else if (i4 == 18) {
                                        this.f16280s.f15591s = 7;
                                        return;
                                    } else if (!(i4 == 6 || i4 == 7)) {
                                        return;
                                    }
                                }
                                this.f16280s.f15591s = 3;
                                return;
                            case 21947:
                                C2258uh uhVar3 = this.f16280s;
                                uhVar3.f15589q = true;
                                int i5 = (int) j;
                                if (i5 == 1) {
                                    uhVar3.f15590r = 1;
                                    return;
                                } else if (i5 == 9) {
                                    uhVar3.f15590r = 6;
                                    return;
                                } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                    uhVar3.f15590r = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                this.f16280s.f15593u = (int) j;
                                return;
                            case 21949:
                                this.f16280s.f15594v = (int) j;
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
                throw new C1515af(sb6.toString());
            }
        } else if (j != 0) {
            StringBuilder sb7 = new StringBuilder(55);
            sb7.append("ContentEncodingOrder ");
            sb7.append(j);
            sb7.append(" not supported");
            throw new C1515af(sb7.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo11472i(int i, long j, long j2) {
        if (i == 160) {
            this.f16259W = false;
        } else if (i == 174) {
            this.f16280s = new C2258uh((C2184sh) null);
        } else if (i == 187) {
            this.f16239C = false;
        } else if (i == 19899) {
            this.f16282u = -1;
            this.f16283v = -1;
        } else if (i == 20533) {
            this.f16280s.f15577e = true;
        } else if (i == 21968) {
            this.f16280s.f15589q = true;
        } else if (i == 408125543) {
            long j3 = this.f16276o;
            if (j3 == -1 || j3 == j) {
                this.f16276o = j;
                this.f16275n = j2;
                return;
            }
            throw new C1515af("Multiple Segment elements not supported");
        } else if (i == 475249515) {
            this.f16237A = new C1967mm(32);
            this.f16238B = new C1967mm(32);
        } else if (i != 524531317 || this.f16281t) {
        } else {
            if (!this.f16264c || this.f16285x == -1) {
                this.f16260X.mo6475b(new C1814ih(this.f16279r));
                this.f16281t = true;
                return;
            }
            this.f16284w = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo11473j(int i, String str) {
        if (i == 134) {
            this.f16280s.f15573a = str;
        } else if (i != 17026) {
            if (i == 2274716) {
                this.f16280s.f15570N = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder(str.length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new C1515af(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ed, code lost:
        throw new com.google.android.gms.internal.ads.C1515af("EBML lacing sample size out of range.");
     */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0240  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11474k(int r19, int r20, com.google.android.gms.internal.ads.C1554bh r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = 161(0xa1, float:2.26E-43)
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 1
            r7 = 0
            if (r1 == r4) goto L_0x008b
            if (r1 == r5) goto L_0x008b
            r4 = 16981(0x4255, float:2.3795E-41)
            if (r1 == r4) goto L_0x0081
            r4 = 18402(0x47e2, float:2.5787E-41)
            if (r1 == r4) goto L_0x0072
            r4 = 21419(0x53ab, float:3.0014E-41)
            if (r1 == r4) goto L_0x0053
            r4 = 25506(0x63a2, float:3.5742E-41)
            if (r1 == r4) goto L_0x0049
            r4 = 30322(0x7672, float:4.249E-41)
            if (r1 != r4) goto L_0x0030
            com.google.android.gms.internal.ads.uh r1 = r0.f16280s
            byte[] r4 = new byte[r2]
            r1.f15587o = r4
            r3.mo5861h(r4, r7, r2, r7)
            return
        L_0x0030:
            com.google.android.gms.internal.ads.af r2 = new com.google.android.gms.internal.ads.af
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 26
            r3.<init>(r4)
            java.lang.String r4 = "Unexpected id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0049:
            com.google.android.gms.internal.ads.uh r1 = r0.f16280s
            byte[] r4 = new byte[r2]
            r1.f15580h = r4
            r3.mo5861h(r4, r7, r2, r7)
            return
        L_0x0053:
            com.google.android.gms.internal.ads.rm r1 = r0.f16269h
            byte[] r1 = r1.f13709a
            java.util.Arrays.fill(r1, r7)
            com.google.android.gms.internal.ads.rm r1 = r0.f16269h
            byte[] r1 = r1.f13709a
            int r4 = 4 - r2
            r3.mo5861h(r1, r4, r2, r7)
            com.google.android.gms.internal.ads.rm r1 = r0.f16269h
            r1.mo10552v(r7)
            com.google.android.gms.internal.ads.rm r1 = r0.f16269h
            long r1 = r1.mo10543m()
            int r1 = (int) r1
            r0.f16282u = r1
            return
        L_0x0072:
            byte[] r1 = new byte[r2]
            r3.mo5861h(r1, r7, r2, r7)
            com.google.android.gms.internal.ads.uh r2 = r0.f16280s
            com.google.android.gms.internal.ads.kh r3 = new com.google.android.gms.internal.ads.kh
            r3.<init>(r6, r1)
            r2.f15579g = r3
            return
        L_0x0081:
            com.google.android.gms.internal.ads.uh r1 = r0.f16280s
            byte[] r4 = new byte[r2]
            r1.f15578f = r4
            r3.mo5861h(r4, r7, r2, r7)
            return
        L_0x008b:
            int r4 = r0.f16240D
            r8 = 8
            if (r4 != 0) goto L_0x00b0
            com.google.android.gms.internal.ads.xh r4 = r0.f16262a
            long r9 = r4.mo11845e(r3, r7, r6, r8)
            int r4 = (int) r9
            r0.f16246J = r4
            com.google.android.gms.internal.ads.xh r4 = r0.f16262a
            int r4 = r4.mo11843a()
            r0.f16247K = r4
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f16242F = r9
            r0.f16240D = r6
            com.google.android.gms.internal.ads.rm r4 = r0.f16267f
            r4.mo10548r()
        L_0x00b0:
            android.util.SparseArray<com.google.android.gms.internal.ads.uh> r4 = r0.f16263b
            int r9 = r0.f16246J
            java.lang.Object r4 = r4.get(r9)
            com.google.android.gms.internal.ads.uh r4 = (com.google.android.gms.internal.ads.C2258uh) r4
            if (r4 != 0) goto L_0x00c6
            int r1 = r0.f16247K
            int r1 = r2 - r1
            r3.mo5862i(r1, r7)
            r0.f16240D = r7
            return
        L_0x00c6:
            int r9 = r0.f16240D
            if (r9 != r6) goto L_0x025c
            r9 = 3
            r0.m18543s(r3, r9)
            com.google.android.gms.internal.ads.rm r10 = r0.f16267f
            byte[] r10 = r10.f13709a
            r11 = 2
            byte r10 = r10[r11]
            r10 = r10 & 6
            int r10 = r10 >> r6
            r12 = 255(0xff, float:3.57E-43)
            if (r10 != 0) goto L_0x00ef
            r0.f16244H = r6
            int[] r9 = r0.f16245I
            int[] r9 = m18541q(r9, r6)
            r0.f16245I = r9
            int r10 = r0.f16247K
            int r2 = r2 - r10
            int r2 = r2 + -3
            r9[r7] = r2
            goto L_0x01ff
        L_0x00ef:
            if (r1 != r5) goto L_0x0254
            r13 = 4
            r0.m18543s(r3, r13)
            com.google.android.gms.internal.ads.rm r14 = r0.f16267f
            byte[] r14 = r14.f13709a
            byte r14 = r14[r9]
            r14 = r14 & r12
            int r14 = r14 + r6
            r0.f16244H = r14
            int[] r15 = r0.f16245I
            int[] r14 = m18541q(r15, r14)
            r0.f16245I = r14
            if (r10 != r11) goto L_0x0116
            int r9 = r0.f16247K
            int r10 = r0.f16244H
            int r2 = r2 - r9
            int r2 = r2 + -4
            int r2 = r2 / r10
            java.util.Arrays.fill(r14, r7, r10, r2)
            goto L_0x01ff
        L_0x0116:
            if (r10 != r6) goto L_0x014b
            r9 = r7
            r10 = r9
        L_0x011a:
            int r14 = r0.f16244H
            int r14 = r14 + -1
            if (r9 >= r14) goto L_0x0140
            int[] r14 = r0.f16245I
            r14[r9] = r7
        L_0x0124:
            int r13 = r13 + r6
            r0.m18543s(r3, r13)
            com.google.android.gms.internal.ads.rm r14 = r0.f16267f
            byte[] r14 = r14.f13709a
            int r15 = r13 + -1
            byte r14 = r14[r15]
            r14 = r14 & r12
            int[] r15 = r0.f16245I
            r16 = r15[r9]
            int r16 = r16 + r14
            r15[r9] = r16
            if (r14 == r12) goto L_0x0124
            int r10 = r10 + r16
            int r9 = r9 + 1
            goto L_0x011a
        L_0x0140:
            int[] r9 = r0.f16245I
            int r15 = r0.f16247K
            int r2 = r2 - r15
            int r2 = r2 - r13
            int r2 = r2 - r10
            r9[r14] = r2
            goto L_0x01ff
        L_0x014b:
            if (r10 != r9) goto L_0x024c
            r9 = r7
            r10 = r9
        L_0x014f:
            int r14 = r0.f16244H
            int r14 = r14 + -1
            if (r9 >= r14) goto L_0x01f6
            int[] r14 = r0.f16245I
            r14[r9] = r7
            int r13 = r13 + 1
            r0.m18543s(r3, r13)
            int r14 = r13 + -1
            com.google.android.gms.internal.ads.rm r15 = r0.f16267f
            byte[] r15 = r15.f13709a
            byte r15 = r15[r14]
            if (r15 == 0) goto L_0x01ee
            r15 = r7
        L_0x0169:
            if (r15 >= r8) goto L_0x01bd
            int r16 = 7 - r15
            int r5 = r6 << r16
            com.google.android.gms.internal.ads.rm r11 = r0.f16267f
            byte[] r11 = r11.f13709a
            byte r11 = r11[r14]
            r11 = r11 & r5
            if (r11 == 0) goto L_0x01b2
            int r13 = r13 + r15
            r0.m18543s(r3, r13)
            int r11 = r14 + 1
            com.google.android.gms.internal.ads.rm r6 = r0.f16267f
            byte[] r6 = r6.f13709a
            byte r6 = r6[r14]
            r6 = r6 & r12
            int r5 = ~r5
            r5 = r5 & r6
            long r5 = (long) r5
        L_0x0188:
            if (r11 >= r13) goto L_0x01a0
            int r14 = r11 + 1
            long r5 = r5 << r8
            com.google.android.gms.internal.ads.rm r8 = r0.f16267f
            byte[] r8 = r8.f13709a
            byte r8 = r8[r11]
            r8 = r8 & r12
            r17 = r13
            long r12 = (long) r8
            long r5 = r5 | r12
            r11 = r14
            r13 = r17
            r8 = 8
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x0188
        L_0x01a0:
            r17 = r13
            if (r9 <= 0) goto L_0x01af
            r12 = 1
            int r15 = r15 * 7
            int r15 = r15 + 6
            long r12 = r12 << r15
            r14 = -1
            long r12 = r12 + r14
            long r5 = r5 - r12
        L_0x01af:
            r13 = r17
            goto L_0x01bf
        L_0x01b2:
            int r15 = r15 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 1
            r8 = 8
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x0169
        L_0x01bd:
            r5 = 0
        L_0x01bf:
            r14 = -2147483648(0xffffffff80000000, double:NaN)
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 < 0) goto L_0x01e6
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 > 0) goto L_0x01e6
            int r5 = (int) r5
            int[] r6 = r0.f16245I
            if (r9 == 0) goto L_0x01d7
            int r8 = r9 + -1
            r8 = r6[r8]
            int r5 = r5 + r8
        L_0x01d7:
            r6[r9] = r5
            int r10 = r10 + r5
            int r9 = r9 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 1
            r8 = 8
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x014f
        L_0x01e6:
            com.google.android.gms.internal.ads.af r1 = new com.google.android.gms.internal.ads.af
            java.lang.String r2 = "EBML lacing sample size out of range."
            r1.<init>(r2)
            throw r1
        L_0x01ee:
            com.google.android.gms.internal.ads.af r1 = new com.google.android.gms.internal.ads.af
            java.lang.String r2 = "No valid varint length mask found"
            r1.<init>(r2)
            throw r1
        L_0x01f6:
            int[] r5 = r0.f16245I
            int r6 = r0.f16247K
            int r2 = r2 - r6
            int r2 = r2 - r13
            int r2 = r2 - r10
            r5[r14] = r2
        L_0x01ff:
            com.google.android.gms.internal.ads.rm r2 = r0.f16267f
            byte[] r2 = r2.f13709a
            byte r5 = r2[r7]
            r6 = 1
            byte r2 = r2[r6]
            long r8 = r0.f16287z
            r6 = 8
            int r5 = r5 << r6
            r6 = 255(0xff, float:3.57E-43)
            r2 = r2 & r6
            r2 = r2 | r5
            long r5 = (long) r2
            long r5 = r0.m18538n(r5)
            long r8 = r8 + r5
            r0.f16241E = r8
            com.google.android.gms.internal.ads.rm r2 = r0.f16267f
            byte[] r2 = r2.f13709a
            r5 = 2
            byte r2 = r2[r5]
            r6 = r2 & 8
            int r8 = r4.f15575c
            if (r8 == r5) goto L_0x0238
            r5 = 163(0xa3, float:2.28E-43)
            if (r1 != r5) goto L_0x0236
            r1 = 128(0x80, float:1.794E-43)
            r2 = r2 & r1
            if (r2 != r1) goto L_0x0232
            r1 = 163(0xa3, float:2.28E-43)
            goto L_0x0238
        L_0x0232:
            r2 = r7
            r1 = 163(0xa3, float:2.28E-43)
            goto L_0x0239
        L_0x0236:
            r2 = r7
            goto L_0x0239
        L_0x0238:
            r2 = 1
        L_0x0239:
            r5 = 8
            if (r6 != r5) goto L_0x0240
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0241
        L_0x0240:
            r5 = r7
        L_0x0241:
            r2 = r2 | r5
            r0.f16248L = r2
            r2 = 2
            r0.f16240D = r2
            r0.f16243G = r7
            r2 = 163(0xa3, float:2.28E-43)
            goto L_0x025d
        L_0x024c:
            com.google.android.gms.internal.ads.af r1 = new com.google.android.gms.internal.ads.af
            java.lang.String r2 = "Unexpected lacing value: 2"
            r1.<init>(r2)
            throw r1
        L_0x0254:
            com.google.android.gms.internal.ads.af r1 = new com.google.android.gms.internal.ads.af
            java.lang.String r2 = "Lacing only supported in SimpleBlocks."
            r1.<init>(r2)
            throw r1
        L_0x025c:
            r2 = r5
        L_0x025d:
            if (r1 != r2) goto L_0x0284
        L_0x025f:
            int r1 = r0.f16243G
            int r2 = r0.f16244H
            if (r1 >= r2) goto L_0x0281
            int[] r2 = r0.f16245I
            r1 = r2[r1]
            r0.m18544t(r3, r4, r1)
            long r1 = r0.f16241E
            int r5 = r0.f16243G
            int r6 = r4.f15576d
            int r5 = r5 * r6
            int r5 = r5 / 1000
            long r5 = (long) r5
            long r1 = r1 + r5
            r0.m18539o(r4, r1)
            int r1 = r0.f16243G
            r2 = 1
            int r1 = r1 + r2
            r0.f16243G = r1
            goto L_0x025f
        L_0x0281:
            r0.f16240D = r7
            return
        L_0x0284:
            int[] r1 = r0.f16245I
            r1 = r1[r7]
            r0.m18544t(r3, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2295vh.mo11474k(int, int, com.google.android.gms.internal.ads.bh):void");
    }
}
