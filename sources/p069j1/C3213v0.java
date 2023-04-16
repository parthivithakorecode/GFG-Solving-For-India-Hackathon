package p069j1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.C1551be;
import com.google.android.gms.internal.ads.C2440zd;
import p048g2.C2635a;

/* renamed from: j1.v0 */
public final class C3213v0 extends C2440zd implements C3219x0 {
    C3213v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    public final void zze(C2635a aVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        mo12206C0(2, D);
    }

    public final boolean zzf(C2635a aVar, String str, String str2) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        D.writeString(str);
        D.writeString(str2);
        Parcel n0 = mo12210n0(1, D);
        boolean g = C1551be.m6822g(n0);
        n0.recycle();
        return g;
    }
}
