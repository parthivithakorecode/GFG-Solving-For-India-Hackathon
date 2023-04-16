package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import p048g2.C2635a;

/* renamed from: com.google.android.gms.internal.ads.ce */
public final class C1588ce extends C2440zd implements C1663ee {
    C1588ce(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    /* renamed from: A */
    public final void mo6127A(int i) {
        Parcel D = mo12207D();
        D.writeInt(i);
        mo12206C0(7, D);
    }

    /* renamed from: R */
    public final void mo6128R(int i) {
        Parcel D = mo12207D();
        D.writeInt(0);
        mo12206C0(6, D);
    }

    /* renamed from: d */
    public final void mo6129d() {
        mo12206C0(3, mo12207D());
    }

    /* renamed from: k1 */
    public final void mo6130k1(C2635a aVar, String str) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        D.writeString("GMA_SDK");
        mo12206C0(2, D);
    }

    /* renamed from: l0 */
    public final void mo6131l0(int[] iArr) {
        Parcel D = mo12207D();
        D.writeIntArray((int[]) null);
        mo12206C0(4, D);
    }

    /* renamed from: w0 */
    public final void mo6132w0(byte[] bArr) {
        Parcel D = mo12207D();
        D.writeByteArray(bArr);
        mo12206C0(5, D);
    }
}
