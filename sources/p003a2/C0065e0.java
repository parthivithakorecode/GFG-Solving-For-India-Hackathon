package p003a2;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

/* renamed from: a2.e0 */
public final class C0065e0 implements Parcelable.Creator<C0087m> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int u = C1299b.m5211u(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            switch (C1299b.m5202l(o)) {
                case 1:
                    i = C1299b.m5207q(parcel2, o);
                    break;
                case 2:
                    i2 = C1299b.m5207q(parcel2, o);
                    break;
                case 3:
                    i3 = C1299b.m5207q(parcel2, o);
                    break;
                case 4:
                    j = C1299b.m5208r(parcel2, o);
                    break;
                case 5:
                    j2 = C1299b.m5208r(parcel2, o);
                    break;
                case 6:
                    str = C1299b.m5196f(parcel2, o);
                    break;
                case 7:
                    str2 = C1299b.m5196f(parcel2, o);
                    break;
                case 8:
                    i4 = C1299b.m5207q(parcel2, o);
                    break;
                default:
                    C1299b.m5210t(parcel2, o);
                    break;
            }
        }
        C1299b.m5201k(parcel2, u);
        return new C0087m(i, i2, i3, j, j2, str, str2, i4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0087m[i];
    }
}
