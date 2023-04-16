package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p048g2.C2635a;

/* renamed from: com.google.android.gms.internal.ads.cy */
public final class C1608cy extends C2440zd implements C1720fy {
    C1608cy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* renamed from: C3 */
    public final void mo6315C3(C2127qy qyVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, qyVar);
        mo12206C0(16, D);
    }

    /* renamed from: J1 */
    public final void mo6316J1(C2635a aVar, String str) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        D.writeString(str);
        mo12206C0(5, D);
    }

    /* renamed from: L3 */
    public final void mo6317L3(dd0 dd0) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, dd0);
        mo12206C0(11, D);
    }

    /* renamed from: a1 */
    public final void mo6318a1(n00 n00) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, n00);
        mo12206C0(14, D);
    }

    /* renamed from: a4 */
    public final void mo6319a4(String str, C2635a aVar) {
        Parcel D = mo12207D();
        D.writeString((String) null);
        C1551be.m6821f(D, aVar);
        mo12206C0(6, D);
    }

    /* renamed from: d */
    public final String mo6320d() {
        Parcel n0 = mo12210n0(9, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: d3 */
    public final void mo6321d3(m90 m90) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, m90);
        mo12206C0(12, D);
    }

    /* renamed from: e */
    public final List<f90> mo6322e() {
        Parcel n0 = mo12210n0(13, mo12207D());
        ArrayList<f90> createTypedArrayList = n0.createTypedArrayList(f90.CREATOR);
        n0.recycle();
        return createTypedArrayList;
    }

    /* renamed from: h */
    public final void mo6323h() {
        mo12206C0(15, mo12207D());
    }

    /* renamed from: i */
    public final void mo6324i() {
        mo12206C0(1, mo12207D());
    }

    /* renamed from: i4 */
    public final void mo6325i4(float f) {
        Parcel D = mo12207D();
        D.writeFloat(f);
        mo12206C0(2, D);
    }

    /* renamed from: x0 */
    public final void mo6326x0(boolean z) {
        Parcel D = mo12207D();
        C1551be.m6818c(D, z);
        mo12206C0(4, D);
    }
}
