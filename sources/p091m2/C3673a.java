package p091m2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: m2.a */
public class C3673a implements IInterface {

    /* renamed from: f */
    private final IBinder f21423f;

    /* renamed from: g */
    private final String f21424g;

    protected C3673a(IBinder iBinder, String str) {
        this.f21423f = iBinder;
        this.f21424g = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Parcel mo14836D() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f21424g);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f21423f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public final void mo14838n0(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f21423f.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
