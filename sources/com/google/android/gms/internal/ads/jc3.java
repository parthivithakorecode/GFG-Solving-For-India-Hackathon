package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class jc3 {
    /* renamed from: a */
    public static dc3 m11563a(ExecutorService executorService) {
        if (executorService instanceof dc3) {
            return (dc3) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new ic3((ScheduledExecutorService) executorService) : new fc3(executorService);
    }

    /* renamed from: b */
    public static Executor m11564b() {
        return fb3.INSTANCE;
    }

    /* renamed from: c */
    static Executor m11565c(Executor executor, ga3<?> ga3) {
        Objects.requireNonNull(executor);
        return executor == fb3.INSTANCE ? executor : new ec3(executor, ga3);
    }
}
