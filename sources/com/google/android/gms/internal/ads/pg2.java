package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class pg2 implements hj2<Bundle> {

    /* renamed from: a */
    private final Boolean f12663a;

    public pg2(Boolean bool) {
        this.f12663a = bool;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        Bundle bundle = (Bundle) obj;
        Boolean bool = this.f12663a;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
