package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class yg2 implements hj2<Bundle> {

    /* renamed from: a */
    public final Bundle f17733a;

    public yg2(Bundle bundle) {
        this.f17733a = bundle;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a = vs2.m18658a(bundle, "device");
        a.putBundle("android_mem_info", this.f17733a);
        bundle.putBundle("device", a);
    }
}
