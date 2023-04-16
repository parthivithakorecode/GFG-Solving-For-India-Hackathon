package p167y2;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p021c3.C1439a;
import p028d3.C2488a;
import p028d3.C2491c;
import p149v2.C4203e;
import p149v2.C4233w;
import p167y2.C4417k;

/* renamed from: y2.m */
final class C4424m<T> extends C4233w<T> {

    /* renamed from: a */
    private final C4203e f22813a;

    /* renamed from: b */
    private final C4233w<T> f22814b;

    /* renamed from: c */
    private final Type f22815c;

    C4424m(C4203e eVar, C4233w<T> wVar, Type type) {
        this.f22813a = eVar;
        this.f22814b = wVar;
        this.f22815c = type;
    }

    /* renamed from: f */
    private Type m27130f(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    /* renamed from: c */
    public T mo4624c(C2488a aVar) {
        return this.f22814b.mo4624c(aVar);
    }

    /* renamed from: e */
    public void mo4625e(C2491c cVar, T t) {
        C4233w<T> wVar = this.f22814b;
        Type f = m27130f(this.f22815c, t);
        if (f != this.f22815c) {
            wVar = this.f22813a.mo15716j(C1439a.m5627b(f));
            if (wVar instanceof C4417k.C4419b) {
                C4233w<T> wVar2 = this.f22814b;
                if (!(wVar2 instanceof C4417k.C4419b)) {
                    wVar = wVar2;
                }
            }
        }
        wVar.mo4625e(cVar, t);
    }
}
