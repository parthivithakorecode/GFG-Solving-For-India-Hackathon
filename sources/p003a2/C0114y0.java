package p003a2;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p013b2.C1299b;
import p013b2.C1301c;
import p160x1.C4282d;

/* renamed from: a2.y0 */
public final class C0114y0 implements Parcelable.Creator<C0067f> {
    /* renamed from: a */
    static void m357a(C0067f fVar, Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, fVar.f148f);
        C1301c.m5220h(parcel, 2, fVar.f149g);
        C1301c.m5220h(parcel, 3, fVar.f150h);
        C1301c.m5225m(parcel, 4, fVar.f151i, false);
        C1301c.m5219g(parcel, 5, fVar.f152j, false);
        C1301c.m5228p(parcel, 6, fVar.f153k, i, false);
        C1301c.m5216d(parcel, 7, fVar.f154l, false);
        C1301c.m5224l(parcel, 8, fVar.f155m, i, false);
        C1301c.m5228p(parcel, 10, fVar.f156n, i, false);
        C1301c.m5228p(parcel, 11, fVar.f157o, i, false);
        C1301c.m5215c(parcel, 12, fVar.f158p);
        C1301c.m5220h(parcel, 13, fVar.f159q);
        C1301c.m5215c(parcel, 14, fVar.f160r);
        C1301c.m5225m(parcel, 15, fVar.mo228c(), false);
        C1301c.m5214b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int u = C1299b.m5211u(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        C4282d[] dVarArr = null;
        C4282d[] dVarArr2 = null;
        String str2 = null;
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
                    str = C1299b.m5196f(parcel2, o);
                    break;
                case 5:
                    iBinder = C1299b.m5206p(parcel2, o);
                    break;
                case 6:
                    scopeArr = (Scope[]) C1299b.m5199i(parcel2, o, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C1299b.m5191a(parcel2, o);
                    break;
                case 8:
                    account = (Account) C1299b.m5195e(parcel2, o, Account.CREATOR);
                    break;
                case 10:
                    dVarArr = (C4282d[]) C1299b.m5199i(parcel2, o, C4282d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (C4282d[]) C1299b.m5199i(parcel2, o, C4282d.CREATOR);
                    break;
                case 12:
                    z = C1299b.m5203m(parcel2, o);
                    break;
                case 13:
                    i4 = C1299b.m5207q(parcel2, o);
                    break;
                case 14:
                    z2 = C1299b.m5203m(parcel2, o);
                    break;
                case 15:
                    str2 = C1299b.m5196f(parcel2, o);
                    break;
                default:
                    C1299b.m5210t(parcel2, o);
                    break;
            }
        }
        C1299b.m5201k(parcel2, u);
        return new C0067f(i, i2, i3, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z, i4, z2, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0067f[i];
    }
}
