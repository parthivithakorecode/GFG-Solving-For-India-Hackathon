package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class kb3<V> extends v63 implements Future<V> {
    protected kb3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Future<? extends V> mo8650f();

    public final V get() {
        return mo8650f().get();
    }

    public final V get(long j, TimeUnit timeUnit) {
        return mo8650f().get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return mo8650f().isCancelled();
    }

    public final boolean isDone() {
        return mo8650f().isDone();
    }
}
