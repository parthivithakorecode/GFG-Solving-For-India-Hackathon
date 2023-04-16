package p003a2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;
import p160x1.C4282d;

/* renamed from: a2.w0 */
public final class C0110w0 implements Parcelable.Creator<C0108v0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        Bundle bundle = null;
        C0064e eVar = null;
        int i = 0;
        C4282d[] dVarArr = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                bundle = C1299b.m5191a(parcel, o);
            } else if (l == 2) {
                dVarArr = (C4282d[]) C1299b.m5199i(parcel, o, C4282d.CREATOR);
            } else if (l == 3) {
                i = C1299b.m5207q(parcel, o);
            } else if (l != 4) {
                C1299b.m5210t(parcel, o);
            } else {
                eVar = (C0064e) C1299b.m5195e(parcel, o, C0064e.CREATOR);
            }
        }
        C1299b.m5201k(parcel, u);
        return new C0108v0(bundle, dVarArr, i, eVar);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0108v0[i];
    }
}
