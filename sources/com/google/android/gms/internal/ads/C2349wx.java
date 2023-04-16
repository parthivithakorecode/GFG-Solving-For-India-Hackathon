package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import p048g2.C2635a;

/* renamed from: com.google.android.gms.internal.ads.wx */
public abstract class C2349wx extends C1514ae implements C2386xx {
    public C2349wx() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        switch (i) {
            case 1:
                iInterface = mo4943S1(C2635a.C2636a.m21356n0(parcel.readStrongBinder()), (C2087pv) C1551be.m6816a(parcel, C2087pv.CREATOR), parcel.readString(), cd0.m7312z5(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 2:
                iInterface = mo4945h3(C2635a.C2636a.m21356n0(parcel.readStrongBinder()), (C2087pv) C1551be.m6816a(parcel, C2087pv.CREATOR), parcel.readString(), cd0.m7312z5(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                iInterface = mo4942O0(C2635a.C2636a.m21356n0(parcel.readStrongBinder()), parcel.readString(), cd0.m7312z5(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 4:
            case 7:
                C2635a.C2636a.m21356n0(parcel.readStrongBinder());
                parcel2.writeNoException();
                C1551be.m6821f(parcel2, (IInterface) null);
                return true;
            case 5:
                iInterface = mo4950v0(C2635a.C2636a.m21356n0(parcel.readStrongBinder()), C2635a.C2636a.m21356n0(parcel.readStrongBinder()));
                break;
            case 6:
                iInterface = mo4941M0(C2635a.C2636a.m21356n0(parcel.readStrongBinder()), cd0.m7312z5(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 8:
                iInterface = mo4944b0(C2635a.C2636a.m21356n0(parcel.readStrongBinder()));
                break;
            case 9:
                iInterface = mo4938E0(C2635a.C2636a.m21356n0(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                iInterface = mo4951z1(C2635a.C2636a.m21356n0(parcel.readStrongBinder()), (C2087pv) C1551be.m6816a(parcel, C2087pv.CREATOR), parcel.readString(), parcel.readInt());
                break;
            case 11:
                iInterface = mo4948o2(C2635a.C2636a.m21356n0(parcel.readStrongBinder()), C2635a.C2636a.m21356n0(parcel.readStrongBinder()), C2635a.C2636a.m21356n0(parcel.readStrongBinder()));
                break;
            case 12:
                iInterface = mo4940I1(C2635a.C2636a.m21356n0(parcel.readStrongBinder()), parcel.readString(), cd0.m7312z5(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 13:
                iInterface = mo4947n1(C2635a.C2636a.m21356n0(parcel.readStrongBinder()), (C2087pv) C1551be.m6816a(parcel, C2087pv.CREATOR), parcel.readString(), cd0.m7312z5(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 14:
                iInterface = mo4949q3(C2635a.C2636a.m21356n0(parcel.readStrongBinder()), cd0.m7312z5(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 15:
                iInterface = mo4939H3(C2635a.C2636a.m21356n0(parcel.readStrongBinder()), cd0.m7312z5(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 16:
                iInterface = mo4946m2(C2635a.C2636a.m21356n0(parcel.readStrongBinder()), cd0.m7312z5(parcel.readStrongBinder()), parcel.readInt(), m80.m13089z5(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        C1551be.m6821f(parcel2, iInterface);
        return true;
    }
}
