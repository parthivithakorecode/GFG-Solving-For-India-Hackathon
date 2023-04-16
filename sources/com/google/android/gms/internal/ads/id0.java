package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p038f.C2591j;

public abstract class id0 extends C1514ae implements jd0 {
    public id0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: z5 */
    public static jd0 m10996z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof jd0 ? (jd0) queryLocalInterface : new hd0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo7310b();
                break;
            case 2:
                mo7311d();
                break;
            case 3:
                mo7304A(parcel.readInt());
                break;
            case 4:
                mo7315m();
                break;
            case 5:
                mo7313l();
                break;
            case 6:
                mo7316n();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof nd0) {
                        nd0 nd0 = (nd0) queryLocalInterface;
                        break;
                    }
                }
                break;
            case 8:
                mo5198o();
                break;
            case 9:
                mo7307L2(parcel.readString(), parcel.readString());
                break;
            case 10:
                d50.m7721z5(parcel.readStrongBinder());
                break;
            case 11:
                mo7266x();
                break;
            case 12:
                break;
            case 13:
                mo7263B();
                break;
            case 14:
                mo7265T3((yj0) C1551be.m6816a(parcel, yj0.CREATOR));
                break;
            case 15:
                mo7309W();
                break;
            case 16:
                mo7264O2(bk0.m6944z5(parcel.readStrongBinder()));
                break;
            case 17:
                mo7317p2(parcel.readInt());
                break;
            case 18:
                mo7267y();
                break;
            case 19:
                Bundle bundle = (Bundle) C1551be.m6816a(parcel, Bundle.CREATOR);
                break;
            case 20:
                mo7308M();
                break;
            case 21:
                mo7312i0(parcel.readString());
                break;
            case 22:
                mo7306G1(parcel.readInt(), parcel.readString());
                break;
            case C2591j.f18882o3 /*23*/:
                mo7318x3((C1605cv) C1551be.m6816a(parcel, C1605cv.CREATOR));
                break;
            case C2591j.f18887p3 /*24*/:
                mo7305B0((C1605cv) C1551be.m6816a(parcel, C1605cv.CREATOR));
                break;
            default:
                return false;
        }
        parcel.readString();
        parcel2.writeNoException();
        return true;
    }
}
