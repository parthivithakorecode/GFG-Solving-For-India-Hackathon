package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import p003a2.C0092o;

public final class yd2 implements hj2<Bundle> {

    /* renamed from: a */
    public final C2087pv f17678a;

    /* renamed from: b */
    public final String f17679b;

    /* renamed from: c */
    public final boolean f17680c;

    /* renamed from: d */
    public final String f17681d;

    /* renamed from: e */
    public final float f17682e;

    /* renamed from: f */
    public final int f17683f;

    /* renamed from: g */
    public final int f17684g;

    /* renamed from: h */
    public final String f17685h;

    /* renamed from: i */
    public final boolean f17686i;

    public yd2(C2087pv pvVar, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2) {
        C0092o.m314j(pvVar, "the adSize must not be null");
        this.f17678a = pvVar;
        this.f17679b = str;
        this.f17680c = z;
        this.f17681d = str2;
        this.f17682e = f;
        this.f17683f = i;
        this.f17684g = i2;
        this.f17685h = str3;
        this.f17686i = z2;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        Bundle bundle = (Bundle) obj;
        vs2.m18664g(bundle, "smart_w", "full", this.f17678a.f12808j == -1);
        vs2.m18664g(bundle, "smart_h", "auto", this.f17678a.f12805g == -2);
        Boolean bool = Boolean.TRUE;
        vs2.m18662e(bundle, "ene", bool, this.f17678a.f12813o);
        vs2.m18664g(bundle, "rafmt", "102", this.f17678a.f12816r);
        vs2.m18664g(bundle, "rafmt", "103", this.f17678a.f12817s);
        vs2.m18664g(bundle, "rafmt", "105", this.f17678a.f12818t);
        vs2.m18662e(bundle, "inline_adaptive_slot", bool, this.f17686i);
        vs2.m18662e(bundle, "interscroller_slot", bool, this.f17678a.f12818t);
        vs2.m18660c(bundle, "format", this.f17679b);
        vs2.m18664g(bundle, "fluid", "height", this.f17680c);
        String str = this.f17681d;
        vs2.m18664g(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.f17682e);
        bundle.putInt("sw", this.f17683f);
        bundle.putInt("sh", this.f17684g);
        String str2 = this.f17685h;
        vs2.m18664g(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList arrayList = new ArrayList();
        C2087pv[] pvVarArr = this.f17678a.f12810l;
        if (pvVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.f17678a.f12805g);
            bundle2.putInt("width", this.f17678a.f12808j);
            bundle2.putBoolean("is_fluid_height", this.f17678a.f12812n);
            arrayList.add(bundle2);
        } else {
            for (C2087pv pvVar : pvVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", pvVar.f12812n);
                bundle3.putInt("height", pvVar.f12805g);
                bundle3.putInt("width", pvVar.f12808j);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
