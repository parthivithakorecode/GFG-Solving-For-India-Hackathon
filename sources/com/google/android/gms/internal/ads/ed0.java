package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import p048g2.C2635a;

public final class ed0 extends C2440zd implements gd0 {
    ed0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* renamed from: E3 */
    public final void mo6134E3(C2635a aVar, C1902kv kvVar, String str, String str2, jd0 jd0) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        C1551be.m6819d(D, kvVar);
        D.writeString(str);
        D.writeString(str2);
        C1551be.m6821f(D, jd0);
        mo12206C0(7, D);
    }

    /* renamed from: H */
    public final boolean mo6135H() {
        Parcel n0 = mo12210n0(22, mo12207D());
        boolean g = C1551be.m6822g(n0);
        n0.recycle();
        return g;
    }

    /* renamed from: I */
    public final void mo6136I() {
        mo12206C0(4, mo12207D());
    }

    /* renamed from: I4 */
    public final void mo6137I4(C2635a aVar, xj0 xj0, List<String> list) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        C1551be.m6821f(D, xj0);
        D.writeStringList(list);
        mo12206C0(23, D);
    }

    /* renamed from: J */
    public final boolean mo6138J() {
        Parcel n0 = mo12210n0(13, mo12207D());
        boolean g = C1551be.m6822g(n0);
        n0.recycle();
        return g;
    }

    /* renamed from: K0 */
    public final void mo6139K0(C2635a aVar, j90 j90, List<p90> list) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        C1551be.m6821f(D, j90);
        D.writeTypedList(list);
        mo12206C0(31, D);
    }

    /* renamed from: L */
    public final void mo6140L() {
        mo12206C0(9, mo12207D());
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.pd0 mo6141O() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo12207D()
            r1 = 16
            android.os.Parcel r0 = r4.mo12210n0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.pd0
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.pd0 r1 = (com.google.android.gms.internal.ads.pd0) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.pd0 r2 = new com.google.android.gms.internal.ads.pd0
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ed0.mo6141O():com.google.android.gms.internal.ads.pd0");
    }

    /* renamed from: Q2 */
    public final void mo6143Q2(C2635a aVar, C1902kv kvVar, String str, String str2, jd0 jd0, b40 b40, List<String> list) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        C1551be.m6819d(D, kvVar);
        D.writeString(str);
        D.writeString(str2);
        C1551be.m6821f(D, jd0);
        C1551be.m6819d(D, b40);
        D.writeStringList(list);
        mo12206C0(14, D);
    }

    /* renamed from: S0 */
    public final void mo6144S0(C2635a aVar, C1902kv kvVar, String str, jd0 jd0) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        C1551be.m6819d(D, kvVar);
        D.writeString(str);
        C1551be.m6821f(D, jd0);
        mo12206C0(28, D);
    }

    /* renamed from: X1 */
    public final void mo6146X1(C1902kv kvVar, String str) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, kvVar);
        D.writeString(str);
        mo12206C0(11, D);
    }

    /* renamed from: Z */
    public final void mo6147Z() {
        mo12206C0(8, mo12207D());
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.od0 mo6148a0() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo12207D()
            r1 = 15
            android.os.Parcel r0 = r4.mo12210n0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.od0
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.od0 r1 = (com.google.android.gms.internal.ads.od0) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.od0 r2 = new com.google.android.gms.internal.ads.od0
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ed0.mo6148a0():com.google.android.gms.internal.ads.od0");
    }

    /* renamed from: c3 */
    public final void mo6150c3(C2635a aVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        mo12206C0(37, D);
    }

    /* renamed from: f */
    public final C1609cz mo6153f() {
        Parcel n0 = mo12210n0(26, mo12207D());
        C1609cz z5 = C1572bz.m7158z5(n0.readStrongBinder());
        n0.recycle();
        return z5;
    }

    /* renamed from: f1 */
    public final void mo6154f1(C2635a aVar, C2087pv pvVar, C1902kv kvVar, String str, String str2, jd0 jd0) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        C1551be.m6819d(D, pvVar);
        C1551be.m6819d(D, kvVar);
        D.writeString(str);
        D.writeString(str2);
        C1551be.m6821f(D, jd0);
        mo12206C0(35, D);
    }

    /* renamed from: g2 */
    public final void mo6155g2(C2635a aVar, C2087pv pvVar, C1902kv kvVar, String str, String str2, jd0 jd0) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        C1551be.m6819d(D, pvVar);
        C1551be.m6819d(D, kvVar);
        D.writeString(str);
        D.writeString(str2);
        C1551be.m6821f(D, jd0);
        mo12206C0(6, D);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.md0 mo6157i() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo12207D()
            r1 = 36
            android.os.Parcel r0 = r4.mo12210n0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.md0
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.md0 r1 = (com.google.android.gms.internal.ads.md0) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.kd0 r2 = new com.google.android.gms.internal.ads.kd0
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ed0.mo6157i():com.google.android.gms.internal.ads.md0");
    }

    /* renamed from: i2 */
    public final void mo6158i2(C2635a aVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        mo12206C0(21, D);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.sd0 mo6159j() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo12207D()
            r1 = 27
            android.os.Parcel r0 = r4.mo12210n0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.sd0
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.sd0 r1 = (com.google.android.gms.internal.ads.sd0) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.qd0 r2 = new com.google.android.gms.internal.ads.qd0
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ed0.mo6159j():com.google.android.gms.internal.ads.sd0");
    }

    /* renamed from: j1 */
    public final void mo6160j1(boolean z) {
        Parcel D = mo12207D();
        C1551be.m6818c(D, z);
        mo12206C0(25, D);
    }

    /* renamed from: k */
    public final qf0 mo6161k() {
        Parcel n0 = mo12210n0(33, mo12207D());
        qf0 qf0 = (qf0) C1551be.m6816a(n0, qf0.CREATOR);
        n0.recycle();
        return qf0;
    }

    /* renamed from: k4 */
    public final void mo6162k4(C2635a aVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        mo12206C0(30, D);
    }

    /* renamed from: m */
    public final C2635a mo6163m() {
        Parcel n0 = mo12210n0(2, mo12207D());
        C2635a n02 = C2635a.C2636a.m21356n0(n0.readStrongBinder());
        n0.recycle();
        return n02;
    }

    /* renamed from: n */
    public final void mo6164n() {
        mo12206C0(5, mo12207D());
    }

    /* renamed from: o */
    public final qf0 mo6165o() {
        Parcel n0 = mo12210n0(34, mo12207D());
        qf0 qf0 = (qf0) C1551be.m6816a(n0, qf0.CREATOR);
        n0.recycle();
        return qf0;
    }

    /* renamed from: t3 */
    public final void mo6166t3(C2635a aVar, C1902kv kvVar, String str, xj0 xj0, String str2) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        C1551be.m6819d(D, kvVar);
        D.writeString((String) null);
        C1551be.m6821f(D, xj0);
        D.writeString(str2);
        mo12206C0(10, D);
    }

    /* renamed from: v */
    public final void mo6167v() {
        mo12206C0(12, mo12207D());
    }

    /* renamed from: v1 */
    public final void mo6168v1(C2635a aVar, C1902kv kvVar, String str, jd0 jd0) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        C1551be.m6819d(D, kvVar);
        D.writeString(str);
        C1551be.m6821f(D, jd0);
        mo12206C0(32, D);
    }
}
