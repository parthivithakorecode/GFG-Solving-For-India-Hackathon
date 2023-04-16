package com.google.android.gms.internal.ads;

import java.util.Objects;

final class pc3 extends ac3<cc3> {

    /* renamed from: h */
    private final wa3 f12603h;

    /* renamed from: i */
    final /* synthetic */ rc3 f12604i;

    pc3(rc3 rc3, wa3 wa3) {
        this.f12604i = rc3;
        Objects.requireNonNull(wa3);
        this.f12603h = wa3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5229a() {
        cc3 zza = this.f12603h.zza();
        q43.m15461d(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f12603h);
        return zza;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo5230b() {
        return this.f12603h.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo5231d(Throwable th) {
        this.f12604i.mo7555x(th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo5232e(Object obj) {
        this.f12604i.mo7556y((cc3) obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo5233f() {
        return this.f12604i.isDone();
    }
}
