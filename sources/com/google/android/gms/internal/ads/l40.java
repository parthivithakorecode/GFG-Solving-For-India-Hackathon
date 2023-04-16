package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import p048g2.C2635a;

public final class l40 extends C2440zd implements n40 {
    l40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: a */
    public final double mo8868a() {
        Parcel n0 = mo12210n0(3, mo12207D());
        double readDouble = n0.readDouble();
        n0.recycle();
        return readDouble;
    }

    /* renamed from: b */
    public final Uri mo8869b() {
        Parcel n0 = mo12210n0(2, mo12207D());
        Uri uri = (Uri) C1551be.m6816a(n0, Uri.CREATOR);
        n0.recycle();
        return uri;
    }

    /* renamed from: c */
    public final int mo8870c() {
        Parcel n0 = mo12210n0(5, mo12207D());
        int readInt = n0.readInt();
        n0.recycle();
        return readInt;
    }

    /* renamed from: d */
    public final C2635a mo8871d() {
        Parcel n0 = mo12210n0(1, mo12207D());
        C2635a n02 = C2635a.C2636a.m21356n0(n0.readStrongBinder());
        n0.recycle();
        return n02;
    }

    /* renamed from: g */
    public final int mo8872g() {
        Parcel n0 = mo12210n0(4, mo12207D());
        int readInt = n0.readInt();
        n0.recycle();
        return readInt;
    }
}
