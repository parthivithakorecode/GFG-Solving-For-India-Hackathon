package p026d1;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

/* renamed from: d1.j */
public final class C2482j implements Parcelable.Creator<C2469a> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        boolean z = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                z = C1299b.m5203m(parcel, o);
            } else if (l != 2) {
                C1299b.m5210t(parcel, o);
            } else {
                iBinder = C1299b.m5206p(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new C2469a(z, iBinder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2469a[i];
    }
}
