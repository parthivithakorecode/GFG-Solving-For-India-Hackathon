package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import p054h1.C2684j;
import p054h1.C2694t;
import p061i1.C2817p;
import p061i1.C2818q;
import p061i1.C2826y;
import p069j1.C3163g2;

final class e72 implements pk1 {

    /* renamed from: a */
    private final Context f6109a;

    /* renamed from: b */
    private final po0 f6110b;

    /* renamed from: c */
    private final cc3<jj1> f6111c;

    /* renamed from: d */
    private final rr2 f6112d;

    /* renamed from: e */
    private final eu0 f6113e;

    /* renamed from: f */
    private final ks2 f6114f;

    /* renamed from: g */
    private final w70 f6115g;

    /* renamed from: h */
    private final boolean f6116h;

    e72(Context context, po0 po0, cc3<jj1> cc3, rr2 rr2, eu0 eu0, ks2 ks2, boolean z, w70 w70) {
        this.f6109a = context;
        this.f6110b = po0;
        this.f6111c = cc3;
        this.f6112d = rr2;
        this.f6113e = eu0;
        this.f6114f = ks2;
        this.f6115g = w70;
        this.f6116h = z;
    }

    /* renamed from: a */
    public final void mo6852a(boolean z, Context context, jb1 jb1) {
        jj1 jj1 = (jj1) rb3.m16139q(this.f6111c);
        this.f6113e.mo7102V(true);
        boolean e = this.f6116h ? this.f6115g.mo11588e(false) : false;
        C2694t.m21608q();
        C2684j jVar = new C2684j(e, C3163g2.m23937m(this.f6109a), this.f6116h ? this.f6115g.mo11587d() : false, this.f6116h ? this.f6115g.mo11584a() : 0.0f, -1, z, this.f6112d.f13869L, false);
        if (jb1 != null) {
            jb1.mo8441S0();
        }
        C2694t.m21602k();
        dk1 j = jj1.mo5583j();
        eu0 eu0 = this.f6113e;
        rr2 rr2 = this.f6112d;
        int i = rr2.f13871N;
        po0 po0 = this.f6110b;
        String str = rr2.f13860C;
        wr2 wr2 = rr2.f13914t;
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((C2420yu) null, (C2818q) j, (C2826y) null, eu0, i, po0, str, jVar, wr2.f16919b, wr2.f16918a, this.f6114f.f9641f, jb1);
        C2817p.m22284a(context, adOverlayInfoParcel, true);
    }
}
