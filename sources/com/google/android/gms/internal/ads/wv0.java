package com.google.android.gms.internal.ads;

public abstract class wv0 extends C1514ae implements xv0 {
    public wv0() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
        r4.writeNoException();
        r4.writeString(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0106, code lost:
        r4.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return true;
     */
    /* renamed from: y5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5080y5(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
        /*
            r1 = this;
            switch(r2) {
                case 1: goto L_0x00fb;
                case 2: goto L_0x00e8;
                case 3: goto L_0x00d4;
                case 4: goto L_0x00c0;
                case 5: goto L_0x00a9;
                case 6: goto L_0x009a;
                case 7: goto L_0x008e;
                case 8: goto L_0x0079;
                case 9: goto L_0x0065;
                case 10: goto L_0x0059;
                case 11: goto L_0x0054;
                case 12: goto L_0x0048;
                case 13: goto L_0x003f;
                case 14: goto L_0x0036;
                case 15: goto L_0x0021;
                case 16: goto L_0x001c;
                case 17: goto L_0x0017;
                case 18: goto L_0x0012;
                case 19: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r2 = 0
            return r2
        L_0x0005:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C1551be.m6816a(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.mo10777p0(r2)
            goto L_0x0106
        L_0x0012:
            java.lang.String r2 = r1.mo10766b()
            goto L_0x005d
        L_0x0017:
            java.lang.String r2 = r1.mo10770e()
            goto L_0x005d
        L_0x001c:
            java.lang.String r2 = r1.mo10772f()
            goto L_0x005d
        L_0x0021:
            android.os.IBinder r2 = r3.readStrongBinder()
            g2.a r2 = p048g2.C2635a.C2636a.m21356n0(r2)
            java.lang.String r5 = r3.readString()
            java.lang.String r3 = r3.readString()
            r1.mo10764V4(r2, r5, r3)
            goto L_0x0106
        L_0x0036:
            java.lang.String r2 = r3.readString()
            r1.mo10769d4(r2)
            goto L_0x0106
        L_0x003f:
            java.lang.String r2 = r3.readString()
            r1.mo10774i0(r2)
            goto L_0x0106
        L_0x0048:
            long r2 = r1.mo10767c()
            r4.writeNoException()
            r4.writeLong(r2)
            goto L_0x0109
        L_0x0054:
            java.lang.String r2 = r1.mo10773h()
            goto L_0x005d
        L_0x0059:
            java.lang.String r2 = r1.mo10768d()
        L_0x005d:
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x0109
        L_0x0065:
            java.lang.String r2 = r3.readString()
            java.lang.String r3 = r3.readString()
            java.util.List r2 = r1.mo10779x1(r2, r3)
            r4.writeNoException()
            r4.writeList(r2)
            goto L_0x0109
        L_0x0079:
            java.lang.String r2 = r3.readString()
            java.lang.String r5 = r3.readString()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.C1551be.m6816a(r3, r0)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r1.mo10761H4(r2, r5, r3)
            goto L_0x0106
        L_0x008e:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C1551be.m6816a(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.mo10762K(r2)
            goto L_0x0106
        L_0x009a:
            java.lang.String r2 = r3.readString()
            int r2 = r1.mo10778s(r2)
            r4.writeNoException()
            r4.writeInt(r2)
            goto L_0x0109
        L_0x00a9:
            java.lang.String r2 = r3.readString()
            java.lang.String r5 = r3.readString()
            boolean r3 = com.google.android.gms.internal.ads.C1551be.m6822g(r3)
            java.util.Map r2 = r1.mo10765Z3(r2, r5, r3)
            r4.writeNoException()
            r4.writeMap(r2)
            goto L_0x0109
        L_0x00c0:
            java.lang.String r2 = r3.readString()
            java.lang.String r5 = r3.readString()
            android.os.IBinder r3 = r3.readStrongBinder()
            g2.a r3 = p048g2.C2635a.C2636a.m21356n0(r3)
            r1.mo10771e4(r2, r5, r3)
            goto L_0x0106
        L_0x00d4:
            java.lang.String r2 = r3.readString()
            java.lang.String r5 = r3.readString()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.C1551be.m6816a(r3, r0)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r1.mo10775j2(r2, r5, r3)
            goto L_0x0106
        L_0x00e8:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C1551be.m6816a(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            android.os.Bundle r2 = r1.mo10776m4(r2)
            r4.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6820e(r4, r2)
            goto L_0x0109
        L_0x00fb:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C1551be.m6816a(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.mo10763S(r2)
        L_0x0106:
            r4.writeNoException()
        L_0x0109:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wv0.mo5080y5(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
