package com.google.android.gms.internal.ads;

public abstract class j40 extends C1514ae implements k40 {
    public j40() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.C1551be.m6821f(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        r3.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        r3.writeNoException();
        r3.writeFloat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
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
                case 2: goto L_0x0059;
                case 3: goto L_0x004a;
                case 4: goto L_0x003f;
                case 5: goto L_0x003a;
                case 6: goto L_0x0035;
                case 7: goto L_0x0030;
                case 8: goto L_0x0025;
                case 9: goto L_0x0005;
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
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.s50
            if (r4 == 0) goto L_0x001b
            r1 = r2
            com.google.android.gms.internal.ads.s50 r1 = (com.google.android.gms.internal.ads.s50) r1
            goto L_0x0021
        L_0x001b:
            com.google.android.gms.internal.ads.s50 r2 = new com.google.android.gms.internal.ads.s50
            r2.<init>(r1)
            r1 = r2
        L_0x0021:
            r0.mo6506C1(r1)
            goto L_0x0055
        L_0x0025:
            boolean r1 = r0.mo6513j()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6818c(r3, r1)
            goto L_0x0063
        L_0x0030:
            com.google.android.gms.internal.ads.cz r1 = r0.mo6511f()
            goto L_0x0043
        L_0x0035:
            float r1 = r0.mo6509d()
            goto L_0x005d
        L_0x003a:
            float r1 = r0.mo6510e()
            goto L_0x005d
        L_0x003f:
            g2.a r1 = r0.mo6512h()
        L_0x0043:
            r3.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6821f(r3, r1)
            goto L_0x0063
        L_0x004a:
            android.os.IBinder r1 = r2.readStrongBinder()
            g2.a r1 = p048g2.C2635a.C2636a.m21356n0(r1)
            r0.mo6507V(r1)
        L_0x0055:
            r3.writeNoException()
            goto L_0x0063
        L_0x0059:
            float r1 = r0.mo6508b()
        L_0x005d:
            r3.writeNoException()
            r3.writeFloat(r1)
        L_0x0063:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j40.mo5080y5(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
