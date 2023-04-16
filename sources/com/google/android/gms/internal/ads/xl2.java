package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;

final class xl2 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ bp2 f17243a;

    /* synthetic */ xl2(bp2 bp2, wk2 wk2) {
        this.f17243a = bp2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r10, android.content.Intent r11) {
        /*
            r9 = this;
            java.lang.String r11 = "connectivity"
            java.lang.Object r11 = r10.getSystemService(r11)
            android.net.ConnectivityManager r11 = (android.net.ConnectivityManager) r11
            r0 = 2
            r1 = 9
            r2 = 6
            r3 = 4
            r4 = 29
            r5 = 1
            r6 = 0
            r7 = 5
            if (r11 != 0) goto L_0x0016
        L_0x0014:
            r0 = r6
            goto L_0x004e
        L_0x0016:
            android.net.NetworkInfo r11 = r11.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x0014 }
            if (r11 == 0) goto L_0x004d
            boolean r8 = r11.isConnected()
            if (r8 != 0) goto L_0x0023
            goto L_0x004d
        L_0x0023:
            int r8 = r11.getType()
            if (r8 == 0) goto L_0x003a
            if (r8 == r5) goto L_0x004e
            if (r8 == r3) goto L_0x003a
            if (r8 == r7) goto L_0x003a
            if (r8 == r2) goto L_0x0038
            if (r8 == r1) goto L_0x0036
            r0 = 8
            goto L_0x004e
        L_0x0036:
            r0 = 7
            goto L_0x004e
        L_0x0038:
            r0 = r7
            goto L_0x004e
        L_0x003a:
            int r11 = r11.getSubtype()
            switch(r11) {
                case 1: goto L_0x004b;
                case 2: goto L_0x004b;
                case 3: goto L_0x0049;
                case 4: goto L_0x0049;
                case 5: goto L_0x0049;
                case 6: goto L_0x0049;
                case 7: goto L_0x0049;
                case 8: goto L_0x0049;
                case 9: goto L_0x0049;
                case 10: goto L_0x0049;
                case 11: goto L_0x0049;
                case 12: goto L_0x0049;
                case 13: goto L_0x0038;
                case 14: goto L_0x0049;
                case 15: goto L_0x0049;
                case 16: goto L_0x0041;
                case 17: goto L_0x0049;
                case 18: goto L_0x004e;
                case 19: goto L_0x0041;
                case 20: goto L_0x0043;
                default: goto L_0x0041;
            }
        L_0x0041:
            r0 = r2
            goto L_0x004e
        L_0x0043:
            int r11 = com.google.android.gms.internal.ads.n13.f11236a
            if (r11 < r4) goto L_0x0014
            r0 = r1
            goto L_0x004e
        L_0x0049:
            r0 = r3
            goto L_0x004e
        L_0x004b:
            r0 = 3
            goto L_0x004e
        L_0x004d:
            r0 = r5
        L_0x004e:
            int r11 = com.google.android.gms.internal.ads.n13.f11236a
            if (r11 < r4) goto L_0x007b
            com.google.android.gms.internal.ads.vj2.m18583a()
            if (r0 != r7) goto L_0x007b
            java.lang.String r0 = "phone"
            java.lang.Object r10 = r10.getSystemService(r0)     // Catch:{ RuntimeException -> 0x007c }
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch:{ RuntimeException -> 0x007c }
            java.util.Objects.requireNonNull(r10)
            com.google.android.gms.internal.ads.ao2 r0 = new com.google.android.gms.internal.ads.ao2     // Catch:{ RuntimeException -> 0x007c }
            com.google.android.gms.internal.ads.bp2 r1 = r9.f17243a     // Catch:{ RuntimeException -> 0x007c }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{ RuntimeException -> 0x007c }
            r1 = 31
            if (r11 >= r1) goto L_0x0072
            r10.listen(r0, r5)     // Catch:{ RuntimeException -> 0x007c }
            goto L_0x0077
        L_0x0072:
            r11 = 1048576(0x100000, float:1.469368E-39)
            r10.listen(r0, r11)     // Catch:{ RuntimeException -> 0x007c }
        L_0x0077:
            r10.listen(r0, r6)     // Catch:{ RuntimeException -> 0x007c }
            return
        L_0x007b:
            r7 = r0
        L_0x007c:
            com.google.android.gms.internal.ads.bp2 r10 = r9.f17243a
            com.google.android.gms.internal.ads.bp2.m7018c(r10, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xl2.onReceive(android.content.Context, android.content.Intent):void");
    }
}
