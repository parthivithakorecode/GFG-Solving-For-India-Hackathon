package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class ek0 extends C1514ae implements fk0 {
    public ek0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    /* renamed from: z5 */
    public static fk0 m8615z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof fk0 ? (fk0) queryLocalInterface : new dk0(iBinder);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.gms.internal.ads.ok0} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.nk0] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.jk0] */
    /* JADX WARNING: type inference failed for: r0v14, types: [com.google.android.gms.internal.ads.nk0] */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: type inference failed for: r0v24 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        r4.writeNoException();
        com.google.android.gms.internal.ads.C1551be.m6821f(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b1, code lost:
        r4.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: y5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5080y5(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
        /*
            r1 = this;
            java.lang.String r5 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback"
            r0 = 0
            switch(r2) {
                case 1: goto L_0x00e9;
                case 2: goto L_0x00cb;
                case 3: goto L_0x00c0;
                case 4: goto L_0x00b5;
                case 5: goto L_0x00a6;
                case 6: goto L_0x0088;
                case 7: goto L_0x007c;
                case 8: goto L_0x0070;
                case 9: goto L_0x0064;
                case 10: goto L_0x0054;
                case 11: goto L_0x0048;
                case 12: goto L_0x0043;
                case 13: goto L_0x0036;
                case 14: goto L_0x0011;
                case 15: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r2 = 0
            return r2
        L_0x0008:
            boolean r2 = com.google.android.gms.internal.ads.C1551be.m6822g(r3)
            r1.mo6492f0(r2)
            goto L_0x00b1
        L_0x0011:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.kv> r2 = com.google.android.gms.internal.ads.C1902kv.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C1551be.m6816a(r3, r2)
            com.google.android.gms.internal.ads.kv r2 = (com.google.android.gms.internal.ads.C1902kv) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x0020
            goto L_0x0031
        L_0x0020:
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.nk0
            if (r0 == 0) goto L_0x002c
            r0 = r5
            com.google.android.gms.internal.ads.nk0 r0 = (com.google.android.gms.internal.ads.nk0) r0
            goto L_0x0031
        L_0x002c:
            com.google.android.gms.internal.ads.lk0 r0 = new com.google.android.gms.internal.ads.lk0
            r0.<init>(r3)
        L_0x0031:
            r1.mo6489Y3(r2, r0)
            goto L_0x00b1
        L_0x0036:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.wy r2 = com.google.android.gms.internal.ads.C2312vy.m18781z5(r2)
            r1.mo6490Z4(r2)
            goto L_0x00b1
        L_0x0043:
            com.google.android.gms.internal.ads.zy r2 = r1.mo6491c()
            goto L_0x004c
        L_0x0048:
            com.google.android.gms.internal.ads.ck0 r2 = r1.mo7360g()
        L_0x004c:
            r4.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6821f(r4, r2)
            goto L_0x010d
        L_0x0054:
            android.os.IBinder r2 = r3.readStrongBinder()
            g2.a r2 = p048g2.C2635a.C2636a.m21356n0(r2)
            boolean r3 = com.google.android.gms.internal.ads.C1551be.m6822g(r3)
            r1.mo7356E1(r2, r3)
            goto L_0x00b1
        L_0x0064:
            android.os.Bundle r2 = r1.mo7358a()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6820e(r4, r2)
            goto L_0x010d
        L_0x0070:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.ty r2 = com.google.android.gms.internal.ads.C2201sy.m17024z5(r2)
            r1.mo6486B3(r2)
            goto L_0x00b1
        L_0x007c:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.uk0> r2 = com.google.android.gms.internal.ads.uk0.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C1551be.m6816a(r3, r2)
            com.google.android.gms.internal.ads.uk0 r2 = (com.google.android.gms.internal.ads.uk0) r2
            r1.mo6488M1(r2)
            goto L_0x00b1
        L_0x0088:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x008f
            goto L_0x00a2
        L_0x008f:
            java.lang.String r3 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.ok0
            if (r5 == 0) goto L_0x009d
            r0 = r3
            com.google.android.gms.internal.ads.ok0 r0 = (com.google.android.gms.internal.ads.ok0) r0
            goto L_0x00a2
        L_0x009d:
            com.google.android.gms.internal.ads.ok0 r0 = new com.google.android.gms.internal.ads.ok0
            r0.<init>(r2)
        L_0x00a2:
            r1.mo7357P3(r0)
            goto L_0x00b1
        L_0x00a6:
            android.os.IBinder r2 = r3.readStrongBinder()
            g2.a r2 = p048g2.C2635a.C2636a.m21356n0(r2)
            r1.mo6485B1(r2)
        L_0x00b1:
            r4.writeNoException()
            goto L_0x010d
        L_0x00b5:
            java.lang.String r2 = r1.mo7359b()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x010d
        L_0x00c0:
            boolean r2 = r1.mo7361n()
            r4.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6818c(r4, r2)
            goto L_0x010d
        L_0x00cb:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x00d2
            goto L_0x00e5
        L_0x00d2:
            java.lang.String r3 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.jk0
            if (r5 == 0) goto L_0x00e0
            r0 = r3
            com.google.android.gms.internal.ads.jk0 r0 = (com.google.android.gms.internal.ads.jk0) r0
            goto L_0x00e5
        L_0x00e0:
            com.google.android.gms.internal.ads.hk0 r0 = new com.google.android.gms.internal.ads.hk0
            r0.<init>(r2)
        L_0x00e5:
            r1.mo6493y4(r0)
            goto L_0x00b1
        L_0x00e9:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.kv> r2 = com.google.android.gms.internal.ads.C1902kv.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C1551be.m6816a(r3, r2)
            com.google.android.gms.internal.ads.kv r2 = (com.google.android.gms.internal.ads.C1902kv) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x00f8
            goto L_0x0109
        L_0x00f8:
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.nk0
            if (r0 == 0) goto L_0x0104
            r0 = r5
            com.google.android.gms.internal.ads.nk0 r0 = (com.google.android.gms.internal.ads.nk0) r0
            goto L_0x0109
        L_0x0104:
            com.google.android.gms.internal.ads.lk0 r0 = new com.google.android.gms.internal.ads.lk0
            r0.<init>(r3)
        L_0x0109:
            r1.mo6487D2(r2, r0)
            goto L_0x00b1
        L_0x010d:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ek0.mo5080y5(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
