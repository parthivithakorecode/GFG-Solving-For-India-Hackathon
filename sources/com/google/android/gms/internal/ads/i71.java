package com.google.android.gms.internal.ads;

final class i71 implements nb3<d71> {

    /* renamed from: a */
    final /* synthetic */ nb3 f8558a;

    /* renamed from: b */
    final /* synthetic */ k71 f8559b;

    i71(k71 k71, nb3 nb3) {
        this.f8559b = k71;
        this.f8558a = nb3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5436a(Object obj) {
        k71.m12039b(this.f8559b, ((d71) obj).f5675a, this.f8558a);
    }

    /* renamed from: b */
    public final void mo5437b(Throwable th) {
        this.f8558a.mo5437b(th);
        wo0.f16890e.execute(new g71(this.f8559b));
    }
}
