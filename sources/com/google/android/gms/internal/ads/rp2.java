package com.google.android.gms.internal.ads;

final class rp2 implements nb3<ij1> {

    /* renamed from: a */
    final /* synthetic */ bd2 f13800a;

    /* renamed from: b */
    final /* synthetic */ ox2 f13801b;

    /* renamed from: c */
    final /* synthetic */ gk1 f13802c;

    /* renamed from: d */
    final /* synthetic */ sp2 f13803d;

    rp2(sp2 sp2, bd2 bd2, ox2 ox2, gk1 gk1) {
        this.f13803d = sp2;
        this.f13800a = bd2;
        this.f13801b = ox2;
        this.f13802c = gk1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5436a(Object obj) {
        ij1 ij1 = (ij1) obj;
        synchronized (this.f13803d) {
            this.f13803d.f14530i = null;
            e10 e10 = m10.f10423X5;
            if (((Boolean) C2199sw.m17001c().mo8579b(e10)).booleanValue()) {
                hf1 e = ij1.mo11411e();
                e.mo7920a(this.f13803d.f14525d);
                e.mo7923d(this.f13803d.f14526e);
            }
            this.f13800a.mo5807a(ij1);
            if (((Boolean) C2199sw.m17001c().mo8579b(e10)).booleanValue()) {
                this.f13803d.f14523b.execute(new np2(this));
                this.f13803d.f14523b.execute(new op2(this));
            }
            if (this.f13801b != null) {
                qx2 d = this.f13803d.f14528g;
                ox2 ox2 = this.f13801b;
                ox2.mo9880d(ij1.mo11413g().f5904b);
                ox2.mo9881e(ij1.mo11409c().mo9702b());
                ox2.mo9883g(true);
                d.mo10426a(ox2.mo9885i());
            }
        }
    }

    /* renamed from: b */
    public final void mo5437b(Throwable th) {
        C1605cv a = this.f13802c.mo7196a().mo12172a(th);
        synchronized (this.f13803d) {
            this.f13803d.f14530i = null;
            this.f13802c.mo7197b().mo7808d(a);
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10423X5)).booleanValue()) {
                this.f13803d.f14523b.execute(new pp2(this, a));
                this.f13803d.f14523b.execute(new qp2(this, a));
            }
            zs2.m20831b(a.f5529f, th, "InterstitialAdLoader.onFailure");
            if (this.f13801b != null) {
                qx2 d = this.f13803d.f14528g;
                ox2 ox2 = this.f13801b;
                ox2.mo9879c(a);
                ox2.mo9883g(false);
                d.mo10426a(ox2.mo9885i());
            }
            this.f13800a.zza();
        }
    }
}
