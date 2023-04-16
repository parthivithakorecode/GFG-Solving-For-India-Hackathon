package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import p069j1.C3208t1;

public final class aa1 {

    /* renamed from: a */
    private final nw2 f4031a;

    /* renamed from: b */
    private final po0 f4032b;

    /* renamed from: c */
    private final ApplicationInfo f4033c;

    /* renamed from: d */
    private final String f4034d;

    /* renamed from: e */
    private final List<String> f4035e;

    /* renamed from: f */
    private final PackageInfo f4036f;

    /* renamed from: g */
    private final ev3<cc3<String>> f4037g;

    /* renamed from: h */
    private final String f4038h;

    /* renamed from: i */
    private final lj2<Bundle> f4039i;

    public aa1(nw2 nw2, po0 po0, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, ev3<cc3<String>> ev3, C3208t1 t1Var, String str2, lj2<Bundle> lj2) {
        this.f4031a = nw2;
        this.f4032b = po0;
        this.f4033c = applicationInfo;
        this.f4034d = str;
        this.f4035e = list;
        this.f4036f = packageInfo;
        this.f4037g = ev3;
        this.f4038h = str2;
        this.f4039i = lj2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ vi0 mo5195a(cc3 cc3) {
        return new vi0((Bundle) cc3.get(), this.f4032b, this.f4033c, this.f4034d, this.f4035e, this.f4036f, (String) this.f4037g.mo7166a().get(), this.f4038h, (au2) null, (String) null);
    }

    /* renamed from: b */
    public final cc3<Bundle> mo5196b() {
        nw2 nw2 = this.f4031a;
        return wv2.m19224c(this.f4039i.mo8966a(new Bundle()), gw2.SIGNALS, nw2).mo6681a();
    }

    /* renamed from: c */
    public final cc3<vi0> mo5197c() {
        cc3<Bundle> b = mo5196b();
        return this.f4031a.mo7175a(gw2.REQUEST_PARCEL, b, this.f4037g.mo7166a()).mo11315a(new z91(this, b)).mo6681a();
    }
}
