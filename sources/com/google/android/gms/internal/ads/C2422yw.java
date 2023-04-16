package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.yw */
public abstract class C2422yw extends C1514ae implements C2459zw {
    public C2422yw() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo7161g();
                break;
            case 2:
                mo7157C(parcel.readInt());
                break;
            case 3:
                break;
            case 4:
                mo7162h();
                break;
            case 5:
                mo7163i();
                break;
            case 6:
                mo7158c();
                break;
            case 7:
                mo7159e();
                break;
            case 8:
                mo7164w((C1605cv) C1551be.m6816a(parcel, C1605cv.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
