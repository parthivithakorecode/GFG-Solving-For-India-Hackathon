package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p048g2.C2635a;

public abstract class yg0 extends C1514ae implements zg0 {
    public yg0() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    /* renamed from: z5 */
    public static zg0 m20013z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof zg0 ? (zg0) queryLocalInterface : new xg0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo11839r2((Bundle) C1551be.m6816a(parcel, Bundle.CREATOR));
                break;
            case 2:
                break;
            case 3:
                mo11840t();
                break;
            case 4:
                mo11834l();
                break;
            case 5:
                mo11835m();
                break;
            case 6:
                Bundle bundle = (Bundle) C1551be.m6816a(parcel, Bundle.CREATOR);
                mo11829K(bundle);
                parcel2.writeNoException();
                C1551be.m6820e(parcel2, bundle);
                return true;
            case 7:
                mo11837p();
                break;
            case 8:
                mo11833k();
                break;
            case 9:
                mo11842x();
                break;
            case 10:
                mo11832f();
                break;
            case 11:
                boolean L = mo11830L();
                parcel2.writeNoException();
                C1551be.m6818c(parcel2, L);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                Intent intent = (Intent) C1551be.m6816a(parcel, Intent.CREATOR);
                break;
            case 13:
                mo11831V(C2635a.C2636a.m21356n0(parcel.readStrongBinder()));
                break;
            case 14:
                mo11838q();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
