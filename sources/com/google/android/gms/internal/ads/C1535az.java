package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.az */
public final class C1535az extends C2440zd implements C1609cz {
    C1535az(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: Y4 */
    public final void mo5570Y4(C1758gz gzVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, gzVar);
        mo12206C0(8, D);
    }

    /* renamed from: b */
    public final float mo5571b() {
        throw null;
    }

    /* renamed from: d */
    public final float mo5572d() {
        throw null;
    }

    /* renamed from: e */
    public final float mo5573e() {
        throw null;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1758gz mo5574h() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo12207D()
            r1 = 11
            android.os.Parcel r0 = r4.mo12210n0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C1758gz
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.gz r1 = (com.google.android.gms.internal.ads.C1758gz) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.ez r2 = new com.google.android.gms.internal.ads.ez
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1535az.mo5574h():com.google.android.gms.internal.ads.gz");
    }
}
