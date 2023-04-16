package androidx.core.app;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.app.f */
public final class C0557f {

    /* renamed from: androidx.core.app.f$a */
    static class C0558a {
        /* renamed from: a */
        static IBinder m2217a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        /* renamed from: b */
        static void m2218b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: androidx.core.app.f$b */
    static class C0559b {

        /* renamed from: a */
        private static Method f1733a;

        /* renamed from: b */
        private static boolean f1734b;

        /* renamed from: c */
        private static Method f1735c;

        /* renamed from: d */
        private static boolean f1736d;

        /* renamed from: a */
        public static IBinder m2219a(Bundle bundle, String str) {
            if (!f1734b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f1733a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                f1734b = true;
            }
            Method method2 = f1733a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                    f1733a = null;
                }
            }
            return null;
        }

        /* renamed from: b */
        public static void m2220b(Bundle bundle, String str, IBinder iBinder) {
            if (!f1736d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f1735c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e);
                }
                f1736d = true;
            }
            Method method2 = f1735c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e2);
                    f1735c = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static IBinder m2215a(Bundle bundle, String str) {
        return Build.VERSION.SDK_INT >= 18 ? C0558a.m2217a(bundle, str) : C0559b.m2219a(bundle, str);
    }

    /* renamed from: b */
    public static void m2216b(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            C0558a.m2218b(bundle, str, iBinder);
        } else {
            C0559b.m2220b(bundle, str, iBinder);
        }
    }
}
