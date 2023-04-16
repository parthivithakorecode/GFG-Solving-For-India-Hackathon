package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zj */
final class C2446zj implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C1594ck f18261f;

    /* renamed from: g */
    final /* synthetic */ C1669ek f18262g;

    C2446zj(C1669ek ekVar, C1594ck ckVar) {
        this.f18262g = ekVar;
        this.f18261f = ckVar;
    }

    public final void run() {
        this.f18261f.mo6210a();
        int size = this.f18262g.f6254s.size();
        for (int i = 0; i < size; i++) {
            ((C2224tk) this.f18262g.f6254s.valueAt(i)).mo11004i();
        }
    }
}
