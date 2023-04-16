package p066io.flutter.plugins.googlemobileads;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import p012b1.C1291a;
import p066io.flutter.plugins.googlemobileads.C3067l;

/* renamed from: io.flutter.plugins.googlemobileads.i */
class C3059i extends C3067l {

    /* renamed from: i */
    private final Map<String, String> f20120i;

    /* renamed from: j */
    private final Map<String, List<String>> f20121j;

    /* renamed from: k */
    private final String f20122k;

    /* renamed from: io.flutter.plugins.googlemobileads.i$b */
    static class C3061b extends C3067l.C3068a {

        /* renamed from: i */
        private Map<String, String> f20123i;

        /* renamed from: j */
        private Map<String, List<String>> f20124j;

        /* renamed from: k */
        private String f20125k;

        C3061b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public C3059i mo13834a() {
            return new C3059i(mo13859e(), mo13857c(), this.f20123i, this.f20124j, mo13863i(), mo13862h(), mo13858d(), this.f20125k, mo13860f(), mo13861g(), mo13856b());
        }

        /* renamed from: s */
        public C3061b mo13836s(Map<String, String> map) {
            this.f20123i = map;
            return this;
        }

        /* renamed from: t */
        public C3061b mo13837t(Map<String, List<String>> map) {
            this.f20124j = map;
            return this;
        }

        /* renamed from: u */
        public C3061b mo13838u(String str) {
            this.f20125k = str;
            return this;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C3059i(List<String> list, String str, Map<String, String> map, Map<String, List<String>> map2, Boolean bool, List<String> list2, Integer num, String str2, String str3, C3062i0 i0Var, Map<String, String> map3) {
        super(list, str, bool, list2, num, str3, i0Var, map3);
        this.f20120i = map;
        this.f20121j = map2;
        this.f20122k = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3059i)) {
            return false;
        }
        C3059i iVar = (C3059i) obj;
        return super.equals(obj) && Objects.equals(this.f20120i, iVar.f20120i) && Objects.equals(this.f20121j, iVar.f20121j);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f20120i, this.f20121j});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C1291a mo13830k(String str) {
        C1291a.C1292a aVar = new C1291a.C1292a();
        mo13855j(aVar, str);
        Map<String, String> map = this.f20120i;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                aVar.mo4608n((String) next.getKey(), (String) next.getValue());
            }
        }
        Map<String, List<String>> map2 = this.f20121j;
        if (map2 != null) {
            for (Map.Entry next2 : map2.entrySet()) {
                aVar.mo4609o((String) next2.getKey(), (List) next2.getValue());
            }
        }
        String str2 = this.f20122k;
        if (str2 != null) {
            aVar.mo4611q(str2);
        }
        return aVar.mo45c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Map<String, String> mo13831l() {
        return this.f20120i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Map<String, List<String>> mo13832m() {
        return this.f20121j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public String mo13833n() {
        return this.f20122k;
    }
}
