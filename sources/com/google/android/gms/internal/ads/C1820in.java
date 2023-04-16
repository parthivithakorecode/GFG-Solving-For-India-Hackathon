package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
/* renamed from: com.google.android.gms.internal.ads.in */
public final class C1820in extends C2445zi {

    /* renamed from: Q */
    private final Context f8694Q;

    /* renamed from: R */
    private final C1894kn f8695R;

    /* renamed from: S */
    private final C2190sn f8696S;

    /* renamed from: T */
    private final boolean f8697T;

    /* renamed from: U */
    private final long[] f8698U;

    /* renamed from: V */
    private C2367xe[] f8699V;

    /* renamed from: W */
    private C1783hn f8700W;

    /* renamed from: X */
    private Surface f8701X;

    /* renamed from: Y */
    private Surface f8702Y;

    /* renamed from: Z */
    private boolean f8703Z;

    /* renamed from: a0 */
    private long f8704a0;

    /* renamed from: b0 */
    private long f8705b0;

    /* renamed from: c0 */
    private int f8706c0;

    /* renamed from: d0 */
    private int f8707d0;

    /* renamed from: e0 */
    private int f8708e0;

    /* renamed from: f0 */
    private float f8709f0;

    /* renamed from: g0 */
    private int f8710g0;

    /* renamed from: h0 */
    private int f8711h0;

    /* renamed from: i0 */
    private int f8712i0;

    /* renamed from: j0 */
    private float f8713j0;

    /* renamed from: k0 */
    private int f8714k0;

    /* renamed from: l0 */
    private int f8715l0;

    /* renamed from: m0 */
    private int f8716m0;

    /* renamed from: n0 */
    private float f8717n0;

    /* renamed from: o0 */
    private long f8718o0;

    /* renamed from: p0 */
    private int f8719p0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1820in(Context context, C1556bj bjVar, long j, Handler handler, C2227tn tnVar, int i) {
        super(2, bjVar, (C2443zg) null, false);
        boolean z = false;
        this.f8694Q = context.getApplicationContext();
        this.f8695R = new C1894kn(context);
        this.f8696S = new C2190sn(handler, tnVar);
        if (C2449zm.f18287a <= 22 && "foster".equals(C2449zm.f18288b) && "NVIDIA".equals(C2449zm.f18289c)) {
            z = true;
        }
        this.f8697T = z;
        this.f8698U = new long[10];
        this.f8718o0 = -9223372036854775807L;
        this.f8704a0 = -9223372036854775807L;
        this.f8710g0 = -1;
        this.f8711h0 = -1;
        this.f8713j0 = -1.0f;
        this.f8709f0 = -1.0f;
        m11073f0();
    }

