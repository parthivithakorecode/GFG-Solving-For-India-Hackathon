package com.google.ads.mediation;

import p002a1.C0030n;
import p076k1.C3296a;
import p076k1.C3297b;
import p083l1.C3457n;

/* renamed from: com.google.ads.mediation.i */
final class C1467i extends C3297b {

    /* renamed from: a */
    final AbstractAdViewAdapter f3700a;

    /* renamed from: b */
    final C3457n f3701b;

    public C1467i(AbstractAdViewAdapter abstractAdViewAdapter, C3457n nVar) {
        this.f3700a = abstractAdViewAdapter;
        this.f3701b = nVar;
    }

    /* renamed from: d */
    public final void mo31d(C0030n nVar) {
        this.f3701b.mo6921d(this.f3700a, nVar);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo32e(Object obj) {
        C3296a aVar = (C3296a) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f3700a;
        abstractAdViewAdapter.mInterstitialAd = aVar;
        aVar.mo6101c(new C1468j(abstractAdViewAdapter, this.f3701b));
        this.f3701b.mo6929l(this.f3700a);
    }
}
