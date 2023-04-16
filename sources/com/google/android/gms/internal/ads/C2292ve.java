package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.ve */
final class C2292ve implements Handler.Callback, C1780hk, C2003nl, C1854jk {

    /* renamed from: A */
    private int f16175A = 0;

    /* renamed from: B */
    private int f16176B;

    /* renamed from: C */
    private int f16177C;

    /* renamed from: D */
    private long f16178D;

    /* renamed from: E */
    private int f16179E;

    /* renamed from: F */
    private C2218te f16180F;

    /* renamed from: G */
    private long f16181G;

    /* renamed from: H */
    private C2144re f16182H;

    /* renamed from: I */
    private C2144re f16183I;

    /* renamed from: J */
    private C2144re f16184J;

    /* renamed from: K */
    private C1812if f16185K;

    /* renamed from: L */
    private boolean f16186L;

    /* renamed from: M */
    private volatile int f16187M;

    /* renamed from: N */
    private volatile int f16188N;

    /* renamed from: O */
    private final qr0 f16189O;

    /* renamed from: f */
    private final C1589cf[] f16190f;

    /* renamed from: g */
    private final C1626df[] f16191g;

    /* renamed from: h */
    private final C2040ol f16192h;

    /* renamed from: i */
    private final C2263um f16193i;

    /* renamed from: j */
    private final Handler f16194j;

    /* renamed from: k */
    private final HandlerThread f16195k;

    /* renamed from: l */
    private final Handler f16196l;

    /* renamed from: m */
    private final C1959me f16197m;

    /* renamed from: n */
    private final C1775hf f16198n;

    /* renamed from: o */
    private final C1738gf f16199o;

    /* renamed from: p */
    private C2181se f16200p;

    /* renamed from: q */
    private C1552bf f16201q;

    /* renamed from: r */
    private C1589cf f16202r;

    /* renamed from: s */
    private C2004nm f16203s;

    /* renamed from: t */
    private C1891kk f16204t;

    /* renamed from: u */
    private C1589cf[] f16205u;

    /* renamed from: v */
    private boolean f16206v;

    /* renamed from: w */
    private boolean f16207w;

    /* renamed from: x */
    private boolean f16208x;

    /* renamed from: y */
    private boolean f16209y;

    /* renamed from: z */
    private int f16210z;

    public C2292ve(C1589cf[] cfVarArr, C2040ol olVar, qr0 qr0, boolean z, int i, Handler handler, C2181se seVar, C1959me meVar, byte[] bArr) {
        this.f16190f = cfVarArr;
        this.f16192h = olVar;
        this.f16189O = qr0;
        this.f16207w = z;
        this.f16196l = handler;
        this.f16210z = 1;
        this.f16200p = seVar;
        this.f16197m = meVar;
        this.f16191g = new C1626df[2];
        for (int i2 = 0; i2 < 2; i2++) {
            cfVarArr[i2].mo6178Y(i2);
            this.f16191g[i2] = cfVarArr[i2].mo6182d();
        }
        this.f16193i = new C2263um();
        this.f16205u = new C1589cf[0];
        this.f16198n = new C1775hf();
        this.f16199o = new C1738gf();
        olVar.mo9794c(this);
        this.f16201q = C1552bf.f4896d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f16195k = handlerThread;
        handlerThread.start();
        this.f16194j = new Handler(handlerThread.getLooper(), this);
    }

    /* renamed from: B */
    private final int m18466B(int i, C1812if ifVar, C1812if ifVar2) {
        int b = ifVar.mo7320b();
        int i2 = -1;
        for (int i3 = 0; i3 < b && i2 == -1; i3++) {
            i = ifVar.mo8135f(i, this.f16199o, this.f16198n, this.f16175A);
            i2 = ifVar2.mo7319a(ifVar.mo7322d(i, this.f16199o, true).f7411b);
        }
        return i2;
    }

    /* renamed from: C */
    private final long m18467C(int i, long j) {
        C2144re reVar;
        m18485l();
        this.f16208x = false;
        m18482i(2);
        C2144re reVar2 = this.f16184J;
        if (reVar2 == null) {
            C2144re reVar3 = this.f16182H;
            if (reVar3 != null) {
                reVar3.mo10511c();
            }
            reVar = null;
        } else {
            reVar = null;
            while (reVar2 != null) {
                if (reVar2.f13603g != i || !reVar2.f13606j) {
                    reVar2.mo10511c();
                } else {
                    reVar = reVar2;
                }
                reVar2 = reVar2.f13608l;
            }
        }
        C2144re reVar4 = this.f16184J;
        if (!(reVar4 == reVar && reVar4 == this.f16183I)) {
            for (C1589cf i2 : this.f16205u) {
                i2.mo6185i();
            }
            this.f16205u = new C1589cf[0];
            this.f16203s = null;
            this.f16202r = null;
            this.f16184J = null;
        }
        if (reVar != null) {
            reVar.f13608l = null;
            this.f16182H = reVar;
            this.f16183I = reVar;
            m18481h(reVar);
            C2144re reVar5 = this.f16184J;
            if (reVar5.f13607k) {
                j = reVar5.f13597a.mo6984s(j);
            }
            m18478e(j);
            m18474J();
        } else {
            this.f16182H = null;
            this.f16183I = null;
            this.f16184J = null;
            m18478e(j);
        }
        this.f16194j.sendEmptyMessage(2);
        return j;
    }

    /* renamed from: D */
    private final Pair<Integer, Long> m18468D(int i, long j) {
        return m18469E(this.f16185K, 0, -9223372036854775807L);
    }

    /* renamed from: E */
    private final Pair<Integer, Long> m18469E(C1812if ifVar, int i, long j) {
        return m18470F(ifVar, 0, j, 0);
    }

