package com.google.android.gms.internal.ads;

import p003a2.C0052c;
import p160x1.C4280b;

/* renamed from: com.google.android.gms.internal.ads.hq */
final class C1786hq implements C0052c.C0054b {

    /* renamed from: a */
    final /* synthetic */ C1823iq f8382a;

    C1786hq(C1823iq iqVar) {
        this.f8382a = iqVar;
    }

    /* renamed from: n0 */
    public final void mo196n0(C4280b bVar) {
        synchronized (this.f8382a.f8754b) {
            this.f8382a.f8757e = null;
            if (this.f8382a.f8755c != null) {
                this.f8382a.f8755c = null;
            }
            this.f8382a.f8754b.notifyAll();
        }
    }
}
