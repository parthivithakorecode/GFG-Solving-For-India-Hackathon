package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import p047g1.C2633b;
import p047g1.C2634c;

/* renamed from: com.google.android.gms.internal.ads.tz */
final class C2239tz extends l90 {

    /* renamed from: f */
    final /* synthetic */ C2276uz f15086f;

    /* synthetic */ C2239tz(C2276uz uzVar, C2202sz szVar) {
        this.f15086f = uzVar;
    }

    /* renamed from: K2 */
    public final void mo8642K2(List<f90> list) {
        this.f15086f.f15829d = false;
        this.f15086f.f15830e = true;
        C2633b c = C2276uz.m18262t(list);
        ArrayList g = C2276uz.m18256e().f15826a;
        int size = g.size();
        for (int i = 0; i < size; i++) {
            ((C2634c) g.get(i)).mo12520a(c);
        }
        C2276uz.m18256e().f15826a.clear();
    }
}
