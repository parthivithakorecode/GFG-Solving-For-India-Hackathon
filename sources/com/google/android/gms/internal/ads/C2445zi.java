package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
/* renamed from: com.google.android.gms.internal.ads.zi */
public abstract class C2445zi extends C1737ge {

    /* renamed from: P */
    private static final byte[] f18194P = C2449zm.m20737p("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");

    /* renamed from: A */
    private ByteBuffer[] f18195A;

    /* renamed from: B */
    private ByteBuffer[] f18196B;

    /* renamed from: C */
    private long f18197C;

    /* renamed from: D */
    private int f18198D;

    /* renamed from: E */
    private int f18199E;

    /* renamed from: F */
    private boolean f18200F;

    /* renamed from: G */
    private boolean f18201G;

    /* renamed from: H */
    private int f18202H;

    /* renamed from: I */
    private int f18203I;

    /* renamed from: J */
    private boolean f18204J;

    /* renamed from: K */
    private boolean f18205K;

    /* renamed from: L */
    private boolean f18206L;

    /* renamed from: M */
    private boolean f18207M;

    /* renamed from: N */
    private boolean f18208N;

    /* renamed from: O */
    protected C2220tg f18209O;

    /* renamed from: i */
    private final C1556bj f18210i;

    /* renamed from: j */
    private final C2257ug f18211j;

    /* renamed from: k */
    private final C2257ug f18212k;

    /* renamed from: l */
    private final C2404ye f18213l;

    /* renamed from: m */
    private final List<Long> f18214m;

    /* renamed from: n */
    private final MediaCodec.BufferInfo f18215n;

    /* renamed from: o */
    private C2367xe f18216o;

    /* renamed from: p */
    private MediaCodec f18217p;

    /* renamed from: q */
    private C2371xi f18218q;

    /* renamed from: r */
    private boolean f18219r;

    /* renamed from: s */
    private boolean f18220s;

    /* renamed from: t */
    private boolean f18221t;

    /* renamed from: u */
    private boolean f18222u;

    /* renamed from: v */
    private boolean f18223v;

    /* renamed from: w */
    private boolean f18224w;

    /* renamed from: x */
    private boolean f18225x;

    /* renamed from: y */
    private boolean f18226y;

    /* renamed from: z */
    private boolean f18227z;

    public C2445zi(int i, C1556bj bjVar, C2443zg zgVar, boolean z) {
        super(i);
        C1856jm.m11730e(C2449zm.f18287a >= 16);
        this.f18210i = bjVar;
        this.f18211j = new C2257ug(0);
        this.f18212k = new C2257ug(0);
        this.f18213l = new C2404ye();
        this.f18214m = new ArrayList();
        this.f18215n = new MediaCodec.BufferInfo();
        this.f18202H = 0;
        this.f18203I = 0;
    }

    /* renamed from: C */
    private final void mo8159C() {
        if (this.f18203I == 2) {
            mo8166S();
            mo12226Q();
            return;
        }
        this.f18207M = true;
        mo8663M();
    }

