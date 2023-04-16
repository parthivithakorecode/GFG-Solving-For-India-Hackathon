package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p048g2.C2635a;

public final class pd0 extends C2440zd {
    pd0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* renamed from: A5 */
    public final void mo10016A5(C2635a aVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        mo12206C0(9, D);
    }

    /* renamed from: B5 */
    public final void mo10017B5(C2635a aVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        mo12206C0(10, D);
    }

    /* renamed from: C5 */
    public final void mo10018C5(C2635a aVar, C2635a aVar2, C2635a aVar3) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        C1551be.m6821f(D, aVar2);
        C1551be.m6821f(D, aVar3);
        mo12206C0(22, D);
    }

    /* renamed from: D5 */
    public final void mo10019D5(C2635a aVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        mo12206C0(14, D);
    }

    /* renamed from: E5 */
    public final boolean mo10020E5() {
        Parcel n0 = mo12210n0(12, mo12207D());
        boolean g = C1551be.m6822g(n0);
        n0.recycle();
        return g;
    }

    /* renamed from: F5 */
    public final boolean mo10021F5() {
        Parcel n0 = mo12210n0(11, mo12207D());
        boolean g = C1551be.m6822g(n0);
        n0.recycle();
        return g;
    }

    /* renamed from: M3 */
    public final g40 mo10022M3() {
        Parcel n0 = mo12210n0(19, mo12207D());
        g40 z5 = e40.m8290z5(n0.readStrongBinder());
        n0.recycle();
        return z5;
    }

    /* renamed from: P4 */
    public final n40 mo10023P4() {
        Parcel n0 = mo12210n0(5, mo12207D());
        n40 z5 = m40.m13048z5(n0.readStrongBinder());
        n0.recycle();
        return z5;
    }

    /* renamed from: b */
    public final Bundle mo10024b() {
        Parcel n0 = mo12210n0(13, mo12207D());
        Bundle bundle = (Bundle) C1551be.m6816a(n0, Bundle.CREATOR);
        n0.recycle();
        return bundle;
    }

    /* renamed from: b3 */
    public final C1609cz mo10025b3() {
        Parcel n0 = mo12210n0(16, mo12207D());
        C1609cz z5 = C1572bz.m7158z5(n0.readStrongBinder());
        n0.recycle();
        return z5;
    }

    /* renamed from: h */
    public final C2635a mo10026h() {
        Parcel n0 = mo12210n0(15, mo12207D());
        C2635a n02 = C2635a.C2636a.m21356n0(n0.readStrongBinder());
        n0.recycle();
        return n02;
    }

    /* renamed from: k */
    public final String mo10027k() {
        Parcel n0 = mo12210n0(7, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: m */
    public final String mo10028m() {
        Parcel n0 = mo12210n0(6, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: n */
    public final String mo10029n() {
        Parcel n0 = mo12210n0(2, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: o */
    public final String mo10030o() {
        Parcel n0 = mo12210n0(4, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: t */
    public final void mo10031t() {
        mo12206C0(8, mo12207D());
    }

    /* renamed from: u5 */
    public final C2635a mo10032u5() {
        Parcel n0 = mo12210n0(20, mo12207D());
        C2635a n02 = C2635a.C2636a.m21356n0(n0.readStrongBinder());
        n0.recycle();
        return n02;
    }

    /* renamed from: y5 */
    public final C2635a mo10033y5() {
        Parcel n0 = mo12210n0(21, mo12207D());
        C2635a n02 = C2635a.C2636a.m21356n0(n0.readStrongBinder());
        n0.recycle();
        return n02;
    }

    /* renamed from: z5 */
    public final List mo10034z5() {
        Parcel n0 = mo12210n0(3, mo12207D());
        ArrayList b = C1551be.m6817b(n0);
        n0.recycle();
        return b;
    }
}
