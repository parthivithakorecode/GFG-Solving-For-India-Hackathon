package p070j2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: j2.a */
public class C3227a implements IInterface {

    /* renamed from: f */
    private final IBinder f20602f;

    /* renamed from: g */
    private final String f20603g;

    protected C3227a(IBinder iBinder, String str) {
        this.f20602f = iBinder;
        this.f20603g = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C0 */
    public final void mo14137C0(int i, Parcel parcel) {
        try {
            this.f20602f.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Parcel mo14138D() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f20603g);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f20602f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public final void mo14140n0(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f20602f.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
