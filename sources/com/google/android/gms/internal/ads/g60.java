package com.google.android.gms.internal.ads;

public abstract class g60 extends C1514ae implements h60 {
    public g60() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a7, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.C1551be.m6818c(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c3, code lost:
        r3.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f4, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.C1551be.m6821f(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0104, code lost:
        r3.writeNoException();
        r3.writeList(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010f, code lost:
        r3.writeNoException();
        r3.writeString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: y5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5080y5(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            switch(r1) {
                case 2: goto L_0x010b;
                case 3: goto L_0x0100;
                case 4: goto L_0x00fb;
                case 5: goto L_0x00f0;
                case 6: goto L_0x00eb;
                case 7: goto L_0x00e6;
                case 8: goto L_0x00db;
                case 9: goto L_0x00d6;
                case 10: goto L_0x00d1;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00c7;
                case 13: goto L_0x00c0;
                case 14: goto L_0x00bb;
                case 15: goto L_0x00af;
                case 16: goto L_0x009b;
                case 17: goto L_0x008f;
                case 18: goto L_0x008a;
                case 19: goto L_0x0084;
                case 20: goto L_0x0078;
                case 21: goto L_0x0058;
                case 22: goto L_0x0053;
                case 23: goto L_0x004d;
                case 24: goto L_0x0048;
                case 25: goto L_0x003b;
                case 26: goto L_0x002e;
                case 27: goto L_0x0029;
                case 28: goto L_0x0024;
                case 29: goto L_0x001e;
                case 30: goto L_0x0018;
                case 31: goto L_0x0012;
                case 32: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.wy r1 = com.google.android.gms.internal.ads.C2312vy.m18781z5(r1)
            r0.mo5410V1(r1)
            goto L_0x00c3
        L_0x0012:
            com.google.android.gms.internal.ads.zy r1 = r0.mo5417e()
            goto L_0x00f4
        L_0x0018:
            boolean r1 = r0.mo5407I()
            goto L_0x00a7
        L_0x001e:
            com.google.android.gms.internal.ads.k40 r1 = r0.mo5420i()
            goto L_0x00f4
        L_0x0024:
            r0.mo5406F()
            goto L_0x00c3
        L_0x0029:
            r0.mo5409R2()
            goto L_0x00c3
        L_0x002e:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.jy r1 = com.google.android.gms.internal.ads.C1831iy.m11356z5(r1)
            r0.mo5433t4(r1)
            goto L_0x00c3
        L_0x003b:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.my r1 = com.google.android.gms.internal.ads.C1942ly.m12978z5(r1)
            r0.mo5415c4(r1)
            goto L_0x00c3
        L_0x0048:
            boolean r1 = r0.mo5412Y()
            goto L_0x00a7
        L_0x004d:
            java.util.List r1 = r0.mo5434x()
            goto L_0x0104
        L_0x0053:
            r0.mo5411W()
            goto L_0x00c3
        L_0x0058:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0060
            r1 = 0
            goto L_0x0074
        L_0x0060:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.e60
            if (r4 == 0) goto L_0x006e
            r1 = r2
            com.google.android.gms.internal.ads.e60 r1 = (com.google.android.gms.internal.ads.e60) r1
            goto L_0x0074
        L_0x006e:
            com.google.android.gms.internal.ads.d60 r2 = new com.google.android.gms.internal.ads.d60
            r2.<init>(r1)
            r1 = r2
        L_0x0074:
            r0.mo5432t1(r1)
            goto L_0x00c3
        L_0x0078:
            android.os.Bundle r1 = r0.mo5416d()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6820e(r3, r1)
            goto L_0x0115
        L_0x0084:
            g2.a r1 = r0.mo5422k()
            goto L_0x00f4
        L_0x008a:
            g2.a r1 = r0.mo5426o()
            goto L_0x00f4
        L_0x008f:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C1551be.m6816a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.mo5428p4(r1)
            goto L_0x00c3
        L_0x009b:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C1551be.m6816a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            boolean r1 = r0.mo5405B2(r1)
        L_0x00a7:
            r3.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6818c(r3, r1)
            goto L_0x0115
        L_0x00af:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C1551be.m6816a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.mo5414b5(r1)
            goto L_0x00c3
        L_0x00bb:
            com.google.android.gms.internal.ads.g40 r1 = r0.mo5419h()
            goto L_0x00f4
        L_0x00c0:
            r0.mo5408M()
        L_0x00c3:
            r3.writeNoException()
            goto L_0x0115
        L_0x00c7:
            java.lang.String r1 = r0.mo5431t()
            goto L_0x010f
        L_0x00cc:
            com.google.android.gms.internal.ads.cz r1 = r0.mo5418f()
            goto L_0x00f4
        L_0x00d1:
            java.lang.String r1 = r0.mo5427p()
            goto L_0x010f
        L_0x00d6:
            java.lang.String r1 = r0.mo5429q()
            goto L_0x010f
        L_0x00db:
            double r1 = r0.mo5413b()
            r3.writeNoException()
            r3.writeDouble(r1)
            goto L_0x0115
        L_0x00e6:
            java.lang.String r1 = r0.mo5424m()
            goto L_0x010f
        L_0x00eb:
            java.lang.String r1 = r0.mo5423l()
            goto L_0x010f
        L_0x00f0:
            com.google.android.gms.internal.ads.n40 r1 = r0.mo5421j()
        L_0x00f4:
            r3.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6821f(r3, r1)
            goto L_0x0115
        L_0x00fb:
            java.lang.String r1 = r0.mo5425n()
            goto L_0x010f
        L_0x0100:
            java.util.List r1 = r0.mo5435y()
        L_0x0104:
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x0115
        L_0x010b:
            java.lang.String r1 = r0.mo5430r()
        L_0x010f:
            r3.writeNoException()
            r3.writeString(r1)
        L_0x0115:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g60.mo5080y5(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
