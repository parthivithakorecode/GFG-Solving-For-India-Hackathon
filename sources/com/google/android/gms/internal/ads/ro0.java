package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

final class ro0 extends ScheduledThreadPoolExecutor {
    ro0(int i, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
