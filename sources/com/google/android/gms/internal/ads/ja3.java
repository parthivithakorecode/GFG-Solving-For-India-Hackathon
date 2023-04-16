package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

public abstract class ja3 extends AbstractExecutorService implements dc3 {
    /* renamed from: C */
    public final <T> cc3<T> mo6445C(Callable<T> callable) {
        return (cc3) super.submit(callable);
    }

    /* renamed from: I */
    public final cc3<?> mo6446I(Runnable runnable) {
        return (cc3) super.submit(runnable);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return rc3.m16145F(runnable, t);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new rc3(callable);
    }

    public final /* synthetic */ Future submit(Runnable runnable) {
        return (cc3) super.submit(runnable);
    }

    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (cc3) super.submit(runnable, obj);
    }

    public final /* synthetic */ Future submit(Callable callable) {
        return (cc3) super.submit(callable);
    }
}
