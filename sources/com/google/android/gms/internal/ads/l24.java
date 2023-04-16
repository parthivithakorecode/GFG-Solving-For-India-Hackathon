package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class l24 extends b44 implements ex3 {

    /* renamed from: G0 */
    private final Context f9853G0;
    /* access modifiers changed from: private */

    /* renamed from: H0 */
    public final h14 f9854H0;

    /* renamed from: I0 */
    private final o14 f9855I0;

    /* renamed from: J0 */
    private int f9856J0;

    /* renamed from: K0 */
    private boolean f9857K0;

    /* renamed from: L0 */
    private C1574c0 f9858L0;

    /* renamed from: M0 */
    private long f9859M0;

    /* renamed from: N0 */
    private boolean f9860N0;

    /* renamed from: O0 */
    private boolean f9861O0;

    /* renamed from: P0 */
    private boolean f9862P0;
    /* access modifiers changed from: private */

    /* renamed from: Q0 */
    public wx3 f9863Q0;

    public l24(Context context, w34 w34, d44 d44, boolean z, Handler handler, i14 i14, o14 o14) {
        super(1, w34, d44, false, 44100.0f);
        this.f9853G0 = context.getApplicationContext();
        this.f9855I0 = o14;
        this.f9854H0 = new h14(handler, i14);
        o14.mo7826m(new k24(this, (j24) null));
    }

    /* renamed from: D0 */
    private final void m12518D0() {
        long X = this.f9855I0.mo7813X(mo5675J());
        if (X != Long.MIN_VALUE) {
            if (!this.f9861O0) {
                X = Math.max(this.f9859M0, X);
            }
            this.f9859M0 = X;
            this.f9861O0 = false;
        }
    }

    /* renamed from: J0 */
    private final int m12521J0(z34 z34, C1574c0 c0Var) {
        int i;
        if (!"OMX.google.raw.decoder".equals(z34.f18012a) || (i = n13.f11236a) >= 24 || (i == 23 && n13.m13647t(this.f9853G0))) {
            return c0Var.f5235m;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo5671C() {
        this.f9862P0 = true;
        try {
            this.f9855I0.mo7815b();
            try {
                super.mo5671C();
            } finally {
                this.f9854H0.mo7786e(this.f4757z0);
            }
        } catch (Throwable th) {
            super.mo5671C();
            throw th;
        } finally {
            this.f9854H0.mo7786e(this.f4757z0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo5672D(boolean z, boolean z2) {
        super.mo5672D(z, z2);
        this.f9854H0.mo7787f(this.f4757z0);
        mo5806z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final void mo5673E(long j, boolean z) {
        super.mo5673E(j, z);
        this.f9855I0.mo7815b();
        this.f9859M0 = j;
        this.f9860N0 = true;
        this.f9861O0 = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo5674G() {
        try {
            super.mo5674G();
            if (this.f9862P0) {
                this.f9862P0 = false;
                this.f9855I0.mo7822i();
            }
        } catch (Throwable th) {
            if (this.f9862P0) {
                this.f9862P0 = false;
                this.f9855I0.mo7822i();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final void mo5782H() {
        this.f9855I0.mo7819f();
    }

    /* renamed from: J */
    public final boolean mo5675J() {
        return super.mo5675J() && this.f9855I0.mo7830q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final void mo5784K() {
        m12518D0();
        this.f9855I0.mo7818e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final float mo5677N(float f, C1574c0 c0Var, C1574c0[] c0VarArr) {
        int i = -1;
        for (C1574c0 c0Var2 : c0VarArr) {
            int i2 = c0Var2.f5248z;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return ((float) i) * f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final int mo5678O(d44 d44, C1574c0 c0Var) {
        if (!C1645dy.m8170g(c0Var.f5234l)) {
            return 0;
        }
        int i = n13.f11236a >= 21 ? 32 : 0;
        int i2 = c0Var.f5221E;
        boolean B0 = b44.m6609B0(c0Var);
        if (B0 && this.f9855I0.mo7833t(c0Var) && (i2 == 0 || q44.m15469d() != null)) {
            return i | 12;
        }
        if (("audio/raw".equals(c0Var.f5234l) && !this.f9855I0.mo7833t(c0Var)) || !this.f9855I0.mo7833t(n13.m13624b(2, c0Var.f5247y, c0Var.f5248z))) {
            return 1;
        }
        List<z34> U = mo5682U(d44, c0Var, false);
        if (U.isEmpty()) {
            return 1;
        }
        if (!B0) {
            return 2;
        }
        z34 z34 = U.get(0);
        boolean d = z34.mo12139d(c0Var);
        int i3 = 8;
        if (d && z34.mo12140e(c0Var)) {
            i3 = 16;
        }
        return (true != d ? 3 : 4) | i3 | i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final de3 mo5679P(z34 z34, C1574c0 c0Var, C1574c0 c0Var2) {
        int i;
        int i2;
        de3 b = z34.mo12138b(c0Var, c0Var2);
        int i3 = b.f5781e;
        if (m12521J0(z34, c0Var2) > this.f9856J0) {
            i3 |= 64;
        }
        String str = z34.f18012a;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = b.f5780d;
        }
        return new de3(str, c0Var, c0Var2, i2, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public final de3 mo5680Q(cx3 cx3) {
        de3 Q = super.mo5680Q(cx3);
        this.f9854H0.mo7788g(cx3.f5555a, Q);
        return Q;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        if ("AXON 7 mini".equals(r10) == false) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f0  */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.v34 mo5681T(com.google.android.gms.internal.ads.z34 r8, com.google.android.gms.internal.ads.C1574c0 r9, android.media.MediaCrypto r10, float r11) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.c0[] r10 = r7.mo5801t()
            int r0 = r7.m12521J0(r8, r9)
            int r1 = r10.length
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x000e
            goto L_0x0026
        L_0x000e:
            r4 = r2
        L_0x000f:
            if (r4 >= r1) goto L_0x0026
            r5 = r10[r4]
            com.google.android.gms.internal.ads.de3 r6 = r8.mo12138b(r9, r5)
            int r6 = r6.f5780d
            if (r6 == 0) goto L_0x0023
            int r5 = r7.m12521J0(r8, r5)
            int r0 = java.lang.Math.max(r0, r5)
        L_0x0023:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x0026:
            r7.f9856J0 = r0
            java.lang.String r10 = r8.f18012a
            int r0 = com.google.android.gms.internal.ads.n13.f11236a
            r1 = 24
            if (r0 >= r1) goto L_0x005e
            java.lang.String r4 = "OMX.SEC.aac.dec"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x005e
            java.lang.String r10 = com.google.android.gms.internal.ads.n13.f11238c
            java.lang.String r4 = "samsung"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x005e
            java.lang.String r10 = com.google.android.gms.internal.ads.n13.f11237b
            java.lang.String r4 = "zeroflte"
            boolean r4 = r10.startsWith(r4)
            if (r4 != 0) goto L_0x005c
            java.lang.String r4 = "herolte"
            boolean r4 = r10.startsWith(r4)
            if (r4 != 0) goto L_0x005c
            java.lang.String r4 = "heroqlte"
            boolean r10 = r10.startsWith(r4)
            if (r10 == 0) goto L_0x005e
        L_0x005c:
            r10 = r3
            goto L_0x005f
        L_0x005e:
            r10 = r2
        L_0x005f:
            r7.f9857K0 = r10
            java.lang.String r10 = r8.f18014c
            int r4 = r7.f9856J0
            android.media.MediaFormat r5 = new android.media.MediaFormat
            r5.<init>()
            java.lang.String r6 = "mime"
            r5.setString(r6, r10)
            int r10 = r9.f5247y
            java.lang.String r6 = "channel-count"
            r5.setInteger(r6, r10)
            int r10 = r9.f5248z
            java.lang.String r6 = "sample-rate"
            r5.setInteger(r6, r10)
            java.util.List<byte[]> r10 = r9.f5236n
            com.google.android.gms.internal.ads.qe2.m15607b(r5, r10)
            java.lang.String r10 = "max-input-size"
            com.google.android.gms.internal.ads.qe2.m15606a(r5, r10, r4)
            r10 = 23
            if (r0 < r10) goto L_0x00af
            java.lang.String r4 = "priority"
            r5.setInteger(r4, r2)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00af
            if (r0 != r10) goto L_0x00aa
            java.lang.String r10 = com.google.android.gms.internal.ads.n13.f11239d
            java.lang.String r2 = "ZTE B2017G"
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto L_0x00af
            java.lang.String r2 = "AXON 7 mini"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L_0x00af
        L_0x00aa:
            java.lang.String r10 = "operating-rate"
            r5.setFloat(r10, r11)
        L_0x00af:
            r10 = 28
            if (r0 > r10) goto L_0x00c2
            java.lang.String r10 = r9.f5234l
            java.lang.String r11 = "audio/ac4"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x00c2
            java.lang.String r10 = "ac4-is-sync"
            r5.setInteger(r10, r3)
        L_0x00c2:
            if (r0 < r1) goto L_0x00db
            com.google.android.gms.internal.ads.o14 r10 = r7.f9855I0
            int r11 = r9.f5247y
            int r0 = r9.f5248z
            r1 = 4
            com.google.android.gms.internal.ads.c0 r11 = com.google.android.gms.internal.ads.n13.m13624b(r1, r11, r0)
            int r10 = r10.mo7814a(r11)
            r11 = 2
            if (r10 != r11) goto L_0x00db
            java.lang.String r10 = "pcm-encoding"
            r5.setInteger(r10, r1)
        L_0x00db:
            java.lang.String r10 = r8.f18013b
            java.lang.String r11 = "audio/raw"
            boolean r10 = r11.equals(r10)
            r0 = 0
            if (r10 == 0) goto L_0x00f0
            java.lang.String r10 = r9.f5234l
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00f0
            r10 = r9
            goto L_0x00f1
        L_0x00f0:
            r10 = r0
        L_0x00f1:
            r7.f9858L0 = r10
            com.google.android.gms.internal.ads.v34 r8 = com.google.android.gms.internal.ads.v34.m18327a(r8, r5, r9, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l24.mo5681T(com.google.android.gms.internal.ads.z34, com.google.android.gms.internal.ads.c0, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.v34");
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final List<z34> mo5682U(d44 d44, C1574c0 c0Var, boolean z) {
        z34 d;
        String str = c0Var.f5234l;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f9855I0.mo7833t(c0Var) && (d = q44.m15469d()) != null) {
            return Collections.singletonList(d);
        }
        List<z34> f = q44.m15471f(q44.m15470e(str, false, false), c0Var);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(f);
            arrayList.addAll(q44.m15470e("audio/eac3", false, false));
            f = arrayList;
        }
        return Collections.unmodifiableList(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo5683V(Exception exc) {
        oc2.m14399a("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f9854H0.mo7782a(exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final void mo5684W(String str, long j, long j2) {
        this.f9854H0.mo7784c(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public final void mo5685X(String str) {
        this.f9854H0.mo7785d(str);
    }

    /* renamed from: Y */
    public final void mo7179Y(e30 e30) {
        this.f9855I0.mo7820g(e30);
    }

    /* renamed from: a0 */
    public final boolean mo5686a0() {
        return this.f9855I0.mo7829p() || super.mo5686a0();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008b A[LOOP:0: B:26:0x0087->B:28:0x008b, LOOP_END] */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5688b0(com.google.android.gms.internal.ads.C1574c0 r6, android.media.MediaFormat r7) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.c0 r0 = r5.f9858L0
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0009
            r6 = r0
            goto L_0x0091
        L_0x0009:
            com.google.android.gms.internal.ads.x34 r0 = r5.mo5699p0()
            if (r0 != 0) goto L_0x0011
            goto L_0x0091
        L_0x0011:
            java.lang.String r0 = r6.f5234l
            java.lang.String r3 = "audio/raw"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
        L_0x001b:
            int r0 = r6.f5217A
            goto L_0x004c
        L_0x001e:
            int r0 = com.google.android.gms.internal.ads.n13.f11236a
            r4 = 24
            if (r0 < r4) goto L_0x0031
            java.lang.String r0 = "pcm-encoding"
            boolean r4 = r7.containsKey(r0)
            if (r4 == 0) goto L_0x0031
            int r0 = r7.getInteger(r0)
            goto L_0x004c
        L_0x0031:
            java.lang.String r0 = "v-bits-per-sample"
            boolean r4 = r7.containsKey(r0)
            if (r4 == 0) goto L_0x0042
            int r0 = r7.getInteger(r0)
            int r0 = com.google.android.gms.internal.ads.n13.m13613R(r0)
            goto L_0x004c
        L_0x0042:
            java.lang.String r0 = r6.f5234l
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x004b
            goto L_0x001b
        L_0x004b:
            r0 = 2
        L_0x004c:
            com.google.android.gms.internal.ads.bf4 r4 = new com.google.android.gms.internal.ads.bf4
            r4.<init>()
            r4.mo5842s(r3)
            r4.mo5837n(r0)
            int r0 = r6.f5218B
            r4.mo5820c(r0)
            int r0 = r6.f5219C
            r4.mo5822d(r0)
            java.lang.String r0 = "channel-count"
            int r0 = r7.getInteger(r0)
            r4.mo5825e0(r0)
            java.lang.String r0 = "sample-rate"
            int r7 = r7.getInteger(r0)
            r4.mo5843t(r7)
            com.google.android.gms.internal.ads.c0 r7 = r4.mo5848y()
            boolean r0 = r5.f9857K0
            if (r0 == 0) goto L_0x0090
            int r0 = r7.f5247y
            r3 = 6
            if (r0 != r3) goto L_0x0090
            int r0 = r6.f5247y
            if (r0 >= r3) goto L_0x0090
            int[] r2 = new int[r0]
            r0 = r1
        L_0x0087:
            int r3 = r6.f5247y
            if (r0 >= r3) goto L_0x0090
            r2[r0] = r0
            int r0 = r0 + 1
            goto L_0x0087
        L_0x0090:
            r6 = r7
        L_0x0091:
            com.google.android.gms.internal.ads.o14 r7 = r5.f9855I0     // Catch:{ j14 -> 0x0097 }
            r7.mo7827n(r6, r1, r2)     // Catch:{ j14 -> 0x0097 }
            return
        L_0x0097:
            r6 = move-exception
            com.google.android.gms.internal.ads.c0 r7 = r6.f8945f
            r0 = 5001(0x1389, float:7.008E-42)
            com.google.android.gms.internal.ads.ll3 r6 = r5.mo5803w(r6, r7, r1, r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l24.mo5688b0(com.google.android.gms.internal.ads.c0, android.media.MediaFormat):void");
    }

    /* renamed from: c */
    public final e30 mo7180c() {
        return this.f9855I0.mo7816c();
    }

    /* renamed from: h */
    public final ex3 mo5791h() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public final void mo8856h0() {
        this.f9861O0 = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public final void mo5690i0() {
        this.f9855I0.mo7817d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public final void mo5692j0(z51 z51) {
        if (this.f9860N0 && !z51.mo10914f()) {
            if (Math.abs(z51.f18035e - this.f9859M0) > 500000) {
                this.f9859M0 = z51.f18035e;
            }
            this.f9860N0 = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public final void mo5693k0() {
        try {
            this.f9855I0.mo7821h();
        } catch (n14 e) {
            throw mo5803w(e, e.f11252g, e.f11251f, 5002);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public final boolean mo5694l0(long j, long j2, x34 x34, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C1574c0 c0Var) {
        Objects.requireNonNull(byteBuffer);
        if (this.f9858L0 != null && (i2 & 2) != 0) {
            Objects.requireNonNull(x34);
            x34.mo8601d(i, false);
            return true;
        } else if (z) {
            if (x34 != null) {
                x34.mo8601d(i, false);
            }
            this.f4757z0.f5387f += i3;
            this.f9855I0.mo7817d();
            return true;
        } else {
            try {
                if (!this.f9855I0.mo7824k(byteBuffer, j3, i3)) {
                    return false;
                }
                if (x34 != null) {
                    x34.mo8601d(i, false);
                }
                this.f4757z0.f5386e += i3;
                return true;
            } catch (k14 e) {
                throw mo5803w(e, e.f9346g, false, 5001);
            } catch (n14 e2) {
                throw mo5803w(e2, c0Var, e2.f11251f, 5002);
            }
        }
    }

    /* renamed from: m */
    public final void mo5795m(int i, Object obj) {
        if (i == 2) {
            this.f9855I0.mo7823j(((Float) obj).floatValue());
        } else if (i == 3) {
            this.f9855I0.mo7828o((ef3) obj);
        } else if (i != 6) {
            switch (i) {
                case 9:
                    this.f9855I0.mo7832s(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.f9855I0.mo7831r(((Integer) obj).intValue());
                    return;
                case 11:
                    this.f9863Q0 = (wx3) obj;
                    return;
                default:
                    return;
            }
        } else {
            this.f9855I0.mo7825l((kw3) obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public final boolean mo5695m0(C1574c0 c0Var) {
        return this.f9855I0.mo7833t(c0Var);
    }

    /* renamed from: v */
    public final String mo8857v() {
        return "MediaCodecAudioRenderer";
    }

    public final long zza() {
        if (mo5798q() == 2) {
            m12518D0();
        }
        return this.f9859M0;
    }
}
