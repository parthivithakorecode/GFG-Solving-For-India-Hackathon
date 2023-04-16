package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p048g2.C2635a;

public abstract class wj0 extends C1514ae implements xj0 {
    public wj0() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: z5 */
    public static xj0 m19000z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof xj0 ? (xj0) queryLocalInterface : new vj0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo11431b0(C2635a.C2636a.m21356n0(parcel.readStrongBinder()));
                break;
            case 2:
                mo11435x4(C2635a.C2636a.m21356n0(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                mo11429T(C2635a.C2636a.m21356n0(parcel.readStrongBinder()));
                break;
            case 4:
                mo11430V(C2635a.C2636a.m21356n0(parcel.readStrongBinder()));
                break;
            case 5:
                mo11434u0(C2635a.C2636a.m21356n0(parcel.readStrongBinder()));
                break;
            case 6:
                mo11433r0(C2635a.C2636a.m21356n0(parcel.readStrongBinder()));
                break;
            case 7:
                mo11432e1(C2635a.C2636a.m21356n0(parcel.readStrongBinder()), (yj0) C1551be.m6816a(parcel, yj0.CREATOR));
                break;
            case 8:
                zze(C2635a.C2636a.m21356n0(parcel.readStrongBinder()));
                break;
            case 9:
                mo11426E0(C2635a.C2636a.m21356n0(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                mo11428P(C2635a.C2636a.m21356n0(parcel.readStrongBinder()));
                break;
            case 11:
                mo11427J2(C2635a.C2636a.m21356n0(parcel.readStrongBinder()));
                break;
            case 12:
                Bundle bundle = (Bundle) C1551be.m6816a(parcel, Bundle.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
