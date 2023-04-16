package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mx */
public abstract class C1978mx extends C1514ae implements C2015nx {
    public C1978mx() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: com.google.android.gms.internal.ads.yx} */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2, types: [com.google.android.gms.internal.ads.zw] */
    /* JADX WARNING: type inference failed for: r5v7, types: [com.google.android.gms.internal.ads.ux] */
    /* JADX WARNING: type inference failed for: r5v12, types: [com.google.android.gms.internal.ads.ww] */
    /* JADX WARNING: type inference failed for: r5v22, types: [com.google.android.gms.internal.ads.rx] */
    /* JADX WARNING: type inference failed for: r5v27, types: [com.google.android.gms.internal.ads.wy] */
    /* JADX WARNING: type inference failed for: r5v32, types: [com.google.android.gms.internal.ads.dx] */
    /* JADX WARNING: type inference failed for: r5v37, types: [com.google.android.gms.internal.ads.by] */
    /* JADX WARNING: type inference failed for: r5v42 */
    /* JADX WARNING: type inference failed for: r5v43 */
    /* JADX WARNING: type inference failed for: r5v44 */
    /* JADX WARNING: type inference failed for: r5v45 */
    /* JADX WARNING: type inference failed for: r5v46 */
    /* JADX WARNING: type inference failed for: r5v47 */
    /* JADX WARNING: type inference failed for: r5v48 */
    /* JADX WARNING: type inference failed for: r5v49 */
    /* JADX WARNING: type inference failed for: r5v50 */
    /* JADX WARNING: type inference failed for: r5v51 */
    /* JADX WARNING: type inference failed for: r5v52 */
    /* JADX WARNING: type inference failed for: r5v53 */
    /* JADX WARNING: type inference failed for: r5v54 */
    /* JADX WARNING: type inference failed for: r5v55 */
    /* JADX WARNING: type inference failed for: r5v56 */
    /* JADX WARNING: type inference failed for: r5v57 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x017a, code lost:
        r4.writeNoException();
        r4.writeString(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b1, code lost:
        r4.writeNoException();
        com.google.android.gms.internal.ads.C1551be.m6820e(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0217, code lost:
        r4.writeNoException();
        com.google.android.gms.internal.ads.C1551be.m6818c(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0221, code lost:
        r4.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0229, code lost:
        r4.writeNoException();
        com.google.android.gms.internal.ads.C1551be.m6821f(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: y5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5080y5(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
        /*
            r1 = this;
            r5 = 0
            switch(r2) {
                case 1: goto L_0x0225;
                case 2: goto L_0x021e;
                case 3: goto L_0x0213;
                case 4: goto L_0x0206;
                case 5: goto L_0x0202;
                case 6: goto L_0x01fe;
                case 7: goto L_0x01e0;
                case 8: goto L_0x01c2;
                case 9: goto L_0x01be;
                case 10: goto L_0x0221;
                case 11: goto L_0x01b9;
                case 12: goto L_0x01ad;
                case 13: goto L_0x01a0;
                case 14: goto L_0x0193;
                case 15: goto L_0x0182;
                case 16: goto L_0x0004;
                case 17: goto L_0x0004;
                case 18: goto L_0x0176;
                case 19: goto L_0x0169;
                case 20: goto L_0x014a;
                case 21: goto L_0x012b;
                case 22: goto L_0x0122;
                case 23: goto L_0x011c;
                case 24: goto L_0x010f;
                case 25: goto L_0x0106;
                case 26: goto L_0x0100;
                case 27: goto L_0x0004;
                case 28: goto L_0x0004;
                case 29: goto L_0x00f3;
                case 30: goto L_0x00e6;
                case 31: goto L_0x00e0;
                case 32: goto L_0x00da;
                case 33: goto L_0x00d4;
                case 34: goto L_0x00cb;
                case 35: goto L_0x00c5;
                case 36: goto L_0x00a6;
                case 37: goto L_0x00a0;
                case 38: goto L_0x0097;
                case 39: goto L_0x008a;
                case 40: goto L_0x007d;
                case 41: goto L_0x0077;
                case 42: goto L_0x0058;
                case 43: goto L_0x0032;
                case 44: goto L_0x0025;
                case 45: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r2 = 0
            return r2
        L_0x0006:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x000d
            goto L_0x0020
        L_0x000d:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IFullScreenContentCallback"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C1571by
            if (r5 == 0) goto L_0x001b
            r5 = r3
            com.google.android.gms.internal.ads.by r5 = (com.google.android.gms.internal.ads.C1571by) r5
            goto L_0x0020
        L_0x001b:
            com.google.android.gms.internal.ads.zx r5 = new com.google.android.gms.internal.ads.zx
            r5.<init>(r2)
        L_0x0020:
            r1.mo7471d2(r5)
            goto L_0x0221
        L_0x0025:
            android.os.IBinder r2 = r3.readStrongBinder()
            g2.a r2 = p048g2.C2635a.C2636a.m21356n0(r2)
            r1.mo7460R0(r2)
            goto L_0x0221
        L_0x0032:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.kv> r2 = com.google.android.gms.internal.ads.C1902kv.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C1551be.m6816a(r3, r2)
            com.google.android.gms.internal.ads.kv r2 = (com.google.android.gms.internal.ads.C1902kv) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x0041
            goto L_0x0053
        L_0x0041:
            java.lang.String r5 = "com.google.android.gms.ads.internal.client.IAdLoadCallback"
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.C1644dx
            if (r0 == 0) goto L_0x004e
            com.google.android.gms.internal.ads.dx r5 = (com.google.android.gms.internal.ads.C1644dx) r5
            goto L_0x0053
        L_0x004e:
            com.google.android.gms.internal.ads.ax r5 = new com.google.android.gms.internal.ads.ax
            r5.<init>(r3)
        L_0x0053:
            r1.mo7468Y1(r2, r5)
            goto L_0x0221
        L_0x0058:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x005f
            goto L_0x0072
        L_0x005f:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IOnPaidEventListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C2350wy
            if (r5 == 0) goto L_0x006d
            r5 = r3
            com.google.android.gms.internal.ads.wy r5 = (com.google.android.gms.internal.ads.C2350wy) r5
            goto L_0x0072
        L_0x006d:
            com.google.android.gms.internal.ads.uy r5 = new com.google.android.gms.internal.ads.uy
            r5.<init>(r2)
        L_0x0072:
            r1.mo7452E4(r5)
            goto L_0x0221
        L_0x0077:
            com.google.android.gms.internal.ads.zy r2 = r1.mo7476j()
            goto L_0x0229
        L_0x007d:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.wp r2 = com.google.android.gms.internal.ads.C2303vp.m18616z5(r2)
            r1.mo7451C4(r2)
            goto L_0x0221
        L_0x008a:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.vv> r2 = com.google.android.gms.internal.ads.C2309vv.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C1551be.m6816a(r3, r2)
            com.google.android.gms.internal.ads.vv r2 = (com.google.android.gms.internal.ads.C2309vv) r2
            r1.mo7470b4(r2)
            goto L_0x0221
        L_0x0097:
            java.lang.String r2 = r3.readString()
            r1.mo7469b1(r2)
            goto L_0x0221
        L_0x00a0:
            android.os.Bundle r2 = r1.mo7473g()
            goto L_0x01b1
        L_0x00a6:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x00ad
            goto L_0x00c0
        L_0x00ad:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdMetadataListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C2163rx
            if (r5 == 0) goto L_0x00bb
            r5 = r3
            com.google.android.gms.internal.ads.rx r5 = (com.google.android.gms.internal.ads.C2163rx) r5
            goto L_0x00c0
        L_0x00bb:
            com.google.android.gms.internal.ads.px r5 = new com.google.android.gms.internal.ads.px
            r5.<init>(r2)
        L_0x00c0:
            r1.mo7458M4(r5)
            goto L_0x0221
        L_0x00c5:
            java.lang.String r2 = r1.mo7486q()
            goto L_0x017a
        L_0x00cb:
            boolean r2 = com.google.android.gms.internal.ads.C1551be.m6822g(r3)
            r1.mo7479k3(r2)
            goto L_0x0221
        L_0x00d4:
            com.google.android.gms.internal.ads.zw r2 = r1.mo7474h()
            goto L_0x0229
        L_0x00da:
            com.google.android.gms.internal.ads.ux r2 = r1.mo7475i()
            goto L_0x0229
        L_0x00e0:
            java.lang.String r2 = r1.mo7488t()
            goto L_0x017a
        L_0x00e6:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.hz> r2 = com.google.android.gms.internal.ads.C1795hz.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C1551be.m6816a(r3, r2)
            com.google.android.gms.internal.ads.hz r2 = (com.google.android.gms.internal.ads.C1795hz) r2
            r1.mo7462S3(r2)
            goto L_0x0221
        L_0x00f3:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.s00> r2 = com.google.android.gms.internal.ads.s00.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C1551be.m6816a(r3, r2)
            com.google.android.gms.internal.ads.s00 r2 = (com.google.android.gms.internal.ads.s00) r2
            r1.mo7483n5(r2)
            goto L_0x0221
        L_0x0100:
            com.google.android.gms.internal.ads.cz r2 = r1.mo7477k()
            goto L_0x0229
        L_0x0106:
            java.lang.String r2 = r3.readString()
            r1.mo7455I3(r2)
            goto L_0x0221
        L_0x010f:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.sj0 r2 = com.google.android.gms.internal.ads.rj0.m16197z5(r2)
            r1.mo7478k2(r2)
            goto L_0x0221
        L_0x011c:
            boolean r2 = r1.mo7465U3()
            goto L_0x0217
        L_0x0122:
            boolean r2 = com.google.android.gms.internal.ads.C1551be.m6822g(r3)
            r1.mo7481m5(r2)
            goto L_0x0221
        L_0x012b:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x0132
            goto L_0x0145
        L_0x0132:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C2423yx
            if (r5 == 0) goto L_0x0140
            r5 = r3
            com.google.android.gms.internal.ads.yx r5 = (com.google.android.gms.internal.ads.C2423yx) r5
            goto L_0x0145
        L_0x0140:
            com.google.android.gms.internal.ads.yx r5 = new com.google.android.gms.internal.ads.yx
            r5.<init>(r2)
        L_0x0145:
            r1.mo7466W3(r5)
            goto L_0x0221
        L_0x014a:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x0151
            goto L_0x0164
        L_0x0151:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdClickListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C2348ww
            if (r5 == 0) goto L_0x015f
            r5 = r3
            com.google.android.gms.internal.ads.ww r5 = (com.google.android.gms.internal.ads.C2348ww) r5
            goto L_0x0164
        L_0x015f:
            com.google.android.gms.internal.ads.uw r5 = new com.google.android.gms.internal.ads.uw
            r5.<init>(r2)
        L_0x0164:
            r1.mo7464U0(r5)
            goto L_0x0221
        L_0x0169:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.i20 r2 = com.google.android.gms.internal.ads.h20.m10217z5(r2)
            r1.mo7459Q3(r2)
            goto L_0x0221
        L_0x0176:
            java.lang.String r2 = r1.mo7485p()
        L_0x017a:
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x022f
        L_0x0182:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.mh0 r2 = com.google.android.gms.internal.ads.lh0.m12748z5(r2)
            java.lang.String r3 = r3.readString()
            r1.mo7489y1(r2, r3)
            goto L_0x0221
        L_0x0193:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.jh0 r2 = com.google.android.gms.internal.ads.ih0.m11031z5(r2)
            r1.mo7456K4(r2)
            goto L_0x0221
        L_0x01a0:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.pv> r2 = com.google.android.gms.internal.ads.C2087pv.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C1551be.m6816a(r3, r2)
            com.google.android.gms.internal.ads.pv r2 = (com.google.android.gms.internal.ads.C2087pv) r2
            r1.mo7487s3(r2)
            goto L_0x0221
        L_0x01ad:
            com.google.android.gms.internal.ads.pv r2 = r1.mo7472e()
        L_0x01b1:
            r4.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6820e(r4, r2)
            goto L_0x022f
        L_0x01b9:
            r1.mo7453F()
            goto L_0x0221
        L_0x01be:
            r1.mo7484o0()
            goto L_0x0221
        L_0x01c2:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x01c9
            goto L_0x01dc
        L_0x01c9:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C2274ux
            if (r5 == 0) goto L_0x01d7
            r5 = r3
            com.google.android.gms.internal.ads.ux r5 = (com.google.android.gms.internal.ads.C2274ux) r5
            goto L_0x01dc
        L_0x01d7:
            com.google.android.gms.internal.ads.sx r5 = new com.google.android.gms.internal.ads.sx
            r5.<init>(r2)
        L_0x01dc:
            r1.mo7482n3(r5)
            goto L_0x0221
        L_0x01e0:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x01e7
            goto L_0x01fa
        L_0x01e7:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.C2459zw
            if (r5 == 0) goto L_0x01f5
            r5 = r3
            com.google.android.gms.internal.ads.zw r5 = (com.google.android.gms.internal.ads.C2459zw) r5
            goto L_0x01fa
        L_0x01f5:
            com.google.android.gms.internal.ads.xw r5 = new com.google.android.gms.internal.ads.xw
            r5.<init>(r2)
        L_0x01fa:
            r1.mo7461S2(r5)
            goto L_0x0221
        L_0x01fe:
            r1.mo7454G()
            goto L_0x0221
        L_0x0202:
            r1.mo7463U()
            goto L_0x0221
        L_0x0206:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.kv> r2 = com.google.android.gms.internal.ads.C1902kv.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C1551be.m6816a(r3, r2)
            com.google.android.gms.internal.ads.kv r2 = (com.google.android.gms.internal.ads.C1902kv) r2
            boolean r2 = r1.mo7467X3(r2)
            goto L_0x0217
        L_0x0213:
            boolean r2 = r1.mo7450A0()
        L_0x0217:
            r4.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6818c(r4, r2)
            goto L_0x022f
        L_0x021e:
            r1.mo7457M()
        L_0x0221:
            r4.writeNoException()
            goto L_0x022f
        L_0x0225:
            g2.a r2 = r1.mo7480m()
        L_0x0229:
            r4.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6821f(r4, r2)
        L_0x022f:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1978mx.mo5080y5(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
