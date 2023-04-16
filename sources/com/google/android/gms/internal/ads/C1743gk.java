package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.ads.gk */
public final class C1743gk implements C1891kk, C1854jk {

    /* renamed from: f */
    private final Uri f7503f;

    /* renamed from: g */
    private final C2188sl f7504g;

    /* renamed from: h */
    private final C1666eh f7505h;

    /* renamed from: i */
    private final int f7506i;

    /* renamed from: j */
    private final Handler f7507j;

    /* renamed from: k */
    private final C1706fk f7508k;

    /* renamed from: l */
    private final C1738gf f7509l = new C1738gf();

    /* renamed from: m */
    private final int f7510m;

    /* renamed from: n */
    private C1854jk f7511n;

    /* renamed from: o */
    private C1812if f7512o;

    /* renamed from: p */
    private boolean f7513p;

    public C1743gk(Uri uri, C2188sl slVar, C1666eh ehVar, int i, Handler handler, C1706fk fkVar, String str, int i2) {
        this.f7503f = uri;
        this.f7504g = slVar;
        this.f7505h = ehVar;
        this.f7506i = i;
        this.f7507j = handler;
        this.f7508k = fkVar;
        this.f7510m = i2;
    }

    /* renamed from: a */
    public final void mo7645a(C1959me meVar, boolean z, C1854jk jkVar) {
        this.f7511n = jkVar;
        C2410yk ykVar = new C2410yk(-9223372036854775807L, false);
        this.f7512o = ykVar;
        jkVar.mo7647c(ykVar, (Object) null);
    }

    /* renamed from: b */
    public final void mo7646b(C1817ik ikVar) {
        ((C1669ek) ikVar).mo6974F();
    }

    /* renamed from: c */
    public final void mo7647c(C1812if ifVar, Object obj) {
        C1738gf gfVar = this.f7509l;
        boolean z = false;
        ifVar.mo7322d(0, gfVar, false);
        if (gfVar.f7412c != -9223372036854775807L) {
            z = true;
        }
        if (!this.f7513p || z) {
            this.f7512o = ifVar;
            this.f7513p = z;
            this.f7511n.mo7647c(ifVar, (Object) null);
        }
    }

    /* renamed from: d */
    public final C1817ik mo7648d(int i, C2337wl wlVar) {
        C1856jm.m11728c(i == 0);
        return new C1669ek(this.f7503f, this.f7504g.zza(), this.f7505h.zza(), this.f7506i, this.f7507j, this.f7508k, this, wlVar, (String) null, this.f7510m, (byte[]) null);
    }

    /* renamed from: g */
    public final void mo7649g() {
        this.f7511n = null;
    }

    public final void zza() {
    }
}
