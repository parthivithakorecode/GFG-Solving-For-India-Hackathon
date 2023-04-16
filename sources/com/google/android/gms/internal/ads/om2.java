package com.google.android.gms.internal.ads;

final class om2 implements nb3 {

    /* renamed from: a */
    final /* synthetic */ bd2 f12094a;

    /* renamed from: b */
    final /* synthetic */ ox2 f12095b;

    /* renamed from: c */
    final /* synthetic */ qm2 f12096c;

    /* renamed from: d */
    final /* synthetic */ rm2 f12097d;

    om2(rm2 rm2, bd2 bd2, ox2 ox2, qm2 qm2) {
        this.f12097d = rm2;
        this.f12094a = bd2;
        this.f12095b = ox2;
        this.f12096c = qm2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5436a(Object obj) {
        v61 v61 = (v61) obj;
        synchronized (this.f12097d) {
            this.f12097d.f13743i = null;
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10415W5)).booleanValue()) {
                v61.mo11411e().mo7921b(this.f12097d.f13738d);
            }
            this.f12094a.mo5807a(v61);
            if (this.f12095b != null) {
                qx2 g = this.f12097d.f13741g;
                ox2 ox2 = this.f12095b;
                ox2.mo9880d(v61.mo11413g().f5904b);
                ox2.mo9881e(v61.mo11409c().mo9702b());
                ox2.mo9883g(true);
                g.mo10426a(ox2.mo9885i());
            }
        }
    }

    /* renamed from: b */
    public final void mo5437b(Throwable th) {
        b41 b41 = (b41) this.f12097d.f13739e.mo7012g();
        C1605cv b = b41 == null ? dt2.m8097b(th, (f52) null) : b41.mo6881a().mo12172a(th);
        synchronized (this.f12097d) {
            this.f12097d.f13743i = null;
            if (b41 != null) {
                b41.mo5669c().mo7808d(b);
                if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10415W5)).booleanValue()) {
                    this.f12097d.f13736b.execute(new nm2(this, b));
                }
            } else {
                this.f12097d.f13738d.mo7808d(b);
                ((b41) this.f12097d.m16338l(this.f12096c).mo6106f()).mo6881a().mo12173c().mo7334a();
            }
            zs2.m20831b(b.f5529f, th, "AppOpenAdLoader.onFailure");
            this.f12094a.zza();
            if (this.f12095b != null) {
                qx2 g = this.f12097d.f13741g;
                ox2 ox2 = this.f12095b;
                ox2.mo9879c(b);
                ox2.mo9883g(false);
                g.mo10426a(ox2.mo9885i());
            }
        }
    }
}
