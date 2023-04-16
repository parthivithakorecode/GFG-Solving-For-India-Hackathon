package com.google.android.gms.internal.ads;

import android.os.Parcel;
import p048g2.C2635a;

public abstract class e20 extends C1514ae implements f20 {
    public e20() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        if (i == 1) {
            str = mo6031a();
        } else if (i != 2) {
            if (i == 3) {
                mo6035e0(C2635a.C2636a.m21356n0(parcel.readStrongBinder()));
            } else if (i == 4) {
                mo6032b();
            } else if (i != 5) {
                return false;
            } else {
                mo6034d();
            }
            parcel2.writeNoException();
            return true;
        } else {
            str = mo6033c();
        }
        parcel2.writeNoException();
        parcel2.writeString(str);
        return true;
    }
}
