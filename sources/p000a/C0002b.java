package p000a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: a.b */
public interface C0002b extends IInterface {

    /* renamed from: a.b$a */
    public static abstract class C0003a extends Binder implements C0002b {

        /* renamed from: a.b$a$a */
        private static class C0004a implements C0002b {

            /* renamed from: f */
            private IBinder f0f;

            C0004a(IBinder iBinder) {
                this.f0f = iBinder;
            }

            /* renamed from: J4 */
            public boolean mo8J4(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j);
                    boolean z = false;
                    this.f0f.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: K3 */
            public boolean mo9K3(C0000a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = false;
                    this.f0f.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f0f;
            }
        }

        /* renamed from: D */
        public static C0002b m7D(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0002b)) ? new C0004a(iBinder) : (C0002b) queryLocalInterface;
        }
    }

    /* renamed from: J4 */
    boolean mo8J4(long j);

    /* renamed from: K3 */
    boolean mo9K3(C0000a aVar);
}
