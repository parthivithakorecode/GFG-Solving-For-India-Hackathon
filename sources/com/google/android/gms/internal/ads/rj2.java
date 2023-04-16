package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

public final class rj2 implements hj2<Bundle> {

    /* renamed from: a */
    public final String f13656a;

    /* renamed from: b */
    public final int f13657b;

    /* renamed from: c */
    public final int f13658c;

    /* renamed from: d */
    public final int f13659d;

    /* renamed from: e */
    public final boolean f13660e;

    /* renamed from: f */
    public final int f13661f;

    public rj2(String str, int i, int i2, int i3, boolean z, int i4) {
        this.f13656a = str;
        this.f13657b = i;
        this.f13658c = i2;
        this.f13659d = i3;
        this.f13660e = z;
        this.f13661f = i4;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f13656a;
        boolean z = true;
        vs2.m18664g(bundle, "carrier", str, !TextUtils.isEmpty(str));
        Integer valueOf = Integer.valueOf(this.f13657b);
        if (this.f13657b == -2) {
            z = false;
        }
        vs2.m18663f(bundle, "cnt", valueOf, z);
        bundle.putInt("gnt", this.f13658c);
        bundle.putInt("pt", this.f13659d);
        Bundle a = vs2.m18658a(bundle, "device");
        bundle.putBundle("device", a);
        Bundle a2 = vs2.m18658a(a, "network");
        a.putBundle("network", a2);
        a2.putInt("active_network_state", this.f13661f);
        a2.putBoolean("active_network_metered", this.f13660e);
    }
}
