package p100n4;

import java.io.Serializable;
import kotlin.jvm.internal.C3357i;
import kotlin.jvm.internal.C3358j;
import p100n4.C3778g;
import p145u4.C4154p;

/* renamed from: n4.c */
public final class C3771c implements C3778g, Serializable {

    /* renamed from: f */
    private final C3778g f21686f;

    /* renamed from: g */
    private final C3778g.C3781b f21687g;

    /* renamed from: n4.c$a */
    static final class C3772a extends C3358j implements C4154p<String, C3778g.C3781b, String> {

        /* renamed from: f */
        public static final C3772a f21688f = new C3772a();

        C3772a() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(String str, C3778g.C3781b bVar) {
            C3357i.m24508e(str, "acc");
            C3357i.m24508e(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public C3771c(C3778g gVar, C3778g.C3781b bVar) {
        C3357i.m24508e(gVar, "left");
        C3357i.m24508e(bVar, "element");
        this.f21686f = gVar;
        this.f21687g = bVar;
    }

    /* renamed from: a */
    private final boolean m25597a(C3778g.C3781b bVar) {
        return C3357i.m24504a(get(bVar.getKey()), bVar);
    }

    /* renamed from: b */
    private final boolean m25598b(C3771c cVar) {
        while (m25597a(cVar.f21687g)) {
            C3778g gVar = cVar.f21686f;
            if (gVar instanceof C3771c) {
                cVar = (C3771c) gVar;
            } else {
                C3357i.m24506c(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m25597a((C3778g.C3781b) gVar);
            }
        }
        return false;
    }

    /* renamed from: c */
    private final int m25599c() {
        int i = 2;
        C3771c cVar = this;
        while (true) {
            C3778g gVar = cVar.f21686f;
            cVar = gVar instanceof C3771c ? (C3771c) gVar : null;
            if (cVar == null) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3771c) {
                C3771c cVar = (C3771c) obj;
                if (cVar.m25599c() != m25599c() || !cVar.m25598b(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, C4154p<? super R, ? super C3778g.C3781b, ? extends R> pVar) {
        C3357i.m24508e(pVar, "operation");
        return pVar.invoke(this.f21686f.fold(r, pVar), this.f21687g);
    }

    public <E extends C3778g.C3781b> E get(C3778g.C3783c<E> cVar) {
        C3357i.m24508e(cVar, "key");
        C3771c cVar2 = this;
        while (true) {
            E e = cVar2.f21687g.get(cVar);
            if (e != null) {
                return e;
            }
            C3778g gVar = cVar2.f21686f;
            if (!(gVar instanceof C3771c)) {
                return gVar.get(cVar);
            }
            cVar2 = (C3771c) gVar;
        }
    }

    public int hashCode() {
        return this.f21686f.hashCode() + this.f21687g.hashCode();
    }

    public C3778g minusKey(C3778g.C3783c<?> cVar) {
        C3357i.m24508e(cVar, "key");
        if (this.f21687g.get(cVar) != null) {
            return this.f21686f;
        }
        C3778g minusKey = this.f21686f.minusKey(cVar);
        return minusKey == this.f21686f ? this : minusKey == C3784h.f21692f ? this.f21687g : new C3771c(minusKey, this.f21687g);
    }

    public C3778g plus(C3778g gVar) {
        return C3778g.C3779a.m25606a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) fold("", C3772a.f21688f)) + ']';
    }
}
