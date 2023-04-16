package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.concurrent.GuardedBy;

public final class bt2<T> {
    @GuardedBy("this")

    /* renamed from: a */
    private final Deque<cc3<T>> f5034a = new LinkedBlockingDeque();

    /* renamed from: b */
    private final Callable<T> f5035b;

    /* renamed from: c */
    private final dc3 f5036c;

    public bt2(Callable<T> callable, dc3 dc3) {
        this.f5035b = callable;
        this.f5036c = dc3;
    }

    /* renamed from: a */
    public final synchronized cc3<T> mo5943a() {
        mo5945c(1);
        return this.f5034a.poll();
    }

    /* renamed from: b */
    public final synchronized void mo5944b(cc3<T> cc3) {
        this.f5034a.addFirst(cc3);
    }

    /* renamed from: c */
    public final synchronized void mo5945c(int i) {
        int size = i - this.f5034a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f5034a.add(this.f5036c.mo6445C(this.f5035b));
        }
    }
}
