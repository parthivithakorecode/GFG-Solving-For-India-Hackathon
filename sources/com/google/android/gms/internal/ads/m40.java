package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p048g2.C2635a;

public abstract class m40 extends C1514ae implements n40 {
    public m40() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: z5 */
    public static n40 m13048z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof n40 ? (n40) queryLocalInterface : new l40(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        if (i == 1) {
            C2635a d = mo8871d();
            parcel2.writeNoException();
            C1551be.m6821f(parcel2, d);
        } else if (i == 2) {
            Uri b = mo8869b();
            parcel2.writeNoException();
            C1551be.m6820e(parcel2, b);
        } else if (i != 3) {
            if (i == 4) {
                i3 = mo8872g();
            } else if (i != 5) {
                return false;
            } else {
                i3 = mo8870c();
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        } else {
            double a = mo8868a();
            parcel2.writeNoException();
            parcel2.writeDouble(a);
        }
        return true;
    }
}
