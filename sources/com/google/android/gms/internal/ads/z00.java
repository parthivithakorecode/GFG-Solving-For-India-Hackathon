package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

final class z00 extends e10<Long> {
    z00(int i, String str, Long l) {
        super(1, str, l, (d10) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5055a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(mo6773m(), ((Long) mo6772l()).longValue()));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo5056b(Bundle bundle) {
        String m = mo6773m();
        if (!bundle.containsKey(m.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m) : new String("com.google.android.gms.ads.flag."))) {
            return (Long) mo6772l();
        }
        String m2 = mo6773m();
        return Long.valueOf(bundle.getLong(m2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m2) : new String("com.google.android.gms.ads.flag.")));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo5057c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(mo6773m(), ((Long) mo6772l()).longValue()));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo5058d(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(mo6773m(), ((Long) obj).longValue());
    }
}
