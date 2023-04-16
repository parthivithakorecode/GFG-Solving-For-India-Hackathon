package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

final class eb3<V> extends pa3<Object, V> {
    /* access modifiers changed from: private */
    @CheckForNull

    /* renamed from: u */
    public db3<?> f6160u;

    eb3(z63<? extends cc3<?>> z63, boolean z, Executor executor, Callable<V> callable) {
        super(z63, z, false);
        this.f6160u = new cb3(this, callable, executor);
        mo10004U();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final void mo5763M(int i) {
        super.mo5763M(i);
        if (i == 1) {
            this.f6160u = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final void mo5764S(int i, @CheckForNull Object obj) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final void mo5765T() {
        db3<?> db3 = this.f6160u;
        if (db3 != null) {
            db3.mo6436i();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo6898t() {
        db3<?> db3 = this.f6160u;
        if (db3 != null) {
            db3.mo5234g();
        }
    }
}
