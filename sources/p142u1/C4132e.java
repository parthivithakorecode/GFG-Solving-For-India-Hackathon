package p142u1;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

/* renamed from: u1.e */
public final class C4132e implements Parcelable.Creator<C4131d> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                str = C1299b.m5196f(parcel, o);
            } else if (l != 2) {
                C1299b.m5210t(parcel, o);
            } else {
                str2 = C1299b.m5196f(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new C4131d(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4131d[i];
    }
}
