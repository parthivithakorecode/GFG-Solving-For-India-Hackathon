package com.google.android.gms.internal.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.vz */
public final class C2313vz extends ContentProvider {
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void attachInfo(android.content.Context r7, android.content.pm.ProviderInfo r8) {
        /*
            r6 = this;
            r0 = 0
            f2.b r1 = p041f2.C2606c.m21299a(r7)     // Catch:{ NullPointerException -> 0x0016, NameNotFoundException -> 0x0012 }
            java.lang.String r2 = r7.getPackageName()     // Catch:{ NullPointerException -> 0x0016, NameNotFoundException -> 0x0012 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r1.mo12493c(r2, r3)     // Catch:{ NullPointerException -> 0x0016, NameNotFoundException -> 0x0012 }
            android.os.Bundle r0 = r1.metaData     // Catch:{ NullPointerException -> 0x0016, NameNotFoundException -> 0x0012 }
            goto L_0x001c
        L_0x0012:
            r1 = move-exception
            java.lang.String r2 = "Failed to load metadata: Package name not found."
            goto L_0x0019
        L_0x0016:
            r1 = move-exception
            java.lang.String r2 = "Failed to load metadata: Null pointer exception."
        L_0x0019:
            com.google.android.gms.internal.ads.io0.m11129e(r2, r1)
        L_0x001c:
            com.google.android.gms.internal.ads.wc0 r1 = com.google.android.gms.internal.ads.wc0.m18958a()
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "Metadata was null."
            com.google.android.gms.internal.ads.io0.m11128d(r0)
            goto L_0x00ac
        L_0x0029:
            java.lang.String r2 = "com.google.android.gms.ads.APPLICATION_ID"
            java.lang.Object r2 = r0.get(r2)     // Catch:{ ClassCastException -> 0x00d3 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ ClassCastException -> 0x00d3 }
            java.lang.String r3 = "com.google.android.gms.ads.AD_MANAGER_APP"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ ClassCastException -> 0x00ca }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ ClassCastException -> 0x00ca }
            java.lang.String r4 = "com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT"
            java.lang.Object r4 = r0.get(r4)     // Catch:{ ClassCastException -> 0x00c1 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ ClassCastException -> 0x00c1 }
            java.lang.String r5 = "com.google.android.gms.ads.INTEGRATION_MANAGER"
            java.lang.Object r0 = r0.get(r5)     // Catch:{ ClassCastException -> 0x00b8 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassCastException -> 0x00b8 }
            if (r2 == 0) goto L_0x0085
            java.lang.String r5 = "^/\\d+~.+$"
            boolean r5 = r2.matches(r5)
            if (r5 != 0) goto L_0x0085
            java.lang.String r0 = "^ca-app-pub-[0-9]{16}~[0-9]{10}$"
            boolean r0 = r2.matches(r0)
            if (r0 == 0) goto L_0x007d
            java.lang.String r0 = "Publisher provided Google AdMob App ID in manifest: "
            int r3 = r2.length()
            if (r3 == 0) goto L_0x0068
            java.lang.String r0 = r0.concat(r2)
            goto L_0x006e
        L_0x0068:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
            r0 = r3
        L_0x006e:
            com.google.android.gms.internal.ads.io0.m11126b(r0)
            if (r4 == 0) goto L_0x0079
            boolean r0 = r4.booleanValue()
            if (r0 != 0) goto L_0x00ac
        L_0x0079:
            r1.mo11639b(r7, r2)
            goto L_0x00ac
        L_0x007d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "\n\n******************************************************************************\n* Invalid application ID. Follow instructions here:                          *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to find your app ID.                                                       *\n******************************************************************************\n\n"
            r7.<init>(r8)
            throw r7
        L_0x0085:
            if (r3 == 0) goto L_0x008d
            boolean r1 = r3.booleanValue()
            if (r1 != 0) goto L_0x00ac
        L_0x008d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x00b0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "The Google Mobile Ads SDK is integrated by "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x00a4
            java.lang.String r0 = r1.concat(r0)
            goto L_0x00a9
        L_0x00a4:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x00a9:
            com.google.android.gms.internal.ads.io0.m11126b(r0)
        L_0x00ac:
            super.attachInfo(r7, r8)
            return
        L_0x00b0:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "\n\n******************************************************************************\n* The Google Mobile Ads SDK was initialized incorrectly. AdMob publishers    *\n* should follow the instructions here:                                       *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to add a valid App ID inside the AndroidManifest.                          *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n"
            r7.<init>(r8)
            throw r7
        L_0x00b8:
            r7 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "The com.google.android.gms.ads.INTEGRATION_MANAGER metadata must have a String value."
            r8.<init>(r0, r7)
            throw r8
        L_0x00c1:
            r7 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "The com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT metadata must have a boolean value."
            r8.<init>(r0, r7)
            throw r8
        L_0x00ca:
            r7 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "The com.google.android.gms.ads.AD_MANAGER_APP metadata must have a boolean value."
            r8.<init>(r0, r7)
            throw r8
        L_0x00d3:
            r7 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value."
            r8.<init>(r0, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2313vz.attachInfo(android.content.Context, android.content.pm.ProviderInfo):void");
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        return false;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
