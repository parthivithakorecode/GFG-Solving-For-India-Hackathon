package p003a2;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

/* renamed from: a2.x0 */
public final class C0112x0 implements Parcelable.Creator<C0064e> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        C0096q qVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            switch (C1299b.m5202l(o)) {
                case 1:
                    qVar = (C0096q) C1299b.m5195e(parcel, o, C0096q.CREATOR);
                    break;
                case 2:
                    z = C1299b.m5203m(parcel, o);
                    break;
                case 3:
                    z2 = C1299b.m5203m(parcel, o);
                    break;
                case 4:
                    iArr = C1299b.m5193c(parcel, o);
                    break;
                case 5:
                    i = C1299b.m5207q(parcel, o);
                    break;
                case 6:
                    iArr2 = C1299b.m5193c(parcel, o);
                    break;
                default:
                    C1299b.m5210t(parcel, o);
                    break;
            }
        }
        C1299b.m5201k(parcel, u);
        return new C0064e(qVar, z, z2, iArr, i, iArr2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0064e[i];
    }
}
