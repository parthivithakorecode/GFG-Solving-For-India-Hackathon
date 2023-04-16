package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class bk0 extends C1514ae implements ck0 {
    public bk0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    /* renamed from: z5 */
    public static ck0 m6944z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return queryLocalInterface instanceof ck0 ? (ck0) queryLocalInterface : new ak0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String d = mo5307d();
            parcel2.writeNoException();
            parcel2.writeString(d);
        } else if (i != 2) {
            return false;
        } else {
            int b = mo5306b();
            parcel2.writeNoException();
            parcel2.writeInt(b);
        }
        return true;
    }
}
