package com.google.android.gms.internal.ads;

final class mr2 implements bd2<hs1> {

    /* renamed from: a */
    final /* synthetic */ or2 f11014a;

    mr2(or2 or2) {
        this.f11014a = or2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5807a(Object obj) {
        hs1 hs1 = (hs1) obj;
        synchronized (this.f11014a) {
            this.f11014a.f12174i = hs1;
            this.f11014a.f12174i.mo6842b();
        }
    }

    public final void zza() {
        synchronized (this.f11014a) {
            this.f11014a.f12174i = null;
        }
    }
}
