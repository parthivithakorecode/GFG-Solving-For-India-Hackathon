package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

final class vb3<V> implements cc3<V> {

    /* renamed from: g */
    static final cc3<?> f16155g = new vb3((Object) null);

    /* renamed from: h */
    private static final Logger f16156h = Logger.getLogger(vb3.class.getName());

    /* renamed from: f */
    private final V f16157f;

    vb3(V v) {
        this.f16157f = v;
    }

    /* renamed from: b */
    public final void mo5905b(Runnable runnable, Executor executor) {
        q43.m15460c(runnable, "Runnable was null.");
        q43.m15460c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f16156h;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", sb.toString(), e);
        }
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final V get() {
        return this.f16157f;
    }

    public final V get(long j, TimeUnit timeUnit) {
        Objects.requireNonNull(timeUnit);
        return this.f16157f;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f16157f);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 27 + valueOf.length());
        sb.append(obj);
        sb.append("[status=SUCCESS, result=[");
        sb.append(valueOf);
        sb.append("]]");
        return sb.toString();
    }
}
