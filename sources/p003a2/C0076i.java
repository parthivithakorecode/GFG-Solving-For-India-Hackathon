package p003a2;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;
import p077k2.C3299b;

/* renamed from: a2.i */
public interface C0076i extends IInterface {

    /* renamed from: a2.i$a */
    public static abstract class C0077a extends C3299b implements C0076i {
        @RecentlyNonNull
        /* renamed from: n0 */
        public static C0076i m285n0(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof C0076i ? (C0076i) queryLocalInterface : new C0075h1(iBinder);
        }
    }

    @RecentlyNonNull
    /* renamed from: a */
    Account mo244a();
}
