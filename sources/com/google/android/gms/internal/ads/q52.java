package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import p054h1.C2684j;
import p054h1.C2694t;
import p061i1.C2817p;
import p061i1.C2818q;
import p061i1.C2826y;

final class q52 implements pk1 {

    /* renamed from: a */
    private final po0 f13062a;

    /* renamed from: b */
    private final cc3<e41> f13063b;

    /* renamed from: c */
    private final rr2 f13064c;

    /* renamed from: d */
    private final eu0 f13065d;

    /* renamed from: e */
    private final ks2 f13066e;

    /* renamed from: f */
    private final w70 f13067f;

    /* renamed from: g */
    private final boolean f13068g;

    q52(po0 po0, cc3<e41> cc3, rr2 rr2, eu0 eu0, ks2 ks2, boolean z, w70 w70) {
        this.f13062a = po0;
        this.f13063b = cc3;
        this.f13064c = rr2;
        this.f13065d = eu0;
        this.f13066e = ks2;
        this.f13068g = z;
        this.f13067f = w70;
    }

    /* renamed from: a */
    public final void mo6852a(boolean z, Context context, jb1 jb1) {
        e41 e41 = (e41) rb3.m16139q(this.f13063b);
        this.f13065d.mo7102V(true);
        C2684j jVar = new C2684j(this.f13068g ? this.f13067f.mo11588e(true) : true, true, this.f13068g ? this.f13067f.mo11587d() : false, this.f13068g ? this.f13067f.mo11584a() : 0.0f, -1, z, this.f13064c.f13869L, false);
        if (jb1 != null) {
            jb1.mo8441S0();
        }
        C2694t.m21602k();
        dk1 i = e41.mo6789i();
        eu0 eu0 = this.f13065d;
        int i2 = this.f13064c.f13871N;
        if (i2 == -1) {
            C2309vv vvVar = this.f13066e.f9645j;
            if (vvVar != null) {
                int i3 = vvVar.f16418f;
                if (i3 == 1) {
                    i2 = 7;
                } else if (i3 == 2) {
                    i2 = 6;
                }
            }
            io0.m11126b("Error setting app open orientation; no targeting orientation available.");
            i2 = this.f13064c.f13871N;
        }
        int i4 = i2;
        po0 po0 = this.f13062a;
        rr2 rr2 = this.f13064c;
        String str = rr2.f13860C;
        wr2 wr2 = rr2.f13914t;
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((C2420yu) null, (C2818q) i, (C2826y) null, eu0, i4, po0, str, jVar, wr2.f16919b, wr2.f16918a, this.f13066e.f9641f, jb1);
        C2817p.m22284a(context, adOverlayInfoParcel, true);
    }
}
