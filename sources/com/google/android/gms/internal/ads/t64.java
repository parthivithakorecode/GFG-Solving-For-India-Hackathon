package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

final class t64 implements r54, rc4, r94, x94, g74 {
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public static final Map<String, String> f14732Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public static final C1574c0 f14733R;

    /* renamed from: A */
    private pd4 f14734A;

    /* renamed from: B */
    private long f14735B;

    /* renamed from: C */
    private boolean f14736C;

    /* renamed from: D */
    private int f14737D;

    /* renamed from: E */
    private boolean f14738E;

    /* renamed from: F */
    private boolean f14739F;

    /* renamed from: G */
    private int f14740G;

    /* renamed from: H */
    private long f14741H;

    /* renamed from: I */
    private long f14742I;

    /* renamed from: J */
    private long f14743J;

    /* renamed from: K */
    private boolean f14744K;

    /* renamed from: L */
    private int f14745L;

    /* renamed from: M */
    private boolean f14746M;

    /* renamed from: N */
    private boolean f14747N;

    /* renamed from: O */
    private final m94 f14748O;

    /* renamed from: P */
    private final g94 f14749P;

    /* renamed from: f */
    private final Uri f14750f;

    /* renamed from: g */
    private final he1 f14751g;

    /* renamed from: h */
    private final b34 f14752h;

    /* renamed from: i */
    private final c64 f14753i;

    /* renamed from: j */
    private final v24 f14754j;

    /* renamed from: k */
    private final p64 f14755k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final long f14756l;

    /* renamed from: m */
    private final aa4 f14757m = new aa4("ProgressiveMediaPeriod");

    /* renamed from: n */
    private final k64 f14758n;

    /* renamed from: o */
    private final ay1 f14759o;

    /* renamed from: p */
    private final Runnable f14760p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final Runnable f14761q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Handler f14762r;

    /* renamed from: s */
    private q54 f14763s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public ff4 f14764t;

    /* renamed from: u */
    private h74[] f14765u;

    /* renamed from: v */
    private r64[] f14766v;

    /* renamed from: w */
    private boolean f14767w;

    /* renamed from: x */
    private boolean f14768x;

    /* renamed from: y */
    private boolean f14769y;

