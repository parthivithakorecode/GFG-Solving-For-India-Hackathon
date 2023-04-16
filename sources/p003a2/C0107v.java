package p003a2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p013b2.C1299b;

/* renamed from: a2.v */
public final class C0107v implements Parcelable.Creator<C0098r> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        int i = 0;
        ArrayList<C0087m> arrayList = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                i = C1299b.m5207q(parcel, o);
            } else if (l != 2) {
                C1299b.m5210t(parcel, o);
            } else {
                arrayList = C1299b.m5200j(parcel, o, C0087m.CREATOR);
            }
        }
        C1299b.m5201k(parcel, u);
        return new C0098r(i, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0098r[i];
    }
}
