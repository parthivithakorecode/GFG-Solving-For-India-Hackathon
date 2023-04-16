package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

public final class we2 implements hj2<Bundle> {

    /* renamed from: a */
    private final String f16795a;

    /* renamed from: b */
    private final int f16796b;

    public we2(String str, int i) {
        this.f16795a = str;
        this.f16796b = i;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!TextUtils.isEmpty(this.f16795a) && this.f16796b != -1) {
            Bundle a = vs2.m18658a(bundle, "pii");
            bundle.putBundle("pii", a);
            a.putString("pvid", this.f16795a);
            a.putInt("pvid_s", this.f16796b);
        }
    }
}
