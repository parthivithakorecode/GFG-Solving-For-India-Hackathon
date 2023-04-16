package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class mi0 extends C1514ae implements ni0 {
    public mi0() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        ri0 ri0 = null;
        if (i != 1) {
            if (i == 2) {
                hi0 hi0 = (hi0) C1551be.m6816a(parcel, hi0.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface instanceof oi0) {
                        oi0 oi0 = (oi0) queryLocalInterface;
                    }
                }
            } else if (i == 4) {
                vi0 vi0 = (vi0) C1551be.m6816a(parcel, vi0.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    ri0 = queryLocalInterface2 instanceof ri0 ? (ri0) queryLocalInterface2 : new pi0(readStrongBinder2);
                }
                mo8962w4(vi0, ri0);
            } else if (i == 5) {
                vi0 vi02 = (vi0) C1551be.m6816a(parcel, vi0.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    ri0 = queryLocalInterface3 instanceof ri0 ? (ri0) queryLocalInterface3 : new pi0(readStrongBinder3);
                }
                mo8959F0(vi02, ri0);
            } else if (i == 6) {
                vi0 vi03 = (vi0) C1551be.m6816a(parcel, vi0.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    ri0 = queryLocalInterface4 instanceof ri0 ? (ri0) queryLocalInterface4 : new pi0(readStrongBinder4);
                }
                mo8961T1(vi03, ri0);
            } else if (i != 7) {
                return false;
            } else {
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    ri0 = queryLocalInterface5 instanceof ri0 ? (ri0) queryLocalInterface5 : new pi0(readStrongBinder5);
                }
                mo8960T0(readString, ri0);
            }
            parcel2.writeNoException();
        } else {
            hi0 hi02 = (hi0) C1551be.m6816a(parcel, hi0.CREATOR);
            parcel2.writeNoException();
            C1551be.m6820e(parcel2, (Parcelable) null);
        }
        return true;
    }
}
