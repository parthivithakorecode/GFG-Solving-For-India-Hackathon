package com.google.android.gms.internal.ads;

import java.lang.Throwable;

final class q93<V, X extends Throwable> extends s93<V, X, xa3<? super X, ? extends V>, cc3<? extends V>> {
    q93(cc3<? extends V> cc3, Class<X> cls, xa3<? super X, ? extends V> xa3) {
        super(cc3, cls, xa3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final /* bridge */ /* synthetic */ Object mo10264F(Object obj, Throwable th) {
        xa3 xa3 = (xa3) obj;
        cc3 c = xa3.mo5074c(th);
        q43.m15461d(c, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", xa3);
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final /* synthetic */ void mo10265G(Object obj) {
        mo7556y((cc3) obj);
    }
}
