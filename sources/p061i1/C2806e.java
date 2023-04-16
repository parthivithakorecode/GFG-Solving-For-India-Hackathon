package p061i1;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

/* renamed from: i1.e */
public final class C2806e implements Parcelable.Creator<C2807f> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        IBinder iBinder = null;
        boolean z = false;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            switch (C1299b.m5202l(o)) {
                case 2:
                    str = C1299b.m5196f(parcel, o);
                    break;
                case 3:
                    str2 = C1299b.m5196f(parcel, o);
                    break;
                case 4:
                    str3 = C1299b.m5196f(parcel, o);
                    break;
                case 5:
                    str4 = C1299b.m5196f(parcel, o);
                    break;
                case 6:
                    str5 = C1299b.m5196f(parcel, o);
                    break;
                case 7:
                    str6 = C1299b.m5196f(parcel, o);
                    break;
                case 8:
                    str7 = C1299b.m5196f(parcel, o);
                    break;
                case 9:
                    intent = (Intent) C1299b.m5195e(parcel, o, Intent.CREATOR);
                    break;
                case 10:
                    iBinder = C1299b.m5206p(parcel, o);
                    break;
                case 11:
                    z = C1299b.m5203m(parcel, o);
                    break;
                default:
                    C1299b.m5210t(parcel, o);
                    break;
            }
        }
        C1299b.m5201k(parcel, u);
        return new C2807f(str, str2, str3, str4, str5, str6, str7, intent, iBinder, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2807f[i];
    }
}
