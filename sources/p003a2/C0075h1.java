package p003a2;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import p077k2.C3298a;
import p077k2.C3300c;

/* renamed from: a2.h1 */
public final class C0075h1 extends C3298a implements C0076i {
    C0075h1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    /* renamed from: a */
    public final Account mo244a() {
        Parcel D = mo14300D(2, mo14302n0());
        Account account = (Account) C3300c.m24385b(D, Account.CREATOR);
        D.recycle();
        return account;
    }
}
