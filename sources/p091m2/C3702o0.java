package p091m2;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: m2.o0 */
public abstract class C3702o0 extends C3712u implements C3704p0 {
    /* renamed from: n0 */
    public static C3704p0 m25369n0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof C3704p0 ? (C3704p0) queryLocalInterface : new C3700n0(iBinder);
    }
}
