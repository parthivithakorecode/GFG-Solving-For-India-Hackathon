package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

public final /* synthetic */ class e24 implements Executor {

    /* renamed from: f */
    public final /* synthetic */ Handler f6060f;

    public /* synthetic */ e24(Handler handler) {
        this.f6060f = handler;
    }

    public final void execute(Runnable runnable) {
        this.f6060f.post(runnable);
    }
}
