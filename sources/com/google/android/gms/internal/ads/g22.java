package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

public final /* synthetic */ class g22 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ cc3 f7235a;

    /* renamed from: b */
    public final /* synthetic */ cc3 f7236b;

    /* renamed from: c */
    public final /* synthetic */ cc3 f7237c;

    public /* synthetic */ g22(cc3 cc3, cc3 cc32, cc3 cc33) {
        this.f7235a = cc3;
        this.f7236b = cc32;
        this.f7237c = cc33;
    }

    public final Object call() {
        return new l22((p22) this.f7235a.get(), (JSONObject) this.f7236b.get(), (yi0) this.f7237c.get());
    }
}
