package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

public final class g82 extends i82<d71> {

    /* renamed from: a */
    private final bw0 f7303a;

    /* renamed from: b */
    private final yk1 f7304b;

    /* renamed from: c */
    private final fa1 f7305c;

    /* renamed from: d */
    private final og1 f7306d;

    public g82(bw0 bw0, yk1 yk1, fa1 fa1, og1 og1) {
        this.f7303a = bw0;
        this.f7304b = yk1;
        this.f7305c = fa1;
        this.f7306d = og1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final cc3<d71> mo7527c(ks2 ks2, Bundle bundle) {
        cl1 o = this.f7303a.mo5607o();
        fa1 fa1 = this.f7305c;
        fa1.mo7277f(ks2);
        fa1.mo7275d(bundle);
        o.mo6216n(fa1.mo7278g());
        o.mo6217r(this.f7306d);
        o.mo6214g(this.f7304b);
        o.mo6215h(new q41((ViewGroup) null));
        z71<d71> a = o.mo6213e().mo6496a();
        return a.mo12178h(a.mo12179i());
    }
}
