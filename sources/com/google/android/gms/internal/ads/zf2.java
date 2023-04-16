package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import p054h1.C2694t;

public final class zf2 implements ij2<yf2> {

    /* renamed from: a */
    private final Context f18186a;

    /* renamed from: b */
    private final dc3 f18187b;

    zf2(Context context, dc3 dc3) {
        this.f18186a = context;
        this.f18187b = dc3;
    }

    /* renamed from: a */
    public final cc3<yf2> mo5813a() {
        return this.f18187b.mo6445C(new wf2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ yf2 mo12215b() {
        Bundle bundle;
        C2694t.m21608q();
        String str = "";
        String string = !((Boolean) C2199sw.m17001c().mo8579b(m10.f10648x4)).booleanValue() ? str : this.f18186a.getSharedPreferences("mobileads_consent", 0).getString("consent_string", str);
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10664z4)).booleanValue()) {
            str = this.f18186a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", str);
        }
        C2694t.m21608q();
        Context context = this.f18186a;
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10656y4)).booleanValue()) {
            bundle = null;
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                String str2 = strArr[i];
                if (defaultSharedPreferences.contains(str2)) {
                    bundle.putString(str2, defaultSharedPreferences.getString(str2, (String) null));
                }
            }
        }
        return new yf2(string, str, bundle, (xf2) null);
    }
}
