package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.hj2;
import java.util.concurrent.atomic.AtomicReference;
import p034e2.C2547d;

public final class nf2<S extends hj2> implements ij2<S> {

    /* renamed from: a */
    private final AtomicReference<mf2<S>> f11442a = new AtomicReference<>();

    /* renamed from: b */
    private final C2547d f11443b;

    /* renamed from: c */
    private final ij2<S> f11444c;

    /* renamed from: d */
    private final long f11445d;

    public nf2(ij2<S> ij2, long j, C2547d dVar) {
        this.f11443b = dVar;
        this.f11444c = ij2;
        this.f11445d = j;
    }

    /* renamed from: a */
    public final cc3<S> mo5813a() {
        mf2 mf2 = this.f11442a.get();
        if (mf2 == null || mf2.mo9230a()) {
            mf2 = new mf2(this.f11444c.mo5813a(), this.f11445d, this.f11443b);
            this.f11442a.set(mf2);
        }
        return mf2.f10828a;
    }
}
