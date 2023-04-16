package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

public final class na2 implements a52<t41> {

    /* renamed from: a */
    private final Context f11371a;

    /* renamed from: b */
    private final r51 f11372b;

    /* renamed from: c */
    private final i20 f11373c;

    /* renamed from: d */
    private final dc3 f11374d;

    /* renamed from: e */
    private final nw2 f11375e;

    public na2(Context context, r51 r51, nw2 nw2, dc3 dc3, i20 i20) {
        this.f11371a = context;
        this.f11372b = r51;
        this.f11375e = nw2;
        this.f11374d = dc3;
        this.f11373c = i20;
    }

    /* renamed from: a */
    public final cc3<t41> mo5105a(ds2 ds2, rr2 rr2) {
        u41 a = this.f11372b.mo7440a(new l71(ds2, rr2, (String) null), new ka2(this, new View(this.f11371a), (eu0) null, ia2.f8585a, rr2.f13916v.get(0)));
        la2 k = a.mo5991k();
        wr2 wr2 = rr2.f13914t;
        c20 c20 = new c20(k, wr2.f16919b, wr2.f16918a);
        nw2 nw2 = this.f11375e;
        return wv2.m19225d(new ja2(this, c20), this.f11374d, gw2.CUSTOM_RENDER_SYN, nw2).mo6682b(gw2.CUSTOM_RENDER_ACK).mo6684d(rb3.m16131i(a.mo5988h())).mo6681a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f13914t;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5106b(com.google.android.gms.internal.ads.ds2 r1, com.google.android.gms.internal.ads.rr2 r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.i20 r1 = r0.f11373c
            if (r1 == 0) goto L_0x000e
            com.google.android.gms.internal.ads.wr2 r1 = r2.f13914t
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.f16918a
            if (r1 == 0) goto L_0x000e
            r1 = 1
            return r1
        L_0x000e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.na2.mo5106b(com.google.android.gms.internal.ads.ds2, com.google.android.gms.internal.ads.rr2):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo9478c(c20 c20) {
        this.f11373c.mo7495H1(c20);
    }
}
