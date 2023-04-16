package com.google.android.gms.internal.ads;

import android.content.Context;
import p026d1.C2469a;
import p026d1.C2478g;

public final class pb2 extends C1830ix {

    /* renamed from: f */
    private final Context f12592f;

    /* renamed from: g */
    private final bw0 f12593g;

    /* renamed from: h */
    final is2 f12594h;

    /* renamed from: i */
    final an1 f12595i = new an1();

    /* renamed from: j */
    private C2459zw f12596j;

    public pb2(bw0 bw0, Context context, String str) {
        is2 is2 = new is2();
        this.f12594h = is2;
        this.f12593g = bw0;
        is2.mo8253H(str);
        this.f12592f = context;
    }

    /* renamed from: D3 */
    public final void mo6359D3(C2469a aVar) {
        this.f12594h.mo8251F(aVar);
    }

    /* renamed from: G3 */
    public final void mo6360G3(String str, r50 r50, o50 o50) {
        this.f12595i.mo5323c(str, r50, o50);
    }

    /* renamed from: Q1 */
    public final void mo6361Q1(r90 r90) {
        this.f12594h.mo8256K(r90);
    }

    /* renamed from: Q4 */
    public final void mo6362Q4(C2459zw zwVar) {
        this.f12596j = zwVar;
    }

    /* renamed from: R3 */
    public final void mo6363R3(b40 b40) {
        this.f12594h.mo8260O(b40);
    }

    /* renamed from: T2 */
    public final void mo6364T2(ba0 ba0) {
        this.f12595i.mo5324d(ba0);
    }

    /* renamed from: U4 */
    public final void mo6365U4(C2423yx yxVar) {
        this.f12594h.mo8269o(yxVar);
    }

    /* renamed from: Z0 */
    public final void mo6366Z0(v50 v50, C2087pv pvVar) {
        this.f12595i.mo5325e(v50);
        this.f12594h.mo8252G(pvVar);
    }

    /* renamed from: b */
    public final C1756gx mo6367b() {
        cn1 g = this.f12595i.mo5327g();
        this.f12594h.mo8261a(g.mo6235i());
        this.f12594h.mo8262b(g.mo6234h());
        is2 is2 = this.f12594h;
        if (is2.mo8271v() == null) {
            is2.mo8252G(C2087pv.m15287e());
        }
        return new qb2(this.f12592f, this.f12593g, this.f12594h, g, this.f12596j);
    }

    /* renamed from: d5 */
    public final void mo6368d5(C2478g gVar) {
        this.f12594h.mo8263c(gVar);
    }

    /* renamed from: j4 */
    public final void mo6369j4(y50 y50) {
        this.f12595i.mo5326f(y50);
    }

    /* renamed from: o4 */
    public final void mo6370o4(l50 l50) {
        this.f12595i.mo5322b(l50);
    }

    /* renamed from: p5 */
    public final void mo6371p5(i50 i50) {
        this.f12595i.mo5321a(i50);
    }
}
