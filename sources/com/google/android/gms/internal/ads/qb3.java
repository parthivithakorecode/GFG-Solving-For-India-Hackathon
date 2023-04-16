package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class qb3<V> {

    /* renamed from: a */
    private final boolean f13119a;

    /* renamed from: b */
    private final e73<cc3<? extends V>> f13120b;

    /* synthetic */ qb3(boolean z, e73 e73, pb3 pb3) {
        this.f13119a = z;
        this.f13120b = e73;
    }

    /* renamed from: a */
    public final <C> cc3<C> mo10266a(Callable<C> callable, Executor executor) {
        return new eb3(this.f13120b, this.f13119a, executor, callable);
    }
}
