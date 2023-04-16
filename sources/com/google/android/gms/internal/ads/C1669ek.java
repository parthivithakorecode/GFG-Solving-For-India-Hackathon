package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ek */
final class C1669ek implements C1817ik, C1628dh, C1633dm, C2187sk {

    /* renamed from: A */
    private C1521al f6229A;

    /* renamed from: B */
    private long f6230B;

    /* renamed from: C */
    private boolean[] f6231C;

    /* renamed from: D */
    private boolean[] f6232D;

    /* renamed from: E */
    private boolean f6233E;

    /* renamed from: F */
    private long f6234F;

    /* renamed from: G */
    private long f6235G;

    /* renamed from: H */
    private long f6236H;

    /* renamed from: I */
    private int f6237I;

    /* renamed from: J */
    private boolean f6238J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f6239K;

    /* renamed from: L */
    private final C2337wl f6240L;

    /* renamed from: f */
    private final Uri f6241f;

    /* renamed from: g */
    private final C2225tl f6242g;

    /* renamed from: h */
    private final int f6243h;

    /* renamed from: i */
    private final Handler f6244i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C1706fk f6245j;

    /* renamed from: k */
    private final C1854jk f6246k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final long f6247l;

    /* renamed from: m */
    private final C1782hm f6248m = new C1782hm("Loader:ExtractorMediaPeriod");

    /* renamed from: n */
    private final C1594ck f6249n;

    /* renamed from: o */
    private final C1930lm f6250o;

    /* renamed from: p */
    private final Runnable f6251p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final Runnable f6252q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Handler f6253r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final SparseArray<C2224tk> f6254s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C1780hk f6255t;

    /* renamed from: u */
    private C1851jh f6256u;

    /* renamed from: v */
    private boolean f6257v;

    /* renamed from: w */
    private boolean f6258w;

    /* renamed from: x */
    private boolean f6259x;

    /* renamed from: y */
    private boolean f6260y;

    /* renamed from: z */
    private int f6261z;

