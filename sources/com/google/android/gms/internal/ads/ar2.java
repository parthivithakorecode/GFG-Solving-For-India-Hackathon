package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final class ar2 implements nb3<hs1> {

    /* renamed from: a */
    final /* synthetic */ bd2 f4310a;

    /* renamed from: b */
    final /* synthetic */ ox2 f4311b;

    /* renamed from: c */
    final /* synthetic */ cr2 f4312c;

    /* renamed from: d */
    final /* synthetic */ er2 f4313d;

    ar2(er2 er2, bd2 bd2, ox2 ox2, cr2 cr2) {
        this.f4313d = er2;
        this.f4310a = bd2;
        this.f4311b = ox2;
        this.f4312c = cr2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5436a(Object obj) {
        hs1 hs1 = (hs1) obj;
        synchronized (this.f4313d) {
            hs1.mo11411e().mo7923d(this.f4313d.f6342d);
            this.f4310a.mo5807a(hs1);
            Executor g = this.f4313d.f6340b;
            tq2 e = this.f4313d.f6342d;
            e.getClass();
            g.execute(new yq2(e));
            this.f4313d.f6342d.mo7709y();
            if (this.f4311b != null) {
                qx2 f = this.f4313d.f6345g;
                ox2 ox2 = this.f4311b;
                ox2.mo9880d(hs1.mo11413g().f5904b);
                ox2.mo9881e(hs1.mo11409c().mo9702b());
                ox2.mo9883g(true);
                f.mo10426a(ox2.mo9885i());
            }
        }
    }

    /* renamed from: b */
    public final void mo5437b(Throwable th) {
        ms1 ms1 = (ms1) this.f4313d.f6343e.mo7012g();
        C1605cv b = ms1 == null ? dt2.m8097b(th, (f52) null) : ms1.mo6881a().mo12172a(th);
        synchronized (this.f4313d) {
            if (ms1 != null) {
                ms1.mo9361b().mo7808d(b);
                this.f4313d.f6340b.execute(new zq2(this, b));
            } else {
                this.f4313d.f6342d.mo7808d(b);
                this.f4313d.m8687j(this.f4312c).mo9015b().mo6881a().mo12173c().mo7334a();
            }
            zs2.m20831b(b.f5529f, th, "RewardedAdLoader.onFailure");
            if (this.f4311b != null) {
                qx2 f = this.f4313d.f6345g;
                ox2 ox2 = this.f4311b;
                ox2.mo9879c(b);
                ox2.mo9883g(false);
                f.mo10426a(ox2.mo9885i());
            }
            this.f4310a.zza();
        }
    }
}
