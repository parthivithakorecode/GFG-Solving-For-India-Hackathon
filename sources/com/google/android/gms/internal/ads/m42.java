package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final /* synthetic */ class m42 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ o42 f10721a;

    public /* synthetic */ m42(o42 o42) {
        this.f10721a = o42;
    }

    public final Object call() {
        return this.f10721a.getWritableDatabase();
    }
}
