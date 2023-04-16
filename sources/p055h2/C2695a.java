package p055h2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: h2.a */
public class C2695a implements IInterface {

    /* renamed from: f */
    private final IBinder f19192f;

    /* renamed from: g */
    private final String f19193g;

    protected C2695a(IBinder iBinder, String str) {
        this.f19192f = iBinder;
        this.f19193g = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Parcel mo12698D() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f19193g);
        return obtain;
    }

    public IBinder asBinder() {
        return this.f19192f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public final Parcel mo12700n0(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f19192f.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
