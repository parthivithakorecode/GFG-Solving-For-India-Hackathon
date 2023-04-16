package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class ug2 implements hj2<Bundle> {

    /* renamed from: a */
    private final String f15554a;

    /* renamed from: b */
    private final boolean f15555b;

    /* renamed from: c */
    private final boolean f15556c;

    public ug2(String str, boolean z, boolean z2) {
        this.f15554a = str;
        this.f15555b = z;
        this.f15556c = z2;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.f15554a.isEmpty()) {
            bundle.putString("inspector_extras", this.f15554a);
        }
        bundle.putInt("test_mode", this.f15555b ? 1 : 0);
        bundle.putInt("linked_device", this.f15556c ? 1 : 0);
    }
}
