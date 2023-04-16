package p125r2;

import android.os.Parcel;
import android.os.Parcelable;
import p003a2.C0068f0;
import p013b2.C1299b;

/* renamed from: r2.k */
public final class C3987k implements Parcelable.Creator<C3986j> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        int i = 0;
        C0068f0 f0Var = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                i = C1299b.m5207q(parcel, o);
            } else if (l != 2) {
                C1299b.m5210t(parcel, o);
            } else {
                f0Var = (C0068f0) C1299b.m5195e(parcel, o, C0068f0.CREATOR);
            }
        }
        C1299b.m5201k(parcel, u);
        return new C3986j(i, f0Var);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C3986j[i];
    }
}
