package p010b;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b.a */
public interface C1287a extends IInterface {

    /* renamed from: b.a$a */
    public static abstract class C1288a extends Binder implements C1287a {

        /* renamed from: b.a$a$a */
        private static class C1289a implements C1287a {

            /* renamed from: g */
            public static C1287a f3509g;

            /* renamed from: f */
            private IBinder f3510f;

            C1289a(IBinder iBinder) {
                this.f3510f = iBinder;
            }

            /* renamed from: L4 */
            public void mo4604L4(String str, int i, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f3510f.transact(1, obtain, (Parcel) null, 1) || C1288a.m5177n0() == null) {
                        obtain.recycle();
                    } else {
                        C1288a.m5177n0().mo4604L4(str, i, str2, notification);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: V2 */
            public void mo4605V2(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    if (this.f3510f.transact(3, obtain, (Parcel) null, 1) || C1288a.m5177n0() == null) {
                        obtain.recycle();
                    } else {
                        C1288a.m5177n0().mo4605V2(str);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3510f;
            }

            /* renamed from: o1 */
            public void mo4606o1(String str, int i, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (this.f3510f.transact(2, obtain, (Parcel) null, 1) || C1288a.m5177n0() == null) {
                        obtain.recycle();
                    } else {
                        C1288a.m5177n0().mo4606o1(str, i, str2);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        /* renamed from: D */
        public static C1287a m5176D(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1287a)) ? new C1289a(iBinder) : (C1287a) queryLocalInterface;
        }

        /* renamed from: n0 */
        public static C1287a m5177n0() {
            return C1289a.f3509g;
        }
    }

    /* renamed from: L4 */
    void mo4604L4(String str, int i, String str2, Notification notification);

    /* renamed from: V2 */
    void mo4605V2(String str);

    /* renamed from: o1 */
    void mo4606o1(String str, int i, String str2);
}
