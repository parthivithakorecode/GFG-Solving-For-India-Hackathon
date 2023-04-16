package com.google.android.gms.internal.ads;

import p131s2.C4024d;
import p131s2.C4028h;

public final /* synthetic */ class t33 implements C4024d {

    /* renamed from: a */
    public final /* synthetic */ kc3 f14695a;

    public /* synthetic */ t33(kc3 kc3) {
        this.f14695a = kc3;
    }

    /* renamed from: a */
    public final void mo10935a(C4028h hVar) {
        kc3 kc3 = this.f14695a;
        if (hVar.mo15513k()) {
            kc3.cancel(false);
        } else if (hVar.mo15515m()) {
            kc3.mo7554w(hVar.mo15512j());
        } else {
            Exception i = hVar.mo15511i();
            if (i != null) {
                kc3.mo7555x(i);
                return;
            }
            throw new IllegalStateException();
        }
    }
}
