package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class k71 {

    /* renamed from: a */
    private final Executor f9414a;

    /* renamed from: b */
    private final ScheduledExecutorService f9415b;

    /* renamed from: c */
    private final cc3<d71> f9416c;

    /* renamed from: d */
    private volatile boolean f9417d = true;

    public k71(Executor executor, ScheduledExecutorService scheduledExecutorService, cc3<d71> cc3) {
        this.f9414a = executor;
        this.f9415b = scheduledExecutorService;
        this.f9416c = cc3;
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m12039b(k71 k71, List list, nb3 nb3) {
        if (list == null || list.isEmpty()) {
            k71.f9414a.execute(new h71(nb3));
            return;
        }
        cc3<O> i = rb3.m16131i(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i = rb3.m16136n(rb3.m16129g(i, Throwable.class, new f71(nb3), k71.f9414a), new e71(k71, nb3, (cc3) it.next()), k71.f9414a);
        }
        rb3.m16140r(i, new j71(k71, nb3), k71.f9414a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ cc3 mo8629a(nb3 nb3, cc3 cc3, v61 v61) {
        if (v61 != null) {
            nb3.mo5436a(v61);
        }
        return rb3.m16137o(cc3, n30.f11278b.mo9928e().longValue(), TimeUnit.MILLISECONDS, this.f9415b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo8630d() {
        this.f9417d = false;
    }

    /* renamed from: e */
    public final void mo8631e(nb3<v61> nb3) {
        rb3.m16140r(this.f9416c, new i71(this, nb3), this.f9414a);
    }

    /* renamed from: f */
    public final boolean mo8632f() {
        return this.f9417d;
    }
}
