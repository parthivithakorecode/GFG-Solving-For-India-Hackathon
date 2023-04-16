package p055h2;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: h2.f */
public final class C2700f extends C2695a implements C2698d {
    C2700f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: X */
    public final boolean mo12701X(boolean z) {
        Parcel D = mo12698D();
        C2697c.m21620a(D, true);
        Parcel n0 = mo12700n0(2, D);
        boolean b = C2697c.m21621b(n0);
        n0.recycle();
        return b;
    }

    /* renamed from: c */
    public final boolean mo12702c() {
        Parcel n0 = mo12700n0(6, mo12698D());
        boolean b = C2697c.m21621b(n0);
        n0.recycle();
        return b;
    }

    /* renamed from: j3 */
    public final String mo12703j3() {
        Parcel n0 = mo12700n0(1, mo12698D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }
}
