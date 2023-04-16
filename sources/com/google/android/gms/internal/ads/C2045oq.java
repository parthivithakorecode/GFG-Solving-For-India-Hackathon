package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.oq */
public final class C2045oq extends C2440zd {
    C2045oq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    /* renamed from: M3 */
    public final C1860jq mo9832M3(C1971mq mqVar) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, mqVar);
        Parcel n0 = mo12210n0(1, D);
        C1860jq jqVar = (C1860jq) C1551be.m6816a(n0, C1860jq.CREATOR);
        n0.recycle();
        return jqVar;
    }

    /* renamed from: P4 */
    public final C1860jq mo9833P4(C1971mq mqVar) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, mqVar);
        Parcel n0 = mo12210n0(2, D);
        C1860jq jqVar = (C1860jq) C1551be.m6816a(n0, C1860jq.CREATOR);
        n0.recycle();
        return jqVar;
    }

    /* renamed from: b3 */
    public final long mo9834b3(C1971mq mqVar) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, mqVar);
        Parcel n0 = mo12210n0(3, D);
        long readLong = n0.readLong();
        n0.recycle();
        return readLong;
    }
}
