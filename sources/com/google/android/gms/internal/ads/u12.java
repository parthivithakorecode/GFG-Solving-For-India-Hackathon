package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import p054h1.C2694t;
import p069j1.C3163g2;

public final class u12 {

    /* renamed from: a */
    private final dc3 f15330a;

    /* renamed from: b */
    private final a12 f15331b;

    /* renamed from: c */
    private final ev3<m22> f15332c;

    public u12(dc3 dc3, a12 a12, ev3<m22> ev3) {
        this.f15330a = dc3;
        this.f15331b = a12;
        this.f15332c = ev3;
    }

    /* renamed from: g */
    private final <RetT> cc3<RetT> m17651g(vi0 vi0, t12<InputStream> t12, t12<InputStream> t122, xa3<InputStream, RetT> xa3) {
        String str = vi0.f16313i;
        C2694t.m21608q();
        return rb3.m16129g(rb3.m16136n(ib3.m10985E(C3163g2.m23929g(str) ? rb3.m16130h(new k12(1)) : rb3.m16129g(t12.mo8848a(vi0), ExecutionException.class, s12.f14198a, this.f15330a)), xa3, this.f15330a), k12.class, new q12(this, t122, vi0, xa3), this.f15330a);
    }

    /* renamed from: a */
    public final cc3<vi0> mo11138a(vi0 vi0) {
        return m17651g(vi0, new l12(this.f15331b), new m12(this), new p12(vi0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ cc3 mo11139b(t12 t12, vi0 vi0, xa3 xa3, k12 k12) {
        return rb3.m16136n(t12.mo8848a(vi0), xa3, this.f15330a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ cc3 mo11140c(vi0 vi0) {
        return this.f15332c.mo7166a().mo9114z5(vi0, Binder.getCallingUid());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ cc3 mo11141d(vi0 vi0) {
        return this.f15331b.mo5060c(h30.f8030d.mo9928e().booleanValue() ? vi0.f16317m : vi0.f16319o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ cc3 mo11142e(vi0 vi0) {
        return this.f15332c.mo7166a().mo9111C5(h30.f8030d.mo9928e().booleanValue() ? vi0.f16317m : vi0.f16319o);
    }

    /* renamed from: f */
    public final cc3<Void> mo11143f(vi0 vi0) {
        if (C1846jc.m11557g(vi0.f16319o)) {
            return rb3.m16130h(new fz1(2, "Pool key missing from removeUrl call."));
        }
        return m17651g(vi0, new n12(this), new o12(this), r12.f13459a);
    }
}
