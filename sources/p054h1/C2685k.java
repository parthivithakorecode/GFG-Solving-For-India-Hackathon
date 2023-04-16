package p054h1;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

/* renamed from: h1.k */
public final class C2685k implements Parcelable.Creator<C2684j> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        String str = null;
        float f = 0.0f;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            switch (C1299b.m5202l(o)) {
                case 2:
                    z = C1299b.m5203m(parcel, o);
                    break;
                case 3:
                    z2 = C1299b.m5203m(parcel, o);
                    break;
                case 4:
                    str = C1299b.m5196f(parcel, o);
                    break;
                case 5:
                    z3 = C1299b.m5203m(parcel, o);
                    break;
                case 6:
                    f = C1299b.m5204n(parcel, o);
                    break;
                case 7:
                    i = C1299b.m5207q(parcel, o);
                    break;
                case 8:
                    z4 = C1299b.m5203m(parcel, o);
                    break;
                case 9:
                    z5 = C1299b.m5203m(parcel, o);
                    break;
                case 10:
                    z6 = C1299b.m5203m(parcel, o);
                    break;
                default:
                    C1299b.m5210t(parcel, o);
                    break;
            }
        }
        C1299b.m5201k(parcel, u);
        return new C2684j(z, z2, str, z3, f, i, z4, z5, z6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2684j[i];
    }
}
