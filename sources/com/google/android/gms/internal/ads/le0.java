package com.google.android.gms.internal.ads;

import com.google.ads.mediation.C1455a;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import p165y0.C4362a;
import p165y0.C4363b;

public final class le0 {
    /* renamed from: a */
    public static int m12707a(C4362a aVar) {
        C4362a aVar2 = C4362a.INVALID_REQUEST;
        C4363b bVar = C4363b.UNKNOWN;
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal != 1) {
            return ordinal != 2 ? 0 : 2;
        }
        return 3;
    }

    /* renamed from: b */
    public static C1455a m12708b(C1902kv kvVar, boolean z) {
        List<String> list = kvVar.f9671j;
        HashSet hashSet = list != null ? new HashSet(list) : null;
        Date date = new Date(kvVar.f9668g);
        int i = kvVar.f9670i;
        return new C1455a(date, i != 1 ? i != 2 ? C4363b.UNKNOWN : C4363b.FEMALE : C4363b.MALE, hashSet, z, kvVar.f9677p);
    }
}
