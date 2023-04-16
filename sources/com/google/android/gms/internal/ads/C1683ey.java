package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ey */
public abstract class C1683ey extends C1514ae implements C1720fy {
    public C1683ey() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: y5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5080y5(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            switch(r1) {
                case 1: goto L_0x00be;
                case 2: goto L_0x00b6;
                case 3: goto L_0x00ae;
                case 4: goto L_0x00a6;
                case 5: goto L_0x0096;
                case 6: goto L_0x0086;
                case 7: goto L_0x007b;
                case 8: goto L_0x0070;
                case 9: goto L_0x0065;
                case 10: goto L_0x005d;
                case 11: goto L_0x0051;
                case 12: goto L_0x0044;
                case 13: goto L_0x0038;
                case 14: goto L_0x002b;
                case 15: goto L_0x0026;
                case 16: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x000d
            r1 = 0
            goto L_0x0021
        L_0x000d:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C2127qy
            if (r4 == 0) goto L_0x001b
            r1 = r2
            com.google.android.gms.internal.ads.qy r1 = (com.google.android.gms.internal.ads.C2127qy) r1
            goto L_0x0021
        L_0x001b:
            com.google.android.gms.internal.ads.oy r2 = new com.google.android.gms.internal.ads.oy
            r2.<init>(r1)
            r1 = r2
        L_0x0021:
            r0.mo6315C3(r1)
            goto L_0x00c1
        L_0x0026:
            r0.mo6323h()
            goto L_0x00c1
        L_0x002b:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.n00> r1 = com.google.android.gms.internal.ads.n00.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C1551be.m6816a(r2, r1)
            com.google.android.gms.internal.ads.n00 r1 = (com.google.android.gms.internal.ads.n00) r1
            r0.mo6318a1(r1)
            goto L_0x00c1
        L_0x0038:
            java.util.List r1 = r0.mo6322e()
            r3.writeNoException()
            r3.writeTypedList(r1)
            goto L_0x00c4
        L_0x0044:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.m90 r1 = com.google.android.gms.internal.ads.l90.m12629z5(r1)
            r0.mo6321d3(r1)
            goto L_0x00c1
        L_0x0051:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.dd0 r1 = com.google.android.gms.internal.ads.cd0.m7312z5(r1)
            r0.mo6317L3(r1)
            goto L_0x00c1
        L_0x005d:
            java.lang.String r1 = r2.readString()
            r0.mo7436Q(r1)
            goto L_0x00c1
        L_0x0065:
            java.lang.String r1 = r0.mo6320d()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x00c4
        L_0x0070:
            boolean r1 = r0.mo7438q()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6818c(r3, r1)
            goto L_0x00c4
        L_0x007b:
            float r1 = r0.mo7437b()
            r3.writeNoException()
            r3.writeFloat(r1)
            goto L_0x00c4
        L_0x0086:
            java.lang.String r1 = r2.readString()
            android.os.IBinder r2 = r2.readStrongBinder()
            g2.a r2 = p048g2.C2635a.C2636a.m21356n0(r2)
            r0.mo6319a4(r1, r2)
            goto L_0x00c1
        L_0x0096:
            android.os.IBinder r1 = r2.readStrongBinder()
            g2.a r1 = p048g2.C2635a.C2636a.m21356n0(r1)
            java.lang.String r2 = r2.readString()
            r0.mo6316J1(r1, r2)
            goto L_0x00c1
        L_0x00a6:
            boolean r1 = com.google.android.gms.internal.ads.C1551be.m6822g(r2)
            r0.mo6326x0(r1)
            goto L_0x00c1
        L_0x00ae:
            java.lang.String r1 = r2.readString()
            r0.mo7439v4(r1)
            goto L_0x00c1
        L_0x00b6:
            float r1 = r2.readFloat()
            r0.mo6325i4(r1)
            goto L_0x00c1
        L_0x00be:
            r0.mo6324i()
        L_0x00c1:
            r3.writeNoException()
        L_0x00c4:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1683ey.mo5080y5(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
