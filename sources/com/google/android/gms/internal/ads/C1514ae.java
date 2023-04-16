package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ae */
public class C1514ae extends Binder implements IInterface {
    protected C1514ae(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo5080y5(i, parcel, parcel2, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }
}
