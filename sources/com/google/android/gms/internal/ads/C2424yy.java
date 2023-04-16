package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.yy */
public abstract class C2424yy extends C1514ae implements C2461zy {
    public C2424yy() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    /* renamed from: z5 */
    public static C2461zy m20348z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return queryLocalInterface instanceof C2461zy ? (C2461zy) queryLocalInterface : new C2387xy(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        if (i == 1) {
            str = mo9702b();
        } else if (i == 2) {
            str = mo9704d();
        } else if (i != 3) {
            return false;
        } else {
            List<C2235tv> e = mo9705e();
            parcel2.writeNoException();
            parcel2.writeTypedList(e);
            return true;
        }
        parcel2.writeNoException();
        parcel2.writeString(str);
        return true;
    }
}
