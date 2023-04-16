package p003a2;

import android.os.Parcel;
import p048g2.C2635a;
import p077k2.C3299b;
import p077k2.C3300c;

/* renamed from: a2.i1 */
public abstract class C0079i1 extends C3299b implements C0082j1 {
    public C0079i1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final boolean mo247D(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C2635a g = mo253g();
            parcel2.writeNoException();
            C3300c.m24386c(parcel2, g);
        } else if (i != 2) {
            return false;
        } else {
            int b = mo252b();
            parcel2.writeNoException();
            parcel2.writeInt(b);
        }
        return true;
    }
}
