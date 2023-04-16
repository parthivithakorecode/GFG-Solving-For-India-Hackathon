package com.google.android.gms.internal.ads;

public abstract class ik0 extends C1514ae implements jk0 {
    public ik0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: y5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5080y5(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            switch(r1) {
                case 1: goto L_0x0045;
                case 2: goto L_0x0041;
                case 3: goto L_0x0021;
                case 4: goto L_0x0019;
                case 5: goto L_0x000d;
                case 6: goto L_0x0009;
                case 7: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            r0.mo7952b()
            goto L_0x0048
        L_0x0009:
            r0.mo7953d()
            goto L_0x0048
        L_0x000d:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.cv> r1 = com.google.android.gms.internal.ads.C1605cv.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C1551be.m6816a(r2, r1)
            com.google.android.gms.internal.ads.cv r1 = (com.google.android.gms.internal.ads.C1605cv) r1
            r0.mo7955f2(r1)
            goto L_0x0048
        L_0x0019:
            int r1 = r2.readInt()
            r0.mo7951N(r1)
            goto L_0x0048
        L_0x0021:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0029
            r1 = 0
            goto L_0x003d
        L_0x0029:
            java.lang.String r2 = "com.google.android.gms.ads.internal.rewarded.client.IRewardItem"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.ck0
            if (r4 == 0) goto L_0x0037
            r1 = r2
            com.google.android.gms.internal.ads.ck0 r1 = (com.google.android.gms.internal.ads.ck0) r1
            goto L_0x003d
        L_0x0037:
            com.google.android.gms.internal.ads.ak0 r2 = new com.google.android.gms.internal.ads.ak0
            r2.<init>(r1)
            r1 = r2
        L_0x003d:
            r0.mo7956h2(r1)
            goto L_0x0048
        L_0x0041:
            r0.mo7954e()
            goto L_0x0048
        L_0x0045:
            r0.mo7957i()
        L_0x0048:
            r3.writeNoException()
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ik0.mo5080y5(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
