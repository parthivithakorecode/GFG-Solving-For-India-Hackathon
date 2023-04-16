package p069j1;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

/* renamed from: j1.g0 */
public final class C3161g0 implements Parcelable.Creator<C3157f0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                str = C1299b.m5196f(parcel, o);
            } else if (l != 2) {
                C1299b.m5210t(parcel, o);
            } else {
                i = C1299b.m5207q(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new C3157f0(str, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3157f0[i];
    }
}
