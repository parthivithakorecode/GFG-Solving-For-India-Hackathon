package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

class fc3 extends ja3 {

    /* renamed from: f */
    private final ExecutorService f6794f;

    fc3(ExecutorService executorService) {
        Objects.requireNonNull(executorService);
        this.f6794f = executorService;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f6794f.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f6794f.execute(runnable);
    }

    public final boolean isShutdown() {
        return this.f6794f.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f6794f.isTerminated();
    }

    public final void shutdown() {
        this.f6794f.shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return this.f6794f.shutdownNow();
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f6794f);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2 + valueOf.length());
        sb.append(obj);
        sb.append("[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
