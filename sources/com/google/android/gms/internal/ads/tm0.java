package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

final class tm0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final String f14909a;

    /* renamed from: b */
    final /* synthetic */ um0 f14910b;

    public tm0(um0 um0, String str) {
        this.f14910b = um0;
        this.f14909a = str;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f14910b) {
            for (sm0 sm0 : this.f14910b.f15634b) {
                sm0.f14494a.mo11246b(sm0.f14495b, sharedPreferences, this.f14909a, str);
            }
        }
    }
}
