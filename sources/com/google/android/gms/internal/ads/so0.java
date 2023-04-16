package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class so0 implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f14514a = new AtomicInteger(1);

    /* renamed from: b */
    final /* synthetic */ String f14515b;

    so0(String str) {
        this.f14515b = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f14515b;
        int andIncrement = this.f14514a.getAndIncrement();
        StringBuilder sb = new StringBuilder(str.length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
