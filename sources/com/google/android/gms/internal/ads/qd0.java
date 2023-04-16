package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p048g2.C2635a;

public final class qd0 extends C2440zd implements sd0 {
    qd0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* renamed from: F */
    public final boolean mo9205F() {
        Parcel n0 = mo12210n0(18, mo12207D());
        boolean g = C1551be.m6822g(n0);
        n0.recycle();
        return g;
    }

    /* renamed from: G */
    public final boolean mo9206G() {
        Parcel n0 = mo12210n0(17, mo12207D());
        boolean g = C1551be.m6822g(n0);
        n0.recycle();
        return g;
    }

    /* renamed from: M */
    public final void mo9207M() {
        mo12206C0(19, mo12207D());
    }

    /* renamed from: P1 */
    public final void mo9208P1(C2635a aVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        mo12206C0(22, D);
    }

    /* renamed from: b */
    public final double mo9209b() {
        Parcel n0 = mo12210n0(8, mo12207D());
        double readDouble = n0.readDouble();
        n0.recycle();
        return readDouble;
    }

    /* renamed from: d */
    public final float mo9210d() {
        Parcel n0 = mo12210n0(23, mo12207D());
        float readFloat = n0.readFloat();
        n0.recycle();
        return readFloat;
    }

    /* renamed from: e */
    public final float mo9211e() {
        Parcel n0 = mo12210n0(25, mo12207D());
        float readFloat = n0.readFloat();
        n0.recycle();
        return readFloat;
    }

    /* renamed from: f */
    public final float mo9212f() {
        Parcel n0 = mo12210n0(24, mo12207D());
        float readFloat = n0.readFloat();
        n0.recycle();
        return readFloat;
    }

    /* renamed from: h */
    public final Bundle mo9213h() {
        Parcel n0 = mo12210n0(16, mo12207D());
        Bundle bundle = (Bundle) C1551be.m6816a(n0, Bundle.CREATOR);
        n0.recycle();
        return bundle;
    }

    /* renamed from: i */
    public final C1609cz mo9214i() {
        Parcel n0 = mo12210n0(11, mo12207D());
        C1609cz z5 = C1572bz.m7158z5(n0.readStrongBinder());
        n0.recycle();
        return z5;
    }

    /* renamed from: j */
    public final g40 mo9215j() {
        Parcel n0 = mo12210n0(12, mo12207D());
        g40 z5 = e40.m8290z5(n0.readStrongBinder());
        n0.recycle();
        return z5;
    }

    /* renamed from: k */
    public final n40 mo9216k() {
        Parcel n0 = mo12210n0(5, mo12207D());
        n40 z5 = m40.m13048z5(n0.readStrongBinder());
        n0.recycle();
        return z5;
    }

    /* renamed from: l */
    public final String mo9217l() {
        Parcel n0 = mo12210n0(7, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: m */
    public final C2635a mo9218m() {
        Parcel n0 = mo12210n0(14, mo12207D());
        C2635a n02 = C2635a.C2636a.m21356n0(n0.readStrongBinder());
        n0.recycle();
        return n02;
    }

    /* renamed from: n */
    public final C2635a mo9219n() {
        Parcel n0 = mo12210n0(15, mo12207D());
        C2635a n02 = C2635a.C2636a.m21356n0(n0.readStrongBinder());
        n0.recycle();
        return n02;
    }

    /* renamed from: o */
    public final C2635a mo9220o() {
        Parcel n0 = mo12210n0(13, mo12207D());
        C2635a n02 = C2635a.C2636a.m21356n0(n0.readStrongBinder());
        n0.recycle();
        return n02;
    }

    /* renamed from: p */
    public final String mo9221p() {
        Parcel n0 = mo12210n0(2, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: p1 */
    public final void mo9222p1(C2635a aVar, C2635a aVar2, C2635a aVar3) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        C1551be.m6821f(D, aVar2);
        C1551be.m6821f(D, aVar3);
        mo12206C0(21, D);
    }

    /* renamed from: p3 */
    public final void mo9223p3(C2635a aVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        mo12206C0(20, D);
    }

    /* renamed from: q */
    public final String mo9224q() {
        Parcel n0 = mo12210n0(10, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: r */
    public final String mo9225r() {
        Parcel n0 = mo12210n0(4, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: t */
    public final String mo9226t() {
        Parcel n0 = mo12210n0(6, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: x */
    public final List mo9227x() {
        Parcel n0 = mo12210n0(3, mo12207D());
        ArrayList b = C1551be.m6817b(n0);
        n0.recycle();
        return b;
    }

    /* renamed from: y */
    public final String mo9228y() {
        Parcel n0 = mo12210n0(9, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }
}
