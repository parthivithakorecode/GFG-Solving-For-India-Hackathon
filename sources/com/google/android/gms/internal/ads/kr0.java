package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p054h1.C2694t;
import p069j1.C3163g2;
import p069j1.C3202r1;

@TargetApi(16)
public final class kr0 extends zp0 implements TextureView.SurfaceTextureListener, iq0 {

    /* renamed from: A */
    private float f9611A;

    /* renamed from: h */
    private final tq0 f9612h;

    /* renamed from: i */
    private final uq0 f9613i;

    /* renamed from: j */
    private final boolean f9614j;

    /* renamed from: k */
    private final sq0 f9615k;

    /* renamed from: l */
    private yp0 f9616l;

    /* renamed from: m */
    private Surface f9617m;

    /* renamed from: n */
    private jq0 f9618n;

    /* renamed from: o */
    private String f9619o;

    /* renamed from: p */
    private String[] f9620p;

    /* renamed from: q */
    private boolean f9621q;

    /* renamed from: r */
    private int f9622r = 1;

    /* renamed from: s */
    private rq0 f9623s;

    /* renamed from: t */
    private final boolean f9624t;

    /* renamed from: u */
    private boolean f9625u;

    /* renamed from: v */
    private boolean f9626v;

    /* renamed from: w */
    private int f9627w;

    /* renamed from: x */
    private int f9628x;

    /* renamed from: y */
    private int f9629y;

    /* renamed from: z */
    private int f9630z;

    public kr0(Context context, uq0 uq0, tq0 tq0, boolean z, boolean z2, sq0 sq0) {
        super(context);
        this.f9614j = z2;
        this.f9612h = tq0;
        this.f9613i = uq0;
        this.f9624t = z;
        this.f9615k = sq0;
        setSurfaceTextureListener(this);
        uq0.mo11284a(this);
    }

