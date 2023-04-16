package p026d1;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

/* renamed from: d1.m */
public final class C2485m implements Parcelable.Creator<C2478g> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        IBinder iBinder = null;
        boolean z = false;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                z = C1299b.m5203m(parcel, o);
            } else if (l == 2) {
                iBinder = C1299b.m5206p(parcel, o);
            } else if (l != 3) {
                C1299b.m5210t(parcel, o);
            } else {
                iBinder2 = C1299b.m5206p(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new C2478g(z, iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2478g[i];
    }
}
