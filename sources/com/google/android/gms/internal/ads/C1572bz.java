package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.bz */
public abstract class C1572bz extends C1514ae implements C1609cz {
    public C1572bz() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: z5 */
    public static C1609cz m7158z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof C1609cz ? (C1609cz) queryLocalInterface : new C1535az(iBinder);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        r3.writeNoException();
        r3.writeFloat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.C1551be.m6818c(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        r3.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
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
                case 1: goto L_0x0076;
                case 2: goto L_0x0072;
                case 3: goto L_0x006a;
                case 4: goto L_0x005f;
                case 5: goto L_0x0054;
                case 6: goto L_0x0049;
                case 7: goto L_0x0044;
                case 8: goto L_0x0024;
                case 9: goto L_0x001f;
                case 10: goto L_0x001a;
                case 11: goto L_0x000f;
                case 12: goto L_0x000a;
                case 13: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            r0.mo5970m()
            goto L_0x0079
        L_0x000a:
            boolean r1 = r0.mo5971n()
            goto L_0x0063
        L_0x000f:
            com.google.android.gms.internal.ads.gz r1 = r0.mo5574h()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6821f(r3, r1)
            goto L_0x007c
        L_0x001a:
            boolean r1 = r0.mo5969l()
            goto L_0x0063
        L_0x001f:
            float r1 = r0.mo5571b()
            goto L_0x004d
        L_0x0024:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x002c
            r1 = 0
            goto L_0x0040
        L_0x002c:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C1758gz
            if (r4 == 0) goto L_0x003a
            r1 = r2
            com.google.android.gms.internal.ads.gz r1 = (com.google.android.gms.internal.ads.C1758gz) r1
            goto L_0x0040
        L_0x003a:
            com.google.android.gms.internal.ads.ez r2 = new com.google.android.gms.internal.ads.ez
            r2.<init>(r1)
            r1 = r2
        L_0x0040:
            r0.mo5570Y4(r1)
            goto L_0x0079
        L_0x0044:
            float r1 = r0.mo5572d()
            goto L_0x004d
        L_0x0049:
            float r1 = r0.mo5573e()
        L_0x004d:
            r3.writeNoException()
            r3.writeFloat(r1)
            goto L_0x007c
        L_0x0054:
            int r1 = r0.mo5966f()
            r3.writeNoException()
            r3.writeInt(r1)
            goto L_0x007c
        L_0x005f:
            boolean r1 = r0.mo5972r()
        L_0x0063:
            r3.writeNoException()
            com.google.android.gms.internal.ads.C1551be.m6818c(r3, r1)
            goto L_0x007c
        L_0x006a:
            boolean r1 = com.google.android.gms.internal.ads.C1551be.m6822g(r2)
            r0.mo5965U2(r1)
            goto L_0x0079
        L_0x0072:
            r0.mo5967j()
            goto L_0x0079
        L_0x0076:
            r0.mo5968k()
        L_0x0079:
            r3.writeNoException()
        L_0x007c:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1572bz.mo5080y5(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
