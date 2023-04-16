package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class nj2 implements hj2<Bundle> {

    /* renamed from: a */
    public final boolean f11500a;

    /* renamed from: b */
    public final boolean f11501b;

    /* renamed from: c */
    public final String f11502c;

    /* renamed from: d */
    public final boolean f11503d;

    /* renamed from: e */
    public final boolean f11504e;

    /* renamed from: f */
    public final boolean f11505f;

    /* renamed from: g */
    public final String f11506g;

    /* renamed from: h */
    public final ArrayList<String> f11507h;

    /* renamed from: i */
    public final String f11508i;

    /* renamed from: j */
    public final String f11509j;

    /* renamed from: k */
    public final String f11510k;

    /* renamed from: l */
    public final boolean f11511l;

    /* renamed from: m */
    public final String f11512m;

    /* renamed from: n */
    public final long f11513n;

    public nj2(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList<String> arrayList, @Nullable String str3, @Nullable String str4, String str5, boolean z6, String str6, long j) {
        this.f11500a = z;
        this.f11501b = z2;
        this.f11502c = str;
        this.f11503d = z3;
        this.f11504e = z4;
        this.f11505f = z5;
        this.f11506g = str2;
        this.f11507h = arrayList;
        this.f11508i = str3;
        this.f11509j = str4;
        this.f11510k = str5;
        this.f11511l = z6;
        this.f11512m = str6;
        this.f11513n = j;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f11500a);
        bundle.putBoolean("coh", this.f11501b);
        bundle.putString("gl", this.f11502c);
        bundle.putBoolean("simulator", this.f11503d);
        bundle.putBoolean("is_latchsky", this.f11504e);
        bundle.putBoolean("is_sidewinder", this.f11505f);
        bundle.putString("hl", this.f11506g);
        if (!this.f11507h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.f11507h);
        }
        bundle.putString("mv", this.f11508i);
        bundle.putString("submodel", this.f11512m);
        Bundle a = vs2.m18658a(bundle, "device");
        bundle.putBundle("device", a);
        a.putString("build", this.f11510k);
        a.putLong("remaining_data_partition_space", this.f11513n);
        Bundle a2 = vs2.m18658a(a, "browser");
        a.putBundle("browser", a2);
        a2.putBoolean("is_browser_custom_tabs_capable", this.f11511l);
        if (!TextUtils.isEmpty(this.f11509j)) {
            Bundle a3 = vs2.m18658a(a, "play_store");
            a.putBundle("play_store", a3);
            a3.putString("package_version", this.f11509j);
        }
    }
}
