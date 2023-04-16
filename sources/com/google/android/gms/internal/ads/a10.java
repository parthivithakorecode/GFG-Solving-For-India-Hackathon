package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

final class a10 extends e10<Float> {
    a10(int i, String str, Float f) {
        super(1, str, f, (d10) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5055a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(mo6773m(), (double) ((Float) mo6772l()).floatValue()));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo5056b(Bundle bundle) {
        String m = mo6773m();
        if (!bundle.containsKey(m.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m) : new String("com.google.android.gms.ads.flag."))) {
            return (Float) mo6772l();
        }
        String m2 = mo6773m();
        return Float.valueOf(bundle.getFloat(m2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m2) : new String("com.google.android.gms.ads.flag.")));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo5057c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(mo6773m(), ((Float) mo6772l()).floatValue()));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo5058d(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(mo6773m(), ((Float) obj).floatValue());
    }
}
