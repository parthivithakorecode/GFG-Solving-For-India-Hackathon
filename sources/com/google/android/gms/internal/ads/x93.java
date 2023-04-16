package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

final class x93 {

    /* renamed from: d */
    static final x93 f17091d = new x93();
    @CheckForNull

    /* renamed from: a */
    final Runnable f17092a;
    @CheckForNull

    /* renamed from: b */
    final Executor f17093b;
    @CheckForNull

    /* renamed from: c */
    x93 f17094c;

    x93() {
        this.f17092a = null;
        this.f17093b = null;
    }

    x93(Runnable runnable, Executor executor) {
        this.f17092a = runnable;
        this.f17093b = executor;
    }
}
