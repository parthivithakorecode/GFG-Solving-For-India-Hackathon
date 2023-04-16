package com.google.android.gms.internal.ads;

import p003a2.C0052c;
import p160x1.C4280b;

/* renamed from: com.google.android.gms.internal.ads.vq */
final class C2304vq implements C0052c.C0054b {

    /* renamed from: a */
    final /* synthetic */ bp0 f16382a;

    /* renamed from: b */
    final /* synthetic */ C2342wq f16383b;

    C2304vq(C2342wq wqVar, bp0 bp0) {
        this.f16383b = wqVar;
        this.f16382a = bp0;
    }

    /* renamed from: n0 */
    public final void mo196n0(C4280b bVar) {
        synchronized (this.f16383b.f16908d) {
            this.f16382a.mo5908f(new RuntimeException("Connection failed."));
        }
    }
}
