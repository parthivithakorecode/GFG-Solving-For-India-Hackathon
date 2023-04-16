package com.google.android.gms.internal.ads;

final class rb2 implements bd2<t41> {

    /* renamed from: a */
    final /* synthetic */ sb2 f13583a;

    rb2(sb2 sb2) {
        this.f13583a = sb2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5807a(Object obj) {
        t41 t41 = (t41) obj;
        synchronized (this.f13583a) {
            if (this.f13583a.f14396l != null) {
                this.f13583a.f14396l.mo9123a();
            }
            this.f13583a.f14396l = t41;
            this.f13583a.f14396l.mo6842b();
        }
    }

    public final void zza() {
        synchronized (this.f13583a) {
            this.f13583a.f14396l = null;
        }
    }
}
