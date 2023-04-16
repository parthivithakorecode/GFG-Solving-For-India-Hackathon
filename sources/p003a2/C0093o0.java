package p003a2;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

/* renamed from: a2.o0 */
public final class C0093o0 implements Parcelable.Creator<C0096q> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                i = C1299b.m5207q(parcel, o);
            } else if (l == 2) {
                z = C1299b.m5203m(parcel, o);
            } else if (l == 3) {
                z2 = C1299b.m5203m(parcel, o);
            } else if (l == 4) {
                i2 = C1299b.m5207q(parcel, o);
            } else if (l != 5) {
                C1299b.m5210t(parcel, o);
            } else {
                i3 = C1299b.m5207q(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new C0096q(i, z, z2, i2, i3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0096q[i];
    }
}
