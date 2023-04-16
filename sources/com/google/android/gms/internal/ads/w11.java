package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import p054h1.C2694t;
import p069j1.C3208t1;

public final class w11 implements l11 {

    /* renamed from: a */
    private final Context f16651a;

    /* renamed from: b */
    private final C3208t1 f16652b = C2694t.m21607p().mo11025h();

    public w11(Context context) {
        this.f16651a = context;
    }

    /* renamed from: a */
    public final void mo6036a(Map<String, String> map) {
        if (!map.isEmpty()) {
            String str = map.get("gad_idless");
            if (str != null) {
                boolean parseBoolean = Boolean.parseBoolean(str);
                map.remove("gad_idless");
                if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10568o0)).booleanValue()) {
                    this.f16652b.mo14071C(parseBoolean);
                    if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10270E4)).booleanValue() && parseBoolean) {
                        this.f16651a.deleteDatabase("OfflineUpload.db");
                    }
                }
            }
            Bundle bundle = new Bundle();
            for (Map.Entry next : map.entrySet()) {
                bundle.putString((String) next.getKey(), (String) next.getValue());
            }
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10523j0)).booleanValue()) {
                C2694t.m21606o().mo10106w(bundle);
            }
        }
    }
}
