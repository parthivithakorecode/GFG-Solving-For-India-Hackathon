package p062i2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: i2.b */
public class C2829b extends Binder implements IInterface {
    protected C2829b(String str) {
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public boolean mo13090D(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
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
        return mo13090D(i, parcel, parcel2, i2);
    }
}
