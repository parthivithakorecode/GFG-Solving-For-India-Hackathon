package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class ge2 implements hj2<Bundle> {

    /* renamed from: a */
    private final Bundle f7403a;

    /* synthetic */ ge2(Bundle bundle, fe2 fe2) {
        this.f7403a = bundle;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.f7403a.isEmpty()) {
            bundle.putBundle("installed_adapter_data", this.f7403a);
        }
    }
}
