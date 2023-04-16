package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p048g2.C2635a;

public final class xg0 extends C2440zd implements zg0 {
    xg0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    /* renamed from: K */
    public final void mo11829K(Bundle bundle) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, bundle);
        Parcel n0 = mo12210n0(6, D);
        if (n0.readInt() != 0) {
            bundle.readFromParcel(n0);
        }
        n0.recycle();
    }

    /* renamed from: L */
    public final boolean mo11830L() {
        Parcel n0 = mo12210n0(11, mo12207D());
        boolean g = C1551be.m6822g(n0);
        n0.recycle();
        return g;
    }

    /* renamed from: V */
    public final void mo11831V(C2635a aVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        mo12206C0(13, D);
    }

    /* renamed from: f */
    public final void mo11832f() {
        mo12206C0(10, mo12207D());
    }

    /* renamed from: k */
    public final void mo11833k() {
        mo12206C0(8, mo12207D());
    }

    /* renamed from: l */
    public final void mo11834l() {
        mo12206C0(4, mo12207D());
    }

    /* renamed from: m */
    public final void mo11835m() {
        mo12206C0(5, mo12207D());
    }

    /* renamed from: n */
    public final void mo11836n() {
        mo12206C0(2, mo12207D());
    }

    /* renamed from: p */
    public final void mo11837p() {
        mo12206C0(7, mo12207D());
    }

    /* renamed from: q */
    public final void mo11838q() {
        mo12206C0(14, mo12207D());
    }

    /* renamed from: r2 */
    public final void mo11839r2(Bundle bundle) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, bundle);
        mo12206C0(1, D);
    }

    /* renamed from: t */
    public final void mo11840t() {
        mo12206C0(3, mo12207D());
    }

    /* renamed from: u4 */
    public final void mo11841u4(int i, int i2, Intent intent) {
        Parcel D = mo12207D();
        D.writeInt(i);
        D.writeInt(i2);
        C1551be.m6819d(D, intent);
        mo12206C0(12, D);
    }

    /* renamed from: x */
    public final void mo11842x() {
        mo12206C0(9, mo12207D());
    }
}
