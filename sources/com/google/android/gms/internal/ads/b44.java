package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class b44 extends bc3 {

    /* renamed from: F0 */
    private static final byte[] f4690F0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A */
    private final long[] f4691A;

    /* renamed from: A0 */
    private long f4692A0;

    /* renamed from: B */
    private final long[] f4693B;

    /* renamed from: B0 */
    private long f4694B0;

    /* renamed from: C */
    private final long[] f4695C;

    /* renamed from: C0 */
    private int f4696C0;

    /* renamed from: D */
    private C1574c0 f4697D;

    /* renamed from: D0 */
    private c34 f4698D0;

    /* renamed from: E */
    private C1574c0 f4699E;

    /* renamed from: E0 */
    private c34 f4700E0;

    /* renamed from: F */
    private MediaCrypto f4701F;

    /* renamed from: G */
    private boolean f4702G;

    /* renamed from: H */
    private long f4703H;

    /* renamed from: I */
    private float f4704I;

    /* renamed from: J */
    private float f4705J;

    /* renamed from: K */
    private x34 f4706K;

    /* renamed from: L */
    private C1574c0 f4707L;

    /* renamed from: M */
    private MediaFormat f4708M;

    /* renamed from: N */
    private boolean f4709N;

    /* renamed from: O */
    private float f4710O;

    /* renamed from: P */
    private ArrayDeque<z34> f4711P;

    /* renamed from: Q */
    private a44 f4712Q;

    /* renamed from: R */
    private z34 f4713R;

    /* renamed from: S */
    private int f4714S;

    /* renamed from: T */
    private boolean f4715T;

    /* renamed from: U */
    private boolean f4716U;

    /* renamed from: V */
    private boolean f4717V;

    /* renamed from: W */
    private boolean f4718W;

    /* renamed from: X */
    private boolean f4719X;

    /* renamed from: Y */
    private boolean f4720Y;

    /* renamed from: Z */
    private boolean f4721Z;

    /* renamed from: a0 */
    private boolean f4722a0;

    /* renamed from: b0 */
    private boolean f4723b0;

    /* renamed from: c0 */
    private boolean f4724c0;

    /* renamed from: d0 */
    private s34 f4725d0;

    /* renamed from: e0 */
    private long f4726e0;

    /* renamed from: f0 */
    private int f4727f0;

    /* renamed from: g0 */
    private int f4728g0;

    /* renamed from: h0 */
    private ByteBuffer f4729h0;

    /* renamed from: i0 */
    private boolean f4730i0;

    /* renamed from: j0 */
    private boolean f4731j0;

    /* renamed from: k0 */
    private boolean f4732k0;

    /* renamed from: l0 */
    private boolean f4733l0;

    /* renamed from: m0 */
    private boolean f4734m0;

    /* renamed from: n0 */
    private boolean f4735n0;

    /* renamed from: o0 */
    private int f4736o0;

    /* renamed from: p0 */
    private int f4737p0;

    /* renamed from: q */
    private final w34 f4738q;

    /* renamed from: q0 */
    private int f4739q0;

    /* renamed from: r */
    private final d44 f4740r;

    /* renamed from: r0 */
    private boolean f4741r0;

    /* renamed from: s */
    private final float f4742s;

    /* renamed from: s0 */
    private boolean f4743s0;

    /* renamed from: t */
    private final z51 f4744t = new z51(0, 0);

    /* renamed from: t0 */
    private boolean f4745t0;

    /* renamed from: u */
    private final z51 f4746u = new z51(0, 0);

    /* renamed from: u0 */
    private long f4747u0;

    /* renamed from: v */
    private final z51 f4748v = new z51(2, 0);

    /* renamed from: v0 */
    private long f4749v0;

    /* renamed from: w */
    private final q34 f4750w;

    /* renamed from: w0 */
    private boolean f4751w0;

    /* renamed from: x */
    private final jx2<C1574c0> f4752x;

    /* renamed from: x0 */
    private boolean f4753x0;

    /* renamed from: y */
    private final ArrayList<Long> f4754y;

    /* renamed from: y0 */
    private boolean f4755y0;

    /* renamed from: z */
    private final MediaCodec.BufferInfo f4756z;

    /* renamed from: z0 */
    protected cd3 f4757z0;

    public b44(int i, w34 w34, d44 d44, boolean z, float f) {
        super(i);
        this.f4738q = w34;
        Objects.requireNonNull(d44);
        this.f4740r = d44;
        this.f4742s = f;
        q34 q34 = new q34();
        this.f4750w = q34;
        this.f4752x = new jx2<>(10);
        this.f4754y = new ArrayList<>();
        this.f4756z = new MediaCodec.BufferInfo();
        this.f4704I = 1.0f;
        this.f4705J = 1.0f;
        this.f4703H = -9223372036854775807L;
        this.f4691A = new long[10];
        this.f4693B = new long[10];
        this.f4695C = new long[10];
        this.f4692A0 = -9223372036854775807L;
        this.f4694B0 = -9223372036854775807L;
        q34.mo12148i(0);
        q34.f18033c.order(ByteOrder.nativeOrder());
        this.f4710O = -1.0f;
        this.f4714S = 0;
        this.f4736o0 = 0;
        this.f4727f0 = -1;
        this.f4728g0 = -1;
        this.f4726e0 = -9223372036854775807L;
        this.f4747u0 = -9223372036854775807L;
        this.f4749v0 = -9223372036854775807L;
        this.f4737p0 = 0;
        this.f4739q0 = 0;
    }

    /* renamed from: B0 */
    protected static boolean m6609B0(C1574c0 c0Var) {
        return c0Var.f5221E == 0;
    }

    @TargetApi(23)
    /* renamed from: C0 */
    private final void m6610C0() {
        int i = this.f4739q0;
        if (i == 1) {
            mo8856h0();
        } else if (i == 2) {
            mo8856h0();
            m6613F0();
        } else if (i != 3) {
            this.f4753x0 = true;
            mo5693k0();
        } else {
            mo5705v0();
            mo5703t0();
        }
    }

    /* renamed from: D0 */
    private final void m6611D0() {
        this.f4727f0 = -1;
        this.f4746u.f18033c = null;
    }

    /* renamed from: E0 */
    private final void m6612E0() {
        this.f4728g0 = -1;
        this.f4729h0 = null;
    }

    /* renamed from: F0 */
    private final void m6613F0() {
        try {
            throw null;
        } catch (MediaCryptoException e) {
            throw mo5803w(e, this.f4697D, false, 6006);
        }
    }

    @TargetApi(23)
    /* renamed from: G0 */
    private final boolean m6614G0() {
        if (this.f4741r0) {
            this.f4737p0 = 1;
            if (this.f4716U || this.f4718W) {
                this.f4739q0 = 3;
                return false;
            }
            this.f4739q0 = 2;
        } else {
            m6613F0();
        }
        return true;
    }

    /* renamed from: R */
    private final void m6615R() {
        this.f4734m0 = false;
        this.f4750w.mo10238b();
        this.f4748v.mo10238b();
        this.f4733l0 = false;
        this.f4732k0 = false;
    }

    /* renamed from: S */
    private final void mo10755S() {
        if (this.f4741r0) {
            this.f4737p0 = 1;
            this.f4739q0 = 3;
            return;
        }
        mo5705v0();
        mo5703t0();
    }

    /* renamed from: c0 */
    private final boolean m6617c0() {
        x34 x34 = this.f4706K;
        if (x34 == null || this.f4737p0 == 2 || this.f4751w0) {
            return false;
        }
        if (this.f4727f0 < 0) {
            int zza = x34.zza();
            this.f4727f0 = zza;
            if (zza < 0) {
                return false;
            }
            this.f4746u.f18033c = this.f4706K.mo8596D(zza);
            this.f4746u.mo10238b();
        }
        if (this.f4737p0 == 1) {
            if (!this.f4724c0) {
                this.f4743s0 = true;
                this.f4706K.mo8599b(this.f4727f0, 0, 0, 0, 4);
                m6611D0();
            }
            this.f4737p0 = 2;
            return false;
        } else if (this.f4722a0) {
            this.f4722a0 = false;
            this.f4746u.f18033c.put(f4690F0);
            this.f4706K.mo8599b(this.f4727f0, 0, 38, 0, 0);
            m6611D0();
            this.f4741r0 = true;
            return true;
        } else {
            if (this.f4736o0 == 1) {
                for (int i = 0; i < this.f4707L.f5236n.size(); i++) {
                    this.f4746u.f18033c.put(this.f4707L.f5236n.get(i));
                }
                this.f4736o0 = 2;
            }
            int position = this.f4746u.f18033c.position();
            cx3 y = mo5805y();
            try {
                int u = mo5802u(y, this.f4746u, 0);
                if (mo5779A()) {
                    this.f4749v0 = this.f4747u0;
                }
                if (u == -3) {
                    return false;
                }
                if (u == -5) {
                    if (this.f4736o0 == 2) {
                        this.f4746u.mo10238b();
                        this.f4736o0 = 1;
                    }
                    mo5680Q(y);
                    return true;
                } else if (this.f4746u.mo10915g()) {
                    if (this.f4736o0 == 2) {
                        this.f4746u.mo10238b();
                        this.f4736o0 = 1;
                    }
                    this.f4751w0 = true;
                    if (!this.f4741r0) {
                        m6610C0();
                        return false;
                    }
                    try {
                        if (!this.f4724c0) {
                            this.f4743s0 = true;
                            this.f4706K.mo8599b(this.f4727f0, 0, 0, 0, 4);
                            m6611D0();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw mo5803w(e, this.f4697D, false, nz3.m14194b(e.getErrorCode()));
                    }
                } else if (this.f4741r0 || this.f4746u.mo10916h()) {
                    boolean k = this.f4746u.mo12150k();
                    if (k) {
                        this.f4746u.f18032b.mo11369b(position);
                    }
                    if (this.f4715T && !k) {
                        ByteBuffer byteBuffer = this.f4746u.f18033c;
                        byte[] bArr = th2.f14860a;
                        int position2 = byteBuffer.position();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            int i4 = i2 + 1;
                            if (i4 >= position2) {
                                byteBuffer.clear();
                                break;
                            }
                            byte b = byteBuffer.get(i2) & 255;
                            if (i3 == 3) {
                                if (b == 1) {
                                    if ((byteBuffer.get(i4) & 31) == 7) {
                                        ByteBuffer duplicate = byteBuffer.duplicate();
                                        duplicate.position(i2 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer.position(0);
                                        byteBuffer.put(duplicate);
                                        break;
                                    }
                                    b = 1;
                                }
                            } else if (b == 0) {
                                i3++;
                            }
                            if (b != 0) {
                                i3 = 0;
                            }
                            i2 = i4;
                        }
                        if (this.f4746u.f18033c.position() == 0) {
                            return true;
                        }
                        this.f4715T = false;
                    }
                    z51 z51 = this.f4746u;
                    long j = z51.f18035e;
                    s34 s34 = this.f4725d0;
                    if (s34 != null) {
                        j = s34.mo10719b(this.f4697D, z51);
                        this.f4747u0 = Math.max(this.f4747u0, this.f4725d0.mo10718a(this.f4697D));
                    }
                    long j2 = j;
                    if (this.f4746u.mo10914f()) {
                        this.f4754y.add(Long.valueOf(j2));
                    }
                    if (this.f4755y0) {
                        this.f4752x.mo8548d(j2, this.f4697D);
                        this.f4755y0 = false;
                    }
                    this.f4747u0 = Math.max(this.f4747u0, j2);
                    this.f4746u.mo12149j();
                    if (this.f4746u.mo10913e()) {
                        mo5702s0(this.f4746u);
                    }
                    mo5692j0(this.f4746u);
                    if (k) {
                        try {
                            this.f4706K.mo8603f(this.f4727f0, 0, this.f4746u.f18032b, j2, 0);
                        } catch (MediaCodec.CryptoException e2) {
                            throw mo5803w(e2, this.f4697D, false, nz3.m14194b(e2.getErrorCode()));
                        }
                    } else {
                        this.f4706K.mo8599b(this.f4727f0, 0, this.f4746u.f18033c.limit(), j2, 0);
                    }
                    m6611D0();
                    this.f4741r0 = true;
                    this.f4736o0 = 0;
                    this.f4757z0.f5384c++;
                    return true;
                } else {
                    this.f4746u.mo10238b();
                    if (this.f4736o0 == 2) {
                        this.f4736o0 = 1;
                    }
                    return true;
                }
            } catch (x41 e3) {
                mo5683V(e3);
                m6619e0(0);
                mo8856h0();
                return true;
            }
        }
    }

    /* renamed from: d0 */
    private final boolean m6618d0() {
        return this.f4728g0 >= 0;
    }

    /* renamed from: e0 */
    private final boolean m6619e0(int i) {
        cx3 y = mo5805y();
        this.f4744t.mo10238b();
        int u = mo5802u(y, this.f4744t, i | 4);
        if (u == -5) {
            mo5680Q(y);
            return true;
        } else if (u != -4 || !this.f4744t.mo10915g()) {
            return false;
        } else {
            this.f4751w0 = true;
            m6610C0();
            return false;
        }
    }

    /* renamed from: f0 */
    private final boolean m6620f0(long j) {
        return this.f4703H == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.f4703H;
    }

    /* renamed from: g0 */
    private final boolean m6621g0(C1574c0 c0Var) {
        if (!(n13.f11236a < 23 || this.f4706K == null || this.f4739q0 == 3 || mo5798q() == 0)) {
            float N = mo5677N(this.f4705J, c0Var, mo5801t());
            float f = this.f4710O;
            if (f == N) {
                return true;
            }
            if (N == -1.0f) {
                mo10755S();
                return false;
            } else if (f == -1.0f && N <= this.f4742s) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", N);
                this.f4706K.mo8597S(bundle);
                this.f4710O = N;
            }
        }
        return true;
    }

    /* renamed from: h0 */
    private final void mo8856h0() {
        try {
            this.f4706K.mo8605h();
        } finally {
            mo5706w0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A0 */
    public boolean mo5670A0(z34 z34) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo5671C() {
        this.f4697D = null;
        this.f4692A0 = -9223372036854775807L;
        this.f4694B0 = -9223372036854775807L;
        this.f4696C0 = 0;
        mo5709z0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo5672D(boolean z, boolean z2) {
        this.f4757z0 = new cd3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo5673E(long j, boolean z) {
        this.f4751w0 = false;
        this.f4753x0 = false;
        if (this.f4732k0) {
            this.f4750w.mo10238b();
            this.f4748v.mo10238b();
            this.f4733l0 = false;
        } else {
            mo5708y0();
        }
        if (this.f4752x.mo8545a() > 0) {
            this.f4755y0 = true;
        }
        this.f4752x.mo8549e();
        int i = this.f4696C0;
        if (i != 0) {
            int i2 = i - 1;
            this.f4694B0 = this.f4693B[i2];
            this.f4692A0 = this.f4691A[i2];
            this.f4696C0 = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo5674G() {
        try {
            m6615R();
            mo5705v0();
        } finally {
            this.f4700E0 = null;
        }
    }

    /* renamed from: J */
    public boolean mo5675J() {
        return this.f4753x0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final void mo5676M(C1574c0[] c0VarArr, long j, long j2) {
        boolean z = true;
        if (this.f4694B0 == -9223372036854775807L) {
            if (this.f4692A0 != -9223372036854775807L) {
                z = false;
            }
            wu1.m19207f(z);
            this.f4692A0 = j;
            this.f4694B0 = j2;
            return;
        }
        int i = this.f4696C0;
        if (i == 10) {
            long j3 = this.f4693B[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j3);
            Log.w("MediaCodecRenderer", sb.toString());
        } else {
            this.f4696C0 = i + 1;
        }
        long[] jArr = this.f4691A;
        int i2 = this.f4696C0 - 1;
        jArr[i2] = j;
        this.f4693B[i2] = j2;
        this.f4695C[i2] = this.f4747u0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public abstract float mo5677N(float f, C1574c0 c0Var, C1574c0[] c0VarArr);

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public abstract int mo5678O(d44 d44, C1574c0 c0Var);

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public abstract de3 mo5679P(z34 z34, C1574c0 c0Var, C1574c0 c0Var2);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (m6614G0() == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        if (m6614G0() == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009a, code lost:
        if (m6614G0() == false) goto L_0x009c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cf A[RETURN] */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.de3 mo5680Q(com.google.android.gms.internal.ads.cx3 r13) {
        /*
            r12 = this;
            r0 = 1
            r12.f4755y0 = r0
            com.google.android.gms.internal.ads.c0 r4 = r13.f5555a
            java.util.Objects.requireNonNull(r4)
            java.lang.String r1 = r4.f5234l
            r2 = 0
            if (r1 == 0) goto L_0x00f7
            com.google.android.gms.internal.ads.c34 r13 = r13.f5556b
            r12.f4700E0 = r13
            r12.f4697D = r4
            boolean r1 = r12.f4732k0
            r3 = 0
            if (r1 == 0) goto L_0x001b
            r12.f4734m0 = r0
            return r3
        L_0x001b:
            com.google.android.gms.internal.ads.x34 r1 = r12.f4706K
            if (r1 != 0) goto L_0x0025
            r12.f4711P = r3
            r12.mo5703t0()
            return r3
        L_0x0025:
            com.google.android.gms.internal.ads.z34 r3 = r12.f4713R
            com.google.android.gms.internal.ads.c0 r5 = r12.f4707L
            com.google.android.gms.internal.ads.c34 r6 = r12.f4698D0
            r7 = 23
            if (r6 != r13) goto L_0x00d0
            if (r13 == r6) goto L_0x0038
            int r8 = com.google.android.gms.internal.ads.n13.f11236a
            if (r8 < r7) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r7 = r2
            goto L_0x0039
        L_0x0038:
            r7 = r0
        L_0x0039:
            com.google.android.gms.internal.ads.wu1.m19207f(r7)
            com.google.android.gms.internal.ads.de3 r7 = r12.mo5679P(r3, r5, r4)
            int r8 = r7.f5780d
            r9 = 3
            r10 = 16
            r11 = 2
            if (r8 == 0) goto L_0x00b3
            if (r8 == r0) goto L_0x008a
            if (r8 == r11) goto L_0x005e
            boolean r0 = r12.m6621g0(r4)
            if (r0 != 0) goto L_0x0053
            goto L_0x0090
        L_0x0053:
            r12.f4707L = r4
            if (r13 == r6) goto L_0x00b6
            boolean r13 = r12.m6614G0()
            if (r13 != 0) goto L_0x00b6
            goto L_0x009c
        L_0x005e:
            boolean r8 = r12.m6621g0(r4)
            if (r8 != 0) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            r12.f4735n0 = r0
            r12.f4736o0 = r0
            int r8 = r12.f4714S
            if (r8 == r11) goto L_0x007d
            if (r8 != r0) goto L_0x007c
            int r8 = r4.f5239q
            int r10 = r5.f5239q
            if (r8 != r10) goto L_0x007c
            int r8 = r4.f5240r
            int r10 = r5.f5240r
            if (r8 != r10) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r0 = r2
        L_0x007d:
            r12.f4722a0 = r0
            r12.f4707L = r4
            if (r13 == r6) goto L_0x00b6
            boolean r13 = r12.m6614G0()
            if (r13 != 0) goto L_0x00b6
            goto L_0x009c
        L_0x008a:
            boolean r8 = r12.m6621g0(r4)
            if (r8 != 0) goto L_0x0092
        L_0x0090:
            r6 = r10
            goto L_0x00b7
        L_0x0092:
            r12.f4707L = r4
            if (r13 == r6) goto L_0x009e
            boolean r13 = r12.m6614G0()
            if (r13 != 0) goto L_0x00b6
        L_0x009c:
            r6 = r11
            goto L_0x00b7
        L_0x009e:
            boolean r13 = r12.f4741r0
            if (r13 == 0) goto L_0x00b6
            r12.f4737p0 = r0
            boolean r13 = r12.f4716U
            if (r13 != 0) goto L_0x00b0
            boolean r13 = r12.f4718W
            if (r13 == 0) goto L_0x00ad
            goto L_0x00b0
        L_0x00ad:
            r12.f4739q0 = r0
            goto L_0x00b6
        L_0x00b0:
            r12.f4739q0 = r9
            goto L_0x009c
        L_0x00b3:
            r12.mo10755S()
        L_0x00b6:
            r6 = r2
        L_0x00b7:
            int r13 = r7.f5780d
            if (r13 == 0) goto L_0x00cf
            com.google.android.gms.internal.ads.x34 r13 = r12.f4706K
            if (r13 != r1) goto L_0x00c3
            int r13 = r12.f4739q0
            if (r13 != r9) goto L_0x00cf
        L_0x00c3:
            com.google.android.gms.internal.ads.de3 r13 = new com.google.android.gms.internal.ads.de3
            java.lang.String r2 = r3.f18012a
            r0 = 0
            r1 = r13
            r3 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        L_0x00cf:
            return r7
        L_0x00d0:
            if (r13 == 0) goto L_0x00e6
            if (r6 != 0) goto L_0x00d5
            goto L_0x00e6
        L_0x00d5:
            int r13 = com.google.android.gms.internal.ads.n13.f11236a
            if (r13 < r7) goto L_0x00e6
            java.util.UUID r13 = com.google.android.gms.internal.ads.nz3.f11785e
            java.util.UUID r0 = com.google.android.gms.internal.ads.nz3.f11781a
            boolean r1 = r13.equals(r0)
            if (r1 != 0) goto L_0x00e6
            r13.equals(r0)
        L_0x00e6:
            r12.mo10755S()
            com.google.android.gms.internal.ads.de3 r13 = new com.google.android.gms.internal.ads.de3
            java.lang.String r2 = r3.f18012a
            r0 = 0
            r6 = 128(0x80, float:1.794E-43)
            r1 = r13
            r3 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        L_0x00f7:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            com.google.android.gms.internal.ads.ll3 r13 = r12.mo5803w(r13, r4, r2, r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b44.mo5680Q(com.google.android.gms.internal.ads.cx3):com.google.android.gms.internal.ads.de3");
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public abstract v34 mo5681T(z34 z34, C1574c0 c0Var, MediaCrypto mediaCrypto, float f);

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public abstract List<z34> mo5682U(d44 d44, C1574c0 c0Var, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public abstract void mo5683V(Exception exc);

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public abstract void mo5684W(String str, long j, long j2);

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public abstract void mo5685X(String str);

    /* renamed from: a0 */
    public boolean mo5686a0() {
        if (this.f4697D != null) {
            if (mo5800s() || m6618d0()) {
                return true;
            }
            if (this.f4726e0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f4726e0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final int mo5687b() {
        return 8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public abstract void mo5688b0(C1574c0 c0Var, MediaFormat mediaFormat);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.google.android.gms.internal.ads.b44} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: com.google.android.gms.internal.ads.b44} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: com.google.android.gms.internal.ads.x34} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: com.google.android.gms.internal.ads.b44} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: android.media.MediaFormat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: com.google.android.gms.internal.ads.b44} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v25, resolved type: com.google.android.gms.internal.ads.c0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v84, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v85, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v87, resolved type: com.google.android.gms.internal.ads.b44} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v88, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v89, resolved type: com.google.android.gms.internal.ads.b44} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v91, resolved type: com.google.android.gms.internal.ads.b44} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v92, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v93, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v94, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v95, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v96, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v34, resolved type: com.google.android.gms.internal.ads.c0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v35, resolved type: com.google.android.gms.internal.ads.b44} */
    /* JADX WARNING: type inference failed for: r19v0 */
    /* JADX WARNING: type inference failed for: r19v1 */
    /* JADX WARNING: type inference failed for: r19v3 */
    /* JADX WARNING: type inference failed for: r19v6 */
    /* JADX WARNING: type inference failed for: r19v16 */
    /* JADX WARNING: type inference failed for: r19v19 */
    /* JADX WARNING: type inference failed for: r19v20 */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:178|179|180|181|182|(1:184)|185) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:94|95|(1:97)|98|270|(1:206)|210|221|222) */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01b4, code lost:
        if (r15.f4737p0 == r11) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01b6, code lost:
        m6610C0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0274, code lost:
        if (r15.f4699E != null) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02c0, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:?, code lost:
        m6610C0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02c3, code lost:
        r15 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x02c5, code lost:
        r19 = r19;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02c7, code lost:
        if (r15.f4753x0 != false) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02c9, code lost:
        mo5705v0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x02cc, code lost:
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x02d0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x02d1, code lost:
        r2 = true;
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x033e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x033f, code lost:
        r1 = r15;
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0389, code lost:
        r1.mo5683V(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x038c, code lost:
        if (r3 < 21) goto L_0x039d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x039b, code lost:
        r14 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x039d, code lost:
        r14 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x039f, code lost:
        if (r14 != false) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x03a1, code lost:
        mo5705v0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x03b2, code lost:
        throw r1.mo5803w(r1.mo5700q0(r0, r1.f4713R), r1.f4697D, r14, 4003);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r15.f4753x0 = true;
        r13 = false;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x015e, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        m6610C0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0163, code lost:
        if (r15.f4753x0 != false) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0165, code lost:
        mo5705v0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0168, code lost:
        r2 = r9;
        r19 = r13;
        r1 = r15;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:178:0x02c0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:94:0x015e */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0178 A[Catch:{ IllegalStateException -> 0x0364 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01ba A[Catch:{ IllegalStateException -> 0x0364 }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x031d A[Catch:{ IllegalStateException -> 0x0361 }, LOOP:2: B:85:0x0147->B:204:0x031d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0329 A[Catch:{ IllegalStateException -> 0x0361 }, LOOP:4: B:206:0x0329->B:209:0x0333, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x031c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0326 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5689e(long r24, long r26) {
        /*
            r23 = this;
            r15 = r23
            r14 = 1
            r13 = 0
            boolean r0 = r15.f4753x0     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 == 0) goto L_0x000c
            r23.mo5693k0()     // Catch:{ IllegalStateException -> 0x0364 }
            return
        L_0x000c:
            com.google.android.gms.internal.ads.c0 r0 = r15.f4697D     // Catch:{ IllegalStateException -> 0x0364 }
            r11 = 2
            if (r0 != 0) goto L_0x0019
            boolean r0 = r15.m6619e0(r11)     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            r23.mo5703t0()     // Catch:{ IllegalStateException -> 0x0364 }
            boolean r0 = r15.f4732k0     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 == 0) goto L_0x013a
            java.lang.String r0 = "bypassRender"
            com.google.android.gms.internal.ads.lz2.m12992a(r0)     // Catch:{ IllegalStateException -> 0x0364 }
        L_0x0025:
            boolean r0 = r15.f4753x0     // Catch:{ IllegalStateException -> 0x0364 }
            r0 = r0 ^ r14
            com.google.android.gms.internal.ads.wu1.m19207f(r0)     // Catch:{ IllegalStateException -> 0x0364 }
            com.google.android.gms.internal.ads.q34 r0 = r15.f4750w     // Catch:{ IllegalStateException -> 0x0364 }
            boolean r0 = r0.mo10243q()     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 == 0) goto L_0x007f
            com.google.android.gms.internal.ads.q34 r0 = r15.f4750w     // Catch:{ IllegalStateException -> 0x0364 }
            java.nio.ByteBuffer r7 = r0.f18033c     // Catch:{ IllegalStateException -> 0x0364 }
            int r8 = r15.f4728g0     // Catch:{ IllegalStateException -> 0x0364 }
            int r10 = r0.mo10239m()     // Catch:{ IllegalStateException -> 0x0364 }
            com.google.android.gms.internal.ads.q34 r0 = r15.f4750w     // Catch:{ IllegalStateException -> 0x0364 }
            long r11 = r0.f18035e     // Catch:{ IllegalStateException -> 0x0364 }
            r6 = 0
            r9 = 0
            boolean r0 = r0.mo10914f()     // Catch:{ IllegalStateException -> 0x0364 }
            com.google.android.gms.internal.ads.q34 r1 = r15.f4750w     // Catch:{ IllegalStateException -> 0x0364 }
            boolean r16 = r1.mo10915g()     // Catch:{ IllegalStateException -> 0x0364 }
            com.google.android.gms.internal.ads.c0 r4 = r15.f4699E     // Catch:{ IllegalStateException -> 0x0364 }
            r1 = r23
            r2 = r24
            r17 = r4
            r4 = r26
            r13 = r0
            r14 = r16
            r15 = r17
            boolean r0 = r1.mo5694l0(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0079 }
            if (r0 == 0) goto L_0x0073
            r15 = r23
            com.google.android.gms.internal.ads.q34 r0 = r15.f4750w     // Catch:{ IllegalStateException -> 0x0133 }
            long r0 = r0.mo10240n()     // Catch:{ IllegalStateException -> 0x0133 }
            r15.mo5704u0(r0)     // Catch:{ IllegalStateException -> 0x0133 }
            com.google.android.gms.internal.ads.q34 r0 = r15.f4750w     // Catch:{ IllegalStateException -> 0x0133 }
            r0.mo10238b()     // Catch:{ IllegalStateException -> 0x0133 }
            goto L_0x007f
        L_0x0073:
            r15 = r23
            r13 = 0
            r14 = 1
            goto L_0x0126
        L_0x0079:
            r0 = move-exception
            r2 = 1
            r19 = 0
            goto L_0x02d2
        L_0x007f:
            boolean r0 = r15.f4751w0     // Catch:{ IllegalStateException -> 0x0133 }
            r14 = 1
            if (r0 == 0) goto L_0x0089
            r15.f4753x0 = r14     // Catch:{ IllegalStateException -> 0x012f }
            r13 = 0
            goto L_0x0126
        L_0x0089:
            boolean r0 = r15.f4733l0     // Catch:{ IllegalStateException -> 0x012f }
            if (r0 == 0) goto L_0x009c
            com.google.android.gms.internal.ads.q34 r0 = r15.f4750w     // Catch:{ IllegalStateException -> 0x012f }
            com.google.android.gms.internal.ads.z51 r1 = r15.f4748v     // Catch:{ IllegalStateException -> 0x012f }
            boolean r0 = r0.mo10242p(r1)     // Catch:{ IllegalStateException -> 0x012f }
            com.google.android.gms.internal.ads.wu1.m19207f(r0)     // Catch:{ IllegalStateException -> 0x012f }
            r13 = 0
            r15.f4733l0 = r13     // Catch:{ IllegalStateException -> 0x0364 }
            goto L_0x009d
        L_0x009c:
            r13 = 0
        L_0x009d:
            boolean r0 = r15.f4734m0     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 == 0) goto L_0x00b5
            com.google.android.gms.internal.ads.q34 r0 = r15.f4750w     // Catch:{ IllegalStateException -> 0x0364 }
            boolean r0 = r0.mo10243q()     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 != 0) goto L_0x0025
            r23.m6615R()     // Catch:{ IllegalStateException -> 0x0364 }
            r15.f4734m0 = r13     // Catch:{ IllegalStateException -> 0x0364 }
            r23.mo5703t0()     // Catch:{ IllegalStateException -> 0x0364 }
            boolean r0 = r15.f4732k0     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 == 0) goto L_0x0126
        L_0x00b5:
            boolean r0 = r15.f4751w0     // Catch:{ IllegalStateException -> 0x0364 }
            r0 = r0 ^ r14
            com.google.android.gms.internal.ads.wu1.m19207f(r0)     // Catch:{ IllegalStateException -> 0x0364 }
            com.google.android.gms.internal.ads.cx3 r0 = r23.mo5805y()     // Catch:{ IllegalStateException -> 0x0364 }
            com.google.android.gms.internal.ads.z51 r1 = r15.f4748v     // Catch:{ IllegalStateException -> 0x0364 }
            r1.mo10238b()     // Catch:{ IllegalStateException -> 0x0364 }
        L_0x00c4:
            com.google.android.gms.internal.ads.z51 r1 = r15.f4748v     // Catch:{ IllegalStateException -> 0x0364 }
            r1.mo10238b()     // Catch:{ IllegalStateException -> 0x0364 }
            com.google.android.gms.internal.ads.z51 r1 = r15.f4748v     // Catch:{ IllegalStateException -> 0x0364 }
            int r1 = r15.mo5802u(r0, r1, r13)     // Catch:{ IllegalStateException -> 0x0364 }
            r2 = -5
            if (r1 == r2) goto L_0x0104
            r2 = -4
            if (r1 == r2) goto L_0x00d6
            goto L_0x0107
        L_0x00d6:
            com.google.android.gms.internal.ads.z51 r1 = r15.f4748v     // Catch:{ IllegalStateException -> 0x0364 }
            boolean r1 = r1.mo10915g()     // Catch:{ IllegalStateException -> 0x0364 }
            if (r1 == 0) goto L_0x00e1
            r15.f4751w0 = r14     // Catch:{ IllegalStateException -> 0x0364 }
            goto L_0x0107
        L_0x00e1:
            boolean r1 = r15.f4755y0     // Catch:{ IllegalStateException -> 0x0364 }
            if (r1 == 0) goto L_0x00f2
            com.google.android.gms.internal.ads.c0 r1 = r15.f4697D     // Catch:{ IllegalStateException -> 0x0364 }
            java.util.Objects.requireNonNull(r1)
            r15.f4699E = r1     // Catch:{ IllegalStateException -> 0x0364 }
            r2 = 0
            r15.mo5688b0(r1, r2)     // Catch:{ IllegalStateException -> 0x0364 }
            r15.f4755y0 = r13     // Catch:{ IllegalStateException -> 0x0364 }
        L_0x00f2:
            com.google.android.gms.internal.ads.z51 r1 = r15.f4748v     // Catch:{ IllegalStateException -> 0x0364 }
            r1.mo12149j()     // Catch:{ IllegalStateException -> 0x0364 }
            com.google.android.gms.internal.ads.q34 r1 = r15.f4750w     // Catch:{ IllegalStateException -> 0x0364 }
            com.google.android.gms.internal.ads.z51 r2 = r15.f4748v     // Catch:{ IllegalStateException -> 0x0364 }
            boolean r1 = r1.mo10242p(r2)     // Catch:{ IllegalStateException -> 0x0364 }
            if (r1 != 0) goto L_0x00c4
            r15.f4733l0 = r14     // Catch:{ IllegalStateException -> 0x0364 }
            goto L_0x0107
        L_0x0104:
            r15.mo5680Q(r0)     // Catch:{ IllegalStateException -> 0x0364 }
        L_0x0107:
            com.google.android.gms.internal.ads.q34 r0 = r15.f4750w     // Catch:{ IllegalStateException -> 0x0364 }
            boolean r0 = r0.mo10243q()     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 == 0) goto L_0x0114
            com.google.android.gms.internal.ads.q34 r0 = r15.f4750w     // Catch:{ IllegalStateException -> 0x0364 }
            r0.mo12149j()     // Catch:{ IllegalStateException -> 0x0364 }
        L_0x0114:
            com.google.android.gms.internal.ads.q34 r0 = r15.f4750w     // Catch:{ IllegalStateException -> 0x0364 }
            boolean r0 = r0.mo10243q()     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 != 0) goto L_0x0025
            boolean r0 = r15.f4751w0     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 != 0) goto L_0x0025
            boolean r0 = r15.f4734m0     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 == 0) goto L_0x0126
            goto L_0x0025
        L_0x0126:
            com.google.android.gms.internal.ads.lz2.m12993b()     // Catch:{ IllegalStateException -> 0x0364 }
            r19 = r13
            r2 = r14
            r1 = r15
            goto L_0x0359
        L_0x012f:
            r0 = move-exception
            r2 = r14
            r1 = r15
            goto L_0x0136
        L_0x0133:
            r0 = move-exception
            r1 = r15
            r2 = 1
        L_0x0136:
            r19 = 0
            goto L_0x0369
        L_0x013a:
            com.google.android.gms.internal.ads.x34 r0 = r15.f4706K     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 == 0) goto L_0x0347
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0341 }
            java.lang.String r0 = "drainAndFeed"
            com.google.android.gms.internal.ads.lz2.m12992a(r0)     // Catch:{ IllegalStateException -> 0x0341 }
        L_0x0147:
            boolean r0 = r23.m6618d0()     // Catch:{ IllegalStateException -> 0x0341 }
            if (r0 != 0) goto L_0x027f
            boolean r0 = r15.f4719X     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 == 0) goto L_0x016e
            boolean r0 = r15.f4743s0     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 == 0) goto L_0x016e
            com.google.android.gms.internal.ads.x34 r0 = r15.f4706K     // Catch:{ IllegalStateException -> 0x015e }
            android.media.MediaCodec$BufferInfo r1 = r15.f4756z     // Catch:{ IllegalStateException -> 0x015e }
            int r0 = r0.mo8604g(r1)     // Catch:{ IllegalStateException -> 0x015e }
            goto L_0x0176
        L_0x015e:
            r23.m6610C0()     // Catch:{ IllegalStateException -> 0x0364 }
            boolean r0 = r15.f4753x0     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 == 0) goto L_0x0168
            r23.mo5705v0()     // Catch:{ IllegalStateException -> 0x0364 }
        L_0x0168:
            r2 = r9
            r19 = r13
            r1 = r15
            goto L_0x0329
        L_0x016e:
            com.google.android.gms.internal.ads.x34 r0 = r15.f4706K     // Catch:{ IllegalStateException -> 0x0364 }
            android.media.MediaCodec$BufferInfo r1 = r15.f4756z     // Catch:{ IllegalStateException -> 0x0364 }
            int r0 = r0.mo8604g(r1)     // Catch:{ IllegalStateException -> 0x0364 }
        L_0x0176:
            if (r0 >= 0) goto L_0x01ba
            r1 = -2
            if (r0 != r1) goto L_0x01aa
            r15.f4745t0 = r14     // Catch:{ IllegalStateException -> 0x0364 }
            com.google.android.gms.internal.ads.x34 r0 = r15.f4706K     // Catch:{ IllegalStateException -> 0x0364 }
            android.media.MediaFormat r0 = r0.mo8600c()     // Catch:{ IllegalStateException -> 0x0364 }
            int r1 = r15.f4714S     // Catch:{ IllegalStateException -> 0x0364 }
            if (r1 == 0) goto L_0x019c
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x0364 }
            r2 = 32
            if (r1 != r2) goto L_0x019c
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x0364 }
            if (r1 != r2) goto L_0x019c
            r15.f4723b0 = r14     // Catch:{ IllegalStateException -> 0x0364 }
            goto L_0x01c5
        L_0x019c:
            boolean r1 = r15.f4721Z     // Catch:{ IllegalStateException -> 0x0364 }
            if (r1 == 0) goto L_0x01a5
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r14)     // Catch:{ IllegalStateException -> 0x0364 }
        L_0x01a5:
            r15.f4708M = r0     // Catch:{ IllegalStateException -> 0x0364 }
            r15.f4709N = r14     // Catch:{ IllegalStateException -> 0x0364 }
            goto L_0x01c5
        L_0x01aa:
            boolean r0 = r15.f4724c0     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 == 0) goto L_0x0168
            boolean r0 = r15.f4751w0     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 != 0) goto L_0x01b6
            int r0 = r15.f4737p0     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 != r11) goto L_0x0168
        L_0x01b6:
            r23.m6610C0()     // Catch:{ IllegalStateException -> 0x0364 }
            goto L_0x0168
        L_0x01ba:
            boolean r1 = r15.f4723b0     // Catch:{ IllegalStateException -> 0x0364 }
            if (r1 == 0) goto L_0x01cd
            r15.f4723b0 = r13     // Catch:{ IllegalStateException -> 0x0364 }
            com.google.android.gms.internal.ads.x34 r1 = r15.f4706K     // Catch:{ IllegalStateException -> 0x0364 }
            r1.mo8601d(r0, r13)     // Catch:{ IllegalStateException -> 0x0364 }
        L_0x01c5:
            r2 = r9
            r16 = r11
            r19 = r13
            r1 = r15
            goto L_0x0316
        L_0x01cd:
            android.media.MediaCodec$BufferInfo r1 = r15.f4756z     // Catch:{ IllegalStateException -> 0x0364 }
            int r2 = r1.size     // Catch:{ IllegalStateException -> 0x0364 }
            if (r2 != 0) goto L_0x01da
            int r1 = r1.flags     // Catch:{ IllegalStateException -> 0x0364 }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x01da
            goto L_0x01b6
        L_0x01da:
            r15.f4728g0 = r0     // Catch:{ IllegalStateException -> 0x0364 }
            com.google.android.gms.internal.ads.x34 r1 = r15.f4706K     // Catch:{ IllegalStateException -> 0x0364 }
            java.nio.ByteBuffer r0 = r1.mo8595A(r0)     // Catch:{ IllegalStateException -> 0x0364 }
            r15.f4729h0 = r0     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 == 0) goto L_0x01f9
            android.media.MediaCodec$BufferInfo r1 = r15.f4756z     // Catch:{ IllegalStateException -> 0x0364 }
            int r1 = r1.offset     // Catch:{ IllegalStateException -> 0x0364 }
            r0.position(r1)     // Catch:{ IllegalStateException -> 0x0364 }
            java.nio.ByteBuffer r0 = r15.f4729h0     // Catch:{ IllegalStateException -> 0x0364 }
            android.media.MediaCodec$BufferInfo r1 = r15.f4756z     // Catch:{ IllegalStateException -> 0x0364 }
            int r2 = r1.offset     // Catch:{ IllegalStateException -> 0x0364 }
            int r1 = r1.size     // Catch:{ IllegalStateException -> 0x0364 }
            int r2 = r2 + r1
            r0.limit(r2)     // Catch:{ IllegalStateException -> 0x0364 }
        L_0x01f9:
            boolean r0 = r15.f4720Y     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 == 0) goto L_0x021a
            android.media.MediaCodec$BufferInfo r0 = r15.f4756z     // Catch:{ IllegalStateException -> 0x0364 }
            long r1 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0364 }
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x021a
            int r1 = r0.flags     // Catch:{ IllegalStateException -> 0x0364 }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x021a
            long r1 = r15.f4747u0     // Catch:{ IllegalStateException -> 0x0364 }
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x021a
            r0.presentationTimeUs = r1     // Catch:{ IllegalStateException -> 0x0364 }
        L_0x021a:
            android.media.MediaCodec$BufferInfo r0 = r15.f4756z     // Catch:{ IllegalStateException -> 0x0364 }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0364 }
            java.util.ArrayList<java.lang.Long> r2 = r15.f4754y     // Catch:{ IllegalStateException -> 0x0364 }
            int r2 = r2.size()     // Catch:{ IllegalStateException -> 0x0364 }
            r3 = r13
        L_0x0225:
            if (r3 >= r2) goto L_0x0241
            java.util.ArrayList<java.lang.Long> r4 = r15.f4754y     // Catch:{ IllegalStateException -> 0x0364 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalStateException -> 0x0364 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ IllegalStateException -> 0x0364 }
            long r4 = r4.longValue()     // Catch:{ IllegalStateException -> 0x0364 }
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x023e
            java.util.ArrayList<java.lang.Long> r0 = r15.f4754y     // Catch:{ IllegalStateException -> 0x0364 }
            r0.remove(r3)     // Catch:{ IllegalStateException -> 0x0364 }
            r0 = r14
            goto L_0x0242
        L_0x023e:
            int r3 = r3 + 1
            goto L_0x0225
        L_0x0241:
            r0 = r13
        L_0x0242:
            r15.f4730i0 = r0     // Catch:{ IllegalStateException -> 0x0364 }
            long r0 = r15.f4749v0     // Catch:{ IllegalStateException -> 0x0364 }
            android.media.MediaCodec$BufferInfo r2 = r15.f4756z     // Catch:{ IllegalStateException -> 0x0364 }
            long r2 = r2.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0364 }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0250
            r0 = r14
            goto L_0x0251
        L_0x0250:
            r0 = r13
        L_0x0251:
            r15.f4731j0 = r0     // Catch:{ IllegalStateException -> 0x0364 }
            com.google.android.gms.internal.ads.jx2<com.google.android.gms.internal.ads.c0> r0 = r15.f4752x     // Catch:{ IllegalStateException -> 0x0364 }
            java.lang.Object r0 = r0.mo8547c(r2)     // Catch:{ IllegalStateException -> 0x0364 }
            com.google.android.gms.internal.ads.c0 r0 = (com.google.android.gms.internal.ads.C1574c0) r0     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 != 0) goto L_0x0269
            boolean r1 = r15.f4709N     // Catch:{ IllegalStateException -> 0x0364 }
            if (r1 == 0) goto L_0x0269
            com.google.android.gms.internal.ads.jx2<com.google.android.gms.internal.ads.c0> r0 = r15.f4752x     // Catch:{ IllegalStateException -> 0x0364 }
            java.lang.Object r0 = r0.mo8546b()     // Catch:{ IllegalStateException -> 0x0364 }
            com.google.android.gms.internal.ads.c0 r0 = (com.google.android.gms.internal.ads.C1574c0) r0     // Catch:{ IllegalStateException -> 0x0364 }
        L_0x0269:
            if (r0 == 0) goto L_0x026e
            r15.f4699E = r0     // Catch:{ IllegalStateException -> 0x0364 }
            goto L_0x0276
        L_0x026e:
            boolean r0 = r15.f4709N     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 == 0) goto L_0x027f
            com.google.android.gms.internal.ads.c0 r0 = r15.f4699E     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 == 0) goto L_0x027f
        L_0x0276:
            com.google.android.gms.internal.ads.c0 r0 = r15.f4699E     // Catch:{ IllegalStateException -> 0x0364 }
            android.media.MediaFormat r1 = r15.f4708M     // Catch:{ IllegalStateException -> 0x0364 }
            r15.mo5688b0(r0, r1)     // Catch:{ IllegalStateException -> 0x0364 }
            r15.f4709N = r13     // Catch:{ IllegalStateException -> 0x0364 }
        L_0x027f:
            boolean r0 = r15.f4719X     // Catch:{ IllegalStateException -> 0x0341 }
            if (r0 == 0) goto L_0x02d6
            boolean r0 = r15.f4743s0     // Catch:{ IllegalStateException -> 0x0364 }
            if (r0 == 0) goto L_0x02d6
            com.google.android.gms.internal.ads.x34 r6 = r15.f4706K     // Catch:{ IllegalStateException -> 0x02bc }
            java.nio.ByteBuffer r7 = r15.f4729h0     // Catch:{ IllegalStateException -> 0x02bc }
            int r8 = r15.f4728g0     // Catch:{ IllegalStateException -> 0x02bc }
            android.media.MediaCodec$BufferInfo r0 = r15.f4756z     // Catch:{ IllegalStateException -> 0x02bc }
            int r12 = r0.flags     // Catch:{ IllegalStateException -> 0x02bc }
            r16 = 1
            long r4 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x02bc }
            boolean r0 = r15.f4730i0     // Catch:{ IllegalStateException -> 0x02bc }
            boolean r2 = r15.f4731j0     // Catch:{ IllegalStateException -> 0x02bc }
            com.google.android.gms.internal.ads.c0 r3 = r15.f4699E     // Catch:{ IllegalStateException -> 0x02bc }
            r1 = r23
            r17 = r2
            r18 = r3
            r2 = r24
            r19 = r4
            r4 = r26
            r21 = r9
            r9 = r12
            r10 = r16
            r16 = r11
            r11 = r19
            r19 = r13
            r13 = r0
            r14 = r17
            r15 = r18
            boolean r0 = r1.mo5694l0(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x02c0 }
            goto L_0x02fa
        L_0x02bc:
            r21 = r9
            r19 = r13
        L_0x02c0:
            r23.m6610C0()     // Catch:{ IllegalStateException -> 0x02d0 }
            r15 = r23
            boolean r0 = r15.f4753x0     // Catch:{ IllegalStateException -> 0x033e }
            if (r0 == 0) goto L_0x02cc
            r23.mo5705v0()     // Catch:{ IllegalStateException -> 0x033e }
        L_0x02cc:
            r1 = r15
        L_0x02cd:
            r2 = r21
            goto L_0x0329
        L_0x02d0:
            r0 = move-exception
            r2 = 1
        L_0x02d2:
            r1 = r23
            goto L_0x0369
        L_0x02d6:
            r21 = r9
            r16 = r11
            r19 = r13
            com.google.android.gms.internal.ads.x34 r6 = r15.f4706K     // Catch:{ IllegalStateException -> 0x033e }
            java.nio.ByteBuffer r7 = r15.f4729h0     // Catch:{ IllegalStateException -> 0x033e }
            int r8 = r15.f4728g0     // Catch:{ IllegalStateException -> 0x033e }
            android.media.MediaCodec$BufferInfo r0 = r15.f4756z     // Catch:{ IllegalStateException -> 0x033e }
            int r9 = r0.flags     // Catch:{ IllegalStateException -> 0x033e }
            r10 = 1
            long r11 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x033e }
            boolean r13 = r15.f4730i0     // Catch:{ IllegalStateException -> 0x033e }
            boolean r14 = r15.f4731j0     // Catch:{ IllegalStateException -> 0x033e }
            com.google.android.gms.internal.ads.c0 r0 = r15.f4699E     // Catch:{ IllegalStateException -> 0x033e }
            r1 = r23
            r2 = r24
            r4 = r26
            r15 = r0
            boolean r0 = r1.mo5694l0(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x033a }
        L_0x02fa:
            if (r0 == 0) goto L_0x0326
            r1 = r23
            android.media.MediaCodec$BufferInfo r0 = r1.f4756z     // Catch:{ IllegalStateException -> 0x0361 }
            long r2 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0361 }
            r1.mo5704u0(r2)     // Catch:{ IllegalStateException -> 0x0361 }
            android.media.MediaCodec$BufferInfo r0 = r1.f4756z     // Catch:{ IllegalStateException -> 0x0361 }
            int r0 = r0.flags     // Catch:{ IllegalStateException -> 0x0361 }
            r23.m6612E0()     // Catch:{ IllegalStateException -> 0x0361 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0314
            r23.m6610C0()     // Catch:{ IllegalStateException -> 0x0361 }
            goto L_0x02cd
        L_0x0314:
            r2 = r21
        L_0x0316:
            boolean r0 = r1.m6620f0(r2)     // Catch:{ IllegalStateException -> 0x0361 }
            if (r0 != 0) goto L_0x031d
            goto L_0x0329
        L_0x031d:
            r15 = r1
            r9 = r2
            r11 = r16
            r13 = r19
            r14 = 1
            goto L_0x0147
        L_0x0326:
            r1 = r23
            goto L_0x02cd
        L_0x0329:
            boolean r0 = r23.m6617c0()     // Catch:{ IllegalStateException -> 0x0361 }
            if (r0 == 0) goto L_0x0335
            boolean r0 = r1.m6620f0(r2)     // Catch:{ IllegalStateException -> 0x0361 }
            if (r0 != 0) goto L_0x0329
        L_0x0335:
            com.google.android.gms.internal.ads.lz2.m12993b()     // Catch:{ IllegalStateException -> 0x0361 }
            r2 = 1
            goto L_0x0359
        L_0x033a:
            r0 = move-exception
            r1 = r23
            goto L_0x0362
        L_0x033e:
            r0 = move-exception
            r1 = r15
            goto L_0x0362
        L_0x0341:
            r0 = move-exception
            r19 = r13
            r1 = r15
            r2 = r14
            goto L_0x0369
        L_0x0347:
            r19 = r13
            r1 = r15
            com.google.android.gms.internal.ads.cd3 r0 = r1.f4757z0     // Catch:{ IllegalStateException -> 0x0361 }
            int r2 = r0.f5385d     // Catch:{ IllegalStateException -> 0x0361 }
            int r3 = r23.mo5804x(r24)     // Catch:{ IllegalStateException -> 0x0361 }
            int r2 = r2 + r3
            r0.f5385d = r2     // Catch:{ IllegalStateException -> 0x0361 }
            r2 = 1
            r1.m6619e0(r2)     // Catch:{ IllegalStateException -> 0x035f }
        L_0x0359:
            com.google.android.gms.internal.ads.cd3 r0 = r1.f4757z0     // Catch:{ IllegalStateException -> 0x035f }
            r0.mo6126a()     // Catch:{ IllegalStateException -> 0x035f }
            return
        L_0x035f:
            r0 = move-exception
            goto L_0x0369
        L_0x0361:
            r0 = move-exception
        L_0x0362:
            r2 = 1
            goto L_0x0369
        L_0x0364:
            r0 = move-exception
            r19 = r13
            r2 = r14
            r1 = r15
        L_0x0369:
            int r3 = com.google.android.gms.internal.ads.n13.f11236a
            r4 = 21
            if (r3 < r4) goto L_0x0374
            boolean r5 = r0 instanceof android.media.MediaCodec.CodecException
            if (r5 == 0) goto L_0x0374
            goto L_0x0389
        L_0x0374:
            java.lang.StackTraceElement[] r5 = r0.getStackTrace()
            int r6 = r5.length
            if (r6 <= 0) goto L_0x03b3
            r5 = r5[r19]
            java.lang.String r5 = r5.getClassName()
            java.lang.String r6 = "android.media.MediaCodec"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x03b3
        L_0x0389:
            r1.mo5683V(r0)
            if (r3 < r4) goto L_0x039d
            boolean r3 = r0 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x039d
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            boolean r3 = r3.isRecoverable()
            if (r3 == 0) goto L_0x039d
            r14 = r2
            goto L_0x039f
        L_0x039d:
            r14 = r19
        L_0x039f:
            if (r14 == 0) goto L_0x03a4
            r23.mo5705v0()
        L_0x03a4:
            com.google.android.gms.internal.ads.z34 r2 = r1.f4713R
            com.google.android.gms.internal.ads.y34 r0 = r1.mo5700q0(r0, r2)
            com.google.android.gms.internal.ads.c0 r2 = r1.f4697D
            r3 = 4003(0xfa3, float:5.61E-42)
            com.google.android.gms.internal.ads.ll3 r0 = r1.mo5803w(r0, r2, r14, r3)
            throw r0
        L_0x03b3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b44.mo5689e(long, long):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public abstract void mo5690i0();

    /* renamed from: j */
    public final int mo5691j(C1574c0 c0Var) {
        try {
            return mo5678O(this.f4740r, c0Var);
        } catch (k44 e) {
            throw mo5803w(e, c0Var, false, 4002);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public abstract void mo5692j0(z51 z51);

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public void mo5693k0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public abstract boolean mo5694l0(long j, long j2, x34 x34, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C1574c0 c0Var);

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public boolean mo5695m0(C1574c0 c0Var) {
        return false;
    }

    /* renamed from: n */
    public void mo5696n(float f, float f2) {
        this.f4704I = f;
        this.f4705J = f2;
        m6621g0(this.f4707L);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public final float mo5697n0() {
        return this.f4704I;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public final long mo5698o0() {
        return this.f4694B0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public final x34 mo5699p0() {
        return this.f4706K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public y34 mo5700q0(Throwable th, z34 z34) {
        return new y34(th, z34);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public final z34 mo5701r0() {
        return this.f4713R;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo5702s0(z51 z51) {
    }

    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v1, types: [com.google.android.gms.internal.ads.r44, android.view.Surface, android.media.MediaCrypto] */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0201 A[Catch:{ Exception -> 0x0382, k44 -> 0x0090, a44 -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0203 A[Catch:{ Exception -> 0x0382, k44 -> 0x0090, a44 -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0232 A[Catch:{ Exception -> 0x0382, k44 -> 0x0090, a44 -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x024a A[Catch:{ Exception -> 0x0382, k44 -> 0x0090, a44 -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x024c A[Catch:{ Exception -> 0x0382, k44 -> 0x0090, a44 -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0251 A[Catch:{ Exception -> 0x0382, k44 -> 0x0090, a44 -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x025e A[Catch:{ Exception -> 0x0382, k44 -> 0x0090, a44 -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x028e A[Catch:{ Exception -> 0x0382, k44 -> 0x0090, a44 -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0290 A[Catch:{ Exception -> 0x0382, k44 -> 0x0090, a44 -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x02ee A[Catch:{ Exception -> 0x0382, k44 -> 0x0090, a44 -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x02f0 A[Catch:{ Exception -> 0x0382, k44 -> 0x0090, a44 -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02f9 A[Catch:{ Exception -> 0x0382, k44 -> 0x0090, a44 -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x033a A[Catch:{ Exception -> 0x0382, k44 -> 0x0090, a44 -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x033b A[Catch:{ Exception -> 0x0382, k44 -> 0x0090, a44 -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x034d A[Catch:{ Exception -> 0x0382, k44 -> 0x0090, a44 -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x035b A[Catch:{ Exception -> 0x0382, k44 -> 0x0090, a44 -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x037e A[Catch:{ Exception -> 0x0382, k44 -> 0x0090, a44 -> 0x03cf }] */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5703t0() {
        /*
            r17 = this;
            r7 = r17
            com.google.android.gms.internal.ads.x34 r0 = r7.f4706K
            if (r0 != 0) goto L_0x03da
            boolean r0 = r7.f4732k0
            if (r0 != 0) goto L_0x03da
            com.google.android.gms.internal.ads.c0 r0 = r7.f4697D
            if (r0 != 0) goto L_0x0010
            goto L_0x03da
        L_0x0010:
            com.google.android.gms.internal.ads.c34 r1 = r7.f4700E0
            r8 = 1
            if (r1 != 0) goto L_0x004a
            boolean r0 = r7.mo5695m0(r0)
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.c0 r0 = r7.f4697D
            r17.m6615R()
            java.lang.String r0 = r0.f5234l
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0040
            java.lang.String r1 = "audio/mpeg"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0040
            java.lang.String r1 = "audio/opus"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0040
            com.google.android.gms.internal.ads.q34 r0 = r7.f4750w
            r0.mo10241o(r8)
            goto L_0x0047
        L_0x0040:
            com.google.android.gms.internal.ads.q34 r0 = r7.f4750w
            r1 = 32
            r0.mo10241o(r1)
        L_0x0047:
            r7.f4732k0 = r8
            return
        L_0x004a:
            com.google.android.gms.internal.ads.c34 r0 = r7.f4700E0
            r7.f4698D0 = r0
            com.google.android.gms.internal.ads.c0 r1 = r7.f4697D
            java.lang.String r2 = r1.f5234l
            r9 = 0
            if (r0 == 0) goto L_0x0067
            boolean r2 = com.google.android.gms.internal.ads.d34.f5638a
            if (r2 != 0) goto L_0x005a
            goto L_0x0067
        L_0x005a:
            com.google.android.gms.internal.ads.t24 r0 = r0.mo6039a()
            com.google.android.gms.internal.ads.c0 r1 = r7.f4697D
            int r2 = r0.f14689f
            com.google.android.gms.internal.ads.ll3 r0 = r7.mo5803w(r0, r1, r9, r2)
            throw r0
        L_0x0067:
            java.util.ArrayDeque<com.google.android.gms.internal.ads.z34> r0 = r7.f4711P     // Catch:{ a44 -> 0x03cf }
            r10 = 0
            if (r0 != 0) goto L_0x009c
            com.google.android.gms.internal.ads.d44 r0 = r7.f4740r     // Catch:{ k44 -> 0x0090 }
            java.util.List r0 = r7.mo5682U(r0, r1, r9)     // Catch:{ k44 -> 0x0090 }
            r0.isEmpty()     // Catch:{ k44 -> 0x0090 }
            java.util.ArrayDeque r1 = new java.util.ArrayDeque     // Catch:{ k44 -> 0x0090 }
            r1.<init>()     // Catch:{ k44 -> 0x0090 }
            r7.f4711P = r1     // Catch:{ k44 -> 0x0090 }
            boolean r1 = r0.isEmpty()     // Catch:{ k44 -> 0x0090 }
            if (r1 != 0) goto L_0x008d
            java.util.ArrayDeque<com.google.android.gms.internal.ads.z34> r1 = r7.f4711P     // Catch:{ k44 -> 0x0090 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ k44 -> 0x0090 }
            com.google.android.gms.internal.ads.z34 r0 = (com.google.android.gms.internal.ads.z34) r0     // Catch:{ k44 -> 0x0090 }
            r1.add(r0)     // Catch:{ k44 -> 0x0090 }
        L_0x008d:
            r7.f4712Q = r10     // Catch:{ k44 -> 0x0090 }
            goto L_0x009c
        L_0x0090:
            r0 = move-exception
            com.google.android.gms.internal.ads.a44 r1 = new com.google.android.gms.internal.ads.a44     // Catch:{ a44 -> 0x03cf }
            com.google.android.gms.internal.ads.c0 r2 = r7.f4697D     // Catch:{ a44 -> 0x03cf }
            r3 = -49998(0xffffffffffff3cb2, float:NaN)
            r1.<init>((com.google.android.gms.internal.ads.C1574c0) r2, (java.lang.Throwable) r0, (boolean) r9, (int) r3)     // Catch:{ a44 -> 0x03cf }
            throw r1     // Catch:{ a44 -> 0x03cf }
        L_0x009c:
            java.util.ArrayDeque<com.google.android.gms.internal.ads.z34> r0 = r7.f4711P     // Catch:{ a44 -> 0x03cf }
            boolean r0 = r0.isEmpty()     // Catch:{ a44 -> 0x03cf }
            if (r0 != 0) goto L_0x03c2
        L_0x00a4:
            com.google.android.gms.internal.ads.x34 r0 = r7.f4706K     // Catch:{ a44 -> 0x03cf }
            if (r0 != 0) goto L_0x03be
            java.util.ArrayDeque<com.google.android.gms.internal.ads.z34> r0 = r7.f4711P     // Catch:{ a44 -> 0x03cf }
            java.lang.Object r0 = r0.peekFirst()     // Catch:{ a44 -> 0x03cf }
            r11 = r0
            com.google.android.gms.internal.ads.z34 r11 = (com.google.android.gms.internal.ads.z34) r11     // Catch:{ a44 -> 0x03cf }
            boolean r0 = r7.mo5670A0(r11)     // Catch:{ a44 -> 0x03cf }
            if (r0 != 0) goto L_0x00b8
            return
        L_0x00b8:
            java.lang.String r2 = r11.f18012a     // Catch:{ Exception -> 0x0382 }
            int r0 = com.google.android.gms.internal.ads.n13.f11236a     // Catch:{ Exception -> 0x0382 }
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 23
            if (r0 >= r3) goto L_0x00c4
            r4 = r1
            goto L_0x00d0
        L_0x00c4:
            float r4 = r7.f4705J     // Catch:{ Exception -> 0x0382 }
            com.google.android.gms.internal.ads.c0 r5 = r7.f4697D     // Catch:{ Exception -> 0x0382 }
            com.google.android.gms.internal.ads.c0[] r6 = r17.mo5801t()     // Catch:{ Exception -> 0x0382 }
            float r4 = r7.mo5677N(r4, r5, r6)     // Catch:{ Exception -> 0x0382 }
        L_0x00d0:
            float r5 = r7.f4742s     // Catch:{ Exception -> 0x0382 }
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x00d7
            goto L_0x00d8
        L_0x00d7:
            r1 = r4
        L_0x00d8:
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0382 }
            java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0382 }
            int r12 = r6.length()     // Catch:{ Exception -> 0x0382 }
            java.lang.String r13 = "createCodec:"
            if (r12 == 0) goto L_0x00ed
            java.lang.String r6 = r13.concat(r6)     // Catch:{ Exception -> 0x0382 }
            goto L_0x00f2
        L_0x00ed:
            java.lang.String r6 = new java.lang.String     // Catch:{ Exception -> 0x0382 }
            r6.<init>(r13)     // Catch:{ Exception -> 0x0382 }
        L_0x00f2:
            com.google.android.gms.internal.ads.lz2.m12992a(r6)     // Catch:{ Exception -> 0x0382 }
            com.google.android.gms.internal.ads.c0 r6 = r7.f4697D     // Catch:{ Exception -> 0x0382 }
            com.google.android.gms.internal.ads.v34 r6 = r7.mo5681T(r11, r6, r10, r1)     // Catch:{ Exception -> 0x0382 }
            r12 = 31
            if (r0 < r12) goto L_0x012d
            com.google.android.gms.internal.ads.c0 r12 = r6.f15901c     // Catch:{ Exception -> 0x0382 }
            java.lang.String r12 = r12.f5234l     // Catch:{ Exception -> 0x0382 }
            int r12 = com.google.android.gms.internal.ads.C1645dy.m8164a(r12)     // Catch:{ Exception -> 0x0382 }
            java.lang.String r13 = "DefaultMediaCodecAdapterFactory"
            java.lang.String r14 = "Creating an asynchronous MediaCodec adapter for track type "
            java.lang.String r15 = com.google.android.gms.internal.ads.n13.m13637j(r12)     // Catch:{ Exception -> 0x0382 }
            int r16 = r15.length()     // Catch:{ Exception -> 0x0382 }
            if (r16 == 0) goto L_0x011a
            java.lang.String r14 = r14.concat(r15)     // Catch:{ Exception -> 0x0382 }
            goto L_0x0120
        L_0x011a:
            java.lang.String r15 = new java.lang.String     // Catch:{ Exception -> 0x0382 }
            r15.<init>(r14)     // Catch:{ Exception -> 0x0382 }
            r14 = r15
        L_0x0120:
            android.util.Log.i(r13, r14)     // Catch:{ Exception -> 0x0382 }
            com.google.android.gms.internal.ads.i34 r13 = new com.google.android.gms.internal.ads.i34     // Catch:{ Exception -> 0x0382 }
            r13.<init>(r12, r9)     // Catch:{ Exception -> 0x0382 }
            com.google.android.gms.internal.ads.k34 r6 = r13.mo8071c(r6)     // Catch:{ Exception -> 0x0382 }
            goto L_0x0172
        L_0x012d:
            com.google.android.gms.internal.ads.z34 r12 = r6.f15899a     // Catch:{ IOException -> 0x037a, RuntimeException -> 0x0378 }
            java.util.Objects.requireNonNull(r12)
            java.lang.String r12 = r12.f18012a     // Catch:{ IOException -> 0x037a, RuntimeException -> 0x0378 }
            java.lang.String r14 = java.lang.String.valueOf(r12)     // Catch:{ IOException -> 0x037a, RuntimeException -> 0x0378 }
            int r15 = r14.length()     // Catch:{ IOException -> 0x037a, RuntimeException -> 0x0378 }
            if (r15 == 0) goto L_0x0143
            java.lang.String r13 = r13.concat(r14)     // Catch:{ IOException -> 0x037a, RuntimeException -> 0x0378 }
            goto L_0x0149
        L_0x0143:
            java.lang.String r14 = new java.lang.String     // Catch:{ IOException -> 0x037a, RuntimeException -> 0x0378 }
            r14.<init>(r13)     // Catch:{ IOException -> 0x037a, RuntimeException -> 0x0378 }
            r13 = r14
        L_0x0149:
            com.google.android.gms.internal.ads.lz2.m12992a(r13)     // Catch:{ IOException -> 0x037a, RuntimeException -> 0x0378 }
            android.media.MediaCodec r12 = android.media.MediaCodec.createByCodecName(r12)     // Catch:{ IOException -> 0x037a, RuntimeException -> 0x0378 }
            com.google.android.gms.internal.ads.lz2.m12993b()     // Catch:{ IOException -> 0x037a, RuntimeException -> 0x0378 }
            java.lang.String r13 = "configureCodec"
            com.google.android.gms.internal.ads.lz2.m12992a(r13)     // Catch:{ IOException -> 0x0376, RuntimeException -> 0x0374 }
            android.media.MediaFormat r13 = r6.f15900b     // Catch:{ IOException -> 0x0376, RuntimeException -> 0x0374 }
            android.view.Surface r6 = r6.f15902d     // Catch:{ IOException -> 0x0376, RuntimeException -> 0x0374 }
            r12.configure(r13, r6, r10, r9)     // Catch:{ IOException -> 0x0376, RuntimeException -> 0x0374 }
            com.google.android.gms.internal.ads.lz2.m12993b()     // Catch:{ IOException -> 0x0376, RuntimeException -> 0x0374 }
            java.lang.String r6 = "startCodec"
            com.google.android.gms.internal.ads.lz2.m12992a(r6)     // Catch:{ IOException -> 0x0376, RuntimeException -> 0x0374 }
            r12.start()     // Catch:{ IOException -> 0x0376, RuntimeException -> 0x0374 }
            com.google.android.gms.internal.ads.lz2.m12993b()     // Catch:{ IOException -> 0x0376, RuntimeException -> 0x0374 }
            com.google.android.gms.internal.ads.t44 r6 = new com.google.android.gms.internal.ads.t44     // Catch:{ IOException -> 0x0376, RuntimeException -> 0x0374 }
            r6.<init>(r12, r10, r10)     // Catch:{ IOException -> 0x0376, RuntimeException -> 0x0374 }
        L_0x0172:
            r7.f4706K = r6     // Catch:{ Exception -> 0x0382 }
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0382 }
            r7.f4713R = r11     // Catch:{ Exception -> 0x0382 }
            r7.f4710O = r1     // Catch:{ Exception -> 0x0382 }
            com.google.android.gms.internal.ads.c0 r1 = r7.f4697D     // Catch:{ Exception -> 0x0382 }
            r7.f4707L = r1     // Catch:{ Exception -> 0x0382 }
            java.lang.String r1 = "OMX.Exynos.avc.dec.secure"
            r6 = 25
            if (r0 > r6) goto L_0x01b0
            boolean r15 = r1.equals(r2)     // Catch:{ Exception -> 0x0382 }
            if (r15 == 0) goto L_0x01b0
            java.lang.String r15 = com.google.android.gms.internal.ads.n13.f11239d     // Catch:{ Exception -> 0x0382 }
            java.lang.String r10 = "SM-T585"
            boolean r10 = r15.startsWith(r10)     // Catch:{ Exception -> 0x0382 }
            if (r10 != 0) goto L_0x01ae
            java.lang.String r10 = "SM-A510"
            boolean r10 = r15.startsWith(r10)     // Catch:{ Exception -> 0x0382 }
            if (r10 != 0) goto L_0x01ae
            java.lang.String r10 = "SM-A520"
            boolean r10 = r15.startsWith(r10)     // Catch:{ Exception -> 0x0382 }
            if (r10 != 0) goto L_0x01ae
            java.lang.String r10 = "SM-J700"
            boolean r10 = r15.startsWith(r10)     // Catch:{ Exception -> 0x0382 }
            if (r10 == 0) goto L_0x01b0
        L_0x01ae:
            r10 = 2
            goto L_0x01e9
        L_0x01b0:
            r10 = 24
            if (r0 >= r10) goto L_0x01e8
            java.lang.String r10 = "OMX.Nvidia.h264.decode"
            boolean r10 = r10.equals(r2)     // Catch:{ Exception -> 0x0382 }
            if (r10 != 0) goto L_0x01c4
            java.lang.String r10 = "OMX.Nvidia.h264.decode.secure"
            boolean r10 = r10.equals(r2)     // Catch:{ Exception -> 0x0382 }
            if (r10 == 0) goto L_0x01e8
        L_0x01c4:
            java.lang.String r10 = "flounder"
            java.lang.String r15 = com.google.android.gms.internal.ads.n13.f11237b     // Catch:{ Exception -> 0x0382 }
            boolean r10 = r10.equals(r15)     // Catch:{ Exception -> 0x0382 }
            if (r10 != 0) goto L_0x01e6
            java.lang.String r10 = "flounder_lte"
            boolean r10 = r10.equals(r15)     // Catch:{ Exception -> 0x0382 }
            if (r10 != 0) goto L_0x01e6
            java.lang.String r10 = "grouper"
            boolean r10 = r10.equals(r15)     // Catch:{ Exception -> 0x0382 }
            if (r10 != 0) goto L_0x01e6
            java.lang.String r10 = "tilapia"
            boolean r10 = r10.equals(r15)     // Catch:{ Exception -> 0x0382 }
            if (r10 == 0) goto L_0x01e8
        L_0x01e6:
            r10 = r8
            goto L_0x01e9
        L_0x01e8:
            r10 = r9
        L_0x01e9:
            r7.f4714S = r10     // Catch:{ Exception -> 0x0382 }
            com.google.android.gms.internal.ads.c0 r10 = r7.f4707L     // Catch:{ Exception -> 0x0382 }
            r15 = 21
            if (r0 >= r15) goto L_0x0203
            java.util.List<byte[]> r10 = r10.f5236n     // Catch:{ Exception -> 0x0382 }
            boolean r10 = r10.isEmpty()     // Catch:{ Exception -> 0x0382 }
            if (r10 == 0) goto L_0x0203
            java.lang.String r10 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r10 = r10.equals(r2)     // Catch:{ Exception -> 0x0382 }
            if (r10 == 0) goto L_0x0203
            r10 = r8
            goto L_0x0204
        L_0x0203:
            r10 = r9
        L_0x0204:
            r7.f4715T = r10     // Catch:{ Exception -> 0x0382 }
            r10 = 19
            r9 = 18
            if (r0 < r9) goto L_0x023b
            if (r0 != r9) goto L_0x021e
            java.lang.String r14 = "OMX.SEC.avc.dec"
            boolean r14 = r14.equals(r2)     // Catch:{ Exception -> 0x0382 }
            if (r14 != 0) goto L_0x023b
            java.lang.String r14 = "OMX.SEC.avc.dec.secure"
            boolean r14 = r14.equals(r2)     // Catch:{ Exception -> 0x0382 }
            if (r14 != 0) goto L_0x023b
        L_0x021e:
            if (r0 != r10) goto L_0x0239
            java.lang.String r14 = com.google.android.gms.internal.ads.n13.f11239d     // Catch:{ Exception -> 0x0382 }
            java.lang.String r6 = "SM-G800"
            boolean r6 = r14.startsWith(r6)     // Catch:{ Exception -> 0x0382 }
            if (r6 == 0) goto L_0x0239
            java.lang.String r6 = "OMX.Exynos.avc.dec"
            boolean r6 = r6.equals(r2)     // Catch:{ Exception -> 0x0382 }
            if (r6 != 0) goto L_0x023b
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x0382 }
            if (r1 == 0) goto L_0x0239
            goto L_0x023b
        L_0x0239:
            r1 = 0
            goto L_0x023c
        L_0x023b:
            r1 = r8
        L_0x023c:
            r7.f4716U = r1     // Catch:{ Exception -> 0x0382 }
            r1 = 29
            if (r0 != r1) goto L_0x024c
            java.lang.String r6 = "c2.android.aac.decoder"
            boolean r6 = r6.equals(r2)     // Catch:{ Exception -> 0x0382 }
            if (r6 == 0) goto L_0x024c
            r6 = r8
            goto L_0x024d
        L_0x024c:
            r6 = 0
        L_0x024d:
            r7.f4717V = r6     // Catch:{ Exception -> 0x0382 }
            if (r0 > r3) goto L_0x025c
            java.lang.String r3 = "OMX.google.vorbis.decoder"
            boolean r3 = r3.equals(r2)     // Catch:{ Exception -> 0x0382 }
            if (r3 != 0) goto L_0x025a
            goto L_0x025c
        L_0x025a:
            r3 = r8
            goto L_0x0282
        L_0x025c:
            if (r0 > r10) goto L_0x0281
            java.lang.String r3 = "hb2000"
            java.lang.String r6 = com.google.android.gms.internal.ads.n13.f11237b     // Catch:{ Exception -> 0x0382 }
            boolean r3 = r3.equals(r6)     // Catch:{ Exception -> 0x0382 }
            if (r3 != 0) goto L_0x0270
            java.lang.String r3 = "stvm8"
            boolean r3 = r3.equals(r6)     // Catch:{ Exception -> 0x0382 }
            if (r3 == 0) goto L_0x0281
        L_0x0270:
            java.lang.String r3 = "OMX.amlogic.avc.decoder.awesome"
            boolean r3 = r3.equals(r2)     // Catch:{ Exception -> 0x0382 }
            if (r3 != 0) goto L_0x025a
            java.lang.String r3 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r3 = r3.equals(r2)     // Catch:{ Exception -> 0x0382 }
            if (r3 == 0) goto L_0x0281
            goto L_0x025a
        L_0x0281:
            r3 = 0
        L_0x0282:
            r7.f4718W = r3     // Catch:{ Exception -> 0x0382 }
            if (r0 != r15) goto L_0x0290
            java.lang.String r3 = "OMX.google.aac.decoder"
            boolean r3 = r3.equals(r2)     // Catch:{ Exception -> 0x0382 }
            if (r3 == 0) goto L_0x0290
            r3 = r8
            goto L_0x0291
        L_0x0290:
            r3 = 0
        L_0x0291:
            r7.f4719X = r3     // Catch:{ Exception -> 0x0382 }
            if (r0 >= r15) goto L_0x02db
            java.lang.String r3 = "OMX.SEC.mp3.dec"
            boolean r3 = r3.equals(r2)     // Catch:{ Exception -> 0x0382 }
            if (r3 == 0) goto L_0x02db
            java.lang.String r3 = "samsung"
            java.lang.String r6 = com.google.android.gms.internal.ads.n13.f11238c     // Catch:{ Exception -> 0x0382 }
            boolean r3 = r3.equals(r6)     // Catch:{ Exception -> 0x0382 }
            if (r3 == 0) goto L_0x02db
            java.lang.String r3 = com.google.android.gms.internal.ads.n13.f11237b     // Catch:{ Exception -> 0x0382 }
            java.lang.String r6 = "baffin"
            boolean r6 = r3.startsWith(r6)     // Catch:{ Exception -> 0x0382 }
            if (r6 != 0) goto L_0x02d9
            java.lang.String r6 = "grand"
            boolean r6 = r3.startsWith(r6)     // Catch:{ Exception -> 0x0382 }
            if (r6 != 0) goto L_0x02d9
            java.lang.String r6 = "fortuna"
            boolean r6 = r3.startsWith(r6)     // Catch:{ Exception -> 0x0382 }
            if (r6 != 0) goto L_0x02d9
            java.lang.String r6 = "gprimelte"
            boolean r6 = r3.startsWith(r6)     // Catch:{ Exception -> 0x0382 }
            if (r6 != 0) goto L_0x02d9
            java.lang.String r6 = "j2y18lte"
            boolean r6 = r3.startsWith(r6)     // Catch:{ Exception -> 0x0382 }
            if (r6 != 0) goto L_0x02d9
            java.lang.String r6 = "ms01"
            boolean r3 = r3.startsWith(r6)     // Catch:{ Exception -> 0x0382 }
            if (r3 == 0) goto L_0x02db
        L_0x02d9:
            r3 = r8
            goto L_0x02dc
        L_0x02db:
            r3 = 0
        L_0x02dc:
            r7.f4720Y = r3     // Catch:{ Exception -> 0x0382 }
            com.google.android.gms.internal.ads.c0 r3 = r7.f4707L     // Catch:{ Exception -> 0x0382 }
            if (r0 > r9) goto L_0x02f0
            int r3 = r3.f5247y     // Catch:{ Exception -> 0x0382 }
            if (r3 != r8) goto L_0x02f0
            java.lang.String r3 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r3 = r3.equals(r2)     // Catch:{ Exception -> 0x0382 }
            if (r3 == 0) goto L_0x02f0
            r3 = r8
            goto L_0x02f1
        L_0x02f0:
            r3 = 0
        L_0x02f1:
            r7.f4721Z = r3     // Catch:{ Exception -> 0x0382 }
            java.lang.String r3 = r11.f18012a     // Catch:{ Exception -> 0x0382 }
            r6 = 25
            if (r0 > r6) goto L_0x0304
            java.lang.String r6 = "OMX.rk.video_decoder.avc"
            boolean r6 = r6.equals(r3)     // Catch:{ Exception -> 0x0382 }
            if (r6 != 0) goto L_0x0302
            goto L_0x0304
        L_0x0302:
            r0 = r8
            goto L_0x033c
        L_0x0304:
            r6 = 17
            if (r0 > r6) goto L_0x0310
            java.lang.String r6 = "OMX.allwinner.video.decoder.avc"
            boolean r6 = r6.equals(r3)     // Catch:{ Exception -> 0x0382 }
            if (r6 != 0) goto L_0x0302
        L_0x0310:
            if (r0 > r1) goto L_0x0322
            java.lang.String r0 = "OMX.broadcom.video_decoder.tunnel"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0382 }
            if (r0 != 0) goto L_0x0302
            java.lang.String r0 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0382 }
            if (r0 != 0) goto L_0x0302
        L_0x0322:
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = com.google.android.gms.internal.ads.n13.f11238c     // Catch:{ Exception -> 0x0382 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0382 }
            if (r0 == 0) goto L_0x033b
            java.lang.String r0 = "AFTS"
            java.lang.String r1 = com.google.android.gms.internal.ads.n13.f11239d     // Catch:{ Exception -> 0x0382 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0382 }
            if (r0 == 0) goto L_0x033b
            boolean r0 = r11.f18017f     // Catch:{ Exception -> 0x0382 }
            if (r0 == 0) goto L_0x033b
            goto L_0x0302
        L_0x033b:
            r0 = 0
        L_0x033c:
            r7.f4724c0 = r0     // Catch:{ Exception -> 0x0382 }
            com.google.android.gms.internal.ads.x34 r0 = r7.f4706K     // Catch:{ Exception -> 0x0382 }
            r0.mo8608t()     // Catch:{ Exception -> 0x0382 }
            java.lang.String r0 = "c2.android.mp3.decoder"
            java.lang.String r1 = r11.f18012a     // Catch:{ Exception -> 0x0382 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0382 }
            if (r0 == 0) goto L_0x0354
            com.google.android.gms.internal.ads.s34 r0 = new com.google.android.gms.internal.ads.s34     // Catch:{ Exception -> 0x0382 }
            r0.<init>()     // Catch:{ Exception -> 0x0382 }
            r7.f4725d0 = r0     // Catch:{ Exception -> 0x0382 }
        L_0x0354:
            int r0 = r17.mo5798q()     // Catch:{ Exception -> 0x0382 }
            r1 = 2
            if (r0 != r1) goto L_0x0364
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0382 }
            r9 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r9
            r7.f4726e0 = r0     // Catch:{ Exception -> 0x0382 }
        L_0x0364:
            com.google.android.gms.internal.ads.cd3 r0 = r7.f4757z0     // Catch:{ Exception -> 0x0382 }
            int r1 = r0.f5382a     // Catch:{ Exception -> 0x0382 }
            int r1 = r1 + r8
            r0.f5382a = r1     // Catch:{ Exception -> 0x0382 }
            long r5 = r12 - r4
            r1 = r17
            r3 = r12
            r1.mo5684W(r2, r3, r5)     // Catch:{ Exception -> 0x0382 }
            goto L_0x03b7
        L_0x0374:
            r0 = move-exception
            goto L_0x037c
        L_0x0376:
            r0 = move-exception
            goto L_0x037c
        L_0x0378:
            r0 = move-exception
            goto L_0x037b
        L_0x037a:
            r0 = move-exception
        L_0x037b:
            r12 = 0
        L_0x037c:
            if (r12 == 0) goto L_0x0381
            r12.release()     // Catch:{ Exception -> 0x0382 }
        L_0x0381:
            throw r0     // Catch:{ Exception -> 0x0382 }
        L_0x0382:
            r0 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r11)     // Catch:{ a44 -> 0x03cf }
            java.lang.String r2 = "MediaCodecRenderer"
            java.lang.String r3 = "Failed to initialize decoder: "
            java.lang.String r1 = r3.concat(r1)     // Catch:{ a44 -> 0x03cf }
            com.google.android.gms.internal.ads.oc2.m14400b(r2, r1, r0)     // Catch:{ a44 -> 0x03cf }
            java.util.ArrayDeque<com.google.android.gms.internal.ads.z34> r1 = r7.f4711P     // Catch:{ a44 -> 0x03cf }
            r1.removeFirst()     // Catch:{ a44 -> 0x03cf }
            com.google.android.gms.internal.ads.a44 r1 = new com.google.android.gms.internal.ads.a44     // Catch:{ a44 -> 0x03cf }
            com.google.android.gms.internal.ads.c0 r2 = r7.f4697D     // Catch:{ a44 -> 0x03cf }
            r3 = 0
            r1.<init>((com.google.android.gms.internal.ads.C1574c0) r2, (java.lang.Throwable) r0, (boolean) r3, (com.google.android.gms.internal.ads.z34) r11)     // Catch:{ a44 -> 0x03cf }
            r7.mo5683V(r1)     // Catch:{ a44 -> 0x03cf }
            com.google.android.gms.internal.ads.a44 r0 = r7.f4712Q     // Catch:{ a44 -> 0x03cf }
            if (r0 != 0) goto L_0x03a9
            r7.f4712Q = r1     // Catch:{ a44 -> 0x03cf }
            goto L_0x03af
        L_0x03a9:
            com.google.android.gms.internal.ads.a44 r0 = com.google.android.gms.internal.ads.a44.m5824a(r0, r1)     // Catch:{ a44 -> 0x03cf }
            r7.f4712Q = r0     // Catch:{ a44 -> 0x03cf }
        L_0x03af:
            java.util.ArrayDeque<com.google.android.gms.internal.ads.z34> r0 = r7.f4711P     // Catch:{ a44 -> 0x03cf }
            boolean r0 = r0.isEmpty()     // Catch:{ a44 -> 0x03cf }
            if (r0 != 0) goto L_0x03bb
        L_0x03b7:
            r9 = 0
            r10 = 0
            goto L_0x00a4
        L_0x03bb:
            com.google.android.gms.internal.ads.a44 r0 = r7.f4712Q     // Catch:{ a44 -> 0x03cf }
            throw r0     // Catch:{ a44 -> 0x03cf }
        L_0x03be:
            r1 = r10
            r7.f4711P = r1     // Catch:{ a44 -> 0x03cf }
            return
        L_0x03c2:
            com.google.android.gms.internal.ads.a44 r0 = new com.google.android.gms.internal.ads.a44     // Catch:{ a44 -> 0x03cf }
            com.google.android.gms.internal.ads.c0 r1 = r7.f4697D     // Catch:{ a44 -> 0x03cf }
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r3 = 0
            r4 = 0
            r0.<init>((com.google.android.gms.internal.ads.C1574c0) r1, (java.lang.Throwable) r3, (boolean) r4, (int) r2)     // Catch:{ a44 -> 0x03cf }
            throw r0     // Catch:{ a44 -> 0x03cf }
        L_0x03cf:
            r0 = move-exception
            com.google.android.gms.internal.ads.c0 r1 = r7.f4697D
            r2 = 4001(0xfa1, float:5.607E-42)
            r3 = 0
            com.google.android.gms.internal.ads.ll3 r0 = r7.mo5803w(r0, r1, r3, r2)
            throw r0
        L_0x03da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b44.mo5703t0():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo5704u0(long j) {
        while (true) {
            int i = this.f4696C0;
            if (i != 0 && j >= this.f4695C[0]) {
                long[] jArr = this.f4691A;
                this.f4692A0 = jArr[0];
                this.f4694B0 = this.f4693B[0];
                int i2 = i - 1;
                this.f4696C0 = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.f4693B;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f4696C0);
                long[] jArr3 = this.f4695C;
                System.arraycopy(jArr3, 1, jArr3, 0, this.f4696C0);
                mo5690i0();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public final void mo5705v0() {
        try {
            x34 x34 = this.f4706K;
            if (x34 != null) {
                x34.mo8607k();
                this.f4757z0.f5383b++;
                mo5685X(this.f4713R.f18012a);
            }
        } finally {
            this.f4706K = null;
            this.f4701F = null;
            this.f4698D0 = null;
            mo5707x0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w0 */
    public void mo5706w0() {
        m6611D0();
        m6612E0();
        this.f4726e0 = -9223372036854775807L;
        this.f4743s0 = false;
        this.f4741r0 = false;
        this.f4722a0 = false;
        this.f4723b0 = false;
        this.f4730i0 = false;
        this.f4731j0 = false;
        this.f4754y.clear();
        this.f4747u0 = -9223372036854775807L;
        this.f4749v0 = -9223372036854775807L;
        s34 s34 = this.f4725d0;
        if (s34 != null) {
            s34.mo10720c();
        }
        this.f4737p0 = 0;
        this.f4739q0 = 0;
        this.f4736o0 = this.f4735n0 ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public final void mo5707x0() {
        mo5706w0();
        this.f4725d0 = null;
        this.f4711P = null;
        this.f4713R = null;
        this.f4707L = null;
        this.f4708M = null;
        this.f4709N = false;
        this.f4745t0 = false;
        this.f4710O = -1.0f;
        this.f4714S = 0;
        this.f4715T = false;
        this.f4716U = false;
        this.f4717V = false;
        this.f4718W = false;
        this.f4719X = false;
        this.f4720Y = false;
        this.f4721Z = false;
        this.f4724c0 = false;
        this.f4735n0 = false;
        this.f4736o0 = 0;
        this.f4702G = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public final boolean mo5708y0() {
        boolean z0 = mo5709z0();
        if (z0) {
            mo5703t0();
        }
        return z0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z0 */
    public final boolean mo5709z0() {
        if (this.f4706K == null) {
            return false;
        }
        if (this.f4739q0 == 3 || this.f4716U || ((this.f4717V && !this.f4745t0) || (this.f4718W && this.f4743s0))) {
            mo5705v0();
            return true;
        }
        mo8856h0();
        return false;
    }
}
