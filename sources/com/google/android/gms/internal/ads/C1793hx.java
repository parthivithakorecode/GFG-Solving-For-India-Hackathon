package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.hx */
public final class C1793hx extends C2440zd implements C1867jx {
    C1793hx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* renamed from: G3 */
    public final void mo6360G3(String str, r50 r50, o50 o50) {
        Parcel D = mo12207D();
        D.writeString(str);
        C1551be.m6821f(D, r50);
        C1551be.m6821f(D, o50);
        mo12206C0(5, D);
    }

    /* renamed from: Q4 */
    public final void mo6362Q4(C2459zw zwVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, zwVar);
        mo12206C0(2, D);
    }

    /* renamed from: R3 */
    public final void mo6363R3(b40 b40) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, b40);
        mo12206C0(6, D);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1756gx mo6367b() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo12207D()
            r1 = 1
            android.os.Parcel r0 = r4.mo12210n0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdLoader"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C1756gx
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.gx r1 = (com.google.android.gms.internal.ads.C1756gx) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.ex r2 = new com.google.android.gms.internal.ads.ex
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1793hx.mo6367b():com.google.android.gms.internal.ads.gx");
    }

    /* renamed from: j4 */
    public final void mo6369j4(y50 y50) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, y50);
        mo12206C0(10, D);
    }
}
