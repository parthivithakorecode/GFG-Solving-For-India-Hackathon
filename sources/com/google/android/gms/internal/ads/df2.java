package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class df2 implements hj2<Bundle> {

    /* renamed from: a */
    public final int f5785a;

    /* renamed from: b */
    public final boolean f5786b;

    /* renamed from: c */
    public final boolean f5787c;

    /* renamed from: d */
    public final int f5788d;

    /* renamed from: e */
    public final int f5789e;

    /* renamed from: f */
    public final int f5790f;

    /* renamed from: g */
    public final float f5791g;

    /* renamed from: h */
    public final boolean f5792h;

    public df2(int i, boolean z, boolean z2, int i2, int i3, int i4, float f, boolean z3) {
        this.f5785a = i;
        this.f5786b = z;
        this.f5787c = z2;
        this.f5788d = i2;
        this.f5789e = i3;
        this.f5790f = i4;
        this.f5791g = f;
        this.f5792h = z3;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.f5785a);
        bundle.putBoolean("ma", this.f5786b);
        bundle.putBoolean("sp", this.f5787c);
        bundle.putInt("muv", this.f5788d);
        bundle.putInt("rm", this.f5789e);
        bundle.putInt("riv", this.f5790f);
        bundle.putFloat("android_app_volume", this.f5791g);
        bundle.putBoolean("android_app_muted", this.f5792h);
    }
}
