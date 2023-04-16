package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.TypedValue;
import androidx.core.content.res.C0624h;
import androidx.core.p009os.C0683g;
import androidx.core.util.C0740c;
import java.io.File;
import java.util.concurrent.Executor;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.content.a */
public class C0597a {

    /* renamed from: a */
    private static final Object f1880a = new Object();

    /* renamed from: b */
    private static final Object f1881b = new Object();

    /* renamed from: c */
    private static TypedValue f1882c;

    /* renamed from: androidx.core.content.a$a */
    static class C0598a {
        /* renamed from: a */
        static void m2456a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        static void m2457b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* renamed from: androidx.core.content.a$b */
    static class C0599b {
        /* renamed from: a */
        static File[] m2458a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        static File[] m2459b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        static File[] m2460c(Context context) {
            return context.getObbDirs();
        }
    }

    /* renamed from: androidx.core.content.a$c */
    static class C0600c {
        /* renamed from: a */
        static File m2461a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        static Drawable m2462b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* renamed from: c */
        static File m2463c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: androidx.core.content.a$d */
    static class C0601d {
        /* renamed from: a */
        static int m2464a(Context context, int i) {
            return context.getColor(i);
        }

        /* renamed from: b */
        static <T> T m2465b(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        /* renamed from: c */
        static String m2466c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: androidx.core.content.a$e */
    static class C0602e {
        /* renamed from: a */
        static ComponentName m2467a(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* renamed from: androidx.core.content.a$f */
    static class C0603f {
        /* renamed from: a */
        static Executor m2468a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* renamed from: a */
    public static int m2446a(Context context, String str) {
        C0740c.m2949d(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    /* renamed from: b */
    public static int m2447b(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? C0601d.m2464a(context, i) : context.getResources().getColor(i);
    }

    /* renamed from: c */
    public static ColorStateList m2448c(Context context, int i) {
        return C0624h.m2564c(context.getResources(), i, context.getTheme());
    }

    /* renamed from: d */
    public static Drawable m2449d(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            return C0600c.m2462b(context, i);
        }
        if (i2 < 16) {
            synchronized (f1880a) {
                if (f1882c == null) {
                    f1882c = new TypedValue();
                }
                context.getResources().getValue(i, f1882c, true);
                i = f1882c.resourceId;
            }
        }
        return context.getResources().getDrawable(i);
    }

    /* renamed from: e */
    public static File[] m2450e(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0599b.m2458a(context);
        }
        return new File[]{context.getExternalCacheDir()};
    }

    /* renamed from: f */
    public static File[] m2451f(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0599b.m2459b(context, str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    /* renamed from: g */
    public static Executor m2452g(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? C0603f.m2468a(context) : C0683g.m2823a(new Handler(context.getMainLooper()));
    }

    /* renamed from: h */
    public static boolean m2453h(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0598a.m2456a(context, intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    /* renamed from: i */
    public static void m2454i(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0598a.m2457b(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    /* renamed from: j */
    public static void m2455j(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C0602e.m2467a(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
