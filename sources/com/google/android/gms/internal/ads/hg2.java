package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class hg2 implements hj2<Bundle> {

    /* renamed from: a */
    public final String f8218a;

    /* renamed from: b */
    public final boolean f8219b;

    public hg2(String str, boolean z) {
        this.f8218a = str;
        this.f8219b = z;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.f8218a);
        if (this.f8219b) {
            bundle.putString("de", "1");
        }
    }
}
