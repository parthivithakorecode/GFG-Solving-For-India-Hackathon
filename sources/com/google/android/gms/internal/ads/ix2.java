package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

public final class ix2 {

    /* renamed from: a */
    private final String f8850a = w20.f16657b.mo9928e();

    /* renamed from: a */
    public final String mo8289a(Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.f8850a).buildUpon();
        for (Map.Entry next : map.entrySet()) {
            buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        return buildUpon.build().toString();
    }
}