    /* renamed from: F */
    private final Pair<Integer, Long> m18470F(C1812if ifVar, int i, long j, long j2) {
        C1856jm.m11726a(0, 0, ifVar.mo7321c());
        ifVar.mo7323e(0, this.f16198n, false, j2);
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long j3 = ifVar.mo7322d(0, this.f16199o, false).f7412c;
        if (j3 != -9223372036854775807L) {
            int i2 = (j > j3 ? 1 : (j == j3 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j));
    }

    /* renamed from: G */
    private final Pair<Integer, Long> m18471G(C2218te teVar) {
        C1812if ifVar = teVar.f14826a;
        if (ifVar.mo8137h()) {
            ifVar = this.f16185K;
        }
        try {
            Pair<Integer, Long> E = m18469E(ifVar, 0, teVar.f14828c);
            C1812if ifVar2 = this.f16185K;
            if (ifVar2 == ifVar) {
                return E;
            }
            if (ifVar2.mo7319a(ifVar.mo7322d(((Integer) E.first).intValue(), this.f16199o, true).f7411b) != -1) {
                return Pair.create(0, (Long) E.second);
            }
            if (m18466B(((Integer) E.first).intValue(), ifVar, this.f16185K) == -1) {
                return null;
            }
            this.f16185K.mo7322d(0, this.f16199o, false);
            return m18468D(0, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new C2441ze(this.f16185K, 0, teVar.f14828c);
        }
    }

    /* renamed from: H */
    private final void m18472H(boolean[] zArr, int i) {
        int i2;
        this.f16205u = new C1589cf[i];
        int i3 = 0;
        int i4 = 0;
        while (i3 < 2) {
            C1589cf cfVar = this.f16190f[i3];
            C1670el a = this.f16184J.f13609m.f12693b.mo9274a(i3);
            if (a != null) {
                int i5 = i4 + 1;
                this.f16205u[i4] = cfVar;
                if (cfVar.mo6180a() == 0) {
                    C1664ef efVar = this.f16184J.f13609m.f12695d[i3];
                    boolean z = this.f16207w && this.f16210z == 3;
                    boolean z2 = !zArr[i3] && z;
                    a.mo6991b();
                    C2367xe[] xeVarArr = new C2367xe[1];
                    for (int i6 = 0; i6 <= 0; i6++) {
                        xeVarArr[i6] = a.mo6992c(i6);
                    }
                    C2144re reVar = this.f16184J;
                    i2 = i3;
                    cfVar.mo6175V(efVar, xeVarArr, reVar.f13600d[i3], this.f16181G, z2, reVar.f13602f - reVar.f13604h);
                    C2004nm h = cfVar.mo6184h();
                    if (h != null) {
                        if (this.f16203s == null) {
                            this.f16203s = h;
                            this.f16202r = cfVar;
                            h.mo8666y(this.f16201q);
                        } else {
                            throw C1811ie.m11006c(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z) {
                        cfVar.mo6170B();
                    }
                } else {
                    i2 = i3;
                }
                i4 = i5;
            } else {
                i2 = i3;
            }
            i3 = i2 + 1;
        }
    }

    /* renamed from: I */
    private final void m18473I(Object obj, int i) {
        this.f16200p = new C2181se(0, 0);
        m18476L(obj, i);
        this.f16200p = new C2181se(0, -9223372036854775807L);
        m18482i(4);
        m18477M(false);
    }

    /* renamed from: J */
    private final void m18474J() {
        C2144re reVar = this.f16182H;
        long zza = !reVar.f13606j ? 0 : reVar.f13597a.zza();
        if (zza == Long.MIN_VALUE) {
            m18480g(false);
            return;
        }
        C2144re reVar2 = this.f16182H;
        long j = this.f16181G - (reVar2.f13602f - reVar2.f13604h);
        boolean j2 = this.f16189O.mo10370j(zza - j);
        m18480g(j2);
        if (j2) {
            this.f16182H.f13597a.mo6982q(j);
        }
    }

    /* renamed from: K */
    private final void m18475K() {
        C2144re reVar = this.f16182H;
        if (reVar != null && !reVar.f13606j) {
            C2144re reVar2 = this.f16183I;
            if (reVar2 == null || reVar2.f13608l == reVar) {
                C1589cf[] cfVarArr = this.f16205u;
                int length = cfVarArr.length;
                int i = 0;
                while (i < length) {
                    if (cfVarArr[i].mo6171F()) {
                        i++;
                    } else {
                        return;
                    }
                }
                this.f16182H.f13597a.mo6981p();
            }
        }
    }

    /* renamed from: L */
    private final void m18476L(Object obj, int i) {
        this.f16196l.obtainMessage(6, new C2255ue(this.f16185K, obj, this.f16200p, i)).sendToTarget();
    }

    /* renamed from: M */
    private final void m18477M(boolean z) {
        this.f16194j.removeMessages(2);
        this.f16208x = false;
        this.f16193i.mo11244c();
        this.f16203s = null;
        this.f16202r = null;
        this.f16181G = 60000000;
        for (C1589cf cfVar : this.f16205u) {
            try {
                m18489p(cfVar);
                cfVar.mo6185i();
            } catch (C1811ie | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.f16205u = new C1589cf[0];
        C2144re reVar = this.f16184J;
        if (reVar == null) {
            reVar = this.f16182H;
        }
        m18490q(reVar);
        this.f16182H = null;
        this.f16183I = null;
        this.f16184J = null;
        m18480g(false);
        if (z) {
            C1891kk kkVar = this.f16204t;
            if (kkVar != null) {
                kkVar.mo7649g();
                this.f16204t = null;
            }
            this.f16185K = null;
        }
    }

    /* renamed from: e */
    private final void m18478e(long j) {
        C2144re reVar = this.f16184J;
        long j2 = reVar == null ? j + 60000000 : j + (reVar.f13602f - reVar.f13604h);
        this.f16181G = j2;
        this.f16193i.mo11242a(j2);
        for (C1589cf Z : this.f16205u) {
            Z.mo6179Z(this.f16181G);
        }
    }

    /* renamed from: f */
    private final void m18479f(long j, long j2) {
        this.f16194j.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f16194j.sendEmptyMessage(2);
        } else {
            this.f16194j.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    /* renamed from: g */
    private final void m18480g(boolean z) {
        if (this.f16209y != z) {
            this.f16209y = z;
            this.f16196l.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    /* renamed from: h */
    private final void m18481h(C2144re reVar) {
        if (this.f16184J != reVar) {
            boolean[] zArr = new boolean[2];
            int i = 0;
            for (int i2 = 0; i2 < 2; i2++) {
                C1589cf cfVar = this.f16190f[i2];
                zArr[i2] = cfVar.mo6180a() != 0;
                C1670el a = reVar.f13609m.f12693b.mo9274a(i2);
                if (a != null) {
                    i++;
                }
                if (zArr[i2] && (a == null || (cfVar.mo6172G() && cfVar.mo6183f() == this.f16184J.f13600d[i2]))) {
                    if (cfVar == this.f16202r) {
                        this.f16193i.mo11245d(this.f16203s);
                        this.f16203s = null;
                        this.f16202r = null;
                    }
                    m18489p(cfVar);
                    cfVar.mo6185i();
                }
            }
            this.f16184J = reVar;
            this.f16196l.obtainMessage(3, reVar.f13609m).sendToTarget();
            m18472H(zArr, i);
        }
    }

    /* renamed from: i */
    private final void m18482i(int i) {
        if (this.f16210z != i) {
            this.f16210z = i;
            this.f16196l.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    /* renamed from: j */
    private final void m18483j() {
        this.f16208x = false;
        this.f16193i.mo11243b();
        for (C1589cf B : this.f16205u) {
            B.mo6170B();
        }
    }

    /* renamed from: k */
    private final void m18484k() {
        m18477M(true);
        this.f16189O.mo10363c();
        m18482i(1);
    }

    /* renamed from: l */
    private final void m18485l() {
        this.f16193i.mo11244c();
        for (C1589cf p : this.f16205u) {
            m18489p(p);
        }
    }

    /* renamed from: m */
    private final void m18486m() {
        C2144re reVar = this.f16184J;
        if (reVar != null) {
            long f = reVar.f13597a.mo6977f();
            if (f != -9223372036854775807L) {
                m18478e(f);
            } else {
                C1589cf cfVar = this.f16202r;
                if (cfVar == null || cfVar.mo6173L()) {
                    this.f16181G = this.f16193i.mo8665w();
                } else {
                    long w = this.f16203s.mo8665w();
                    this.f16181G = w;
                    this.f16193i.mo11242a(w);
                }
                C2144re reVar2 = this.f16184J;
                f = this.f16181G - (reVar2.f13602f - reVar2.f13604h);
            }
            this.f16200p.f14415c = f;
            this.f16178D = SystemClock.elapsedRealtime() * 1000;
            long e = this.f16205u.length == 0 ? Long.MIN_VALUE : this.f16184J.f13597a.mo6976e();
            C2181se seVar = this.f16200p;
            if (e == Long.MIN_VALUE) {
                e = this.f16185K.mo7322d(this.f16184J.f13603g, this.f16199o, false).f7412c;
            }
            seVar.f14416d = e;
        }
    }

    /* renamed from: n */
    private final boolean m18487n(int i) {
        this.f16185K.mo7322d(i, this.f16199o, false);
        this.f16185K.mo8136g(0, this.f16198n, false);
        return this.f16185K.mo8135f(i, this.f16199o, this.f16198n, this.f16175A) == -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r6 = r5.f16184J.f13608l;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m18488o(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.se r0 = r5.f16200p
            long r3 = r0.f14415c
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x001f
            com.google.android.gms.internal.ads.re r6 = r5.f16184J
            com.google.android.gms.internal.ads.re r6 = r6.f13608l
            if (r6 == 0) goto L_0x0020
            boolean r6 = r6.f13606j
            if (r6 == 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            return r1
        L_0x001f:
            r1 = r2
        L_0x0020:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2292ve.m18488o(long):boolean");
    }

    /* renamed from: p */
    private static final void m18489p(C1589cf cfVar) {
        if (cfVar.mo6180a() == 2) {
            cfVar.mo6174U();
        }
    }

    /* renamed from: q */
    private static final void m18490q(C2144re reVar) {
        while (reVar != null) {
            reVar.mo10511c();
            reVar = reVar.f13608l;
        }
    }

    /* renamed from: A */
    public final void mo11454A() {
        this.f16194j.sendEmptyMessage(5);
    }

    /* renamed from: a */
    public final void mo7950a(C1817ik ikVar) {
        this.f16194j.obtainMessage(8, ikVar).sendToTarget();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo8967b(C2373xk xkVar) {
        this.f16194j.obtainMessage(9, (C1817ik) xkVar).sendToTarget();
    }

    /* renamed from: c */
    public final void mo7647c(C1812if ifVar, Object obj) {
        this.f16194j.obtainMessage(7, Pair.create(ifVar, (Object) null)).sendToTarget();
    }

    /* renamed from: d */
    public final void mo9546d() {
        this.f16194j.sendEmptyMessage(10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:436:0x078e, code lost:
        if (m18488o(r1) != false) goto L_0x0790;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x086e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x086f, code lost:
        r2 = r0;
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0872, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0873, code lost:
        r2 = r0;
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0876, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0877, code lost:
        r2 = r0;
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x087c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x087d, code lost:
        r2 = r0;
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0882, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0883, code lost:
        r1 = r0;
        android.util.Log.e("ExoPlayerImplInternal", "Internal runtime error.", r1);
        r8.f16196l.obtainMessage(8, com.google.android.gms.internal.ads.C1811ie.m11006c(r1)).sendToTarget();
        m18484k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x089e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x089f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x08a0, code lost:
        r1 = true;
        r3 = 8;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x08bc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x08bd, code lost:
        r1 = true;
        r3 = 8;
        r2 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0266 A[Catch:{ all -> 0x040c, all -> 0x035a, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x026f A[Catch:{ all -> 0x040c, all -> 0x035a, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x04e0 A[Catch:{ all -> 0x040c, all -> 0x035a, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x04e7 A[Catch:{ all -> 0x040c, all -> 0x035a, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x04fe A[Catch:{ all -> 0x040c, all -> 0x035a, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0501 A[Catch:{ all -> 0x040c, all -> 0x035a, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x053c A[Catch:{ all -> 0x040c, all -> 0x035a, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x054e A[Catch:{ all -> 0x040c, all -> 0x035a, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0568 A[Catch:{ all -> 0x040c, all -> 0x035a, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }, LOOP:8: B:318:0x0568->B:322:0x0578, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a A[Catch:{ all -> 0x040c, all -> 0x035a, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x06bd A[Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x07ba A[Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x07d6 A[Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:464:0x07e4 A[Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }] */
    /* JADX WARNING: Removed duplicated region for block: B:517:0x0882 A[ExcHandler: RuntimeException (r0v2 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r34) {
        /*
            r33 = this;
            r8 = r33
            r1 = r34
            r10 = 1
            int r2 = r1.what     // Catch:{ ie -> 0x08bc, IOException -> 0x089f, RuntimeException -> 0x0882 }
            r11 = 7
            r3 = 0
            r14 = 3
            r5 = -1
            r6 = 0
            r15 = 4
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 2
            r9 = 0
            switch(r2) {
                case 0: goto L_0x0839;
                case 1: goto L_0x080d;
                case 2: goto L_0x041f;
                case 3: goto L_0x0380;
                case 4: goto L_0x0362;
                case 5: goto L_0x035e;
                case 6: goto L_0x0347;
                case 7: goto L_0x01f4;
                case 8: goto L_0x01c4;
                case 9: goto L_0x01b4;
                case 10: goto L_0x00da;
                case 11: goto L_0x009c;
                case 12: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            r1 = r9
            return r1
        L_0x001a:
            int r1 = r1.arg1     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16175A = r1     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r2 = r8.f16184J     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r2 != 0) goto L_0x0024
            com.google.android.gms.internal.ads.re r2 = r8.f16182H     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x0024:
            if (r2 != 0) goto L_0x0028
            goto L_0x009b
        L_0x0028:
            com.google.android.gms.internal.ads.re r3 = r8.f16183I     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r2 != r3) goto L_0x002e
            r3 = r10
            goto L_0x002f
        L_0x002e:
            r3 = r9
        L_0x002f:
            com.google.android.gms.internal.ads.re r4 = r8.f16182H     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r2 != r4) goto L_0x0035
            r4 = r10
            goto L_0x0036
        L_0x0035:
            r4 = r9
        L_0x0036:
            com.google.android.gms.internal.ads.if r11 = r8.f16185K     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r12 = r2.f13603g     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.gf r13 = r8.f16199o     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.hf r14 = r8.f16198n     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r11 = r11.mo8135f(r12, r13, r14, r1)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x0042:
            com.google.android.gms.internal.ads.re r12 = r2.f13608l     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r12 == 0) goto L_0x0068
            if (r11 == r5) goto L_0x0068
            int r13 = r12.f13603g     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r13 != r11) goto L_0x0068
            com.google.android.gms.internal.ads.re r2 = r8.f16183I     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r12 != r2) goto L_0x0052
            r2 = r10
            goto L_0x0053
        L_0x0052:
            r2 = r9
        L_0x0053:
            r3 = r3 | r2
            com.google.android.gms.internal.ads.re r2 = r8.f16182H     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r12 != r2) goto L_0x005a
            r2 = r10
            goto L_0x005b
        L_0x005a:
            r2 = r9
        L_0x005b:
            r4 = r4 | r2
            com.google.android.gms.internal.ads.if r2 = r8.f16185K     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.gf r11 = r8.f16199o     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.hf r14 = r8.f16198n     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r11 = r2.mo8135f(r13, r11, r14, r1)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r2 = r12
            goto L_0x0042
        L_0x0068:
            if (r12 == 0) goto L_0x006f
            m18490q(r12)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r2.f13608l = r6     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x006f:
            int r5 = r2.f13603g     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            boolean r5 = r8.m18487n(r5)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r2.f13605i = r5     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r4 != 0) goto L_0x007b
            r8.f16182H = r2     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x007b:
            if (r3 != 0) goto L_0x0092
            com.google.android.gms.internal.ads.re r2 = r8.f16184J     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r2 == 0) goto L_0x0092
            int r2 = r2.f13603g     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.se r3 = r8.f16200p     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r3 = r3.f14415c     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r3 = r8.m18467C(r2, r3)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.se r5 = new com.google.android.gms.internal.ads.se     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r5.<init>(r2, r3)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16200p = r5     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x0092:
            int r2 = r8.f16210z     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r2 != r15) goto L_0x009b
            if (r1 == 0) goto L_0x009b
            r8.m18482i(r7)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x009b:
            return r10
        L_0x009c:
            java.lang.Object r1 = r1.obj     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.le[] r1 = (com.google.android.gms.internal.ads.C1922le[]) r1     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r2 = r1.length     // Catch:{ all -> 0x00c9 }
        L_0x00a1:
            if (r9 >= r2) goto L_0x00b1
            r3 = r1[r9]     // Catch:{ all -> 0x00c9 }
            com.google.android.gms.internal.ads.ke r4 = r3.f10015a     // Catch:{ all -> 0x00c9 }
            int r5 = r3.f10016b     // Catch:{ all -> 0x00c9 }
            java.lang.Object r3 = r3.f10017c     // Catch:{ all -> 0x00c9 }
            r4.mo8172g(r5, r3)     // Catch:{ all -> 0x00c9 }
            int r9 = r9 + 1
            goto L_0x00a1
        L_0x00b1:
            com.google.android.gms.internal.ads.kk r1 = r8.f16204t     // Catch:{ all -> 0x00c9 }
            if (r1 == 0) goto L_0x00ba
            android.os.Handler r1 = r8.f16194j     // Catch:{ all -> 0x00c9 }
            r1.sendEmptyMessage(r7)     // Catch:{ all -> 0x00c9 }
        L_0x00ba:
            monitor-enter(r33)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r1 = r8.f16177C     // Catch:{ all -> 0x00c5 }
            int r1 = r1 + r10
            r8.f16177C = r1     // Catch:{ all -> 0x00c5 }
            r33.notifyAll()     // Catch:{ all -> 0x00c5 }
            monitor-exit(r33)     // Catch:{ all -> 0x00c5 }
            return r10
        L_0x00c5:
            r0 = move-exception
            r1 = r0
            monitor-exit(r33)     // Catch:{ all -> 0x00c5 }
            throw r1     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x00c9:
            r0 = move-exception
            r1 = r0
            monitor-enter(r33)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r2 = r8.f16177C     // Catch:{ all -> 0x00d6 }
            int r2 = r2 + r10
            r8.f16177C = r2     // Catch:{ all -> 0x00d6 }
            r33.notifyAll()     // Catch:{ all -> 0x00d6 }
            monitor-exit(r33)     // Catch:{ all -> 0x00d6 }
            throw r1     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x00d6:
            r0 = move-exception
            r1 = r0
            monitor-exit(r33)     // Catch:{ all -> 0x00d6 }
            throw r1     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x00da:
            com.google.android.gms.internal.ads.re r1 = r8.f16184J     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r1 == 0) goto L_0x01b3
            r2 = r10
        L_0x00df:
            if (r1 == 0) goto L_0x01b3
            boolean r3 = r1.f13606j     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r3 != 0) goto L_0x00e7
            goto L_0x01b3
        L_0x00e7:
            boolean r3 = r1.mo10513e()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r3 == 0) goto L_0x01a7
            if (r2 == 0) goto L_0x0178
            com.google.android.gms.internal.ads.re r2 = r8.f16183I     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r3 = r8.f16184J     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r2 == r3) goto L_0x00f7
            r2 = r10
            goto L_0x00f8
        L_0x00f7:
            r2 = r9
        L_0x00f8:
            com.google.android.gms.internal.ads.re r3 = r3.f13608l     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            m18490q(r3)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r3 = r8.f16184J     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r3.f13608l = r6     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16182H = r3     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16183I = r3     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            boolean[] r4 = new boolean[r7]     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.se r5 = r8.f16200p     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r11 = r5.f14415c     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r2 = r3.mo10510b(r11, r2, r4)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.se r5 = r8.f16200p     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r11 = r5.f14415c     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x011e
            com.google.android.gms.internal.ads.se r5 = r8.f16200p     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r5.f14415c = r2     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.m18478e(r2)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x011e:
            boolean[] r2 = new boolean[r7]     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r3 = r9
            r5 = r3
        L_0x0122:
            if (r3 >= r7) goto L_0x0169
            com.google.android.gms.internal.ads.cf[] r11 = r8.f16190f     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r11 = r11[r3]     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r12 = r11.mo6180a()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r12 == 0) goto L_0x0130
            r12 = r10
            goto L_0x0131
        L_0x0130:
            r12 = r9
        L_0x0131:
            r2[r3] = r12     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r13 = r8.f16184J     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.uk[] r13 = r13.f13600d     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r13 = r13[r3]     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r13 == 0) goto L_0x013d
            int r5 = r5 + 1
        L_0x013d:
            if (r12 == 0) goto L_0x0166
            com.google.android.gms.internal.ads.uk r12 = r11.mo6183f()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r13 == r12) goto L_0x015d
            com.google.android.gms.internal.ads.cf r12 = r8.f16202r     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r11 != r12) goto L_0x0156
            if (r13 != 0) goto L_0x0152
            com.google.android.gms.internal.ads.um r12 = r8.f16193i     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.nm r13 = r8.f16203s     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r12.mo11245d(r13)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x0152:
            r8.f16203s = r6     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16202r = r6     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x0156:
            m18489p(r11)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r11.mo6185i()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x0166
        L_0x015d:
            boolean r12 = r4[r3]     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r12 == 0) goto L_0x0166
            long r12 = r8.f16181G     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r11.mo6179Z(r12)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x0166:
            int r3 = r3 + 1
            goto L_0x0122
        L_0x0169:
            android.os.Handler r3 = r8.f16196l     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.pl r1 = r1.f13609m     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            android.os.Message r1 = r3.obtainMessage(r14, r1)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r1.sendToTarget()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.m18472H(r2, r5)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x019b
        L_0x0178:
            r8.f16182H = r1     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x017a:
            com.google.android.gms.internal.ads.re r1 = r1.f13608l     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r1 == 0) goto L_0x0182
            r1.mo10511c()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x017a
        L_0x0182:
            com.google.android.gms.internal.ads.re r1 = r8.f16182H     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r1.f13608l = r6     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            boolean r2 = r1.f13606j     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r2 == 0) goto L_0x019b
            long r2 = r1.f13604h     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r4 = r8.f16181G     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r11 = r1.f13602f     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r11 = r11 - r2
            long r4 = r4 - r11
            long r1 = java.lang.Math.max(r2, r4)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r3 = r8.f16182H     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r3.mo10509a(r1, r9)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x019b:
            r33.m18474J()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r33.m18486m()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            android.os.Handler r1 = r8.f16194j     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r1.sendEmptyMessage(r7)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x01b3
        L_0x01a7:
            com.google.android.gms.internal.ads.re r3 = r8.f16183I     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r1 != r3) goto L_0x01ad
            r3 = r9
            goto L_0x01ae
        L_0x01ad:
            r3 = r10
        L_0x01ae:
            r2 = r2 & r3
            com.google.android.gms.internal.ads.re r1 = r1.f13608l     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x00df
        L_0x01b3:
            return r10
        L_0x01b4:
            java.lang.Object r1 = r1.obj     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.ik r1 = (com.google.android.gms.internal.ads.C1817ik) r1     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r2 = r8.f16182H     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r2 == 0) goto L_0x01c3
            com.google.android.gms.internal.ads.ik r2 = r2.f13597a     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r2 != r1) goto L_0x01c3
            r33.m18474J()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x01c3:
            return r10
        L_0x01c4:
            java.lang.Object r1 = r1.obj     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.ik r1 = (com.google.android.gms.internal.ads.C1817ik) r1     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r2 = r8.f16182H     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r2 == 0) goto L_0x01f3
            com.google.android.gms.internal.ads.ik r3 = r2.f13597a     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r3 == r1) goto L_0x01d1
            goto L_0x01f3
        L_0x01d1:
            r2.f13606j = r10     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r2.mo10513e()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r3 = r2.f13604h     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r3 = r2.mo10509a(r3, r9)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r2.f13604h = r3     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r1 = r8.f16184J     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r1 != 0) goto L_0x01f0
            com.google.android.gms.internal.ads.re r1 = r8.f16182H     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16183I = r1     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r1 = r1.f13604h     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.m18478e(r1)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r1 = r8.f16183I     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.m18481h(r1)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x01f0:
            r33.m18474J()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x01f3:
            return r10
        L_0x01f4:
            java.lang.Object r1 = r1.obj     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.if r2 = r8.f16185K     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Object r3 = r1.first     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.if r3 = (com.google.android.gms.internal.ads.C1812if) r3     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16185K = r3     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Object r1 = r1.second     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r2 != 0) goto L_0x0261
            int r4 = r8.f16179E     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r4 <= 0) goto L_0x0233
            com.google.android.gms.internal.ads.te r3 = r8.f16180F     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            android.util.Pair r3 = r8.m18471G(r3)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r4 = r8.f16179E     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16179E = r9     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16180F = r6     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r3 != 0) goto L_0x021b
        L_0x0216:
            r8.m18473I(r1, r4)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x0346
        L_0x021b:
            com.google.android.gms.internal.ads.se r7 = new com.google.android.gms.internal.ads.se     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Object r11 = r3.first     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r11 = r11.intValue()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Object r3 = r3.second     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r14 = r3.longValue()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r7.<init>(r11, r14)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16200p = r7     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x0262
        L_0x0233:
            com.google.android.gms.internal.ads.se r4 = r8.f16200p     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r14 = r4.f14414b     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r4 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0261
            boolean r3 = r3.mo8137h()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r3 == 0) goto L_0x0246
            r8.m18473I(r1, r9)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x0346
        L_0x0246:
            android.util.Pair r3 = r8.m18468D(r9, r12)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.se r4 = new com.google.android.gms.internal.ads.se     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Object r7 = r3.first     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r7 = r7.intValue()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Object r3 = r3.second     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r14 = r3.longValue()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r4.<init>(r7, r14)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16200p = r4     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x0261:
            r4 = r9
        L_0x0262:
            com.google.android.gms.internal.ads.re r3 = r8.f16184J     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r3 != 0) goto L_0x0268
            com.google.android.gms.internal.ads.re r3 = r8.f16182H     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x0268:
            if (r3 != 0) goto L_0x026f
        L_0x026a:
            r8.m18476L(r1, r4)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x0346
        L_0x026f:
            com.google.android.gms.internal.ads.if r7 = r8.f16185K     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Object r11 = r3.f13598b     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r7 = r7.mo7319a(r11)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r7 != r5) goto L_0x02ca
            int r6 = r3.f13603g     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.if r7 = r8.f16185K     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r2 = r8.m18466B(r6, r2, r7)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r2 != r5) goto L_0x0284
            goto L_0x0216
        L_0x0284:
            com.google.android.gms.internal.ads.if r2 = r8.f16185K     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.gf r6 = r8.f16199o     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r2.mo7322d(r9, r6, r9)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            android.util.Pair r2 = r8.m18468D(r9, r12)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Object r6 = r2.first     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r6 = r6.intValue()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Object r2 = r2.second     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r11 = r2.longValue()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.if r2 = r8.f16185K     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.gf r7 = r8.f16199o     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r2.mo7322d(r6, r7, r10)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.gf r2 = r8.f16199o     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Object r2 = r2.f7411b     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r3.f13603g = r5     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x02ac:
            com.google.android.gms.internal.ads.re r3 = r3.f13608l     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r3 == 0) goto L_0x02be
            java.lang.Object r7 = r3.f13598b     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            boolean r7 = r7.equals(r2)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r10 == r7) goto L_0x02ba
            r7 = r5
            goto L_0x02bb
        L_0x02ba:
            r7 = r6
        L_0x02bb:
            r3.f13603g = r7     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x02ac
        L_0x02be:
            long r2 = r8.m18467C(r6, r11)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.se r5 = new com.google.android.gms.internal.ads.se     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r5.<init>(r6, r2)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16200p = r5     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x026a
        L_0x02ca:
            boolean r2 = r8.m18487n(r9)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r3.f13603g = r9     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r3.f13605i = r2     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r2 = r8.f16183I     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r3 != r2) goto L_0x02d8
            r2 = r10
            goto L_0x02d9
        L_0x02d8:
            r2 = r9
        L_0x02d9:
            com.google.android.gms.internal.ads.se r11 = r8.f16200p     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r12 = r11.f14413a     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r12 == 0) goto L_0x02f0
            com.google.android.gms.internal.ads.se r12 = new com.google.android.gms.internal.ads.se     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r13 = r11.f14414b     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r12.<init>(r9, r13)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r13 = r11.f14415c     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r12.f14415c = r13     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r13 = r11.f14416d     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r12.f14416d = r13     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16200p = r12     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x02f0:
            com.google.android.gms.internal.ads.re r11 = r3.f13608l     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r11 == 0) goto L_0x026a
            com.google.android.gms.internal.ads.if r12 = r8.f16185K     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.gf r13 = r8.f16199o     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.hf r14 = r8.f16198n     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r15 = r8.f16175A     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r7 = r12.mo8135f(r7, r13, r14, r15)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r7 == r5) goto L_0x0326
            java.lang.Object r12 = r11.f13598b     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.if r13 = r8.f16185K     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.gf r14 = r8.f16199o     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.gf r13 = r13.mo7322d(r7, r14, r10)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Object r13 = r13.f7411b     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            boolean r12 = r12.equals(r13)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r12 == 0) goto L_0x0326
            boolean r3 = r8.m18487n(r7)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r11.f13603g = r7     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r11.f13605i = r3     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r3 = r8.f16183I     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r11 != r3) goto L_0x0322
            r3 = r10
            goto L_0x0323
        L_0x0322:
            r3 = r9
        L_0x0323:
            r2 = r2 | r3
            r3 = r11
            goto L_0x02f0
        L_0x0326:
            if (r2 != 0) goto L_0x033d
            com.google.android.gms.internal.ads.re r2 = r8.f16184J     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r2 = r2.f13603g     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.se r3 = r8.f16200p     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r5 = r3.f14415c     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r5 = r8.m18467C(r2, r5)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.se r3 = new com.google.android.gms.internal.ads.se     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r3.<init>(r2, r5)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16200p = r3     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x026a
        L_0x033d:
            r8.f16182H = r3     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r3.f13608l = r6     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            m18490q(r11)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x026a
        L_0x0346:
            return r10
        L_0x0347:
            r8.m18477M(r10)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.qr0 r1 = r8.f16189O     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r1.mo10362b()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.m18482i(r10)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            monitor-enter(r33)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16206v = r10     // Catch:{ all -> 0x035a }
            r33.notifyAll()     // Catch:{ all -> 0x035a }
            monitor-exit(r33)     // Catch:{ all -> 0x035a }
            return r10
        L_0x035a:
            r0 = move-exception
            r1 = r0
            monitor-exit(r33)     // Catch:{ all -> 0x035a }
            throw r1     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x035e:
            r33.m18484k()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            return r10
        L_0x0362:
            java.lang.Object r1 = r1.obj     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.bf r1 = (com.google.android.gms.internal.ads.C1552bf) r1     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.nm r2 = r8.f16203s     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r2 == 0) goto L_0x036f
            com.google.android.gms.internal.ads.bf r1 = r2.mo8666y(r1)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x0374
        L_0x036f:
            com.google.android.gms.internal.ads.um r2 = r8.f16193i     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r2.mo8666y(r1)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x0374:
            r8.f16201q = r1     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            android.os.Handler r2 = r8.f16196l     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            android.os.Message r1 = r2.obtainMessage(r11, r1)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r1.sendToTarget()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            return r10
        L_0x0380:
            java.lang.Object r1 = r1.obj     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.te r1 = (com.google.android.gms.internal.ads.C2218te) r1     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.if r2 = r8.f16185K     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r2 != 0) goto L_0x0391
            int r2 = r8.f16179E     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r2 = r2 + r10
            r8.f16179E = r2     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16180F = r1     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x040b
        L_0x0391:
            android.util.Pair r2 = r8.m18471G(r1)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r2 != 0) goto L_0x03b5
            com.google.android.gms.internal.ads.se r1 = new com.google.android.gms.internal.ads.se     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r1.<init>(r9, r3)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16200p = r1     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            android.os.Handler r2 = r8.f16196l     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            android.os.Message r1 = r2.obtainMessage(r15, r10, r9, r1)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r1.sendToTarget()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.se r1 = new com.google.android.gms.internal.ads.se     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r1.<init>(r9, r12)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16200p = r1     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.m18482i(r15)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.m18477M(r9)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x040b
        L_0x03b5:
            long r3 = r1.f14828c     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x03bd
            r1 = r10
            goto L_0x03be
        L_0x03bd:
            r1 = r9
        L_0x03be:
            java.lang.Object r3 = r2.first     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r3 = r3.intValue()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Object r2 = r2.second     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r4 = r2.longValue()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.se r2 = r8.f16200p     // Catch:{ all -> 0x040c }
            int r6 = r2.f14413a     // Catch:{ all -> 0x040c }
            if (r3 != r6) goto L_0x03f1
            r16 = 1000(0x3e8, double:4.94E-321)
            long r6 = r4 / r16
            long r11 = r2.f14415c     // Catch:{ all -> 0x040c }
            long r11 = r11 / r16
            int r2 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x03f1
            com.google.android.gms.internal.ads.se r2 = new com.google.android.gms.internal.ads.se     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r2.<init>(r3, r4)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16200p = r2     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            android.os.Handler r3 = r8.f16196l     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r2)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x03ed:
            r1.sendToTarget()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x040b
        L_0x03f1:
            long r6 = r8.m18467C(r3, r4)     // Catch:{ all -> 0x040c }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x03fb
            r2 = r10
            goto L_0x03fc
        L_0x03fb:
            r2 = r9
        L_0x03fc:
            r1 = r1 | r2
            com.google.android.gms.internal.ads.se r2 = new com.google.android.gms.internal.ads.se     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r2.<init>(r3, r6)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16200p = r2     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            android.os.Handler r3 = r8.f16196l     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r2)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x03ed
        L_0x040b:
            return r10
        L_0x040c:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.internal.ads.se r6 = new com.google.android.gms.internal.ads.se     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r6.<init>(r3, r4)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16200p = r6     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            android.os.Handler r3 = r8.f16196l     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r6)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r1.sendToTarget()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            throw r2     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x041f:
            r16 = 1000(0x3e8, double:4.94E-321)
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.if r1 = r8.f16185K     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r1 != 0) goto L_0x0431
            com.google.android.gms.internal.ads.kk r1 = r8.f16204t     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r1.zza()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r11 = r5
            goto L_0x066d
        L_0x0431:
            com.google.android.gms.internal.ads.re r1 = r8.f16182H     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r1 != 0) goto L_0x043a
            com.google.android.gms.internal.ads.se r1 = r8.f16200p     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r1 = r1.f14413a     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x046f
        L_0x043a:
            int r2 = r1.f13603g     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            boolean r7 = r1.f13605i     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r7 != 0) goto L_0x0549
            boolean r1 = r1.mo10512d()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r1 == 0) goto L_0x0549
            com.google.android.gms.internal.ads.if r1 = r8.f16185K     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.gf r7 = r8.f16199o     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.gf r1 = r1.mo7322d(r2, r7, r9)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r14 = r1.f7412c     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r1 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x0549
            com.google.android.gms.internal.ads.re r1 = r8.f16184J     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r1 == 0) goto L_0x0463
            com.google.android.gms.internal.ads.re r7 = r8.f16182H     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r7 = r7.f13599c     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r1 = r1.f13599c     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r7 = r7 - r1
            r1 = 100
            if (r7 == r1) goto L_0x0549
        L_0x0463:
            com.google.android.gms.internal.ads.if r1 = r8.f16185K     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.gf r7 = r8.f16199o     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.hf r14 = r8.f16198n     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r15 = r8.f16175A     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r1 = r1.mo8135f(r2, r7, r14, r15)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x046f:
            com.google.android.gms.internal.ads.if r2 = r8.f16185K     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r2 = r2.mo7320b()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r1 < r2) goto L_0x047e
            com.google.android.gms.internal.ads.kk r1 = r8.f16204t     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r1.zza()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x0549
        L_0x047e:
            com.google.android.gms.internal.ads.re r2 = r8.f16182H     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r2 != 0) goto L_0x0489
            com.google.android.gms.internal.ads.se r2 = r8.f16200p     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r3 = r2.f14415c     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x0486:
            r11 = r5
            r15 = 2
            goto L_0x04dc
        L_0x0489:
            com.google.android.gms.internal.ads.if r2 = r8.f16185K     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.gf r7 = r8.f16199o     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r2.mo7322d(r1, r7, r9)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.if r2 = r8.f16185K     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.hf r7 = r8.f16198n     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r2.mo8136g(r9, r7, r9)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r1 == 0) goto L_0x049a
            goto L_0x0486
        L_0x049a:
            com.google.android.gms.internal.ads.re r1 = r8.f16182H     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r14 = r1.f13602f     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r11 = r1.f13604h     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r14 = r14 - r11
            com.google.android.gms.internal.ads.if r2 = r8.f16185K     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r1 = r1.f13603g     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.gf r7 = r8.f16199o     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.gf r1 = r2.mo7322d(r1, r7, r9)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r1 = r1.f7412c     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r14 = r14 + r1
            long r1 = r8.f16181G     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r14 = r14 - r1
            com.google.android.gms.internal.ads.if r2 = r8.f16185K     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r7 = 0
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r13 = java.lang.Math.max(r3, r14)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r1 = r33
            r3 = r7
            r6 = r5
            r4 = r11
            r11 = r6
            r15 = 2
            r6 = r13
            android.util.Pair r1 = r1.m18470F(r2, r3, r4, r6)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r1 == 0) goto L_0x054a
            java.lang.Object r2 = r1.first     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r2 = r2.intValue()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Object r1 = r1.second     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r3 = r1.longValue()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r1 = r2
        L_0x04dc:
            com.google.android.gms.internal.ads.re r2 = r8.f16182H     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r2 != 0) goto L_0x04e7
            r5 = 60000000(0x3938700, double:2.96439388E-316)
            long r5 = r5 + r3
        L_0x04e4:
            r21 = r5
            goto L_0x04fa
        L_0x04e7:
            long r5 = r2.f13602f     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r13 = r2.f13604h     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r5 = r5 - r13
            com.google.android.gms.internal.ads.if r7 = r8.f16185K     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r2 = r2.f13603g     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.gf r13 = r8.f16199o     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.gf r2 = r7.mo7322d(r2, r13, r9)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r13 = r2.f7412c     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r5 = r5 + r13
            goto L_0x04e4
        L_0x04fa:
            com.google.android.gms.internal.ads.re r2 = r8.f16182H     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r2 != 0) goto L_0x0501
            r27 = r9
            goto L_0x0506
        L_0x0501:
            int r2 = r2.f13599c     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r2 = r2 + r10
            r27 = r2
        L_0x0506:
            boolean r29 = r8.m18487n(r1)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.if r2 = r8.f16185K     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.gf r5 = r8.f16199o     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r2.mo7322d(r1, r5, r10)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r2 = new com.google.android.gms.internal.ads.re     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.cf[] r5 = r8.f16190f     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.df[] r6 = r8.f16191g     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.ol r7 = r8.f16192h     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.qr0 r13 = r8.f16189O     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.kk r14 = r8.f16204t     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.gf r15 = r8.f16199o     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            java.lang.Object r15 = r15.f7411b     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r32 = 0
            r18 = r2
            r19 = r5
            r20 = r6
            r23 = r7
            r24 = r13
            r25 = r14
            r26 = r15
            r28 = r1
            r30 = r3
            r18.<init>(r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r32)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r1 = r8.f16182H     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r1 == 0) goto L_0x053e
            r1.f13608l = r2     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x053e:
            r8.f16182H = r2     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.ik r1 = r2.f13597a     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r1.mo6986u(r8, r3)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.m18480g(r10)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x054a
        L_0x0549:
            r11 = r5
        L_0x054a:
            com.google.android.gms.internal.ads.re r1 = r8.f16182H     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r1 == 0) goto L_0x0561
            boolean r1 = r1.mo10512d()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r1 == 0) goto L_0x0555
            goto L_0x0561
        L_0x0555:
            com.google.android.gms.internal.ads.re r1 = r8.f16182H     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r1 == 0) goto L_0x0564
            boolean r1 = r8.f16209y     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r1 != 0) goto L_0x0564
            r33.m18474J()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x0564
        L_0x0561:
            r8.m18480g(r9)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x0564:
            com.google.android.gms.internal.ads.re r1 = r8.f16184J     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r1 == 0) goto L_0x066d
        L_0x0568:
            com.google.android.gms.internal.ads.re r1 = r8.f16184J     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r2 = r8.f16183I     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r1 == r2) goto L_0x059f
            long r3 = r8.f16181G     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r5 = r1.f13608l     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r5 = r5.f13602f     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x059f
            r1.mo10511c()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r1 = r8.f16184J     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r1 = r1.f13608l     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.m18481h(r1)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.se r1 = new com.google.android.gms.internal.ads.se     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r2 = r8.f16184J     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r3 = r2.f13603g     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r4 = r2.f13604h     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r1.<init>(r3, r4)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16200p = r1     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r33.m18486m()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            android.os.Handler r1 = r8.f16196l     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r2 = 5
            com.google.android.gms.internal.ads.se r3 = r8.f16200p     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            android.os.Message r1 = r1.obtainMessage(r2, r3)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r1.sendToTarget()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x0568
        L_0x059f:
            boolean r1 = r2.f13605i     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r1 == 0) goto L_0x05c5
            r1 = r9
        L_0x05a4:
            r2 = 2
            if (r1 >= r2) goto L_0x066d
            com.google.android.gms.internal.ads.cf[] r2 = r8.f16190f     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r2 = r2[r1]     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r3 = r8.f16183I     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.uk[] r3 = r3.f13600d     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r3 = r3[r1]     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r3 == 0) goto L_0x05c2
            com.google.android.gms.internal.ads.uk r4 = r2.mo6183f()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r4 != r3) goto L_0x05c2
            boolean r3 = r2.mo6171F()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r3 == 0) goto L_0x05c2
            r2.mo6187x()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
        L_0x05c2:
            int r1 = r1 + 1
            goto L_0x05a4
        L_0x05c5:
            r1 = r9
        L_0x05c6:
            r2 = 2
            if (r1 >= r2) goto L_0x05e4
            com.google.android.gms.internal.ads.cf[] r2 = r8.f16190f     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r2 = r2[r1]     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r3 = r8.f16183I     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.uk[] r3 = r3.f13600d     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r3 = r3[r1]     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.uk r4 = r2.mo6183f()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r4 != r3) goto L_0x066d
            if (r3 == 0) goto L_0x05e1
            boolean r2 = r2.mo6171F()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r2 == 0) goto L_0x066d
        L_0x05e1:
            int r1 = r1 + 1
            goto L_0x05c6
        L_0x05e4:
            com.google.android.gms.internal.ads.re r1 = r8.f16183I     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r2 = r1.f13608l     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r2 == 0) goto L_0x066d
            boolean r3 = r2.f13606j     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r3 == 0) goto L_0x066d
            com.google.android.gms.internal.ads.pl r1 = r1.f13609m     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r8.f16183I = r2     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.pl r3 = r2.f13609m     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.ik r2 = r2.f13597a     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r4 = r2.mo6977f()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r2 = r9
            r6 = 2
        L_0x05fc:
            if (r2 >= r6) goto L_0x066d
            com.google.android.gms.internal.ads.cf[] r6 = r8.f16190f     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r6 = r6[r2]     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.ml r7 = r1.f12693b     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.el r7 = r7.mo9274a(r2)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r7 != 0) goto L_0x060f
        L_0x060a:
            r19 = r3
            r20 = r4
            goto L_0x0663
        L_0x060f:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x061c
            r6.mo6187x()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            goto L_0x060a
        L_0x061c:
            boolean r7 = r6.mo6172G()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r7 != 0) goto L_0x060a
            com.google.android.gms.internal.ads.ml r7 = r3.f12693b     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.el r7 = r7.mo9274a(r2)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.ef[] r13 = r1.f12695d     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r13 = r13[r2]     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.ef[] r14 = r3.f12695d     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r14 = r14[r2]     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r7 == 0) goto L_0x065c
            boolean r13 = r14.equals(r13)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            if (r13 == 0) goto L_0x065c
            r7.mo6991b()     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.xe[] r13 = new com.google.android.gms.internal.ads.C2367xe[r10]     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r14 = r9
        L_0x063e:
            if (r14 > 0) goto L_0x0649
            com.google.android.gms.internal.ads.xe r15 = r7.mo6992c(r14)     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r13[r14] = r15     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            int r14 = r14 + 1
            goto L_0x063e
        L_0x0649:
            com.google.android.gms.internal.ads.re r7 = r8.f16183I     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.uk[] r14 = r7.f13600d     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            r14 = r14[r2]     // Catch:{ ie -> 0x0808, IOException -> 0x0803, RuntimeException -> 0x0882 }
            long r9 = r7.f13602f     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r19 = r3
            r20 = r4
            long r3 = r7.f13604h     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            long r9 = r9 - r3
            r6.mo6177X(r13, r14, r9)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            goto L_0x0663
        L_0x065c:
            r19 = r3
            r20 = r4
            r6.mo6187x()     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
        L_0x0663:
            int r2 = r2 + 1
            r3 = r19
            r4 = r20
            r6 = 2
            r9 = 0
            r10 = 1
            goto L_0x05fc
        L_0x066d:
            com.google.android.gms.internal.ads.re r1 = r8.f16184J     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r2 = 10
            if (r1 != 0) goto L_0x067c
            r33.m18475K()     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r8.m18479f(r11, r2)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
        L_0x0679:
            r1 = 1
            goto L_0x0802
        L_0x067c:
            java.lang.String r1 = "doSomeWork"
            com.google.android.gms.internal.ads.C2338wm.m19040a(r1)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r33.m18486m()     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r1 = r8.f16184J     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.ik r1 = r1.f13597a     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.se r4 = r8.f16200p     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            long r4 = r4.f14415c     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r1.mo6983r(r4)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.cf[] r1 = r8.f16205u     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            int r4 = r1.length     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r5 = 1
            r6 = 1
            r7 = 0
        L_0x0695:
            if (r7 >= r4) goto L_0x06cc
            r9 = r1[r7]     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            long r13 = r8.f16181G     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            long r2 = r8.f16178D     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r9.mo6176W(r13, r2)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            if (r6 == 0) goto L_0x06aa
            boolean r2 = r9.mo6173L()     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            if (r2 == 0) goto L_0x06aa
            r6 = 1
            goto L_0x06ab
        L_0x06aa:
            r6 = 0
        L_0x06ab:
            boolean r2 = r9.mo6169A()     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            if (r2 != 0) goto L_0x06ba
            boolean r2 = r9.mo6173L()     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            if (r2 == 0) goto L_0x06b8
            goto L_0x06ba
        L_0x06b8:
            r2 = 0
            goto L_0x06bb
        L_0x06ba:
            r2 = 1
        L_0x06bb:
            if (r2 != 0) goto L_0x06c0
            r9.mo6186o()     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
        L_0x06c0:
            if (r5 == 0) goto L_0x06c6
            if (r2 == 0) goto L_0x06c6
            r5 = 1
            goto L_0x06c7
        L_0x06c6:
            r5 = 0
        L_0x06c7:
            int r7 = r7 + 1
            r2 = 10
            goto L_0x0695
        L_0x06cc:
            if (r5 != 0) goto L_0x06d1
            r33.m18475K()     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
        L_0x06d1:
            com.google.android.gms.internal.ads.nm r1 = r8.f16203s     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            if (r1 == 0) goto L_0x06f4
            com.google.android.gms.internal.ads.bf r1 = r1.mo8664v()     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.bf r2 = r8.f16201q     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            boolean r2 = r1.equals(r2)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            if (r2 != 0) goto L_0x06f4
            r8.f16201q = r1     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.um r2 = r8.f16193i     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.nm r3 = r8.f16203s     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r2.mo11245d(r3)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            android.os.Handler r2 = r8.f16196l     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r3 = 7
            android.os.Message r1 = r2.obtainMessage(r3, r1)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r1.sendToTarget()     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
        L_0x06f4:
            com.google.android.gms.internal.ads.if r1 = r8.f16185K     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r2 = r8.f16184J     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            int r2 = r2.f13603g     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.gf r3 = r8.f16199o     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r4 = 0
            com.google.android.gms.internal.ads.gf r1 = r1.mo7322d(r2, r3, r4)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            long r1 = r1.f7412c     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            if (r6 == 0) goto L_0x0725
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0716
            com.google.android.gms.internal.ads.se r3 = r8.f16200p     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            long r3 = r3.f14415c     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x0725
        L_0x0716:
            com.google.android.gms.internal.ads.re r3 = r8.f16184J     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            boolean r3 = r3.f13605i     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            if (r3 == 0) goto L_0x0725
            r3 = 4
            r8.m18482i(r3)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
        L_0x0720:
            r33.m18485l()     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            goto L_0x07b5
        L_0x0725:
            int r3 = r8.f16210z     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r4 = 2
            if (r3 != r4) goto L_0x079c
            com.google.android.gms.internal.ads.cf[] r3 = r8.f16205u     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            int r3 = r3.length     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            if (r3 <= 0) goto L_0x078a
            if (r5 == 0) goto L_0x07b5
            boolean r1 = r8.f16208x     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r2 = r8.f16182H     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            boolean r3 = r2.f13606j     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            if (r3 != 0) goto L_0x073c
            long r2 = r2.f13604h     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            goto L_0x0742
        L_0x073c:
            com.google.android.gms.internal.ads.ik r2 = r2.f13597a     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            long r2 = r2.mo6976e()     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
        L_0x0742:
            r4 = -9223372036854775808
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x075c
            com.google.android.gms.internal.ads.re r2 = r8.f16182H     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            boolean r3 = r2.f13605i     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            if (r3 == 0) goto L_0x074f
            goto L_0x0790
        L_0x074f:
            com.google.android.gms.internal.ads.if r3 = r8.f16185K     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            int r2 = r2.f13603g     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.gf r4 = r8.f16199o     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r5 = 0
            com.google.android.gms.internal.ads.gf r2 = r3.mo7322d(r2, r4, r5)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            long r2 = r2.f7412c     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
        L_0x075c:
            boolean r4 = r8.f16186L     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            if (r4 == 0) goto L_0x0776
            com.google.android.gms.internal.ads.qr0 r2 = r8.f16189O     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.se r3 = r8.f16200p     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            long r3 = r3.f14416d     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r5 = r8.f16182H     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            long r6 = r8.f16181G     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            long r9 = r5.f13602f     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            long r13 = r5.f13604h     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            long r9 = r9 - r13
            long r6 = r6 - r9
            long r3 = r3 - r6
            boolean r1 = r2.mo10371k(r3, r1)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            goto L_0x0787
        L_0x0776:
            com.google.android.gms.internal.ads.qr0 r4 = r8.f16189O     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.re r5 = r8.f16182H     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            long r6 = r8.f16181G     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            long r9 = r5.f13602f     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            long r13 = r5.f13604h     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            long r9 = r9 - r13
            long r6 = r6 - r9
            long r2 = r2 - r6
            boolean r1 = r4.mo10371k(r2, r1)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
        L_0x0787:
            if (r1 == 0) goto L_0x07b5
            goto L_0x0790
        L_0x078a:
            boolean r1 = r8.m18488o(r1)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            if (r1 == 0) goto L_0x07b5
        L_0x0790:
            r1 = 3
            r8.m18482i(r1)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            boolean r1 = r8.f16207w     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            if (r1 == 0) goto L_0x07b5
            r33.m18483j()     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            goto L_0x07b5
        L_0x079c:
            r4 = 3
            if (r3 != r4) goto L_0x07b5
            com.google.android.gms.internal.ads.cf[] r3 = r8.f16205u     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            int r3 = r3.length     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            if (r3 <= 0) goto L_0x07a5
            goto L_0x07a9
        L_0x07a5:
            boolean r5 = r8.m18488o(r1)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
        L_0x07a9:
            if (r5 != 0) goto L_0x07b5
            boolean r1 = r8.f16207w     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r8.f16208x = r1     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r1 = 2
            r8.m18482i(r1)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            goto L_0x0720
        L_0x07b5:
            int r1 = r8.f16210z     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r2 = 2
            if (r1 != r2) goto L_0x07c8
            com.google.android.gms.internal.ads.cf[] r1 = r8.f16205u     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            int r2 = r1.length     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r9 = 0
        L_0x07be:
            if (r9 >= r2) goto L_0x07c8
            r3 = r1[r9]     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r3.mo6186o()     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            int r9 = r9 + 1
            goto L_0x07be
        L_0x07c8:
            boolean r1 = r8.f16207w     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            if (r1 == 0) goto L_0x07d1
            int r1 = r8.f16210z     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r2 = 3
            if (r1 == r2) goto L_0x07d6
        L_0x07d1:
            int r1 = r8.f16210z     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r2 = 2
            if (r1 != r2) goto L_0x07e4
        L_0x07d6:
            int r1 = r8.f16187M     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            if (r1 <= 0) goto L_0x07de
            int r1 = r8.f16187M     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            long r2 = (long) r1     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            goto L_0x07e0
        L_0x07de:
            r2 = 10
        L_0x07e0:
            r8.m18479f(r11, r2)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            goto L_0x07fd
        L_0x07e4:
            com.google.android.gms.internal.ads.cf[] r1 = r8.f16205u     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            int r1 = r1.length     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            if (r1 == 0) goto L_0x07f7
            int r1 = r8.f16188N     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            if (r1 <= 0) goto L_0x07f1
            int r1 = r8.f16188N     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            long r1 = (long) r1     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            goto L_0x07f3
        L_0x07f1:
            r1 = r16
        L_0x07f3:
            r8.m18479f(r11, r1)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            goto L_0x07fd
        L_0x07f7:
            android.os.Handler r1 = r8.f16194j     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r2 = 2
            r1.removeMessages(r2)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
        L_0x07fd:
            com.google.android.gms.internal.ads.C2338wm.m19041b()     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            goto L_0x0679
        L_0x0802:
            return r1
        L_0x0803:
            r0 = move-exception
            r2 = r0
            r1 = r10
            goto L_0x0879
        L_0x0808:
            r0 = move-exception
            r2 = r0
            r1 = r10
            goto L_0x087f
        L_0x080d:
            int r1 = r1.arg1     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            if (r1 == 0) goto L_0x0813
            r1 = 1
            goto L_0x0814
        L_0x0813:
            r1 = 0
        L_0x0814:
            r2 = 0
            r8.f16208x = r2     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r8.f16207w = r1     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            if (r1 != 0) goto L_0x0823
            r33.m18485l()     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r33.m18486m()     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
        L_0x0821:
            r1 = 1
            goto L_0x0838
        L_0x0823:
            int r1 = r8.f16210z     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r2 = 3
            if (r1 != r2) goto L_0x0832
            r33.m18483j()     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            android.os.Handler r1 = r8.f16194j     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r2 = 2
        L_0x082e:
            r1.sendEmptyMessage(r2)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            goto L_0x0821
        L_0x0832:
            r2 = 2
            if (r1 != r2) goto L_0x0821
            android.os.Handler r1 = r8.f16194j     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            goto L_0x082e
        L_0x0838:
            return r1
        L_0x0839:
            java.lang.Object r2 = r1.obj     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.kk r2 = (com.google.android.gms.internal.ads.C1891kk) r2     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            int r1 = r1.arg1     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            android.os.Handler r3 = r8.f16196l     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r4 = 0
            r3.sendEmptyMessage(r4)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r3 = 1
            r8.m18477M(r3)     // Catch:{ ie -> 0x0872, IOException -> 0x086e, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.qr0 r3 = r8.f16189O     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r3.mo10361a()     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            if (r1 == 0) goto L_0x085c
            com.google.android.gms.internal.ads.se r1 = new com.google.android.gms.internal.ads.se     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r4, r5)     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r8.f16200p = r1     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
        L_0x085c:
            r8.f16204t = r2     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            com.google.android.gms.internal.ads.me r1 = r8.f16197m     // Catch:{ ie -> 0x087c, IOException -> 0x0876, RuntimeException -> 0x0882 }
            r3 = 1
            r2.mo7645a(r1, r3, r8)     // Catch:{ ie -> 0x0872, IOException -> 0x086e, RuntimeException -> 0x0882 }
            r1 = 2
            r8.m18482i(r1)     // Catch:{ ie -> 0x0872, IOException -> 0x086e, RuntimeException -> 0x0882 }
            android.os.Handler r2 = r8.f16194j     // Catch:{ ie -> 0x0872, IOException -> 0x086e, RuntimeException -> 0x0882 }
            r2.sendEmptyMessage(r1)     // Catch:{ ie -> 0x0872, IOException -> 0x086e, RuntimeException -> 0x0882 }
            return r3
        L_0x086e:
            r0 = move-exception
            r2 = r0
            r1 = r3
            goto L_0x0879
        L_0x0872:
            r0 = move-exception
            r2 = r0
            r1 = r3
            goto L_0x087f
        L_0x0876:
            r0 = move-exception
            r2 = r0
            r1 = 1
        L_0x0879:
            r3 = 8
            goto L_0x08a4
        L_0x087c:
            r0 = move-exception
            r2 = r0
            r1 = 1
        L_0x087f:
            r3 = 8
            goto L_0x08c1
        L_0x0882:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Internal runtime error."
            android.util.Log.e(r2, r3, r1)
            android.os.Handler r2 = r8.f16196l
            com.google.android.gms.internal.ads.ie r1 = com.google.android.gms.internal.ads.C1811ie.m11006c(r1)
            r3 = 8
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r33.m18484k()
            r1 = 1
            return r1
        L_0x089f:
            r0 = move-exception
            r1 = r10
            r3 = 8
            r2 = r0
        L_0x08a4:
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r5 = "Source error."
            android.util.Log.e(r4, r5, r2)
            android.os.Handler r4 = r8.f16196l
            com.google.android.gms.internal.ads.ie r2 = com.google.android.gms.internal.ads.C1811ie.m11005b(r2)
            android.os.Message r2 = r4.obtainMessage(r3, r2)
            r2.sendToTarget()
            r33.m18484k()
            return r1
        L_0x08bc:
            r0 = move-exception
            r1 = r10
            r3 = 8
            r2 = r0
        L_0x08c1:
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r5 = "Renderer error."
            android.util.Log.e(r4, r5, r2)
            android.os.Handler r4 = r8.f16196l
            android.os.Message r2 = r4.obtainMessage(r3, r2)
            r2.sendToTarget()
            r33.m18484k()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2292ve.handleMessage(android.os.Message):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|23|20|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x001f, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo11456r(com.google.android.gms.internal.ads.C1922le... r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f16206v     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x000e
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r0 = "Ignoring messages sent after release."
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)
            return
        L_0x000e:
            int r0 = r3.f16176B     // Catch:{ all -> 0x0031 }
            int r1 = r0 + 1
            r3.f16176B = r1     // Catch:{ all -> 0x0031 }
            android.os.Handler r1 = r3.f16194j     // Catch:{ all -> 0x0031 }
            r2 = 11
            android.os.Message r4 = r1.obtainMessage(r2, r4)     // Catch:{ all -> 0x0031 }
            r4.sendToTarget()     // Catch:{ all -> 0x0031 }
        L_0x001f:
            int r4 = r3.f16177C     // Catch:{ all -> 0x0031 }
            if (r4 > r0) goto L_0x002f
            r3.wait()     // Catch:{ InterruptedException -> 0x0027 }
            goto L_0x001f
        L_0x0027:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0031 }
            r4.interrupt()     // Catch:{ all -> 0x0031 }
            goto L_0x001f
        L_0x002f:
            monitor-exit(r3)
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2292ve.mo11456r(com.google.android.gms.internal.ads.le[]):void");
    }

    /* renamed from: s */
    public final void mo11457s() {
        this.f16186L = true;
    }

    /* renamed from: t */
    public final void mo11458t(C1891kk kkVar, boolean z) {
        this.f16194j.obtainMessage(0, 1, 0, kkVar).sendToTarget();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|23|20|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo11459u() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f16206v     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            android.os.Handler r0 = r2.f16194j     // Catch:{ all -> 0x0024 }
            r1 = 6
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0024 }
        L_0x000d:
            boolean r0 = r2.f16206v     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x001d
            r2.wait()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x000d
        L_0x0015:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0024 }
            r0.interrupt()     // Catch:{ all -> 0x0024 }
            goto L_0x000d
        L_0x001d:
            android.os.HandlerThread r0 = r2.f16195k     // Catch:{ all -> 0x0024 }
            r0.quit()     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2292ve.mo11459u():void");
    }

    /* renamed from: v */
    public final void mo11460v(C1812if ifVar, int i, long j) {
        this.f16194j.obtainMessage(3, new C2218te(ifVar, 0, j)).sendToTarget();
    }

    /* renamed from: w */
    public final void mo11461w(C1922le... leVarArr) {
        if (this.f16206v) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        this.f16176B++;
        this.f16194j.obtainMessage(11, leVarArr).sendToTarget();
    }

    /* renamed from: x */
    public final void mo11462x(int i) {
        this.f16188N = i;
    }

    /* renamed from: y */
    public final void mo11463y(int i) {
        this.f16187M = i;
    }

    /* renamed from: z */
    public final void mo11464z(boolean z) {
        this.f16194j.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }
}
