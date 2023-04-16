package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

public abstract class w80 extends C1514ae implements x80 {
    public w80() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo11784Y0((ParcelFileDescriptor) C1551be.m6816a(parcel, ParcelFileDescriptor.CREATOR));
        return true;
    }
}
