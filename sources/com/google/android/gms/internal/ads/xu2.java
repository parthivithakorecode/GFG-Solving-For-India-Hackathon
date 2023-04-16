package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class xu2 implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f17356a = new AtomicInteger(1);

    xu2() {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f17356a.getAndIncrement();
        StringBuilder sb = new StringBuilder(25);
        sb.append("AdWorker(NG) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
