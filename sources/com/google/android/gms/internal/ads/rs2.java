package com.google.android.gms.internal.ads;

import java.util.Map;
import p054h1.C2694t;

public final /* synthetic */ class rs2 implements t70 {

    /* renamed from: a */
    public final /* synthetic */ cy2 f13931a;

    /* renamed from: b */
    public final /* synthetic */ o42 f13932b;

    public /* synthetic */ rs2(cy2 cy2, o42 o42) {
        this.f13931a = cy2;
        this.f13932b = o42;
    }

    /* renamed from: a */
    public final void mo5150a(Object obj, Map map) {
        cy2 cy2 = this.f13931a;
        o42 o42 = this.f13932b;
        vt0 vt0 = (vt0) obj;
        String str = (String) map.get("u");
        if (str == null) {
            io0.m11131g("URL missing from httpTrack GMSG.");
        } else if (!vt0.mo7073A().f13897g0) {
            cy2.mo6339b(str);
        } else {
            o42.mo9649n(new q42(C2694t.m21592a().mo12462a(), ((cv0) vt0).mo6308F().f15729b, str, 2));
        }
    }
}
