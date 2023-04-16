package p091m2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

/* renamed from: m2.b */
public final class C3675b implements Parcelable.Creator<C3710s0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int u = C1299b.m5211u(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            switch (C1299b.m5202l(o)) {
                case 1:
                    j = C1299b.m5208r(parcel2, o);
                    break;
                case 2:
                    j2 = C1299b.m5208r(parcel2, o);
                    break;
                case 3:
                    z = C1299b.m5203m(parcel2, o);
                    break;
                case 4:
                    str = C1299b.m5196f(parcel2, o);
                    break;
                case 5:
                    str2 = C1299b.m5196f(parcel2, o);
                    break;
                case 6:
                    str3 = C1299b.m5196f(parcel2, o);
                    break;
                case 7:
                    bundle = C1299b.m5191a(parcel2, o);
                    break;
                case 8:
                    str4 = C1299b.m5196f(parcel2, o);
                    break;
                default:
                    C1299b.m5210t(parcel2, o);
                    break;
            }
        }
        C1299b.m5201k(parcel2, u);
        return new C3710s0(j, j2, z, str, str2, str3, bundle, str4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C3710s0[i];
    }
}
