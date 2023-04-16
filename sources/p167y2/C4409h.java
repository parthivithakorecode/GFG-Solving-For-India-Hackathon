package p167y2;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import p021c3.C1439a;
import p028d3.C2488a;
import p028d3.C2490b;
import p028d3.C2491c;
import p149v2.C4203e;
import p149v2.C4215k;
import p149v2.C4220p;
import p149v2.C4223s;
import p149v2.C4233w;
import p149v2.C4235x;
import p161x2.C4306b;
import p161x2.C4310c;
import p161x2.C4328f;
import p161x2.C4338i;
import p161x2.C4341l;

/* renamed from: y2.h */
public final class C4409h implements C4235x {

    /* renamed from: f */
    private final C4310c f22773f;

    /* renamed from: g */
    final boolean f22774g;

    /* renamed from: y2.h$a */
    private final class C4410a<K, V> extends C4233w<Map<K, V>> {

        /* renamed from: a */
        private final C4233w<K> f22775a;

        /* renamed from: b */
        private final C4233w<V> f22776b;

        /* renamed from: c */
        private final C4338i<? extends Map<K, V>> f22777c;

        public C4410a(C4203e eVar, Type type, C4233w<K> wVar, Type type2, C4233w<V> wVar2, C4338i<? extends Map<K, V>> iVar) {
            this.f22775a = new C4424m(eVar, wVar, type);
            this.f22776b = new C4424m(eVar, wVar2, type2);
            this.f22777c = iVar;
        }

        /* renamed from: f */
        private String m27099f(C4215k kVar) {
            if (kVar.mo15755o()) {
                C4220p j = kVar.mo15751j();
                if (j.mo15773w()) {
                    return String.valueOf(j.mo15771t());
                }
                if (j.mo15772u()) {
                    return Boolean.toString(j.mo15767p());
                }
                if (j.mo15774x()) {
                    return j.mo15746k();
                }
                throw new AssertionError();
            } else if (kVar.mo15753m()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: g */
        public Map<K, V> mo4624c(C2488a aVar) {
            C2490b V = aVar.mo12354V();
            if (V == C2490b.NULL) {
                aVar.mo12352R();
                return null;
            }
            Map<K, V> map = (Map) this.f22777c.mo15902a();
            if (V == C2490b.BEGIN_ARRAY) {
                aVar.mo12357d();
                while (aVar.mo12344B()) {
                    aVar.mo12357d();
                    K c = this.f22775a.mo4624c(aVar);
                    if (map.put(c, this.f22776b.mo4624c(aVar)) == null) {
                        aVar.mo12363v();
                    } else {
                        throw new C4223s("duplicate key: " + c);
                    }
                }
                aVar.mo12363v();
            } else {
                aVar.mo12359h();
                while (aVar.mo12344B()) {
                    C4328f.f22660a.mo12365a(aVar);
                    K c2 = this.f22775a.mo4624c(aVar);
                    if (map.put(c2, this.f22776b.mo4624c(aVar)) != null) {
                        throw new C4223s("duplicate key: " + c2);
                    }
                }
                aVar.mo12364w();
            }
            return map;
        }

        /* renamed from: h */
        public void mo4625e(C2491c cVar, Map<K, V> map) {
            if (map == null) {
                cVar.mo12369H();
            } else if (!C4409h.this.f22774g) {
                cVar.mo12382n();
                for (Map.Entry next : map.entrySet()) {
                    cVar.mo12368F(String.valueOf(next.getKey()));
                    this.f22776b.mo4625e(cVar, next.getValue());
                }
                cVar.mo12384w();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry next2 : map.entrySet()) {
                    C4215k d = this.f22775a.mo15781d(next2.getKey());
                    arrayList.add(d);
                    arrayList2.add(next2.getValue());
                    z |= d.mo15752l() || d.mo15754n();
                }
                if (z) {
                    cVar.mo12381m();
                    int size = arrayList.size();
                    while (i < size) {
                        cVar.mo12381m();
                        C4341l.m26965b((C4215k) arrayList.get(i), cVar);
                        this.f22776b.mo4625e(cVar, arrayList2.get(i));
                        cVar.mo12383v();
                        i++;
                    }
                    cVar.mo12383v();
                    return;
                }
                cVar.mo12382n();
                int size2 = arrayList.size();
                while (i < size2) {
                    cVar.mo12368F(m27099f((C4215k) arrayList.get(i)));
                    this.f22776b.mo4625e(cVar, arrayList2.get(i));
                    i++;
                }
                cVar.mo12384w();
            }
        }
    }

    public C4409h(C4310c cVar, boolean z) {
        this.f22773f = cVar;
        this.f22774g = z;
    }

    /* renamed from: a */
    private C4233w<?> m27098a(C4203e eVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? C4425n.f22844f : eVar.mo15716j(C1439a.m5627b(type));
    }

    public <T> C4233w<T> create(C4203e eVar, C1439a<T> aVar) {
        Type e = aVar.mo4849e();
        if (!Map.class.isAssignableFrom(aVar.mo4848c())) {
            return null;
        }
        Type[] j = C4306b.m26893j(e, C4306b.m26894k(e));
        return new C4410a(eVar, j[0], m27098a(eVar, j[0]), j[1], eVar.mo15716j(C1439a.m5627b(j[1])), this.f22773f.mo15900a(aVar));
    }
}
