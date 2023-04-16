package p160x1;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.concurrent.atomic.AtomicBoolean;
import p003a2.C0092o;
import p034e2.C2555l;

/* renamed from: x1.j */
public class C4288j {
    @Deprecated

    /* renamed from: a */
    public static final int f22593a = 12451000;

    /* renamed from: b */
    static final AtomicBoolean f22594b = new AtomicBoolean();

    /* renamed from: c */
    private static final AtomicBoolean f22595c = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static int m26855a(@RecentlyNonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    /* renamed from: b */
    public static String m26856b(int i) {
        return C4280b.m26820h(i);
    }

    @RecentlyNullable
    /* renamed from: c */
    public static Context m26857c(@RecentlyNonNull Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @RecentlyNullable
    /* renamed from: d */
    public static Resources m26858d(@RecentlyNonNull Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0092  */
    @java.lang.Deprecated
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m26859e(@androidx.annotation.RecentlyNonNull android.content.Context r10, int r11) {
        /*
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.content.res.Resources r1 = r10.getResources()     // Catch:{ all -> 0x000c }
            int r2 = p160x1.C4290l.common_google_play_services_unknown_issue     // Catch:{ all -> 0x000c }
            r1.getString(r2)     // Catch:{ all -> 0x000c }
            goto L_0x0011
        L_0x000c:
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0011:
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r2 = "com.google.android.gms"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x003d
            java.util.concurrent.atomic.AtomicBoolean r1 = f22595c
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x0026
            goto L_0x003d
        L_0x0026:
            int r1 = p003a2.C0088m0.m299a(r10)
            if (r1 == 0) goto L_0x0037
            int r3 = f22593a
            if (r1 != r3) goto L_0x0031
            goto L_0x003d
        L_0x0031:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r10.<init>(r1)
            throw r10
        L_0x0037:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r10.<init>()
            throw r10
        L_0x003d:
            boolean r1 = p034e2.C2551h.m21197g(r10)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x004d
            boolean r1 = p034e2.C2551h.m21199i(r10)
            if (r1 != 0) goto L_0x004d
            r1 = r3
            goto L_0x004e
        L_0x004d:
            r1 = r4
        L_0x004e:
            if (r11 < 0) goto L_0x0052
            r5 = r3
            goto L_0x0053
        L_0x0052:
            r5 = r4
        L_0x0053:
            p003a2.C0092o.m305a(r5)
            java.lang.String r5 = r10.getPackageName()
            android.content.pm.PackageManager r6 = r10.getPackageManager()
            r7 = 9
            if (r1 == 0) goto L_0x007b
            java.lang.String r8 = "com.android.vending"
            r9 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r8 = r6.getPackageInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x006b }
            goto L_0x007c
        L_0x006b:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires the Google Play Store, but it is missing."
        L_0x0071:
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            r3 = r7
            goto L_0x0127
        L_0x007b:
            r8 = 0
        L_0x007c:
            r9 = 64
            android.content.pm.PackageInfo r9 = r6.getPackageInfo(r2, r9)     // Catch:{ NameNotFoundException -> 0x011a }
            p160x1.C4289k.m26864a(r10)
            boolean r10 = p160x1.C4289k.m26866c(r9, r3)
            if (r10 != 0) goto L_0x0092
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but their signature is invalid."
            goto L_0x0071
        L_0x0092:
            if (r1 == 0) goto L_0x00a4
            p003a2.C0092o.m313i(r8)
            boolean r10 = p160x1.C4289k.m26866c(r8, r3)
            if (r10 != 0) goto L_0x00a4
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature is invalid."
            goto L_0x0071
        L_0x00a4:
            if (r1 == 0) goto L_0x00bd
            if (r8 == 0) goto L_0x00bd
            android.content.pm.Signature[] r10 = r8.signatures
            r10 = r10[r4]
            android.content.pm.Signature[] r1 = r9.signatures
            r1 = r1[r4]
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L_0x00bd
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            goto L_0x0071
        L_0x00bd:
            int r10 = r9.versionCode
            int r10 = p034e2.C2558o.m21220a(r10)
            int r1 = p034e2.C2558o.m21220a(r11)
            if (r10 >= r1) goto L_0x00fb
            int r10 = r9.versionCode
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 82
            r2.<init>(r1)
            java.lang.String r1 = "Google Play services out of date for "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = ".  Requires "
            r2.append(r1)
            r2.append(r11)
            java.lang.String r11 = " but found "
            r2.append(r11)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            android.util.Log.w(r0, r10)
            r3 = 2
            goto L_0x0127
        L_0x00fb:
            android.content.pm.ApplicationInfo r10 = r9.applicationInfo
            if (r10 != 0) goto L_0x0113
            android.content.pm.ApplicationInfo r10 = r6.getApplicationInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x0104 }
            goto L_0x0113
        L_0x0104:
            r10 = move-exception
            java.lang.String r11 = java.lang.String.valueOf(r5)
            java.lang.String r1 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r11 = r11.concat(r1)
            android.util.Log.wtf(r0, r11, r10)
            goto L_0x0127
        L_0x0113:
            boolean r10 = r10.enabled
            if (r10 != 0) goto L_0x0119
            r3 = 3
            goto L_0x0127
        L_0x0119:
            return r4
        L_0x011a:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but they are missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L_0x0127:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p160x1.C4288j.m26859e(android.content.Context, int):int");
    }

    @Deprecated
    /* renamed from: f */
    public static boolean m26860f(@RecentlyNonNull Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m26863i(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    /* renamed from: g */
    public static boolean m26861g(@RecentlyNonNull Context context) {
        if (!C2555l.m21210d()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        C0092o.m313i(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    /* renamed from: h */
    public static boolean m26862h(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @TargetApi(21)
    /* renamed from: i */
    static boolean m26863i(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (C2555l.m21213g()) {
            try {
                for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            return equals ? applicationInfo.enabled : applicationInfo.enabled && !m26861g(context);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
