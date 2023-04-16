package p066io.flutter.plugins.googlemobileads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p002a1.C0022g;

/* renamed from: io.flutter.plugins.googlemobileads.l */
class C3067l {

    /* renamed from: a */
    private final List<String> f20139a;

    /* renamed from: b */
    private final String f20140b;

    /* renamed from: c */
    private final Boolean f20141c;

    /* renamed from: d */
    private final List<String> f20142d;

    /* renamed from: e */
    private final Integer f20143e;

    /* renamed from: f */
    private final String f20144f;

    /* renamed from: g */
    private final C3062i0 f20145g;

    /* renamed from: h */
    private final Map<String, String> f20146h;

    /* renamed from: io.flutter.plugins.googlemobileads.l$a */
    protected static class C3068a {

        /* renamed from: a */
        private List<String> f20147a;

        /* renamed from: b */
        private String f20148b;

        /* renamed from: c */
        private Boolean f20149c;

        /* renamed from: d */
        private List<String> f20150d;

        /* renamed from: e */
        private Integer f20151e;

        /* renamed from: f */
        private String f20152f;

        /* renamed from: g */
        private C3062i0 f20153g;

        /* renamed from: h */
        private Map<String, String> f20154h;

        protected C3068a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3067l mo13834a() {
            return new C3067l(this.f20147a, this.f20148b, this.f20149c, this.f20150d, this.f20151e, this.f20152f, this.f20153g, this.f20154h);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Map<String, String> mo13856b() {
            return this.f20154h;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo13857c() {
            return this.f20148b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public Integer mo13858d() {
            return this.f20151e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public List<String> mo13859e() {
            return this.f20147a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public String mo13860f() {
            return this.f20152f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public C3062i0 mo13861g() {
            return this.f20153g;
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public List<String> mo13862h() {
            return this.f20150d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public Boolean mo13863i() {
            return this.f20149c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C3068a mo13864j(Map<String, String> map) {
            this.f20154h = map;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public C3068a mo13865k(String str) {
            this.f20148b = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C3068a mo13866l(Integer num) {
            this.f20151e = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C3068a mo13867m(List<String> list) {
            this.f20147a = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C3068a mo13868n(String str) {
            this.f20152f = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public C3068a mo13869o(C3062i0 i0Var) {
            this.f20153g = i0Var;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public C3068a mo13870p(List<String> list) {
            this.f20150d = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public C3068a mo13871q(Boolean bool) {
            this.f20149c = bool;
            return this;
        }
    }

    protected C3067l(List<String> list, String str, Boolean bool, List<String> list2, Integer num, String str2, C3062i0 i0Var, Map<String, String> map) {
        this.f20139a = list;
        this.f20140b = str;
        this.f20141c = bool;
        this.f20142d = list2;
        this.f20143e = num;
        this.f20144f = str2;
        this.f20145g = i0Var;
        this.f20146h = map;
    }

    /* renamed from: a */
    private void m23523a(C0022g.C0023a aVar, String str) {
        Class<AdMobAdapter> cls = AdMobAdapter.class;
        HashMap hashMap = new HashMap();
        C3062i0 i0Var = this.f20145g;
        if (i0Var != null) {
            hashMap.putAll(i0Var.mo13839a(str, this.f20144f));
        }
        Map<String, String> map = this.f20146h;
        if (map != null && !map.isEmpty()) {
            Bundle bundle = new Bundle();
            for (Map.Entry next : this.f20146h.entrySet()) {
                bundle.putString((String) next.getKey(), (String) next.getValue());
            }
            hashMap.put(cls, bundle);
        }
        Boolean bool = this.f20141c;
        if (bool != null && bool.booleanValue()) {
            Bundle bundle2 = (Bundle) hashMap.get(cls);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("npa", "1");
            hashMap.put(cls, bundle2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            aVar.mo44b((Class) entry.getKey(), (Bundle) entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0022g mo13847b(String str) {
        return mo13855j(new C0022g.C0023a(), str).mo45c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Map<String, String> mo13848c() {
        return this.f20146h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo13849d() {
        return this.f20140b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Integer mo13850e() {
        return this.f20143e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3067l)) {
            return false;
        }
        C3067l lVar = (C3067l) obj;
        return Objects.equals(this.f20139a, lVar.f20139a) && Objects.equals(this.f20140b, lVar.f20140b) && Objects.equals(this.f20141c, lVar.f20141c) && Objects.equals(this.f20142d, lVar.f20142d) && Objects.equals(this.f20143e, lVar.f20143e) && Objects.equals(this.f20144f, lVar.f20144f) && Objects.equals(this.f20145g, lVar.f20145g) && Objects.equals(this.f20146h, lVar.f20146h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public List<String> mo13851f() {
        return this.f20139a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo13852g() {
        return this.f20144f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public List<String> mo13853h() {
        return this.f20142d;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f20139a, this.f20140b, this.f20141c, this.f20142d, this.f20143e, this.f20144f, this.f20145g});
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Boolean mo13854i() {
        return this.f20141c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0022g.C0023a mo13855j(C0022g.C0023a aVar, String str) {
        List<String> list = this.f20139a;
        if (list != null) {
            for (String a : list) {
                aVar.mo43a(a);
            }
        }
        String str2 = this.f20140b;
        if (str2 != null) {
            aVar.mo46d(str2);
        }
        m23523a(aVar, str);
        List<String> list2 = this.f20142d;
        if (list2 != null) {
            aVar.mo49g(list2);
        }
        Integer num = this.f20143e;
        if (num != null) {
            aVar.mo47e(num.intValue());
        }
        aVar.mo50h("Flutter-GMA-1.3.0");
        return aVar;
    }
}