    /* renamed from: z */
    private s64 f14770z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f14732Q = Collections.unmodifiableMap(hashMap);
        bf4 bf4 = new bf4();
        bf4.mo5830h("icy");
        bf4.mo5842s("application/x-icy");
        f14733R = bf4.mo5848y();
    }

    public t64(Uri uri, he1 he1, k64 k64, b34 b34, v24 v24, m94 m94, c64 c64, p64 p64, g94 g94, String str, int i, byte[] bArr) {
        this.f14750f = uri;
        this.f14751g = he1;
        this.f14752h = b34;
        this.f14754j = v24;
        this.f14748O = m94;
        this.f14753i = c64;
        this.f14755k = p64;
        this.f14749P = g94;
        this.f14756l = (long) i;
        this.f14758n = k64;
        this.f14759o = new ay1(xv1.f17360a);
        this.f14760p = new m64(this);
        this.f14761q = new l64(this);
        this.f14762r = n13.m13633f0((Handler.Callback) null);
        this.f14766v = new r64[0];
        this.f14765u = new h74[0];
        this.f14743J = -9223372036854775807L;
        this.f14741H = -1;
        this.f14735B = -9223372036854775807L;
        this.f14737D = 1;
    }

    /* renamed from: B */
    private final int m17125B() {
        int i = 0;
        for (h74 u : this.f14765u) {
            i += u.mo7880u();
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final long m17126C() {
        long j = Long.MIN_VALUE;
        for (h74 w : this.f14765u) {
            j = Math.max(j, w.mo7882w());
        }
        return j;
    }

    /* renamed from: D */
    private final td4 m17127D(r64 r64) {
        int length = this.f14765u.length;
        for (int i = 0; i < length; i++) {
            if (r64.equals(this.f14766v[i])) {
                return this.f14765u[i];
            }
        }
        g94 g94 = this.f14749P;
        Looper looper = this.f14762r.getLooper();
        b34 b34 = this.f14752h;
        v24 v24 = this.f14754j;
        Objects.requireNonNull(looper);
        Objects.requireNonNull(b34);
        h74 h74 = new h74(g94, looper, b34, v24, (byte[]) null);
        h74.mo7867G(this);
        int i2 = length + 1;
        r64[] r64Arr = (r64[]) Arrays.copyOf(this.f14766v, i2);
        r64Arr[length] = r64;
        this.f14766v = (r64[]) n13.m13652y(r64Arr);
        h74[] h74Arr = (h74[]) Arrays.copyOf(this.f14765u, i2);
        h74Arr[length] = h74;
        this.f14765u = (h74[]) n13.m13652y(h74Arr);
        return h74;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    /* renamed from: E */
    private final void m17128E() {
        wu1.m19207f(this.f14768x);
        Objects.requireNonNull(this.f14770z);
        Objects.requireNonNull(this.f14734A);
    }

    /* renamed from: F */
    private final void m17129F(o64 o64) {
        if (this.f14741H == -1) {
            this.f14741H = o64.f11928l;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public final void m17130H() {
        if (!this.f14747N && !this.f14768x && this.f14767w && this.f14734A != null) {
            h74[] h74Arr = this.f14765u;
            int length = h74Arr.length;
            int i = 0;
            while (i < length) {
                if (h74Arr[i].mo7883x() != null) {
                    i++;
                } else {
                    return;
                }
            }
            this.f14759o.mo5565c();
            int length2 = this.f14765u.length;
            gk0[] gk0Arr = new gk0[length2];
            boolean[] zArr = new boolean[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                C1574c0 x = this.f14765u[i2].mo7883x();
                Objects.requireNonNull(x);
                String str = x.f5234l;
                boolean g = C1645dy.m8170g(str);
                boolean z = g || C1645dy.m8171h(str);
                zArr[i2] = z;
                this.f14769y = z | this.f14769y;
                ff4 ff4 = this.f14764t;
                if (ff4 != null) {
                    if (g || this.f14766v[i2].f13527b) {
                        c91 c91 = x.f5232j;
                        c91 c912 = c91 == null ? new c91(ff4) : c91.mo6088d(ff4);
                        bf4 b = x.mo6004b();
                        b.mo5836m(c912);
                        x = b.mo5848y();
                    }
                    if (g && x.f5228f == -1 && x.f5229g == -1 && ff4.f6813f != -1) {
                        bf4 b2 = x.mo6004b();
                        b2.mo5823d0(ff4.f6813f);
                        x = b2.mo5848y();
                    }
                }
                gk0Arr[i2] = new gk0(x.mo6005c(this.f14752h.mo5663a(x)));
            }
            this.f14770z = new s64(new hm0(gk0Arr), zArr);
            this.f14768x = true;
            q54 q54 = this.f14763s;
            Objects.requireNonNull(q54);
            q54.mo5559h(this);
        }
    }

    /* renamed from: I */
    private final void m17131I(int i) {
        m17128E();
        s64 s64 = this.f14770z;
        boolean[] zArr = s64.f14283d;
        if (!zArr[i]) {
            C1574c0 b = s64.f14280a.mo7964b(i).mo7652b(0);
            this.f14753i.mo6067d(C1645dy.m8164a(b.f5234l), b, 0, (Object) null, this.f14742I);
            zArr[i] = true;
        }
    }

    /* renamed from: J */
    private final void m17132J(int i) {
        m17128E();
        boolean[] zArr = this.f14770z.f14281b;
        if (this.f14744K && zArr[i] && !this.f14765u[i].mo7870J(false)) {
            this.f14743J = 0;
            this.f14744K = false;
            this.f14739F = true;
            this.f14742I = 0;
            this.f14745L = 0;
            for (h74 E : this.f14765u) {
                E.mo7865E(false);
            }
            q54 q54 = this.f14763s;
            Objects.requireNonNull(q54);
            q54.mo5562k(this);
        }
    }

    /* renamed from: K */
    private final void m17133K() {
        o64 o64 = new o64(this, this.f14750f, this.f14751g, this.f14758n, this, this.f14759o);
        if (this.f14768x) {
            wu1.m19207f(m17134L());
            long j = this.f14735B;
            if (j == -9223372036854775807L || this.f14743J <= j) {
                pd4 pd4 = this.f14734A;
                Objects.requireNonNull(pd4);
                o64.m14336i(o64, pd4.mo5811d(this.f14743J).f11427a.f13142b, this.f14743J);
                for (h74 F : this.f14765u) {
                    F.mo7866F(this.f14743J);
                }
                this.f14743J = -9223372036854775807L;
            } else {
                this.f14746M = true;
                this.f14743J = -9223372036854775807L;
                return;
            }
        }
        this.f14745L = m17125B();
        long a = this.f14757m.mo5204a(o64, this, m94.m13098a(this.f14737D));
        li1 e = o64.f11927k;
        this.f14753i.mo6075l(new k54(o64.f11917a, e, e.f10058a, Collections.emptyMap(), a, 0, 0), 1, -1, (C1574c0) null, 0, (Object) null, o64.f11926j, this.f14735B);
    }

    /* renamed from: L */
    private final boolean m17134L() {
        return this.f14743J != -9223372036854775807L;
    }

    /* renamed from: M */
    private final boolean m17135M() {
        return this.f14739F || m17134L();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final boolean mo10946A(int i) {
        return !m17135M() && this.f14765u[i].mo7870J(this.f14746M);
    }

    /* renamed from: G */
    public final void mo10268G() {
        this.f14767w = true;
        this.f14762r.post(this.f14760p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final int mo10947N(int i, cx3 cx3, z51 z51, int i2) {
        if (m17135M()) {
            return -3;
        }
        m17131I(i);
        int v = this.f14765u[i].mo7881v(cx3, z51, i2, this.f14746M);
        if (v == -3) {
            m17132J(i);
        }
        return v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final int mo10948O(int i, long j) {
        if (m17135M()) {
            return 0;
        }
        m17131I(i);
        h74 h74 = this.f14765u[i];
        int t = h74.mo7879t(j, this.f14746M);
        h74.mo7868H(t);
        if (t != 0) {
            return t;
        }
        m17132J(i);
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final td4 mo10949T() {
        return m17127D(new r64(0, true));
    }

    /* renamed from: a */
    public final long mo6836a() {
        long j;
        m17128E();
        boolean[] zArr = this.f14770z.f14281b;
        if (this.f14746M) {
            return Long.MIN_VALUE;
        }
        if (m17134L()) {
            return this.f14743J;
        }
        if (this.f14769y) {
            int length = this.f14765u.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.f14765u[i].mo7869I()) {
                    j = Math.min(j, this.f14765u[i].mo7882w());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = m17126C();
        }
        return j == Long.MIN_VALUE ? this.f14742I : j;
    }

    /* renamed from: b */
    public final long mo7243b(long j) {
        m17128E();
        boolean[] zArr = this.f14770z.f14281b;
        if (true != this.f14734A.mo5812f()) {
            j = 0;
        }
        this.f14739F = false;
        this.f14742I = j;
        if (m17134L()) {
            this.f14743J = j;
            return j;
        }
        if (this.f14737D != 7) {
            int length = this.f14765u.length;
            int i = 0;
            while (i < length) {
                if (this.f14765u[i].mo7871K(j, false) || (!zArr[i] && this.f14769y)) {
                    i++;
                }
            }
            return j;
        }
        this.f14744K = false;
        this.f14743J = j;
        this.f14746M = false;
        if (this.f14757m.mo5210l()) {
            for (h74 z : this.f14765u) {
                z.mo7885z();
            }
            this.f14757m.mo5205g();
        } else {
            this.f14757m.mo5206h();
            for (h74 E : this.f14765u) {
                E.mo7865E(false);
            }
        }
        return j;
    }

    /* renamed from: c */
    public final long mo6837c() {
        if (this.f14740G == 0) {
            return Long.MIN_VALUE;
        }
        return mo6836a();
    }

    /* renamed from: d */
    public final hm0 mo7244d() {
        m17128E();
        return this.f14770z.f14280a;
    }

    /* renamed from: e */
    public final boolean mo6838e(long j) {
        if (this.f14746M || this.f14757m.mo5209k() || this.f14744K) {
            return false;
        }
        if (this.f14768x && this.f14740G == 0) {
            return false;
        }
        boolean e = this.f14759o.mo5567e();
        if (this.f14757m.mo5210l()) {
            return e;
        }
        m17133K();
        return true;
    }

    /* renamed from: f */
    public final void mo6839f(long j) {
    }

    /* renamed from: g */
    public final long mo7245g() {
        if (!this.f14739F) {
            return -9223372036854775807L;
        }
        if (!this.f14746M && m17125B() <= this.f14745L) {
            return -9223372036854775807L;
        }
        this.f14739F = false;
        return this.f14742I;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo10497h(v94 v94, long j, long j2) {
        pd4 pd4;
        if (this.f14735B == -9223372036854775807L && (pd4 = this.f14734A) != null) {
            boolean f = pd4.mo5812f();
            long C = m17126C();
            long j3 = C == Long.MIN_VALUE ? 0 : C + 10000;
            this.f14735B = j3;
            this.f14755k.mo9985g(j3, f, this.f14736C);
        }
        o64 o64 = (o64) v94;
        ia4 g = o64.f11919c;
        k54 k54 = new k54(o64.f11917a, o64.f11927k, g.mo8122o(), g.mo8123p(), j, j2, g.mo8121c());
        long unused = o64.f11917a;
        this.f14753i.mo6071h(k54, 1, -1, (C1574c0) null, 0, (Object) null, o64.f11926j, this.f14735B);
        m17129F(o64);
        this.f14746M = true;
        q54 q54 = this.f14763s;
        Objects.requireNonNull(q54);
        q54.mo5562k(this);
    }

    /* renamed from: i */
    public final void mo7246i() {
        mo10953x();
        if (this.f14746M && !this.f14768x) {
            throw C1646dz.m8223a("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    /* renamed from: j */
    public final long mo7247j(w74[] w74Arr, boolean[] zArr, i74[] i74Arr, boolean[] zArr2, long j) {
        w74 w74;
        m17128E();
        s64 s64 = this.f14770z;
        hm0 hm0 = s64.f14280a;
        boolean[] zArr3 = s64.f14282c;
        int i = this.f14740G;
        int i2 = 0;
        for (int i3 = 0; i3 < w74Arr.length; i3++) {
            q64 q64 = i74Arr[i3];
            if (q64 != null && (w74Arr[i3] == null || !zArr[i3])) {
                int d = q64.f13078a;
                wu1.m19207f(zArr3[d]);
                this.f14740G--;
                zArr3[d] = false;
                i74Arr[i3] = null;
            }
        }
        boolean z = !this.f14738E ? j != 0 : i == 0;
        for (int i4 = 0; i4 < w74Arr.length; i4++) {
            if (i74Arr[i4] == null && (w74 = w74Arr[i4]) != null) {
                wu1.m19207f(w74.mo11594b() == 1);
                wu1.m19207f(w74.mo11593a(0) == 0);
                int a = hm0.mo7963a(w74.mo11596d());
                wu1.m19207f(!zArr3[a]);
                this.f14740G++;
                zArr3[a] = true;
                i74Arr[i4] = new q64(this, a);
                zArr2[i4] = true;
                if (!z) {
                    h74 h74 = this.f14765u[a];
                    z = !h74.mo7871K(j, true) && h74.mo7878s() != 0;
                }
            }
        }
        if (this.f14740G == 0) {
            this.f14744K = false;
            this.f14739F = false;
            if (this.f14757m.mo5210l()) {
                h74[] h74Arr = this.f14765u;
                int length = h74Arr.length;
                while (i2 < length) {
                    h74Arr[i2].mo7885z();
                    i2++;
                }
                this.f14757m.mo5205g();
            } else {
                for (h74 E : this.f14765u) {
                    E.mo7865E(false);
                }
            }
        } else if (z) {
            j = mo7243b(j);
            while (i2 < i74Arr.length) {
                if (i74Arr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f14738E = true;
        return j;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo10498k(v94 v94, long j, long j2, boolean z) {
        o64 o64 = (o64) v94;
        ia4 g = o64.f11919c;
        k54 k54 = new k54(o64.f11917a, o64.f11927k, g.mo8122o(), g.mo8123p(), j, j2, g.mo8121c());
        long unused = o64.f11917a;
        this.f14753i.mo6069f(k54, 1, -1, (C1574c0) null, 0, (Object) null, o64.f11926j, this.f14735B);
        if (!z) {
            m17129F(o64);
            for (h74 E : this.f14765u) {
                E.mo7865E(false);
            }
            if (this.f14740G > 0) {
                q54 q54 = this.f14763s;
                Objects.requireNonNull(q54);
                q54.mo5562k(this);
            }
        }
    }

    /* renamed from: l */
    public final long mo7248l(long j, ay3 ay3) {
        long j2 = j;
        ay3 ay32 = ay3;
        m17128E();
        if (!this.f14734A.mo5812f()) {
            return 0;
        }
        nd4 d = this.f14734A.mo5811d(j2);
        long j3 = d.f11427a.f13141a;
        long j4 = d.f11428b.f13141a;
        long j5 = ay32.f4434a;
        if (j5 == 0 && ay32.f4435b == 0) {
            return j2;
        }
        long j6 = j;
        long a0 = n13.m13623a0(j6, j5, Long.MIN_VALUE);
        long T = n13.m13615T(j6, ay32.f4435b, Long.MAX_VALUE);
        boolean z = true;
        boolean z2 = a0 <= j3 && j3 <= T;
        if (a0 > j4 || j4 > T) {
            z = false;
        }
        if (!z2 || !z) {
            if (!z2) {
                return z ? j4 : a0;
            }
        } else if (Math.abs(j3 - j2) > Math.abs(j4 - j2)) {
            return j4;
        }
        return j3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0105  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.t94 mo10499m(com.google.android.gms.internal.ads.v94 r27, long r28, long r30, java.io.IOException r32, int r33) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            com.google.android.gms.internal.ads.o64 r1 = (com.google.android.gms.internal.ads.o64) r1
            r0.m17129F(r1)
            com.google.android.gms.internal.ads.ia4 r2 = r1.f11919c
            com.google.android.gms.internal.ads.k54 r15 = new com.google.android.gms.internal.ads.k54
            long r4 = r1.f11917a
            com.google.android.gms.internal.ads.li1 r6 = r1.f11927k
            android.net.Uri r7 = r2.mo8122o()
            java.util.Map r8 = r2.mo8123p()
            long r13 = r2.mo8121c()
            r3 = r15
            r9 = r28
            r11 = r30
            r3.<init>(r4, r6, r7, r8, r9, r11, r13)
            com.google.android.gms.internal.ads.p54 r2 = new com.google.android.gms.internal.ads.p54
            long r3 = r1.f11926j
            long r22 = com.google.android.gms.internal.ads.nz3.m14196d(r3)
            long r3 = r0.f14735B
            long r24 = com.google.android.gms.internal.ads.nz3.m14196d(r3)
            r17 = 1
            r18 = -1
            r19 = 0
            r20 = 0
            r21 = 0
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r24)
            com.google.android.gms.internal.ads.q94 r3 = new com.google.android.gms.internal.ads.q94
            r14 = r32
            r4 = r33
            r3.<init>(r15, r2, r14, r4)
            java.io.IOException r2 = r3.f13112c
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C1646dz
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 != 0) goto L_0x008d
            boolean r4 = r2 instanceof java.io.FileNotFoundException
            if (r4 != 0) goto L_0x008d
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.pn1
            if (r4 != 0) goto L_0x008d
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.z94
            if (r4 != 0) goto L_0x008d
        L_0x006a:
            if (r2 == 0) goto L_0x007f
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.if1
            if (r4 == 0) goto L_0x007a
            r4 = r2
            com.google.android.gms.internal.ads.if1 r4 = (com.google.android.gms.internal.ads.if1) r4
            int r4 = r4.f8640f
            r7 = 2008(0x7d8, float:2.814E-42)
            if (r4 != r7) goto L_0x007a
            goto L_0x008d
        L_0x007a:
            java.lang.Throwable r2 = r2.getCause()
            goto L_0x006a
        L_0x007f:
            int r2 = r3.f13113d
            int r2 = r2 + -1
            int r2 = r2 * 1000
            r3 = 5000(0x1388, float:7.006E-42)
            int r2 = java.lang.Math.min(r2, r3)
            long r2 = (long) r2
            goto L_0x008e
        L_0x008d:
            r2 = r5
        L_0x008e:
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            r7 = 1
            if (r4 != 0) goto L_0x0096
            com.google.android.gms.internal.ads.t94 r2 = com.google.android.gms.internal.ads.aa4.f4044g
            goto L_0x00e8
        L_0x0096:
            int r4 = r26.m17125B()
            int r8 = r0.f14745L
            r9 = 0
            if (r4 <= r8) goto L_0x00a1
            r8 = r7
            goto L_0x00a2
        L_0x00a1:
            r8 = r9
        L_0x00a2:
            long r10 = r0.f14741H
            r12 = -1
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x00e2
            com.google.android.gms.internal.ads.pd4 r10 = r0.f14734A
            if (r10 == 0) goto L_0x00b7
            long r10 = r10.mo5810b()
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x00b7
            goto L_0x00e2
        L_0x00b7:
            boolean r4 = r0.f14768x
            if (r4 == 0) goto L_0x00c6
            boolean r4 = r26.m17135M()
            if (r4 != 0) goto L_0x00c6
            r0.f14744K = r7
            com.google.android.gms.internal.ads.t94 r2 = com.google.android.gms.internal.ads.aa4.f4043f
            goto L_0x00e8
        L_0x00c6:
            boolean r4 = r0.f14768x
            r0.f14739F = r4
            r4 = 0
            r0.f14742I = r4
            r0.f14745L = r9
            com.google.android.gms.internal.ads.h74[] r6 = r0.f14765u
            int r10 = r6.length
            r11 = r9
        L_0x00d4:
            if (r11 >= r10) goto L_0x00de
            r12 = r6[r11]
            r12.mo7865E(r9)
            int r11 = r11 + 1
            goto L_0x00d4
        L_0x00de:
            com.google.android.gms.internal.ads.o64.m14336i(r1, r4, r4)
            goto L_0x00e4
        L_0x00e2:
            r0.f14745L = r4
        L_0x00e4:
            com.google.android.gms.internal.ads.t94 r2 = com.google.android.gms.internal.ads.aa4.m5985b(r8, r2)
        L_0x00e8:
            boolean r3 = r2.mo10965c()
            r16 = r3 ^ 1
            com.google.android.gms.internal.ads.c64 r3 = r0.f14753i
            r5 = 1
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 0
            long r10 = r1.f11926j
            long r12 = r0.f14735B
            r4 = r15
            r14 = r32
            r15 = r16
            r3.mo6073j(r4, r5, r6, r7, r8, r9, r10, r12, r14, r15)
            if (r16 == 0) goto L_0x0108
            long unused = r1.f11917a
        L_0x0108:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t64.mo10499m(com.google.android.gms.internal.ads.v94, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.t94");
    }

    /* renamed from: n */
    public final boolean mo6840n() {
        return this.f14757m.mo5210l() && this.f14759o.mo5566d();
    }

    /* renamed from: o */
    public final void mo7249o(q54 q54, long j) {
        this.f14763s = q54;
        this.f14759o.mo5567e();
        m17133K();
    }

    /* renamed from: p */
    public final void mo10269p(pd4 pd4) {
        this.f14762r.post(new n64(this, pd4));
    }

    /* renamed from: q */
    public final void mo7526q(C1574c0 c0Var) {
        this.f14762r.post(this.f14760p);
    }

    /* renamed from: r */
    public final td4 mo10270r(int i, int i2) {
        return m17127D(new r64(i, false));
    }

    /* renamed from: s */
    public final void mo7250s(long j, boolean z) {
        m17128E();
        if (!m17134L()) {
            boolean[] zArr = this.f14770z.f14282c;
            int length = this.f14765u.length;
            for (int i = 0; i < length; i++) {
                this.f14765u[i].mo7884y(j, false, zArr[i]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final /* synthetic */ void mo10950u() {
        if (!this.f14747N) {
            q54 q54 = this.f14763s;
            Objects.requireNonNull(q54);
            q54.mo5562k(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final /* synthetic */ void mo10951v(pd4 pd4) {
        this.f14734A = this.f14764t == null ? pd4 : new od4(-9223372036854775807L, 0);
        this.f14735B = pd4.mo5810b();
        boolean z = false;
        int i = 1;
        if (this.f14741H == -1 && pd4.mo5810b() == -9223372036854775807L) {
            z = true;
        }
        this.f14736C = z;
        if (true == z) {
            i = 7;
        }
        this.f14737D = i;
        this.f14755k.mo9985g(this.f14735B, pd4.mo5812f(), this.f14736C);
        if (!this.f14768x) {
            m17130H();
        }
    }

    /* renamed from: w */
    public final void mo10952w() {
        for (h74 D : this.f14765u) {
            D.mo7864D();
        }
        this.f14758n.mo8623b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo10953x() {
        this.f14757m.mo5207i(m94.m13098a(this.f14737D));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo10954y(int i) {
        this.f14765u[i].mo7862B();
        mo10953x();
    }

    /* renamed from: z */
    public final void mo10955z() {
        if (this.f14768x) {
            for (h74 C : this.f14765u) {
                C.mo7863C();
            }
        }
        this.f14757m.mo5208j(this);
        this.f14762r.removeCallbacksAndMessages((Object) null);
        this.f14763s = null;
        this.f14747N = true;
    }
}
