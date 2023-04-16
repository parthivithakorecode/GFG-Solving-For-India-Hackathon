package p160x1;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

/* renamed from: x1.q */
public final class C4295q implements Parcelable.Creator<C4282d> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                str = C1299b.m5196f(parcel, o);
            } else if (l == 2) {
                i = C1299b.m5207q(parcel, o);
            } else if (l != 3) {
                C1299b.m5210t(parcel, o);
            } else {
                j = C1299b.m5208r(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new C4282d(str, i, j);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C4282d[i];
    }
}
