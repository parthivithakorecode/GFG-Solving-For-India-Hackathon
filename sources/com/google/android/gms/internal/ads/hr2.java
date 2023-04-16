package com.google.android.gms.internal.ads;

final class hr2 implements bd2<hs1> {

    /* renamed from: a */
    final /* synthetic */ ir2 f8395a;

    hr2(ir2 ir2) {
        this.f8395a = ir2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5807a(Object obj) {
        hs1 hs1 = (hs1) obj;
        synchronized (this.f8395a) {
            this.f8395a.f8771k = hs1;
            this.f8395a.f8771k.mo6842b();
        }
    }

    public final void zza() {
        synchronized (this.f8395a) {
            this.f8395a.f8771k = null;
        }
    }
}
