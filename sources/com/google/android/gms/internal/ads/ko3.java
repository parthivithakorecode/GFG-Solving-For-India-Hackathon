package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class ko3 implements Comparator<uo3> {
    ko3() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        uo3 uo3 = (uo3) obj;
        uo3 uo32 = (uo3) obj2;
        no3 F = uo3.iterator();
        no3 F2 = uo32.iterator();
        while (F.hasNext() && F2.hasNext()) {
            int a = jo3.m11756a(F.zza() & 255, F2.zza() & 255);
            if (a != 0) {
                return a;
            }
        }
        return jo3.m11756a(uo3.mo6627p(), uo32.mo6627p());
    }
}
