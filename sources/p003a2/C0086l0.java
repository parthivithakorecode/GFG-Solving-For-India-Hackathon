package p003a2;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: a2.l0 */
final class C0086l0 implements C0085l {

    /* renamed from: f */
    private final IBinder f186f;

    C0086l0(IBinder iBinder) {
        this.f186f = iBinder;
    }

    public final IBinder asBinder() {
        return this.f186f;
    }

    /* renamed from: i3 */
    public final void mo257i3(C0083k kVar, C0067f fVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(kVar != null ? kVar.asBinder() : null);
            if (fVar != null) {
                obtain.writeInt(1);
                C0114y0.m357a(fVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f186f.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
