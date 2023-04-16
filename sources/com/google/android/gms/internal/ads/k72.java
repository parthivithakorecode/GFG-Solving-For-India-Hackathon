package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import p069j1.C3138a1;

public final class k72 implements j52<ij1, at2, y62> {

    /* renamed from: a */
    private final Context f9418a;

    /* renamed from: b */
    private final gk1 f9419b;

    /* renamed from: c */
    private final po0 f9420c;

    /* renamed from: d */
    private final Executor f9421d;

    public k72(Context context, po0 po0, gk1 gk1, Executor executor) {
        this.f9418a = context;
        this.f9420c = po0;
        this.f9419b = gk1;
        this.f9421d = executor;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6411a(ds2 ds2, rr2 rr2, d52 d52) {
        jj1 c = this.f9419b.mo7198c(new l71(ds2, rr2, d52.f5646a), new nj1(new i72(this, d52), (eu0) null));
        c.mo5577c().mo8945B0(new g21((at2) d52.f5647b), this.f9421d);
        ((y62) d52.f5648c).mo11973A5(c.mo5580g());
        return c.mo5582i();
    }

    /* renamed from: b */
    public final void mo6412b(ds2 ds2, rr2 rr2, d52<at2, y62> d52) {
        ((at2) d52.f5647b).mo5510q(this.f9418a, ds2.f5903a.f4336a.f9639d, rr2.f13917w.toString(), C3138a1.m23830l(rr2.f13914t), (jd0) d52.f5648c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo8633c(d52 d52, boolean z, Context context, jb1 jb1) {
        try {
            ((at2) d52.f5647b).mo5517x(z);
            if (this.f9420c.f12731h < ((Integer) C2199sw.m17001c().mo8579b(m10.f10644x0)).intValue()) {
                ((at2) d52.f5647b).mo5518y();
            } else {
                ((at2) d52.f5647b).mo5519z(context);
            }
        } catch (ps2 e) {
            io0.m11130f("Cannot show interstitial.");
            throw new ok1(e.getCause());
        }
    }
}
