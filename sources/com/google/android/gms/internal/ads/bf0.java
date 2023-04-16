package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class bf0 extends C1514ae implements cf0 {
    public bf0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* renamed from: z5 */
    public static cf0 m6834z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof cf0 ? (cf0) queryLocalInterface : new af0(iBinder);
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [com.google.android.gms.internal.ads.qe0] */
    /* JADX WARNING: type inference failed for: r2v10, types: [com.google.android.gms.internal.ads.re0] */
    /* JADX WARNING: type inference failed for: r2v11, types: [com.google.android.gms.internal.ads.te0] */
    /* JADX WARNING: type inference failed for: r5v8, types: [com.google.android.gms.internal.ads.te0] */
    /* JADX WARNING: type inference failed for: r2v15, types: [com.google.android.gms.internal.ads.xe0] */
    /* JADX WARNING: type inference failed for: r2v16, types: [com.google.android.gms.internal.ads.ze0] */
    /* JADX WARNING: type inference failed for: r5v10, types: [com.google.android.gms.internal.ads.ze0] */
    /* JADX WARNING: type inference failed for: r2v20, types: [com.google.android.gms.internal.ads.ue0] */
    /* JADX WARNING: type inference failed for: r2v21, types: [com.google.android.gms.internal.ads.we0] */
    /* JADX WARNING: type inference failed for: r5v12, types: [com.google.android.gms.internal.ads.we0] */
    /* JADX WARNING: type inference failed for: r2v25, types: [com.google.android.gms.internal.ads.xe0] */
    /* JADX WARNING: type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.ze0] */
    /* JADX WARNING: type inference failed for: r5v14, types: [com.google.android.gms.internal.ads.ze0] */
    /* JADX WARNING: type inference failed for: r2v31, types: [com.google.android.gms.internal.ads.qe0] */
    /* JADX WARNING: type inference failed for: r2v35, types: [com.google.android.gms.internal.ads.ue0] */
    /* JADX WARNING: type inference failed for: r2v36, types: [com.google.android.gms.internal.ads.we0] */
    /* JADX WARNING: type inference failed for: r5v18, types: [com.google.android.gms.internal.ads.we0] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01b9, code lost:
        r17.writeNoException();
        com.google.android.gms.internal.ads.C1551be.m6818c(r9, r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: y5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5080y5(int r15, android.os.Parcel r16, android.os.Parcel r17, int r18) {
        /*
            r14 = this;
            r8 = r14
            r0 = r15
            r1 = r16
            r9 = r17
            r10 = 1
            r2 = 0
            if (r0 == r10) goto L_0x028a
            r3 = 2
            if (r0 == r3) goto L_0x027f
            r3 = 3
            if (r0 == r3) goto L_0x027a
            r3 = 5
            if (r0 == r3) goto L_0x026f
            r3 = 10
            if (r0 == r3) goto L_0x0263
            r3 = 11
            if (r0 == r3) goto L_0x0257
            java.lang.String r3 = "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback"
            java.lang.String r4 = "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback"
            java.lang.String r5 = "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback"
            switch(r0) {
                case 13: goto L_0x0209;
                case 14: goto L_0x01c1;
                case 15: goto L_0x01ad;
                case 16: goto L_0x0167;
                case 17: goto L_0x015a;
                case 18: goto L_0x0114;
                case 19: goto L_0x010b;
                case 20: goto L_0x00c5;
                case 21: goto L_0x0076;
                case 22: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            r0 = 0
            return r0
        L_0x0026:
            java.lang.String r4 = r16.readString()
            java.lang.String r5 = r16.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.kv> r0 = com.google.android.gms.internal.ads.C1902kv.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C1551be.m6816a(r1, r0)
            r6 = r0
            com.google.android.gms.internal.ads.kv r6 = (com.google.android.gms.internal.ads.C1902kv) r6
            android.os.IBinder r0 = r16.readStrongBinder()
            g2.a r7 = p048g2.C2635a.C2636a.m21356n0(r0)
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L_0x0047
        L_0x0045:
            r11 = r2
            goto L_0x0058
        L_0x0047:
            android.os.IInterface r2 = r0.queryLocalInterface(r3)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.we0
            if (r3 == 0) goto L_0x0052
            com.google.android.gms.internal.ads.we0 r2 = (com.google.android.gms.internal.ads.we0) r2
            goto L_0x0045
        L_0x0052:
            com.google.android.gms.internal.ads.ue0 r2 = new com.google.android.gms.internal.ads.ue0
            r2.<init>(r0)
            goto L_0x0045
        L_0x0058:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.internal.ads.jd0 r12 = com.google.android.gms.internal.ads.id0.m10996z5(r0)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.b40> r0 = com.google.android.gms.internal.ads.b40.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C1551be.m6816a(r1, r0)
            r13 = r0
            com.google.android.gms.internal.ads.b40 r13 = (com.google.android.gms.internal.ads.b40) r13
            r0 = r14
            r1 = r4
            r2 = r5
            r3 = r6
            r4 = r7
            r5 = r11
            r6 = r12
            r7 = r13
            r0.mo5265u3(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x026a
        L_0x0076:
            java.lang.String r3 = r16.readString()
            java.lang.String r4 = r16.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.kv> r0 = com.google.android.gms.internal.ads.C1902kv.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C1551be.m6816a(r1, r0)
            r6 = r0
            com.google.android.gms.internal.ads.kv r6 = (com.google.android.gms.internal.ads.C1902kv) r6
            android.os.IBinder r0 = r16.readStrongBinder()
            g2.a r7 = p048g2.C2635a.C2636a.m21356n0(r0)
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L_0x0097
        L_0x0095:
            r5 = r2
            goto L_0x00a8
        L_0x0097:
            android.os.IInterface r2 = r0.queryLocalInterface(r5)
            boolean r5 = r2 instanceof com.google.android.gms.internal.ads.qe0
            if (r5 == 0) goto L_0x00a2
            com.google.android.gms.internal.ads.qe0 r2 = (com.google.android.gms.internal.ads.qe0) r2
            goto L_0x0095
        L_0x00a2:
            com.google.android.gms.internal.ads.oe0 r2 = new com.google.android.gms.internal.ads.oe0
            r2.<init>(r0)
            goto L_0x0095
        L_0x00a8:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.internal.ads.jd0 r11 = com.google.android.gms.internal.ads.id0.m10996z5(r0)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.pv> r0 = com.google.android.gms.internal.ads.C2087pv.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C1551be.m6816a(r1, r0)
            r12 = r0
            com.google.android.gms.internal.ads.pv r12 = (com.google.android.gms.internal.ads.C2087pv) r12
            r0 = r14
            r1 = r3
            r2 = r4
            r3 = r6
            r4 = r7
            r6 = r11
            r7 = r12
            r0.mo5254J3(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x026a
        L_0x00c5:
            java.lang.String r3 = r16.readString()
            java.lang.String r5 = r16.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.kv> r0 = com.google.android.gms.internal.ads.C1902kv.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C1551be.m6816a(r1, r0)
            r6 = r0
            com.google.android.gms.internal.ads.kv r6 = (com.google.android.gms.internal.ads.C1902kv) r6
            android.os.IBinder r0 = r16.readStrongBinder()
            g2.a r7 = p048g2.C2635a.C2636a.m21356n0(r0)
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L_0x00e6
        L_0x00e4:
            r11 = r2
            goto L_0x00f7
        L_0x00e6:
            android.os.IInterface r2 = r0.queryLocalInterface(r4)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.ze0
            if (r4 == 0) goto L_0x00f1
            com.google.android.gms.internal.ads.ze0 r2 = (com.google.android.gms.internal.ads.ze0) r2
            goto L_0x00e4
        L_0x00f1:
            com.google.android.gms.internal.ads.xe0 r2 = new com.google.android.gms.internal.ads.xe0
            r2.<init>(r0)
            goto L_0x00e4
        L_0x00f7:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.internal.ads.jd0 r12 = com.google.android.gms.internal.ads.id0.m10996z5(r0)
            r0 = r14
            r1 = r3
            r2 = r5
            r3 = r6
            r4 = r7
            r5 = r11
            r6 = r12
            r0.mo5267w2(r1, r2, r3, r4, r5, r6)
            goto L_0x026a
        L_0x010b:
            java.lang.String r0 = r16.readString()
            r14.mo5259c0(r0)
            goto L_0x026a
        L_0x0114:
            java.lang.String r4 = r16.readString()
            java.lang.String r5 = r16.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.kv> r0 = com.google.android.gms.internal.ads.C1902kv.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C1551be.m6816a(r1, r0)
            r6 = r0
            com.google.android.gms.internal.ads.kv r6 = (com.google.android.gms.internal.ads.C1902kv) r6
            android.os.IBinder r0 = r16.readStrongBinder()
            g2.a r7 = p048g2.C2635a.C2636a.m21356n0(r0)
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L_0x0135
        L_0x0133:
            r11 = r2
            goto L_0x0146
        L_0x0135:
            android.os.IInterface r2 = r0.queryLocalInterface(r3)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.we0
            if (r3 == 0) goto L_0x0140
            com.google.android.gms.internal.ads.we0 r2 = (com.google.android.gms.internal.ads.we0) r2
            goto L_0x0133
        L_0x0140:
            com.google.android.gms.internal.ads.ue0 r2 = new com.google.android.gms.internal.ads.ue0
            r2.<init>(r0)
            goto L_0x0133
        L_0x0146:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.internal.ads.jd0 r12 = com.google.android.gms.internal.ads.id0.m10996z5(r0)
            r0 = r14
            r1 = r4
            r2 = r5
            r3 = r6
            r4 = r7
            r5 = r11
            r6 = r12
            r0.mo5266w1(r1, r2, r3, r4, r5, r6)
            goto L_0x026a
        L_0x015a:
            android.os.IBinder r0 = r16.readStrongBinder()
            g2.a r0 = p048g2.C2635a.C2636a.m21356n0(r0)
            boolean r0 = r14.mo5263m0(r0)
            goto L_0x01b9
        L_0x0167:
            java.lang.String r3 = r16.readString()
            java.lang.String r5 = r16.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.kv> r0 = com.google.android.gms.internal.ads.C1902kv.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C1551be.m6816a(r1, r0)
            r6 = r0
            com.google.android.gms.internal.ads.kv r6 = (com.google.android.gms.internal.ads.C1902kv) r6
            android.os.IBinder r0 = r16.readStrongBinder()
            g2.a r7 = p048g2.C2635a.C2636a.m21356n0(r0)
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L_0x0188
        L_0x0186:
            r11 = r2
            goto L_0x0199
        L_0x0188:
            android.os.IInterface r2 = r0.queryLocalInterface(r4)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.ze0
            if (r4 == 0) goto L_0x0193
            com.google.android.gms.internal.ads.ze0 r2 = (com.google.android.gms.internal.ads.ze0) r2
            goto L_0x0186
        L_0x0193:
            com.google.android.gms.internal.ads.xe0 r2 = new com.google.android.gms.internal.ads.xe0
            r2.<init>(r0)
            goto L_0x0186
        L_0x0199:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.internal.ads.jd0 r12 = com.google.android.gms.internal.ads.id0.m10996z5(r0)
            r0 = r14
            r1 = r3
            r2 = r5
            r3 = r6
            r4 = r7
            r5 = r11
            r6 = r12
            r0.mo5256N3(r1, r2, r3, r4, r5, r6)
            goto L_0x026a
        L_0x01ad:
            android.os.IBinder r0 = r16.readStrongBinder()
            g2.a r0 = p048g2.C2635a.C2636a.m21356n0(r0)
            boolean r0 = r14.mo5262h0(r0)
        L_0x01b9:
            r17.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6818c(r9, r0)
            goto L_0x02d4
        L_0x01c1:
            java.lang.String r3 = r16.readString()
            java.lang.String r4 = r16.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.kv> r0 = com.google.android.gms.internal.ads.C1902kv.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C1551be.m6816a(r1, r0)
            r5 = r0
            com.google.android.gms.internal.ads.kv r5 = (com.google.android.gms.internal.ads.C1902kv) r5
            android.os.IBinder r0 = r16.readStrongBinder()
            g2.a r6 = p048g2.C2635a.C2636a.m21356n0(r0)
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L_0x01e2
        L_0x01e0:
            r7 = r2
            goto L_0x01f5
        L_0x01e2:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback"
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r7 = r2 instanceof com.google.android.gms.internal.ads.te0
            if (r7 == 0) goto L_0x01ef
            com.google.android.gms.internal.ads.te0 r2 = (com.google.android.gms.internal.ads.te0) r2
            goto L_0x01e0
        L_0x01ef:
            com.google.android.gms.internal.ads.re0 r2 = new com.google.android.gms.internal.ads.re0
            r2.<init>(r0)
            goto L_0x01e0
        L_0x01f5:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.internal.ads.jd0 r11 = com.google.android.gms.internal.ads.id0.m10996z5(r0)
            r0 = r14
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r11
            r0.mo5255L1(r1, r2, r3, r4, r5, r6)
            goto L_0x026a
        L_0x0209:
            java.lang.String r3 = r16.readString()
            java.lang.String r4 = r16.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.kv> r0 = com.google.android.gms.internal.ads.C1902kv.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C1551be.m6816a(r1, r0)
            r6 = r0
            com.google.android.gms.internal.ads.kv r6 = (com.google.android.gms.internal.ads.C1902kv) r6
            android.os.IBinder r0 = r16.readStrongBinder()
            g2.a r7 = p048g2.C2635a.C2636a.m21356n0(r0)
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L_0x022a
        L_0x0228:
            r5 = r2
            goto L_0x023b
        L_0x022a:
            android.os.IInterface r2 = r0.queryLocalInterface(r5)
            boolean r5 = r2 instanceof com.google.android.gms.internal.ads.qe0
            if (r5 == 0) goto L_0x0235
            com.google.android.gms.internal.ads.qe0 r2 = (com.google.android.gms.internal.ads.qe0) r2
            goto L_0x0228
        L_0x0235:
            com.google.android.gms.internal.ads.oe0 r2 = new com.google.android.gms.internal.ads.oe0
            r2.<init>(r0)
            goto L_0x0228
        L_0x023b:
            android.os.IBinder r0 = r16.readStrongBinder()
            com.google.android.gms.internal.ads.jd0 r11 = com.google.android.gms.internal.ads.id0.m10996z5(r0)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.pv> r0 = com.google.android.gms.internal.ads.C2087pv.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C1551be.m6816a(r1, r0)
            r12 = r0
            com.google.android.gms.internal.ads.pv r12 = (com.google.android.gms.internal.ads.C2087pv) r12
            r0 = r14
            r1 = r3
            r2 = r4
            r3 = r6
            r4 = r7
            r6 = r11
            r7 = r12
            r0.mo5257S4(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x026a
        L_0x0257:
            r16.createStringArray()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            java.lang.Object[] r0 = r1.createTypedArray(r0)
            android.os.Bundle[] r0 = (android.os.Bundle[]) r0
            goto L_0x026a
        L_0x0263:
            android.os.IBinder r0 = r16.readStrongBinder()
            p048g2.C2635a.C2636a.m21356n0(r0)
        L_0x026a:
            r17.writeNoException()
            goto L_0x02d4
        L_0x026f:
            com.google.android.gms.internal.ads.cz r0 = r14.mo5258b()
            r17.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6821f(r9, r0)
            goto L_0x02d4
        L_0x027a:
            com.google.android.gms.internal.ads.qf0 r0 = r14.mo5261e()
            goto L_0x0283
        L_0x027f:
            com.google.android.gms.internal.ads.qf0 r0 = r14.mo5260d()
        L_0x0283:
            r17.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6820e(r9, r0)
            goto L_0x02d4
        L_0x028a:
            android.os.IBinder r0 = r16.readStrongBinder()
            g2.a r3 = p048g2.C2635a.C2636a.m21356n0(r0)
            java.lang.String r4 = r16.readString()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = com.google.android.gms.internal.ads.C1551be.m6816a(r1, r0)
            android.os.Bundle r5 = (android.os.Bundle) r5
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C1551be.m6816a(r1, r0)
            r6 = r0
            android.os.Bundle r6 = (android.os.Bundle) r6
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.pv> r0 = com.google.android.gms.internal.ads.C2087pv.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.C1551be.m6816a(r1, r0)
            r7 = r0
            com.google.android.gms.internal.ads.pv r7 = (com.google.android.gms.internal.ads.C2087pv) r7
            android.os.IBinder r0 = r16.readStrongBinder()
            if (r0 != 0) goto L_0x02b6
            r11 = r2
            goto L_0x02c9
        L_0x02b6:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.ff0
            if (r2 == 0) goto L_0x02c3
            com.google.android.gms.internal.ads.ff0 r1 = (com.google.android.gms.internal.ads.ff0) r1
            goto L_0x02c8
        L_0x02c3:
            com.google.android.gms.internal.ads.df0 r1 = new com.google.android.gms.internal.ads.df0
            r1.<init>(r0)
        L_0x02c8:
            r11 = r1
        L_0x02c9:
            r0 = r14
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r11
            r0.mo5264r1(r1, r2, r3, r4, r5, r6)
            goto L_0x026a
        L_0x02d4:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bf0.mo5080y5(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
