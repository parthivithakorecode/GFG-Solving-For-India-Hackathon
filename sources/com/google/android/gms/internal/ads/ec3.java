package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

final class ec3 implements Executor {

    /* renamed from: f */
    final /* synthetic */ Executor f6170f;

    /* renamed from: g */
    final /* synthetic */ ga3 f6171g;

    ec3(Executor executor, ga3 ga3) {
        this.f6170f = executor;
        this.f6171g = ga3;
    }

    public final void execute(Runnable runnable) {
        try {
            this.f6170f.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.f6171g.mo7555x(e);
        }
    }
}
