package p125r2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p013b2.C1299b;

/* renamed from: r2.i */
public final class C3985i implements Parcelable.Creator<C3984h> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                arrayList = C1299b.m5198h(parcel, o);
            } else if (l != 2) {
                C1299b.m5210t(parcel, o);
            } else {
                str = C1299b.m5196f(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new C3984h(arrayList, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C3984h[i];
    }
}
