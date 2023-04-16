package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

final class b10 extends e10<String> {
    b10(int i, String str, String str2) {
        super(1, str, str2, (d10) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5055a(JSONObject jSONObject) {
        return jSONObject.optString(mo6773m(), (String) mo6772l());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo5056b(Bundle bundle) {
        String m = mo6773m();
        if (!bundle.containsKey(m.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m) : new String("com.google.android.gms.ads.flag."))) {
            return (String) mo6772l();
        }
        String m2 = mo6773m();
        return bundle.getString(m2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m2) : new String("com.google.android.gms.ads.flag."));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo5057c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(mo6773m(), (String) mo6772l());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo5058d(SharedPreferences.Editor editor, Object obj) {
        editor.putString(mo6773m(), (String) obj);
    }
}
