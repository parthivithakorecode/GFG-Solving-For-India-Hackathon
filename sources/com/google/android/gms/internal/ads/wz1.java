package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import p041f2.C2606c;

public final class wz1 implements kv3<PackageInfo> {

    /* renamed from: a */
    private final yv3<Context> f16964a;

    /* renamed from: b */
    private final yv3<ApplicationInfo> f16965b;

    public wz1(yv3<Context> yv3, yv3<ApplicationInfo> yv32) {
        this.f16964a = yv3;
        this.f16965b = yv32;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        try {
            return C2606c.m21299a(this.f16964a.mo5051a()).mo12496f(((rz1) this.f16965b).mo5051a().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
