package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: androidx.core.app.o */
public class C0588o {

    /* renamed from: a */
    CharSequence f1864a;

    /* renamed from: b */
    IconCompat f1865b;

    /* renamed from: c */
    String f1866c;

    /* renamed from: d */
    String f1867d;

    /* renamed from: e */
    boolean f1868e;

    /* renamed from: f */
    boolean f1869f;

    /* renamed from: androidx.core.app.o$a */
    static class C0589a {
        /* renamed from: a */
        static C0588o m2425a(Person person) {
            return new C0590b().mo2528f(person.getName()).mo2525c(person.getIcon() != null ? IconCompat.m2645c(person.getIcon()) : null).mo2529g(person.getUri()).mo2527e(person.getKey()).mo2524b(person.isBot()).mo2526d(person.isImportant()).mo2523a();
        }

        /* renamed from: b */
        static Person m2426b(C0588o oVar) {
            return new Person.Builder().setName(oVar.mo2516e()).setIcon(oVar.mo2514c() != null ? oVar.mo2514c().mo2607y() : null).setUri(oVar.mo2517f()).setKey(oVar.mo2515d()).setBot(oVar.mo2518g()).setImportant(oVar.mo2519h()).build();
        }
    }

    /* renamed from: androidx.core.app.o$b */
    public static class C0590b {

        /* renamed from: a */
        CharSequence f1870a;

        /* renamed from: b */
        IconCompat f1871b;

        /* renamed from: c */
        String f1872c;

        /* renamed from: d */
        String f1873d;

        /* renamed from: e */
        boolean f1874e;

        /* renamed from: f */
        boolean f1875f;

        /* renamed from: a */
        public C0588o mo2523a() {
            return new C0588o(this);
        }

        /* renamed from: b */
        public C0590b mo2524b(boolean z) {
            this.f1874e = z;
            return this;
        }

        /* renamed from: c */
        public C0590b mo2525c(IconCompat iconCompat) {
            this.f1871b = iconCompat;
            return this;
        }

        /* renamed from: d */
        public C0590b mo2526d(boolean z) {
            this.f1875f = z;
            return this;
        }

        /* renamed from: e */
        public C0590b mo2527e(String str) {
            this.f1873d = str;
            return this;
        }

        /* renamed from: f */
        public C0590b mo2528f(CharSequence charSequence) {
            this.f1870a = charSequence;
            return this;
        }

        /* renamed from: g */
        public C0590b mo2529g(String str) {
            this.f1872c = str;
            return this;
        }
    }

    C0588o(C0590b bVar) {
        this.f1864a = bVar.f1870a;
        this.f1865b = bVar.f1871b;
        this.f1866c = bVar.f1872c;
        this.f1867d = bVar.f1873d;
        this.f1868e = bVar.f1874e;
        this.f1869f = bVar.f1875f;
    }

    /* renamed from: a */
    public static C0588o m2414a(Person person) {
        return C0589a.m2425a(person);
    }

    /* renamed from: b */
    public static C0588o m2415b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new C0590b().mo2528f(bundle.getCharSequence("name")).mo2525c(bundle2 != null ? IconCompat.m2644b(bundle2) : null).mo2529g(bundle.getString("uri")).mo2527e(bundle.getString("key")).mo2524b(bundle.getBoolean("isBot")).mo2526d(bundle.getBoolean("isImportant")).mo2523a();
    }

    /* renamed from: c */
    public IconCompat mo2514c() {
        return this.f1865b;
    }

    /* renamed from: d */
    public String mo2515d() {
        return this.f1867d;
    }

    /* renamed from: e */
    public CharSequence mo2516e() {
        return this.f1864a;
    }

    /* renamed from: f */
    public String mo2517f() {
        return this.f1866c;
    }

    /* renamed from: g */
    public boolean mo2518g() {
        return this.f1868e;
    }

    /* renamed from: h */
    public boolean mo2519h() {
        return this.f1869f;
    }

    /* renamed from: i */
    public String mo2520i() {
        String str = this.f1866c;
        if (str != null) {
            return str;
        }
        if (this.f1864a == null) {
            return "";
        }
        return "name:" + this.f1864a;
    }

    /* renamed from: j */
    public Person mo2521j() {
        return C0589a.m2426b(this);
    }

    /* renamed from: k */
    public Bundle mo2522k() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f1864a);
        IconCompat iconCompat = this.f1865b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.mo2606x() : null);
        bundle.putString("uri", this.f1866c);
        bundle.putString("key", this.f1867d);
        bundle.putBoolean("isBot", this.f1868e);
        bundle.putBoolean("isImportant", this.f1869f);
        return bundle;
    }
}
