package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p048g2.C2635a;

public final class f60 extends C2440zd implements h60 {
    f60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* renamed from: V1 */
    public final void mo5410V1(C2350wy wyVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, wyVar);
        mo12206C0(32, D);
    }

    /* renamed from: b */
    public final double mo5413b() {
        Parcel n0 = mo12210n0(8, mo12207D());
        double readDouble = n0.readDouble();
        n0.recycle();
        return readDouble;
    }

    /* renamed from: e */
    public final C2461zy mo5417e() {
        Parcel n0 = mo12210n0(31, mo12207D());
        C2461zy z5 = C2424yy.m20348z5(n0.readStrongBinder());
        n0.recycle();
        return z5;
    }

    /* renamed from: f */
    public final C1609cz mo5418f() {
        Parcel n0 = mo12210n0(11, mo12207D());
        C1609cz z5 = C1572bz.m7158z5(n0.readStrongBinder());
        n0.recycle();
        return z5;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.g40 mo5419h() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo12207D()
            r1 = 14
            android.os.Parcel r0 = r4.mo12210n0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IAttributionInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.g40
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.g40 r1 = (com.google.android.gms.internal.ads.g40) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.d40 r2 = new com.google.android.gms.internal.ads.d40
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f60.mo5419h():com.google.android.gms.internal.ads.g40");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.n40 mo5421j() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo12207D()
            r1 = 5
            android.os.Parcel r0 = r4.mo12210n0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.n40
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.n40 r1 = (com.google.android.gms.internal.ads.n40) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.l40 r2 = new com.google.android.gms.internal.ads.l40
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f60.mo5421j():com.google.android.gms.internal.ads.n40");
    }

    /* renamed from: k */
    public final C2635a mo5422k() {
        Parcel n0 = mo12210n0(19, mo12207D());
        C2635a n02 = C2635a.C2636a.m21356n0(n0.readStrongBinder());
        n0.recycle();
        return n02;
    }

    /* renamed from: l */
    public final String mo5423l() {
        Parcel n0 = mo12210n0(6, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: m */
    public final String mo5424m() {
        Parcel n0 = mo12210n0(7, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: n */
    public final String mo5425n() {
        Parcel n0 = mo12210n0(4, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: o */
    public final C2635a mo5426o() {
        Parcel n0 = mo12210n0(18, mo12207D());
        C2635a n02 = C2635a.C2636a.m21356n0(n0.readStrongBinder());
        n0.recycle();
        return n02;
    }

    /* renamed from: p */
    public final String mo5427p() {
        Parcel n0 = mo12210n0(10, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: q */
    public final String mo5429q() {
        Parcel n0 = mo12210n0(9, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: r */
    public final String mo5430r() {
        Parcel n0 = mo12210n0(2, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: x */
    public final List mo5434x() {
        Parcel n0 = mo12210n0(23, mo12207D());
        ArrayList b = C1551be.m6817b(n0);
        n0.recycle();
        return b;
    }

    /* renamed from: y */
    public final List mo5435y() {
        Parcel n0 = mo12210n0(3, mo12207D());
        ArrayList b = C1551be.m6817b(n0);
        n0.recycle();
        return b;
    }
}
