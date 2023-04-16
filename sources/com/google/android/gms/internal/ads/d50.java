package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class d50 extends C1514ae implements e50 {
    public d50() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: z5 */
    public static e50 m7721z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof e50 ? (e50) queryLocalInterface : new c50(iBinder);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        r3.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        r3.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        com.google.android.gms.internal.ads.C1551be.m6821f(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
        r3.writeNoException();
        r3.writeString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.C1551be.m6818c(r3, r1);
     */
    /* renamed from: y5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5080y5(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            switch(r1) {
                case 1: goto L_0x0073;
                case 2: goto L_0x0064;
                case 3: goto L_0x0059;
                case 4: goto L_0x0054;
                case 5: goto L_0x0049;
                case 6: goto L_0x0045;
                case 7: goto L_0x0040;
                case 8: goto L_0x003c;
                case 9: goto L_0x0037;
                case 10: goto L_0x0024;
                case 11: goto L_0x001f;
                case 12: goto L_0x001a;
                case 13: goto L_0x0015;
                case 14: goto L_0x0009;
                case 15: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            r0.mo6822k()
            goto L_0x0050
        L_0x0009:
            android.os.IBinder r1 = r2.readStrongBinder()
            g2.a r1 = p048g2.C2635a.C2636a.m21356n0(r1)
            r0.mo6826u0(r1)
            goto L_0x0050
        L_0x0015:
            boolean r1 = r0.mo6825t()
            goto L_0x0030
        L_0x001a:
            boolean r1 = r0.mo6823l()
            goto L_0x0030
        L_0x001f:
            r3.writeNoException()
            r1 = 0
            goto L_0x006f
        L_0x0024:
            android.os.IBinder r1 = r2.readStrongBinder()
            g2.a r1 = p048g2.C2635a.C2636a.m21356n0(r1)
            boolean r1 = r0.mo6057h0(r1)
        L_0x0030:
            r3.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6818c(r3, r1)
            goto L_0x0081
        L_0x0037:
            g2.a r1 = r0.mo6055e()
            goto L_0x006c
        L_0x003c:
            r0.mo6821j()
            goto L_0x0050
        L_0x0040:
            com.google.android.gms.internal.ads.cz r1 = r0.mo6818b()
            goto L_0x006c
        L_0x0045:
            r0.mo6824m()
            goto L_0x0050
        L_0x0049:
            java.lang.String r1 = r2.readString()
            r0.mo6817D0(r1)
        L_0x0050:
            r3.writeNoException()
            goto L_0x0081
        L_0x0054:
            java.lang.String r1 = r0.mo6056f()
            goto L_0x007b
        L_0x0059:
            java.util.List r1 = r0.mo6820i()
            r3.writeNoException()
            r3.writeStringList(r1)
            goto L_0x0081
        L_0x0064:
            java.lang.String r1 = r2.readString()
            com.google.android.gms.internal.ads.n40 r1 = r0.mo6827z(r1)
        L_0x006c:
            r3.writeNoException()
        L_0x006f:
            com.google.android.gms.internal.ads.C1551be.m6821f(r3, r1)
            goto L_0x0081
        L_0x0073:
            java.lang.String r1 = r2.readString()
            java.lang.String r1 = r0.mo6819f5(r1)
        L_0x007b:
            r3.writeNoException()
            r3.writeString(r1)
        L_0x0081:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d50.mo5080y5(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
