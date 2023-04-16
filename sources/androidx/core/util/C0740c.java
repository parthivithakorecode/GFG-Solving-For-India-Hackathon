package androidx.core.util;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: androidx.core.util.c */
public class C0740c {

    /* renamed from: androidx.core.util.c$a */
    static class C0741a {
        /* renamed from: a */
        static boolean m2950a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        /* renamed from: b */
        static int m2951b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    /* renamed from: a */
    public static boolean m2946a(Object obj, Object obj2) {
        return Build.VERSION.SDK_INT >= 19 ? C0741a.m2950a(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m2947b(Object... objArr) {
        return Build.VERSION.SDK_INT >= 19 ? C0741a.m2951b(objArr) : Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static <T> T m2948c(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: d */
    public static <T> T m2949d(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}
