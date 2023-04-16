package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class ch2 implements hj2<Bundle> {

    /* renamed from: a */
    public final qr2 f5422a;

    public ch2(qr2 qr2) {
        this.f5422a = qr2;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        Bundle bundle = (Bundle) obj;
        qr2 qr2 = this.f5422a;
        if (qr2 != null) {
            bundle.putBoolean("render_in_browser", qr2.mo10376d());
            bundle.putBoolean("disable_ml", this.f5422a.mo10375c());
        }
    }
}
