package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import p054h1.C2675a;
import p054h1.C2686l;
import p054h1.C2694t;

public final /* synthetic */ class nu0 implements c53 {

    /* renamed from: f */
    public final /* synthetic */ Context f11702f;

    /* renamed from: g */
    public final /* synthetic */ vv0 f11703g;

    /* renamed from: h */
    public final /* synthetic */ String f11704h;

    /* renamed from: i */
    public final /* synthetic */ boolean f11705i;

    /* renamed from: j */
    public final /* synthetic */ boolean f11706j;

    /* renamed from: k */
    public final /* synthetic */ C1734gb f11707k;

    /* renamed from: l */
    public final /* synthetic */ m20 f11708l;

    /* renamed from: m */
    public final /* synthetic */ po0 f11709m;

    /* renamed from: n */
    public final /* synthetic */ C2686l f11710n;

    /* renamed from: o */
    public final /* synthetic */ C2675a f11711o;

    /* renamed from: p */
    public final /* synthetic */ C1527ar f11712p;

    /* renamed from: q */
    public final /* synthetic */ rr2 f11713q;

    /* renamed from: r */
    public final /* synthetic */ ur2 f11714r;

    public /* synthetic */ nu0(Context context, vv0 vv0, String str, boolean z, boolean z2, C1734gb gbVar, m20 m20, po0 po0, b20 b20, C2686l lVar, C2675a aVar, C1527ar arVar, rr2 rr2, ur2 ur2) {
        this.f11702f = context;
        this.f11703g = vv0;
        this.f11704h = str;
        this.f11705i = z;
        this.f11706j = z2;
        this.f11707k = gbVar;
        this.f11708l = m20;
        this.f11709m = po0;
        this.f11710n = lVar;
        this.f11711o = aVar;
        this.f11712p = arVar;
        this.f11713q = rr2;
        this.f11714r = ur2;
    }

    public final Object zza() {
        Context context = this.f11702f;
        vv0 vv0 = this.f11703g;
        String str = this.f11704h;
        boolean z = this.f11705i;
        boolean z2 = this.f11706j;
        C1734gb gbVar = this.f11707k;
        m20 m20 = this.f11708l;
        po0 po0 = this.f11709m;
        C2686l lVar = this.f11710n;
        C2675a aVar = this.f11711o;
        C1527ar arVar = this.f11712p;
        rr2 rr2 = this.f11713q;
        ur2 ur2 = this.f11714r;
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = yu0.f17859f0;
            uu0 uu0 = new uu0(new yu0(new uv0(context), vv0, str, z, z2, gbVar, m20, po0, (b20) null, lVar, aVar, arVar, rr2, ur2));
            uu0.setWebViewClient(C2694t.m21609r().mo14009n(uu0, arVar, z2));
            uu0.setWebChromeClient(new du0(uu0));
            return uu0;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
