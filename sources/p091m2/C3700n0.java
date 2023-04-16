package p091m2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p048g2.C2635a;

/* renamed from: m2.n0 */
public final class C3700n0 extends C3673a implements C3704p0 {
    C3700n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    /* renamed from: A3 */
    public final void mo14875A3(Bundle bundle, long j) {
        Parcel D = mo14836D();
        C3688h0.m25321c(D, bundle);
        D.writeLong(j);
        mo14838n0(44, D);
    }

    /* renamed from: C2 */
    public final void mo14876C2(C2635a aVar, long j) {
        Parcel D = mo14836D();
        C3688h0.m25322d(D, aVar);
        D.writeLong(j);
        mo14838n0(29, D);
    }

    /* renamed from: F4 */
    public final void mo14877F4(C2635a aVar, long j) {
        Parcel D = mo14836D();
        C3688h0.m25322d(D, aVar);
        D.writeLong(j);
        mo14838n0(30, D);
    }

    /* renamed from: G2 */
    public final void mo14878G2(C3708r0 r0Var) {
        Parcel D = mo14836D();
        C3688h0.m25322d(D, r0Var);
        mo14838n0(16, D);
    }

    /* renamed from: L0 */
    public final void mo14879L0(String str, String str2, C2635a aVar, boolean z, long j) {
        Parcel D = mo14836D();
        D.writeString(str);
        D.writeString(str2);
        C3688h0.m25322d(D, aVar);
        C3688h0.m25319a(D, z);
        D.writeLong(j);
        mo14838n0(4, D);
    }

    /* renamed from: M2 */
    public final void mo14880M2(C2635a aVar, C3710s0 s0Var, long j) {
        Parcel D = mo14836D();
        C3688h0.m25322d(D, aVar);
        C3688h0.m25321c(D, s0Var);
        D.writeLong(j);
        mo14838n0(1, D);
    }

    /* renamed from: N4 */
    public final void mo14881N4(C2635a aVar, long j) {
        Parcel D = mo14836D();
        C3688h0.m25322d(D, aVar);
        D.writeLong(j);
        mo14838n0(28, D);
    }

    /* renamed from: P0 */
    public final void mo14882P0(C2635a aVar, Bundle bundle, long j) {
        Parcel D = mo14836D();
        C3688h0.m25322d(D, aVar);
        C3688h0.m25321c(D, bundle);
        D.writeLong(j);
        mo14838n0(27, D);
    }

    /* renamed from: Q0 */
    public final void mo14883Q0(Bundle bundle, long j) {
        Parcel D = mo14836D();
        C3688h0.m25321c(D, bundle);
        D.writeLong(j);
        mo14838n0(8, D);
    }

    /* renamed from: R1 */
    public final void mo14884R1(C2635a aVar, C3708r0 r0Var, long j) {
        Parcel D = mo14836D();
        C3688h0.m25322d(D, aVar);
        C3688h0.m25322d(D, r0Var);
        D.writeLong(j);
        mo14838n0(31, D);
    }

    /* renamed from: U1 */
    public final void mo14885U1(String str, String str2, Bundle bundle) {
        Parcel D = mo14836D();
        D.writeString(str);
        D.writeString(str2);
        C3688h0.m25321c(D, bundle);
        mo14838n0(9, D);
    }

    /* renamed from: W0 */
    public final void mo14886W0(String str, long j) {
        Parcel D = mo14836D();
        D.writeString(str);
        D.writeLong(j);
        mo14838n0(23, D);
    }

    /* renamed from: X0 */
    public final void mo14887X0(C3708r0 r0Var) {
        Parcel D = mo14836D();
        C3688h0.m25322d(D, r0Var);
        mo14838n0(17, D);
    }

    /* renamed from: X2 */
    public final void mo14888X2(int i, String str, C2635a aVar, C2635a aVar2, C2635a aVar3) {
        Parcel D = mo14836D();
        D.writeInt(5);
        D.writeString(str);
        C3688h0.m25322d(D, aVar);
        C3688h0.m25322d(D, aVar2);
        C3688h0.m25322d(D, aVar3);
        mo14838n0(33, D);
    }

    /* renamed from: d1 */
    public final void mo14889d1(Bundle bundle, C3708r0 r0Var, long j) {
        Parcel D = mo14836D();
        C3688h0.m25321c(D, bundle);
        C3688h0.m25322d(D, r0Var);
        D.writeLong(j);
        mo14838n0(32, D);
    }

    /* renamed from: f3 */
    public final void mo14890f3(String str, C3708r0 r0Var) {
        Parcel D = mo14836D();
        D.writeString(str);
        C3688h0.m25322d(D, r0Var);
        mo14838n0(6, D);
    }

    /* renamed from: f4 */
    public final void mo14891f4(String str, long j) {
        Parcel D = mo14836D();
        D.writeString(str);
        D.writeLong(j);
        mo14838n0(24, D);
    }

    /* renamed from: g4 */
    public final void mo14892g4(String str, String str2, C3708r0 r0Var) {
        Parcel D = mo14836D();
        D.writeString(str);
        D.writeString(str2);
        C3688h0.m25322d(D, r0Var);
        mo14838n0(10, D);
    }

    /* renamed from: h1 */
    public final void mo14893h1(String str, String str2, boolean z, C3708r0 r0Var) {
        Parcel D = mo14836D();
        D.writeString(str);
        D.writeString(str2);
        C3688h0.m25319a(D, z);
        C3688h0.m25322d(D, r0Var);
        mo14838n0(5, D);
    }

    /* renamed from: k5 */
    public final void mo14894k5(C2635a aVar, long j) {
        Parcel D = mo14836D();
        C3688h0.m25322d(D, aVar);
        D.writeLong(j);
        mo14838n0(26, D);
    }

    /* renamed from: q2 */
    public final void mo14895q2(C3708r0 r0Var) {
        Parcel D = mo14836D();
        C3688h0.m25322d(D, r0Var);
        mo14838n0(19, D);
    }

    /* renamed from: r5 */
    public final void mo14896r5(C3708r0 r0Var) {
        Parcel D = mo14836D();
        C3688h0.m25322d(D, r0Var);
        mo14838n0(21, D);
    }

    /* renamed from: t2 */
    public final void mo14897t2(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel D = mo14836D();
        D.writeString(str);
        D.writeString(str2);
        C3688h0.m25321c(D, bundle);
        C3688h0.m25319a(D, z);
        C3688h0.m25319a(D, z2);
        D.writeLong(j);
        mo14838n0(2, D);
    }

    /* renamed from: t5 */
    public final void mo14898t5(C2635a aVar, long j) {
        Parcel D = mo14836D();
        C3688h0.m25322d(D, aVar);
        D.writeLong(j);
        mo14838n0(25, D);
    }

    /* renamed from: v3 */
    public final void mo14899v3(C2635a aVar, String str, String str2, long j) {
        Parcel D = mo14836D();
        C3688h0.m25322d(D, aVar);
        D.writeString(str);
        D.writeString(str2);
        D.writeLong(j);
        mo14838n0(15, D);
    }

    /* renamed from: y2 */
    public final void mo14900y2(C3708r0 r0Var) {
        Parcel D = mo14836D();
        C3688h0.m25322d(D, r0Var);
        mo14838n0(22, D);
    }
}
