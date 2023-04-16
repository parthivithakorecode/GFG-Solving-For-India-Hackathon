package androidx.core.text;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: androidx.core.text.c */
public final class C0722c {

    /* renamed from: a */
    private static Method f2092a;

    /* renamed from: b */
    private static Method f2093b;

    /* renamed from: androidx.core.text.c$a */
    static class C0723a {
        /* renamed from: a */
        static String m2916a(Locale locale) {
            return locale.getScript();
        }
    }

    /* renamed from: androidx.core.text.c$b */
    static class C0724b {
        /* renamed from: a */
        static ULocale m2917a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        /* renamed from: b */
        static ULocale m2918b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        /* renamed from: c */
        static String m2919c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        Class<String> cls = String.class;
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            try {
                Class<?> cls2 = Class.forName("libcore.icu.ICU");
                f2092a = cls2.getMethod("getScript", new Class[]{cls});
                f2093b = cls2.getMethod("addLikelySubtags", new Class[]{cls});
            } catch (Exception e) {
                f2092a = null;
                f2093b = null;
                Log.w("ICUCompat", e);
            }
        } else if (i < 24) {
            try {
                f2093b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: a */
    private static String m2913a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f2093b;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{locale2});
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("ICUCompat", e);
        }
        return locale2;
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: b */
    private static String m2914b(String str) {
        try {
            Method method = f2092a;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("ICUCompat", e);
        }
        return null;
    }

    /* renamed from: c */
    public static String m2915c(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return C0724b.m2919c(C0724b.m2917a(C0724b.m2918b(locale)));
        }
        if (i >= 21) {
            try {
                return C0723a.m2916a((Locale) f2093b.invoke((Object) null, new Object[]{locale}));
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.w("ICUCompat", e);
                return C0723a.m2916a(locale);
            }
        } else {
            String a = m2913a(locale);
            if (a != null) {
                return m2914b(a);
            }
            return null;
        }
    }
}
