package p066io.flutter.plugins.googlemobileads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p002a1.C0013a;
import p002a1.C0027k;
import p002a1.C0030n;
import p002a1.C0039v;
import p066io.flutter.plugin.platform.C3007f;

/* renamed from: io.flutter.plugins.googlemobileads.e */
abstract class C3042e {

    /* renamed from: a */
    protected final int f20081a;

    /* renamed from: io.flutter.plugins.googlemobileads.e$a */
    static class C3043a {

        /* renamed from: a */
        final int f20082a;

        /* renamed from: b */
        final String f20083b;

        /* renamed from: c */
        final String f20084c;

        C3043a(int i, String str, String str2) {
            this.f20082a = i;
            this.f20083b = str;
            this.f20084c = str2;
        }

        C3043a(C0013a aVar) {
            this.f20082a = aVar.mo19a();
            this.f20083b = aVar.mo20b();
            this.f20084c = aVar.mo21c();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3043a)) {
                return false;
            }
            C3043a aVar = (C3043a) obj;
            if (this.f20082a == aVar.f20082a && this.f20083b.equals(aVar.f20083b)) {
                return this.f20084c.equals(aVar.f20084c);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.f20082a), this.f20083b, this.f20084c});
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.e$b */
    static class C3044b {

        /* renamed from: a */
        private final String f20085a;

        /* renamed from: b */
        private final long f20086b;

        /* renamed from: c */
        private final String f20087c;

        /* renamed from: d */
        private final String f20088d;

        /* renamed from: e */
        private final Map<String, String> f20089e;

        /* renamed from: f */
        private C3043a f20090f;

        C3044b(C0027k kVar) {
            this.f20085a = kVar.mo78b();
            this.f20086b = kVar.mo80d();
            this.f20087c = kVar.toString();
            if (kVar.mo79c() != null) {
                this.f20088d = kVar.mo79c().toString();
                this.f20089e = new HashMap();
                for (String str : kVar.mo79c().keySet()) {
                    this.f20089e.put(str, kVar.mo79c().get(str).toString());
                }
            } else {
                this.f20088d = "unknown credentials";
                this.f20089e = new HashMap();
            }
            if (kVar.mo77a() != null) {
                this.f20090f = new C3043a(kVar.mo77a());
            }
        }

        C3044b(String str, long j, String str2, String str3, Map<String, String> map, C3043a aVar) {
            this.f20085a = str;
            this.f20086b = j;
            this.f20087c = str2;
            this.f20088d = str3;
            this.f20089e = map;
            this.f20090f = aVar;
        }

        /* renamed from: a */
        public Map<String, String> mo13795a() {
            return this.f20089e;
        }

        /* renamed from: b */
        public String mo13796b() {
            return this.f20085a;
        }

        /* renamed from: c */
        public String mo13797c() {
            return this.f20088d;
        }

        /* renamed from: d */
        public String mo13798d() {
            return this.f20087c;
        }

        /* renamed from: e */
        public C3043a mo13799e() {
            return this.f20090f;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C3044b)) {
                return false;
            }
            C3044b bVar = (C3044b) obj;
            return Objects.equals(this.f20085a, bVar.f20085a) && this.f20086b == bVar.f20086b && Objects.equals(this.f20087c, bVar.f20087c) && Objects.equals(this.f20088d, bVar.f20088d) && Objects.equals(this.f20090f, bVar.f20090f) && Objects.equals(this.f20089e, bVar.f20089e);
        }

        /* renamed from: f */
        public long mo13801f() {
            return this.f20086b;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f20085a, Long.valueOf(this.f20086b), this.f20087c, this.f20088d, this.f20090f});
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.e$c */
    static class C3045c {

        /* renamed from: a */
        final int f20091a;

        /* renamed from: b */
        final String f20092b;

        /* renamed from: c */
        final String f20093c;

        /* renamed from: d */
        C3047e f20094d;

        C3045c(int i, String str, String str2, C3047e eVar) {
            this.f20091a = i;
            this.f20092b = str;
            this.f20093c = str2;
            this.f20094d = eVar;
        }

        C3045c(C0030n nVar) {
            this.f20091a = nVar.mo19a();
            this.f20092b = nVar.mo20b();
            this.f20093c = nVar.mo21c();
            if (nVar.mo103f() != null) {
                this.f20094d = new C3047e(nVar.mo103f());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3045c)) {
                return false;
            }
            C3045c cVar = (C3045c) obj;
            if (this.f20091a == cVar.f20091a && this.f20092b.equals(cVar.f20092b) && Objects.equals(this.f20094d, cVar.f20094d)) {
                return this.f20093c.equals(cVar.f20093c);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.f20091a), this.f20092b, this.f20093c, this.f20094d});
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.e$d */
    static abstract class C3046d extends C3042e {
        C3046d(int i) {
            super(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo13772d(boolean z);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo13773e();
    }

    /* renamed from: io.flutter.plugins.googlemobileads.e$e */
    static class C3047e {

        /* renamed from: a */
        private final String f20095a;

        /* renamed from: b */
        private final String f20096b;

        /* renamed from: c */
        private final List<C3044b> f20097c;

        C3047e(C0039v vVar) {
            this.f20095a = vVar.mo119c();
            this.f20096b = vVar.mo118b();
            ArrayList arrayList = new ArrayList();
            for (C0027k bVar : vVar.mo117a()) {
                arrayList.add(new C3044b(bVar));
            }
            this.f20097c = arrayList;
        }

        C3047e(String str, String str2, List<C3044b> list) {
            this.f20095a = str;
            this.f20096b = str2;
            this.f20097c = list;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<C3044b> mo13805a() {
            return this.f20097c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo13806b() {
            return this.f20096b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String mo13807c() {
            return this.f20095a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C3047e)) {
                return false;
            }
            C3047e eVar = (C3047e) obj;
            return Objects.equals(this.f20095a, eVar.f20095a) && Objects.equals(this.f20096b, eVar.f20096b) && Objects.equals(this.f20097c, eVar.f20097c);
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f20095a, this.f20096b});
        }
    }

    C3042e(int i) {
        this.f20081a = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo13771b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C3007f mo13784c() {
        return null;
    }
}
