package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final /* synthetic */ class f22 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ cc3 f6664a;

    /* renamed from: b */
    public final /* synthetic */ cc3 f6665b;

    public /* synthetic */ f22(cc3 cc3, cc3 cc32) {
        this.f6664a = cc3;
        this.f6665b = cc32;
    }

    public final Object call() {
        cc3 cc3 = this.f6664a;
        cc3 cc32 = this.f6665b;
        return new l22((p22) cc3.get(), ((j22) cc32.get()).f8953b, ((j22) cc32.get()).f8952a);
    }
}
