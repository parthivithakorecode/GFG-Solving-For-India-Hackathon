package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

public final /* synthetic */ class d22 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ cc3 f5625a;

    /* renamed from: b */
    public final /* synthetic */ cc3 f5626b;

    public /* synthetic */ d22(cc3 cc3, cc3 cc32) {
        this.f5625a = cc3;
        this.f5626b = cc32;
    }

    public final Object call() {
        return new s22((JSONObject) this.f5625a.get(), (yi0) this.f5626b.get());
    }
}
