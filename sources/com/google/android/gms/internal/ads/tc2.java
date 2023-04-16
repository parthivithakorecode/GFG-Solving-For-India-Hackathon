package com.google.android.gms.internal.ads;

final class tc2 implements bd2<ij1> {

    /* renamed from: a */
    final /* synthetic */ uc2 f14820a;

    tc2(uc2 uc2) {
        this.f14820a = uc2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5807a(Object obj) {
        ij1 ij1 = (ij1) obj;
        synchronized (this.f14820a) {
            this.f14820a.f15507l = ij1;
            this.f14820a.f15507l.mo6842b();
        }
    }

    public final void zza() {
        synchronized (this.f14820a) {
            this.f14820a.f15507l = null;
        }
    }
}
