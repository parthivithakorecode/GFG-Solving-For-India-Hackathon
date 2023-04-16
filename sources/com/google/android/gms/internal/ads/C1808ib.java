package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: com.google.android.gms.internal.ads.ib */
final class C1808ib extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ C1845jb f8590a;

    C1808ib(C1845jb jbVar) {
        this.f8590a = jbVar;
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (C1845jb.class) {
            this.f8590a.f9075a = networkCapabilities;
        }
    }

    public final void onLost(Network network) {
        synchronized (C1845jb.class) {
            this.f8590a.f9075a = null;
        }
    }
}
