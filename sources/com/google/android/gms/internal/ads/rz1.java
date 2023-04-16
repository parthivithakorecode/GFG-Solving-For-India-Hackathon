package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

public final class rz1 implements kv3<ApplicationInfo> {

    /* renamed from: a */
    private final yv3<Context> f14177a;

    public rz1(yv3<Context> yv3) {
        this.f14177a = yv3;
    }

    /* renamed from: b */
    public final ApplicationInfo mo5051a() {
        ApplicationInfo applicationInfo = this.f14177a.mo5051a().getApplicationInfo();
        sv3.m16997b(applicationInfo);
        return applicationInfo;
    }
}
