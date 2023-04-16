package com.google.android.gms.internal.ads;

import android.content.Context;
import p054h1.C2675a;
import p054h1.C2686l;
import p054h1.C2694t;

public final /* synthetic */ class ou0 implements wa3 {

    /* renamed from: a */
    public final /* synthetic */ Context f12206a;

    /* renamed from: b */
    public final /* synthetic */ C1734gb f12207b;

    /* renamed from: c */
    public final /* synthetic */ po0 f12208c;

    /* renamed from: d */
    public final /* synthetic */ C2675a f12209d;

    /* renamed from: e */
    public final /* synthetic */ String f12210e;

    public /* synthetic */ ou0(Context context, C1734gb gbVar, po0 po0, C2675a aVar, String str) {
        this.f12206a = context;
        this.f12207b = gbVar;
        this.f12208c = po0;
        this.f12209d = aVar;
        this.f12210e = str;
    }

    public final cc3 zza() {
        Context context = this.f12206a;
        C1734gb gbVar = this.f12207b;
        po0 po0 = this.f12208c;
        C2675a aVar = this.f12209d;
        String str = this.f12210e;
        C2694t.m21591A();
        eu0 a = ru0.m16446a(context, vv0.m18686a(), "", false, false, gbVar, (m20) null, po0, (b20) null, (C2686l) null, aVar, C1527ar.m6231a(), (rr2) null, (ur2) null);
        ap0 g = ap0.m6161g(a);
        a.mo7077D0().mo9048f1(new mu0(g));
        a.loadUrl(str);
        return g;
    }
}
