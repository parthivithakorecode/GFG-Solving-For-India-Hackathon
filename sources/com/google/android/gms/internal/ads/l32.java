package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final /* synthetic */ class l32 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ j32 f9884a;

    public /* synthetic */ l32(j32 j32) {
        this.f9884a = j32;
    }

    public final Object call() {
        return this.f9884a.getWritableDatabase();
    }
}
