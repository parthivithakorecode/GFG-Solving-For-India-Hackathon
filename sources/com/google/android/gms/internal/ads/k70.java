package com.google.android.gms.internal.ads;

import java.util.Map;
import p061i1.C2816o;

final class k70 implements t70<eu0> {
    k70() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5150a(Object obj, Map map) {
        eu0 eu0 = (eu0) obj;
        if (eu0.mo7087J() != null) {
            eu0.mo7087J().zza();
        }
        C2816o O = eu0.mo7096O();
        if (O != null) {
            O.mo13076a();
            return;
        }
        C2816o u = eu0.mo7147u();
        if (u != null) {
            u.mo13076a();
        } else {
            io0.m11131g("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
