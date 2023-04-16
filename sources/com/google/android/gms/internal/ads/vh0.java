package com.google.android.gms.internal.ads;

import java.lang.Thread;

final class vh0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ Thread.UncaughtExceptionHandler f16288a;

    /* renamed from: b */
    final /* synthetic */ xh0 f16289b;

    vh0(xh0 xh0, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f16289b = xh0;
        this.f16288a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f16289b.mo11848e(thread, th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f16288a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f16288a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
