package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class rd0 extends C1514ae implements sd0 {
    public rd0() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* renamed from: z5 */
    public static sd0 m16152z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return queryLocalInterface instanceof sd0 ? (sd0) queryLocalInterface : new qd0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0052, code lost:
        r3.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0060, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.C1551be.m6818c(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00af, code lost:
        r3.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b2, code lost:
        com.google.android.gms.internal.ads.C1551be.m6821f(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ca, code lost:
        r3.writeNoException();
        r3.writeString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r3.writeNoException();
        r3.writeFloat(r1);
     */
    /* renamed from: y5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5080y5(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            switch(r1) {
                case 2: goto L_0x00c6;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00b6;
                case 5: goto L_0x00ab;
                case 6: goto L_0x00a6;
                case 7: goto L_0x00a1;
                case 8: goto L_0x0096;
                case 9: goto L_0x0091;
                case 10: goto L_0x008c;
                case 11: goto L_0x0087;
                case 12: goto L_0x0082;
                case 13: goto L_0x007d;
                case 14: goto L_0x0078;
                case 15: goto L_0x0073;
                case 16: goto L_0x0068;
                case 17: goto L_0x005c;
                case 18: goto L_0x0057;
                case 19: goto L_0x004f;
                case 20: goto L_0x0043;
                case 21: goto L_0x0027;
                case 22: goto L_0x001b;
                case 23: goto L_0x000f;
                case 24: goto L_0x000a;
                case 25: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            float r1 = r0.mo9211e()
            goto L_0x0013
        L_0x000a:
            float r1 = r0.mo9212f()
            goto L_0x0013
        L_0x000f:
            float r1 = r0.mo9210d()
        L_0x0013:
            r3.writeNoException()
            r3.writeFloat(r1)
            goto L_0x00d0
        L_0x001b:
            android.os.IBinder r1 = r2.readStrongBinder()
            g2.a r1 = p048g2.C2635a.C2636a.m21356n0(r1)
            r0.mo9208P1(r1)
            goto L_0x0052
        L_0x0027:
            android.os.IBinder r1 = r2.readStrongBinder()
            g2.a r1 = p048g2.C2635a.C2636a.m21356n0(r1)
            android.os.IBinder r4 = r2.readStrongBinder()
            g2.a r4 = p048g2.C2635a.C2636a.m21356n0(r4)
            android.os.IBinder r2 = r2.readStrongBinder()
            g2.a r2 = p048g2.C2635a.C2636a.m21356n0(r2)
            r0.mo9222p1(r1, r4, r2)
            goto L_0x0052
        L_0x0043:
            android.os.IBinder r1 = r2.readStrongBinder()
            g2.a r1 = p048g2.C2635a.C2636a.m21356n0(r1)
            r0.mo9223p3(r1)
            goto L_0x0052
        L_0x004f:
            r0.mo9207M()
        L_0x0052:
            r3.writeNoException()
            goto L_0x00d0
        L_0x0057:
            boolean r1 = r0.mo9205F()
            goto L_0x0060
        L_0x005c:
            boolean r1 = r0.mo9206G()
        L_0x0060:
            r3.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6818c(r3, r1)
            goto L_0x00d0
        L_0x0068:
            android.os.Bundle r1 = r0.mo9213h()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6820e(r3, r1)
            goto L_0x00d0
        L_0x0073:
            g2.a r1 = r0.mo9219n()
            goto L_0x00af
        L_0x0078:
            g2.a r1 = r0.mo9218m()
            goto L_0x00af
        L_0x007d:
            g2.a r1 = r0.mo9220o()
            goto L_0x00af
        L_0x0082:
            r3.writeNoException()
            r1 = 0
            goto L_0x00b2
        L_0x0087:
            com.google.android.gms.internal.ads.cz r1 = r0.mo9214i()
            goto L_0x00af
        L_0x008c:
            java.lang.String r1 = r0.mo9224q()
            goto L_0x00ca
        L_0x0091:
            java.lang.String r1 = r0.mo9228y()
            goto L_0x00ca
        L_0x0096:
            double r1 = r0.mo9209b()
            r3.writeNoException()
            r3.writeDouble(r1)
            goto L_0x00d0
        L_0x00a1:
            java.lang.String r1 = r0.mo9217l()
            goto L_0x00ca
        L_0x00a6:
            java.lang.String r1 = r0.mo9226t()
            goto L_0x00ca
        L_0x00ab:
            com.google.android.gms.internal.ads.n40 r1 = r0.mo9216k()
        L_0x00af:
            r3.writeNoException()
        L_0x00b2:
            com.google.android.gms.internal.ads.C1551be.m6821f(r3, r1)
            goto L_0x00d0
        L_0x00b6:
            java.lang.String r1 = r0.mo9225r()
            goto L_0x00ca
        L_0x00bb:
            java.util.List r1 = r0.mo9227x()
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x00d0
        L_0x00c6:
            java.lang.String r1 = r0.mo9221p()
        L_0x00ca:
            r3.writeNoException()
            r3.writeString(r1)
        L_0x00d0:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rd0.mo5080y5(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
