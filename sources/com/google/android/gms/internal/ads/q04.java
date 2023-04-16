package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class q04 implements r80, i14, nb4, d64, z84, w24 {

    /* renamed from: f */
    private final xv1 f12986f;

    /* renamed from: g */
    private final pf0 f12987g;

    /* renamed from: h */
    private final hh0 f12988h = new hh0();

    /* renamed from: i */
    private final p04 f12989i;

    /* renamed from: j */
    private final SparseArray<r04> f12990j;

    /* renamed from: k */
    private nb2<s04> f12991k;

    /* renamed from: l */
    private ub0 f12992l;

    /* renamed from: m */
    private h52 f12993m;

    /* renamed from: n */
    private boolean f12994n;

    public q04(xv1 xv1) {
        this.f12986f = xv1;
        this.f12991k = new nb2<>(n13.m13622a(), xv1, k04.f9331a);
        pf0 pf0 = new pf0();
        this.f12987g = pf0;
        this.f12989i = new p04(pf0);
        this.f12990j = new SparseArray<>();
    }

    /* renamed from: I */
    public static /* synthetic */ void m15352I(q04 q04) {
        r04 G = q04.mo10212G();
        q04.mo10219P(G, 1036, new m04(G));
        q04.f12991k.mo9490e();
    }

    /* renamed from: T */
    private final r04 m15353T(s54 s54) {
        Objects.requireNonNull(this.f12992l);
        ei0 a = s54 == null ? null : this.f12989i.mo9913a(s54);
        if (s54 != null && a != null) {
            return mo10213H(a, a.mo6969n(s54.f7614a, this.f12987g).f12646c, s54);
        }
        int e = ((lx3) this.f12992l).mo7756e();
        ei0 o = this.f12992l.mo7764o();
        if (e >= o.mo6956c()) {
            o = ei0.f6219a;
        }
        return mo10213H(o, e, (s54) null);
    }

    /* renamed from: U */
    private final r04 m15354U(int i, s54 s54) {
        ub0 ub0 = this.f12992l;
        Objects.requireNonNull(ub0);
        if (s54 != null) {
            return this.f12989i.mo9913a(s54) != null ? m15353T(s54) : mo10213H(ei0.f6219a, i, s54);
        }
        ei0 o = ub0.mo7764o();
        if (i >= o.mo6956c()) {
            o = ei0.f6219a;
        }
        return mo10213H(o, i, (s54) null);
    }

    /* renamed from: V */
    private final r04 m15355V() {
        return m15353T(this.f12989i.mo9916d());
    }

    /* renamed from: W */
    private final r04 m15356W() {
        return m15353T(this.f12989i.mo9917e());
    }

    /* renamed from: A */
    public final void mo6727A(Exception exc) {
        r04 W = m15356W();
        mo10219P(W, 1037, new vz3(W, exc));
    }

    /* renamed from: B */
    public final void mo5720B(int i, s54 s54, p54 p54) {
        r04 U = m15354U(i, s54);
        mo10219P(U, 1004, new uz3(U, p54));
    }

    /* renamed from: C */
    public final void mo6728C(String str) {
        r04 W = m15356W();
        mo10219P(W, 1024, new a04(W, str));
    }

    /* renamed from: D */
    public final void mo6729D(long j) {
        r04 W = m15356W();
        mo10219P(W, 1011, new zy3(W, j));
    }

    /* renamed from: E */
    public final void mo5721E(int i, s54 s54, k54 k54, p54 p54) {
        r04 U = m15354U(i, s54);
        mo10219P(U, 1002, new qz3(U, k54, p54));
    }

    /* renamed from: F */
    public final void mo6730F(C1574c0 c0Var, de3 de3) {
        r04 W = m15356W();
        mo10219P(W, 1022, new cz3(W, c0Var, de3));
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final r04 mo10212G() {
        return m15353T(this.f12989i.mo9914b());
    }

    /* access modifiers changed from: protected */
    @RequiresNonNull({"player"})
    /* renamed from: H */
    public final r04 mo10213H(ei0 ei0, int i, s54 s54) {
        ei0 ei02 = ei0;
        int i2 = i;
        boolean z = true;
        s54 s542 = true == ei0.mo6970o() ? null : s54;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!ei02.equals(this.f12992l.mo7764o()) || i2 != ((lx3) this.f12992l).mo7756e()) {
            z = false;
        }
        long j = 0;
        if (s542 == null || !s542.mo7714b()) {
            if (z) {
                j = this.f12992l.mo7759i();
            } else if (!ei0.mo6970o()) {
                long j2 = ei02.mo6958e(i2, this.f12988h, 0).f8235k;
                j = nz3.m14196d(0);
            }
        } else if (z && this.f12992l.mo7751b() == s542.f7615b && this.f12992l.mo7754d() == s542.f7616c) {
            j = this.f12992l.mo7760j();
        }
        return new r04(elapsedRealtime, ei0, i, s542, j, this.f12992l.mo7764o(), ((lx3) this.f12992l).mo7756e(), this.f12989i.mo9914b(), this.f12992l.mo7760j(), this.f12992l.mo7761k());
    }

    /* renamed from: J */
    public final void mo10214J(s04 s04) {
        this.f12991k.mo9487b(s04);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final /* synthetic */ void mo10215K(ub0 ub0, s04 s04, yb4 yb4) {
        SparseArray<r04> sparseArray = this.f12990j;
        SparseArray sparseArray2 = new SparseArray(yb4.mo11987b());
        for (int i = 0; i < yb4.mo11987b(); i++) {
            int a = yb4.mo11986a(i);
            r04 r04 = sparseArray.get(a);
            Objects.requireNonNull(r04);
            sparseArray2.append(a, r04);
        }
    }

    /* renamed from: L */
    public final void mo10216L() {
        if (!this.f12994n) {
            r04 G = mo10212G();
            this.f12994n = true;
            mo10219P(G, -1, new qy3(G));
        }
    }

    /* renamed from: M */
    public final void mo10217M() {
        h52 h52 = this.f12993m;
        wu1.m19203b(h52);
        h52.mo7842E(new l04(this));
    }

    /* renamed from: N */
    public final void mo5159N(int i) {
        r04 G = mo10212G();
        mo10219P(G, 4, new ry3(G, i));
    }

    /* renamed from: O */
    public final void mo10218O(s04 s04) {
        this.f12991k.mo9491f(s04);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final void mo10219P(r04 r04, int i, k82<s04> k82) {
        this.f12990j.put(i, r04);
        nb2<s04> nb2 = this.f12991k;
        nb2.mo9489d(i, k82);
        nb2.mo9488c();
    }

    /* renamed from: Q */
    public final void mo10220Q(ub0 ub0, Looper looper) {
        boolean z = true;
        if (this.f12992l != null && !this.f12989i.f12406b.isEmpty()) {
            z = false;
        }
        wu1.m19207f(z);
        this.f12992l = ub0;
        this.f12993m = this.f12986f.mo7393a(looper, (Handler.Callback) null);
        this.f12991k = this.f12991k.mo9486a(looper, new j04(this, ub0));
    }

    /* renamed from: R */
    public final void mo5160R(int i) {
        r04 G = mo10212G();
        mo10219P(G, 6, new sy3(G, i));
    }

    /* renamed from: S */
    public final void mo10221S(List<s54> list, s54 s54) {
        p04 p04 = this.f12989i;
        ub0 ub0 = this.f12992l;
        Objects.requireNonNull(ub0);
        p04.mo9919h(list, s54, ub0);
    }

    /* renamed from: X */
    public final void mo5161X(boolean z) {
        r04 G = mo10212G();
        mo10219P(G, 3, new d04(G, z));
    }

    /* renamed from: Y */
    public final void mo5162Y(e30 e30) {
        r04 G = mo10212G();
        mo10219P(G, 12, new gz3(G, e30));
    }

    /* renamed from: Z */
    public final void mo5163Z(boolean z, int i) {
        r04 G = mo10212G();
        mo10219P(G, 5, new h04(G, z, i));
    }

    /* renamed from: a */
    public final void mo6731a(boolean z) {
        r04 W = m15356W();
        mo10219P(W, 1017, new f04(W, z));
    }

    /* renamed from: a0 */
    public final void mo5164a0(ta0 ta0, ta0 ta02, int i) {
        if (i == 1) {
            this.f12994n = false;
            i = 1;
        }
        p04 p04 = this.f12989i;
        ub0 ub0 = this.f12992l;
        Objects.requireNonNull(ub0);
        p04.mo9918g(ub0);
        r04 G = mo10212G();
        mo10219P(G, 11, new yy3(G, i, ta0, ta02));
    }

    /* renamed from: b */
    public final void mo6732b(ry0 ry0) {
        r04 W = m15356W();
        mo10219P(W, 1028, new kz3(W, ry0));
    }

    /* renamed from: b0 */
    public final void mo5165b0(ei0 ei0, int i) {
        p04 p04 = this.f12989i;
        ub0 ub0 = this.f12992l;
        Objects.requireNonNull(ub0);
        p04.mo9920i(ub0);
        r04 G = mo10212G();
        mo10219P(G, 0, new ty3(G, i));
    }

    /* renamed from: c */
    public final void mo6733c(long j, int i) {
        r04 V = m15355V();
        mo10219P(V, 1026, new az3(V, j, i));
    }

    /* renamed from: c0 */
    public final void mo5166c0(boolean z, int i) {
        r04 G = mo10212G();
        mo10219P(G, -1, new i04(G, z, i));
    }

    /* renamed from: d */
    public final void mo10222d(int i, long j, long j2) {
        r04 T = m15353T(this.f12989i.mo9915c());
        mo10219P(T, 1006, new xy3(T, i, j, j2));
    }

    /* renamed from: d0 */
    public final void mo5167d0(pw0 pw0) {
        r04 G = mo10212G();
        mo10219P(G, 2, new jz3(G, pw0));
    }

    /* renamed from: e */
    public final void mo6735e(cd3 cd3) {
        r04 W = m15356W();
        mo10219P(W, 1020, new pz3(W, cd3));
    }

    /* renamed from: e0 */
    public final void mo5168e0(z60 z60) {
        r04 G = mo10212G();
        mo10219P(G, 13, new hz3(G, z60));
    }

    /* renamed from: f */
    public final /* synthetic */ void mo10223f(int i, boolean z) {
    }

    /* renamed from: f0 */
    public final void mo5169f0(C1716fu fuVar) {
        r04 G = mo10212G();
        mo10219P(G, 14, new ez3(G, fuVar));
    }

    /* renamed from: g */
    public final void mo5722g(int i, s54 s54, k54 k54, p54 p54) {
        r04 U = m15354U(i, s54);
        mo10219P(U, 1001, new rz3(U, k54, p54));
    }

    /* renamed from: g0 */
    public final void mo5170g0(C2451zo zoVar, int i) {
        r04 G = mo10212G();
        mo10219P(G, 1, new dz3(G, zoVar, i));
    }

    /* renamed from: h */
    public final void mo6737h(int i, long j) {
        r04 V = m15355V();
        mo10219P(V, 1023, new vy3(V, i, j));
    }

    /* renamed from: h0 */
    public final void mo5171h0(hm0 hm0, in0 in0) {
        r04 G = mo10212G();
        mo10219P(G, 2, new iz3(G, hm0, in0));
    }

    /* renamed from: i */
    public final void mo6738i(Exception exc) {
        r04 W = m15356W();
        mo10219P(W, 1038, new xz3(W, exc));
    }

    /* renamed from: i0 */
    public final void mo5172i0(boolean z) {
        r04 G = mo10212G();
        mo10219P(G, 7, new e04(G, z));
    }

    /* renamed from: j */
    public final /* synthetic */ void mo10224j() {
    }

    /* renamed from: j0 */
    public final void mo5173j0(c10 c10) {
        C1754gv gvVar;
        r04 r04 = null;
        if ((c10 instanceof ll3) && (gvVar = ((ll3) c10).f10087n) != null) {
            r04 = m15353T(new s54(gvVar));
        }
        if (r04 == null) {
            r04 = mo10212G();
        }
        mo10219P(r04, 10, new fz3(r04, c10));
    }

    /* renamed from: k */
    public final void mo6739k(cd3 cd3) {
        r04 V = m15355V();
        mo10219P(V, 1025, new oz3(V, cd3));
    }

    /* renamed from: l */
    public final void mo6740l(String str) {
        r04 W = m15356W();
        mo10219P(W, 1013, new zz3(W, str));
    }

    /* renamed from: m */
    public final void mo6741m(cd3 cd3) {
        r04 W = m15356W();
        mo10219P(W, 1008, new mz3(W, cd3));
    }

    /* renamed from: n */
    public final void mo6742n(Exception exc) {
        r04 W = m15356W();
        mo10219P(W, 1018, new wz3(W, exc));
    }

    /* renamed from: o */
    public final void mo5174o() {
        r04 G = mo10212G();
        mo10219P(G, -1, new g04(G));
    }

    /* renamed from: p */
    public final void mo6747p(String str, long j, long j2) {
        r04 W = m15356W();
        mo10219P(W, 1009, new b04(W, str, j2, j));
    }

    /* renamed from: q */
    public final void mo6748q(cd3 cd3) {
        r04 V = m15355V();
        mo10219P(V, 1014, new lz3(V, cd3));
    }

    /* renamed from: r */
    public final void mo6749r(int i, long j, long j2) {
        r04 W = m15356W();
        mo10219P(W, 1012, new wy3(W, i, j, j2));
    }

    /* renamed from: s */
    public final void mo5723s(int i, s54 s54, k54 k54, p54 p54) {
        r04 U = m15354U(i, s54);
        mo10219P(U, 1000, new sz3(U, k54, p54));
    }

    /* renamed from: t */
    public final void mo6753t(String str, long j, long j2) {
        r04 W = m15356W();
        mo10219P(W, 1021, new c04(W, str, j2, j));
    }

    /* renamed from: u */
    public final /* synthetic */ void mo10225u(r34 r34) {
    }

    /* renamed from: v */
    public final void mo5724v(int i, s54 s54, k54 k54, p54 p54, IOException iOException, boolean z) {
        r04 U = m15354U(i, s54);
        mo10219P(U, 1003, new tz3(U, k54, p54, iOException, z));
    }

    /* renamed from: w */
    public final void mo10226w(float f) {
        r04 W = m15356W();
        mo10219P(W, 1019, new n04(W, f));
    }

    /* renamed from: x */
    public final void mo6754x(Object obj, long j) {
        r04 W = m15356W();
        mo10219P(W, 1027, new yz3(W, obj, j));
    }

    /* renamed from: y */
    public final void mo10227y(int i, int i2) {
        r04 W = m15356W();
        mo10219P(W, 1029, new uy3(W, i, i2));
    }

    /* renamed from: z */
    public final void mo6755z(C1574c0 c0Var, de3 de3) {
        r04 W = m15356W();
        mo10219P(W, 1010, new bz3(W, c0Var, de3));
    }
}
