package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p013b2.C1299b;

/* renamed from: com.google.android.gms.auth.api.signin.a */
public final class C1474a implements Parcelable.Creator<GoogleSignInAccount> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int u = C1299b.m5211u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList<Scope> arrayList = null;
        String str7 = null;
        String str8 = null;
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            switch (C1299b.m5202l(o)) {
                case 1:
                    i = C1299b.m5207q(parcel2, o);
                    break;
                case 2:
                    str = C1299b.m5196f(parcel2, o);
                    break;
                case 3:
                    str2 = C1299b.m5196f(parcel2, o);
                    break;
                case 4:
                    str3 = C1299b.m5196f(parcel2, o);
                    break;
                case 5:
                    str4 = C1299b.m5196f(parcel2, o);
                    break;
                case 6:
                    uri = (Uri) C1299b.m5195e(parcel2, o, Uri.CREATOR);
                    break;
                case 7:
                    str5 = C1299b.m5196f(parcel2, o);
                    break;
                case 8:
                    j = C1299b.m5208r(parcel2, o);
                    break;
                case 9:
                    str6 = C1299b.m5196f(parcel2, o);
                    break;
                case 10:
                    arrayList = C1299b.m5200j(parcel2, o, Scope.CREATOR);
                    break;
                case 11:
                    str7 = C1299b.m5196f(parcel2, o);
                    break;
                case 12:
                    str8 = C1299b.m5196f(parcel2, o);
                    break;
                default:
                    C1299b.m5210t(parcel2, o);
                    break;
            }
        }
        C1299b.m5201k(parcel2, u);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
