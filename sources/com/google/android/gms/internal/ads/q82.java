package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

final class q82 implements nb3 {

    /* renamed from: a */
    final /* synthetic */ long f13089a;

    /* renamed from: b */
    final /* synthetic */ String f13090b;

    /* renamed from: c */
    final /* synthetic */ rr2 f13091c;

    /* renamed from: d */
    final /* synthetic */ ur2 f13092d;

    /* renamed from: e */
    final /* synthetic */ zx2 f13093e;

    /* renamed from: f */
    final /* synthetic */ ds2 f13094f;

    /* renamed from: g */
    final /* synthetic */ r82 f13095g;

    q82(r82 r82, long j, String str, rr2 rr2, ur2 ur2, zx2 zx2, ds2 ds2) {
        this.f13095g = r82;
        this.f13089a = j;
        this.f13090b = str;
        this.f13091c = rr2;
        this.f13092d = ur2;
        this.f13093e = zx2;
        this.f13094f = ds2;
    }

    /* renamed from: a */
    public final void mo5436a(Object obj) {
        long b = this.f13095g.f13536a.mo12463b() - this.f13089a;
        r82.m16095g(this.f13095g, this.f13090b, 0, b, this.f13091c.f13891d0);
        if (this.f13095g.f13540e) {
            this.f13095g.f13537b.mo10748a(this.f13092d, this.f13091c, 0, (e52) null, b);
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10484e6)).booleanValue()) {
            this.f13095g.f13541f.mo7237d(this.f13091c, b, (C1605cv) null);
        }
    }

    /* renamed from: b */
    public final void mo5437b(Throwable th) {
        C1605cv cvVar;
        long b = this.f13095g.f13536a.mo12463b() - this.f13089a;
        int i = th instanceof TimeoutException ? 2 : th instanceof f82 ? 3 : th instanceof CancellationException ? 4 : th instanceof ps2 ? 5 : (!(th instanceof fz1) || dt2.m8096a(th).f5529f != 3) ? 6 : 1;
        r82.m16095g(this.f13095g, this.f13090b, i, b, this.f13091c.f13891d0);
        if (this.f13095g.f13540e) {
            this.f13095g.f13537b.mo10748a(this.f13092d, this.f13091c, i, th instanceof e52 ? (e52) th : null, b);
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10502g6)).booleanValue()) {
            cy2 c = this.f13095g.f13538c;
            zx2 zx2 = this.f13093e;
            ds2 ds2 = this.f13094f;
            rr2 rr2 = this.f13091c;
            c.mo6340c(zx2.mo12280a(ds2, rr2, rr2.f13909o));
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10484e6)).booleanValue()) {
            C1605cv a = dt2.m8096a(th);
            int i2 = a.f5529f;
            if ((i2 == 3 || i2 == 0) && (cvVar = a.f5532i) != null && !cvVar.f5531h.equals("com.google.android.gms.ads")) {
                a = dt2.m8096a(new e52(13, a.f5532i));
            }
            this.f13095g.f13541f.mo7237d(this.f13091c, b, a);
        }
    }
}
