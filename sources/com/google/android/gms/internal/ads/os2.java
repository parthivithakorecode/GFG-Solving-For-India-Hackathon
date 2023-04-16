package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p002a1.C0024h;

public final class os2 {
    /* renamed from: a */
    public static C2087pv m14626a(Context context, List<sr2> list) {
        ArrayList arrayList = new ArrayList();
        for (sr2 next : list) {
            if (next.f14566c) {
                arrayList.add(C0024h.f32p);
            } else {
                arrayList.add(new C0024h(next.f14564a, next.f14565b));
            }
        }
        return new C2087pv(context, (C0024h[]) arrayList.toArray(new C0024h[arrayList.size()]));
    }

    /* renamed from: b */
    public static sr2 m14627b(List<sr2> list, sr2 sr2) {
        return list.get(0);
    }

    /* renamed from: c */
    public static sr2 m14628c(C2087pv pvVar) {
        return pvVar.f12812n ? new sr2(-3, 0, true) : new sr2(pvVar.f12808j, pvVar.f12805g, false);
    }
}
