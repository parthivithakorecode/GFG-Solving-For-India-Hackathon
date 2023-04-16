package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class an0 extends C1514ae implements bn0 {
    public an0() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    /* renamed from: z5 */
    public static bn0 m6123z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof bn0 ? (bn0) queryLocalInterface : new zm0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0072, code lost:
        r5.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0059, code lost:
        p048g2.C2635a.C2636a.m21356n0(r4.readStrongBinder());
        r5.writeNoException();
        com.google.android.gms.internal.ads.C1551be.m6821f(r5, (android.os.IInterface) null);
     */
    /* renamed from: y5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5080y5(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) {
        /*
            r2 = this;
            r6 = 0
            switch(r3) {
                case 1: goto L_0x0076;
                case 2: goto L_0x0067;
                case 3: goto L_0x0052;
                case 4: goto L_0x0059;
                case 5: goto L_0x0038;
                case 6: goto L_0x001e;
                case 7: goto L_0x0012;
                case 8: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r3 = 0
            return r3
        L_0x0006:
            android.os.IBinder r3 = r4.readStrongBinder()
            g2.a r3 = p048g2.C2635a.C2636a.m21356n0(r3)
            r2.mo5894z0(r3)
            goto L_0x0072
        L_0x0012:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.sh0> r3 = com.google.android.gms.internal.ads.sh0.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.C1551be.m6816a(r4, r3)
            com.google.android.gms.internal.ads.sh0 r3 = (com.google.android.gms.internal.ads.sh0) r3
            r2.mo5891O1(r3)
            goto L_0x0072
        L_0x001e:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            java.util.ArrayList r3 = r4.createTypedArrayList(r3)
            android.os.IBinder r6 = r4.readStrongBinder()
            g2.a r6 = p048g2.C2635a.C2636a.m21356n0(r6)
            android.os.IBinder r4 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.ph0 r4 = com.google.android.gms.internal.ads.oh0.m14489z5(r4)
            r2.mo5889J0(r3, r6, r4)
            goto L_0x0072
        L_0x0038:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            java.util.ArrayList r3 = r4.createTypedArrayList(r3)
            android.os.IBinder r6 = r4.readStrongBinder()
            g2.a r6 = p048g2.C2635a.C2636a.m21356n0(r6)
            android.os.IBinder r4 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.ph0 r4 = com.google.android.gms.internal.ads.oh0.m14489z5(r4)
            r2.mo5893h4(r3, r6, r4)
            goto L_0x0072
        L_0x0052:
            android.os.IBinder r3 = r4.readStrongBinder()
            p048g2.C2635a.C2636a.m21356n0(r3)
        L_0x0059:
            android.os.IBinder r3 = r4.readStrongBinder()
            p048g2.C2635a.C2636a.m21356n0(r3)
            r5.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6821f(r5, r6)
            goto L_0x00a3
        L_0x0067:
            android.os.IBinder r3 = r4.readStrongBinder()
            g2.a r3 = p048g2.C2635a.C2636a.m21356n0(r3)
            r2.mo5892P(r3)
        L_0x0072:
            r5.writeNoException()
            goto L_0x00a3
        L_0x0076:
            android.os.IBinder r3 = r4.readStrongBinder()
            g2.a r3 = p048g2.C2635a.C2636a.m21356n0(r3)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.fn0> r0 = com.google.android.gms.internal.ads.fn0.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C1551be.m6816a(r4, r0)
            com.google.android.gms.internal.ads.fn0 r0 = (com.google.android.gms.internal.ads.fn0) r0
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 != 0) goto L_0x008d
            goto L_0x009f
        L_0x008d:
            java.lang.String r6 = "com.google.android.gms.ads.internal.signals.ISignalCallback"
            android.os.IInterface r6 = r4.queryLocalInterface(r6)
            boolean r1 = r6 instanceof com.google.android.gms.internal.ads.ym0
            if (r1 == 0) goto L_0x009a
            com.google.android.gms.internal.ads.ym0 r6 = (com.google.android.gms.internal.ads.ym0) r6
            goto L_0x009f
        L_0x009a:
            com.google.android.gms.internal.ads.wm0 r6 = new com.google.android.gms.internal.ads.wm0
            r6.<init>(r4)
        L_0x009f:
            r2.mo5890K1(r3, r0, r6)
            goto L_0x0072
        L_0x00a3:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.an0.mo5080y5(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
