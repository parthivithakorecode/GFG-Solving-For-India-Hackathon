package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

final class qc3 extends ac3 {

    /* renamed from: h */
    private final Callable f13127h;

    /* renamed from: i */
    final /* synthetic */ rc3 f13128i;

    qc3(rc3 rc3, Callable callable) {
        this.f13128i = rc3;
        Objects.requireNonNull(callable);
        this.f13127h = callable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo5229a() {
        return this.f13127h.call();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo5230b() {
        return this.f13127h.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo5231d(Throwable th) {
        this.f13128i.mo7555x(th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo5232e(Object obj) {
        this.f13128i.mo7554w(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo5233f() {
        return this.f13128i.isDone();
    }
}
