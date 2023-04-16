package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class hf2 implements hj2<Bundle> {

    /* renamed from: a */
    public final double f8197a;

    /* renamed from: b */
    public final boolean f8198b;

    public hf2(double d, boolean z) {
        this.f8197a = d;
        this.f8198b = z;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a = vs2.m18658a(bundle, "device");
        bundle.putBundle("device", a);
        Bundle a2 = vs2.m18658a(a, "battery");
        a.putBundle("battery", a2);
        a2.putBoolean("is_charging", this.f8198b);
        a2.putDouble("battery_level", this.f8197a);
    }
}
