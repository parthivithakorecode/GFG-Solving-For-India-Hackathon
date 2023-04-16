package androidx.core.p009os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* renamed from: androidx.core.os.f */
public final class C0681f {

    /* renamed from: androidx.core.os.f$a */
    static class C0682a {
        /* renamed from: a */
        static LocaleList m2822a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    /* renamed from: a */
    public static C0687i m2821a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0687i.m2828d(C0682a.m2822a(configuration));
        }
        return C0687i.m2826a(configuration.locale);
    }
}
