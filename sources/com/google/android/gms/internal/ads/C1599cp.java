package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.cp */
final class C1599cp implements Comparator<C1822ip> {
    C1599cp(C1674ep epVar) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C1822ip ipVar = (C1822ip) obj;
        C1822ip ipVar2 = (C1822ip) obj2;
        int i = ipVar.f8746c - ipVar2.f8746c;
        return i != 0 ? i : (int) (ipVar.f8744a - ipVar2.f8744a);
    }
}
