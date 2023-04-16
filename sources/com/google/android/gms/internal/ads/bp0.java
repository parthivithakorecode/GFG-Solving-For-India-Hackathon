package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import p054h1.C2694t;

@ParametersAreNonnullByDefault
public class bp0<T> implements cc3<T> {

    /* renamed from: f */
    private final kc3<T> f4999f = kc3.m12110E();

    /* renamed from: a */
    private static final boolean m7010a(boolean z) {
        if (!z) {
            C2694t.m21607p().mo11033r(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    /* renamed from: b */
    public final void mo5905b(Runnable runnable, Executor executor) {
        this.f4999f.mo5905b(runnable, executor);
    }

    public boolean cancel(boolean z) {
        return this.f4999f.cancel(z);
    }

    /* renamed from: e */
    public final boolean mo5907e(T t) {
        boolean w = this.f4999f.mo7554w(t);
        m7010a(w);
        return w;
    }

    /* renamed from: f */
    public final boolean mo5908f(Throwable th) {
        boolean x = this.f4999f.mo7555x(th);
        m7010a(x);
        return x;
    }

    public final T get() {
        return this.f4999f.get();
    }

    public final T get(long j, TimeUnit timeUnit) {
        return this.f4999f.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.f4999f.isCancelled();
    }

    public final boolean isDone() {
        return this.f4999f.isDone();
    }
}
