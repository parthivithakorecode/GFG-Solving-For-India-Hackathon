package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class ne2 implements hj2<Bundle> {

    /* renamed from: a */
    private final C2309vv f11431a;

    /* renamed from: b */
    private final po0 f11432b;

    /* renamed from: c */
    private final boolean f11433c;

    public ne2(C2309vv vvVar, po0 po0, boolean z) {
        this.f11431a = vvVar;
        this.f11432b = po0;
        this.f11433c = z;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        if (this.f11432b.f12731h >= ((Integer) C2199sw.m17001c().mo8579b(m10.f10309J3)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10317K3)).booleanValue()) {
            bundle.putBoolean("app_switched", this.f11433c);
        }
        C2309vv vvVar = this.f11431a;
        if (vvVar != null) {
            int i = vvVar.f16418f;
            if (i == 1) {
                str = "p";
            } else if (i == 2) {
                str = "l";
            } else {
                return;
            }
            bundle.putString("avo", str);
        }
    }
}
