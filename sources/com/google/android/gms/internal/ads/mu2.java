package com.google.android.gms.internal.ads;

final class mu2 implements nb3<Void> {

    /* renamed from: a */
    final /* synthetic */ pu2 f11050a;

    /* renamed from: b */
    final /* synthetic */ qu2 f11051b;

    mu2(qu2 qu2, pu2 pu2) {
        this.f11051b = qu2;
        this.f11050a = pu2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5436a(Object obj) {
        Void voidR = (Void) obj;
        synchronized (this.f11051b) {
            this.f11051b.f13312e = null;
            this.f11051b.f13311d.addFirst(this.f11050a);
            if (this.f11051b.f13313f == 1) {
                this.f11051b.m15883h();
            }
        }
    }

    /* renamed from: b */
    public final void mo5437b(Throwable th) {
        synchronized (this.f11051b) {
            this.f11051b.f13312e = null;
        }
    }
}
