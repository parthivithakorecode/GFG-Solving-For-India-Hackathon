package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.lp */
public final class C1933lp implements Comparator<C1525ap> {
    public C1933lp(C1970mp mpVar) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C1525ap apVar = (C1525ap) obj;
        C1525ap apVar2 = (C1525ap) obj2;
        if (apVar.mo5353d() >= apVar2.mo5353d()) {
            if (apVar.mo5353d() > apVar2.mo5353d()) {
                return 1;
            }
            if (apVar.mo5351b() >= apVar2.mo5351b()) {
                if (apVar.mo5351b() > apVar2.mo5351b()) {
                    return 1;
                }
                float a = (apVar.mo5350a() - apVar.mo5353d()) * (apVar.mo5352c() - apVar.mo5351b());
                float a2 = (apVar2.mo5350a() - apVar2.mo5353d()) * (apVar2.mo5352c() - apVar2.mo5351b());
                if (a <= a2) {
                    return a < a2 ? 1 : 0;
                }
            }
        }
        return -1;
    }
}
