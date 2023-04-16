package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.cc */
final class C1586cc implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f5372a = Executors.defaultThreadFactory();

    /* renamed from: b */
    private final AtomicInteger f5373b = new AtomicInteger(1);

    C1586cc() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f5372a.newThread(runnable);
        int andIncrement = this.f5373b.getAndIncrement();
        StringBuilder sb = new StringBuilder(16);
        sb.append("gads-");
        sb.append(andIncrement);
        newThread.setName(sb.toString());
        return newThread;
    }
}
