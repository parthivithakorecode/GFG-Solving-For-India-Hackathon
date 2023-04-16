package androidx.core.p009os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: androidx.core.os.i */
public final class C0687i {

    /* renamed from: b */
    private static final C0687i f2013b = m2826a(new Locale[0]);

    /* renamed from: a */
    private final C0690k f2014a;

    /* renamed from: androidx.core.os.i$a */
    static class C0688a {
        /* renamed from: a */
        static LocaleList m2830a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        /* renamed from: b */
        static LocaleList m2831b() {
            return LocaleList.getAdjustedDefault();
        }

        /* renamed from: c */
        static LocaleList m2832c() {
            return LocaleList.getDefault();
        }
    }

    private C0687i(C0690k kVar) {
        this.f2014a = kVar;
    }

    /* renamed from: a */
    public static C0687i m2826a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? m2828d(C0688a.m2830a(localeArr)) : new C0687i(new C0689j(localeArr));
    }

    /* renamed from: b */
    static Locale m2827b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    /* renamed from: d */
    public static C0687i m2828d(LocaleList localeList) {
        return new C0687i(new C0691l(localeList));
    }

    /* renamed from: c */
    public Locale mo2682c(int i) {
        return this.f2014a.get(i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0687i) && this.f2014a.equals(((C0687i) obj).f2014a);
    }

    public int hashCode() {
        return this.f2014a.hashCode();
    }

    public String toString() {
        return this.f2014a.toString();
    }
}
