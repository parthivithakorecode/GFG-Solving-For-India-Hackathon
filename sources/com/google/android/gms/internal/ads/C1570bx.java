package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.bx */
public abstract class C1570bx extends C1514ae implements C1644dx {
    public C1570bx() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo5543c();
        } else if (i != 2) {
            return false;
        } else {
            mo5544j0((C1605cv) C1551be.m6816a(parcel, C1605cv.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
