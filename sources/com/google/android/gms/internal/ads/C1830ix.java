package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ix */
public abstract class C1830ix extends C1514ae implements C1867jx {
    public C1830ix() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: com.google.android.gms.internal.ads.yx} */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.zw] */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: y5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5080y5(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            r4 = 0
            switch(r1) {
                case 1: goto L_0x00d6;
                case 2: goto L_0x00b8;
                case 3: goto L_0x00a9;
                case 4: goto L_0x009d;
                case 5: goto L_0x0085;
                case 6: goto L_0x0079;
                case 7: goto L_0x005b;
                case 8: goto L_0x0047;
                case 9: goto L_0x003a;
                case 10: goto L_0x002d;
                case 11: goto L_0x0004;
                case 12: goto L_0x0004;
                case 13: goto L_0x0020;
                case 14: goto L_0x0013;
                case 15: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r1 = 0
            return r1
        L_0x0006:
            android.os.Parcelable$Creator<d1.a> r1 = p026d1.C2469a.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C1551be.m6816a(r2, r1)
            d1.a r1 = (p026d1.C2469a) r1
            r0.mo6359D3(r1)
            goto L_0x00b4
        L_0x0013:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.ba0 r1 = com.google.android.gms.internal.ads.aa0.m5975z5(r1)
            r0.mo6364T2(r1)
            goto L_0x00b4
        L_0x0020:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.r90> r1 = com.google.android.gms.internal.ads.r90.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C1551be.m6816a(r2, r1)
            com.google.android.gms.internal.ads.r90 r1 = (com.google.android.gms.internal.ads.r90) r1
            r0.mo6361Q1(r1)
            goto L_0x00b4
        L_0x002d:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.y50 r1 = com.google.android.gms.internal.ads.x50.m19333z5(r1)
            r0.mo6369j4(r1)
            goto L_0x00b4
        L_0x003a:
            android.os.Parcelable$Creator<d1.g> r1 = p026d1.C2478g.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C1551be.m6816a(r2, r1)
            d1.g r1 = (p026d1.C2478g) r1
            r0.mo6368d5(r1)
            goto L_0x00b4
        L_0x0047:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.v50 r1 = com.google.android.gms.internal.ads.u50.m17721z5(r1)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.pv> r4 = com.google.android.gms.internal.ads.C2087pv.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.C1551be.m6816a(r2, r4)
            com.google.android.gms.internal.ads.pv r2 = (com.google.android.gms.internal.ads.C2087pv) r2
            r0.mo6366Z0(r1, r2)
            goto L_0x00b4
        L_0x005b:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0062
            goto L_0x0075
        L_0x0062:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C2423yx
            if (r4 == 0) goto L_0x0070
            r4 = r2
            com.google.android.gms.internal.ads.yx r4 = (com.google.android.gms.internal.ads.C2423yx) r4
            goto L_0x0075
        L_0x0070:
            com.google.android.gms.internal.ads.yx r4 = new com.google.android.gms.internal.ads.yx
            r4.<init>(r1)
        L_0x0075:
            r0.mo6365U4(r4)
            goto L_0x00b4
        L_0x0079:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.b40> r1 = com.google.android.gms.internal.ads.b40.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C1551be.m6816a(r2, r1)
            com.google.android.gms.internal.ads.b40 r1 = (com.google.android.gms.internal.ads.b40) r1
            r0.mo6363R3(r1)
            goto L_0x00b4
        L_0x0085:
            java.lang.String r1 = r2.readString()
            android.os.IBinder r4 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.r50 r4 = com.google.android.gms.internal.ads.q50.m15475z5(r4)
            android.os.IBinder r2 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.o50 r2 = com.google.android.gms.internal.ads.n50.m13714z5(r2)
            r0.mo6360G3(r1, r4, r2)
            goto L_0x00b4
        L_0x009d:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.l50 r1 = com.google.android.gms.internal.ads.k50.m12022z5(r1)
            r0.mo6370o4(r1)
            goto L_0x00b4
        L_0x00a9:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.i50 r1 = com.google.android.gms.internal.ads.h50.m10274z5(r1)
            r0.mo6371p5(r1)
        L_0x00b4:
            r3.writeNoException()
            goto L_0x00e0
        L_0x00b8:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x00bf
            goto L_0x00d2
        L_0x00bf:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C2459zw
            if (r4 == 0) goto L_0x00cd
            r4 = r2
            com.google.android.gms.internal.ads.zw r4 = (com.google.android.gms.internal.ads.C2459zw) r4
            goto L_0x00d2
        L_0x00cd:
            com.google.android.gms.internal.ads.xw r4 = new com.google.android.gms.internal.ads.xw
            r4.<init>(r1)
        L_0x00d2:
            r0.mo6362Q4(r4)
            goto L_0x00b4
        L_0x00d6:
            com.google.android.gms.internal.ads.gx r1 = r0.mo6367b()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6821f(r3, r1)
        L_0x00e0:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1830ix.mo5080y5(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
