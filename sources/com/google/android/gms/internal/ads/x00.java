package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

final class x00 extends e10<Boolean> {
    x00(int i, String str, Boolean bool) {
        super(i, str, bool, (d10) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5055a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(mo6773m(), ((Boolean) mo6772l()).booleanValue()));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo5056b(Bundle bundle) {
        String m = mo6773m();
        if (!bundle.containsKey(m.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m) : new String("com.google.android.gms.ads.flag."))) {
            return (Boolean) mo6772l();
        }
        String m2 = mo6773m();
        return Boolean.valueOf(bundle.getBoolean(m2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m2) : new String("com.google.android.gms.ads.flag.")));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo5057c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(mo6773m(), ((Boolean) mo6772l()).booleanValue()));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo5058d(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(mo6773m(), ((Boolean) obj).booleanValue());
    }
}
