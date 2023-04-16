package com.google.android.gms.internal.ads;

public final class zv3 {

    /* renamed from: a */
    private static String f18375a;

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e6, code lost:
        if (r6.contains(r10) != false) goto L_0x0073;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m20854a(android.content.Context r10) {
        /*
            java.lang.String r0 = f18375a
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "http://www.example.com"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r3 = "android.intent.action.VIEW"
            r1.<init>(r3, r2)
            r2 = 0
            android.content.pm.ResolveInfo r3 = r0.resolveActivity(r1, r2)
            r4 = 0
            if (r3 == 0) goto L_0x0023
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.packageName
            goto L_0x0024
        L_0x0023:
            r3 = r4
        L_0x0024:
            java.util.List r5 = r0.queryIntentActivities(r1, r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0031:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x005c
            java.lang.Object r7 = r5.next()
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r9 = "android.support.customtabs.action.CustomTabsService"
            r8.setAction(r9)
            android.content.pm.ActivityInfo r9 = r7.activityInfo
            java.lang.String r9 = r9.packageName
            r8.setPackage(r9)
            android.content.pm.ResolveInfo r8 = r0.resolveService(r8, r2)
            if (r8 == 0) goto L_0x0031
            android.content.pm.ActivityInfo r7 = r7.activityInfo
            java.lang.String r7 = r7.packageName
            r6.add(r7)
            goto L_0x0031
        L_0x005c:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0066
            f18375a = r4
            goto L_0x00e9
        L_0x0066:
            int r0 = r6.size()
            r4 = 1
            if (r0 != r4) goto L_0x0077
            java.lang.Object r10 = r6.get(r2)
            java.lang.String r10 = (java.lang.String) r10
        L_0x0073:
            f18375a = r10
            goto L_0x00e9
        L_0x0077:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x00c5
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch:{ RuntimeException -> 0x00b5 }
            r0 = 64
            java.util.List r10 = r10.queryIntentActivities(r1, r0)     // Catch:{ RuntimeException -> 0x00b5 }
            if (r10 == 0) goto L_0x00bc
            int r0 = r10.size()     // Catch:{ RuntimeException -> 0x00b5 }
            if (r0 != 0) goto L_0x0090
            goto L_0x00bc
        L_0x0090:
            java.util.Iterator r10 = r10.iterator()     // Catch:{ RuntimeException -> 0x00b5 }
        L_0x0094:
            boolean r0 = r10.hasNext()     // Catch:{ RuntimeException -> 0x00b5 }
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r0 = r10.next()     // Catch:{ RuntimeException -> 0x00b5 }
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch:{ RuntimeException -> 0x00b5 }
            android.content.IntentFilter r1 = r0.filter     // Catch:{ RuntimeException -> 0x00b5 }
            if (r1 == 0) goto L_0x0094
            int r2 = r1.countDataAuthorities()     // Catch:{ RuntimeException -> 0x00b5 }
            if (r2 == 0) goto L_0x0094
            int r1 = r1.countDataPaths()     // Catch:{ RuntimeException -> 0x00b5 }
            if (r1 == 0) goto L_0x0094
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch:{ RuntimeException -> 0x00b5 }
            if (r0 == 0) goto L_0x0094
            goto L_0x00c5
        L_0x00b5:
            java.lang.String r10 = "CustomTabsHelper"
            java.lang.String r0 = "Runtime exception while getting specialized handlers"
            android.util.Log.e(r10, r0)
        L_0x00bc:
            boolean r10 = r6.contains(r3)
            if (r10 == 0) goto L_0x00c5
            f18375a = r3
            goto L_0x00e9
        L_0x00c5:
            java.lang.String r10 = "com.android.chrome"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto L_0x00ce
        L_0x00cd:
            goto L_0x0073
        L_0x00ce:
            java.lang.String r10 = "com.chrome.beta"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto L_0x00d7
            goto L_0x00cd
        L_0x00d7:
            java.lang.String r10 = "com.chrome.dev"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto L_0x00e0
            goto L_0x00cd
        L_0x00e0:
            java.lang.String r10 = "com.google.android.apps.chrome"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto L_0x00e9
            goto L_0x00cd
        L_0x00e9:
            java.lang.String r10 = f18375a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zv3.m20854a(android.content.Context):java.lang.String");
    }
}
