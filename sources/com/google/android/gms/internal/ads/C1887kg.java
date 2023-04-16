package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;

@TargetApi(16)
/* renamed from: com.google.android.gms.internal.ads.kg */
public final class C1887kg extends C2445zi implements C2004nm {
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final C2256uf f9523Q;

    /* renamed from: R */
    private final C1739gg f9524R = new C1739gg((C1886kf) null, new C1960mf[0], new C1850jg(this, (C1813ig) null));

    /* renamed from: S */
    private boolean f9525S;

    /* renamed from: T */
    private int f9526T;

    /* renamed from: U */
    private int f9527U;

    /* renamed from: V */
    private long f9528V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f9529W;

    public C1887kg(C1556bj bjVar, C2443zg zgVar, boolean z, Handler handler, C2293vf vfVar) {
        super(1, bjVar, (C2443zg) null, true);
        this.f9523Q = new C2256uf(handler, vfVar);
    }

    /* renamed from: A */
    public final boolean mo6169A() {
        return this.f9524R.mo7631n() || super.mo6169A();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final C2371xi mo8662E(C1556bj bjVar, C2367xe xeVar, boolean z) {
        return super.mo8662E(bjVar, xeVar, false);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r4.startsWith("heroqlte") == false) goto L_0x0037;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8160H(com.google.android.gms.internal.ads.C2371xi r4, android.media.MediaCodec r5, com.google.android.gms.internal.ads.C2367xe r6, android.media.MediaCrypto r7) {
        /*
            r3 = this;
            java.lang.String r4 = r4.f17214a
            int r7 = com.google.android.gms.internal.ads.C2449zm.f18287a
            r0 = 1
            r1 = 0
            r2 = 24
            if (r7 >= r2) goto L_0x0037
            java.lang.String r7 = "OMX.SEC.aac.dec"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0037
            java.lang.String r4 = com.google.android.gms.internal.ads.C2449zm.f18289c
            java.lang.String r7 = "samsung"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0037
            java.lang.String r4 = com.google.android.gms.internal.ads.C2449zm.f18288b
            java.lang.String r7 = "zeroflte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L_0x0038
            java.lang.String r7 = "herolte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L_0x0038
            java.lang.String r7 = "heroqlte"
            boolean r4 = r4.startsWith(r7)
            if (r4 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r0 = r1
        L_0x0038:
            r3.f9525S = r0
            android.media.MediaFormat r4 = r6.mo11807c()
            r6 = 0
            r5.configure(r4, r6, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1887kg.mo8160H(com.google.android.gms.internal.ads.xi, android.media.MediaCodec, com.google.android.gms.internal.ads.xe, android.media.MediaCrypto):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final void mo8161I(String str, long j, long j2) {
        this.f9523Q.mo11214d(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo8162J(C2367xe xeVar) {
        super.mo8162J(xeVar);
        this.f9523Q.mo11217g(xeVar);
        this.f9526T = "audio/raw".equals(xeVar.f17163k) ? xeVar.f17177y : 2;
        this.f9527U = xeVar.f17175w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final void mo8163K(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int[] iArr;
        int i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.f9525S || integer != 6) {
            i = integer;
            iArr = null;
        } else {
            int i2 = this.f9527U;
            if (i2 < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < this.f9527U; i3++) {
                    iArr2[i3] = i3;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i = 6;
        }
        try {
            this.f9524R.mo7622e("audio/raw", i, integer2, this.f9526T, 0, iArr);
        } catch (C1516ag e) {
            throw C1811ie.m11004a(e, mo7594k());
        }
    }

    /* renamed from: L */
    public final boolean mo6173L() {
        return super.mo6173L() && this.f9524R.mo7632o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final void mo8663M() {
        try {
            this.f9524R.mo7626i();
        } catch (C1702fg e) {
            throw C1811ie.m11004a(e, mo7594k());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final boolean mo8164N(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f18209O.f14844e++;
            this.f9524R.mo7623f();
            return true;
        }
        try {
            if (!this.f9524R.mo7630m(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.f18209O.f14843d++;
            return true;
        } catch (C1553bg | C1702fg e) {
            throw C1811ie.m11004a(e, mo7594k());
        }
    }

    /* renamed from: g */
    public final void mo8172g(int i, Object obj) {
        if (i == 2) {
            this.f9524R.mo7629l(((Float) obj).floatValue());
        }
    }

    /* renamed from: h */
    public final C2004nm mo6184h() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo7597n() {
        try {
            this.f9524R.mo7627j();
            try {
                super.mo7597n();
            } finally {
                this.f18209O.mo10977a();
                this.f9523Q.mo11215e(this.f18209O);
            }
        } catch (Throwable th) {
            super.mo7597n();
            throw th;
        } finally {
            this.f18209O.mo10977a();
            this.f9523Q.mo11215e(this.f18209O);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo7598p(boolean z) {
        super.mo7598p(z);
        this.f9523Q.mo11216f(this.f18209O);
        int i = mo7596m().f6195a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo7599q(long j, boolean z) {
        super.mo7599q(j, z);
        this.f9524R.mo7628k();
        this.f9528V = j;
        this.f9529W = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo7600r() {
        this.f9524R.mo7625h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo7601s() {
        this.f9524R.mo7624g();
    }

    /* renamed from: v */
    public final C1552bf mo8664v() {
        return this.f9524R.mo7620c();
    }

    /* renamed from: w */
    public final long mo8665w() {
        long a = this.f9524R.mo7619a(mo6173L());
        if (a != Long.MIN_VALUE) {
            if (!this.f9529W) {
                a = Math.max(this.f9528V, a);
            }
            this.f9528V = a;
            this.f9529W = false;
        }
        return this.f9528V;
    }

    /* renamed from: y */
    public final C1552bf mo8666y(C1552bf bfVar) {
        return this.f9524R.mo7621d(bfVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final int mo8173z(C1556bj bjVar, C2367xe xeVar) {
        int i;
        int i2;
        String str = xeVar.f17163k;
        if (!C2041om.m14519a(str)) {
            return 0;
        }
        int i3 = C2449zm.f18287a;
        int i4 = i3 >= 21 ? 16 : 0;
        C2371xi c = C1853jj.m11671c(str, false);
        if (c == null) {
            return 1;
        }
        int i5 = 2;
        if (i3 < 21 || (((i = xeVar.f17176x) == -1 || c.mo11850d(i)) && ((i2 = xeVar.f17175w) == -1 || c.mo11849c(i2)))) {
            i5 = 3;
        }
        return i4 | 4 | i5;
    }
}
