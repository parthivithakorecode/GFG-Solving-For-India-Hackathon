package androidx.core.p009os;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: androidx.core.os.j */
final class C0689j implements C0690k {

    /* renamed from: c */
    private static final Locale[] f2015c = new Locale[0];

    /* renamed from: d */
    private static final Locale f2016d = new Locale("en", "XA");

    /* renamed from: e */
    private static final Locale f2017e = new Locale("ar", "XB");

    /* renamed from: f */
    private static final Locale f2018f = C0687i.m2827b("en-Latn");

    /* renamed from: a */
    private final Locale[] f2019a;

    /* renamed from: b */
    private final String f2020b;

    C0689j(Locale... localeArr) {
        String sb;
        if (localeArr.length == 0) {
            this.f2019a = f2015c;
            sb = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb2 = new StringBuilder();
            int i = 0;
            while (i < localeArr.length) {
                Locale locale = localeArr[i];
                if (locale != null) {
                    if (!hashSet.contains(locale)) {
                        Locale locale2 = (Locale) locale.clone();
                        arrayList.add(locale2);
                        m2833b(sb2, locale2);
                        if (i < localeArr.length - 1) {
                            sb2.append(',');
                        }
                        hashSet.add(locale2);
                    }
                    i++;
                } else {
                    throw new NullPointerException("list[" + i + "] is null");
                }
            }
            this.f2019a = (Locale[]) arrayList.toArray(new Locale[0]);
            sb = sb2.toString();
        }
        this.f2020b = sb;
    }

    /* renamed from: b */
    static void m2833b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    /* renamed from: a */
    public Object mo2686a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0689j)) {
            return false;
        }
        Locale[] localeArr = ((C0689j) obj).f2019a;
        if (this.f2019a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f2019a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f2019a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        for (Locale hashCode : this.f2019a) {
            i = (i * 31) + hashCode.hashCode();
        }
        return i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f2019a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.f2019a.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
