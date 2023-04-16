package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* renamed from: androidx.core.app.e */
public final class C0554e {

    /* renamed from: androidx.core.app.e$a */
    static class C0555a {
        /* renamed from: a */
        static <T> T m2208a(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        /* renamed from: b */
        static int m2209b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        /* renamed from: c */
        static int m2210c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        /* renamed from: d */
        static String m2211d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* renamed from: androidx.core.app.e$b */
    static class C0556b {
        /* renamed from: a */
        static int m2212a(AppOpsManager appOpsManager, String str, int i, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        /* renamed from: b */
        static String m2213b(Context context) {
            return context.getOpPackageName();
        }

        /* renamed from: c */
        static AppOpsManager m2214c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* renamed from: a */
    public static int m2205a(Context context, int i, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return m2206b(context, str, str2);
        }
        AppOpsManager c = C0556b.m2214c(context);
        int a = C0556b.m2212a(c, str, Binder.getCallingUid(), str2);
        return a != 0 ? a : C0556b.m2212a(c, str, i, C0556b.m2213b(context));
    }

    /* renamed from: b */
    public static int m2206b(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0555a.m2210c((AppOpsManager) C0555a.m2208a(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    /* renamed from: c */
    public static String m2207c(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0555a.m2211d(str);
        }
        return null;
    }
}
