package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

final class cb3 extends db3 {

    /* renamed from: j */
    private final Callable f5367j;

    /* renamed from: k */
    final /* synthetic */ eb3 f5368k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    cb3(eb3 eb3, Callable callable, Executor executor) {
        super(eb3, executor);
        this.f5368k = eb3;
        Objects.requireNonNull(callable);
        this.f5367j = callable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo5229a() {
        return this.f5367j.call();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo5230b() {
        return this.f5367j.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo6119h(Object obj) {
        this.f5368k.mo7554w(obj);
    }
}
