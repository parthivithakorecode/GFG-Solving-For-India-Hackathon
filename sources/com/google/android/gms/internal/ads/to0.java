package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p054h1.C2694t;
import p069j1.C3163g2;
import p069j1.C3205s1;

final class to0 implements Executor {

    /* renamed from: f */
    private final Handler f14932f = new C3205s1(Looper.getMainLooper());

    to0() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                C2694t.m21608q();
                C3163g2.m23940p(C2694t.m21607p().mo11021c(), th);
                throw th;
            }
        } else {
            this.f14932f.post(runnable);
        }
    }
}
