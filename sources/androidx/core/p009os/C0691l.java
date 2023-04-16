package androidx.core.p009os;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: androidx.core.os.l */
final class C0691l implements C0690k {

    /* renamed from: a */
    private final LocaleList f2021a;

    C0691l(Object obj) {
        this.f2021a = (LocaleList) obj;
    }

    /* renamed from: a */
    public Object mo2686a() {
        return this.f2021a;
    }

    public boolean equals(Object obj) {
        return this.f2021a.equals(((C0690k) obj).mo2686a());
    }

    public Locale get(int i) {
        return this.f2021a.get(i);
    }

    public int hashCode() {
        return this.f2021a.hashCode();
    }

    public String toString() {
        return this.f2021a.toString();
    }
}
