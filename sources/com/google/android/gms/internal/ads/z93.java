package com.google.android.gms.internal.ads;

final class z93<V> implements Runnable {

    /* renamed from: f */
    final ga3<V> f18118f;

    /* renamed from: g */
    final cc3<? extends V> f18119g;

    z93(ga3<V> ga3, cc3<? extends V> cc3) {
        this.f18118f = ga3;
        this.f18119g = cc3;
    }

    public final void run() {
        if (this.f18118f.f7337f == this) {
            if (ga3.f7335k.mo5202d(this.f18118f, this, ga3.m9588g(this.f18119g))) {
                ga3.m9584D(this.f18118f);
            }
        }
    }
}
