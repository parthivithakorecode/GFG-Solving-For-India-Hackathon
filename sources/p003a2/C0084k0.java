package p003a2;

import android.os.Bundle;
import android.os.Parcel;
import p077k2.C3299b;
import p077k2.C3300c;

/* renamed from: a2.k0 */
public abstract class C0084k0 extends C3299b implements C0083k {
    public C0084k0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final boolean mo247D(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo255v5(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C3300c.m24385b(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            mo256z3(parcel.readInt(), (Bundle) C3300c.m24385b(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo254q5(parcel.readInt(), parcel.readStrongBinder(), (C0108v0) C3300c.m24385b(parcel, C0108v0.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
