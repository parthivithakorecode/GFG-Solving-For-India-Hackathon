package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public abstract class e40 extends C1514ae implements g40 {
    public e40() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: z5 */
    public static g40 m8290z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof g40 ? (g40) queryLocalInterface : new d40(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            String e = mo6381e();
            parcel2.writeNoException();
            parcel2.writeString(e);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            List<n40> f = mo6382f();
            parcel2.writeNoException();
            parcel2.writeList(f);
            return true;
        }
    }
}
