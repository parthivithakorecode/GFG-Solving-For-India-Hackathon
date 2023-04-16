package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

final class y00 extends e10<Integer> {
    y00(int i, String str, Integer num) {
        super(1, str, num, (d10) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5055a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(mo6773m(), ((Integer) mo6772l()).intValue()));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo5056b(Bundle bundle) {
        String m = mo6773m();
        if (!bundle.containsKey(m.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m) : new String("com.google.android.gms.ads.flag."))) {
            return (Integer) mo6772l();
        }
        String m2 = mo6773m();
        return Integer.valueOf(bundle.getInt(m2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m2) : new String("com.google.android.gms.ads.flag.")));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo5057c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(mo6773m(), ((Integer) mo6772l()).intValue()));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo5058d(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(mo6773m(), ((Integer) obj).intValue());
    }
}
