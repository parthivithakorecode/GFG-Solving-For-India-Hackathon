package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import p048g2.C2635a;

/* renamed from: com.google.android.gms.internal.ads.lx */
public final class C1941lx extends C2440zd implements C2015nx {
    C1941lx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* renamed from: C4 */
    public final void mo7451C4(C2341wp wpVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, wpVar);
        mo12206C0(40, D);
    }

    /* renamed from: E4 */
    public final void mo7452E4(C2350wy wyVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, wyVar);
        mo12206C0(42, D);
    }

    /* renamed from: G */
    public final void mo7454G() {
        mo12206C0(6, mo12207D());
    }

    /* renamed from: M */
    public final void mo7457M() {
        mo12206C0(2, mo12207D());
    }

    /* renamed from: R0 */
    public final void mo7460R0(C2635a aVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        mo12206C0(44, D);
    }

    /* renamed from: S2 */
    public final void mo7461S2(C2459zw zwVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, zwVar);
        mo12206C0(7, D);
    }

    /* renamed from: U */
    public final void mo7463U() {
        mo12206C0(5, mo12207D());
    }

    /* renamed from: U0 */
    public final void mo7464U0(C2348ww wwVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, wwVar);
        mo12206C0(20, D);
    }

    /* renamed from: X3 */
    public final boolean mo7467X3(C1902kv kvVar) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, kvVar);
        Parcel n0 = mo12210n0(4, D);
        boolean g = C1551be.m6822g(n0);
        n0.recycle();
        return g;
    }

    /* renamed from: Y1 */
    public final void mo7468Y1(C1902kv kvVar, C1644dx dxVar) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, kvVar);
        C1551be.m6821f(D, dxVar);
        mo12206C0(43, D);
    }

    /* renamed from: b4 */
    public final void mo7470b4(C2309vv vvVar) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, vvVar);
        mo12206C0(39, D);
    }

    /* renamed from: d2 */
    public final void mo7471d2(C1571by byVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, byVar);
        mo12206C0(45, D);
    }

    /* renamed from: e */
    public final C2087pv mo7472e() {
        Parcel n0 = mo12210n0(12, mo12207D());
        C2087pv pvVar = (C2087pv) C1551be.m6816a(n0, C2087pv.CREATOR);
        n0.recycle();
        return pvVar;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C2461zy mo7476j() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo12207D()
            r1 = 41
            android.os.Parcel r0 = r4.mo12210n0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IResponseInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C2461zy
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zy r1 = (com.google.android.gms.internal.ads.C2461zy) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.xy r2 = new com.google.android.gms.internal.ads.xy
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1941lx.mo7476j():com.google.android.gms.internal.ads.zy");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1609cz mo7477k() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo12207D()
            r1 = 26
            android.os.Parcel r0 = r4.mo12210n0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoController"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C1609cz
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.cz r1 = (com.google.android.gms.internal.ads.C1609cz) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.az r2 = new com.google.android.gms.internal.ads.az
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1941lx.mo7477k():com.google.android.gms.internal.ads.cz");
    }

    /* renamed from: k3 */
    public final void mo7479k3(boolean z) {
        Parcel D = mo12207D();
        C1551be.m6818c(D, z);
        mo12206C0(34, D);
    }

    /* renamed from: m */
    public final C2635a mo7480m() {
        Parcel n0 = mo12210n0(1, mo12207D());
        C2635a n02 = C2635a.C2636a.m21356n0(n0.readStrongBinder());
        n0.recycle();
        return n02;
    }

    /* renamed from: m5 */
    public final void mo7481m5(boolean z) {
        Parcel D = mo12207D();
        C1551be.m6818c(D, z);
        mo12206C0(22, D);
    }

    /* renamed from: n3 */
    public final void mo7482n3(C2274ux uxVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, uxVar);
        mo12206C0(8, D);
    }

    /* renamed from: n5 */
    public final void mo7483n5(s00 s00) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, s00);
        mo12206C0(29, D);
    }

    /* renamed from: s3 */
    public final void mo7487s3(C2087pv pvVar) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, pvVar);
        mo12206C0(13, D);
    }

    /* renamed from: t */
    public final String mo7488t() {
        Parcel n0 = mo12210n0(31, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }
}
