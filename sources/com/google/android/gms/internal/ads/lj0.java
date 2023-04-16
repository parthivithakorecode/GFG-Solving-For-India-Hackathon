package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class lj0 extends C1514ae implements mj0 {
    public lj0() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String c = mo8471c();
            parcel2.writeNoException();
            parcel2.writeString(c);
        } else if (i != 2) {
            return false;
        } else {
            int a = mo8470a();
            parcel2.writeNoException();
            parcel2.writeInt(a);
        }
        return true;
    }
}
