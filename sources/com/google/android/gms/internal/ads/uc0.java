package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import p048g2.C2637b;
import p105o2.C3831a;

public final /* synthetic */ class uc0 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ wc0 f15498f;

    /* renamed from: g */
    public final /* synthetic */ Context f15499g;

    /* renamed from: h */
    public final /* synthetic */ String f15500h;

    public /* synthetic */ uc0(wc0 wc0, Context context, String str) {
        this.f15498f = wc0;
        this.f15499g = context;
        this.f15500h = str;
    }

    public final void run() {
        Context context = this.f15499g;
        String str = this.f15500h;
        m10.m13007c(context);
        Bundle bundle = new Bundle();
        bundle.putBoolean("measurementEnabled", ((Boolean) C2199sw.m17001c().mo8579b(m10.f10460c0)).booleanValue());
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10523j0)).booleanValue()) {
            bundle.putString("ad_storage", "denied");
            bundle.putString("analytics_storage", "denied");
        }
        try {
            ((aw0) no0.m14004b(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", tc0.f14818a)).mo5535e3(C2637b.m21358Z2(context), new sc0(C3831a.m25795k(context, "FA-Ads", "am", str, bundle)));
        } catch (RemoteException | mo0 | NullPointerException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }
}
