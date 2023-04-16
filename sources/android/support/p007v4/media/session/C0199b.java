package android.support.p007v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.v4.media.session.b */
public interface C0199b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    public static abstract class C0200a extends Binder implements C0199b {

        /* renamed from: android.support.v4.media.session.b$a$a */
        private static class C0201a implements C0199b {

            /* renamed from: f */
            private IBinder f368f;

            C0201a(IBinder iBinder) {
                this.f368f = iBinder;
            }

            public IBinder asBinder() {
                return this.f368f;
            }

            /* renamed from: c1 */
            public void mo471c1(C0197a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f368f.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: D */
        public static C0199b m629D(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0199b)) ? new C0201a(iBinder) : (C0199b) queryLocalInterface;
        }
    }

    /* renamed from: c1 */
    void mo471c1(C0197a aVar);
}
