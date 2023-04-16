package p003a2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;
import p160x1.C4280b;

/* renamed from: a2.i0 */
public final class C0078i0 implements Parcelable.Creator<C0074h0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        IBinder iBinder = null;
        C4280b bVar = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                i = C1299b.m5207q(parcel, o);
            } else if (l == 2) {
                iBinder = C1299b.m5206p(parcel, o);
            } else if (l == 3) {
                bVar = (C4280b) C1299b.m5195e(parcel, o, C4280b.CREATOR);
            } else if (l == 4) {
                z = C1299b.m5203m(parcel, o);
            } else if (l != 5) {
                C1299b.m5210t(parcel, o);
            } else {
                z2 = C1299b.m5203m(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new C0074h0(i, iBinder, bVar, z, z2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0074h0[i];
    }
}