    /* renamed from: e0 */
    private static int m11072e0(C2367xe xeVar) {
        int i = xeVar.f17170r;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    /* renamed from: f0 */
    private final void m11073f0() {
        this.f8714k0 = -1;
        this.f8715l0 = -1;
        this.f8717n0 = -1.0f;
        this.f8716m0 = -1;
    }

    /* renamed from: g0 */
    private final void m11074g0() {
        if (this.f8706c0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f8696S.mo10819d(this.f8706c0, elapsedRealtime - this.f8705b0);
            this.f8706c0 = 0;
            this.f8705b0 = elapsedRealtime;
        }
    }

    /* renamed from: h0 */
    private final void m11075h0() {
        int i = this.f8714k0;
        int i2 = this.f8710g0;
        if (i != i2 || this.f8715l0 != this.f8711h0 || this.f8716m0 != this.f8712i0 || this.f8717n0 != this.f8713j0) {
            this.f8696S.mo10823h(i2, this.f8711h0, this.f8712i0, this.f8713j0);
            this.f8714k0 = this.f8710g0;
            this.f8715l0 = this.f8711h0;
            this.f8716m0 = this.f8712i0;
            this.f8717n0 = this.f8713j0;
        }
    }

    /* renamed from: i0 */
    private final void m11076i0() {
        if (this.f8714k0 != -1 || this.f8715l0 != -1) {
            this.f8696S.mo10823h(this.f8710g0, this.f8711h0, this.f8712i0, this.f8713j0);
        }
    }

    /* renamed from: j0 */
    private static boolean m11077j0(long j) {
        return j < -30000;
    }

    /* renamed from: k0 */
    private final boolean m11078k0(boolean z) {
        return C2449zm.f18287a >= 23 && (!z || C1709fn.m9239c(this.f8694Q));
    }

    /* renamed from: A */
    public final boolean mo6169A() {
        Surface surface;
        if (super.mo6169A() && (this.f8703Z || (((surface = this.f8702Y) != null && this.f8701X == surface) || mo12224O() == null))) {
            this.f8704a0 = -9223372036854775807L;
            return true;
        } else if (this.f8704a0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f8704a0) {
                return true;
            }
            this.f8704a0 = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo8159C() {
        if (!this.f8703Z) {
            this.f8703Z = true;
            this.f8696S.mo10822g(this.f8701X);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8160H(com.google.android.gms.internal.ads.C2371xi r12, android.media.MediaCodec r13, com.google.android.gms.internal.ads.C2367xe r14, android.media.MediaCrypto r15) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.xe[] r15 = r11.f8699V
            int r0 = r14.f17167o
            int r1 = r14.f17168p
            int r2 = r14.f17164l
            r3 = 0
            r4 = -1
            if (r2 != r4) goto L_0x008f
            java.lang.String r2 = r14.f17163k
            if (r0 == r4) goto L_0x008e
            if (r1 != r4) goto L_0x0014
            goto L_0x008e
        L_0x0014:
            int r5 = r2.hashCode()
            r6 = 5
            r7 = 1
            r8 = 4
            r9 = 3
            r10 = 2
            switch(r5) {
                case -1664118616: goto L_0x0053;
                case -1662541442: goto L_0x0049;
                case 1187890754: goto L_0x003f;
                case 1331836730: goto L_0x0035;
                case 1599127256: goto L_0x002b;
                case 1599127257: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x005d
        L_0x0021:
            java.lang.String r5 = "video/x-vnd.on2.vp9"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = r6
            goto L_0x005e
        L_0x002b:
            java.lang.String r5 = "video/x-vnd.on2.vp8"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = r9
            goto L_0x005e
        L_0x0035:
            java.lang.String r5 = "video/avc"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = r10
            goto L_0x005e
        L_0x003f:
            java.lang.String r5 = "video/mp4v-es"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = r7
            goto L_0x005e
        L_0x0049:
            java.lang.String r5 = "video/hevc"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = r8
            goto L_0x005e
        L_0x0053:
            java.lang.String r5 = "video/3gpp"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = r3
            goto L_0x005e
        L_0x005d:
            r2 = r4
        L_0x005e:
            if (r2 == 0) goto L_0x0087
            if (r2 == r7) goto L_0x0087
            if (r2 == r10) goto L_0x006e
            if (r2 == r9) goto L_0x0087
            if (r2 == r8) goto L_0x006b
            if (r2 == r6) goto L_0x006b
            goto L_0x008e
        L_0x006b:
            int r2 = r0 * r1
            goto L_0x008a
        L_0x006e:
            java.lang.String r2 = com.google.android.gms.internal.ads.C2449zm.f18290d
            java.lang.String r5 = "BRAVIA 4K 2015"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0079
            goto L_0x008e
        L_0x0079:
            r2 = 16
            int r5 = com.google.android.gms.internal.ads.C2449zm.m20725d(r0, r2)
            int r2 = com.google.android.gms.internal.ads.C2449zm.m20725d(r1, r2)
            int r5 = r5 * r2
            int r2 = r5 * 256
            goto L_0x0089
        L_0x0087:
            int r2 = r0 * r1
        L_0x0089:
            r8 = r10
        L_0x008a:
            int r2 = r2 * r9
            int r8 = r8 + r8
            int r2 = r2 / r8
            goto L_0x008f
        L_0x008e:
            r2 = r4
        L_0x008f:
            int r15 = r15.length
            com.google.android.gms.internal.ads.hn r15 = new com.google.android.gms.internal.ads.hn
            r15.<init>(r0, r1, r2)
            r11.f8700W = r15
            boolean r0 = r11.f8697T
            android.media.MediaFormat r14 = r14.mo11807c()
            int r1 = r15.f8354a
            java.lang.String r2 = "max-width"
            r14.setInteger(r2, r1)
            int r1 = r15.f8355b
            java.lang.String r2 = "max-height"
            r14.setInteger(r2, r1)
            int r15 = r15.f8356c
            if (r15 == r4) goto L_0x00b4
            java.lang.String r1 = "max-input-size"
            r14.setInteger(r1, r15)
        L_0x00b4:
            if (r0 == 0) goto L_0x00bb
            java.lang.String r15 = "auto-frc"
            r14.setInteger(r15, r3)
        L_0x00bb:
            android.view.Surface r15 = r11.f8701X
            if (r15 != 0) goto L_0x00da
            boolean r15 = r12.f17217d
            boolean r15 = r11.m11078k0(r15)
            com.google.android.gms.internal.ads.C1856jm.m11730e(r15)
            android.view.Surface r15 = r11.f8702Y
            if (r15 != 0) goto L_0x00d6
            android.content.Context r15 = r11.f8694Q
            boolean r12 = r12.f17217d
            com.google.android.gms.internal.ads.fn r12 = com.google.android.gms.internal.ads.C1709fn.m9238b(r15, r12)
            r11.f8702Y = r12
        L_0x00d6:
            android.view.Surface r12 = r11.f8702Y
            r11.f8701X = r12
        L_0x00da:
            android.view.Surface r12 = r11.f8701X
            r15 = 0
            r13.configure(r14, r12, r15, r3)
            int r12 = com.google.android.gms.internal.ads.C2449zm.f18287a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1820in.mo8160H(com.google.android.gms.internal.ads.xi, android.media.MediaCodec, com.google.android.gms.internal.ads.xe, android.media.MediaCrypto):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final void mo8161I(String str, long j, long j2) {
        this.f8696S.mo10817b(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo8162J(C2367xe xeVar) {
        super.mo8162J(xeVar);
        this.f8696S.mo10821f(xeVar);
        float f = xeVar.f17171s;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.f8709f0 = f;
        this.f8708e0 = m11072e0(xeVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final void mo8163K(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        this.f8710g0 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.f8711h0 = integer;
        float f = this.f8709f0;
        this.f8713j0 = f;
        if (C2449zm.f18287a >= 21) {
            int i = this.f8708e0;
            if (i == 90 || i == 270) {
                int i2 = this.f8710g0;
                this.f8710g0 = integer;
                this.f8711h0 = i2;
                this.f8713j0 = 1.0f / f;
            }
        } else {
            this.f8712i0 = this.f8708e0;
        }
        mediaCodec.setVideoScalingMode(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final boolean mo8164N(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        MediaCodec mediaCodec2 = mediaCodec;
        int i3 = i;
        long j4 = j3;
        while (true) {
            int i4 = this.f8719p0;
            if (i4 == 0) {
                break;
            }
            long[] jArr = this.f8698U;
            long j5 = jArr[0];
            if (j4 < j5) {
                break;
            }
            this.f8718o0 = j5;
            int i5 = i4 - 1;
            this.f8719p0 = i5;
            System.arraycopy(jArr, 1, jArr, 0, i5);
        }
        long j6 = j4 - this.f8718o0;
        if (z) {
            mo8171d0(mediaCodec2, i3, j6);
            return true;
        }
        long j7 = j4 - j;
        if (this.f8701X == this.f8702Y) {
            if (!m11077j0(j7)) {
                return false;
            }
            mo8171d0(mediaCodec2, i3, j6);
            return true;
        } else if (!this.f8703Z) {
            if (C2449zm.f18287a >= 21) {
                mo8170c0(mediaCodec, i, j6, System.nanoTime());
            } else {
                mo8169b0(mediaCodec2, i3, j6);
            }
            return true;
        } else if (mo6180a() != 2) {
            return false;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long nanoTime = System.nanoTime();
            long a = this.f8695R.mo8696a(j4, ((j7 - ((elapsedRealtime * 1000) - j2)) * 1000) + nanoTime);
            long j8 = (a - nanoTime) / 1000;
            if (m11077j0(j8)) {
                C2338wm.m19040a("dropVideoBuffer");
                mediaCodec2.releaseOutputBuffer(i3, false);
                C2338wm.m19041b();
                C2220tg tgVar = this.f18209O;
                tgVar.f14845f++;
                this.f8706c0++;
                int i6 = this.f8707d0 + 1;
                this.f8707d0 = i6;
                tgVar.f14846g = Math.max(i6, tgVar.f14846g);
                if (this.f8706c0 == -1) {
                    m11074g0();
                }
                return true;
            }
            if (C2449zm.f18287a >= 21) {
                if (j8 < 50000) {
                    mo8170c0(mediaCodec, i, j6, a);
                    return true;
                }
            } else if (j8 < 30000) {
                if (j8 > 11000) {
                    try {
                        Thread.sleep((j8 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                mo8169b0(mediaCodec2, i3, j6);
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final void mo8165R(C2257ug ugVar) {
        int i = C2449zm.f18287a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final void mo8166S() {
        try {
            super.mo8166S();
        } finally {
            Surface surface = this.f8702Y;
            if (surface != null) {
                if (this.f8701X == surface) {
                    this.f8701X = null;
                }
                surface.release();
                this.f8702Y = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final boolean mo8167T(MediaCodec mediaCodec, boolean z, C2367xe xeVar, C2367xe xeVar2) {
        if (!xeVar.f17163k.equals(xeVar2.f17163k) || m11072e0(xeVar) != m11072e0(xeVar2)) {
            return false;
        }
        if (!z && (xeVar.f17167o != xeVar2.f17167o || xeVar.f17168p != xeVar2.f17168p)) {
            return false;
        }
        int i = xeVar2.f17167o;
        C1783hn hnVar = this.f8700W;
        return i <= hnVar.f8354a && xeVar2.f17168p <= hnVar.f8355b && xeVar2.f17164l <= hnVar.f8356c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public final boolean mo8168a0(C2371xi xiVar) {
        return this.f8701X != null || m11078k0(xiVar.f17217d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public final void mo8169b0(MediaCodec mediaCodec, int i, long j) {
        m11075h0();
        C2338wm.m19040a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        C2338wm.m19041b();
        this.f18209O.f14843d++;
        this.f8707d0 = 0;
        mo8159C();
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    /* renamed from: c0 */
    public final void mo8170c0(MediaCodec mediaCodec, int i, long j, long j2) {
        m11075h0();
        C2338wm.m19040a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        C2338wm.m19041b();
        this.f18209O.f14843d++;
        this.f8707d0 = 0;
        mo8159C();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public final void mo8171d0(MediaCodec mediaCodec, int i, long j) {
        C2338wm.m19040a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        C2338wm.m19041b();
        this.f18209O.f14844e++;
    }

    /* renamed from: g */
    public final void mo8172g(int i, Object obj) {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.f8702Y;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    C2371xi P = mo12225P();
                    if (P != null && m11078k0(P.f17217d)) {
                        surface = C1709fn.m9238b(this.f8694Q, P.f17217d);
                        this.f8702Y = surface;
                    }
                }
            }
            if (this.f8701X != surface) {
                this.f8701X = surface;
                int a = mo6180a();
                if (a == 1 || a == 2) {
                    MediaCodec O = mo12224O();
                    if (C2449zm.f18287a < 23 || O == null || surface == null) {
                        mo8166S();
                        mo12226Q();
                    } else {
                        O.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.f8702Y) {
                    m11073f0();
                    this.f8703Z = false;
                    int i2 = C2449zm.f18287a;
                    return;
                }
                m11076i0();
                this.f8703Z = false;
                int i3 = C2449zm.f18287a;
                if (a == 2) {
                    this.f8704a0 = -9223372036854775807L;
                }
            } else if (surface != null && surface != this.f8702Y) {
                m11076i0();
                if (this.f8703Z) {
                    this.f8696S.mo10822g(this.f8701X);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo7597n() {
        this.f8710g0 = -1;
        this.f8711h0 = -1;
        this.f8713j0 = -1.0f;
        this.f8709f0 = -1.0f;
        this.f8718o0 = -9223372036854775807L;
        this.f8719p0 = 0;
        m11073f0();
        this.f8703Z = false;
        int i = C2449zm.f18287a;
        this.f8695R.mo8697b();
        try {
            super.mo7597n();
        } finally {
            this.f18209O.mo10977a();
            this.f8696S.mo10818c(this.f18209O);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo7598p(boolean z) {
        super.mo7598p(z);
        int i = mo7596m().f6195a;
        this.f8696S.mo10820e(this.f18209O);
        this.f8695R.mo8698c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo7599q(long j, boolean z) {
        super.mo7599q(j, z);
        this.f8703Z = false;
        int i = C2449zm.f18287a;
        this.f8707d0 = 0;
        int i2 = this.f8719p0;
        if (i2 != 0) {
            this.f8718o0 = this.f8698U[i2 - 1];
            this.f8719p0 = 0;
        }
        this.f8704a0 = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo7600r() {
        this.f8706c0 = 0;
        this.f8705b0 = SystemClock.elapsedRealtime();
        this.f8704a0 = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo7601s() {
        m11074g0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo7602t(C2367xe[] xeVarArr, long j) {
        this.f8699V = xeVarArr;
        if (this.f8718o0 == -9223372036854775807L) {
            this.f8718o0 = j;
            return;
        }
        int i = this.f8719p0;
        if (i == 10) {
            long j2 = this.f8698U[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j2);
            Log.w("MediaCodecVideoRenderer", sb.toString());
        } else {
            this.f8719p0 = i + 1;
        }
        this.f8698U[this.f8719p0 - 1] = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final int mo8173z(C1556bj bjVar, C2367xe xeVar) {
        boolean z;
        int i;
        int i2;
        String str = xeVar.f17163k;
        int i3 = 0;
        if (!C2041om.m14520b(str)) {
            return 0;
        }
        C2406yg ygVar = xeVar.f17166n;
        if (ygVar != null) {
            z = false;
            for (int i4 = 0; i4 < ygVar.f17731h; i4++) {
                z |= ygVar.mo12012b(i4).f17196j;
            }
        } else {
            z = false;
        }
        C2371xi c = C1853jj.m11671c(str, z);
        if (c == null) {
            return 1;
        }
        boolean e = c.mo11851e(xeVar.f17160h);
        if (e && (i = xeVar.f17167o) > 0 && (i2 = xeVar.f17168p) > 0) {
            if (C2449zm.f18287a >= 21) {
                e = c.mo11852f(i, i2, (double) xeVar.f17169q);
            } else {
                e = i * i2 <= C1853jj.m11669a();
                if (!e) {
                    int i5 = xeVar.f17167o;
                    int i6 = xeVar.f17168p;
                    String str2 = C2449zm.f18291e;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                    sb.append("FalseCheck [legacyFrameSize, ");
                    sb.append(i5);
                    sb.append("x");
                    sb.append(i6);
                    sb.append("] [");
                    sb.append(str2);
                    sb.append("]");
                    Log.d("MediaCodecVideoRenderer", sb.toString());
                }
            }
        }
        int i7 = true != c.f17215b ? 4 : 8;
        if (true == c.f17216c) {
            i3 = 16;
        }
        return (true != e ? 2 : 3) | i7 | i3;
    }
}
