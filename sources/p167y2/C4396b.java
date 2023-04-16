package p167y2;

import java.lang.reflect.Type;
import java.util.Collection;
import p021c3.C1439a;
import p028d3.C2488a;
import p028d3.C2490b;
import p028d3.C2491c;
import p149v2.C4203e;
import p149v2.C4233w;
import p149v2.C4235x;
import p161x2.C4306b;
import p161x2.C4310c;
import p161x2.C4338i;

/* renamed from: y2.b */
public final class C4396b implements C4235x {

    /* renamed from: f */
    private final C4310c f22752f;

    /* renamed from: y2.b$a */
    private static final class C4397a<E> extends C4233w<Collection<E>> {

        /* renamed from: a */
        private final C4233w<E> f22753a;

        /* renamed from: b */
        private final C4338i<? extends Collection<E>> f22754b;

        public C4397a(C4203e eVar, Type type, C4233w<E> wVar, C4338i<? extends Collection<E>> iVar) {
            this.f22753a = new C4424m(eVar, wVar, type);
            this.f22754b = iVar;
        }

        /* renamed from: f */
        public Collection<E> mo4624c(C2488a aVar) {
            if (aVar.mo12354V() == C2490b.NULL) {
                aVar.mo12352R();
                return null;
            }
            Collection<E> collection = (Collection) this.f22754b.mo15902a();
            aVar.mo12357d();
            while (aVar.mo12344B()) {
                collection.add(this.f22753a.mo4624c(aVar));
            }
            aVar.mo12363v();
            return collection;
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, Collection<E> collection) {
            if (collection == null) {
                cVar.mo12369H();
                return;
            }
            cVar.mo12381m();
            for (E e : collection) {
                this.f22753a.mo4625e(cVar, e);
            }
            cVar.mo12383v();
        }
    }

    public C4396b(C4310c cVar) {
        this.f22752f = cVar;
    }

    public <T> C4233w<T> create(C4203e eVar, C1439a<T> aVar) {
        Type e = aVar.mo4849e();
        Class<? super T> c = aVar.mo4848c();
        if (!Collection.class.isAssignableFrom(c)) {
            return null;
        }
        Type h = C4306b.m26891h(e, c);
        return new C4397a(eVar, h, eVar.mo15716j(C1439a.m5627b(h)), this.f22752f.mo15900a(aVar));
    }
}
