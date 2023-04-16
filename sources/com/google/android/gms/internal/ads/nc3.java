package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

final class nc3 extends TimeoutException {
    /* synthetic */ nc3(String str, mc3 mc3) {
        super(str);
    }

    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
