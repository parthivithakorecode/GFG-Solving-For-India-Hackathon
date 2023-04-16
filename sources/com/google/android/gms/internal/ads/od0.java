package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p048g2.C2635a;

public final class od0 extends C2440zd {
    od0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    /* renamed from: A5 */
    public final void mo9725A5(C2635a aVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        mo12206C0(11, D);
    }

    /* renamed from: B5 */
    public final void mo9726B5(C2635a aVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        mo12206C0(12, D);
    }

    /* renamed from: C5 */
    public final void mo9727C5(C2635a aVar, C2635a aVar2, C2635a aVar3) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        C1551be.m6821f(D, aVar2);
        C1551be.m6821f(D, aVar3);
        mo12206C0(22, D);
    }

    /* renamed from: D5 */
    public final boolean mo9728D5() {
        Parcel n0 = mo12210n0(14, mo12207D());
        boolean g = C1551be.m6822g(n0);
        n0.recycle();
        return g;
    }

    /* renamed from: E5 */
    public final boolean mo9729E5() {
        Parcel n0 = mo12210n0(13, mo12207D());
        boolean g = C1551be.m6822g(n0);
        n0.recycle();
        return g;
    }

    /* renamed from: M3 */
    public final g40 mo9730M3() {
        Parcel n0 = mo12210n0(19, mo12207D());
        g40 z5 = e40.m8290z5(n0.readStrongBinder());
        n0.recycle();
        return z5;
    }

    /* renamed from: P4 */
    public final n40 mo9731P4() {
        Parcel n0 = mo12210n0(5, mo12207D());
        n40 z5 = m40.m13048z5(n0.readStrongBinder());
        n0.recycle();
        return z5;
    }

    /* renamed from: b */
    public final double mo9732b() {
        Parcel n0 = mo12210n0(7, mo12207D());
        double readDouble = n0.readDouble();
        n0.recycle();
        return readDouble;
    }

    /* renamed from: b3 */
    public final C1609cz mo9733b3() {
        Parcel n0 = mo12210n0(17, mo12207D());
        C1609cz z5 = C1572bz.m7158z5(n0.readStrongBinder());
        n0.recycle();
        return z5;
    }

    /* renamed from: d */
    public final Bundle mo9734d() {
        Parcel n0 = mo12210n0(15, mo12207D());
        Bundle bundle = (Bundle) C1551be.m6816a(n0, Bundle.CREATOR);
        n0.recycle();
        return bundle;
    }

    /* renamed from: k */
    public final C2635a mo9735k() {
        Parcel n0 = mo12210n0(21, mo12207D());
        C2635a n02 = C2635a.C2636a.m21356n0(n0.readStrongBinder());
        n0.recycle();
        return n02;
    }

    /* renamed from: l */
    public final String mo9736l() {
        Parcel n0 = mo12210n0(9, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: m */
    public final String mo9737m() {
        Parcel n0 = mo12210n0(6, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: n */
    public final String mo9738n() {
        Parcel n0 = mo12210n0(2, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: o */
    public final String mo9739o() {
        Parcel n0 = mo12210n0(4, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: p3 */
    public final void mo9740p3(C2635a aVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        mo12206C0(16, D);
    }

    /* renamed from: q */
    public final void mo9741q() {
        mo12206C0(10, mo12207D());
    }

    /* renamed from: r */
    public final String mo9742r() {
        Parcel n0 = mo12210n0(8, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: u5 */
    public final C2635a mo9743u5() {
        Parcel n0 = mo12210n0(18, mo12207D());
        C2635a n02 = C2635a.C2636a.m21356n0(n0.readStrongBinder());
        n0.recycle();
        return n02;
    }

    /* renamed from: y5 */
    public final C2635a mo9744y5() {
        Parcel n0 = mo12210n0(20, mo12207D());
        C2635a n02 = C2635a.C2636a.m21356n0(n0.readStrongBinder());
        n0.recycle();
        return n02;
    }

    /* renamed from: z5 */
    public final List mo9745z5() {
        Parcel n0 = mo12210n0(3, mo12207D());
        ArrayList b = C1551be.m6817b(n0);
        n0.recycle();
        return b;
    }
}
