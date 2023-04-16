package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

abstract class db3<T> extends ac3<T> {

    /* renamed from: h */
    private final Executor f5746h;

    /* renamed from: i */
    final /* synthetic */ eb3 f5747i;

    db3(eb3 eb3, Executor executor) {
        this.f5747i = eb3;
        Objects.requireNonNull(executor);
        this.f5746h = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo5231d(Throwable th) {
        this.f5747i.f6160u = null;
        if (th instanceof ExecutionException) {
            this.f5747i.mo7555x(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.f5747i.cancel(false);
        } else {
            this.f5747i.mo7555x(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo5232e(T t) {
        this.f5747i.f6160u = null;
        mo6119h(t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo5233f() {
        return this.f5747i.isDone();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract void mo6119h(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo6436i() {
        try {
            this.f5746h.execute(this);
        } catch (RejectedExecutionException e) {
            this.f5747i.mo7555x(e);
        }
    }
}
