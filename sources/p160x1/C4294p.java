package p160x1;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

/* renamed from: x1.p */
public final class C4294p implements Parcelable.Creator<C4280b> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        PendingIntent pendingIntent = null;
        int i = 0;
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                i = C1299b.m5207q(parcel, o);
            } else if (l == 2) {
                i2 = C1299b.m5207q(parcel, o);
            } else if (l == 3) {
                pendingIntent = (PendingIntent) C1299b.m5195e(parcel, o, PendingIntent.CREATOR);
            } else if (l != 4) {
                C1299b.m5210t(parcel, o);
            } else {
                str = C1299b.m5196f(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new C4280b(i, i2, pendingIntent, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C4280b[i];
    }
}
