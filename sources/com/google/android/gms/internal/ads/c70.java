package com.google.android.gms.internal.ads;

import java.util.Map;

public final /* synthetic */ class c70 implements t70 {

    /* renamed from: a */
    public static final /* synthetic */ c70 f5325a = new c70();

    private /* synthetic */ c70() {
    }

    /* renamed from: a */
    public final void mo5150a(Object obj, Map map) {
        nv0 nv0 = (nv0) obj;
        t70<eu0> t70 = s70.f14292a;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            C1734gb H = nv0.mo7083H();
            if (H != null) {
                H.mo7560c().mo6114e(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            io0.m11131g("Could not parse touch parameters from gmsg.");
        }
    }
}
