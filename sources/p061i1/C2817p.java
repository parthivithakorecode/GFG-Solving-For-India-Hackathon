package p061i1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.C2420yu;
import com.google.android.gms.internal.ads.pi1;
import p034e2.C2555l;
import p054h1.C2694t;
import p069j1.C3163g2;

/* renamed from: i1.p */
public final class C2817p {
    /* renamed from: a */
    public static final void m22284a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.f3724p == 4 && adOverlayInfoParcel.f3716h == null) {
            C2420yu yuVar = adOverlayInfoParcel.f3715g;
            if (yuVar != null) {
                yuVar.mo25L();
            }
            pi1 pi1 = adOverlayInfoParcel.f3713D;
            if (pi1 != null) {
                pi1.mo8182r();
            }
            Activity j = adOverlayInfoParcel.f3717i.mo7127j();
            C2807f fVar = adOverlayInfoParcel.f3714f;
            if (!(fVar == null || !fVar.f19477o || j == null)) {
                context = j;
            }
            C2694t.m21601j();
            C2807f fVar2 = adOverlayInfoParcel.f3714f;
            C2800a.m22247b(context, fVar2, adOverlayInfoParcel.f3722n, fVar2 != null ? fVar2.f19476n : null);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f3726r.f12732i);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!C2555l.m21213g()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        C2694t.m21608q();
        C3163g2.m23941q(context, intent);
    }
}
