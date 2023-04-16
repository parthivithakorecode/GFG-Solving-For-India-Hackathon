package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class bd0 extends C2440zd implements dd0 {
    bd0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: d0 */
    public final cf0 mo5240d0(String str) {
        Parcel D = mo12207D();
        D.writeString(str);
        Parcel n0 = mo12210n0(3, D);
        cf0 z5 = bf0.m6834z5(n0.readStrongBinder());
        n0.recycle();
        return z5;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.gd0 mo5241s(java.lang.String r4) {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo12207D()
            r0.writeString(r4)
            r4 = 1
            android.os.Parcel r4 = r3.mo12210n0(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.gd0
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.internal.ads.gd0 r0 = (com.google.android.gms.internal.ads.gd0) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.internal.ads.ed0 r1 = new com.google.android.gms.internal.ads.ed0
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bd0.mo5241s(java.lang.String):com.google.android.gms.internal.ads.gd0");
    }

    /* renamed from: u */
    public final boolean mo5242u(String str) {
        Parcel D = mo12207D();
        D.writeString(str);
        Parcel n0 = mo12210n0(4, D);
        boolean g = C1551be.m6822g(n0);
        n0.recycle();
        return g;
    }

    /* renamed from: z */
    public final boolean mo5243z(String str) {
        Parcel D = mo12207D();
        D.writeString(str);
        Parcel n0 = mo12210n0(2, D);
        boolean g = C1551be.m6822g(n0);
        n0.recycle();
        return g;
    }
}
