package p003a2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p013b2.C1298a;
import p013b2.C1301c;

/* renamed from: a2.f0 */
public final class C0068f0 extends C1298a {
    public static final Parcelable.Creator<C0068f0> CREATOR = new C0071g0();

    /* renamed from: f */
    final int f162f;

    /* renamed from: g */
    private final Account f163g;

    /* renamed from: h */
    private final int f164h;

    /* renamed from: i */
    private final GoogleSignInAccount f165i;

    C0068f0(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f162f = i;
        this.f163g = account;
        this.f164h = i2;
        this.f165i = googleSignInAccount;
    }

    public C0068f0(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f162f);
        C1301c.m5224l(parcel, 2, this.f163g, i, false);
        C1301c.m5220h(parcel, 3, this.f164h);
        C1301c.m5224l(parcel, 4, this.f165i, i, false);
        C1301c.m5214b(parcel, a);
    }
}
