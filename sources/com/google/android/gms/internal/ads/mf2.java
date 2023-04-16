package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.hj2;
import p034e2.C2547d;

final class mf2<S extends hj2<?>> {

    /* renamed from: a */
    public final cc3<S> f10828a;

    /* renamed from: b */
    private final long f10829b;

    /* renamed from: c */
    private final C2547d f10830c;

    public mf2(cc3<S> cc3, long j, C2547d dVar) {
        this.f10828a = cc3;
        this.f10830c = dVar;
        this.f10829b = dVar.mo12463b() + j;
    }

    /* renamed from: a */
    public final boolean mo9230a() {
        return this.f10829b < this.f10830c.mo12463b();
    }
}
