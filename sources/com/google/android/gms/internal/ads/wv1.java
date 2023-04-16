package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
public final class wv1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final cw1 f16942a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f16943b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map<String, String> f16944c;

    public wv1(cw1 cw1, Executor executor) {
        this.f16942a = cw1;
        this.f16944c = cw1.mo6312c();
        this.f16943b = executor;
    }

    /* renamed from: a */
    public final vv1 mo11740a() {
        vv1 vv1 = new vv1(this);
        vv1 unused = vv1.f16422a.putAll(vv1.f16423b.f16944c);
        return vv1;
    }
}
