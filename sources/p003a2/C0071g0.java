package p003a2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p013b2.C1299b;

/* renamed from: a2.g0 */
public final class C0071g0 implements Parcelable.Creator<C0068f0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        Account account = null;
        int i = 0;
        int i2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                i = C1299b.m5207q(parcel, o);
            } else if (l == 2) {
                account = (Account) C1299b.m5195e(parcel, o, Account.CREATOR);
            } else if (l == 3) {
                i2 = C1299b.m5207q(parcel, o);
            } else if (l != 4) {
                C1299b.m5210t(parcel, o);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C1299b.m5195e(parcel, o, GoogleSignInAccount.CREATOR);
            }
        }
        C1299b.m5201k(parcel, u);
        return new C0068f0(i, account, i2, googleSignInAccount);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0068f0[i];
    }
}
