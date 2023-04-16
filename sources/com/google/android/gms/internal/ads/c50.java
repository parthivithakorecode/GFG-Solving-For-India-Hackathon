package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import p048g2.C2635a;

public final class c50 extends C2440zd implements e50 {
    c50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: e */
    public final C2635a mo6055e() {
        Parcel n0 = mo12210n0(9, mo12207D());
        C2635a n02 = C2635a.C2636a.m21356n0(n0.readStrongBinder());
        n0.recycle();
        return n02;
    }

    /* renamed from: f */
    public final String mo6056f() {
        Parcel n0 = mo12210n0(4, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: h0 */
    public final boolean mo6057h0(C2635a aVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        Parcel n0 = mo12210n0(10, D);
        boolean g = C1551be.m6822g(n0);
        n0.recycle();
        return g;
    }
}
