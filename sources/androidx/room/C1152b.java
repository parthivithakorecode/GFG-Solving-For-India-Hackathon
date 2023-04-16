package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: androidx.room.b */
public interface C1152b extends IInterface {

    /* renamed from: androidx.room.b$a */
    public static abstract class C1153a extends Binder implements C1152b {

        /* renamed from: androidx.room.b$a$a */
        private static class C1154a implements C1152b {

            /* renamed from: f */
            private IBinder f3075f;

            C1154a(IBinder iBinder) {
                this.f3075f = iBinder;
            }

            public IBinder asBinder() {
                return this.f3075f;
            }

            /* renamed from: e2 */
            public void mo3918e2(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f3075f.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C1153a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* renamed from: D */
        public static C1152b m4681D(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1152b)) ? new C1154a(iBinder) : (C1152b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                mo3918e2(parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
        }
    }

    /* renamed from: e2 */
    void mo3918e2(String[] strArr);
}
