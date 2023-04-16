package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class yi2 implements hj2<Bundle> {

    /* renamed from: a */
    public final boolean f17755a;

    /* renamed from: b */
    public final boolean f17756b;

    /* renamed from: c */
    public final String f17757c;

    /* renamed from: d */
    public final boolean f17758d;

    /* renamed from: e */
    public final int f17759e;

    /* renamed from: f */
    public final int f17760f;

    /* renamed from: g */
    public final int f17761g;

    public yi2(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3) {
        this.f17755a = z;
        this.f17756b = z2;
        this.f17757c = str;
        this.f17758d = z3;
        this.f17759e = i;
        this.f17760f = i2;
        this.f17761g = i3;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.f17757c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) C2199sw.m17001c().mo8579b(m10.f10561n2));
        bundle.putInt("target_api", this.f17759e);
        bundle.putInt("dv", this.f17760f);
        bundle.putInt("lv", this.f17761g);
        Bundle a = vs2.m18658a(bundle, "sdk_env");
        a.putBoolean("mf", b30.f4659a.mo9928e().booleanValue());
        a.putBoolean("instant_app", this.f17755a);
        a.putBoolean("lite", this.f17756b);
        a.putBoolean("is_privileged_process", this.f17758d);
        bundle.putBundle("sdk_env", a);
        Bundle a2 = vs2.m18658a(a, "build_meta");
        a2.putString("cl", "428884702");
        a2.putString("rapid_rc", "dev");
        a2.putString("rapid_rollup", "HEAD");
        a.putBundle("build_meta", a2);
    }
}
