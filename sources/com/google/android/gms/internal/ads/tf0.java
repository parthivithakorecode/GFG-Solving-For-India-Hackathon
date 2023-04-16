package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import p054h1.C2694t;
import p061i1.C2817p;

final class tf0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ AdOverlayInfoParcel f14835f;

    /* renamed from: g */
    final /* synthetic */ zzcaf f14836g;

    tf0(zzcaf zzcaf, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f14836g = zzcaf;
        this.f14835f = adOverlayInfoParcel;
    }

    public final void run() {
        C2694t.m21602k();
        C2817p.m22284a(this.f14836g.f18504a, this.f14835f, true);
    }
}
