package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

final class jb3<V> extends ib3<V> {

    /* renamed from: m */
    private final cc3<V> f9084m;

    jb3(cc3<V> cc3) {
        Objects.requireNonNull(cc3);
        this.f9084m = cc3;
    }

    /* renamed from: b */
    public final void mo5905b(Runnable runnable, Executor executor) {
        this.f9084m.mo5905b(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.f9084m.cancel(z);
    }

    public final V get() {
        return this.f9084m.get();
    }

    public final V get(long j, TimeUnit timeUnit) {
        return this.f9084m.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.f9084m.isCancelled();
    }

    public final boolean isDone() {
        return this.f9084m.isDone();
    }

    public final String toString() {
        return this.f9084m.toString();
    }
}
