package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import p048g2.C2635a;
import p077k2.C3298a;
import p077k2.C3300c;

/* renamed from: com.google.android.gms.dynamite.o */
public final class C1497o extends C3298a {
    C1497o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: C0 */
    public final C2635a mo5031C0(C2635a aVar, String str, int i) {
        Parcel n0 = mo14302n0();
        C3300c.m24386c(n0, aVar);
        n0.writeString(str);
        n0.writeInt(i);
        Parcel D = mo14300D(2, n0);
        C2635a n02 = C2635a.C2636a.m21356n0(D.readStrongBinder());
        D.recycle();
        return n02;
    }

    /* renamed from: M3 */
    public final int mo5032M3(C2635a aVar, String str, boolean z) {
        Parcel n0 = mo14302n0();
        C3300c.m24386c(n0, aVar);
        n0.writeString(str);
        C3300c.m24384a(n0, z);
        Parcel D = mo14300D(5, n0);
        int readInt = D.readInt();
        D.recycle();
        return readInt;
    }

    /* renamed from: P4 */
    public final int mo5033P4() {
        Parcel D = mo14300D(6, mo14302n0());
        int readInt = D.readInt();
        D.recycle();
        return readInt;
    }

    /* renamed from: Z2 */
    public final int mo5034Z2(C2635a aVar, String str, boolean z) {
        Parcel n0 = mo14302n0();
        C3300c.m24386c(n0, aVar);
        n0.writeString(str);
        C3300c.m24384a(n0, z);
        Parcel D = mo14300D(3, n0);
        int readInt = D.readInt();
        D.recycle();
        return readInt;
    }

    /* renamed from: b3 */
    public final C2635a mo5035b3(C2635a aVar, String str, int i) {
        Parcel n0 = mo14302n0();
        C3300c.m24386c(n0, aVar);
        n0.writeString(str);
        n0.writeInt(i);
        Parcel D = mo14300D(4, n0);
        C2635a n02 = C2635a.C2636a.m21356n0(D.readStrongBinder());
        D.recycle();
        return n02;
    }

    /* renamed from: u5 */
    public final C2635a mo5036u5(C2635a aVar, String str, boolean z, long j) {
        Parcel n0 = mo14302n0();
        C3300c.m24386c(n0, aVar);
        n0.writeString(str);
        C3300c.m24384a(n0, z);
        n0.writeLong(j);
        Parcel D = mo14300D(7, n0);
        C2635a n02 = C2635a.C2636a.m21356n0(D.readStrongBinder());
        D.recycle();
        return n02;
    }

    /* renamed from: y5 */
    public final C2635a mo5037y5(C2635a aVar, String str, int i, C2635a aVar2) {
        Parcel n0 = mo14302n0();
        C3300c.m24386c(n0, aVar);
        n0.writeString(str);
        n0.writeInt(i);
        C3300c.m24386c(n0, aVar2);
        Parcel D = mo14300D(8, n0);
        C2635a n02 = C2635a.C2636a.m21356n0(D.readStrongBinder());
        D.recycle();
        return n02;
    }
}
