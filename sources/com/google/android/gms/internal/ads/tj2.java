package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import p054h1.C2694t;
import p069j1.C3163g2;

public final class tj2 implements ij2<rj2> {

    /* renamed from: a */
    private final dc3 f14881a;

    /* renamed from: b */
    private final Context f14882b;

    public tj2(dc3 dc3, Context context) {
        this.f14881a = dc3;
        this.f14882b = context;
    }

    /* renamed from: a */
    public final cc3<rj2> mo5813a() {
        return this.f14881a.mo6445C(new sj2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ rj2 mo10996b() {
        int i;
        boolean z;
        int i2;
        TelephonyManager telephonyManager = (TelephonyManager) this.f14882b.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        C2694t.m21608q();
        int i3 = -1;
        if (C3163g2.m23927f(this.f14882b, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f14882b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i2 = type;
                i3 = ordinal;
            } else {
                i2 = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
            i = i3;
        } else {
            i = -1;
            z = false;
            i2 = -2;
        }
        C2694t.m21608q();
        return new rj2(networkOperator, i2, C3163g2.m23921c(this.f14882b), phoneType, z, i);
    }
}
