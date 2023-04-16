package com.google.android.gms.internal.ads;

import android.os.Bundle;
import p003a2.C0052c;

/* renamed from: com.google.android.gms.internal.ads.uq */
final class C2267uq implements C0052c.C0053a {

    /* renamed from: a */
    final /* synthetic */ C1971mq f15691a;

    /* renamed from: b */
    final /* synthetic */ bp0 f15692b;

    /* renamed from: c */
    final /* synthetic */ C2342wq f15693c;

    C2267uq(C2342wq wqVar, C1971mq mqVar, bp0 bp0) {
        this.f15693c = wqVar;
        this.f15691a = mqVar;
        this.f15692b = bp0;
    }

    /* renamed from: C0 */
    public final void mo139C0(Bundle bundle) {
        synchronized (this.f15693c.f16908d) {
            if (!this.f15693c.f16906b) {
                this.f15693c.f16906b = true;
                C1934lq a = this.f15693c.f16905a;
                if (a != null) {
                    cc3<?> I = wo0.f16886a.mo6446I(new C2156rq(this, a, this.f15691a, this.f15692b));
                    bp0 bp0 = this.f15692b;
                    bp0.mo5905b(new C2193sq(bp0, I), wo0.f16891f);
                }
            }
        }
    }

    /* renamed from: D */
    public final void mo140D(int i) {
    }
}
