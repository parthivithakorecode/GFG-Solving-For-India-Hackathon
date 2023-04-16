package com.google.android.gms.internal.ads;

public abstract class fd0 extends C1514ae implements gd0 {
    public fd0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r12v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r12v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r14v8, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v6, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r12v11, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x015f, code lost:
        r13.writeNoException();
        com.google.android.gms.internal.ads.C1551be.m6820e(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0288, code lost:
        r13.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02c1, code lost:
        r13.writeNoException();
        com.google.android.gms.internal.ads.C1551be.m6821f(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* renamed from: y5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5080y5(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) {
        /*
            r10 = this;
            r14 = 0
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener"
            r1 = 0
            switch(r11) {
                case 1: goto L_0x02c8;
                case 2: goto L_0x02bd;
                case 3: goto L_0x028d;
                case 4: goto L_0x0285;
                case 5: goto L_0x0281;
                case 6: goto L_0x0240;
                case 7: goto L_0x0208;
                case 8: goto L_0x0203;
                case 9: goto L_0x01fe;
                case 10: goto L_0x01d7;
                case 11: goto L_0x01c6;
                case 12: goto L_0x01c1;
                case 13: goto L_0x01b5;
                case 14: goto L_0x016f;
                case 15: goto L_0x0167;
                case 16: goto L_0x0167;
                case 17: goto L_0x015b;
                case 18: goto L_0x0156;
                case 19: goto L_0x0151;
                case 20: goto L_0x013c;
                case 21: goto L_0x012f;
                case 22: goto L_0x0127;
                case 23: goto L_0x010e;
                case 24: goto L_0x0108;
                case 25: goto L_0x00ff;
                case 26: goto L_0x00f9;
                case 27: goto L_0x00f3;
                case 28: goto L_0x00c2;
                case 29: goto L_0x0007;
                case 30: goto L_0x00b5;
                case 31: goto L_0x009a;
                case 32: goto L_0x0069;
                case 33: goto L_0x0063;
                case 34: goto L_0x005d;
                case 35: goto L_0x001b;
                case 36: goto L_0x0015;
                case 37: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return r14
        L_0x0008:
            android.os.IBinder r11 = r12.readStrongBinder()
            g2.a r11 = p048g2.C2635a.C2636a.m21356n0(r11)
            r10.mo6150c3(r11)
            goto L_0x0288
        L_0x0015:
            com.google.android.gms.internal.ads.md0 r11 = r10.mo6157i()
            goto L_0x02c1
        L_0x001b:
            android.os.IBinder r11 = r12.readStrongBinder()
            g2.a r3 = p048g2.C2635a.C2636a.m21356n0(r11)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.pv> r11 = com.google.android.gms.internal.ads.C2087pv.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C1551be.m6816a(r12, r11)
            r4 = r11
            com.google.android.gms.internal.ads.pv r4 = (com.google.android.gms.internal.ads.C2087pv) r4
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.kv> r11 = com.google.android.gms.internal.ads.C1902kv.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C1551be.m6816a(r12, r11)
            r5 = r11
            com.google.android.gms.internal.ads.kv r5 = (com.google.android.gms.internal.ads.C1902kv) r5
            java.lang.String r6 = r12.readString()
            java.lang.String r7 = r12.readString()
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 != 0) goto L_0x0045
        L_0x0043:
            r8 = r1
            goto L_0x0057
        L_0x0045:
            android.os.IInterface r12 = r11.queryLocalInterface(r0)
            boolean r14 = r12 instanceof com.google.android.gms.internal.ads.jd0
            if (r14 == 0) goto L_0x0051
            r1 = r12
            com.google.android.gms.internal.ads.jd0 r1 = (com.google.android.gms.internal.ads.jd0) r1
            goto L_0x0043
        L_0x0051:
            com.google.android.gms.internal.ads.hd0 r1 = new com.google.android.gms.internal.ads.hd0
            r1.<init>(r11)
            goto L_0x0043
        L_0x0057:
            r2 = r10
            r2.mo6154f1(r3, r4, r5, r6, r7, r8)
            goto L_0x0288
        L_0x005d:
            com.google.android.gms.internal.ads.qf0 r11 = r10.mo6165o()
            goto L_0x015f
        L_0x0063:
            com.google.android.gms.internal.ads.qf0 r11 = r10.mo6161k()
            goto L_0x015f
        L_0x0069:
            android.os.IBinder r11 = r12.readStrongBinder()
            g2.a r11 = p048g2.C2635a.C2636a.m21356n0(r11)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.kv> r14 = com.google.android.gms.internal.ads.C1902kv.CREATOR
            android.os.Parcelable r14 = com.google.android.gms.internal.ads.C1551be.m6816a(r12, r14)
            com.google.android.gms.internal.ads.kv r14 = (com.google.android.gms.internal.ads.C1902kv) r14
            java.lang.String r2 = r12.readString()
            android.os.IBinder r12 = r12.readStrongBinder()
            if (r12 != 0) goto L_0x0084
            goto L_0x0095
        L_0x0084:
            android.os.IInterface r0 = r12.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.jd0
            if (r1 == 0) goto L_0x0090
            r1 = r0
            com.google.android.gms.internal.ads.jd0 r1 = (com.google.android.gms.internal.ads.jd0) r1
            goto L_0x0095
        L_0x0090:
            com.google.android.gms.internal.ads.hd0 r1 = new com.google.android.gms.internal.ads.hd0
            r1.<init>(r12)
        L_0x0095:
            r10.mo6168v1(r11, r14, r2, r1)
            goto L_0x0288
        L_0x009a:
            android.os.IBinder r11 = r12.readStrongBinder()
            g2.a r11 = p048g2.C2635a.C2636a.m21356n0(r11)
            android.os.IBinder r14 = r12.readStrongBinder()
            com.google.android.gms.internal.ads.j90 r14 = com.google.android.gms.internal.ads.i90.m10967z5(r14)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.p90> r0 = com.google.android.gms.internal.ads.p90.CREATOR
            java.util.ArrayList r12 = r12.createTypedArrayList(r0)
            r10.mo6139K0(r11, r14, r12)
            goto L_0x0288
        L_0x00b5:
            android.os.IBinder r11 = r12.readStrongBinder()
            g2.a r11 = p048g2.C2635a.C2636a.m21356n0(r11)
            r10.mo6162k4(r11)
            goto L_0x0288
        L_0x00c2:
            android.os.IBinder r11 = r12.readStrongBinder()
            g2.a r11 = p048g2.C2635a.C2636a.m21356n0(r11)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.kv> r14 = com.google.android.gms.internal.ads.C1902kv.CREATOR
            android.os.Parcelable r14 = com.google.android.gms.internal.ads.C1551be.m6816a(r12, r14)
            com.google.android.gms.internal.ads.kv r14 = (com.google.android.gms.internal.ads.C1902kv) r14
            java.lang.String r2 = r12.readString()
            android.os.IBinder r12 = r12.readStrongBinder()
            if (r12 != 0) goto L_0x00dd
            goto L_0x00ee
        L_0x00dd:
            android.os.IInterface r0 = r12.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.jd0
            if (r1 == 0) goto L_0x00e9
            r1 = r0
            com.google.android.gms.internal.ads.jd0 r1 = (com.google.android.gms.internal.ads.jd0) r1
            goto L_0x00ee
        L_0x00e9:
            com.google.android.gms.internal.ads.hd0 r1 = new com.google.android.gms.internal.ads.hd0
            r1.<init>(r12)
        L_0x00ee:
            r10.mo6144S0(r11, r14, r2, r1)
            goto L_0x0288
        L_0x00f3:
            com.google.android.gms.internal.ads.sd0 r11 = r10.mo6159j()
            goto L_0x02c1
        L_0x00f9:
            com.google.android.gms.internal.ads.cz r11 = r10.mo6153f()
            goto L_0x02c1
        L_0x00ff:
            boolean r11 = com.google.android.gms.internal.ads.C1551be.m6822g(r12)
            r10.mo6160j1(r11)
            goto L_0x0288
        L_0x0108:
            com.google.android.gms.internal.ads.e50 r11 = r10.mo6156h()
            goto L_0x02c1
        L_0x010e:
            android.os.IBinder r11 = r12.readStrongBinder()
            g2.a r11 = p048g2.C2635a.C2636a.m21356n0(r11)
            android.os.IBinder r14 = r12.readStrongBinder()
            com.google.android.gms.internal.ads.xj0 r14 = com.google.android.gms.internal.ads.wj0.m19000z5(r14)
            java.util.ArrayList r12 = r12.createStringArrayList()
            r10.mo6137I4(r11, r14, r12)
            goto L_0x0288
        L_0x0127:
            r13.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6818c(r13, r14)
            goto L_0x0305
        L_0x012f:
            android.os.IBinder r11 = r12.readStrongBinder()
            g2.a r11 = p048g2.C2635a.C2636a.m21356n0(r11)
            r10.mo6158i2(r11)
            goto L_0x0288
        L_0x013c:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.kv> r11 = com.google.android.gms.internal.ads.C1902kv.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C1551be.m6816a(r12, r11)
            com.google.android.gms.internal.ads.kv r11 = (com.google.android.gms.internal.ads.C1902kv) r11
            java.lang.String r14 = r12.readString()
            java.lang.String r12 = r12.readString()
            r10.mo6133A2(r11, r14, r12)
            goto L_0x0288
        L_0x0151:
            android.os.Bundle r11 = r10.mo6152e()
            goto L_0x015f
        L_0x0156:
            android.os.Bundle r11 = r10.mo6151d()
            goto L_0x015f
        L_0x015b:
            android.os.Bundle r11 = r10.mo6149b()
        L_0x015f:
            r13.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6820e(r13, r11)
            goto L_0x0305
        L_0x0167:
            r13.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6821f(r13, r1)
            goto L_0x0305
        L_0x016f:
            android.os.IBinder r11 = r12.readStrongBinder()
            g2.a r3 = p048g2.C2635a.C2636a.m21356n0(r11)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.kv> r11 = com.google.android.gms.internal.ads.C1902kv.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C1551be.m6816a(r12, r11)
            r4 = r11
            com.google.android.gms.internal.ads.kv r4 = (com.google.android.gms.internal.ads.C1902kv) r4
            java.lang.String r5 = r12.readString()
            java.lang.String r6 = r12.readString()
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 != 0) goto L_0x0190
        L_0x018e:
            r7 = r1
            goto L_0x01a2
        L_0x0190:
            android.os.IInterface r14 = r11.queryLocalInterface(r0)
            boolean r0 = r14 instanceof com.google.android.gms.internal.ads.jd0
            if (r0 == 0) goto L_0x019c
            r1 = r14
            com.google.android.gms.internal.ads.jd0 r1 = (com.google.android.gms.internal.ads.jd0) r1
            goto L_0x018e
        L_0x019c:
            com.google.android.gms.internal.ads.hd0 r1 = new com.google.android.gms.internal.ads.hd0
            r1.<init>(r11)
            goto L_0x018e
        L_0x01a2:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.b40> r11 = com.google.android.gms.internal.ads.b40.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C1551be.m6816a(r12, r11)
            r8 = r11
            com.google.android.gms.internal.ads.b40 r8 = (com.google.android.gms.internal.ads.b40) r8
            java.util.ArrayList r9 = r12.createStringArrayList()
            r2 = r10
            r2.mo6143Q2(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0288
        L_0x01b5:
            boolean r11 = r10.mo6138J()
            r13.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6818c(r13, r11)
            goto L_0x0305
        L_0x01c1:
            r10.mo6167v()
            goto L_0x0288
        L_0x01c6:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.kv> r11 = com.google.android.gms.internal.ads.C1902kv.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C1551be.m6816a(r12, r11)
            com.google.android.gms.internal.ads.kv r11 = (com.google.android.gms.internal.ads.C1902kv) r11
            java.lang.String r12 = r12.readString()
            r10.mo6146X1(r11, r12)
            goto L_0x0288
        L_0x01d7:
            android.os.IBinder r11 = r12.readStrongBinder()
            g2.a r1 = p048g2.C2635a.C2636a.m21356n0(r11)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.kv> r11 = com.google.android.gms.internal.ads.C1902kv.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C1551be.m6816a(r12, r11)
            r2 = r11
            com.google.android.gms.internal.ads.kv r2 = (com.google.android.gms.internal.ads.C1902kv) r2
            java.lang.String r3 = r12.readString()
            android.os.IBinder r11 = r12.readStrongBinder()
            com.google.android.gms.internal.ads.xj0 r4 = com.google.android.gms.internal.ads.wj0.m19000z5(r11)
            java.lang.String r5 = r12.readString()
            r0 = r10
            r0.mo6166t3(r1, r2, r3, r4, r5)
            goto L_0x0288
        L_0x01fe:
            r10.mo6140L()
            goto L_0x0288
        L_0x0203:
            r10.mo6147Z()
            goto L_0x0288
        L_0x0208:
            android.os.IBinder r11 = r12.readStrongBinder()
            g2.a r3 = p048g2.C2635a.C2636a.m21356n0(r11)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.kv> r11 = com.google.android.gms.internal.ads.C1902kv.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C1551be.m6816a(r12, r11)
            r4 = r11
            com.google.android.gms.internal.ads.kv r4 = (com.google.android.gms.internal.ads.C1902kv) r4
            java.lang.String r5 = r12.readString()
            java.lang.String r6 = r12.readString()
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 != 0) goto L_0x0229
        L_0x0227:
            r7 = r1
            goto L_0x023b
        L_0x0229:
            android.os.IInterface r12 = r11.queryLocalInterface(r0)
            boolean r14 = r12 instanceof com.google.android.gms.internal.ads.jd0
            if (r14 == 0) goto L_0x0235
            r1 = r12
            com.google.android.gms.internal.ads.jd0 r1 = (com.google.android.gms.internal.ads.jd0) r1
            goto L_0x0227
        L_0x0235:
            com.google.android.gms.internal.ads.hd0 r1 = new com.google.android.gms.internal.ads.hd0
            r1.<init>(r11)
            goto L_0x0227
        L_0x023b:
            r2 = r10
            r2.mo6134E3(r3, r4, r5, r6, r7)
            goto L_0x0288
        L_0x0240:
            android.os.IBinder r11 = r12.readStrongBinder()
            g2.a r3 = p048g2.C2635a.C2636a.m21356n0(r11)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.pv> r11 = com.google.android.gms.internal.ads.C2087pv.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C1551be.m6816a(r12, r11)
            r4 = r11
            com.google.android.gms.internal.ads.pv r4 = (com.google.android.gms.internal.ads.C2087pv) r4
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.kv> r11 = com.google.android.gms.internal.ads.C1902kv.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C1551be.m6816a(r12, r11)
            r5 = r11
            com.google.android.gms.internal.ads.kv r5 = (com.google.android.gms.internal.ads.C1902kv) r5
            java.lang.String r6 = r12.readString()
            java.lang.String r7 = r12.readString()
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 != 0) goto L_0x026a
        L_0x0268:
            r8 = r1
            goto L_0x027c
        L_0x026a:
            android.os.IInterface r12 = r11.queryLocalInterface(r0)
            boolean r14 = r12 instanceof com.google.android.gms.internal.ads.jd0
            if (r14 == 0) goto L_0x0276
            r1 = r12
            com.google.android.gms.internal.ads.jd0 r1 = (com.google.android.gms.internal.ads.jd0) r1
            goto L_0x0268
        L_0x0276:
            com.google.android.gms.internal.ads.hd0 r1 = new com.google.android.gms.internal.ads.hd0
            r1.<init>(r11)
            goto L_0x0268
        L_0x027c:
            r2 = r10
            r2.mo6155g2(r3, r4, r5, r6, r7, r8)
            goto L_0x0288
        L_0x0281:
            r10.mo6164n()
            goto L_0x0288
        L_0x0285:
            r10.mo6136I()
        L_0x0288:
            r13.writeNoException()
            goto L_0x0305
        L_0x028d:
            android.os.IBinder r11 = r12.readStrongBinder()
            g2.a r11 = p048g2.C2635a.C2636a.m21356n0(r11)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.kv> r14 = com.google.android.gms.internal.ads.C1902kv.CREATOR
            android.os.Parcelable r14 = com.google.android.gms.internal.ads.C1551be.m6816a(r12, r14)
            com.google.android.gms.internal.ads.kv r14 = (com.google.android.gms.internal.ads.C1902kv) r14
            java.lang.String r2 = r12.readString()
            android.os.IBinder r12 = r12.readStrongBinder()
            if (r12 != 0) goto L_0x02a8
            goto L_0x02b9
        L_0x02a8:
            android.os.IInterface r0 = r12.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.jd0
            if (r1 == 0) goto L_0x02b4
            r1 = r0
            com.google.android.gms.internal.ads.jd0 r1 = (com.google.android.gms.internal.ads.jd0) r1
            goto L_0x02b9
        L_0x02b4:
            com.google.android.gms.internal.ads.hd0 r1 = new com.google.android.gms.internal.ads.hd0
            r1.<init>(r12)
        L_0x02b9:
            r10.mo6145W4(r11, r14, r2, r1)
            goto L_0x0288
        L_0x02bd:
            g2.a r11 = r10.mo6163m()
        L_0x02c1:
            r13.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6821f(r13, r11)
            goto L_0x0305
        L_0x02c8:
            android.os.IBinder r11 = r12.readStrongBinder()
            g2.a r3 = p048g2.C2635a.C2636a.m21356n0(r11)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.pv> r11 = com.google.android.gms.internal.ads.C2087pv.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C1551be.m6816a(r12, r11)
            r4 = r11
            com.google.android.gms.internal.ads.pv r4 = (com.google.android.gms.internal.ads.C2087pv) r4
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.kv> r11 = com.google.android.gms.internal.ads.C1902kv.CREATOR
            android.os.Parcelable r11 = com.google.android.gms.internal.ads.C1551be.m6816a(r12, r11)
            r5 = r11
            com.google.android.gms.internal.ads.kv r5 = (com.google.android.gms.internal.ads.C1902kv) r5
            java.lang.String r6 = r12.readString()
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 != 0) goto L_0x02ee
        L_0x02ec:
            r7 = r1
            goto L_0x0300
        L_0x02ee:
            android.os.IInterface r12 = r11.queryLocalInterface(r0)
            boolean r14 = r12 instanceof com.google.android.gms.internal.ads.jd0
            if (r14 == 0) goto L_0x02fa
            r1 = r12
            com.google.android.gms.internal.ads.jd0 r1 = (com.google.android.gms.internal.ads.jd0) r1
            goto L_0x02ec
        L_0x02fa:
            com.google.android.gms.internal.ads.hd0 r1 = new com.google.android.gms.internal.ads.hd0
            r1.<init>(r11)
            goto L_0x02ec
        L_0x0300:
            r2 = r10
            r2.mo6142O3(r3, r4, r5, r6, r7)
            goto L_0x0288
        L_0x0305:
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fd0.mo5080y5(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
