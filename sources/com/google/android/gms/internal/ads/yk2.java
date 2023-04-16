package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final /* synthetic */ class yk2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ cc3 f17778a;

    /* renamed from: b */
    public final /* synthetic */ cc3 f17779b;

    public /* synthetic */ yk2(cc3 cc3, cc3 cc32) {
        this.f17778a = cc3;
        this.f17779b = cc32;
    }

    public final Object call() {
        return new al2((String) this.f17778a.get(), (String) this.f17779b.get());
    }
}
