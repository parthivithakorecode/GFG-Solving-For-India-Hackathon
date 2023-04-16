package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ec */
final class C1661ec implements Runnable {

    /* renamed from: f */
    final /* synthetic */ int f6164f;

    /* renamed from: g */
    final /* synthetic */ C1735gc f6165g;

    C1661ec(C1735gc gcVar, int i, boolean z) {
        this.f6165g = gcVar;
        this.f6164f = i;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000c */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.gc r0 = r4.f6165g
            int r1 = r4.f6164f
            if (r1 <= 0) goto L_0x000c
            int r1 = r1 * 1000
            long r1 = (long) r1
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x000c }
        L_0x000c:
            android.content.Context r1 = r0.f7353a     // Catch:{ all -> 0x002e }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ all -> 0x002e }
            android.content.Context r2 = r0.f7353a     // Catch:{ all -> 0x002e }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ all -> 0x002e }
            r3 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch:{ all -> 0x002e }
            android.content.Context r0 = r0.f7353a     // Catch:{ all -> 0x002e }
            java.lang.String r2 = r0.getPackageName()     // Catch:{ all -> 0x002e }
            int r1 = r1.versionCode     // Catch:{ all -> 0x002e }
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.ads.a9 r0 = com.google.android.gms.internal.ads.c13.m7185a(r0, r2, r1)     // Catch:{ all -> 0x002e }
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            com.google.android.gms.internal.ads.gc r1 = r4.f6165g
            r1.f7362j = r0
            int r1 = r4.f6164f
            r2 = 4
            if (r1 >= r2) goto L_0x0076
            if (r0 != 0) goto L_0x003c
            goto L_0x006d
        L_0x003c:
            boolean r1 = r0.mo5183k0()
            if (r1 == 0) goto L_0x006d
            java.lang.String r1 = r0.mo5188y0()
            java.lang.String r2 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x006d
            boolean r1 = r0.mo5184l0()
            if (r1 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.j9 r1 = r0.mo5186w0()
            boolean r1 = r1.mo8423I()
            if (r1 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.j9 r0 = r0.mo5186w0()
            long r0 = r0.mo8422F()
            r2 = -2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x006d
            goto L_0x0076
        L_0x006d:
            com.google.android.gms.internal.ads.gc r0 = r4.f6165g
            int r1 = r4.f6164f
            r2 = 1
            int r1 = r1 + r2
            r0.mo7577o(r1, r2)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1661ec.run():void");
    }
}
