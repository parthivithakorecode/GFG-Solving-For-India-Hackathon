package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class mm0 implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f10931a = new AtomicInteger(1);

    mm0(pm0 pm0) {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f10931a.getAndIncrement();
        StringBuilder sb = new StringBuilder(42);
        sb.append("AdWorker(SCION_TASK_EXECUTOR) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
