package p017c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.a */
public interface C1424a extends IInterface {

    /* renamed from: c.a$a */
    public static abstract class C1425a extends Binder implements C1424a {

        /* renamed from: c.a$a$a */
        private static class C1426a implements C1424a {

            /* renamed from: f */
            private IBinder f3635f;

            C1426a(IBinder iBinder) {
                this.f3635f = iBinder;
            }

            public IBinder asBinder() {
                return this.f3635f;
            }
        }

        public C1425a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: D */
        public static C1424a m5594D(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1424a)) ? new C1426a(iBinder) : (C1424a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                mo4824s5(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    /* renamed from: s5 */
    void mo4824s5(int i, Bundle bundle);
}
