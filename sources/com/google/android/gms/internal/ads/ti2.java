package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class ti2 implements hj2<Bundle> {

    /* renamed from: a */
    public final String f14872a;

    /* renamed from: b */
    public final String f14873b;

    /* renamed from: c */
    public final String f14874c;

    /* renamed from: d */
    public final String f14875d;

    /* renamed from: e */
    public final Long f14876e;

    public ti2(String str, String str2, String str3, String str4, Long l) {
        this.f14872a = str;
        this.f14873b = str2;
        this.f14874c = str3;
        this.f14875d = str4;
        this.f14876e = l;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        Bundle bundle = (Bundle) obj;
        vs2.m18660c(bundle, "gmp_app_id", this.f14872a);
        vs2.m18660c(bundle, "fbs_aiid", this.f14873b);
        vs2.m18660c(bundle, "fbs_aeid", this.f14874c);
        vs2.m18660c(bundle, "apm_id_origin", this.f14875d);
        Long l = this.f14876e;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