    /* renamed from: R */
    private static String m12311R(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 2 + length + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    /* renamed from: S */
    private final void m12312S() {
        jq0 jq0 = this.f9618n;
        if (jq0 != null) {
            jq0.mo5450L(true);
        }
    }

    /* renamed from: T */
    private final void m12313T() {
        if (!this.f9625u) {
            this.f9625u = true;
            C3163g2.f20465i.post(new br0(this));
            mo8759m();
            this.f9613i.mo11285b();
            if (this.f9626v) {
                mo8770r();
            }
        }
    }

    /* renamed from: U */
    private final void m12314U(boolean z) {
        String str;
        if ((this.f9618n == null || z) && this.f9619o != null && this.f9617m != null) {
            if (z) {
                if (m12322c0()) {
                    this.f9618n.mo5454P();
                    m12316W();
                } else {
                    str = "No valid ExoPlayerAdapter exists when switch source.";
                    io0.m11131g(str);
                    return;
                }
            }
            if (this.f9619o.startsWith("cache:")) {
                ts0 B0 = this.f9612h.mo11058B0(this.f9619o);
                if (B0 instanceof ct0) {
                    jq0 w = ((ct0) B0).mo6297w();
                    this.f9618n = w;
                    if (!w.mo5455Q()) {
                        str = "Precached video player has been released.";
                        io0.m11131g(str);
                        return;
                    }
                } else if (B0 instanceof zs0) {
                    zs0 zs0 = (zs0) B0;
                    String E = mo8738E();
                    ByteBuffer y = zs0.mo12266y();
                    boolean z2 = zs0.mo12267z();
                    String w2 = zs0.mo12265w();
                    if (w2 == null) {
                        str = "Stream cache URL is null.";
                        io0.m11131g(str);
                        return;
                    }
                    jq0 D = mo8737D();
                    this.f9618n = D;
                    D.mo5441C(new Uri[]{Uri.parse(w2)}, E, y, z2);
                } else {
                    String valueOf = String.valueOf(this.f9619o);
                    io0.m11131g(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                    return;
                }
            } else {
                this.f9618n = mo8737D();
                String E2 = mo8738E();
                Uri[] uriArr = new Uri[this.f9620p.length];
                int i = 0;
                while (true) {
                    String[] strArr = this.f9620p;
                    if (i >= strArr.length) {
                        break;
                    }
                    uriArr[i] = Uri.parse(strArr[i]);
                    i++;
                }
                this.f9618n.mo5440B(uriArr, E2);
            }
            this.f9618n.mo5446H(this);
            m12318Y(this.f9617m, false);
            if (this.f9618n.mo5455Q()) {
                int U = this.f9618n.mo5458U();
                this.f9622r = U;
                if (U == 3) {
                    m12313T();
                }
            }
        }
    }

    /* renamed from: V */
    private final void m12315V() {
        jq0 jq0 = this.f9618n;
        if (jq0 != null) {
            jq0.mo5450L(false);
        }
    }

    /* renamed from: W */
    private final void m12316W() {
        if (this.f9618n != null) {
            m12318Y((Surface) null, true);
            jq0 jq0 = this.f9618n;
            if (jq0 != null) {
                jq0.mo5446H((iq0) null);
                this.f9618n.mo5442D();
                this.f9618n = null;
            }
            this.f9622r = 1;
            this.f9621q = false;
            this.f9625u = false;
            this.f9626v = false;
        }
    }

    /* renamed from: X */
    private final void m12317X(float f, boolean z) {
        jq0 jq0 = this.f9618n;
        if (jq0 != null) {
            try {
                jq0.mo5453O(f, z);
            } catch (IOException e) {
                io0.m11132h("", e);
            }
        } else {
            io0.m11131g("Trying to set volume before player is initialized.");
        }
    }

    /* renamed from: Y */
    private final void m12318Y(Surface surface, boolean z) {
        jq0 jq0 = this.f9618n;
        if (jq0 != null) {
            try {
                jq0.mo5452N(surface, z);
            } catch (IOException e) {
                io0.m11132h("", e);
            }
        } else {
            io0.m11131g("Trying to set surface before player is initialized.");
        }
    }

    /* renamed from: Z */
    private final void m12319Z() {
        m12320a0(this.f9627w, this.f9628x);
    }

    /* renamed from: a0 */
    private final void m12320a0(int i, int i2) {
        float f = i2 > 0 ? ((float) i) / ((float) i2) : 1.0f;
        if (this.f9611A != f) {
            this.f9611A = f;
            requestLayout();
        }
    }

    /* renamed from: b0 */
    private final boolean m12321b0() {
        return m12322c0() && this.f9622r != 1;
    }

    /* renamed from: c0 */
    private final boolean m12322c0() {
        jq0 jq0 = this.f9618n;
        return jq0 != null && jq0.mo5455Q() && !this.f9621q;
    }

    /* renamed from: A */
    public final void mo8734A(int i) {
        jq0 jq0 = this.f9618n;
        if (jq0 != null) {
            jq0.mo5445G(i);
        }
    }

    /* renamed from: B */
    public final void mo8735B(int i) {
        jq0 jq0 = this.f9618n;
        if (jq0 != null) {
            jq0.mo5447I(i);
        }
    }

    /* renamed from: C */
    public final void mo8736C(int i) {
        jq0 jq0 = this.f9618n;
        if (jq0 != null) {
            jq0.mo5448J(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final jq0 mo8737D() {
        return this.f9615k.f14549m ? new ut0(this.f9612h.getContext(), this.f9615k, this.f9612h) : new as0(this.f9612h.getContext(), this.f9615k, this.f9612h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final String mo8738E() {
        return C2694t.m21608q().mo14022L(this.f9612h.getContext(), this.f9612h.mo7129l().f12729f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final /* synthetic */ void mo8739F(String str) {
        yp0 yp0 = this.f9616l;
        if (yp0 != null) {
            yp0.mo7681a("ExoPlayerAdapter error", str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final /* synthetic */ void mo8740G() {
        yp0 yp0 = this.f9616l;
        if (yp0 != null) {
            yp0.zza();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final /* synthetic */ void mo8741H() {
        yp0 yp0 = this.f9616l;
        if (yp0 != null) {
            yp0.mo7684d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final /* synthetic */ void mo8742I(boolean z, long j) {
        this.f9612h.mo11067f0(z, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final /* synthetic */ void mo8743J(String str) {
        yp0 yp0 = this.f9616l;
        if (yp0 != null) {
            yp0.mo7700q0("ExoPlayerAdapter exception", str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final /* synthetic */ void mo8744K() {
        yp0 yp0 = this.f9616l;
        if (yp0 != null) {
            yp0.mo7685e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final /* synthetic */ void mo8745L() {
        yp0 yp0 = this.f9616l;
        if (yp0 != null) {
            yp0.mo7686f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final /* synthetic */ void mo8746M() {
        yp0 yp0 = this.f9616l;
        if (yp0 != null) {
            yp0.mo7689h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final /* synthetic */ void mo8747N(int i, int i2) {
        yp0 yp0 = this.f9616l;
        if (yp0 != null) {
            yp0.mo7683c(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final /* synthetic */ void mo8748O(int i) {
        yp0 yp0 = this.f9616l;
        if (yp0 != null) {
            yp0.onWindowVisibilityChanged(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final /* synthetic */ void mo8749P() {
        yp0 yp0 = this.f9616l;
        if (yp0 != null) {
            yp0.mo7688g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final /* synthetic */ void mo8750Q() {
        yp0 yp0 = this.f9616l;
        if (yp0 != null) {
            yp0.mo7682b();
        }
    }

    /* renamed from: a */
    public final void mo8751a(int i) {
        jq0 jq0 = this.f9618n;
        if (jq0 != null) {
            jq0.mo5451M(i);
        }
    }

    /* renamed from: b */
    public final void mo6284b(String str, Exception exc) {
        String R = m12311R("onLoadException", exc);
        io0.m11131g(R.length() != 0 ? "ExoPlayerAdapter exception: ".concat(R) : new String("ExoPlayerAdapter exception: "));
        C2694t.m21607p().mo11033r(exc, "AdExoPlayerView.onException");
        C3163g2.f20465i.post(new zq0(this, R));
    }

    /* renamed from: c */
    public final void mo6285c(boolean z, long j) {
        if (this.f9612h != null) {
            wo0.f16890e.execute(new ar0(this, z, j));
        }
    }

    /* renamed from: d */
    public final void mo6286d(int i, int i2) {
        this.f9627w = i;
        this.f9628x = i2;
        m12319Z();
    }

    /* renamed from: e */
    public final void mo6287e(String str, Exception exc) {
        String R = m12311R(str, exc);
        io0.m11131g(R.length() != 0 ? "ExoPlayerAdapter error: ".concat(R) : new String("ExoPlayerAdapter error: "));
        this.f9621q = true;
        if (this.f9615k.f14537a) {
            m12315V();
        }
        C3163g2.f20465i.post(new jr0(this, R));
        C2694t.m21607p().mo11033r(exc, "AdExoPlayerView.onError");
    }

    /* renamed from: f */
    public final void mo8752f(String str, String[] strArr) {
        if (str != null) {
            boolean z = true;
            if (strArr == null) {
                this.f9620p = new String[]{str};
            } else {
                this.f9620p = (String[]) Arrays.copyOf(strArr, strArr.length);
            }
            String str2 = this.f9619o;
            if (!this.f9615k.f14550n || str2 == null || str.equals(str2) || this.f9622r != 4) {
                z = false;
            }
            this.f9619o = str;
            m12314U(z);
        }
    }

    /* renamed from: g */
    public final int mo8753g() {
        if (m12321b0()) {
            return (int) this.f9618n.mo5462Z();
        }
        return 0;
    }

    /* renamed from: h */
    public final int mo8754h() {
        jq0 jq0 = this.f9618n;
        if (jq0 != null) {
            return jq0.mo5457S();
        }
        return -1;
    }

    /* renamed from: i */
    public final int mo8755i() {
        if (m12321b0()) {
            return (int) this.f9618n.mo5463a0();
        }
        return 0;
    }

    /* renamed from: j */
    public final int mo8756j() {
        return this.f9628x;
    }

    /* renamed from: k */
    public final int mo8757k() {
        return this.f9627w;
    }

    /* renamed from: l */
    public final long mo8758l() {
        jq0 jq0 = this.f9618n;
        if (jq0 != null) {
            return jq0.mo5461Y();
        }
        return -1;
    }

    /* renamed from: m */
    public final void mo8759m() {
        m12317X(this.f18318g.mo11897a(), false);
    }

    /* renamed from: n */
    public final long mo8760n() {
        jq0 jq0 = this.f9618n;
        if (jq0 != null) {
            return jq0.mo5465b0();
        }
        return -1;
    }

    /* renamed from: o */
    public final long mo8761o() {
        jq0 jq0 = this.f9618n;
        if (jq0 != null) {
            return jq0.mo5467c0();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[LOOP:0: B:30:0x0079->B:35:0x0096, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            int r9 = r8.getMeasuredWidth()
            int r10 = r8.getMeasuredHeight()
            float r0 = r8.f9611A
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x0027
            com.google.android.gms.internal.ads.rq0 r2 = r8.f9623s
            if (r2 != 0) goto L_0x0027
            float r2 = (float) r9
            float r3 = (float) r10
            float r3 = r2 / r3
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0020
            float r2 = r2 / r0
            int r10 = (int) r2
        L_0x0020:
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0027
            float r9 = (float) r10
            float r9 = r9 * r0
            int r9 = (int) r9
        L_0x0027:
            r8.setMeasuredDimension(r9, r10)
            com.google.android.gms.internal.ads.rq0 r0 = r8.f9623s
            if (r0 == 0) goto L_0x0031
            r0.mo10640b(r9, r10)
        L_0x0031:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 != r2) goto L_0x00a5
            int r0 = r8.f9629y
            if (r0 <= 0) goto L_0x003d
            if (r0 != r9) goto L_0x0043
        L_0x003d:
            int r0 = r8.f9630z
            if (r0 <= 0) goto L_0x00a1
            if (r0 == r10) goto L_0x00a1
        L_0x0043:
            boolean r0 = r8.f9614j
            if (r0 != 0) goto L_0x0048
            goto L_0x00a1
        L_0x0048:
            boolean r0 = r8.m12322c0()
            if (r0 == 0) goto L_0x00a1
            com.google.android.gms.internal.ads.jq0 r0 = r8.f9618n
            long r2 = r0.mo5462Z()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a1
            com.google.android.gms.internal.ads.jq0 r0 = r8.f9618n
            boolean r0 = r0.mo5456R()
            if (r0 != 0) goto L_0x00a1
            r0 = 1
            r8.m12317X(r1, r0)
            com.google.android.gms.internal.ads.jq0 r1 = r8.f9618n
            r1.mo5449K(r0)
            com.google.android.gms.internal.ads.jq0 r0 = r8.f9618n
            long r0 = r0.mo5462Z()
            e2.d r2 = p054h1.C2694t.m21592a()
            long r2 = r2.mo12462a()
        L_0x0079:
            boolean r4 = r8.m12322c0()
            if (r4 == 0) goto L_0x0098
            com.google.android.gms.internal.ads.jq0 r4 = r8.f9618n
            long r4 = r4.mo5462Z()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0098
            e2.d r4 = p054h1.C2694t.m21592a()
            long r4 = r4.mo12462a()
            long r4 = r4 - r2
            r6 = 250(0xfa, double:1.235E-321)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x0079
        L_0x0098:
            com.google.android.gms.internal.ads.jq0 r0 = r8.f9618n
            r1 = 0
            r0.mo5449K(r1)
            r8.mo8759m()
        L_0x00a1:
            r8.f9629y = r9
            r8.f9630z = r10
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kr0.onMeasure(int, int):void");
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f9624t) {
            rq0 rq0 = new rq0(getContext());
            this.f9623s = rq0;
            rq0.mo10641c(surfaceTexture, i, i2);
            this.f9623s.start();
            SurfaceTexture a = this.f9623s.mo10639a();
            if (a != null) {
                surfaceTexture = a;
            } else {
                this.f9623s.mo10642d();
                this.f9623s = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f9617m = surface;
        if (this.f9618n == null) {
            m12314U(false);
        } else {
            m12318Y(surface, true);
            if (!this.f9615k.f14537a) {
                m12312S();
            }
        }
        if (this.f9627w == 0 || this.f9628x == 0) {
            m12320a0(i, i2);
        } else {
            m12319Z();
        }
        C3163g2.f20465i.post(new dr0(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mo8769q();
        rq0 rq0 = this.f9623s;
        if (rq0 != null) {
            rq0.mo10642d();
            this.f9623s = null;
        }
        if (this.f9618n != null) {
            m12315V();
            Surface surface = this.f9617m;
            if (surface != null) {
                surface.release();
            }
            this.f9617m = null;
            m12318Y((Surface) null, true);
        }
        C3163g2.f20465i.post(new er0(this));
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        rq0 rq0 = this.f9623s;
        if (rq0 != null) {
            rq0.mo10640b(i, i2);
        }
        C3163g2.f20465i.post(new ir0(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f9613i.mo11289f(this);
        this.f18317f.mo9584a(surfaceTexture, this.f9616l);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        C3202r1.m24015k(sb.toString());
        C3163g2.f20465i.post(new hr0(this, i));
        super.onWindowVisibilityChanged(i);
    }

    /* renamed from: p */
    public final String mo8768p() {
        String str = true != this.f9624t ? "" : " spherical";
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    /* renamed from: q */
    public final void mo8769q() {
        if (m12321b0()) {
            if (this.f9615k.f14537a) {
                m12315V();
            }
            this.f9618n.mo5449K(false);
            this.f9613i.mo11288e();
            this.f18318g.mo11899c();
            C3163g2.f20465i.post(new fr0(this));
        }
    }

    /* renamed from: r */
    public final void mo8770r() {
        if (m12321b0()) {
            if (this.f9615k.f14537a) {
                m12312S();
            }
            this.f9618n.mo5449K(true);
            this.f9613i.mo11286c();
            this.f18318g.mo11898b();
            this.f18317f.mo9585b();
            C3163g2.f20465i.post(new gr0(this));
            return;
        }
        this.f9626v = true;
    }

    /* renamed from: s */
    public final void mo6293s(int i) {
        if (this.f9622r != i) {
            this.f9622r = i;
            if (i == 3) {
                m12313T();
            } else if (i == 4) {
                if (this.f9615k.f14537a) {
                    m12315V();
                }
                this.f9613i.mo11288e();
                this.f18318g.mo11899c();
                C3163g2.f20465i.post(new yq0(this));
            }
        }
    }

    /* renamed from: t */
    public final void mo8771t(int i) {
        if (m12321b0()) {
            this.f9618n.mo5443E((long) i);
        }
    }

    /* renamed from: u */
    public final void mo8772u(yp0 yp0) {
        this.f9616l = yp0;
    }

    /* renamed from: v */
    public final void mo8773v(String str) {
        if (str != null) {
            mo8752f(str, (String[]) null);
        }
    }

    /* renamed from: w */
    public final void mo8774w() {
        if (m12322c0()) {
            this.f9618n.mo5454P();
            m12316W();
        }
        this.f9613i.mo11288e();
        this.f18318g.mo11899c();
        this.f9613i.mo11287d();
    }

    /* renamed from: x */
    public final void mo6298x() {
        C3163g2.f20465i.post(new cr0(this));
    }

    /* renamed from: y */
    public final void mo8775y(float f, float f2) {
        rq0 rq0 = this.f9623s;
        if (rq0 != null) {
            rq0.mo10643e(f, f2);
        }
    }

    /* renamed from: z */
    public final void mo8776z(int i) {
        jq0 jq0 = this.f9618n;
        if (jq0 != null) {
            jq0.mo5444F(i);
        }
    }
}
