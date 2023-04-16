package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

public final class rh2 implements ij2, hj2 {

    /* renamed from: a */
    private final ApplicationInfo f13647a;

    /* renamed from: b */
    private final PackageInfo f13648b;

    rh2(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.f13647a = applicationInfo;
        this.f13648b = packageInfo;
    }

    /* renamed from: a */
    public final cc3<hj2<Bundle>> mo5813a() {
        return rb3.m16131i(this);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f13647a.packageName;
        PackageInfo packageInfo = this.f13648b;
        String str2 = null;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (valueOf != null) {
            bundle.putInt("vc", valueOf.intValue());
        }
        PackageInfo packageInfo2 = this.f13648b;
        if (packageInfo2 != null) {
            str2 = packageInfo2.versionName;
        }
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
    }
}
