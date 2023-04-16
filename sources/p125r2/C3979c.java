package p125r2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

/* renamed from: r2.c */
public final class C3979c implements Parcelable.Creator<C3978b> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                i = C1299b.m5207q(parcel, o);
            } else if (l == 2) {
                i2 = C1299b.m5207q(parcel, o);
            } else if (l != 3) {
                C1299b.m5210t(parcel, o);
            } else {
                intent = (Intent) C1299b.m5195e(parcel, o, Intent.CREATOR);
            }
        }
        C1299b.m5201k(parcel, u);
        return new C3978b(i, i2, intent);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C3978b[i];
    }
}
