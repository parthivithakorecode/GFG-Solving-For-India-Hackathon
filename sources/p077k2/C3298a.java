package p077k2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: k2.a */
public class C3298a implements IInterface {

    /* renamed from: f */
    private final IBinder f20776f;

    /* renamed from: g */
    private final String f20777g;

    protected C3298a(IBinder iBinder, String str) {
        this.f20776f = iBinder;
        this.f20777g = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Parcel mo14300D(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f20776f.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f20776f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public final Parcel mo14302n0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f20777g);
        return obtain;
    }
}
