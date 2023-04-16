package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import p061i1.C2818q;

public final class in2 implements ya1, wc1, ap2, C2818q, jd1, mb1, pi1 {

    /* renamed from: f */
    private final pt2 f8723f;

    /* renamed from: g */
    private final AtomicReference<C2341wp> f8724g = new AtomicReference<>();

    /* renamed from: h */
    private final AtomicReference<C2378xp> f8725h = new AtomicReference<>();

    /* renamed from: i */
    private final AtomicReference<C1600cq> f8726i = new AtomicReference<>();

    /* renamed from: j */
    private final AtomicReference<wc1> f8727j = new AtomicReference<>();

    /* renamed from: k */
    private final AtomicReference<C2818q> f8728k = new AtomicReference<>();

    /* renamed from: l */
    private final AtomicReference<C2350wy> f8729l = new AtomicReference<>();

    /* renamed from: m */
    private in2 f8730m = null;

    public in2(pt2 pt2) {
        this.f8723f = pt2;
    }

    /* renamed from: c */
    public static in2 m11102c(in2 in2) {
        in2 in22 = new in2(in2.f8723f);
        in22.f8730m = in2;
        return in22;
    }

    /* renamed from: B */
    public final void mo8176B(C2378xp xpVar) {
        this.f8725h.set(xpVar);
    }

    /* renamed from: B0 */
    public final void mo8177B0(C1605cv cvVar) {
        in2 in2 = this.f8730m;
        if (in2 != null) {
            in2.mo8177B0(cvVar);
        } else {
            ro2.m16376a(this.f8726i, new bn2(cvVar));
        }
    }

    /* renamed from: D */
    public final void mo5643D(int i) {
        in2 in2 = this.f8730m;
        if (in2 != null) {
            in2.mo5643D(i);
        } else {
            ro2.m16376a(this.f8728k, new dn2(i));
        }
    }

    /* renamed from: M3 */
    public final void mo5644M3() {
    }

    /* renamed from: Z2 */
    public final void mo5645Z2() {
        in2 in2 = this.f8730m;
        if (in2 != null) {
            in2.mo5645Z2();
        } else {
            ro2.m16376a(this.f8728k, um2.f15637a);
        }
    }

    /* renamed from: a */
    public final void mo5646a() {
        in2 in2 = this.f8730m;
        if (in2 != null) {
            in2.mo5646a();
            return;
        }
        ro2.m16376a(this.f8728k, vm2.f16359a);
        ro2.m16376a(this.f8726i, tm2.f14911a);
        ro2.m16376a(this.f8726i, hn2.f8360a);
    }

    /* renamed from: b */
    public final void mo5647b() {
        in2 in2 = this.f8730m;
        if (in2 != null) {
            in2.mo5647b();
        } else {
            ro2.m16376a(this.f8728k, wm2.f16859a);
        }
    }

    /* renamed from: d */
    public final void mo7808d(C1605cv cvVar) {
        in2 in2 = this.f8730m;
        if (in2 != null) {
            in2.mo7808d(cvVar);
            return;
        }
        ro2.m16376a(this.f8724g, new zm2(cvVar));
        ro2.m16376a(this.f8724g, new an2(cvVar));
    }

    /* renamed from: e */
    public final void mo8178e(C2229tp tpVar) {
        in2 in2 = this.f8730m;
        if (in2 != null) {
            in2.mo8178e(tpVar);
        } else {
            ro2.m16376a(this.f8724g, new sm2(tpVar));
        }
    }

    /* renamed from: f */
    public final void mo7915f() {
        in2 in2 = this.f8730m;
        if (in2 != null) {
            in2.mo7915f();
        } else {
            ro2.m16376a(this.f8727j, xm2.f17245a);
        }
    }

    /* renamed from: h */
    public final void mo8179h(wc1 wc1) {
        this.f8727j.set(wc1);
    }

    /* renamed from: i */
    public final void mo8180i() {
        in2 in2 = this.f8730m;
        if (in2 != null) {
            in2.mo8180i();
            return;
        }
        this.f8723f.mo10175a();
        ro2.m16376a(this.f8725h, en2.f6288a);
        ro2.m16376a(this.f8726i, gn2.f7535a);
    }

    /* renamed from: m */
    public final void mo8181m(C2818q qVar) {
        this.f8728k.set(qVar);
    }

    /* renamed from: q */
    public final void mo5356q(ap2 ap2) {
        this.f8730m = (in2) ap2;
    }

    /* renamed from: r */
    public final void mo8182r() {
        in2 in2 = this.f8730m;
        if (in2 != null) {
            in2.mo8182r();
        } else {
            ro2.m16376a(this.f8726i, fn2.f6876a);
        }
    }

    /* renamed from: s */
    public final void mo8183s(C2161rv rvVar) {
        in2 in2 = this.f8730m;
        if (in2 != null) {
            in2.mo8183s(rvVar);
        } else {
            ro2.m16376a(this.f8729l, new cn2(rvVar));
        }
    }

    /* renamed from: t */
    public final void mo8184t(C2350wy wyVar) {
        this.f8729l.set(wyVar);
    }

    /* renamed from: u5 */
    public final void mo5655u5() {
    }

    /* renamed from: y */
    public final void mo8185y(C2341wp wpVar) {
        this.f8724g.set(wpVar);
    }

    /* renamed from: z */
    public final void mo8186z(C1600cq cqVar) {
        this.f8726i.set(cqVar);
    }
}
