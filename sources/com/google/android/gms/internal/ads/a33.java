package com.google.android.gms.internal.ads;

import android.os.Parcel;
import p048g2.C2635a;

public abstract class a33 extends C1514ae implements b33 {
    public a33() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                C2635a.C2636a.m21356n0(parcel.readStrongBinder());
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                break;
            case 5:
                parcel.createByteArray();
                break;
            case 6:
            case 7:
                parcel.readInt();
                break;
            case 8:
                C2635a.C2636a.m21356n0(parcel.readStrongBinder());
                parcel.readString();
                break;
            default:
                return false;
        }
        parcel.readString();
        parcel2.writeNoException();
        return true;
    }
}
