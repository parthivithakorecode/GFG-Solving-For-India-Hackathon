package p167y2;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p021c3.C1439a;
import p028d3.C2488a;
import p028d3.C2490b;
import p028d3.C2491c;
import p149v2.C4203e;
import p149v2.C4233w;
import p149v2.C4235x;
import p161x2.C4306b;

/* renamed from: y2.a */
public final class C4394a<E> extends C4233w<Object> {

    /* renamed from: c */
    public static final C4235x f22749c = new C4395a();

    /* renamed from: a */
    private final Class<E> f22750a;

    /* renamed from: b */
    private final C4233w<E> f22751b;

    /* renamed from: y2.a$a */
    class C4395a implements C4235x {
        C4395a() {
        }

        public <T> C4233w<T> create(C4203e eVar, C1439a<T> aVar) {
            Type e = aVar.mo4849e();
            if (!(e instanceof GenericArrayType) && (!(e instanceof Class) || !((Class) e).isArray())) {
                return null;
            }
            Type g = C4306b.m26890g(e);
            return new C4394a(eVar, eVar.mo15716j(C1439a.m5627b(g)), C4306b.m26894k(g));
        }
    }

    public C4394a(C4203e eVar, C4233w<E> wVar, Class<E> cls) {
        this.f22751b = new C4424m(eVar, wVar, cls);
        this.f22750a = cls;
    }

    /* renamed from: c */
    public Object mo4624c(C2488a aVar) {
        if (aVar.mo12354V() == C2490b.NULL) {
            aVar.mo12352R();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.mo12357d();
        while (aVar.mo12344B()) {
            arrayList.add(this.f22751b.mo4624c(aVar));
        }
        aVar.mo12363v();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f22750a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: e */
    public void mo4625e(C2491c cVar, Object obj) {
        if (obj == null) {
            cVar.mo12369H();
            return;
        }
        cVar.mo12381m();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f22751b.mo4625e(cVar, Array.get(obj, i));
        }
        cVar.mo12383v();
    }
}
