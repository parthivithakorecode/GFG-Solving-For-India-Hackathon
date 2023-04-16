package p125r2;

import android.os.Parcel;
import android.os.Parcelable;
import p003a2.C0074h0;
import p013b2.C1299b;
import p160x1.C4280b;

/* renamed from: r2.m */
public final class C3989m implements Parcelable.Creator<C3988l> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        C4280b bVar = null;
        int i = 0;
        C0074h0 h0Var = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                i = C1299b.m5207q(parcel, o);
            } else if (l == 2) {
                bVar = (C4280b) C1299b.m5195e(parcel, o, C4280b.CREATOR);
            } else if (l != 3) {
                C1299b.m5210t(parcel, o);
            } else {
                h0Var = (C0074h0) C1299b.m5195e(parcel, o, C0074h0.CREATOR);
            }
        }
        C1299b.m5201k(parcel, u);
        return new C3988l(i, bVar, h0Var);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C3988l[i];
    }
}
