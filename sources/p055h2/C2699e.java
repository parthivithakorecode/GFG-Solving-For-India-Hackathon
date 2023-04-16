package p055h2;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: h2.e */
public abstract class C2699e extends C2696b implements C2698d {
    /* renamed from: D */
    public static C2698d m21625D(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof C2698d ? (C2698d) queryLocalInterface : new C2700f(iBinder);
    }
}
