package androidx.core.p009os;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.Locale;

/* renamed from: androidx.core.os.a */
public class C0674a {
    /* renamed from: a */
    protected static boolean m2807a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m2808b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @SuppressLint({"RestrictedApi"})
    @Deprecated
    /* renamed from: c */
    public static boolean m2809c() {
        int i = Build.VERSION.SDK_INT;
        return i >= 31 || (i >= 30 && m2807a("S", Build.VERSION.CODENAME));
    }
}
