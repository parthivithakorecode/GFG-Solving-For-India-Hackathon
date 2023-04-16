package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class kf2 implements ij2<hj2<Bundle>> {

    /* renamed from: a */
    private final ko2 f9522a;

    kf2(ko2 ko2) {
        this.f9522a = ko2;
    }

    /* renamed from: a */
    public final cc3<hj2<Bundle>> mo5813a() {
        ko2 ko2 = this.f9522a;
        jf2 jf2 = null;
        if (!(ko2 == null || ko2.mo8724a() == null || this.f9522a.mo8724a().isEmpty())) {
            jf2 = new jf2(this);
        }
        return rb3.m16131i(jf2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo8659b(Bundle bundle) {
        bundle.putString("key_schema", this.f9522a.mo8724a());
    }
}
