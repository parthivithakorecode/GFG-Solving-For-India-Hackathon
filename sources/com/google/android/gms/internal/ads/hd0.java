package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class hd0 extends C2440zd implements jd0 {
    hd0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: A */
    public final void mo7304A(int i) {
        Parcel D = mo12207D();
        D.writeInt(i);
        mo12206C0(3, D);
    }

    /* renamed from: B */
    public final void mo7263B() {
        mo12206C0(13, mo12207D());
    }

    /* renamed from: B0 */
    public final void mo7305B0(C1605cv cvVar) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, cvVar);
        mo12206C0(24, D);
    }

    /* renamed from: G1 */
    public final void mo7306G1(int i, String str) {
        Parcel D = mo12207D();
        D.writeInt(i);
        D.writeString(str);
        mo12206C0(22, D);
    }

    /* renamed from: L2 */
    public final void mo7307L2(String str, String str2) {
        Parcel D = mo12207D();
        D.writeString(str);
        D.writeString(str2);
        mo12206C0(9, D);
    }

    /* renamed from: M */
    public final void mo7308M() {
        mo12206C0(20, mo12207D());
    }

    /* renamed from: O2 */
    public final void mo7264O2(ck0 ck0) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, ck0);
        mo12206C0(16, D);
    }

    /* renamed from: T3 */
    public final void mo7265T3(yj0 yj0) {
        throw null;
    }

    /* renamed from: W */
    public final void mo7309W() {
        mo12206C0(15, mo12207D());
    }

    /* renamed from: b */
    public final void mo7310b() {
        mo12206C0(1, mo12207D());
    }

    /* renamed from: d */
    public final void mo7311d() {
        mo12206C0(2, mo12207D());
    }

    /* renamed from: i0 */
    public final void mo7312i0(String str) {
        Parcel D = mo12207D();
        D.writeString(str);
        mo12206C0(21, D);
    }

    /* renamed from: l */
    public final void mo7313l() {
        mo12206C0(5, mo12207D());
    }

    /* renamed from: l2 */
    public final void mo7314l2(e50 e50, String str) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, e50);
        D.writeString(str);
        mo12206C0(10, D);
    }

    /* renamed from: m */
    public final void mo7315m() {
        mo12206C0(4, mo12207D());
    }

    /* renamed from: n */
    public final void mo7316n() {
        mo12206C0(6, mo12207D());
    }

    /* renamed from: o */
    public final void mo5198o() {
        mo12206C0(8, mo12207D());
    }

    /* renamed from: p2 */
    public final void mo7317p2(int i) {
        throw null;
    }

    /* renamed from: x */
    public final void mo7266x() {
        mo12206C0(11, mo12207D());
    }

    /* renamed from: x3 */
    public final void mo7318x3(C1605cv cvVar) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, cvVar);
        mo12206C0(23, D);
    }

    /* renamed from: y */
    public final void mo7267y() {
        mo12206C0(18, mo12207D());
    }
}
