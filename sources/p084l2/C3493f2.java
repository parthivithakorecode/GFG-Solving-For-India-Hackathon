package p084l2;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.core.content.p008pm.C0609a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p137t2.C4061a;
import p137t2.C4068d;

/* renamed from: l2.f2 */
final class C3493f2 {

    /* renamed from: a */
    private final C3501h2 f21057a;

    /* renamed from: b */
    private final Activity f21058b;

    /* renamed from: c */
    private final C4061a f21059c;

    /* renamed from: d */
    private final C4068d f21060d;

    private C3493f2(C3501h2 h2Var, Activity activity, C4061a aVar, C4068d dVar) {
        this.f21057a = h2Var;
        this.f21058b = activity;
        this.f21059c = aVar;
        this.f21060d = dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C3532p0 m24879a() {
        List<C3552u0> list;
        List<C3564y0> list2;
        String str;
        String str2;
        String valueOf;
        String str3;
        C3552u0 u0Var;
        C3532p0 p0Var = new C3532p0();
        p0Var.f21155a = m24882d();
        C3469a a = this.f21057a.f21086b.mo14564a();
        if (a != null) {
            p0Var.f21156b = a.f21015a;
            p0Var.f21163i = Boolean.valueOf(a.f21016b);
        }
        if (!this.f21059c.mo15567b()) {
            list = Collections.emptyList();
        } else {
            list = new ArrayList<>();
            int a2 = this.f21059c.mo15566a();
            if (a2 == 1) {
                u0Var = C3552u0.GEO_OVERRIDE_EEA;
            } else if (a2 == 2) {
                u0Var = C3552u0.GEO_OVERRIDE_NON_EEA;
            }
            list.add(u0Var);
        }
        p0Var.f21168n = list;
        Application a3 = this.f21057a.f21085a;
        Set<String> e = this.f21057a.f21087c.mo14611e();
        HashMap hashMap = new HashMap();
        for (String next : e) {
            C3488e1 a4 = C3492f1.m24877a(a3, next);
            if (a4 == null) {
                str2 = "Fetching request info: failed for key: ";
                valueOf = String.valueOf(next);
                if (valueOf.length() == 0) {
                    str3 = new String(str2);
                    Log.d("UserMessagingPlatform", str3);
                }
            } else {
                Object obj = a3.getSharedPreferences(a4.f21052a, 0).getAll().get(a4.f21053b);
                if (obj == null) {
                    str2 = "Stored info not exists: ";
                    valueOf = String.valueOf(next);
                    if (valueOf.length() == 0) {
                        str3 = new String(str2);
                        Log.d("UserMessagingPlatform", str3);
                    }
                } else {
                    if (obj instanceof Boolean) {
                        str = ((Boolean) obj).booleanValue() ? "1" : "0";
                    } else if (obj instanceof Number) {
                        str = obj.toString();
                    } else if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        str2 = "Failed to fetch stored info: ";
                        valueOf = String.valueOf(next);
                        if (valueOf.length() == 0) {
                            str3 = new String(str2);
                            Log.d("UserMessagingPlatform", str3);
                        }
                    }
                    hashMap.put(next, str);
                }
            }
            str3 = str2.concat(valueOf);
            Log.d("UserMessagingPlatform", str3);
        }
        p0Var.f21164j = hashMap;
        C4068d dVar = this.f21060d;
        DisplayCutout displayCutout = null;
        p0Var.f21158d = null;
        p0Var.f21161g = null;
        p0Var.f21162h = Boolean.valueOf(dVar.mo15572b());
        p0Var.f21160f = null;
        int i = Build.VERSION.SDK_INT;
        p0Var.f21159e = i >= 21 ? Locale.getDefault().toLanguageTag() : Locale.getDefault().toString();
        C3548t0 t0Var = new C3548t0();
        t0Var.f21203c = Integer.valueOf(i);
        t0Var.f21202b = Build.MODEL;
        t0Var.f21201a = C3558w0.f21234b;
        p0Var.f21157c = t0Var;
        Configuration configuration = this.f21057a.f21085a.getResources().getConfiguration();
        this.f21057a.f21085a.getResources().getConfiguration();
        C3555v0 v0Var = new C3555v0();
        v0Var.f21229a = Integer.valueOf(configuration.screenWidthDp);
        v0Var.f21230b = Integer.valueOf(configuration.screenHeightDp);
        v0Var.f21231c = Double.valueOf((double) this.f21057a.f21085a.getResources().getDisplayMetrics().density);
        if (i >= 28) {
            Activity activity = this.f21058b;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            if (rootWindowInsets != null) {
                displayCutout = rootWindowInsets.getDisplayCutout();
            }
            if (displayCutout != null) {
                displayCutout.getSafeInsetBottom();
                list2 = new ArrayList<>();
                for (Rect next2 : displayCutout.getBoundingRects()) {
                    if (next2 != null) {
                        C3564y0 y0Var = new C3564y0();
                        y0Var.f21256b = Integer.valueOf(next2.left);
                        y0Var.f21257c = Integer.valueOf(next2.right);
                        y0Var.f21255a = Integer.valueOf(next2.top);
                        y0Var.f21258d = Integer.valueOf(next2.bottom);
                        list2.add(y0Var);
                    }
                }
                v0Var.f21232d = list2;
                p0Var.f21165k = v0Var;
                p0Var.f21166l = m24881c();
                C3561x0 x0Var = new C3561x0();
                x0Var.f21251a = "1.0.0";
                p0Var.f21167m = x0Var;
                return p0Var;
            }
        }
        list2 = Collections.emptyList();
        v0Var.f21232d = list2;
        p0Var.f21165k = v0Var;
        p0Var.f21166l = m24881c();
        C3561x0 x0Var2 = new C3561x0();
        x0Var2.f21251a = "1.0.0";
        p0Var.f21167m = x0Var2;
        return p0Var;
    }

    /* renamed from: c */
    private final C3540r0 m24881c() {
        PackageInfo packageInfo;
        Application a = this.f21057a.f21085a;
        String str = null;
        try {
            packageInfo = this.f21057a.f21085a.getPackageManager().getPackageInfo(a.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        C3540r0 r0Var = new C3540r0();
        r0Var.f21190a = a.getPackageName();
        CharSequence applicationLabel = this.f21057a.f21085a.getPackageManager().getApplicationLabel(this.f21057a.f21085a.getApplicationInfo());
        if (applicationLabel != null) {
            str = applicationLabel.toString();
        }
        r0Var.f21191b = str;
        if (packageInfo != null) {
            r0Var.f21192c = Long.toString(C0609a.m2485a(packageInfo));
        }
        return r0Var;
    }

    /* renamed from: d */
    private final String m24882d() {
        String c = this.f21060d.mo15573c();
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        Bundle bundle = null;
        try {
            bundle = this.f21057a.f21085a.getPackageManager().getApplicationInfo(this.f21057a.f21085a.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle != null) {
            c = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        }
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        throw new C3489e2(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
    }
}
