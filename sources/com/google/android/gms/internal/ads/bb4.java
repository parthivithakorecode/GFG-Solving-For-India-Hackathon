package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import java.util.Objects;

public final class bb4 {

    /* renamed from: a */
    private final pa4 f4828a = new pa4();

    /* renamed from: b */
    private final wa4 f4829b;

    /* renamed from: c */
    private final ab4 f4830c;

    /* renamed from: d */
    private boolean f4831d;

    /* renamed from: e */
    private Surface f4832e;

    /* renamed from: f */
    private float f4833f;

    /* renamed from: g */
    private float f4834g;

    /* renamed from: h */
    private float f4835h;

    /* renamed from: i */
    private float f4836i;

    /* renamed from: j */
    private int f4837j;

    /* renamed from: k */
    private long f4838k;

    /* renamed from: l */
    private long f4839l;

    /* renamed from: m */
    private long f4840m;

    /* renamed from: n */
    private long f4841n;

    /* renamed from: o */
    private long f4842o;

    /* renamed from: p */
    private long f4843p;

    /* renamed from: q */
    private long f4844q;

    public bb4(Context context) {
        wa4 wa4;
        ab4 ab4 = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            wa4 = n13.f11236a >= 17 ? za4.m20573b(applicationContext) : null;
            if (wa4 == null) {
                wa4 = ya4.m19944b(applicationContext);
            }
        } else {
            wa4 = null;
        }
        this.f4829b = wa4;
        this.f4830c = wa4 != null ? ab4.m6008a() : ab4;
        this.f4838k = -9223372036854775807L;
        this.f4839l = -9223372036854775807L;
        this.f4833f = -1.0f;
        this.f4836i = 1.0f;
        this.f4837j = 0;
    }

    /* renamed from: b */
    public static /* synthetic */ void m6741b(bb4 bb4, Display display) {
        long j;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            bb4.f4838k = refreshRate;
            j = (refreshRate * 80) / 100;
        } else {
            Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j = -9223372036854775807L;
            bb4.f4838k = -9223372036854775807L;
        }
        bb4.f4839l = j;
    }

    /* renamed from: m */
    private final void m6742m() {
        Surface surface;
        if (n13.f11236a >= 30 && (surface = this.f4832e) != null && this.f4837j != Integer.MIN_VALUE && this.f4835h != 0.0f) {
            this.f4835h = 0.0f;
            va4.m18437a(surface, 0.0f);
        }
    }

    /* renamed from: n */
    private final void m6743n() {
        this.f4840m = 0;
        this.f4843p = -1;
        this.f4841n = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (java.lang.Math.abs(r0 - r9.f4834g) >= r2) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r9.f4828a.mo10008b() >= 30) goto L_0x0064;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m6744o() {
        /*
            r9 = this;
            int r0 = com.google.android.gms.internal.ads.n13.f11236a
            r1 = 30
            if (r0 < r1) goto L_0x006d
            android.view.Surface r0 = r9.f4832e
            if (r0 != 0) goto L_0x000b
            goto L_0x006d
        L_0x000b:
            com.google.android.gms.internal.ads.pa4 r0 = r9.f4828a
            boolean r0 = r0.mo10013g()
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.pa4 r0 = r9.f4828a
            float r0 = r0.mo10007a()
            goto L_0x001c
        L_0x001a:
            float r0 = r9.f4833f
        L_0x001c:
            float r2 = r9.f4834g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0023
            return
        L_0x0023:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0058
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.pa4 r1 = r9.f4828a
            boolean r1 = r1.mo10013g()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.pa4 r1 = r9.f4828a
            long r3 = r1.mo10010d()
            r7 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x004b
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L_0x004b:
            float r1 = r9.f4834g
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0063
            goto L_0x0064
        L_0x0058:
            if (r4 != 0) goto L_0x0068
            com.google.android.gms.internal.ads.pa4 r2 = r9.f4828a
            int r2 = r2.mo10008b()
            if (r2 < r1) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r5 = r6
        L_0x0064:
            if (r5 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            return
        L_0x0068:
            r9.f4834g = r0
            r9.m6745p(r6)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bb4.m6744o():void");
    }

    /* renamed from: p */
    private final void m6745p(boolean z) {
        Surface surface;
        if (n13.f11236a >= 30 && (surface = this.f4832e) != null && this.f4837j != Integer.MIN_VALUE) {
            float f = 0.0f;
            if (this.f4831d) {
                float f2 = this.f4834g;
                if (f2 != -1.0f) {
                    f = this.f4836i * f2;
                }
            }
            if (z || this.f4835h != f) {
                this.f4835h = f;
                va4.m18437a(surface, f);
            }
        }
    }

    /* renamed from: a */
    public final long mo5767a(long j) {
        long j2;
        if (this.f4843p != -1 && this.f4828a.mo10013g()) {
            long c = this.f4844q + ((long) (((float) (this.f4828a.mo10009c() * (this.f4840m - this.f4843p))) / this.f4836i));
            if (Math.abs(j - c) <= 20000000) {
                j = c;
            } else {
                m6743n();
            }
        }
        this.f4841n = this.f4840m;
        this.f4842o = j;
        ab4 ab4 = this.f4830c;
        if (ab4 == null || this.f4838k == -9223372036854775807L) {
            return j;
        }
        long j3 = ab4.f4058f;
        if (j3 == -9223372036854775807L) {
            return j;
        }
        long j4 = this.f4838k;
        long j5 = j3 + (((j - j3) / j4) * j4);
        if (j <= j5) {
            j2 = j5 - j4;
        } else {
            long j6 = j5;
            j5 = j4 + j5;
            j2 = j6;
        }
        if (j5 - j >= j - j2) {
            j5 = j2;
        }
        return j5 - this.f4839l;
    }

    /* renamed from: c */
    public final void mo5768c() {
        wa4 wa4 = this.f4829b;
        if (wa4 != null) {
            wa4.zza();
            ab4 ab4 = this.f4830c;
            Objects.requireNonNull(ab4);
            ab4.mo5221c();
        }
    }

    /* renamed from: d */
    public final void mo5769d() {
        if (this.f4829b != null) {
            ab4 ab4 = this.f4830c;
            Objects.requireNonNull(ab4);
            ab4.mo5220b();
            this.f4829b.mo11629a(new ua4(this));
        }
    }

    /* renamed from: e */
    public final void mo5770e(float f) {
        this.f4833f = f;
        this.f4828a.mo10012f();
        m6744o();
    }

    /* renamed from: f */
    public final void mo5771f(long j) {
        long j2 = this.f4841n;
        if (j2 != -1) {
            this.f4843p = j2;
            this.f4844q = this.f4842o;
        }
        this.f4840m++;
        this.f4828a.mo10011e(j * 1000);
        m6744o();
    }

    /* renamed from: g */
    public final void mo5772g(float f) {
        this.f4836i = f;
        m6743n();
        m6745p(false);
    }

    /* renamed from: h */
    public final void mo5773h() {
        m6743n();
    }

    /* renamed from: i */
    public final void mo5774i() {
        this.f4831d = true;
        m6743n();
        m6745p(false);
    }

    /* renamed from: j */
    public final void mo5775j() {
        this.f4831d = false;
        m6742m();
    }

    /* renamed from: k */
    public final void mo5776k(Surface surface) {
        if (true == (surface instanceof na4)) {
            surface = null;
        }
        if (this.f4832e != surface) {
            m6742m();
            this.f4832e = surface;
            m6745p(true);
        }
    }

    /* renamed from: l */
    public final void mo5777l(int i) {
        if (this.f4837j != i) {
            this.f4837j = i;
            m6745p(true);
        }
    }
}
