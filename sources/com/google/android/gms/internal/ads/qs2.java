package com.google.android.gms.internal.ads;

import java.util.Map;

public final /* synthetic */ class qs2 implements t70 {

    /* renamed from: a */
    public final /* synthetic */ pi1 f13301a;

    /* renamed from: b */
    public final /* synthetic */ cy2 f13302b;

    /* renamed from: c */
    public final /* synthetic */ o42 f13303c;

    public /* synthetic */ qs2(pi1 pi1, cy2 cy2, o42 o42) {
        this.f13301a = pi1;
        this.f13302b = cy2;
        this.f13303c = o42;
    }

    /* renamed from: a */
    public final void mo5150a(Object obj, Map map) {
        pi1 pi1 = this.f13301a;
        cy2 cy2 = this.f13302b;
        o42 o42 = this.f13303c;
        eu0 eu0 = (eu0) obj;
        s70.m16643d(map, pi1);
        String str = (String) map.get("u");
        if (str == null) {
            io0.m11131g("URL missing from click GMSG.");
        } else {
            rb3.m16140r(s70.m16641b(eu0, str), new ss2(eu0, cy2, o42), wo0.f16886a);
        }
    }
}