    /* renamed from: D */
    private final boolean m20663D() {
        MediaCodec mediaCodec = this.f18217p;
        if (mediaCodec == null || this.f18203I == 2 || this.f18206L) {
            return false;
        }
        if (this.f18198D < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0);
            this.f18198D = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            C2257ug ugVar = this.f18211j;
            ugVar.f15546c = this.f18195A[dequeueInputBuffer];
            ugVar.mo9759b();
        }
        if (this.f18203I == 1) {
            if (!this.f18222u) {
                this.f18205K = true;
                this.f18217p.queueInputBuffer(this.f18198D, 0, 0, 0, 4);
                this.f18198D = -1;
            }
            this.f18203I = 2;
            return false;
        } else if (this.f18226y) {
            this.f18226y = false;
            ByteBuffer byteBuffer = this.f18211j.f15546c;
            byte[] bArr = f18194P;
            byteBuffer.put(bArr);
            MediaCodec mediaCodec2 = this.f18217p;
            int i = this.f18198D;
            int length = bArr.length;
            mediaCodec2.queueInputBuffer(i, 0, 38, 0, 0);
            this.f18198D = -1;
            this.f18204J = true;
            return true;
        } else {
            if (this.f18202H == 1) {
                for (int i2 = 0; i2 < this.f18216o.f17165m.size(); i2++) {
                    this.f18211j.f15546c.put(this.f18216o.f17165m.get(i2));
                }
                this.f18202H = 2;
            }
            int position = this.f18211j.f15546c.position();
            int l = mo7595l(this.f18213l, this.f18211j, false);
            if (l == -3) {
                return false;
            }
            if (l == -5) {
                if (this.f18202H == 2) {
                    this.f18211j.mo9759b();
                    this.f18202H = 1;
                }
                mo8162J(this.f18213l.f17688a);
                return true;
            } else if (this.f18211j.mo9763f()) {
                if (this.f18202H == 2) {
                    this.f18211j.mo9759b();
                    this.f18202H = 1;
                }
                this.f18206L = true;
                if (!this.f18204J) {
                    mo8159C();
                    return false;
                }
                try {
                    if (!this.f18222u) {
                        this.f18205K = true;
                        this.f18217p.queueInputBuffer(this.f18198D, 0, 0, 0, 4);
                        this.f18198D = -1;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw C1811ie.m11004a(e, mo7594k());
                }
            } else if (!this.f18208N || this.f18211j.mo9764g()) {
                this.f18208N = false;
                boolean i3 = this.f18211j.mo11220i();
                if (this.f18219r && !i3) {
                    ByteBuffer byteBuffer2 = this.f18211j.f15546c;
                    byte[] bArr2 = C2078pm.f12700a;
                    int position2 = byteBuffer2.position();
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        int i6 = i4 + 1;
                        if (i6 >= position2) {
                            byteBuffer2.clear();
                            break;
                        }
                        byte b = byteBuffer2.get(i4) & 255;
                        if (i5 == 3) {
                            if (b == 1) {
                                if ((byteBuffer2.get(i6) & 31) == 7) {
                                    ByteBuffer duplicate = byteBuffer2.duplicate();
                                    duplicate.position(i4 - 3);
                                    duplicate.limit(position2);
                                    byteBuffer2.position(0);
                                    byteBuffer2.put(duplicate);
                                    break;
                                }
                                b = 1;
                            }
                        } else if (b == 0) {
                            i5++;
                        }
                        if (b != 0) {
                            i5 = 0;
                        }
                        i4 = i6;
                    }
                    if (this.f18211j.f15546c.position() == 0) {
                        return true;
                    }
                    this.f18219r = false;
                }
                try {
                    C2257ug ugVar2 = this.f18211j;
                    long j = ugVar2.f15547d;
                    if (ugVar2.mo9762e()) {
                        this.f18214m.add(Long.valueOf(j));
                    }
                    this.f18211j.f15546c.flip();
                    mo8165R(this.f18211j);
                    if (i3) {
                        MediaCodec.CryptoInfo a = this.f18211j.f15545b.mo10519a();
                        if (position != 0) {
                            if (a.numBytesOfClearData == null) {
                                a.numBytesOfClearData = new int[1];
                            }
                            int[] iArr = a.numBytesOfClearData;
                            iArr[0] = iArr[0] + position;
                        }
                        this.f18217p.queueSecureInputBuffer(this.f18198D, 0, a, j, 0);
                    } else {
                        this.f18217p.queueInputBuffer(this.f18198D, 0, this.f18211j.f15546c.limit(), j, 0);
                    }
                    this.f18198D = -1;
                    this.f18204J = true;
                    this.f18202H = 0;
                    this.f18209O.f14842c++;
                    return true;
                } catch (MediaCodec.CryptoException e2) {
                    throw C1811ie.m11004a(e2, mo7594k());
                }
            } else {
                this.f18211j.mo9759b();
                if (this.f18202H == 2) {
                    this.f18202H = 1;
                }
                return true;
            }
        }
    }

    /* renamed from: A */
    public boolean mo6169A() {
        if (this.f18216o != null) {
            if (mo7593j() || this.f18199E >= 0) {
                return true;
            }
            if (this.f18197C != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f18197C) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public C2371xi mo8662E(C1556bj bjVar, C2367xe xeVar, boolean z) {
        return C1853jj.m11671c(xeVar.f17163k, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public abstract void mo8160H(C2371xi xiVar, MediaCodec mediaCodec, C2367xe xeVar, MediaCrypto mediaCrypto);

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract void mo8161I(String str, long j, long j2);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r6.f17168p == r0.f17168p) goto L_0x0053;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8162J(com.google.android.gms.internal.ads.C2367xe r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.xe r0 = r5.f18216o
            r5.f18216o = r6
            com.google.android.gms.internal.ads.yg r6 = r6.f17166n
            if (r0 != 0) goto L_0x000a
            r1 = 0
            goto L_0x000c
        L_0x000a:
            com.google.android.gms.internal.ads.yg r1 = r0.f17166n
        L_0x000c:
            boolean r6 = com.google.android.gms.internal.ads.C2449zm.m20736o(r6, r1)
            if (r6 != 0) goto L_0x0029
            com.google.android.gms.internal.ads.xe r6 = r5.f18216o
            com.google.android.gms.internal.ads.yg r6 = r6.f17166n
            if (r6 != 0) goto L_0x0019
            goto L_0x0029
        L_0x0019:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r6.<init>(r0)
            int r0 = r5.mo7594k()
            com.google.android.gms.internal.ads.ie r6 = com.google.android.gms.internal.ads.C1811ie.m11004a(r6, r0)
            throw r6
        L_0x0029:
            android.media.MediaCodec r6 = r5.f18217p
            r1 = 1
            if (r6 == 0) goto L_0x0056
            com.google.android.gms.internal.ads.xi r2 = r5.f18218q
            boolean r2 = r2.f17215b
            com.google.android.gms.internal.ads.xe r3 = r5.f18216o
            boolean r6 = r5.mo8167T(r6, r2, r0, r3)
            if (r6 == 0) goto L_0x0056
            r5.f18201G = r1
            r5.f18202H = r1
            boolean r6 = r5.f18221t
            r2 = 0
            if (r6 == 0) goto L_0x0052
            com.google.android.gms.internal.ads.xe r6 = r5.f18216o
            int r3 = r6.f17167o
            int r4 = r0.f17167o
            if (r3 != r4) goto L_0x0052
            int r6 = r6.f17168p
            int r0 = r0.f17168p
            if (r6 != r0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r1 = r2
        L_0x0053:
            r5.f18226y = r1
            return
        L_0x0056:
            boolean r6 = r5.f18204J
            if (r6 == 0) goto L_0x005d
            r5.f18203I = r1
            return
        L_0x005d:
            r5.mo8166S()
            r5.mo12226Q()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2445zi.mo8162J(com.google.android.gms.internal.ads.xe):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public abstract void mo8163K(MediaCodec mediaCodec, MediaFormat mediaFormat);

    /* renamed from: L */
    public boolean mo6173L() {
        return this.f18207M;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo8663M() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public abstract boolean mo8164N(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final MediaCodec mo12224O() {
        return this.f18217p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final C2371xi mo12225P() {
        return this.f18218q;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x015c A[Catch:{ Exception -> 0x01d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0161 A[Catch:{ Exception -> 0x01d1 }] */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12226Q() {
        /*
            r11 = this;
            android.media.MediaCodec r0 = r11.f18217p
            if (r0 != 0) goto L_0x01e2
            com.google.android.gms.internal.ads.xe r0 = r11.f18216o
            if (r0 != 0) goto L_0x000a
            goto L_0x01e2
        L_0x000a:
            com.google.android.gms.internal.ads.xi r1 = r11.f18218q
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x0042
            com.google.android.gms.internal.ads.bj r1 = r11.f18210i     // Catch:{ ej -> 0x002e }
            com.google.android.gms.internal.ads.xi r1 = r11.mo8662E(r1, r0, r3)     // Catch:{ ej -> 0x002e }
            r11.f18218q = r1     // Catch:{ ej -> 0x002e }
            if (r1 == 0) goto L_0x001b
            goto L_0x0042
        L_0x001b:
            com.google.android.gms.internal.ads.yi r0 = new com.google.android.gms.internal.ads.yi
            com.google.android.gms.internal.ads.xe r1 = r11.f18216o
            r4 = -49999(0xffffffffffff3cb1, float:NaN)
            r0.<init>((com.google.android.gms.internal.ads.C2367xe) r1, (java.lang.Throwable) r2, (boolean) r3, (int) r4)
            int r1 = r11.mo7594k()
            com.google.android.gms.internal.ads.ie r0 = com.google.android.gms.internal.ads.C1811ie.m11004a(r0, r1)
            throw r0
        L_0x002e:
            r0 = move-exception
            com.google.android.gms.internal.ads.yi r1 = new com.google.android.gms.internal.ads.yi
            com.google.android.gms.internal.ads.xe r2 = r11.f18216o
            r4 = -49998(0xffffffffffff3cb2, float:NaN)
            r1.<init>((com.google.android.gms.internal.ads.C2367xe) r2, (java.lang.Throwable) r0, (boolean) r3, (int) r4)
            int r0 = r11.mo7594k()
            com.google.android.gms.internal.ads.ie r0 = com.google.android.gms.internal.ads.C1811ie.m11004a(r1, r0)
            throw r0
        L_0x0042:
            boolean r0 = r11.mo8168a0(r1)
            if (r0 != 0) goto L_0x0049
            return
        L_0x0049:
            com.google.android.gms.internal.ads.xi r0 = r11.f18218q
            java.lang.String r0 = r0.f17214a
            com.google.android.gms.internal.ads.xe r1 = r11.f18216o
            int r4 = com.google.android.gms.internal.ads.C2449zm.f18287a
            r5 = 21
            r10 = 1
            if (r4 >= r5) goto L_0x0068
            java.util.List<byte[]> r1 = r1.f17165m
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0068
            java.lang.String r1 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0068
            r1 = r10
            goto L_0x0069
        L_0x0068:
            r1 = r3
        L_0x0069:
            r11.f18219r = r1
            r1 = 19
            r6 = 18
            if (r4 < r6) goto L_0x00a2
            if (r4 != r6) goto L_0x0083
            java.lang.String r7 = "OMX.SEC.avc.dec"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00a2
            java.lang.String r7 = "OMX.SEC.avc.dec.secure"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00a2
        L_0x0083:
            if (r4 != r1) goto L_0x00a0
            java.lang.String r7 = com.google.android.gms.internal.ads.C2449zm.f18290d
            java.lang.String r8 = "SM-G800"
            boolean r7 = r7.startsWith(r8)
            if (r7 == 0) goto L_0x00a0
            java.lang.String r7 = "OMX.Exynos.avc.dec"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00a2
            java.lang.String r7 = "OMX.Exynos.avc.dec.secure"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r7 = r3
            goto L_0x00a3
        L_0x00a2:
            r7 = r10
        L_0x00a3:
            r11.f18220s = r7
            r7 = 24
            if (r4 >= r7) goto L_0x00dd
            java.lang.String r7 = "OMX.Nvidia.h264.decode"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00b9
            java.lang.String r7 = "OMX.Nvidia.h264.decode.secure"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00dd
        L_0x00b9:
            java.lang.String r7 = com.google.android.gms.internal.ads.C2449zm.f18288b
            java.lang.String r8 = "flounder"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x00db
            java.lang.String r8 = "flounder_lte"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x00db
            java.lang.String r8 = "grouper"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x00db
            java.lang.String r8 = "tilapia"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x00dd
        L_0x00db:
            r7 = r10
            goto L_0x00de
        L_0x00dd:
            r7 = r3
        L_0x00de:
            r11.f18221t = r7
            r7 = 17
            if (r4 > r7) goto L_0x00f6
            java.lang.String r7 = "OMX.rk.video_decoder.avc"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00f4
            java.lang.String r7 = "OMX.allwinner.video.decoder.avc"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00f6
        L_0x00f4:
            r7 = r10
            goto L_0x00f7
        L_0x00f6:
            r7 = r3
        L_0x00f7:
            r11.f18222u = r7
            r7 = 23
            if (r4 > r7) goto L_0x0108
            java.lang.String r7 = "OMX.google.vorbis.decoder"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0106
            goto L_0x0108
        L_0x0106:
            r1 = r10
            goto L_0x0126
        L_0x0108:
            if (r4 > r1) goto L_0x0125
            java.lang.String r1 = com.google.android.gms.internal.ads.C2449zm.f18288b
            java.lang.String r7 = "hb2000"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0125
            java.lang.String r1 = "OMX.amlogic.avc.decoder.awesome"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0106
            java.lang.String r1 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0125
            goto L_0x0106
        L_0x0125:
            r1 = r3
        L_0x0126:
            r11.f18223v = r1
            if (r4 != r5) goto L_0x0134
            java.lang.String r1 = "OMX.google.aac.decoder"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0134
            r1 = r10
            goto L_0x0135
        L_0x0134:
            r1 = r3
        L_0x0135:
            r11.f18224w = r1
            com.google.android.gms.internal.ads.xe r1 = r11.f18216o
            if (r4 > r6) goto L_0x0149
            int r1 = r1.f17175w
            if (r1 != r10) goto L_0x0149
            java.lang.String r1 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0149
            r1 = r10
            goto L_0x014a
        L_0x0149:
            r1 = r3
        L_0x014a:
            r11.f18225x = r1
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r1 = "createCodec:"
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x01d1 }
            int r7 = r6.length()     // Catch:{ Exception -> 0x01d1 }
            if (r7 == 0) goto L_0x0161
            java.lang.String r1 = r1.concat(r6)     // Catch:{ Exception -> 0x01d1 }
            goto L_0x0167
        L_0x0161:
            java.lang.String r6 = new java.lang.String     // Catch:{ Exception -> 0x01d1 }
            r6.<init>(r1)     // Catch:{ Exception -> 0x01d1 }
            r1 = r6
        L_0x0167:
            com.google.android.gms.internal.ads.C2338wm.m19040a(r1)     // Catch:{ Exception -> 0x01d1 }
            android.media.MediaCodec r1 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x01d1 }
            r11.f18217p = r1     // Catch:{ Exception -> 0x01d1 }
            com.google.android.gms.internal.ads.C2338wm.m19041b()     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r1 = "configureCodec"
            com.google.android.gms.internal.ads.C2338wm.m19040a(r1)     // Catch:{ Exception -> 0x01d1 }
            com.google.android.gms.internal.ads.xi r1 = r11.f18218q     // Catch:{ Exception -> 0x01d1 }
            android.media.MediaCodec r6 = r11.f18217p     // Catch:{ Exception -> 0x01d1 }
            com.google.android.gms.internal.ads.xe r7 = r11.f18216o     // Catch:{ Exception -> 0x01d1 }
            r11.mo8160H(r1, r6, r7, r2)     // Catch:{ Exception -> 0x01d1 }
            com.google.android.gms.internal.ads.C2338wm.m19041b()     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r1 = "startCodec"
            com.google.android.gms.internal.ads.C2338wm.m19040a(r1)     // Catch:{ Exception -> 0x01d1 }
            android.media.MediaCodec r1 = r11.f18217p     // Catch:{ Exception -> 0x01d1 }
            r1.start()     // Catch:{ Exception -> 0x01d1 }
            com.google.android.gms.internal.ads.C2338wm.m19041b()     // Catch:{ Exception -> 0x01d1 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01d1 }
            long r8 = r6 - r4
            r4 = r11
            r5 = r0
            r4.mo8161I(r5, r6, r8)     // Catch:{ Exception -> 0x01d1 }
            android.media.MediaCodec r1 = r11.f18217p     // Catch:{ Exception -> 0x01d1 }
            java.nio.ByteBuffer[] r1 = r1.getInputBuffers()     // Catch:{ Exception -> 0x01d1 }
            r11.f18195A = r1     // Catch:{ Exception -> 0x01d1 }
            android.media.MediaCodec r1 = r11.f18217p     // Catch:{ Exception -> 0x01d1 }
            java.nio.ByteBuffer[] r1 = r1.getOutputBuffers()     // Catch:{ Exception -> 0x01d1 }
            r11.f18196B = r1     // Catch:{ Exception -> 0x01d1 }
            int r0 = r11.mo6180a()
            r1 = 2
            if (r0 != r1) goto L_0x01bb
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r2
            goto L_0x01c0
        L_0x01bb:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01c0:
            r11.f18197C = r0
            r0 = -1
            r11.f18198D = r0
            r11.f18199E = r0
            r11.f18208N = r10
            com.google.android.gms.internal.ads.tg r0 = r11.f18209O
            int r1 = r0.f14840a
            int r1 = r1 + r10
            r0.f14840a = r1
            return
        L_0x01d1:
            r1 = move-exception
            com.google.android.gms.internal.ads.yi r2 = new com.google.android.gms.internal.ads.yi
            com.google.android.gms.internal.ads.xe r4 = r11.f18216o
            r2.<init>((com.google.android.gms.internal.ads.C2367xe) r4, (java.lang.Throwable) r1, (boolean) r3, (java.lang.String) r0)
            int r0 = r11.mo7594k()
            com.google.android.gms.internal.ads.ie r0 = com.google.android.gms.internal.ads.C1811ie.m11004a(r2, r0)
            throw r0
        L_0x01e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2445zi.mo12226Q():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public void mo8165R(C2257ug ugVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo8166S() {
        this.f18197C = -9223372036854775807L;
        this.f18198D = -1;
        this.f18199E = -1;
        this.f18200F = false;
        this.f18214m.clear();
        this.f18195A = null;
        this.f18196B = null;
        this.f18218q = null;
        this.f18201G = false;
        this.f18204J = false;
        this.f18219r = false;
        this.f18220s = false;
        this.f18221t = false;
        this.f18222u = false;
        this.f18223v = false;
        this.f18225x = false;
        this.f18226y = false;
        this.f18227z = false;
        this.f18205K = false;
        this.f18202H = 0;
        this.f18203I = 0;
        this.f18211j.f15546c = null;
        MediaCodec mediaCodec = this.f18217p;
        if (mediaCodec != null) {
            this.f18209O.f14841b++;
            try {
                mediaCodec.stop();
                try {
                    this.f18217p.release();
                } finally {
                    this.f18217p = null;
                }
            } catch (Throwable th) {
                this.f18217p.release();
                throw th;
            } finally {
                this.f18217p = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public boolean mo8167T(MediaCodec mediaCodec, boolean z, C2367xe xeVar, C2367xe xeVar2) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        if (r12.f18207M == false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x014c, code lost:
        if (r12.f18207M == false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014e, code lost:
        mo8166S();
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6176W(long r17, long r19) {
        /*
            r16 = this;
            r12 = r16
            boolean r0 = r12.f18207M
            if (r0 == 0) goto L_0x000a
            r16.mo8663M()
            return
        L_0x000a:
            com.google.android.gms.internal.ads.xe r0 = r12.f18216o
            r1 = -4
            r2 = -5
            r13 = 1
            if (r0 != 0) goto L_0x0039
            com.google.android.gms.internal.ads.ug r0 = r12.f18212k
            r0.mo9759b()
            com.google.android.gms.internal.ads.ye r0 = r12.f18213l
            com.google.android.gms.internal.ads.ug r3 = r12.f18212k
            int r0 = r12.mo7595l(r0, r3, r13)
            if (r0 != r2) goto L_0x0028
            com.google.android.gms.internal.ads.ye r0 = r12.f18213l
            com.google.android.gms.internal.ads.xe r0 = r0.f17688a
            r12.mo8162J(r0)
            goto L_0x0039
        L_0x0028:
            if (r0 != r1) goto L_0x0038
            com.google.android.gms.internal.ads.ug r0 = r12.f18212k
            boolean r0 = r0.mo9763f()
            com.google.android.gms.internal.ads.C1856jm.m11730e(r0)
            r12.f18206L = r13
            r16.mo8159C()
        L_0x0038:
            return
        L_0x0039:
            r16.mo12226Q()
            android.media.MediaCodec r0 = r12.f18217p
            r14 = 0
            if (r0 == 0) goto L_0x0180
            java.lang.String r0 = "drainAndFeed"
            com.google.android.gms.internal.ads.C2338wm.m19040a(r0)
        L_0x0046:
            int r0 = r12.f18199E
            r15 = -1
            if (r0 >= 0) goto L_0x0124
            boolean r0 = r12.f18224w
            r1 = 0
            if (r0 == 0) goto L_0x0069
            boolean r0 = r12.f18205K
            if (r0 == 0) goto L_0x0069
            android.media.MediaCodec r0 = r12.f18217p     // Catch:{ IllegalStateException -> 0x0060 }
            android.media.MediaCodec$BufferInfo r3 = r12.f18215n     // Catch:{ IllegalStateException -> 0x0060 }
            int r0 = r0.dequeueOutputBuffer(r3, r1)     // Catch:{ IllegalStateException -> 0x0060 }
            r12.f18199E = r0     // Catch:{ IllegalStateException -> 0x0060 }
            goto L_0x0073
        L_0x0060:
            r16.mo8159C()
            boolean r0 = r12.f18207M
            if (r0 == 0) goto L_0x0176
            goto L_0x014e
        L_0x0069:
            android.media.MediaCodec r0 = r12.f18217p
            android.media.MediaCodec$BufferInfo r3 = r12.f18215n
            int r0 = r0.dequeueOutputBuffer(r3, r1)
            r12.f18199E = r0
        L_0x0073:
            if (r0 < 0) goto L_0x00d3
            boolean r1 = r12.f18227z
            if (r1 == 0) goto L_0x0082
            r12.f18227z = r14
            android.media.MediaCodec r1 = r12.f18217p
            r1.releaseOutputBuffer(r0, r14)
            goto L_0x0172
        L_0x0082:
            android.media.MediaCodec$BufferInfo r0 = r12.f18215n
            int r1 = r0.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0091
            r16.mo8159C()
            r12.f18199E = r15
            goto L_0x0176
        L_0x0091:
            java.nio.ByteBuffer[] r1 = r12.f18196B
            int r2 = r12.f18199E
            r1 = r1[r2]
            if (r1 == 0) goto L_0x00a8
            int r0 = r0.offset
            r1.position(r0)
            android.media.MediaCodec$BufferInfo r0 = r12.f18215n
            int r2 = r0.offset
            int r0 = r0.size
            int r2 = r2 + r0
            r1.limit(r2)
        L_0x00a8:
            android.media.MediaCodec$BufferInfo r0 = r12.f18215n
            long r0 = r0.presentationTimeUs
            java.util.List<java.lang.Long> r2 = r12.f18214m
            int r2 = r2.size()
            r3 = r14
        L_0x00b3:
            if (r3 >= r2) goto L_0x00cf
            java.util.List<java.lang.Long> r4 = r12.f18214m
            java.lang.Object r4 = r4.get(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x00cc
            java.util.List<java.lang.Long> r0 = r12.f18214m
            r0.remove(r3)
            r0 = r13
            goto L_0x00d0
        L_0x00cc:
            int r3 = r3 + 1
            goto L_0x00b3
        L_0x00cf:
            r0 = r14
        L_0x00d0:
            r12.f18200F = r0
            goto L_0x0124
        L_0x00d3:
            r1 = -2
            if (r0 != r1) goto L_0x0106
            android.media.MediaCodec r0 = r12.f18217p
            android.media.MediaFormat r0 = r0.getOutputFormat()
            boolean r1 = r12.f18221t
            if (r1 == 0) goto L_0x00f6
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)
            r2 = 32
            if (r1 != r2) goto L_0x00f6
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)
            if (r1 != r2) goto L_0x00f6
            r12.f18227z = r13
            goto L_0x0046
        L_0x00f6:
            boolean r1 = r12.f18225x
            if (r1 == 0) goto L_0x00ff
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r13)
        L_0x00ff:
            android.media.MediaCodec r1 = r12.f18217p
            r12.mo8163K(r1, r0)
            goto L_0x0046
        L_0x0106:
            r1 = -3
            if (r0 != r1) goto L_0x0113
            android.media.MediaCodec r0 = r12.f18217p
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()
            r12.f18196B = r0
            goto L_0x0046
        L_0x0113:
            boolean r0 = r12.f18222u
            if (r0 == 0) goto L_0x0176
            boolean r0 = r12.f18206L
            if (r0 != 0) goto L_0x0120
            int r0 = r12.f18203I
            r1 = 2
            if (r0 != r1) goto L_0x0176
        L_0x0120:
            r16.mo8159C()
            goto L_0x0176
        L_0x0124:
            boolean r0 = r12.f18224w
            if (r0 == 0) goto L_0x0152
            boolean r0 = r12.f18205K
            if (r0 == 0) goto L_0x0152
            android.media.MediaCodec r5 = r12.f18217p     // Catch:{ IllegalStateException -> 0x0147 }
            java.nio.ByteBuffer[] r0 = r12.f18196B     // Catch:{ IllegalStateException -> 0x0147 }
            int r7 = r12.f18199E     // Catch:{ IllegalStateException -> 0x0147 }
            r6 = r0[r7]     // Catch:{ IllegalStateException -> 0x0147 }
            android.media.MediaCodec$BufferInfo r0 = r12.f18215n     // Catch:{ IllegalStateException -> 0x0147 }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x0147 }
            long r9 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0147 }
            boolean r11 = r12.f18200F     // Catch:{ IllegalStateException -> 0x0147 }
            r0 = r16
            r1 = r17
            r3 = r19
            boolean r0 = r0.mo8164N(r1, r3, r5, r6, r7, r8, r9, r11)     // Catch:{ IllegalStateException -> 0x0147 }
            goto L_0x016c
        L_0x0147:
            r16.mo8159C()
            boolean r0 = r12.f18207M
            if (r0 == 0) goto L_0x0176
        L_0x014e:
            r16.mo8166S()
            goto L_0x0176
        L_0x0152:
            android.media.MediaCodec r5 = r12.f18217p
            java.nio.ByteBuffer[] r0 = r12.f18196B
            int r7 = r12.f18199E
            r6 = r0[r7]
            android.media.MediaCodec$BufferInfo r0 = r12.f18215n
            int r8 = r0.flags
            long r9 = r0.presentationTimeUs
            boolean r11 = r12.f18200F
            r0 = r16
            r1 = r17
            r3 = r19
            boolean r0 = r0.mo8164N(r1, r3, r5, r6, r7, r8, r9, r11)
        L_0x016c:
            if (r0 == 0) goto L_0x0176
            android.media.MediaCodec$BufferInfo r0 = r12.f18215n
            long r0 = r0.presentationTimeUs
        L_0x0172:
            r12.f18199E = r15
            goto L_0x0046
        L_0x0176:
            boolean r0 = r16.m20663D()
            if (r0 != 0) goto L_0x0176
            com.google.android.gms.internal.ads.C2338wm.m19041b()
            goto L_0x01aa
        L_0x0180:
            r16.mo7603u(r17)
            com.google.android.gms.internal.ads.ug r0 = r12.f18212k
            r0.mo9759b()
            com.google.android.gms.internal.ads.ye r0 = r12.f18213l
            com.google.android.gms.internal.ads.ug r3 = r12.f18212k
            int r0 = r12.mo7595l(r0, r3, r14)
            if (r0 != r2) goto L_0x019a
            com.google.android.gms.internal.ads.ye r0 = r12.f18213l
            com.google.android.gms.internal.ads.xe r0 = r0.f17688a
            r12.mo8162J(r0)
            goto L_0x01aa
        L_0x019a:
            if (r0 != r1) goto L_0x01aa
            com.google.android.gms.internal.ads.ug r0 = r12.f18212k
            boolean r0 = r0.mo9763f()
            com.google.android.gms.internal.ads.C1856jm.m11730e(r0)
            r12.f18206L = r13
            r16.mo8159C()
        L_0x01aa:
            com.google.android.gms.internal.ads.tg r0 = r12.f18209O
            r0.mo10977a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2445zi.mo6176W(long, long):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public boolean mo8168a0(C2371xi xiVar) {
        return true;
    }

    /* renamed from: b */
    public final int mo6465b() {
        return 4;
    }

    /* renamed from: e */
    public final int mo6467e(C2367xe xeVar) {
        try {
            return mo8173z(this.f18210i, xeVar);
        } catch (C1668ej e) {
            throw C1811ie.m11004a(e, mo7594k());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo7597n() {
        this.f18216o = null;
        mo8166S();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo7598p(boolean z) {
        this.f18209O = new C2220tg();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo7599q(long j, boolean z) {
        this.f18206L = false;
        this.f18207M = false;
        if (this.f18217p != null) {
            this.f18197C = -9223372036854775807L;
            this.f18198D = -1;
            this.f18199E = -1;
            this.f18208N = true;
            this.f18200F = false;
            this.f18214m.clear();
            this.f18226y = false;
            this.f18227z = false;
            if (this.f18220s || ((this.f18223v && this.f18205K) || this.f18203I != 0)) {
                mo8166S();
                mo12226Q();
            } else {
                this.f18217p.flush();
                this.f18204J = false;
            }
            if (this.f18201G && this.f18216o != null) {
                this.f18202H = 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract int mo8173z(C1556bj bjVar, C2367xe xeVar);
}
