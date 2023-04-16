package p069j1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.C1514ae;
import com.google.android.gms.internal.ads.C1551be;
import p048g2.C2635a;

/* renamed from: j1.w0 */
public abstract class C3216w0 extends C1514ae implements C3219x0 {
    public C3216w0() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            boolean zzf = zzf(C2635a.C2636a.m21356n0(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            C1551be.m6818c(parcel2, zzf);
        } else if (i != 2) {
            return false;
        } else {
            zze(C2635a.C2636a.m21356n0(parcel.readStrongBinder()));
            parcel2.writeNoException();
        }
        return true;
    }
}