    public C1669ek(Uri uri, C2225tl tlVar, C1591ch[] chVarArr, int i, Handler handler, C1706fk fkVar, C1854jk jkVar, C2337wl wlVar, String str, int i2, byte[] bArr) {
        this.f6241f = uri;
        this.f6242g = tlVar;
        this.f6243h = i;
        this.f6244i = handler;
        this.f6245j = fkVar;
        this.f6246k = jkVar;
        this.f6240L = wlVar;
        this.f6247l = (long) i2;
        this.f6249n = new C1594ck(chVarArr, this);
        this.f6250o = new C1930lm();
        this.f6251p = new C2372xj(this);
        this.f6252q = new C2409yj(this);
        this.f6253r = new Handler();
        this.f6236H = -9223372036854775807L;
        this.f6254s = new SparseArray<>();
        this.f6234F = -1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r4v0 ?, r4v3 ?, r4v5 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: D */
    static /* bridge */ /* synthetic */ void m8584D(com.google.android.gms.internal.ads.C1669ek r8) {
        /*
            boolean r0 = r8.f6239K
            if (r0 != 0) goto L_0x009c
            boolean r0 = r8.f6258w
            if (r0 != 0) goto L_0x009c
            com.google.android.gms.internal.ads.jh r0 = r8.f6256u
            if (r0 == 0) goto L_0x009c
            boolean r0 = r8.f6257v
            if (r0 != 0) goto L_0x0012
            goto L_0x009c
        L_0x0012:
            android.util.SparseArray<com.google.android.gms.internal.ads.tk> r0 = r8.f6254s
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L_0x001a:
            if (r2 >= r0) goto L_0x002d
            android.util.SparseArray<com.google.android.gms.internal.ads.tk> r3 = r8.f6254s
            java.lang.Object r3 = r3.valueAt(r2)
            com.google.android.gms.internal.ads.tk r3 = (com.google.android.gms.internal.ads.C2224tk) r3
            com.google.android.gms.internal.ads.xe r3 = r3.mo11003h()
            if (r3 == 0) goto L_0x009c
            int r2 = r2 + 1
            goto L_0x001a
        L_0x002d:
            com.google.android.gms.internal.ads.lm r2 = r8.f6250o
            r2.mo8974b()
            com.google.android.gms.internal.ads.zk[] r2 = new com.google.android.gms.internal.ads.C2447zk[r0]
            boolean[] r3 = new boolean[r0]
            r8.f6232D = r3
            boolean[] r3 = new boolean[r0]
            r8.f6231C = r3
            com.google.android.gms.internal.ads.jh r3 = r8.f6256u
            long r3 = r3.zza()
            r8.f6230B = r3
            r3 = r1
        L_0x0045:
            r4 = 1
            if (r3 >= r0) goto L_0x007b
            android.util.SparseArray<com.google.android.gms.internal.ads.tk> r5 = r8.f6254s
            java.lang.Object r5 = r5.valueAt(r3)
            com.google.android.gms.internal.ads.tk r5 = (com.google.android.gms.internal.ads.C2224tk) r5
            com.google.android.gms.internal.ads.xe r5 = r5.mo11003h()
            com.google.android.gms.internal.ads.zk r6 = new com.google.android.gms.internal.ads.zk
            com.google.android.gms.internal.ads.xe[] r7 = new com.google.android.gms.internal.ads.C2367xe[r4]
            r7[r1] = r5
            r6.<init>(r7)
            r2[r3] = r6
            java.lang.String r5 = r5.f17163k
            boolean r6 = com.google.android.gms.internal.ads.C2041om.m14520b(r5)
            if (r6 != 0) goto L_0x006f
            boolean r5 = com.google.android.gms.internal.ads.C2041om.m14519a(r5)
            if (r5 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r4 = r1
        L_0x006f:
            boolean[] r5 = r8.f6232D
            r5[r3] = r4
            boolean r5 = r8.f6233E
            r4 = r4 | r5
            r8.f6233E = r4
            int r3 = r3 + 1
            goto L_0x0045
        L_0x007b:
            com.google.android.gms.internal.ads.al r0 = new com.google.android.gms.internal.ads.al
            r0.<init>(r2)
            r8.f6229A = r0
            r8.f6258w = r4
            com.google.android.gms.internal.ads.jk r0 = r8.f6246k
            com.google.android.gms.internal.ads.yk r1 = new com.google.android.gms.internal.ads.yk
            long r2 = r8.f6230B
            com.google.android.gms.internal.ads.jh r4 = r8.f6256u
            boolean r4 = r4.mo5289c()
            r1.<init>(r2, r4)
            r2 = 0
            r0.mo7647c(r1, r2)
            com.google.android.gms.internal.ads.hk r0 = r8.f6255t
            r0.mo7950a(r8)
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1669ek.m8584D(com.google.android.gms.internal.ads.ek):void");
    }

    /* renamed from: k */
    private final int m8586k() {
        int size = this.f6254s.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f6254s.valueAt(i2).mo11000e();
        }
        return i;
    }

    /* renamed from: l */
    private final long m8587l() {
        int size = this.f6254s.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, this.f6254s.valueAt(i).mo11002g());
        }
        return j;
    }

    /* renamed from: n */
    private final void m8588n(C1557bk bkVar) {
        if (this.f6234F == -1) {
            this.f6234F = bkVar.f4969i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        r0 = r11.f6256u;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m8589o() {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.bk r6 = new com.google.android.gms.internal.ads.bk
            android.net.Uri r2 = r11.f6241f
            com.google.android.gms.internal.ads.tl r3 = r11.f6242g
            com.google.android.gms.internal.ads.ck r4 = r11.f6249n
            com.google.android.gms.internal.ads.lm r5 = r11.f6250o
            r0 = r6
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            boolean r0 = r11.f6258w
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x0041
            boolean r0 = r11.m8590v()
            com.google.android.gms.internal.ads.C1856jm.m11730e(r0)
            long r3 = r11.f6230B
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0032
            long r7 = r11.f6236H
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            r0 = 1
            r11.f6238J = r0
            r11.f6236H = r1
            return
        L_0x0032:
            com.google.android.gms.internal.ads.jh r0 = r11.f6256u
            long r3 = r11.f6236H
            long r3 = r0.mo5288a(r3)
            long r7 = r11.f6236H
            r6.mo5873e(r3, r7)
            r11.f6236H = r1
        L_0x0041:
            int r0 = r11.m8586k()
            r11.f6237I = r0
            int r0 = r11.f6243h
            r3 = -1
            r4 = 6
            r5 = 3
            if (r0 != r3) goto L_0x006a
            boolean r0 = r11.f6258w
            if (r0 == 0) goto L_0x0069
            long r7 = r11.f6234F
            r9 = -1
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
            com.google.android.gms.internal.ads.jh r0 = r11.f6256u
            if (r0 == 0) goto L_0x0067
            long r7 = r0.zza()
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r0 = r4
            goto L_0x006a
        L_0x0069:
            r0 = r5
        L_0x006a:
            com.google.android.gms.internal.ads.hm r1 = r11.f6248m
            r1.mo7958a(r6, r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1669ek.m8589o():void");
    }

    /* renamed from: v */
    private final boolean m8590v() {
        return this.f6236H != -9223372036854775807L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo6973E() {
        this.f6248m.mo7960g(Integer.MIN_VALUE);
    }

    /* renamed from: F */
    public final void mo6974F() {
        this.f6248m.mo7961h(new C2446zj(this, this.f6249n));
        this.f6253r.removeCallbacksAndMessages((Object) null);
        this.f6239K = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final void mo6975G(int i, long j) {
        C2224tk valueAt = this.f6254s.valueAt(i);
        if (!this.f6238J || j <= valueAt.mo11002g()) {
            valueAt.mo11009n(j, true);
        } else {
            valueAt.mo11007l();
        }
    }

    /* renamed from: a */
    public final void mo6474a() {
        this.f6257v = true;
        this.f6253r.post(this.f6251p);
    }

    /* renamed from: b */
    public final void mo6475b(C1851jh jhVar) {
        this.f6256u = jhVar;
        this.f6253r.post(this.f6251p);
    }

    /* renamed from: c */
    public final C1925lh mo6476c(int i, int i2) {
        C2224tk tkVar = this.f6254s.get(i);
        if (tkVar != null) {
            return tkVar;
        }
        C2224tk tkVar2 = new C2224tk(this.f6240L, (byte[]) null);
        tkVar2.mo11006k(this);
        this.f6254s.put(i, tkVar2);
        return tkVar2;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo6502d(C1708fm fmVar, long j, long j2) {
        m8588n((C1557bk) fmVar);
        this.f6238J = true;
        if (this.f6230B == -9223372036854775807L) {
            long l = m8587l();
            long j3 = l == Long.MIN_VALUE ? 0 : l + 10000;
            this.f6230B = j3;
            this.f6246k.mo7647c(new C2410yk(j3, this.f6256u.mo5289c()), (Object) null);
        }
        this.f6255t.mo8967b(this);
    }

    /* renamed from: e */
    public final long mo6976e() {
        long j;
        if (this.f6238J) {
            return Long.MIN_VALUE;
        }
        if (m8590v()) {
            return this.f6236H;
        }
        if (this.f6233E) {
            int size = this.f6254s.size();
            j = Long.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                if (this.f6232D[i]) {
                    j = Math.min(j, this.f6254s.valueAt(i).mo11002g());
                }
            }
        } else {
            j = m8587l();
        }
        return j == Long.MIN_VALUE ? this.f6235G : j;
    }

    /* renamed from: f */
    public final long mo6977f() {
        if (!this.f6260y) {
            return -9223372036854775807L;
        }
        this.f6260y = false;
        return this.f6235G;
    }

    /* renamed from: g */
    public final void mo6978g(C2367xe xeVar) {
        this.f6253r.post(this.f6251p);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo6503h(C1708fm fmVar, long j, long j2, boolean z) {
        m8588n((C1557bk) fmVar);
        if (!z && this.f6261z > 0) {
            int size = this.f6254s.size();
            for (int i = 0; i < size; i++) {
                this.f6254s.valueAt(i).mo11005j(this.f6231C[i]);
            }
            this.f6255t.mo8967b(this);
        }
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ int mo6504i(C1708fm fmVar, long j, long j2, IOException iOException) {
        C1851jh jhVar;
        C1557bk bkVar = (C1557bk) fmVar;
        m8588n(bkVar);
        Handler handler = this.f6244i;
        if (handler != null) {
            handler.post(new C1520ak(this, iOException));
        }
        if (iOException instanceof C1558bl) {
            return 3;
        }
        int k = m8586k();
        int i = this.f6237I;
        if (this.f6234F == -1 && ((jhVar = this.f6256u) == null || jhVar.zza() == -9223372036854775807L)) {
            this.f6235G = 0;
            this.f6260y = this.f6258w;
            int size = this.f6254s.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f6254s.valueAt(i2).mo11005j(!this.f6258w || this.f6231C[i2]);
            }
            bkVar.mo5873e(0, 0);
        }
        this.f6237I = m8586k();
        return k <= i ? 0 : 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo6979j(int i) {
        return this.f6238J || (!m8590v() && this.f6254s.valueAt(i).mo11008m());
    }

    /* renamed from: m */
    public final C1521al mo6980m() {
        return this.f6229A;
    }

    /* renamed from: p */
    public final void mo6981p() {
        this.f6248m.mo7960g(Integer.MIN_VALUE);
    }

    /* renamed from: q */
    public final boolean mo6982q(long j) {
        if (this.f6238J) {
            return false;
        }
        if (this.f6258w && this.f6261z == 0) {
            return false;
        }
        boolean c = this.f6250o.mo8975c();
        if (this.f6248m.mo7962i()) {
            return c;
        }
        m8589o();
        return true;
    }

    /* renamed from: r */
    public final void mo6983r(long j) {
    }

    /* renamed from: s */
    public final long mo6984s(long j) {
        if (true != this.f6256u.mo5289c()) {
            j = 0;
        }
        this.f6235G = j;
        int size = this.f6254s.size();
        boolean v = true ^ m8590v();
        int i = 0;
        while (true) {
            if (v) {
                if (i >= size) {
                    break;
                }
                if (this.f6231C[i]) {
                    v = this.f6254s.valueAt(i).mo11009n(j, false);
                }
                i++;
            } else {
                this.f6236H = j;
                this.f6238J = false;
                if (this.f6248m.mo7962i()) {
                    this.f6248m.mo7959f();
                } else {
                    for (int i2 = 0; i2 < size; i2++) {
                        this.f6254s.valueAt(i2).mo11005j(this.f6231C[i2]);
                    }
                }
            }
        }
        this.f6260y = false;
        return j;
    }

    /* renamed from: t */
    public final long mo6985t(C1670el[] elVarArr, boolean[] zArr, C2261uk[] ukVarArr, boolean[] zArr2, long j) {
        C1670el elVar;
        C1856jm.m11730e(this.f6258w);
        for (int i = 0; i < elVarArr.length; i++) {
            C1631dk dkVar = ukVarArr[i];
            if (dkVar != null && (elVarArr[i] == null || !zArr[i])) {
                int e = dkVar.f5826a;
                C1856jm.m11730e(this.f6231C[e]);
                this.f6261z--;
                this.f6231C[e] = false;
                this.f6254s.valueAt(e).mo11004i();
                ukVarArr[i] = null;
            }
        }
        boolean z = false;
        for (int i2 = 0; i2 < elVarArr.length; i2++) {
            if (ukVarArr[i2] == null && (elVar = elVarArr[i2]) != null) {
                elVar.mo6991b();
                C1856jm.m11730e(elVar.mo6990a(0) == 0);
                int a = this.f6229A.mo5308a(elVar.mo6993d());
                C1856jm.m11730e(!this.f6231C[a]);
                this.f6261z++;
                this.f6231C[a] = true;
                ukVarArr[i2] = new C1631dk(this, a);
                zArr2[i2] = true;
                z = true;
            }
        }
        if (!this.f6259x) {
            int size = this.f6254s.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (!this.f6231C[i3]) {
                    this.f6254s.valueAt(i3).mo11004i();
                }
            }
        }
        if (this.f6261z == 0) {
            this.f6260y = false;
            if (this.f6248m.mo7962i()) {
                this.f6248m.mo7959f();
            }
        } else if (!this.f6259x ? j != 0 : z) {
            j = mo6984s(j);
            for (int i4 = 0; i4 < ukVarArr.length; i4++) {
                if (ukVarArr[i4] != null) {
                    zArr2[i4] = true;
                }
            }
        }
        this.f6259x = true;
        return j;
    }

    /* renamed from: u */
    public final void mo6986u(C1780hk hkVar, long j) {
        this.f6255t = hkVar;
        this.f6250o.mo8975c();
        m8589o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final int mo6987w(int i, C2404ye yeVar, C2257ug ugVar, boolean z) {
        if (this.f6260y || m8590v()) {
            return -3;
        }
        return this.f6254s.valueAt(i).mo11001f(yeVar, ugVar, z, this.f6238J, this.f6235G);
    }

    public final long zza() {
        if (this.f6261z == 0) {
            return Long.MIN_VALUE;
        }
        return mo6976e();
    }
}
