package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import p041f2.C2606c;
import p054h1.C2694t;
import p069j1.C3156f;
import p069j1.C3163g2;

public final class xi2 implements ij2<yi2> {

    /* renamed from: a */
    private final dc3 f17221a;

    /* renamed from: b */
    private final Context f17222b;

    /* renamed from: c */
    private final po0 f17223c;

    public xi2(dc3 dc3, Context context, po0 po0) {
        this.f17221a = dc3;
        this.f17222b = context;
        this.f17223c = po0;
    }

    /* renamed from: a */
    public final cc3<yi2> mo5813a() {
        return this.f17221a.mo6445C(new wi2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ yi2 mo11854b() {
        boolean g = C2606c.m21299a(this.f17222b).mo12497g();
        C2694t.m21608q();
        boolean i = C3163g2.m23933i(this.f17222b);
        String str = this.f17223c.f12729f;
        C2694t.m21609r();
        boolean s = C3156f.m23876s();
        C2694t.m21608q();
        ApplicationInfo applicationInfo = this.f17222b.getApplicationInfo();
        return new yi2(g, i, str, s, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.m5726c(this.f17222b, ModuleDescriptor.MODULE_ID), DynamiteModule.m5725a(this.f17222b, ModuleDescriptor.MODULE_ID));
    }
}
