package p062i2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: i2.a */
public class C2828a implements IInterface {

    /* renamed from: f */
    private final IBinder f19521f;

    /* renamed from: g */
    private final String f19522g = "com.google.android.gms.appset.internal.IAppSetService";

    protected C2828a(IBinder iBinder, String str) {
        this.f19521f = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Parcel mo13087D() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f19522g);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f19521f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public final void mo13089n0(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f19521f.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
