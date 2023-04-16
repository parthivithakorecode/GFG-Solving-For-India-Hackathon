package com.google.android.gms.internal.ads;

public abstract class oj0 extends C1514ae implements pj0 {
    public oj0() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.google.android.gms.internal.ads.nj0} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.sj0] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c1, code lost:
        r5.writeNoException();
        com.google.android.gms.internal.ads.C1551be.m6818c(r5, r3);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: y5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5080y5(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) {
        /*
            r2 = this;
            r6 = 1
            if (r3 == r6) goto L_0x00f2
            r0 = 2
            if (r3 == r0) goto L_0x00ee
            r0 = 3
            r1 = 0
            if (r3 == r0) goto L_0x00d0
            r0 = 34
            if (r3 == r0) goto L_0x00c8
            switch(r3) {
                case 5: goto L_0x00bd;
                case 6: goto L_0x00b9;
                case 7: goto L_0x00b5;
                case 8: goto L_0x00b1;
                case 9: goto L_0x00a5;
                case 10: goto L_0x0099;
                case 11: goto L_0x008d;
                case 12: goto L_0x0081;
                case 13: goto L_0x0078;
                case 14: goto L_0x006b;
                case 15: goto L_0x005f;
                case 16: goto L_0x0040;
                case 17: goto L_0x003b;
                case 18: goto L_0x002e;
                case 19: goto L_0x0025;
                case 20: goto L_0x001f;
                case 21: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            r3 = 0
            return r3
        L_0x0013:
            com.google.android.gms.internal.ads.zy r3 = r2.mo9847c()
            r5.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6821f(r5, r3)
            goto L_0x0100
        L_0x001f:
            boolean r3 = r2.mo9857q()
            goto L_0x00c1
        L_0x0025:
            java.lang.String r3 = r4.readString()
            r2.mo9841D0(r3)
            goto L_0x00fd
        L_0x002e:
            android.os.IBinder r3 = r4.readStrongBinder()
            g2.a r3 = p048g2.C2635a.C2636a.m21356n0(r3)
            r2.mo9854m0(r3)
            goto L_0x00fd
        L_0x003b:
            r4.readString()
            goto L_0x00fd
        L_0x0040:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0047
            goto L_0x005a
        L_0x0047:
            java.lang.String r4 = "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.nj0
            if (r0 == 0) goto L_0x0055
            r1 = r4
            com.google.android.gms.internal.ads.nj0 r1 = (com.google.android.gms.internal.ads.nj0) r1
            goto L_0x005a
        L_0x0055:
            com.google.android.gms.internal.ads.nj0 r1 = new com.google.android.gms.internal.ads.nj0
            r1.<init>(r3)
        L_0x005a:
            r2.mo9855o3(r1)
            goto L_0x00fd
        L_0x005f:
            android.os.Bundle r3 = r2.mo9845a()
            r5.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6820e(r5, r3)
            goto L_0x0100
        L_0x006b:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.rx r3 = com.google.android.gms.internal.ads.C2126qx.m15944z5(r3)
            r2.mo9853l5(r3)
            goto L_0x00fd
        L_0x0078:
            java.lang.String r3 = r4.readString()
            r2.mo9848c0(r3)
            goto L_0x00fd
        L_0x0081:
            java.lang.String r3 = r2.mo9850g()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x0100
        L_0x008d:
            android.os.IBinder r3 = r4.readStrongBinder()
            g2.a r3 = p048g2.C2635a.C2636a.m21356n0(r3)
            r2.mo9859r0(r3)
            goto L_0x00fd
        L_0x0099:
            android.os.IBinder r3 = r4.readStrongBinder()
            g2.a r3 = p048g2.C2635a.C2636a.m21356n0(r3)
            r2.mo9860y0(r3)
            goto L_0x00fd
        L_0x00a5:
            android.os.IBinder r3 = r4.readStrongBinder()
            g2.a r3 = p048g2.C2635a.C2636a.m21356n0(r3)
            r2.mo9843T(r3)
            goto L_0x00fd
        L_0x00b1:
            r2.mo9846b()
            goto L_0x00fd
        L_0x00b5:
            r2.mo9851i()
            goto L_0x00fd
        L_0x00b9:
            r2.mo9849f()
            goto L_0x00fd
        L_0x00bd:
            boolean r3 = r2.mo9856p()
        L_0x00c1:
            r5.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6818c(r5, r3)
            goto L_0x0100
        L_0x00c8:
            boolean r3 = com.google.android.gms.internal.ads.C1551be.m6822g(r4)
            r2.mo9842I2(r3)
            goto L_0x00fd
        L_0x00d0:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x00d7
            goto L_0x00ea
        L_0x00d7:
            java.lang.String r4 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.sj0
            if (r0 == 0) goto L_0x00e5
            r1 = r4
            com.google.android.gms.internal.ads.sj0 r1 = (com.google.android.gms.internal.ads.sj0) r1
            goto L_0x00ea
        L_0x00e5:
            com.google.android.gms.internal.ads.qj0 r1 = new com.google.android.gms.internal.ads.qj0
            r1.<init>(r3)
        L_0x00ea:
            r2.mo9852j5(r1)
            goto L_0x00fd
        L_0x00ee:
            r2.mo9858r()
            goto L_0x00fd
        L_0x00f2:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.tj0> r3 = com.google.android.gms.internal.ads.tj0.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.C1551be.m6816a(r4, r3)
            com.google.android.gms.internal.ads.tj0 r3 = (com.google.android.gms.internal.ads.tj0) r3
            r2.mo9844V3(r3)
        L_0x00fd:
            r5.writeNoException()
        L_0x0100:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oj0.mo5080y5(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
