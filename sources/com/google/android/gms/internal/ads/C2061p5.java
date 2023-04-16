package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.p5 */
final class C2061p5 implements Executor {

    /* renamed from: f */
    final /* synthetic */ Handler f12524f;

    C2061p5(C2135r5 r5Var, Handler handler) {
        this.f12524f = handler;
    }

    public final void execute(Runnable runnable) {
        this.f12524f.post(runnable);
    }
}
