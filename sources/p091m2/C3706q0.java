package p091m2;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: m2.q0 */
public abstract class C3706q0 extends C3712u implements C3708r0 {
    public C3706q0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final boolean mo14901D(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo14873a2((Bundle) C3688h0.m25320b(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
