package p034e2;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.RecentlyNonNull;

/* renamed from: e2.h */
public final class C2551h {

    /* renamed from: a */
    private static Boolean f18662a;

    /* renamed from: b */
    private static Boolean f18663b;

    /* renamed from: c */
    private static Boolean f18664c;

    /* renamed from: d */
    private static Boolean f18665d;

    /* renamed from: e */
    private static Boolean f18666e;

    /* renamed from: a */
    public static boolean m21191a(@RecentlyNonNull Context context) {
        return m21192b(context.getPackageManager());
    }

    /* renamed from: b */
    public static boolean m21192b(@RecentlyNonNull PackageManager packageManager) {
        if (f18666e == null) {
            boolean z = false;
            if (C2555l.m21216j() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f18666e = Boolean.valueOf(z);
        }
        return f18666e.booleanValue();
    }

    /* renamed from: c */
    public static boolean m21193c(@RecentlyNonNull Context context) {
        if (f18664c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            f18664c = Boolean.valueOf(z);
        }
        return f18664c.booleanValue();
    }

    @TargetApi(21)
    /* renamed from: d */
    public static boolean m21194d(@RecentlyNonNull Context context) {
        return m21198h(context);
    }

    @TargetApi(20)
    /* renamed from: e */
    public static boolean m21195e(@RecentlyNonNull Context context) {
        return m21196f(context.getPackageManager());
    }

    @TargetApi(20)
    /* renamed from: f */
    public static boolean m21196f(@RecentlyNonNull PackageManager packageManager) {
        if (f18662a == null) {
            boolean z = false;
            if (C2555l.m21212f() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            f18662a = Boolean.valueOf(z);
        }
        return f18662a.booleanValue();
    }

    @TargetApi(26)
    /* renamed from: g */
    public static boolean m21197g(@RecentlyNonNull Context context) {
        if (m21195e(context)) {
            if (!C2555l.m21215i()) {
                return true;
            }
            if (m21198h(context) && !C2555l.m21216j()) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(21)
    /* renamed from: h */
    public static boolean m21198h(@RecentlyNonNull Context context) {
        if (f18663b == null) {
            boolean z = false;
            if (C2555l.m21213g() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f18663b = Boolean.valueOf(z);
        }
        return f18663b.booleanValue();
    }

    /* renamed from: i */
    public static boolean m21199i(@RecentlyNonNull Context context) {
        if (f18665d == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f18665d = Boolean.valueOf(z);
        }
        return f18665d.booleanValue();
    }
}
