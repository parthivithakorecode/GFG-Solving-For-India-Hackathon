package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.py */
public abstract class C2090py extends C1514ae implements C2127qy {
    public C2090py() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo9888x2((C1605cv) C1551be.m6816a(parcel, C1605cv.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
