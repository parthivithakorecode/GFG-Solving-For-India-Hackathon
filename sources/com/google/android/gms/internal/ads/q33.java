package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class q33 implements o33 {
    /* synthetic */ q33(p33 p33) {
    }

    /* renamed from: a */
    public final ExecutorService mo9638a(ThreadFactory threadFactory, int i) {
        return mo9639b(1, threadFactory, 1);
    }

    /* renamed from: b */
    public final ExecutorService mo9639b(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: d */
    public final ExecutorService mo9640d(int i) {
        return mo9639b(1, Executors.defaultThreadFactory(), 2);
    }
}
