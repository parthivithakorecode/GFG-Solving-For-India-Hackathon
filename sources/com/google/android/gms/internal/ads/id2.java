package com.google.android.gms.internal.ads;

final class id2 implements nb3<v61> {

    /* renamed from: a */
    final /* synthetic */ bd2 f8618a;

    /* renamed from: b */
    final /* synthetic */ ox2 f8619b;

    /* renamed from: c */
    final /* synthetic */ dl1 f8620c;

    /* renamed from: d */
    final /* synthetic */ jd2 f8621d;

    id2(jd2 jd2, bd2 bd2, ox2 ox2, dl1 dl1) {
        this.f8621d = jd2;
        this.f8618a = bd2;
        this.f8619b = ox2;
        this.f8620c = dl1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5436a(Object obj) {
        v61 v61 = (v61) obj;
        synchronized (this.f8621d) {
            v61.mo11411e().mo7920a(this.f8621d.f9104d.mo12204d());
            this.f8618a.mo5807a(v61);
            this.f8621d.f9102b.mo5599d().execute(new gd2(this));
            if (this.f8619b != null) {
                qx2 d = this.f8621d.f9105e;
                ox2 ox2 = this.f8619b;
                ox2.mo9880d(v61.mo11413g().f5904b);
                ox2.mo9881e(v61.mo11409c().mo9702b());
                ox2.mo9883g(true);
                d.mo10426a(ox2.mo9885i());
            }
        }
    }

    /* renamed from: b */
    public final void mo5437b(Throwable th) {
        C1605cv a = this.f8620c.mo6496a().mo12172a(th);
        this.f8620c.mo6497b().mo7808d(a);
        this.f8621d.f9102b.mo5599d().execute(new hd2(this, a));
        zs2.m20831b(a.f5529f, th, "NativeAdLoader.onFailure");
        this.f8618a.zza();
        if (this.f8619b != null) {
            qx2 d = this.f8621d.f9105e;
            ox2 ox2 = this.f8619b;
            ox2.mo9879c(a);
            ox2.mo9883g(false);
            d.mo10426a(ox2.mo9885i());
        }
    }
}
