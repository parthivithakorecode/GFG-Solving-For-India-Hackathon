package androidx.core.text;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: androidx.core.text.g */
public final class C0736g {

    /* renamed from: a */
    private static final Locale f2119a = new Locale("", "");

    /* renamed from: androidx.core.text.g$a */
    static class C0737a {
        /* renamed from: a */
        static int m2944a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    /* renamed from: a */
    private static int m2942a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    /* renamed from: b */
    public static int m2943b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C0737a.m2944a(locale);
        }
        if (locale == null || locale.equals(f2119a)) {
            return 0;
        }
        String c = C0722c.m2915c(locale);
        return c == null ? m2942a(locale) : (c.equalsIgnoreCase("Arab") || c.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }
}
